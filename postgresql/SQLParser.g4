/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

parser grammar SQLParser;

options {
    language=Java;
    tokenVocab=SQLLexer;
}

@header {
    package com.laudandjolynn.postgresql;
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
  : data_statement
  | data_change_statement
  | schema_statement
  | index_statement
  | admin_statement
  | transaction_statement
  | cursor_statement
  ;

data_statement
  : with_qualifier? (query_expression | row_values_list)
  ;

index_statement
  : create_index_statement
  | drop_index_statement
  | reindex_statement
  ;

data_change_statement
  :  with_qualifier? (insert_statement | update_statement | delete_statement)
  ;

schema_statement
  : create_table_statement
  | create_view_statement
  | create_materialized_view_statement
  | create_sequence_statement
  | drop_table_statement
  | drop_view_statement
  | drop_sequence_statement
  | alter_table_statement
  | refresh_materialized_view_statement
  | truncate_statement
  ;

admin_statement
  : grant_statement
  | revoke_statement
  | explain_statement
  | analyze_statement
  | set_statement
  ;

transaction_statement
  : (BEGIN | COMMIT | ABORT | END) TRANSACTION?
  | SAVEPOINT identifier
  | ROLLBACK (TO SAVEPOINT? identifier)?
  | RELEASE SAVEPOINT? identifier
  ;

cursor_statement
  : declare_statement
  | fetch_statement
  | move_statement
  | close_statement
  ;

declare_statement
  : DECLARE cursor_name=identifier BINARY? INSENSITIVE? (NO? SCROLL)? CURSOR ((WITH | WITHOUT) HOLD)? FOR data_statement
  ;

fetch_statement
  : FETCH cursor_direction? cursor_name=identifier
  ;

move_statement
  : MOVE cursor_direction? cursor_name=identifier
  ;

close_statement
  : CLOSE (cursor_name=identifier | ALL)
  ;

cursor_direction
  : ((NEXT | PRIOR | FIRST | LAST | ALL)
    | (FORWARD | BACKWARD) (signed_numerical_literal | ALL)?
    | (ABSOLUTE | RELATIVE) signed_numerical_literal
    | signed_numerical_literal)
    (FROM | IN)?
  | (FROM | IN)
  ;

explain_statement
  : EXPLAIN explain_options? (data_statement | data_change_statement | schema_statement)
  ;

explain_options
  : (ANALYZE | VERBOSE)+ | LEFT_PAREN (explain_option (COMMA explain_option)*)? RIGHT_PAREN
  ;

explain_option
  : (ANALYZE | VERBOSE | COSTS) (TRUE | FALSE | ON | OFF | NUMBER)?
  ;

analyze_statement
  : ANALYZE VERBOSE? table_name
  ;

grant_statement
  : GRANT (grant_role_statement | grant_object_statement) (WITH GRANT OPTION)?
  ;

revoke_statement
  : REVOKE (GRANT OPTION FOR)? role_name_list ON
    (TABLE? table_name_list | ALL TABLES IN SCHEMA schema_name) FROM GROUP? role_name_list (CASCADE | RESTRICT)?
  ;

grant_role_statement
  : role_name_list TO role_name_list
  ;

role_name_list
  : identifier (COMMA identifier)*
  ;

grant_object_statement
  : grant_table_statement
  | grant_sequences_statement
  ;

grant_sequences_statement
  : (grant_sequence_target (COMMA grant_sequence_target)* | ALL PRIVILEGES?) ON
    (SEQUENCE sequence=identifier | ALL SEQUENCES IN SCHEMA schema_name) TO GROUP? role_name
  ;

grant_sequence_target
  : USAGE | SELECT | UPDATE
  ;

grant_table_statement
  : ((grant_table_target (COMMA grant_table_target)*) | ALL PRIVILEGES?) ON
    ((TABLE? table_name_list) | (ALL TABLES IN SCHEMA schema_name)) TO GROUP? role_name
  ;

grant_table_target
  : SELECT | INSERT | UPDATE | DELETE | TRUNCATE
  ;

set_statement
  : SET set_property EQUAL STRING_LITERAL
  ;

set_property
  : identifier (DOT identifier)*
  ;

insert_statement
  : data_statement? INSERT (OVERWRITE)? INTO table_name (LEFT_PAREN insert_column_list RIGHT_PAREN)?
    insert_values returning_statement?                            
  ;

insert_column_list
  : column_reference (COMMA column_reference)*
  ;

insert_values
  : DEFAULT VALUES | row_values_list | data_statement
  ;

update_statement
  : data_statement? UPDATE ONLY? table_name qualified_asterisk? (AS? alias=identifier)? SET update_list (COMMA update_list)*
    (FROM table_reference_list)? where_cursor_clause? returning_statement?
  ;

returning_statement
  : RETURNING return_expression (COMMA return_expression)*
  ;

return_expression
  : value_expression (AS? alias=identifier)? | qualified_asterisk
  ;

update_list
  : update_per_column
  | update_column_list
  ;

update_per_column
  : update_assignment (COMMA update_assignment)*
  ;

update_assignment
  : column_reference EQUAL update_value
  ;

update_value
  : value_expression | data_statement | DEFAULT
  ;

update_value_list
  : update_value (COMMA update_value)*
  ;

update_column_list
  : LEFT_PAREN column_name_list RIGHT_PAREN EQUAL LEFT_PAREN update_value_list RIGHT_PAREN
  ;

delete_statement
  : with_qualifier? DELETE FROM ONLY? table_name MULTIPLY? as_clause? (USING table_reference_list)?
    named_columns_join? where_cursor_clause? returning_statement?
  ;

where_cursor_clause
  : where_clause | WHERE CURRENT OF cursor_name=identifier
  ;

create_index_statement
  : CREATE UNIQUE? INDEX CONCURRENTLY? index_name=identifier? ON table_name method_specifier?
    LEFT_PAREN index_column_list RIGHT_PAREN with_param_clause? where_clause?
  ;

index_column_list
  : index_column (COMMA index_column)*
  ;

index_column
  : value_expression (opclass=identifier)? order=order_specification? null_order=null_ordering?
  ;

create_view_statement
  : CREATE (OR REPLACE)? (TEMP | TEMPORARY)? (RECURSIVE)? VIEW table_name (with_param_clause)? AS data_statement
    (WITH LOCAL? CHECK OPTION)?
  ;

create_materialized_view_statement
  : CREATE MATERIALIZED VIEW table_name (LEFT_PAREN column_name_list RIGHT_PAREN)? with_param_clause?
    AS data_statement (WITH NO? DATA)?
  ;

refresh_materialized_view_statement
  : REFRESH MATERIALIZED VIEW CONCURRENTLY? table_name (WITH NO? DATA)?
  ;

create_sequence_statement
  : CREATE (TEMPORARY | TEMP)? SEQUENCE sequence_name=table_name (INCREMENT BY? signed_numerical_literal)?
    (MINVALUE signed_numerical_literal | NO MINVALUE)? (MAXVALUE signed_numerical_literal | NO MAXVALUE)?
    (START WITH? signed_numerical_literal)? (CACHE unsigned_numeric_literal)? (NO? CYCLE)?
    (OWNED BY (column_name | NONE))?
  ;

create_table_statement
  : CREATE table_modifiers* TABLE (ifNotExists+=IF ifNotExists+=NOT ifNotExists+=EXISTS)?
    table_name (normal_create_table | create_table_as_statement)
  ;

normal_create_table
  : table_elements (INHERITS LEFT_PAREN table_name_list RIGHT_PAREN)?
    (with_param_clause | WITH OIDS | WITHOUT OIDS)?
    (ON COMMIT (PRESERVE ROWS | DELETE ROWS | DROP))?
  ;

create_table_as_statement
  : (LEFT_PAREN column_name_list? RIGHT_PAREN)? (with_param_clause | WITH OIDS | WITHOUT OIDS)?
    (ON COMMIT (PRESERVE ROWS | DELETE ROWS | DROP))? AS data_statement (WITH NO? DATA)?
  ;

table_modifiers
  : GLOBAL | LOCAL
  | TEMPORARY | TEMP
  | UNLOGGED | UNSECURED
  ;

table_elements
  : LEFT_PAREN (field_element (COMMA field_element)*)? RIGHT_PAREN
  ;

column_constraint
  : (CONSTRAINT name=identifier)? (NOT NULL | 
                                   NULL | 
                                   CHECK LEFT_PAREN search_condition RIGHT_PAREN | 
                                   DEFAULT default_val=value_expression | 
                                   UNIQUE | 
                                   PRIMARY KEY | references_statement
                                   )
  ;

references_statement
  : REFERENCES ref_table=table_name (LEFT_PAREN column_name_list RIGHT_PAREN)?
                                     (MATCH (FULL | PARTIAL | SIMPLE))?
                                     (ON (UPDATE | DELETE) column_action)*
                                     (DEFERRABLE | NOT DEFERRABLE)? (INITIALLY DEFERRED | INITIALLY IMMEDIATE)?
  ;

column_action
  : NO ACTION
  | cascade
  | SET (NULL | DEFAULT)
  ;

table_constraint
  : (CONSTRAINT name=identifier)? (CHECK LEFT_PAREN search_condition RIGHT_PAREN (NO INHERIT)? | 
                                   UNIQUE LEFT_PAREN column_name_list RIGHT_PAREN |
                                   EXCLUDE (USING index_method=identifier)? LEFT_PAREN exclude_list RIGHT_PAREN where_clause? |
                                   PRIMARY KEY LEFT_PAREN column_name_list RIGHT_PAREN |
                                   FOREIGN KEY LEFT_PAREN column_name_list RIGHT_PAREN references_statement
                                  )
  ;

exclude_list
  : column_name WITH (custom_operator | comp_op) (COMMA column_name WITH (custom_operator | comp_op))*
  ;

field_element
  : name=identifier field_type collate_expression? column_constraint*
  | table_constraint
  | LIKE table_name ((INCLUDING | EXCLUDING) (DEFAULTS | CONSTRAINTS | INDEXES))*
  ;

field_type
  : data_type
  ;

with_param_clause
  : WITH LEFT_PAREN param (COMMA param)* RIGHT_PAREN
  ;

param
  : (identifier | STRING_LITERAL) (EQUAL value=numeric_value_expression)?
  ;

method_specifier
  : USING value_expression
  ;

reindex_statement
  : REINDEX (INDEX | TABLE) name=identifier FORCE?
  ;

alter_table_statement
  : ALTER TABLE (IF EXISTS)? ONLY? table_name MULTIPLY? alter_table_action (COMMA alter_table_action)*
  ;

alter_table_action
  : alter_table_add_column
  | alter_table_drop_column
  | alter_table_alter_column
  | alter_table_rename_column
  | alter_table_add_constraint
  | alter_table_drop_constraint
  | RENAME TO new_table_name=table_name
  | SET LEFT_PAREN param (COMMA param)* RIGHT_PAREN
  | NO? INHERIT inherit_table_name=table_name
  | (WITH | WITHOUT) OIDS
  | OF data_type
  | NOT OF
  ;

alter_table_add_column
  : ADD COLUMN? column_name data_type collate_expression? column_constraint?
  ;

alter_table_drop_column
  : DROP COLUMN? (IF EXISTS)? column_name cascade?
  ;

alter_table_alter_column
  : ALTER COLUMN? column_name alter_column_expression
  ;

alter_column_expression
  : (SET DATA)? TYPE data_type collate_expression? method_specifier?
  | VALIDATE CONSTRAINT constraint_name=identifier
  | SET DEFAULT value_expression
  | SET LEFT_PAREN param (COMMA param)* RIGHT_PAREN
  | SET STORAGE (PLAIN | EXTERNAL | EXTENDED | MAIN)
  | DROP DEFAULT
  | (SET | DROP) NOT NULL
  ;

alter_table_rename_column
  : RENAME COLUMN? src=column_name TO dest=column_name
  ;

alter_table_add_constraint
  : ADD (table_constraint (NOT VALID)? 
  | (CONSTRAINT name=identifier)? (UNIQUE | PRIMARY KEY) USING INDEX index_name=table_name)
  ;

alter_table_drop_constraint
  : DROP CONSTRAINT (IF EXISTS)? constraint_name=identifier cascade?
  ;

/*
===============================================================================
===============================================================================
*/

drop_table_statement
  : DROP TABLE (IF EXISTS)? table_name_list cascade?
  ;

drop_view_statement
  : DROP MATERIALIZED? VIEW (IF EXISTS)? view_name_list=table_name_list cascade?
  ;

drop_index_statement
  : DROP INDEX CONCURRENTLY? (IF EXISTS)? index_name_list=table_name_list cascade?
  ;

drop_sequence_statement
  : DROP SEQUENCE (IF EXISTS)? sequence_name_list=table_name_list cascade?
  | DISCARD SEQUENCES
  ;

truncate_statement
  : TRUNCATE TABLE? truncate_target_list ((RESTART | CONTINUE) IDENTITY)? cascade?
  ;

truncate_target_list
  : ONLY? table_name (COMMA ONLY? table_name)*
  ;

cascade
  : CASCADE | RESTRICT
  ;

/*
===============================================================================
===============================================================================
*/

identifier
  : (IDENTIFIER | QUOTED_IDENTIFIER)
  | nonreserved_keywords
  ;

nonreserved_keywords
  : AVG
  | ANALYZE
  | BETWEEN
  | BY
  | CASCADE
  | CENTURY
  | CHARACTER
  | COLLECT
  | COALESCE
  | COLUMN
  | COUNT
  | CUBE
  | CURSOR
  | CYCLE
  | DATA
  | DAY
  | DEC
  | DECADE
  | DOW
  | DOY
  | DROP
  | EPOCH
  | EVERY
  | EXTERNAL
  | EXTRACT
  | FILTER
  | FIRST
  | FOLLOWING
  | FORMAT
  | FUSION
  | GROUPING
  | HASH
  | HOUR
  | INDEX
  | INSERT
  | INTERSECTION
  | ISODOW
  | ISOYEAR
  | KEY
  | LAST
  | LESS
  | LIST
  | LOCATION
  | MAX
  | MAXVALUE
  | MICROSECONDS
  | MILLENNIUM
  | MILLISECONDS
  | MIN
  | MINUTE
  | MONTH
  | NATIONAL
  | NULLIF
  | ONLY
  | OVERWRITE
  | PARTITION
  | PARTITIONS
  | PRECEDING
  | PRECISION
  | QUARTER
  | RANGE
  | RECURSIVE
  | REGEXP
  | REPLACE
  | RESTRICT
  | RETURNING
  | RLIKE
  | ROLLUP
  | ROWS
  | SCHEMA
  | SECOND
  | SEQUENCE
  | SEQUENCES
  | SET
  | SIMILAR
  | STDDEV_POP
  | STDDEV_SAMP
  | SUBPARTITION
  | SUM
  | TABLES
  | TABLESPACE
  | THAN
  | TIMEZONE
  | TIMEZONE_HOUR
  | TIMEZONE_MINUTE
  | TRIM
  | TO
  | TYPE
  | UNBOUNDED
  | UNKNOWN
  | USAGE
  | VAR_SAMP
  | VAR_POP
  | VARYING
  | VERBOSE
  | WEEK
  | WINDOW
  | YEAR
  | ZONE

  | BIGINT
  | BIT
  | BLOB
  | BOOL
  | BOOLEAN
  | BYTEA
  | CHAR
  | DATE
  | DECIMAL
  | DOUBLE
  | FLOAT
  | FLOAT4
  | FLOAT8
  | INET4
  | INT
  | INT1
  | INT2
  | INT4
  | INT8
  | INTEGER
  | INTERVAL
  | NCHAR
  | NUMERIC
  | NVARCHAR
  | REAL
  | SMALLINT
  | TEXT
  | TIME
  | TIMESTAMP
  | TIMESTAMPTZ
  | TIMETZ
  | TINYINT
  | VARBINARY
  | VARBIT
  | VARCHAR
  ;

/*
===============================================================================
===============================================================================
*/

unsigned_literal
  : unsigned_numeric_literal
  | general_literal
  ;

general_literal
  : STRING_LITERAL
  | REGEX
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

/*
===============================================================================
===============================================================================
*/

data_type
  : (predefined_type | postgis_type | udt) (array_type_qualifier)*
  ;

udt
  : identifier
  ;

postgis_type
  : BOX2D
  | BOX3D
  | GEOMETRY
  | GEOGRAPHY
  | GEOMETRY_DUMP
  ;

predefined_type
  : character_string_type
  | national_character_string_type
  | binary_large_object_string_type
  | text_search_type
  | numeric_type
  | boolean_type
  | datetime_type
  | bit_type
  | binary_type
  | network_type
  ;

array_type_qualifier
  : ARRAY? LEFT_SQUARE (data_type | unsigned_numeric_literal)? RIGHT_SQUARE
  | ARRAY
  ;

network_type
  : INET4
  ;

character_string_type
  : CHARACTER type_length?
  | CHAR type_length?
  | CHARACTER VARYING type_length?
  | CHAR VARYING type_length?
  | VARCHAR type_length?
  | TEXT
  ;

text_search_type
  : TSVECTOR 
  | TSQUERY
  ;

type_length
  : LEFT_PAREN NUMBER RIGHT_PAREN
  ;

national_character_string_type
  : NATIONAL CHARACTER type_length?
  | NATIONAL CHAR type_length?
  | NCHAR type_length?
  | NATIONAL CHARACTER VARYING type_length?
  | NATIONAL CHAR VARYING type_length?
  | NCHAR VARYING type_length?
  | NVARCHAR type_length?
  ;

binary_large_object_string_type
  : BLOB type_length?
  | BYTEA type_length?
  ;

numeric_type
  : exact_numeric_type | approximate_numeric_type
  ;

exact_numeric_type
  : NUMERIC (precision_param)?
  | DECIMAL (precision_param)?
  | DEC (precision_param)?
  | (INT1
  | TINYINT
  | INT2
  | SMALLINT
  | INT4
  | INT
  | INTEGER
  | INT8
  | BIGINT)
  ;

approximate_numeric_type
  : (FLOAT4
  | REAL
  | FLOAT8
  | DOUBLE)
  | DOUBLE PRECISION
  | FLOAT (precision_param)?
  ;

precision_param
  : LEFT_PAREN precision=NUMBER RIGHT_PAREN
  | LEFT_PAREN precision=NUMBER COMMA scale=NUMBER RIGHT_PAREN
  ;

boolean_type
  : BOOLEAN
  | BOOL
  ;

datetime_type
  : (DATE
    | TIME
    | TIMESTAMPTZ
    | TIMETZ
    | TIMESTAMP) type_length?
  | TIME type_length? (WITH | WITHOUT) TIME ZONE
  | TIMESTAMP type_length? (WITH | WITHOUT) TIME ZONE
  ;

bit_type
  : BIT type_length?
  | VARBIT type_length?
  | BIT VARYING type_length?
  ;

binary_type
  : BINARY type_length?
  | BINARY VARYING type_length?
  | VARBINARY type_length?
  ;

/*
===============================================================================
===============================================================================
*/
value_expression_primary
  : fix_unary_operator? (parenthesized_value_expression | nonparenthesized_value_expression_primary) fix_unary_operator?
    (array_slice | (DOT column_reference)?) (CAST_EXPRESSION cast_target)* (AT TIME ZONE timezone=STRING_LITERAL)?
  ;

array_slice
  : (LEFT_SQUARE numeric_value_expression (COLON numeric_value_expression)? RIGHT_SQUARE)*
  ;

parenthesized_value_expression
  : LEFT_PAREN value_expression RIGHT_PAREN collate_expression?
  ;

nonparenthesized_value_expression_primary
  : (unsigned_value_specification
  | array_constructor
  | explicit_row_value_constructor
  | column_reference
  | constant_value
  | set_function_specification
  | scalar_subquery
  | case_expression
  | cast_specification
  | routine_invocation
  | tuple_value
  | NULL) collate_expression?
  ;

tuple_value
  : LEFT_PAREN value_expression_list RIGHT_PAREN
  ;

collate_expression
  : COLLATE collate_id=column_name
  ;

constant_value
  : data_type STRING_LITERAL
  ;

/*
===============================================================================
===============================================================================
*/

unsigned_value_specification
  : unsigned_literal
  ;

unsigned_numeric_literal
  : NUMBER
  | REAL_NUMBER
  ;

signed_numerical_literal
  : sign? unsigned_numeric_literal
  ;

fix_unary_operator
  : custom_operator
  ;

array_constructor
  : ARRAY (array_values | LEFT_PAREN data_statement RIGHT_PAREN)
  ;

array_values
  : LEFT_SQUARE ((value_expression | array_values) (COMMA (value_expression | array_values))*)? RIGHT_SQUARE
  ;

/*
===============================================================================
===============================================================================
*/
set_function_specification
  : aggregate_function
  ;

aggregate_function
  : set_function_type LEFT_PAREN (set_qualifier? value_expression_list orderby_clause? | MULTIPLY | query_expression)? RIGHT_PAREN
    within_group? filter_clause?
  ;

within_group
  : WITHIN GROUP LEFT_PAREN orderby_clause RIGHT_PAREN
  ;

set_function_type
  : (AVG
  | MAX
  | MIN
  | SUM
  | EVERY
  | ANY
  | SOME
  | COUNT
  | STDDEV_POP
  | STDDEV_SAMP
  | VAR_SAMP
  | VAR_POP
  | COLLECT
  | FUSION
  | INTERSECTION)
  | identifier   // allow arbitrary function names
  ;

filter_clause
  : FILTER LEFT_PAREN where_clause RIGHT_PAREN
  ;

grouping_operation
  : GROUPING LEFT_PAREN column_reference_list RIGHT_PAREN
  ;

/*
===============================================================================
===============================================================================
*/

case_expression
  : case_specification
  ;

case_abbreviation
  : NULLIF LEFT_PAREN numeric_value_expression COMMA boolean_value_expression  RIGHT_PAREN
  | COALESCE LEFT_PAREN numeric_value_expression ( COMMA boolean_value_expression  )+ RIGHT_PAREN
  ;

case_specification
  : simple_case
  | searched_case
  ;

simple_case
  : CASE boolean_value_expression ( simple_when_clause )+ ( else_clause  )? END
  ;

searched_case
  : CASE (searched_when_clause)+ (else_clause)? END
  ;

simple_when_clause : WHEN search_condition THEN result ;

searched_when_clause
  : WHEN c=search_condition THEN r=result
  ;

else_clause
  : ELSE r=result
  ;

result
  : value_expression | NULL
  ;

/*
===============================================================================
===============================================================================
*/

cast_specification
  : CAST LEFT_PAREN cast_operand AS cast_target RIGHT_PAREN
  ;

cast_operand
  : value_expression
  ;

cast_target
  : data_type
  ;

/*
===============================================================================
===============================================================================
*/
value_expression
  : (common_value_expression
  | row_value_expression
  | boolean_value_expression
  | routine_invocation
  | (MULTIPLY | DEFAULT)) collate_expression?
  ;

common_value_expression
  : numeric_value_expression
  | string_value_expression
  | NULL
  ;

row_values_list
  : VALUES LEFT_PAREN value_expression_list? RIGHT_PAREN (COMMA LEFT_PAREN value_expression_list RIGHT_PAREN)* 
  ;

value_expression_list
  : value_expression (COMMA value_expression)*
  ;

/*
===============================================================================
===============================================================================
*/

numeric_value_expression
  : left=term ((PLUS | MINUS) right=term)*
  ;

term
  : left=factor ((MULTIPLY | DIVIDE | MODULAR | CARET) right=factor)*
  ;

factor
  : sign? numeric_primary (custom_operator sign? numeric_primary)*
  ;

numeric_primary
  : value_expression_primary
  | numeric_value_function
  ;

sign
  : PLUS | MINUS
  ;

/*
===============================================================================
===============================================================================
*/

numeric_value_function
  : extract_expression
  | bit_position_function
  ;

bit_position_function
  : POSITION LEFT_PAREN value_expression IN value_expression RIGHT_PAREN
  ;

extract_expression
  : EXTRACT LEFT_PAREN extract_field_string=extract_field FROM extract_source RIGHT_PAREN
  ;

extract_field
  : primary_datetime_field
  | time_zone_field
  | extended_datetime_field
  ;

time_zone_field
  : TIMEZONE | TIMEZONE_HOUR | TIMEZONE_MINUTE
  ;

extract_source
  : column_reference
  | datetime_literal
  | routine_invocation
  ;

/*
===============================================================================
===============================================================================
*/

string_value_expression
  : character_value_expression
  ;

character_value_expression
  : character_primary (CONCATENATION_OPERATOR character_primary)*
  ;

character_primary
  : value_expression_primary
  | string_value_function
  ;

/*
===============================================================================
===============================================================================
*/

string_value_function
  : trim_function
  | substring_function
  | routine_invocation
  ;

substring_function
  : SUBSTRING LEFT_PAREN string_value_expression (FROM common_value_expression)?
    (FOR common_value_expression)? RIGHT_PAREN
  ;

trim_function
  : TRIM LEFT_PAREN trim_operands RIGHT_PAREN
  ;

trim_operands
  : ((trim_specification)? (trim_character=character_value_expression)? FROM)? trim_source=character_value_expression
  | trim_source=character_value_expression COMMA trim_character=character_value_expression
  ;

trim_specification
  : LEADING | TRAILING | BOTH
  ;

/*
===============================================================================
===============================================================================
*/

boolean_value_expression
  : or_predicate
  ;

or_predicate
  : and_predicate (OR or_predicate)*
  ;

and_predicate
  : boolean_factor (AND and_predicate)*
  ;

boolean_factor
  : boolean_test
  | NOT boolean_test
  ;

boolean_test
  : boolean_primary is_clause?
  ;

is_clause
  : IS NOT? t=truth_value
  ;

truth_value
  : TRUE | FALSE | UNKNOWN
  ;

boolean_primary
  : predicate
  | boolean_predicand
  ;

boolean_predicand
  : parenthesized_boolean_value_expression
  | nonparenthesized_value_expression_primary
  ;

parenthesized_boolean_value_expression
  : LEFT_PAREN boolean_value_expression RIGHT_PAREN
  ;

row_value_expression
  : row_value_special_case
  | explicit_row_value_constructor
  ;

row_value_special_case
  : nonparenthesized_value_expression_primary
  ;

explicit_row_value_constructor
  : ROW LEFT_PAREN (value_expression (COMMA value_expression)*)? RIGHT_PAREN
  ;

row_value_predicand
  : row_value_special_case
  | row_value_constructor_predicand
  ;

row_value_constructor_predicand
  : common_value_expression
  | boolean_predicand
  ;

/*
===============================================================================
===============================================================================
*/

into_expression
  : INTO (TEMPORARY | TEMP | UNLOGGED)? TABLE? table_name
  ;

table_expression
  : from_clause
  | where_clause
  | groupby_clause
  | having_clause
  | window_clause
  | orderby_clause
  | limit_clause
  | offset_clause
  | fetch_clause
  | for_clause
  ;

/*
===============================================================================
===============================================================================
*/

from_clause
  : FROM ONLY? table_reference_list
  ;

table_reference_list
  : table_reference (COMMA table_reference)*
  ;

/*
===============================================================================
  7.6 <table reference>
===============================================================================
*/

table_reference
  : (joined_table | table_function=routine_invocation |
     LEFT_PAREN table_reference RIGHT_PAREN
    ) table_alias?
  | table_primary
  ;

table_alias
  : AS? alias=identifier (LEFT_PAREN column_aliases=column_name_list? RIGHT_PAREN)?
  ;

/*
===============================================================================
===============================================================================
*/

joined_table
  : table_primary joined_table_primary+
  ;

joined_table_primary
  : CROSS JOIN right=table_primary
  | (t=join_type)? JOIN right=table_primary s=join_specification
  | NATURAL (t=join_type)? JOIN right=table_primary
  | UNION JOIN right=table_primary
  ;

cross_join
  : CROSS JOIN r=table_primary
  ;

qualified_join
  : (t=join_type)? JOIN r=table_primary s=join_specification
  ;

natural_join
  : NATURAL (t=join_type)? JOIN r=table_primary
  ;

union_join
  : UNION JOIN r=table_primary
  ;

join_type
  : INNER
  | t=outer_join_type
  ;

outer_join_type
  : outer_join_type_part2 OUTER?
  ;

outer_join_type_part2
  : LEFT
  | RIGHT
  | FULL
  ;

join_specification
  : join_condition
  | named_columns_join
  ;

join_condition
  : ON search_condition
  | USING (LEFT_PAREN column_name_list RIGHT_PAREN | column_name_list)
  ;

named_columns_join
  : USING LEFT_PAREN f=column_reference_list RIGHT_PAREN
  ;

table_primary
  : (table_or_query_name | derived_table) MULTIPLY? table_alias?
  | row_values_list table_alias?
  | LEFT_PAREN table_primary RIGHT_PAREN table_alias?
  ;

schema_name
  : identifier
  ;

column_name
  : name=table_name
  ;

column_name_list
  :  column_name  (COMMA column_name)*
  ;

role_name
  : identifier
  ;

derived_table
  : table_subquery
  | LATERAL (LEFT_PAREN data_statement RIGHT_PAREN | routine_invocation)
  ;

/*
===============================================================================
===============================================================================
*/
where_clause
  : WHERE search_condition
  ;

search_condition
  : value_expression // instead of boolean_value_expression, we use value_expression for more flexibility.
  ;

/*
===============================================================================
===============================================================================
*/
groupby_clause
  : GROUP BY g=grouping_element_list
  ;

grouping_element_list
  : grouping_element (COMMA grouping_element)*
  ;

grouping_element
  : rollup_list
  | cube_list
  | empty_grouping_set
  | ordinary_grouping_set
  ;

ordinary_grouping_set
  : row_value_predicand
  | LEFT_PAREN row_value_predicand_list RIGHT_PAREN
  ;

ordinary_grouping_set_list
  : ordinary_grouping_set (COMMA ordinary_grouping_set)*
  ;

rollup_list
  : ROLLUP LEFT_PAREN c=ordinary_grouping_set_list RIGHT_PAREN
  ;

cube_list
  : CUBE LEFT_PAREN c=ordinary_grouping_set_list RIGHT_PAREN
  ;

empty_grouping_set
  : LEFT_PAREN RIGHT_PAREN
  ;

having_clause
  : HAVING boolean_value_expression
  ;

row_value_predicand_list
  : row_value_predicand (COMMA row_value_predicand)*
  ;

/*
===============================================================================
===============================================================================
*/
with_qualifier
  : (WITH RECURSIVE? with_subquery (COMMA with_subquery)*)
  ;

with_subquery
  : alias=identifier (LEFT_PAREN column_name_list RIGHT_PAREN)? AS 
    LEFT_PAREN (data_statement | insert_statement | update_statement | delete_statement) RIGHT_PAREN
  ;

query_expression
  : query_expression_body
  ;

query_expression_body
  : non_join_query_expression
  | joined_table
  ;

non_join_query_expression
  : (non_join_query_term
  | joined_table (UNION | EXCEPT) (ALL|DISTINCT)? query_term)
    ((UNION | EXCEPT) (ALL|DISTINCT)? query_term)*
  ;

query_term
  : non_join_query_term
  | joined_table
  ;

non_join_query_term
  : ( non_join_query_primary
  | joined_table INTERSECT (ALL|DISTINCT)? query_primary)
    (INTERSECT (ALL|DISTINCT)? query_primary)*
  ;

query_primary
  : non_join_query_primary
  | joined_table
  | row_values_list
  ;

non_join_query_primary
  : simple_table
  | LEFT_PAREN non_join_query_expression RIGHT_PAREN
  ;

simple_table
  : query_specification explicit_table?
  ;

explicit_table
  : TABLE table_or_query_name
  ;

table_or_query_name
  : table_name
  | identifier
  ;

table_name
  : identifier  ( DOT  (identifier | MULTIPLY) (  DOT identifier )? )?
  ;

table_name_list
  : table_name (COMMA table_name)*
  ;

query_specification
  : SELECT set_qualifier? select_list into_expression? table_expression*
  | row_values_list
  ;

select_list
  : select_sublist (COMMA select_sublist)*
  ;

select_sublist
  : derived_column
  | qualified_asterisk
  ;

derived_column
  : value_expression as_clause?
  ;

qualified_asterisk
  : (tb_name=IDENTIFIER DOT)? MULTIPLY
  ;

set_qualifier
  : DISTINCT (ON search_condition)?
  | ALL
  ;

column_reference
  : identifier (DOT (name=identifier | MULTIPLY))? array_slice (DOT column_reference)*
  ;

as_clause
  : AS? (identifier | truth_value | NULL)
  ;

column_reference_list
  : column_reference (COMMA column_reference)*
  ;

/*
==============================================================================================
==============================================================================================
*/

scalar_subquery
  :  subquery
  ;

row_subquery
  :  subquery
  ;

table_subquery
  : subquery
  ;

subquery
  :  LEFT_PAREN data_statement RIGHT_PAREN
  ;

/*
===============================================================================
===============================================================================
*/

predicate
  : comparison_predicate
  | type_comp_predicate
  | between_predicate
  | in_predicate
  | pattern_matching_predicate // like predicate and other similar predicates
  | null_predicate
  | exists_predicate
  | distinct_from_predicate
  | custom_predicate
  ;

custom_predicate
  : left=row_value_predicand c=custom_operator right=row_value_predicand
  ;

custom_operator
  : (CUSTOME_OPERAND | PLUS | MINUS | MULTIPLY | DIVIDE | TILDE | NOT_SIMILAR | SIMILAR_INSENSITIVE | NOT_SIMILAR_INSENSITIVE)
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

/*
===============================================================================
===============================================================================
*/
comparison_predicate
  : left=row_value_predicand c=comp_op right=row_value_predicand
  ;

comp_op
  : EQUAL
  | NOT_EQUAL
  | LTH
  | LEQ
  | GTH
  | GEQ
  ;

type_comp_predicate
  : row_value_predicand IS OF LEFT_PAREN data_type RIGHT_PAREN
  ;

/*
===============================================================================
===============================================================================
*/

between_predicate
  : predicand=row_value_predicand between_predicate_part_2
  ;

between_predicate_part_2
  : (NOT)? BETWEEN (ASYMMETRIC | SYMMETRIC)? begin=row_value_predicand AND end=row_value_predicand
  ;


/*
===============================================================================
===============================================================================
*/

in_predicate
  : (numeric_value_expression | in_value_list) NOT? IN in_predicate_value
  ;

in_predicate_value
  : table_subquery
  | in_value_list
  | row_values_list
  ;

in_value_list
  : LEFT_PAREN (numeric_primary | in_value_list) ( COMMA (numeric_primary | in_value_list))* RIGHT_PAREN
  ;

/*
===============================================================================
===============================================================================
*/

pattern_matching_predicate
  : left=row_value_predicand pattern_matcher right=row_value_predicand (ESCAPE STRING_LITERAL)?
  ;

pattern_matcher
  : NOT? negativable_matcher
  | regex_matcher
  ;

negativable_matcher
  : (LIKE | ILIKE | REGEXP | RLIKE)
  | SIMILAR TO 
  ;

regex_matcher
  : TILDE
  | NOT_SIMILAR
  | SIMILAR_INSENSITIVE
  | NOT_SIMILAR_INSENSITIVE
  ;

/*
===============================================================================

===============================================================================
*/

null_predicate
  : predicand=row_value_predicand IS (NOT)? NULL
  ;

/*
==============================================================================================
==============================================================================================
*/

quantified_comparison_predicate
  : numeric_value_expression  (comp_op | custom_operator) q=quantifier table_subquery
  ;

quantifier : all  | some ;

all : ALL;

some : SOME | ANY;

/*
==============================================================================================
==============================================================================================
*/

exists_predicate
  : NOT? EXISTS table_subquery
  ;


/*
==============================================================================================
==============================================================================================
*/

unique_predicate
  : UNIQUE table_subquery
  ;

/*
===============================================================================
===============================================================================
*/

distinct_from_predicate
  : left=row_value_predicand IS NOT? DISTINCT FROM right=row_value_predicand
  ;

/*
===============================================================================
===============================================================================
*/

primary_datetime_field
    :	non_second_primary_datetime_field
    |	SECOND
    ;

non_second_primary_datetime_field
  : YEAR | MONTH | DAY | HOUR | MINUTE
  ;

extended_datetime_field
  : CENTURY | DECADE | DOW | DOY | EPOCH | ISODOW | ISOYEAR | MICROSECONDS | MILLENNIUM | MILLISECONDS | QUARTER | WEEK
  ;

/*
===============================================================================
===============================================================================
*/

fetch_clause
  : FETCH (FIRST | NEXT) count=unsigned_numeric_literal? (ROW | ROWS) ONLY
  ;

for_clause
  : FOR (UPDATE | NO KEY UPDATE | SHARE | KEY SHARE) (OF table_name_list)? 
  ;

routine_invocation
  : function_name LEFT_PAREN sql_argument_list? RIGHT_PAREN
  ;

function_names_for_reserved_words
  : LEFT
  | RIGHT
  | ALL
  | ANY
  ;

function_name
  : func_name=table_name
  | function_names_for_reserved_words
  ;

sql_argument_list
  : sql_argument (COMMA sql_argument)*
  ;

sql_argument
  : VARIADIC? value_expression | identifier ASSIGN value_expression
  ;

window_clause
  : WINDOW identifier AS LEFT_PAREN window_definition RIGHT_PAREN
  ;

window_definition
  : existing_window_name=identifier? (PARTITION BY)? orderby_clause? frame_clause
  ;

frame_clause
  : (RANGE | ROWS)? BETWEEN? frame_start=frame (AND frame_end=frame)?
  ;

frame
  : (UNBOUNDED | (value=nonparenthesized_value_expression_primary (PRECEDING | FOLLOWING))) | CURRENT ROW
  ;

offset_clause
  : OFFSET e=numeric_value_expression
  ;

orderby_clause
  : ORDER BY sort_specifier_list
  ;

sort_specifier_list
  : sort_specifier (COMMA sort_specifier)*
  ;

sort_specifier
  : value_expression order=order_specification? null_order=null_ordering?
  ;

order_specification
  : (ASC | DESC)
  | USING (PLUS | MINUS | MULTIPLY | DIVIDE | MODULAR | LTH | GTH | CUSTOME_OPERAND)
  ;

limit_clause
  : LIMIT (e=numeric_value_expression | ALL)
  ;

null_ordering
  : NULLS FIRST
  | NULLS LAST
  ;
