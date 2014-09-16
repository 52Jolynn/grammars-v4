parser grammar IdbParser;

options {
    language=Java;
    tokenVocab=IdbLexer;
}

@header {
    package com.intple.dbone.parser.v4.idb;
}

@members {
}

/*
===============================================================================
===============================================================================
*/
sql
  : (statement SEMI_COLON)* statement SEMI_COLON? EOF
  ;

statement
  : dml
  ;

dml
  : select_stmt
  ;

select_stmt
  : query_expression order_clause? limit_clause? offset_clause? fetch_clause? for_clause?
  ;

update_stmt
  : UPDATE
  ;

delete_stmt
  : DELETE
  ;

insert_stmt
  : INSERT INTO
  ;

query_expression
  : query_specification (query_rel query_specification)*
  | query_specification (query_rel query_expression)*
  | LEFT_PAREN select_stmt RIGHT_PAREN (query_rel query_expression)*
  | table_stmt
  | values_stmt
  ;

query_specification
  : with_query? SELECT set_qualifier? select_list into_expression? from_clause? where_clause? group_clause? having_clause? window_clause?
  ;

query_rel
  : (UNION | INTERSECT | EXCEPT) (ALL | DISTINCT)?
  ;

set_qualifier
  : ALL
  | DISTINCT (ON LEFT_PAREN expr_list RIGHT_PAREN)?
  ;

select_list
  : select_sublist (COMMA select_sublist)*
  ;

select_sublist
  : derived_column
  | qualified_asterisk
  ;

derived_column
  : expr as_clause?
  ;

qualified_asterisk
  : (table_name DOT)? MULTIPLY
  ;

as_clause
  : AS? (column_alias | boolean_literal | NULL)
  ;

into_expression
  : INTO (TEMPORARY | TEMP | UNLOGGED)? TABLE? table_name
  ;

with_query
  : WITH RECURSIVE? with_query_name (LEFT_PAREN column_name_list RIGHT_PAREN)? AS LEFT_PAREN (select_stmt | values_stmt | insert_stmt | update_stmt | delete_stmt) RIGHT_PAREN #withQuery
  ;

with_query_name
  : any_name
  ;

table_stmt
  : TABLE ONLY? table_name *? #tableStmt
  ;

subquery
  : LEFT_PAREN select_stmt RIGHT_PAREN
  ;

from_clause : FROM table_reference (COMMA table_reference)* #fromClause;

where_clause
  : WHERE search_condition #whereClause
  ;
group_clause
  : GROUP BY expr_list #groupClause
  ;

having_clause
  : HAVING expr_list #havingClause
  ;

window_clause
  : WINDOW window_specifier_list #windowClause
  ;

window_specifier_list
  : window_specifier (COMMA window_specifier)*
  ;

window_specifier
  : window_name AS window_definition
  ;

order_clause
  :  ORDER BY sort_specifier_list #orderClause
  ;

sort_specifier_list
  : sort_specifier (COMMA sort_specifier)*
  ;

sort_specifier
  : expr order_specification? null_ordering?
  ;

order_specification
  : ASC
  | DESC
  | USING operators
  ;

operators
  : PLUS | SUB | MULTIPLY | DIVIDE | MODULAR | LTH | GTH | CUSTOME_OPERATOR
  ;

null_ordering
  : NULLS (FIRST | LAST)
  ;

limit_clause
  : LIMIT (count | ALL)
  ;

offset_clause
  : OFFSET start (ROW | ROWS)?
  ;

fetch_clause
  : FETCH (FIRST | NEXT) count? (ROW | ROWS) ONLY
  ;

for_clause
  : FOR (UPDATE | NO KEY UPDATE | SHARE | KEY SHARE) (OF table_name_list)? NOWAIT
  ;

count
  : expr
  ;

start
  : expr
  ;

table_reference
  : simple_table
  | joined_table
  ;

simple_table
  : ONLY? ((database_name DOT)? schema_name DOT)? table_name MULTIPLY? correlation_specification?
  | derived_table correlation_specification
  ;

