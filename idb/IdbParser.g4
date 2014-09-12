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

parser grammar IdbParser;

options {
    language=Java;
    tokenVocab=IdbLexer;
}

@header {
    package com.intple.dbone.parser.idb;
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
  | ddl
  | dcl
  ;

dml
  :
  ;

ddl
  :
  ;

dcl
  :
  ;

select_stmt
  :
  ;

update_stmt
  :
  ;

delete_stmt
  :
  ;

insert_stmt
  :
  ;

with_query
  : WITH RECURSIVE? with_query_name (LPAREN column_name_list RPAREN)? AS (select_stmt | values_stmt | insert_stmt | update_stmt | delete_stmt) #withQuery
  ;

with_query_name
  : any_name
  ;

subquery
  : LPAREN select_stmt RPAREN
  ;

from_clause : FROM table_reference (COMMA table_reference)* #fromClause;

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
  : PLUS | SUB | MULTIPLY | DIVIDE | MODULAR | LTH | GTH | CUSTOME_OPERAND
  ;

null_ordering
  : NULLS (FIRST | LAST)
  ;

limit_clause
  : LIMIT (count | ALL) OFFSET start
  | OFFSET start (ROW | ROWS) FETCH (FIRST | NEXT) count? (ROW | ROWS) ONLY
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
  ;

function
  : function_name LPAREN function_args? RPAREN
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
  : VALUES LPAREN expr_list RPAREN (LPAREN expr_list RPAREN)* order_clause? limit_clause? #valuesStmt
  ;

search_condition
  : boolean_expr
  ;

expr
  :
  ;

boolean_expr
  :
  ;

expr_list
  : expr (COMMA expr)*
  ;

datatype
  :
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
  ;

function_arg
  : VARIADIC? expr
  | identifier ASSIGN expr
  ;

number
  : unsigned_numeric_literal
  | signed_numerical_literal
  ;

unsigned_numeric_literal
  : NUM
  | REAL_NUM
  ;

signed_numerical_literal
  : sign? unsigned_numeric_literal
  ;

sign
  : PLUS | SUB
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

column_name_list
  : column_name (COMMA column_name)*
  ;

column_definition
  : column_name datatype
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