joined_table
  : joined_table CROSS JOIN joined_table
  | joined_table NATURAL? join_type? JOIN joined_table join_specification?
  | joined_table UNION JOIN joined_table
  | LEFT_PAREN joined_table RIGHT_PAREN
  | simple_table
  ;

join_type
  : INNER
  | outer_join_type OUTER?
  ;

outer_join_type
  : LEFT
  | RIGHT
  | FULL
  ;

correlation_specification
  : AS? correlation_name (LEFT_PAREN derived_column_list RIGHT_PAREN)?
  ;

derived_column_list : column_name_list;

derived_table
  : LATERAL? (table_subquery | function)
  ;

table_subquery
  : subquery
  | LEFT_PAREN values_stmt RIGHT_PAREN
  ;

function
  : function_name LEFT_PAREN set_qualifier? function_args? order_clause? RIGHT_PAREN
  ;

join_specification
:
	join_condition
	| named_columns_join
;
join_condition : ON search_condition;

named_columns_join : USING LEFT_PAREN join_column_list RIGHT_PAREN;

join_column_list : column_name_list;

values_stmt
  : VALUES LEFT_PAREN expr_list RIGHT_PAREN (COMMA LEFT_PAREN expr_list RIGHT_PAREN)* order_clause? limit_clause? #valuesStmt
  ;

search_condition
  : expr
  ;

expr
  : unsigned_numeric_literal #numericLiteral
  | string_literal #stringLiteral
  | ((database_name DOT)? schema_name DOT table_name DOT|(schema_name DOT)? table_name DOT|table_name DOT)? column_name #columnExpr
  | data_type STRING_LITERAL #constantValue
  | expr CAST_OPERATOR data_type #castOpExpr
  | <assoc=right> unary_operator expr #unaryOpExpr
  | <assoc=right> expr CARET expr #caretExpr
  | expr ( MULTIPLY | DIVIDE | MODULAR ) expr #mulDivModExpr
  | expr ( PLUS | SUB ) expr #plusSubExpr
  | expr IS NOT? expr #isExpr
  | expr (ISNULL | NOTNULL) #nullOrNotExpr
  | any_other_operator expr #unaryOtherOp
  | expr any_other_operator expr #otherOp
  | expr IS OF LEFT_PAREN data_type_list RIGHT_PAREN #typeComparePredicate
  | expr IS NOT? DISTINCT FROM expr #isDistinctExpr
  | expr NOT? IN (subquery|values_stmt|tuple_value) #inPredicate
  | expr NOT? BETWEEN expr AND expr #betweenPredicate
  | expr OVERLAPS expr #overlapsExpr
  | expr pattern_matcher expr (ESCAPE STRING_LITERAL)? #likePredicate
  | expr ( LTH | GTH) expr #lessOrGreatThanExpr
  | <assoc=right> expr (EQUAL | NOT_EQUAL) expr #eqExpr
  | <assoc=right> NOT expr #notExpr
  | expr AND expr #andExpr
  | expr OR expr #orExpr
  | function #funcExpr
  | LEFT_PAREN expr RIGHT_PAREN #parenthesizedExpr
  | scalar_subquery #scalarSubquery
  | tuple_value #tupleExpr
  | case_when #caseWhen
  | cast_expr #castExpr
  | array_constructor #arrayConstructor
  | row_constructor #rowConstructor
  | expr collate_expression #exprCollate
  ;

unsigned_numeric_literal
  : NUM
  | REAL_NUM
  ;

string_literal
  : STRING_LITERAL
  | REGEX
  | NULL
  | DEFAULT
  | MULTIPLY
  | BIND_PARAMETER
  | datetime_literal
  | boolean_literal
  ;

datetime_literal
  : timestamp_literal
  | time_literal
  | date_literal
  | interval_literal
  ;

interval_literal
  : INTERVAL interval_precision? interval_string=STRING_LITERAL interval_qualifier? interval_precision?
  ;

interval_qualifier
  : primary_datetime_field (TO primary_datetime_field)?
  ;

interval_precision
  : LEFT_PAREN unsigned_numeric_literal RIGHT_PAREN
  ;

time_literal
  : TIME time_string=STRING_LITERAL
  ;

timestamp_literal
  : TIMESTAMP timestamp_string=STRING_LITERAL
  ;

date_literal
  : DATE date_string=STRING_LITERAL
  ;

boolean_literal
  : TRUE | FALSE | UNKNOWN
  ;

primary_datetime_field
  : YEAR | MONTH | DAY | HOUR | MINUTE | SECOND
  ;

extended_datetime_field
  : CENTURY | DECADE | DOW | DOY | EPOCH | ISODOW | ISOYEAR | MICROSECONDS | MILLENNIUM | MILLISECONDS | QUARTER | WEEK
  ;

collate_expression
  : COLLATE collate_id=column_name
  ;

unary_operator
  : PLUS | SUB
  ;

any_other_operator
  : LEQ | GEQ | CONCATENATION_OPERATOR | NOT_SIMILAR | SIMILAR_INSENSITIVE | NOT_SIMILAR_INSENSITIVE
  | CUSTOME_OPERATOR
  | postgis_operator
  ;

postgis_operator
  : INTERSECT2D
  | INTERSECT3D
  | OVERLAP
  | LEFT_OF
  | RIGHT_OF
  | ABOVE
  | OVERLAPS_ABOVE
  | BELOW
  | BOX_EQUAL
  | DISTANCE
  ;

scalar_subquery
  :  subquery
  ;

tuple_value
  : LEFT_PAREN expr_list RIGHT_PAREN
  ;

case_when
  : CASE expr (WHEN expr THEN expr)+ (ELSE expr)? END
  | CASE (WHEN expr THEN expr)+ (ELSE expr)? END
  ;

cast_expr
  : CAST LEFT_PAREN expr AS data_type RIGHT_PAREN
  ;

array_constructor
  : ARRAY (scalar_subquery|LEFT_SQUARE expr_list? RIGHT_SQUARE)
  ;

row_constructor
  : ROW LEFT_PAREN expr_list? RIGHT_PAREN
  ;

exists_predicate
  : NOT? EXISTS scalar_subquery
  ;

pattern_matcher
  : NOT? negativable_matcher
  | regex_matcher
  ;

negativable_matcher
  : LIKE | ILIKE | REGEXP | RLIKE
  | SIMILAR TO
  ;

regex_matcher
  : TILDE
  | NOT_SIMILAR
  | SIMILAR_INSENSITIVE
  | NOT_SIMILAR_INSENSITIVE
  ;

expr_list
  : expr (COMMA expr)*
  ;

data_type
  : any_name
  ;

data_type_list
  : data_type (COMMA data_type)*
  ;

function_name
  : function_reserved_name
  | any_name
  ;

function_reserved_name
  : LEFT
  | RIGHT
  | ALL
  | ANY
  ;

function_args
  : function_arg (COMMA function_arg)*
  | MULTIPLY
  ;

function_arg
  : VARIADIC? expr
  | identifier ASSIGN expr
  ;

database_name
  : any_name
  ;

schema_name
  : any_name
  ;

table_name
  : any_name
  ;

column_name
  : any_name
  ;

window_name
  : any_name
  ;

exists_window_name
  : any_name
  ;

window_definition
  : exists_window_name (PARTITION BY expr_list)? order_clause? frame_clause?
  ;

frame_clause
  : (RANGE | ROWS)? (frame_start=frame|BETWEEN frame_start=frame END frame_end=frame)
  ;

frame
  : UNBOUNDED PRECEDING
  | CURRENT ROW
  | UNBOUNDED FOLLOWING
  | expr PRECEDING
  | expr FOLLOWING
  ;

table_name_list
  : table_name (COMMA table_name)*
  ;

column_name_list
  : column_name (COMMA column_name)*
  ;

column_definition
  : column_name data_type
  ;

column_definition_list
  : column_definition (COMMA column_definition)*
  ;

correlation_name
  : any_name
  ;

column_alias
  : any_name
  ;

any_name
  : identifier
  ;

identifier
  : (IDENTIFIER | QUOTED_IDENTIFIER)
  | nonreserved_keywords
  ;

nonreserved_keywords
 : ABORT
 | ABSOLUTE
 | ACTION
 | ANALYZE
 | ARRAY
 | AT
 | AVG
 | BACKWARD
 | BIGINT
 | BINARY
 | BIT
 | BLOB
 | BOOL
 | BOOLEAN
 | BOX2D
 | BOX3D
 | BYTEA
 | CACHE
 | CASCADE
 | CENTURY
 | CHAR
 | CHARACTER
 | CLOSE
 | COALESCE
 | COLLATE
 | COLLECT
 | CONCURRENTLY
 | CONSTRAINT
 | CONSTRAINTS
 | CONTINUE
 | COSTS
 | COUNT
 | CUBE
 | CURSOR
 | CYCLE
 | DATA
 | DATE
 | DAY
 | DEC
 | DECADE
 | DECIMAL
 | DECLARE
 | DEFAULTS
 | DEFERRABLE
 | DEFERRED
 | DISCARD
 | DOUBLE
 | DOW
 | DOY
 | EPOCH
 | ESCAPE
 | EVERY
 | EXCLUDE
 | EXCLUDING
 | EXTENDED
 | EXTERNAL
 | EXTRACT
 | FILTER
 | FIRST
 | FLOAT
 | FLOAT4
 | FLOAT8
 | FOLLOWING
 | FORCE
 | FOREIGN
 | FORMAT
 | FORWARD
 | FUSION
 | GEOGRAPHY
 | GEOMETRY
 | GEOMETRY_DUMP
 | GLOBAL
 | GROUPING
 | HASH
 | HOLD
 | HOUR
 | IDENTITY
 | INCLUDING
 | INDEXES
 | INET4
 | INHERIT
 | INHERITS
 | INITIALLY
 | INSENSITIVE
 | INT
 | INT1
 | INT2
 | INT4
 | INT8
 | INTEGER
 | INTERSECTION
 | INTERVAL
 | ISODOW
 | ISOYEAR
 | KEY
 | LAST
 | LATERAL
 | LESS
 | LIST
 | LOCAL
 | LOCATION
 | MAIN
 | MATCH
 | MATERIALIZED
 | MAX
 | MAXVALUE
 | MICROSECONDS
 | MILLENNIUM
 | MILLISECONDS
 | MIN
 | MINUTE
 | MINVALUE
 | MONTH
 | MOVE
 | NATIONAL
 | NCHAR
 | NEXT
 | NO
 | NO_INHERIT
 | NONE
 | NULLIF
 | NULLS
 | NUMERIC
 | NVARCHAR
 | OIDS
 | ONLY
 | OVERWRITE
 | OWNED
 | PARTIAL
 | PARTITION
 | PARTITIONS
 | PLAIN
 | POSITION
 | PRECEDING
 | PRECISION
 | PRESERVE
 | PRIMARY
 | QUARTER
 | RANGE
 | REAL
 | RECURSIVE
 | REFERENCES
 | REFRESH
 | REGEXP
 | RELATIVE
 | RELEASE
 | REPLACE
 | RESTART
 | RESTRICT
 | RETURNING
 | RLIKE
 | ROLLUP
 | SCHEMA
 | SCROLL
 | SECOND
 | SEQUENCE
 | SEQUENCES
 | SIMILAR
 | SIMPLE
 | SMALLINT
 | STDDEV_POP
 | STDDEV_SAMP
 | STORAGE
 | SUBPARTITION
 | SUBSTRING
 | SUM
 | TABLES
 | TABLESPACE
 | TEMP
 | TEMPORARY
 | TEXT
 | THAN
 | TIME
 | TIMESTAMP
 | TIMESTAMPTZ
 | TIMETZ
 | TIMEZONE
 | TIMEZONE_HOUR
 | TIMEZONE_MINUTE
 | TINYINT
 | TRANSACTION
 | TRIM
 | TSQUERY
 | TSVECTOR
 | TYPE
 | UNBOUNDED
 | UNKNOWN
 | UNLOGGED
 | UNSECURED
 | USAGE
 | VALID
 | VAR_POP
 | VAR_SAMP
 | VARBINARY
 | VARBIT
 | VARCHAR
 | VARIADIC
 | VARYING
 | VERBOSE
 | WEEK
 | WINDOW
 | WITHIN
 | WITHOUT
 | YEAR
 | ZONE
 ;