// Generated from D:/Work/Code/Intelij IDEA/grammars-v4/postgresql\SQLParser.g4 by ANTLR 4.4.1-dev

    package com.laudandjolynn.postgresql;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ISODOW=153, OVERWRITE=185, ROW=57, PRECISION=193, ILIKE=32, REGEX=351, 
		NOT=44, EXCEPT=22, CACHE=87, FOREIGN=132, PRIVILEGES=53, BYTEA=296, CHARACTER=90, 
		ACTION=78, MONTH=173, TYPE=241, VARBIT=263, DISTANCE=339, STDDEV_POP=224, 
		CREATE=13, STRING_LITERAL=352, USING=70, UNLOGGED=244, NOT_EQUAL=310, 
		TIMEZONE_MINUTE=237, OFF=46, VARIADIC=249, TIMESTAMPTZ=289, BEGIN=8, PRECEDING=192, 
		VALID=247, REGEXP=202, ANALYZE=80, BLOCKCOMMENT=345, GEQ=314, TSQUERY=292, 
		STDDEV_SAMP=225, DIVIDE=322, BLOB=295, PRESERVE=194, ASC=7, GROUPING=137, 
		SUBPARTITION=227, TRANSACTION=238, KEY=155, TEMP=233, REFRESH=201, ELSE=21, 
		NUMBER=343, BOOL=261, MATERIALIZED=164, TRAILING=64, INTERSECT2D=330, 
		SEMI_COLON=307, INT=270, RLIKE=211, RECURSIVE=199, ROLLBACK=56, RESTRICT=208, 
		LEADING=39, TABLESPACE=231, MILLISECONDS=169, REAL=275, GROUP=29, INTERSECT=35, 
		SEQUENCES=218, FETCH=25, INSENSITIVE=149, REAL_NUMBER=344, NONE=179, TRIM=239, 
		NOT_SIMILAR_INSENSITIVE=342, INTERSECT3D=331, WITHIN=256, LEFT_PAREN=315, 
		LOCATION=161, GEOGRAPHY=302, END=20, CONSTRAINT=98, TIMEZONE_HOUR=236, 
		RENAME=205, CAST_EXPRESSION=303, ALTER=3, OPTION=49, FORCE=131, IDENTITY=141, 
		ISOYEAR=154, NCHAR=282, PLAIN=190, ONLY=184, TABLE=62, VARCHAR=281, FLOAT=276, 
		MICROSECONDS=167, ASYMMETRIC=6, SUM=229, OWNED=186, WHITE_SPACE=354, POSITION=191, 
		STORAGE=226, AT=82, TIME=286, AS=1, RIGHT_PAREN=316, BIND_PARAMETER=350, 
		THEN=63, GEOMETRY=300, TSVECTOR=291, MAXVALUE=166, OFFSET=47, REPLACE=206, 
		AVG=83, LEFT=40, ZONE=259, TRUNCATE=66, BOX3D=299, COLUMN=96, PLUS=319, 
		EXISTS=123, NVARCHAR=283, LIKE=41, COLLATE=93, ADD=79, INTEGER=271, OUTER=50, 
		BY=86, DEFERRABLE=113, BOX_EQUAL=338, BOX2D=298, TO=240, INHERIT=146, 
		SET=219, RIGHT=55, RELATIVE=203, HAVING=30, MIN=170, MINUS=320, TEXT=290, 
		HOUR=140, CONCATENATION_OPERATOR=309, UNION=67, CURRENT=15, COLON=306, 
		NULLS=181, COMMIT=12, SCHEMA=214, DECIMAL=279, CLOSE=92, DROP=117, BIGINT=272, 
		WHEN=73, MOVE=174, VALIDATE=248, CONCURRENTLY=97, ROWS=213, START=223, 
		DECLARE=110, QUOTED_IDENTIFIER=349, BIT=262, REVOKE=210, NATURAL=43, FORMAT=133, 
		BETWEEN=85, UNSECURED=245, PRIOR=196, FIRST=128, CAST=11, WEEK=254, EXTERNAL=125, 
		DOUBLE_QUOTE=328, VARYING=252, CASE=10, CHAR=280, INT8=267, COUNT=102, 
		DAY=107, LINECOMMENT=346, CASCADE=88, INT2=265, RELEASE=204, INT1=264, 
		INT4=266, EXPLAIN=23, EXTENDED=124, QUOTE=327, MODULAR=323, VERBOSE=253, 
		FULL=26, THAN=234, QUARTER=197, ESCAPE=119, INSERT=150, INHERITS=147, 
		RETURNING=209, INTERSECTION=151, CARET=324, SAVEPOINT=58, LESS=158, TINYINT=268, 
		BOTH=9, DOUBLE=277, SYMMETRIC=61, SHARE=220, LAST=156, ABORT=76, SELECT=59, 
		INTO=36, ARRAY=81, UNIQUE=68, NO_INHERIT=178, COALESCE=95, SECOND=216, 
		VIEW=72, EPOCH=118, OVERLAPS_ABOVE=336, ROLLUP=212, WITHOUT=257, NULL=45, 
		NO=177, EVERY=120, ON=48, RESTART=207, ABOVE=335, MATCH=163, PRIMARY=195, 
		DELETE=17, RIGHT_OF=334, INET4=297, NUMERIC=278, LOCAL=160, EXCLUDING=122, 
		LIST=159, OF=182, TABLES=230, UNDERLINE=326, SEQUENCE=217, COSTS=101, 
		DISCARD=114, CUBE=103, NATIONAL=175, VAR_POP=251, OR=51, FILTER=127, NOT_SIMILAR=340, 
		CHECK=91, FROM=27, UNBOUNDED=242, COLLECT=94, FALSE=24, TEMPORARY=232, 
		DISTINCT=19, CURSOR=104, TIMESTAMP=288, SIMPLE=222, RIGHT_SQUARE=318, 
		WHERE=74, CONSTRAINTS=99, DEC=108, VAR_SAMP=250, MAIN=162, NULLIF=180, 
		TIMETZ=287, FORWARD=134, INNER=34, YEAR=258, TIMEZONE=235, ORDER=52, LIMIT=42, 
		DECADE=109, GTH=313, CYCLE=105, UPDATE=69, MAX=165, DEFERRED=112, FOR=130, 
		FLOAT4=273, HOLD=139, FLOAT8=274, AND=4, FOLLOWING=129, SPACE=353, SCROLL=215, 
		CROSS=14, INTERVAL=285, USAGE=246, IF=31, OVERLAP=332, INDEX=144, GEOMETRY_DUMP=301, 
		OIDS=183, BOOLEAN=260, IN=33, MINVALUE=171, UNKNOWN=243, MULTIPLY=321, 
		CONTINUE=100, COMMA=308, REFERENCES=200, IS=37, PARTITION=188, IDENTIFIER=348, 
		PARTITIONS=189, SOME=60, EQUAL=305, ALL=2, TILDE=329, NEXT=176, DOT=325, 
		EXTRACT=126, CENTURY=89, DOW=115, PARTIAL=187, WITH=75, EXCLUDE=121, DOY=116, 
		INITIALLY=148, REINDEX=54, FUSION=135, GRANT=28, VARBINARY=294, LATERAL=157, 
		CUSTOME_OPERAND=347, DEFAULT=16, BACKWARD=84, VALUES=71, HASH=138, RANGE=198, 
		INDEXES=145, MILLENNIUM=168, BELOW=337, TRUE=65, JOIN=38, SIMILAR=221, 
		SUBSTRING=228, DEFAULTS=111, LTH=311, INCREMENT=143, ANY=5, LEFT_OF=333, 
		SIMILAR_INSENSITIVE=341, ASSIGN=304, IMMEDIATE=152, WINDOW=255, BINARY=293, 
		DESC=18, DATE=284, GLOBAL=136, MINUTE=172, LEFT_SQUARE=317, ABSOLUTE=77, 
		DATA=106, INCLUDING=142, LEQ=312, SMALLINT=269;
	public static final String[] tokenNames = {
		"<INVALID>", "AS", "ALL", "ALTER", "AND", "ANY", "ASYMMETRIC", "ASC", 
		"BEGIN", "BOTH", "CASE", "CAST", "COMMIT", "CREATE", "CROSS", "CURRENT", 
		"DEFAULT", "DELETE", "DESC", "DISTINCT", "END", "ELSE", "EXCEPT", "EXPLAIN", 
		"FALSE", "FETCH", "FULL", "FROM", "GRANT", "GROUP", "HAVING", "IF", "ILIKE", 
		"IN", "INNER", "INTERSECT", "INTO", "IS", "JOIN", "LEADING", "LEFT", "LIKE", 
		"LIMIT", "NATURAL", "NOT", "NULL", "OFF", "OFFSET", "ON", "OPTION", "OUTER", 
		"OR", "ORDER", "PRIVILEGES", "REINDEX", "RIGHT", "ROLLBACK", "ROW", "SAVEPOINT", 
		"SELECT", "SOME", "SYMMETRIC", "TABLE", "THEN", "TRAILING", "TRUE", "TRUNCATE", 
		"UNION", "UNIQUE", "UPDATE", "USING", "VALUES", "VIEW", "WHEN", "WHERE", 
		"WITH", "ABORT", "ABSOLUTE", "ACTION", "ADD", "ANALYZE", "ARRAY", "AT", 
		"AVG", "BACKWARD", "BETWEEN", "BY", "CACHE", "CASCADE", "CENTURY", "CHARACTER", 
		"CHECK", "CLOSE", "COLLATE", "COLLECT", "COALESCE", "COLUMN", "CONCURRENTLY", 
		"CONSTRAINT", "CONSTRAINTS", "CONTINUE", "COSTS", "COUNT", "CUBE", "CURSOR", 
		"CYCLE", "DATA", "DAY", "DEC", "DECADE", "DECLARE", "DEFAULTS", "DEFERRED", 
		"DEFERRABLE", "DISCARD", "DOW", "DOY", "DROP", "EPOCH", "ESCAPE", "EVERY", 
		"EXCLUDE", "EXCLUDING", "EXISTS", "EXTENDED", "EXTERNAL", "EXTRACT", "FILTER", 
		"FIRST", "FOLLOWING", "FOR", "FORCE", "FOREIGN", "FORMAT", "FORWARD", 
		"FUSION", "GLOBAL", "GROUPING", "HASH", "HOLD", "HOUR", "IDENTITY", "INCLUDING", 
		"INCREMENT", "INDEX", "INDEXES", "INHERIT", "INHERITS", "INITIALLY", "INSENSITIVE", 
		"INSERT", "INTERSECTION", "IMMEDIATE", "ISODOW", "ISOYEAR", "KEY", "LAST", 
		"LATERAL", "LESS", "LIST", "LOCAL", "LOCATION", "MAIN", "MATCH", "MATERIALIZED", 
		"MAX", "MAXVALUE", "MICROSECONDS", "MILLENNIUM", "MILLISECONDS", "MIN", 
		"MINVALUE", "MINUTE", "MONTH", "MOVE", "NATIONAL", "NEXT", "NO", "NO_INHERIT", 
		"NONE", "NULLIF", "NULLS", "OF", "OIDS", "ONLY", "OVERWRITE", "OWNED", 
		"PARTIAL", "PARTITION", "PARTITIONS", "PLAIN", "POSITION", "PRECEDING", 
		"PRECISION", "PRESERVE", "PRIMARY", "PRIOR", "QUARTER", "RANGE", "RECURSIVE", 
		"REFERENCES", "REFRESH", "REGEXP", "RELATIVE", "RELEASE", "RENAME", "REPLACE", 
		"RESTART", "RESTRICT", "RETURNING", "REVOKE", "RLIKE", "ROLLUP", "ROWS", 
		"SCHEMA", "SCROLL", "SECOND", "SEQUENCE", "SEQUENCES", "SET", "SHARE", 
		"SIMILAR", "SIMPLE", "START", "STDDEV_POP", "STDDEV_SAMP", "STORAGE", 
		"SUBPARTITION", "SUBSTRING", "SUM", "TABLES", "TABLESPACE", "TEMPORARY", 
		"TEMP", "THAN", "TIMEZONE", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TRANSACTION", 
		"TRIM", "TO", "TYPE", "UNBOUNDED", "UNKNOWN", "UNLOGGED", "UNSECURED", 
		"USAGE", "VALID", "VALIDATE", "VARIADIC", "VAR_SAMP", "VAR_POP", "VARYING", 
		"VERBOSE", "WEEK", "WINDOW", "WITHIN", "WITHOUT", "YEAR", "ZONE", "BOOLEAN", 
		"BOOL", "BIT", "VARBIT", "INT1", "INT2", "INT4", "INT8", "TINYINT", "SMALLINT", 
		"INT", "INTEGER", "BIGINT", "FLOAT4", "FLOAT8", "REAL", "FLOAT", "DOUBLE", 
		"NUMERIC", "DECIMAL", "CHAR", "VARCHAR", "NCHAR", "NVARCHAR", "DATE", 
		"INTERVAL", "TIME", "TIMETZ", "TIMESTAMP", "TIMESTAMPTZ", "TEXT", "TSVECTOR", 
		"TSQUERY", "BINARY", "VARBINARY", "BLOB", "BYTEA", "INET4", "BOX2D", "BOX3D", 
		"GEOMETRY", "GEOMETRY_DUMP", "GEOGRAPHY", "CAST_EXPRESSION", "':='", "'='", 
		"':'", "';'", "','", "'||'", "NOT_EQUAL", "'<'", "'<='", "'>'", "'>='", 
		"'('", "')'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'.'", "'_'", "'''", "'\"'", "'~'", "'&&'", "'&&&'", "OVERLAP", "'<<'", 
		"'>>'", "'|>>'", "'|&>'", "'<<|'", "'~='", "DISTANCE", "'!~'", "'~*'", 
		"'!~*'", "NUMBER", "REAL_NUMBER", "BLOCKCOMMENT", "LINECOMMENT", "CUSTOME_OPERAND", 
		"IDENTIFIER", "QUOTED_IDENTIFIER", "BIND_PARAMETER", "REGEX", "STRING_LITERAL", 
		"' '", "WHITE_SPACE"
	};
	public static final int
		RULE_sql = 0, RULE_statement = 1, RULE_data_statement = 2, RULE_index_statement = 3, 
		RULE_data_change_statement = 4, RULE_schema_statement = 5, RULE_admin_statement = 6, 
		RULE_transaction_statement = 7, RULE_cursor_statement = 8, RULE_declare_statement = 9, 
		RULE_fetch_statement = 10, RULE_move_statement = 11, RULE_close_statement = 12, 
		RULE_cursor_direction = 13, RULE_explain_statement = 14, RULE_explain_options = 15, 
		RULE_explain_option = 16, RULE_analyze_statement = 17, RULE_grant_statement = 18, 
		RULE_revoke_statement = 19, RULE_grant_role_statement = 20, RULE_role_name_list = 21, 
		RULE_grant_object_statement = 22, RULE_grant_sequences_statement = 23, 
		RULE_grant_sequence_target = 24, RULE_grant_table_statement = 25, RULE_grant_table_target = 26, 
		RULE_set_statement = 27, RULE_set_property = 28, RULE_insert_statement = 29, 
		RULE_insert_column_list = 30, RULE_insert_values = 31, RULE_update_statement = 32, 
		RULE_returning_statement = 33, RULE_return_expression = 34, RULE_update_list = 35, 
		RULE_update_per_column = 36, RULE_update_assignment = 37, RULE_update_value = 38, 
		RULE_update_value_list = 39, RULE_update_column_list = 40, RULE_delete_statement = 41, 
		RULE_where_cursor_clause = 42, RULE_create_index_statement = 43, RULE_index_column_list = 44, 
		RULE_index_column = 45, RULE_create_view_statement = 46, RULE_create_materialized_view_statement = 47, 
		RULE_refresh_materialized_view_statement = 48, RULE_create_sequence_statement = 49, 
		RULE_create_table_statement = 50, RULE_normal_create_table = 51, RULE_create_table_as_statement = 52, 
		RULE_table_modifiers = 53, RULE_table_elements = 54, RULE_column_constraint = 55, 
		RULE_references_statement = 56, RULE_column_action = 57, RULE_table_constraint = 58, 
		RULE_exclude_list = 59, RULE_field_element = 60, RULE_field_type = 61, 
		RULE_with_param_clause = 62, RULE_param = 63, RULE_method_specifier = 64, 
		RULE_reindex_statement = 65, RULE_alter_table_statement = 66, RULE_alter_table_action = 67, 
		RULE_alter_table_add_column = 68, RULE_alter_table_drop_column = 69, RULE_alter_table_alter_column = 70, 
		RULE_alter_column_expression = 71, RULE_alter_table_rename_column = 72, 
		RULE_alter_table_add_constraint = 73, RULE_alter_table_drop_constraint = 74, 
		RULE_drop_table_statement = 75, RULE_drop_view_statement = 76, RULE_drop_index_statement = 77, 
		RULE_drop_sequence_statement = 78, RULE_truncate_statement = 79, RULE_truncate_target_list = 80, 
		RULE_cascade = 81, RULE_identifier = 82, RULE_nonreserved_keywords = 83, 
		RULE_unsigned_literal = 84, RULE_general_literal = 85, RULE_datetime_literal = 86, 
		RULE_interval_literal = 87, RULE_interval_qualifier = 88, RULE_interval_precision = 89, 
		RULE_time_literal = 90, RULE_timestamp_literal = 91, RULE_date_literal = 92, 
		RULE_boolean_literal = 93, RULE_data_type = 94, RULE_udt = 95, RULE_postgis_type = 96, 
		RULE_predefined_type = 97, RULE_array_type_qualifier = 98, RULE_network_type = 99, 
		RULE_character_string_type = 100, RULE_text_search_type = 101, RULE_type_length = 102, 
		RULE_national_character_string_type = 103, RULE_binary_large_object_string_type = 104, 
		RULE_numeric_type = 105, RULE_exact_numeric_type = 106, RULE_approximate_numeric_type = 107, 
		RULE_precision_param = 108, RULE_boolean_type = 109, RULE_datetime_type = 110, 
		RULE_bit_type = 111, RULE_binary_type = 112, RULE_value_expression_primary = 113, 
		RULE_array_slice = 114, RULE_parenthesized_value_expression = 115, RULE_nonparenthesized_value_expression_primary = 116, 
		RULE_tuple_value = 117, RULE_collate_expression = 118, RULE_constant_value = 119, 
		RULE_unsigned_value_specification = 120, RULE_unsigned_numeric_literal = 121, 
		RULE_signed_numerical_literal = 122, RULE_fix_unary_operator = 123, RULE_array_constructor = 124, 
		RULE_array_values = 125, RULE_set_function_specification = 126, RULE_aggregate_function = 127, 
		RULE_within_group = 128, RULE_set_function_type = 129, RULE_filter_clause = 130, 
		RULE_grouping_operation = 131, RULE_case_expression = 132, RULE_case_abbreviation = 133, 
		RULE_case_specification = 134, RULE_simple_case = 135, RULE_searched_case = 136, 
		RULE_simple_when_clause = 137, RULE_searched_when_clause = 138, RULE_else_clause = 139, 
		RULE_result = 140, RULE_cast_specification = 141, RULE_cast_operand = 142, 
		RULE_cast_target = 143, RULE_value_expression = 144, RULE_common_value_expression = 145, 
		RULE_row_values_list = 146, RULE_value_expression_list = 147, RULE_numeric_value_expression = 148, 
		RULE_term = 149, RULE_factor = 150, RULE_numeric_primary = 151, RULE_sign = 152, 
		RULE_numeric_value_function = 153, RULE_bit_position_function = 154, RULE_extract_expression = 155, 
		RULE_extract_field = 156, RULE_time_zone_field = 157, RULE_extract_source = 158, 
		RULE_string_value_expression = 159, RULE_character_value_expression = 160, 
		RULE_character_primary = 161, RULE_string_value_function = 162, RULE_substring_function = 163, 
		RULE_trim_function = 164, RULE_trim_operands = 165, RULE_trim_specification = 166, 
		RULE_boolean_value_expression = 167, RULE_or_predicate = 168, RULE_and_predicate = 169, 
		RULE_boolean_factor = 170, RULE_boolean_test = 171, RULE_is_clause = 172, 
		RULE_truth_value = 173, RULE_boolean_primary = 174, RULE_boolean_predicand = 175, 
		RULE_parenthesized_boolean_value_expression = 176, RULE_row_value_expression = 177, 
		RULE_row_value_special_case = 178, RULE_explicit_row_value_constructor = 179, 
		RULE_row_value_predicand = 180, RULE_row_value_constructor_predicand = 181, 
		RULE_into_expression = 182, RULE_table_expression = 183, RULE_from_clause = 184, 
		RULE_table_reference_list = 185, RULE_table_reference = 186, RULE_table_alias = 187, 
		RULE_joined_table = 188, RULE_joined_table_primary = 189, RULE_cross_join = 190, 
		RULE_qualified_join = 191, RULE_natural_join = 192, RULE_union_join = 193, 
		RULE_join_type = 194, RULE_outer_join_type = 195, RULE_outer_join_type_part2 = 196, 
		RULE_join_specification = 197, RULE_join_condition = 198, RULE_named_columns_join = 199, 
		RULE_table_primary = 200, RULE_schema_name = 201, RULE_column_name = 202, 
		RULE_column_name_list = 203, RULE_role_name = 204, RULE_derived_table = 205, 
		RULE_where_clause = 206, RULE_search_condition = 207, RULE_groupby_clause = 208, 
		RULE_grouping_element_list = 209, RULE_grouping_element = 210, RULE_ordinary_grouping_set = 211, 
		RULE_ordinary_grouping_set_list = 212, RULE_rollup_list = 213, RULE_cube_list = 214, 
		RULE_empty_grouping_set = 215, RULE_having_clause = 216, RULE_row_value_predicand_list = 217, 
		RULE_with_qualifier = 218, RULE_with_subquery = 219, RULE_query_expression = 220, 
		RULE_query_expression_body = 221, RULE_non_join_query_expression = 222, 
		RULE_query_term = 223, RULE_non_join_query_term = 224, RULE_query_primary = 225, 
		RULE_non_join_query_primary = 226, RULE_simple_table = 227, RULE_explicit_table = 228, 
		RULE_table_or_query_name = 229, RULE_table_name = 230, RULE_table_name_list = 231, 
		RULE_query_specification = 232, RULE_select_list = 233, RULE_select_sublist = 234, 
		RULE_derived_column = 235, RULE_qualified_asterisk = 236, RULE_set_qualifier = 237, 
		RULE_column_reference = 238, RULE_as_clause = 239, RULE_column_reference_list = 240, 
		RULE_scalar_subquery = 241, RULE_row_subquery = 242, RULE_table_subquery = 243, 
		RULE_subquery = 244, RULE_predicate = 245, RULE_custom_predicate = 246, 
		RULE_custom_operator = 247, RULE_postgis_operator = 248, RULE_comparison_predicate = 249, 
		RULE_comp_op = 250, RULE_type_comp_predicate = 251, RULE_between_predicate = 252, 
		RULE_between_predicate_part_2 = 253, RULE_in_predicate = 254, RULE_in_predicate_value = 255, 
		RULE_in_value_list = 256, RULE_pattern_matching_predicate = 257, RULE_pattern_matcher = 258, 
		RULE_negativable_matcher = 259, RULE_regex_matcher = 260, RULE_null_predicate = 261, 
		RULE_quantified_comparison_predicate = 262, RULE_quantifier = 263, RULE_all = 264, 
		RULE_some = 265, RULE_exists_predicate = 266, RULE_unique_predicate = 267, 
		RULE_distinct_from_predicate = 268, RULE_primary_datetime_field = 269, 
		RULE_non_second_primary_datetime_field = 270, RULE_extended_datetime_field = 271, 
		RULE_fetch_clause = 272, RULE_for_clause = 273, RULE_routine_invocation = 274, 
		RULE_function_names_for_reserved_words = 275, RULE_function_name = 276, 
		RULE_sql_argument_list = 277, RULE_sql_argument = 278, RULE_window_clause = 279, 
		RULE_window_definition = 280, RULE_frame_clause = 281, RULE_frame = 282, 
		RULE_offset_clause = 283, RULE_orderby_clause = 284, RULE_sort_specifier_list = 285, 
		RULE_sort_specifier = 286, RULE_order_specification = 287, RULE_limit_clause = 288, 
		RULE_null_ordering = 289;
	public static final String[] ruleNames = {
		"sql", "statement", "data_statement", "index_statement", "data_change_statement", 
		"schema_statement", "admin_statement", "transaction_statement", "cursor_statement", 
		"declare_statement", "fetch_statement", "move_statement", "close_statement", 
		"cursor_direction", "explain_statement", "explain_options", "explain_option", 
		"analyze_statement", "grant_statement", "revoke_statement", "grant_role_statement", 
		"role_name_list", "grant_object_statement", "grant_sequences_statement", 
		"grant_sequence_target", "grant_table_statement", "grant_table_target", 
		"set_statement", "set_property", "insert_statement", "insert_column_list", 
		"insert_values", "update_statement", "returning_statement", "return_expression", 
		"update_list", "update_per_column", "update_assignment", "update_value", 
		"update_value_list", "update_column_list", "delete_statement", "where_cursor_clause", 
		"create_index_statement", "index_column_list", "index_column", "create_view_statement", 
		"create_materialized_view_statement", "refresh_materialized_view_statement", 
		"create_sequence_statement", "create_table_statement", "normal_create_table", 
		"create_table_as_statement", "table_modifiers", "table_elements", "column_constraint", 
		"references_statement", "column_action", "table_constraint", "exclude_list", 
		"field_element", "field_type", "with_param_clause", "param", "method_specifier", 
		"reindex_statement", "alter_table_statement", "alter_table_action", "alter_table_add_column", 
		"alter_table_drop_column", "alter_table_alter_column", "alter_column_expression", 
		"alter_table_rename_column", "alter_table_add_constraint", "alter_table_drop_constraint", 
		"drop_table_statement", "drop_view_statement", "drop_index_statement", 
		"drop_sequence_statement", "truncate_statement", "truncate_target_list", 
		"cascade", "identifier", "nonreserved_keywords", "unsigned_literal", "general_literal", 
		"datetime_literal", "interval_literal", "interval_qualifier", "interval_precision", 
		"time_literal", "timestamp_literal", "date_literal", "boolean_literal", 
		"data_type", "udt", "postgis_type", "predefined_type", "array_type_qualifier", 
		"network_type", "character_string_type", "text_search_type", "type_length", 
		"national_character_string_type", "binary_large_object_string_type", "numeric_type", 
		"exact_numeric_type", "approximate_numeric_type", "precision_param", "boolean_type", 
		"datetime_type", "bit_type", "binary_type", "value_expression_primary", 
		"array_slice", "parenthesized_value_expression", "nonparenthesized_value_expression_primary", 
		"tuple_value", "collate_expression", "constant_value", "unsigned_value_specification", 
		"unsigned_numeric_literal", "signed_numerical_literal", "fix_unary_operator", 
		"array_constructor", "array_values", "set_function_specification", "aggregate_function", 
		"within_group", "set_function_type", "filter_clause", "grouping_operation", 
		"case_expression", "case_abbreviation", "case_specification", "simple_case", 
		"searched_case", "simple_when_clause", "searched_when_clause", "else_clause", 
		"result", "cast_specification", "cast_operand", "cast_target", "value_expression", 
		"common_value_expression", "row_values_list", "value_expression_list", 
		"numeric_value_expression", "term", "factor", "numeric_primary", "sign", 
		"numeric_value_function", "bit_position_function", "extract_expression", 
		"extract_field", "time_zone_field", "extract_source", "string_value_expression", 
		"character_value_expression", "character_primary", "string_value_function", 
		"substring_function", "trim_function", "trim_operands", "trim_specification", 
		"boolean_value_expression", "or_predicate", "and_predicate", "boolean_factor", 
		"boolean_test", "is_clause", "truth_value", "boolean_primary", "boolean_predicand", 
		"parenthesized_boolean_value_expression", "row_value_expression", "row_value_special_case", 
		"explicit_row_value_constructor", "row_value_predicand", "row_value_constructor_predicand", 
		"into_expression", "table_expression", "from_clause", "table_reference_list", 
		"table_reference", "table_alias", "joined_table", "joined_table_primary", 
		"cross_join", "qualified_join", "natural_join", "union_join", "join_type", 
		"outer_join_type", "outer_join_type_part2", "join_specification", "join_condition", 
		"named_columns_join", "table_primary", "schema_name", "column_name", "column_name_list", 
		"role_name", "derived_table", "where_clause", "search_condition", "groupby_clause", 
		"grouping_element_list", "grouping_element", "ordinary_grouping_set", 
		"ordinary_grouping_set_list", "rollup_list", "cube_list", "empty_grouping_set", 
		"having_clause", "row_value_predicand_list", "with_qualifier", "with_subquery", 
		"query_expression", "query_expression_body", "non_join_query_expression", 
		"query_term", "non_join_query_term", "query_primary", "non_join_query_primary", 
		"simple_table", "explicit_table", "table_or_query_name", "table_name", 
		"table_name_list", "query_specification", "select_list", "select_sublist", 
		"derived_column", "qualified_asterisk", "set_qualifier", "column_reference", 
		"as_clause", "column_reference_list", "scalar_subquery", "row_subquery", 
		"table_subquery", "subquery", "predicate", "custom_predicate", "custom_operator", 
		"postgis_operator", "comparison_predicate", "comp_op", "type_comp_predicate", 
		"between_predicate", "between_predicate_part_2", "in_predicate", "in_predicate_value", 
		"in_value_list", "pattern_matching_predicate", "pattern_matcher", "negativable_matcher", 
		"regex_matcher", "null_predicate", "quantified_comparison_predicate", 
		"quantifier", "all", "some", "exists_predicate", "unique_predicate", "distinct_from_predicate", 
		"primary_datetime_field", "non_second_primary_datetime_field", "extended_datetime_field", 
		"fetch_clause", "for_clause", "routine_invocation", "function_names_for_reserved_words", 
		"function_name", "sql_argument_list", "sql_argument", "window_clause", 
		"window_definition", "frame_clause", "frame", "offset_clause", "orderby_clause", 
		"sort_specifier_list", "sort_specifier", "order_specification", "limit_clause", 
		"null_ordering"
	};

	@Override
	public String getGrammarFileName() { return "SQLParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SqlContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON(int i) {
			return getToken(SQLParser.SEMI_COLON, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(SQLParser.SEMI_COLON); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(580); statement();
					setState(581); match(SEMI_COLON);
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(588); statement();
			setState(590);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(589); match(SEMI_COLON);
				}
			}

			setState(592); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Index_statementContext index_statement() {
			return getRuleContext(Index_statementContext.class,0);
		}
		public Schema_statementContext schema_statement() {
			return getRuleContext(Schema_statementContext.class,0);
		}
		public Data_change_statementContext data_change_statement() {
			return getRuleContext(Data_change_statementContext.class,0);
		}
		public Transaction_statementContext transaction_statement() {
			return getRuleContext(Transaction_statementContext.class,0);
		}
		public Admin_statementContext admin_statement() {
			return getRuleContext(Admin_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(601);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594); data_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595); data_change_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596); schema_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(597); index_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(598); admin_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(599); transaction_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(600); cursor_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_statementContext extends ParserRuleContext {
		public With_qualifierContext with_qualifier() {
			return getRuleContext(With_qualifierContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Row_values_listContext row_values_list() {
			return getRuleContext(Row_values_listContext.class,0);
		}
		public Data_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_statement; }
	}

	public final Data_statementContext data_statement() throws RecognitionException {
		Data_statementContext _localctx = new Data_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(603); with_qualifier();
				}
			}

			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(606); query_expression();
				}
				break;
			case 2:
				{
				setState(607); row_values_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_statementContext extends ParserRuleContext {
		public Drop_index_statementContext drop_index_statement() {
			return getRuleContext(Drop_index_statementContext.class,0);
		}
		public Create_index_statementContext create_index_statement() {
			return getRuleContext(Create_index_statementContext.class,0);
		}
		public Reindex_statementContext reindex_statement() {
			return getRuleContext(Reindex_statementContext.class,0);
		}
		public Index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_statement; }
	}

	public final Index_statementContext index_statement() throws RecognitionException {
		Index_statementContext _localctx = new Index_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_index_statement);
		try {
			setState(613);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); create_index_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); drop_index_statement();
				}
				break;
			case REINDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(612); reindex_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_change_statementContext extends ParserRuleContext {
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public With_qualifierContext with_qualifier() {
			return getRuleContext(With_qualifierContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Data_change_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_change_statement; }
	}

	public final Data_change_statementContext data_change_statement() throws RecognitionException {
		Data_change_statementContext _localctx = new Data_change_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data_change_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(615); with_qualifier();
				}
				break;
			}
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(618); insert_statement();
				}
				break;
			case 2:
				{
				setState(619); update_statement();
				}
				break;
			case 3:
				{
				setState(620); delete_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_statementContext extends ParserRuleContext {
		public Refresh_materialized_view_statementContext refresh_materialized_view_statement() {
			return getRuleContext(Refresh_materialized_view_statementContext.class,0);
		}
		public Drop_view_statementContext drop_view_statement() {
			return getRuleContext(Drop_view_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Create_sequence_statementContext create_sequence_statement() {
			return getRuleContext(Create_sequence_statementContext.class,0);
		}
		public Truncate_statementContext truncate_statement() {
			return getRuleContext(Truncate_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Create_materialized_view_statementContext create_materialized_view_statement() {
			return getRuleContext(Create_materialized_view_statementContext.class,0);
		}
		public Drop_sequence_statementContext drop_sequence_statement() {
			return getRuleContext(Drop_sequence_statementContext.class,0);
		}
		public Create_view_statementContext create_view_statement() {
			return getRuleContext(Create_view_statementContext.class,0);
		}
		public Schema_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_statement; }
	}

	public final Schema_statementContext schema_statement() throws RecognitionException {
		Schema_statementContext _localctx = new Schema_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_schema_statement);
		try {
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623); create_table_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624); create_view_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(625); create_materialized_view_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(626); create_sequence_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(627); drop_table_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(628); drop_view_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(629); drop_sequence_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(630); alter_table_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(631); refresh_materialized_view_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(632); truncate_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Admin_statementContext extends ParserRuleContext {
		public Analyze_statementContext analyze_statement() {
			return getRuleContext(Analyze_statementContext.class,0);
		}
		public Set_statementContext set_statement() {
			return getRuleContext(Set_statementContext.class,0);
		}
		public Revoke_statementContext revoke_statement() {
			return getRuleContext(Revoke_statementContext.class,0);
		}
		public Explain_statementContext explain_statement() {
			return getRuleContext(Explain_statementContext.class,0);
		}
		public Grant_statementContext grant_statement() {
			return getRuleContext(Grant_statementContext.class,0);
		}
		public Admin_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin_statement; }
	}

	public final Admin_statementContext admin_statement() throws RecognitionException {
		Admin_statementContext _localctx = new Admin_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_admin_statement);
		try {
			setState(640);
			switch (_input.LA(1)) {
			case GRANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); grant_statement();
				}
				break;
			case REVOKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(636); revoke_statement();
				}
				break;
			case EXPLAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(637); explain_statement();
				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(638); analyze_statement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(639); set_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_statementContext extends ParserRuleContext {
		public TerminalNode ABORT() { return getToken(SQLParser.ABORT, 0); }
		public TerminalNode RELEASE() { return getToken(SQLParser.RELEASE, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLParser.TRANSACTION, 0); }
		public TerminalNode ROLLBACK() { return getToken(SQLParser.ROLLBACK, 0); }
		public TerminalNode COMMIT() { return getToken(SQLParser.COMMIT, 0); }
		public TerminalNode SAVEPOINT() { return getToken(SQLParser.SAVEPOINT, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode BEGIN() { return getToken(SQLParser.BEGIN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END() { return getToken(SQLParser.END, 0); }
		public Transaction_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_statement; }
	}

	public final Transaction_statementContext transaction_statement() throws RecognitionException {
		Transaction_statementContext _localctx = new Transaction_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transaction_statement);
		int _la;
		try {
			setState(661);
			switch (_input.LA(1)) {
			case BEGIN:
			case COMMIT:
			case END:
			case ABORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << COMMIT) | (1L << END))) != 0) || _la==ABORT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(644);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(643); match(TRANSACTION);
					}
				}

				}
				break;
			case SAVEPOINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); match(SAVEPOINT);
				setState(647); identifier();
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(648); match(ROLLBACK);
				setState(654);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(649); match(TO);
					setState(651);
					_la = _input.LA(1);
					if (_la==SAVEPOINT) {
						{
						setState(650); match(SAVEPOINT);
						}
					}

					setState(653); identifier();
					}
				}

				}
				break;
			case RELEASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(656); match(RELEASE);
				setState(658);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(657); match(SAVEPOINT);
					}
				}

				setState(660); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_statementContext extends ParserRuleContext {
		public Move_statementContext move_statement() {
			return getRuleContext(Move_statementContext.class,0);
		}
		public Fetch_statementContext fetch_statement() {
			return getRuleContext(Fetch_statementContext.class,0);
		}
		public Close_statementContext close_statement() {
			return getRuleContext(Close_statementContext.class,0);
		}
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Cursor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_statement; }
	}

	public final Cursor_statementContext cursor_statement() throws RecognitionException {
		Cursor_statementContext _localctx = new Cursor_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cursor_statement);
		try {
			setState(667);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(663); declare_statement();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(664); fetch_statement();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(665); move_statement();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(666); close_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_statementContext extends ParserRuleContext {
		public IdentifierContext cursor_name;
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode INSENSITIVE() { return getToken(SQLParser.INSENSITIVE, 0); }
		public TerminalNode SCROLL() { return getToken(SQLParser.SCROLL, 0); }
		public TerminalNode CURSOR() { return getToken(SQLParser.CURSOR, 0); }
		public TerminalNode HOLD() { return getToken(SQLParser.HOLD, 0); }
		public TerminalNode FOR() { return getToken(SQLParser.FOR, 0); }
		public TerminalNode DECLARE() { return getToken(SQLParser.DECLARE, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(SQLParser.WITHOUT, 0); }
		public TerminalNode BINARY() { return getToken(SQLParser.BINARY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); match(DECLARE);
			setState(670); ((Declare_statementContext)_localctx).cursor_name = identifier();
			setState(672);
			_la = _input.LA(1);
			if (_la==BINARY) {
				{
				setState(671); match(BINARY);
				}
			}

			setState(675);
			_la = _input.LA(1);
			if (_la==INSENSITIVE) {
				{
				setState(674); match(INSENSITIVE);
				}
			}

			setState(681);
			_la = _input.LA(1);
			if (_la==NO || _la==SCROLL) {
				{
				setState(678);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(677); match(NO);
					}
				}

				setState(680); match(SCROLL);
				}
			}

			setState(683); match(CURSOR);
			setState(686);
			_la = _input.LA(1);
			if (_la==WITH || _la==WITHOUT) {
				{
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(685); match(HOLD);
				}
			}

			setState(688); match(FOR);
			setState(689); data_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_statementContext extends ParserRuleContext {
		public IdentifierContext cursor_name;
		public Cursor_directionContext cursor_direction() {
			return getRuleContext(Cursor_directionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FETCH() { return getToken(SQLParser.FETCH, 0); }
		public Fetch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_statement; }
	}

	public final Fetch_statementContext fetch_statement() throws RecognitionException {
		Fetch_statementContext _localctx = new Fetch_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fetch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691); match(FETCH);
			setState(693);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(692); cursor_direction();
				}
				break;
			}
			setState(695); ((Fetch_statementContext)_localctx).cursor_name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_statementContext extends ParserRuleContext {
		public IdentifierContext cursor_name;
		public TerminalNode MOVE() { return getToken(SQLParser.MOVE, 0); }
		public Cursor_directionContext cursor_direction() {
			return getRuleContext(Cursor_directionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Move_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_statement; }
	}

	public final Move_statementContext move_statement() throws RecognitionException {
		Move_statementContext _localctx = new Move_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_move_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(MOVE);
			setState(699);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(698); cursor_direction();
				}
				break;
			}
			setState(701); ((Move_statementContext)_localctx).cursor_name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_statementContext extends ParserRuleContext {
		public IdentifierContext cursor_name;
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode CLOSE() { return getToken(SQLParser.CLOSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Close_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_statement; }
	}

	public final Close_statementContext close_statement() throws RecognitionException {
		Close_statementContext _localctx = new Close_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_close_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); match(CLOSE);
			setState(706);
			switch (_input.LA(1)) {
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				{
				setState(704); ((Close_statementContext)_localctx).cursor_name = identifier();
				}
				break;
			case ALL:
				{
				setState(705); match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_directionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode NEXT() { return getToken(SQLParser.NEXT, 0); }
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode FORWARD() { return getToken(SQLParser.FORWARD, 0); }
		public TerminalNode ABSOLUTE() { return getToken(SQLParser.ABSOLUTE, 0); }
		public TerminalNode PRIOR() { return getToken(SQLParser.PRIOR, 0); }
		public Signed_numerical_literalContext signed_numerical_literal() {
			return getRuleContext(Signed_numerical_literalContext.class,0);
		}
		public TerminalNode BACKWARD() { return getToken(SQLParser.BACKWARD, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode RELATIVE() { return getToken(SQLParser.RELATIVE, 0); }
		public TerminalNode LAST() { return getToken(SQLParser.LAST, 0); }
		public Cursor_directionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_direction; }
	}

	public final Cursor_directionContext cursor_direction() throws RecognitionException {
		Cursor_directionContext _localctx = new Cursor_directionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cursor_direction);
		int _la;
		try {
			setState(723);
			switch (_input.LA(1)) {
			case ALL:
			case ABSOLUTE:
			case BACKWARD:
			case FIRST:
			case FORWARD:
			case LAST:
			case NEXT:
			case PRIOR:
			case RELATIVE:
			case PLUS:
			case MINUS:
			case NUMBER:
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				switch (_input.LA(1)) {
				case ALL:
				case FIRST:
				case LAST:
				case NEXT:
				case PRIOR:
					{
					setState(708);
					_la = _input.LA(1);
					if ( !(_la==ALL || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (FIRST - 128)) | (1L << (LAST - 128)) | (1L << (NEXT - 128)))) != 0) || _la==PRIOR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case BACKWARD:
				case FORWARD:
					{
					setState(709);
					_la = _input.LA(1);
					if ( !(_la==BACKWARD || _la==FORWARD) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(712);
					switch (_input.LA(1)) {
					case PLUS:
					case MINUS:
					case NUMBER:
					case REAL_NUMBER:
						{
						setState(710); signed_numerical_literal();
						}
						break;
					case ALL:
						{
						setState(711); match(ALL);
						}
						break;
					case FROM:
					case IN:
					case ANALYZE:
					case AVG:
					case BETWEEN:
					case BY:
					case CASCADE:
					case CENTURY:
					case CHARACTER:
					case COLLECT:
					case COALESCE:
					case COLUMN:
					case COUNT:
					case CUBE:
					case CURSOR:
					case CYCLE:
					case DATA:
					case DAY:
					case DEC:
					case DECADE:
					case DOW:
					case DOY:
					case DROP:
					case EPOCH:
					case EVERY:
					case EXTERNAL:
					case EXTRACT:
					case FILTER:
					case FIRST:
					case FOLLOWING:
					case FORMAT:
					case FUSION:
					case GROUPING:
					case HASH:
					case HOUR:
					case INDEX:
					case INSERT:
					case INTERSECTION:
					case ISODOW:
					case ISOYEAR:
					case KEY:
					case LAST:
					case LESS:
					case LIST:
					case LOCATION:
					case MAX:
					case MAXVALUE:
					case MICROSECONDS:
					case MILLENNIUM:
					case MILLISECONDS:
					case MIN:
					case MINUTE:
					case MONTH:
					case NATIONAL:
					case NULLIF:
					case ONLY:
					case OVERWRITE:
					case PARTITION:
					case PARTITIONS:
					case PRECEDING:
					case PRECISION:
					case QUARTER:
					case RANGE:
					case RECURSIVE:
					case REGEXP:
					case REPLACE:
					case RESTRICT:
					case RETURNING:
					case RLIKE:
					case ROLLUP:
					case ROWS:
					case SCHEMA:
					case SECOND:
					case SEQUENCE:
					case SEQUENCES:
					case SET:
					case SIMILAR:
					case STDDEV_POP:
					case STDDEV_SAMP:
					case SUBPARTITION:
					case SUM:
					case TABLES:
					case TABLESPACE:
					case THAN:
					case TIMEZONE:
					case TIMEZONE_HOUR:
					case TIMEZONE_MINUTE:
					case TRIM:
					case TO:
					case TYPE:
					case UNBOUNDED:
					case UNKNOWN:
					case USAGE:
					case VAR_SAMP:
					case VAR_POP:
					case VARYING:
					case VERBOSE:
					case WEEK:
					case WINDOW:
					case YEAR:
					case ZONE:
					case BOOLEAN:
					case BOOL:
					case BIT:
					case VARBIT:
					case INT1:
					case INT2:
					case INT4:
					case INT8:
					case TINYINT:
					case SMALLINT:
					case INT:
					case INTEGER:
					case BIGINT:
					case FLOAT4:
					case FLOAT8:
					case REAL:
					case FLOAT:
					case DOUBLE:
					case NUMERIC:
					case DECIMAL:
					case CHAR:
					case VARCHAR:
					case NCHAR:
					case NVARCHAR:
					case DATE:
					case INTERVAL:
					case TIME:
					case TIMETZ:
					case TIMESTAMP:
					case TIMESTAMPTZ:
					case TEXT:
					case VARBINARY:
					case BLOB:
					case BYTEA:
					case INET4:
					case IDENTIFIER:
					case QUOTED_IDENTIFIER:
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case ABSOLUTE:
				case RELATIVE:
					{
					setState(714);
					_la = _input.LA(1);
					if ( !(_la==ABSOLUTE || _la==RELATIVE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(715); signed_numerical_literal();
					}
					break;
				case PLUS:
				case MINUS:
				case NUMBER:
				case REAL_NUMBER:
					{
					setState(716); signed_numerical_literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(720);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(719);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				break;
			case FROM:
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explain_statementContext extends ParserRuleContext {
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Explain_optionsContext explain_options() {
			return getRuleContext(Explain_optionsContext.class,0);
		}
		public Schema_statementContext schema_statement() {
			return getRuleContext(Schema_statementContext.class,0);
		}
		public TerminalNode EXPLAIN() { return getToken(SQLParser.EXPLAIN, 0); }
		public Data_change_statementContext data_change_statement() {
			return getRuleContext(Data_change_statementContext.class,0);
		}
		public Explain_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain_statement; }
	}

	public final Explain_statementContext explain_statement() throws RecognitionException {
		Explain_statementContext _localctx = new Explain_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_explain_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725); match(EXPLAIN);
			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(726); explain_options();
				}
				break;
			}
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(729); data_statement();
				}
				break;
			case 2:
				{
				setState(730); data_change_statement();
				}
				break;
			case 3:
				{
				setState(731); schema_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explain_optionsContext extends ParserRuleContext {
		public List<TerminalNode> VERBOSE() { return getTokens(SQLParser.VERBOSE); }
		public List<TerminalNode> ANALYZE() { return getTokens(SQLParser.ANALYZE); }
		public TerminalNode VERBOSE(int i) {
			return getToken(SQLParser.VERBOSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Explain_optionContext explain_option(int i) {
			return getRuleContext(Explain_optionContext.class,i);
		}
		public List<Explain_optionContext> explain_option() {
			return getRuleContexts(Explain_optionContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode ANALYZE(int i) {
			return getToken(SQLParser.ANALYZE, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Explain_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain_options; }
	}

	public final Explain_optionsContext explain_options() throws RecognitionException {
		Explain_optionsContext _localctx = new Explain_optionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_explain_options);
		int _la;
		try {
			int _alt;
			setState(751);
			switch (_input.LA(1)) {
			case ANALYZE:
			case VERBOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(734);
						_la = _input.LA(1);
						if ( !(_la==ANALYZE || _la==VERBOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(737); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(739); match(LEFT_PAREN);
				setState(748);
				_la = _input.LA(1);
				if (_la==ANALYZE || _la==COSTS || _la==VERBOSE) {
					{
					setState(740); explain_option();
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(741); match(COMMA);
						setState(742); explain_option();
						}
						}
						setState(747);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(750); match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explain_optionContext extends ParserRuleContext {
		public TerminalNode OFF() { return getToken(SQLParser.OFF, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode VERBOSE() { return getToken(SQLParser.VERBOSE, 0); }
		public TerminalNode ANALYZE() { return getToken(SQLParser.ANALYZE, 0); }
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public TerminalNode COSTS() { return getToken(SQLParser.COSTS, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public Explain_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain_option; }
	}

	public final Explain_optionContext explain_option() throws RecognitionException {
		Explain_optionContext _localctx = new Explain_optionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_explain_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==ANALYZE || _la==COSTS || _la==VERBOSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(755);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (FALSE - 24)) | (1L << (OFF - 24)) | (1L << (ON - 24)) | (1L << (TRUE - 24)))) != 0) || _la==NUMBER) {
				{
				setState(754);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (FALSE - 24)) | (1L << (OFF - 24)) | (1L << (ON - 24)) | (1L << (TRUE - 24)))) != 0) || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_statementContext extends ParserRuleContext {
		public TerminalNode VERBOSE() { return getToken(SQLParser.VERBOSE, 0); }
		public TerminalNode ANALYZE() { return getToken(SQLParser.ANALYZE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Analyze_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_statement; }
	}

	public final Analyze_statementContext analyze_statement() throws RecognitionException {
		Analyze_statementContext _localctx = new Analyze_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_analyze_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); match(ANALYZE);
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(758); match(VERBOSE);
				}
				break;
			}
			setState(761); table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_statementContext extends ParserRuleContext {
		public Grant_object_statementContext grant_object_statement() {
			return getRuleContext(Grant_object_statementContext.class,0);
		}
		public List<TerminalNode> GRANT() { return getTokens(SQLParser.GRANT); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public Grant_role_statementContext grant_role_statement() {
			return getRuleContext(Grant_role_statementContext.class,0);
		}
		public TerminalNode OPTION() { return getToken(SQLParser.OPTION, 0); }
		public TerminalNode GRANT(int i) {
			return getToken(SQLParser.GRANT, i);
		}
		public Grant_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_statement; }
	}

	public final Grant_statementContext grant_statement() throws RecognitionException {
		Grant_statementContext _localctx = new Grant_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_grant_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); match(GRANT);
			setState(766);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(764); grant_role_statement();
				}
				break;
			case 2:
				{
				setState(765); grant_object_statement();
				}
				break;
			}
			setState(771);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(768); match(WITH);
				setState(769); match(GRANT);
				setState(770); match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Revoke_statementContext extends ParserRuleContext {
		public List<Role_name_listContext> role_name_list() {
			return getRuleContexts(Role_name_listContext.class);
		}
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public Role_name_listContext role_name_list(int i) {
			return getRuleContext(Role_name_listContext.class,i);
		}
		public TerminalNode TABLES() { return getToken(SQLParser.TABLES, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SQLParser.REVOKE, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(SQLParser.CASCADE, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode FOR() { return getToken(SQLParser.FOR, 0); }
		public TerminalNode GRANT() { return getToken(SQLParser.GRANT, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode OPTION() { return getToken(SQLParser.OPTION, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public Revoke_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke_statement; }
	}

	public final Revoke_statementContext revoke_statement() throws RecognitionException {
		Revoke_statementContext _localctx = new Revoke_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_revoke_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); match(REVOKE);
			setState(777);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(774); match(GRANT);
				setState(775); match(OPTION);
				setState(776); match(FOR);
				}
			}

			setState(779); role_name_list();
			setState(780); match(ON);
			setState(790);
			switch (_input.LA(1)) {
			case TABLE:
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				{
				setState(782);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(781); match(TABLE);
					}
				}

				setState(784); table_name_list();
				}
				break;
			case ALL:
				{
				setState(785); match(ALL);
				setState(786); match(TABLES);
				setState(787); match(IN);
				setState(788); match(SCHEMA);
				setState(789); schema_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(792); match(FROM);
			setState(794);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(793); match(GROUP);
				}
			}

			setState(796); role_name_list();
			setState(798);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(797);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_role_statementContext extends ParserRuleContext {
		public List<Role_name_listContext> role_name_list() {
			return getRuleContexts(Role_name_listContext.class);
		}
		public Role_name_listContext role_name_list(int i) {
			return getRuleContext(Role_name_listContext.class,i);
		}
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public Grant_role_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_role_statement; }
	}

	public final Grant_role_statementContext grant_role_statement() throws RecognitionException {
		Grant_role_statementContext _localctx = new Grant_role_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_grant_role_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800); role_name_list();
			setState(801); match(TO);
			setState(802); role_name_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Role_name_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Role_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_name_list; }
	}

	public final Role_name_listContext role_name_list() throws RecognitionException {
		Role_name_listContext _localctx = new Role_name_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_role_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804); identifier();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(805); match(COMMA);
				setState(806); identifier();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_object_statementContext extends ParserRuleContext {
		public Grant_table_statementContext grant_table_statement() {
			return getRuleContext(Grant_table_statementContext.class,0);
		}
		public Grant_sequences_statementContext grant_sequences_statement() {
			return getRuleContext(Grant_sequences_statementContext.class,0);
		}
		public Grant_object_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_object_statement; }
	}

	public final Grant_object_statementContext grant_object_statement() throws RecognitionException {
		Grant_object_statementContext _localctx = new Grant_object_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_grant_object_statement);
		try {
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812); grant_table_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813); grant_sequences_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_sequences_statementContext extends ParserRuleContext {
		public IdentifierContext sequence;
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public List<Grant_sequence_targetContext> grant_sequence_target() {
			return getRuleContexts(Grant_sequence_targetContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLParser.SEQUENCE, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Role_nameContext role_name() {
			return getRuleContext(Role_nameContext.class,0);
		}
		public Grant_sequence_targetContext grant_sequence_target(int i) {
			return getRuleContext(Grant_sequence_targetContext.class,i);
		}
		public TerminalNode PRIVILEGES() { return getToken(SQLParser.PRIVILEGES, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public TerminalNode SEQUENCES() { return getToken(SQLParser.SEQUENCES, 0); }
		public Grant_sequences_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_sequences_statement; }
	}

	public final Grant_sequences_statementContext grant_sequences_statement() throws RecognitionException {
		Grant_sequences_statementContext _localctx = new Grant_sequences_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_grant_sequences_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			switch (_input.LA(1)) {
			case SELECT:
			case UPDATE:
			case USAGE:
				{
				setState(816); grant_sequence_target();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(817); match(COMMA);
					setState(818); grant_sequence_target();
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ALL:
				{
				setState(824); match(ALL);
				setState(826);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(825); match(PRIVILEGES);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(830); match(ON);
			setState(838);
			switch (_input.LA(1)) {
			case SEQUENCE:
				{
				setState(831); match(SEQUENCE);
				setState(832); ((Grant_sequences_statementContext)_localctx).sequence = identifier();
				}
				break;
			case ALL:
				{
				setState(833); match(ALL);
				setState(834); match(SEQUENCES);
				setState(835); match(IN);
				setState(836); match(SCHEMA);
				setState(837); schema_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(840); match(TO);
			setState(842);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(841); match(GROUP);
				}
			}

			setState(844); role_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_sequence_targetContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode USAGE() { return getToken(SQLParser.USAGE, 0); }
		public Grant_sequence_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_sequence_target; }
	}

	public final Grant_sequence_targetContext grant_sequence_target() throws RecognitionException {
		Grant_sequence_targetContext _localctx = new Grant_sequence_targetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_grant_sequence_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(_la==SELECT || _la==UPDATE || _la==USAGE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_table_statementContext extends ParserRuleContext {
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
		public List<Grant_table_targetContext> grant_table_target() {
			return getRuleContexts(Grant_table_targetContext.class);
		}
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public Grant_table_targetContext grant_table_target(int i) {
			return getRuleContext(Grant_table_targetContext.class,i);
		}
		public TerminalNode TABLES() { return getToken(SQLParser.TABLES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Role_nameContext role_name() {
			return getRuleContext(Role_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SQLParser.PRIVILEGES, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public Grant_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_table_statement; }
	}

	public final Grant_table_statementContext grant_table_statement() throws RecognitionException {
		Grant_table_statementContext _localctx = new Grant_table_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_grant_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			switch (_input.LA(1)) {
			case DELETE:
			case SELECT:
			case TRUNCATE:
			case UPDATE:
			case INSERT:
				{
				{
				setState(848); grant_table_target();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(849); match(COMMA);
					setState(850); grant_table_target();
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ALL:
				{
				setState(856); match(ALL);
				setState(858);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(857); match(PRIVILEGES);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(862); match(ON);
			setState(872);
			switch (_input.LA(1)) {
			case TABLE:
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				{
				{
				setState(864);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(863); match(TABLE);
					}
				}

				setState(866); table_name_list();
				}
				}
				break;
			case ALL:
				{
				{
				setState(867); match(ALL);
				setState(868); match(TABLES);
				setState(869); match(IN);
				setState(870); match(SCHEMA);
				setState(871); schema_name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(874); match(TO);
			setState(876);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(875); match(GROUP);
				}
			}

			setState(878); role_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_table_targetContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode TRUNCATE() { return getToken(SQLParser.TRUNCATE, 0); }
		public Grant_table_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_table_target; }
	}

	public final Grant_table_targetContext grant_table_target() throws RecognitionException {
		Grant_table_targetContext _localctx = new Grant_table_targetContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_grant_table_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (DELETE - 17)) | (1L << (SELECT - 17)) | (1L << (TRUNCATE - 17)) | (1L << (UPDATE - 17)))) != 0) || _la==INSERT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_statementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public Set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statement; }
	}

	public final Set_statementContext set_statement() throws RecognitionException {
		Set_statementContext _localctx = new Set_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_set_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882); match(SET);
			setState(883); set_property();
			setState(884); match(EQUAL);
			setState(885); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_propertyContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Set_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_property; }
	}

	public final Set_propertyContext set_property() throws RecognitionException {
		Set_propertyContext _localctx = new Set_propertyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_set_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887); identifier();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(888); match(DOT);
				setState(889); identifier();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Returning_statementContext returning_statement() {
			return getRuleContext(Returning_statementContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Insert_valuesContext insert_values() {
			return getRuleContext(Insert_valuesContext.class,0);
		}
		public TerminalNode OVERWRITE() { return getToken(SQLParser.OVERWRITE, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Insert_column_listContext insert_column_list() {
			return getRuleContext(Insert_column_listContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(895); data_statement();
				}
				break;
			}
			setState(898); match(INSERT);
			setState(900);
			_la = _input.LA(1);
			if (_la==OVERWRITE) {
				{
				setState(899); match(OVERWRITE);
				}
			}

			setState(902); match(INTO);
			setState(903); table_name();
			setState(908);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(904); match(LEFT_PAREN);
				setState(905); insert_column_list();
				setState(906); match(RIGHT_PAREN);
				}
				break;
			}
			setState(910); insert_values();
			setState(912);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(911); returning_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_column_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Column_referenceContext column_reference(int i) {
			return getRuleContext(Column_referenceContext.class,i);
		}
		public List<Column_referenceContext> column_reference() {
			return getRuleContexts(Column_referenceContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_column_list; }
	}

	public final Insert_column_listContext insert_column_list() throws RecognitionException {
		Insert_column_listContext _localctx = new Insert_column_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insert_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914); column_reference();
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(915); match(COMMA);
				setState(916); column_reference();
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_valuesContext extends ParserRuleContext {
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public Row_values_listContext row_values_list() {
			return getRuleContext(Row_values_listContext.class,0);
		}
		public Insert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_values; }
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_insert_values);
		try {
			setState(926);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922); match(DEFAULT);
				setState(923); match(VALUES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924); row_values_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(925); data_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public IdentifierContext alias;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public Returning_statementContext returning_statement() {
			return getRuleContext(Returning_statementContext.class,0);
		}
		public List<Update_listContext> update_list() {
			return getRuleContexts(Update_listContext.class);
		}
		public Qualified_asteriskContext qualified_asterisk() {
			return getRuleContext(Qualified_asteriskContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Update_listContext update_list(int i) {
			return getRuleContext(Update_listContext.class,i);
		}
		public Where_cursor_clauseContext where_cursor_clause() {
			return getRuleContext(Where_cursor_clauseContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Table_reference_listContext table_reference_list() {
			return getRuleContext(Table_reference_listContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode ONLY() { return getToken(SQLParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (SELECT - 59)) | (1L << (VALUES - 59)) | (1L << (WITH - 59)) | (1L << (ANALYZE - 59)) | (1L << (AVG - 59)) | (1L << (BETWEEN - 59)) | (1L << (BY - 59)) | (1L << (CASCADE - 59)) | (1L << (CENTURY - 59)) | (1L << (CHARACTER - 59)) | (1L << (COLLECT - 59)) | (1L << (COALESCE - 59)) | (1L << (COLUMN - 59)) | (1L << (COUNT - 59)) | (1L << (CUBE - 59)) | (1L << (CURSOR - 59)) | (1L << (CYCLE - 59)) | (1L << (DATA - 59)) | (1L << (DAY - 59)) | (1L << (DEC - 59)) | (1L << (DECADE - 59)) | (1L << (DOW - 59)) | (1L << (DOY - 59)) | (1L << (DROP - 59)) | (1L << (EPOCH - 59)) | (1L << (EVERY - 59)))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (EXTERNAL - 125)) | (1L << (EXTRACT - 125)) | (1L << (FILTER - 125)) | (1L << (FIRST - 125)) | (1L << (FOLLOWING - 125)) | (1L << (FORMAT - 125)) | (1L << (FUSION - 125)) | (1L << (GROUPING - 125)) | (1L << (HASH - 125)) | (1L << (HOUR - 125)) | (1L << (INDEX - 125)) | (1L << (INSERT - 125)) | (1L << (INTERSECTION - 125)) | (1L << (ISODOW - 125)) | (1L << (ISOYEAR - 125)) | (1L << (KEY - 125)) | (1L << (LAST - 125)) | (1L << (LATERAL - 125)) | (1L << (LESS - 125)) | (1L << (LIST - 125)) | (1L << (LOCATION - 125)) | (1L << (MAX - 125)) | (1L << (MAXVALUE - 125)) | (1L << (MICROSECONDS - 125)) | (1L << (MILLENNIUM - 125)) | (1L << (MILLISECONDS - 125)) | (1L << (MIN - 125)) | (1L << (MINUTE - 125)) | (1L << (MONTH - 125)) | (1L << (NATIONAL - 125)) | (1L << (NULLIF - 125)) | (1L << (ONLY - 125)) | (1L << (OVERWRITE - 125)) | (1L << (PARTITION - 125)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (PARTITIONS - 189)) | (1L << (PRECEDING - 189)) | (1L << (PRECISION - 189)) | (1L << (QUARTER - 189)) | (1L << (RANGE - 189)) | (1L << (RECURSIVE - 189)) | (1L << (REGEXP - 189)) | (1L << (REPLACE - 189)) | (1L << (RESTRICT - 189)) | (1L << (RETURNING - 189)) | (1L << (RLIKE - 189)) | (1L << (ROLLUP - 189)) | (1L << (ROWS - 189)) | (1L << (SCHEMA - 189)) | (1L << (SECOND - 189)) | (1L << (SEQUENCE - 189)) | (1L << (SEQUENCES - 189)) | (1L << (SET - 189)) | (1L << (SIMILAR - 189)) | (1L << (STDDEV_POP - 189)) | (1L << (STDDEV_SAMP - 189)) | (1L << (SUBPARTITION - 189)) | (1L << (SUM - 189)) | (1L << (TABLES - 189)) | (1L << (TABLESPACE - 189)) | (1L << (THAN - 189)) | (1L << (TIMEZONE - 189)) | (1L << (TIMEZONE_HOUR - 189)) | (1L << (TIMEZONE_MINUTE - 189)) | (1L << (TRIM - 189)) | (1L << (TO - 189)) | (1L << (TYPE - 189)) | (1L << (UNBOUNDED - 189)) | (1L << (UNKNOWN - 189)) | (1L << (USAGE - 189)) | (1L << (VAR_SAMP - 189)) | (1L << (VAR_POP - 189)) | (1L << (VARYING - 189)))) != 0) || ((((_la - 253)) & ~0x3f) == 0 && ((1L << (_la - 253)) & ((1L << (VERBOSE - 253)) | (1L << (WEEK - 253)) | (1L << (WINDOW - 253)) | (1L << (YEAR - 253)) | (1L << (ZONE - 253)) | (1L << (BOOLEAN - 253)) | (1L << (BOOL - 253)) | (1L << (BIT - 253)) | (1L << (VARBIT - 253)) | (1L << (INT1 - 253)) | (1L << (INT2 - 253)) | (1L << (INT4 - 253)) | (1L << (INT8 - 253)) | (1L << (TINYINT - 253)) | (1L << (SMALLINT - 253)) | (1L << (INT - 253)) | (1L << (INTEGER - 253)) | (1L << (BIGINT - 253)) | (1L << (FLOAT4 - 253)) | (1L << (FLOAT8 - 253)) | (1L << (REAL - 253)) | (1L << (FLOAT - 253)) | (1L << (DOUBLE - 253)) | (1L << (NUMERIC - 253)) | (1L << (DECIMAL - 253)) | (1L << (CHAR - 253)) | (1L << (VARCHAR - 253)) | (1L << (NCHAR - 253)) | (1L << (NVARCHAR - 253)) | (1L << (DATE - 253)) | (1L << (INTERVAL - 253)) | (1L << (TIME - 253)) | (1L << (TIMETZ - 253)) | (1L << (TIMESTAMP - 253)) | (1L << (TIMESTAMPTZ - 253)) | (1L << (TEXT - 253)) | (1L << (VARBINARY - 253)) | (1L << (BLOB - 253)) | (1L << (BYTEA - 253)) | (1L << (INET4 - 253)) | (1L << (LEFT_PAREN - 253)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(928); data_statement();
				}
			}

			setState(931); match(UPDATE);
			setState(933);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(932); match(ONLY);
				}
				break;
			}
			setState(935); table_name();
			setState(937);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(936); qualified_asterisk();
				}
				break;
			}
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(940);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(939); match(AS);
					}
				}

				setState(942); ((Update_statementContext)_localctx).alias = identifier();
				}
				break;
			}
			setState(945); match(SET);
			setState(946); update_list();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(947); match(COMMA);
				setState(948); update_list();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(954); match(FROM);
				setState(955); table_reference_list();
				}
			}

			setState(959);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(958); where_cursor_clause();
				}
			}

			setState(962);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(961); returning_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Returning_statementContext extends ParserRuleContext {
		public Return_expressionContext return_expression(int i) {
			return getRuleContext(Return_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Return_expressionContext> return_expression() {
			return getRuleContexts(Return_expressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode RETURNING() { return getToken(SQLParser.RETURNING, 0); }
		public Returning_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_statement; }
	}

	public final Returning_statementContext returning_statement() throws RecognitionException {
		Returning_statementContext _localctx = new Returning_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returning_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(RETURNING);
			setState(965); return_expression();
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(966); match(COMMA);
				setState(967); return_expression();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_expressionContext extends ParserRuleContext {
		public IdentifierContext alias;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Qualified_asteriskContext qualified_asterisk() {
			return getRuleContext(Qualified_asteriskContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Return_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expression; }
	}

	public final Return_expressionContext return_expression() throws RecognitionException {
		Return_expressionContext _localctx = new Return_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_return_expression);
		int _la;
		try {
			setState(981);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973); value_expression();
				setState(978);
				_la = _input.LA(1);
				if (_la==AS || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ANALYZE - 80)) | (1L << (AVG - 80)) | (1L << (BETWEEN - 80)) | (1L << (BY - 80)) | (1L << (CASCADE - 80)) | (1L << (CENTURY - 80)) | (1L << (CHARACTER - 80)) | (1L << (COLLECT - 80)) | (1L << (COALESCE - 80)) | (1L << (COLUMN - 80)) | (1L << (COUNT - 80)) | (1L << (CUBE - 80)) | (1L << (CURSOR - 80)) | (1L << (CYCLE - 80)) | (1L << (DATA - 80)) | (1L << (DAY - 80)) | (1L << (DEC - 80)) | (1L << (DECADE - 80)) | (1L << (DOW - 80)) | (1L << (DOY - 80)) | (1L << (DROP - 80)) | (1L << (EPOCH - 80)) | (1L << (EVERY - 80)) | (1L << (EXTERNAL - 80)) | (1L << (EXTRACT - 80)) | (1L << (FILTER - 80)) | (1L << (FIRST - 80)) | (1L << (FOLLOWING - 80)) | (1L << (FORMAT - 80)) | (1L << (FUSION - 80)) | (1L << (GROUPING - 80)) | (1L << (HASH - 80)) | (1L << (HOUR - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (INDEX - 144)) | (1L << (INSERT - 144)) | (1L << (INTERSECTION - 144)) | (1L << (ISODOW - 144)) | (1L << (ISOYEAR - 144)) | (1L << (KEY - 144)) | (1L << (LAST - 144)) | (1L << (LESS - 144)) | (1L << (LIST - 144)) | (1L << (LOCATION - 144)) | (1L << (MAX - 144)) | (1L << (MAXVALUE - 144)) | (1L << (MICROSECONDS - 144)) | (1L << (MILLENNIUM - 144)) | (1L << (MILLISECONDS - 144)) | (1L << (MIN - 144)) | (1L << (MINUTE - 144)) | (1L << (MONTH - 144)) | (1L << (NATIONAL - 144)) | (1L << (NULLIF - 144)) | (1L << (ONLY - 144)) | (1L << (OVERWRITE - 144)) | (1L << (PARTITION - 144)) | (1L << (PARTITIONS - 144)) | (1L << (PRECEDING - 144)) | (1L << (PRECISION - 144)) | (1L << (QUARTER - 144)) | (1L << (RANGE - 144)) | (1L << (RECURSIVE - 144)) | (1L << (REGEXP - 144)) | (1L << (REPLACE - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (RESTRICT - 208)) | (1L << (RETURNING - 208)) | (1L << (RLIKE - 208)) | (1L << (ROLLUP - 208)) | (1L << (ROWS - 208)) | (1L << (SCHEMA - 208)) | (1L << (SECOND - 208)) | (1L << (SEQUENCE - 208)) | (1L << (SEQUENCES - 208)) | (1L << (SET - 208)) | (1L << (SIMILAR - 208)) | (1L << (STDDEV_POP - 208)) | (1L << (STDDEV_SAMP - 208)) | (1L << (SUBPARTITION - 208)) | (1L << (SUM - 208)) | (1L << (TABLES - 208)) | (1L << (TABLESPACE - 208)) | (1L << (THAN - 208)) | (1L << (TIMEZONE - 208)) | (1L << (TIMEZONE_HOUR - 208)) | (1L << (TIMEZONE_MINUTE - 208)) | (1L << (TRIM - 208)) | (1L << (TO - 208)) | (1L << (TYPE - 208)) | (1L << (UNBOUNDED - 208)) | (1L << (UNKNOWN - 208)) | (1L << (USAGE - 208)) | (1L << (VAR_SAMP - 208)) | (1L << (VAR_POP - 208)) | (1L << (VARYING - 208)) | (1L << (VERBOSE - 208)) | (1L << (WEEK - 208)) | (1L << (WINDOW - 208)) | (1L << (YEAR - 208)) | (1L << (ZONE - 208)) | (1L << (BOOLEAN - 208)) | (1L << (BOOL - 208)) | (1L << (BIT - 208)) | (1L << (VARBIT - 208)) | (1L << (INT1 - 208)) | (1L << (INT2 - 208)) | (1L << (INT4 - 208)) | (1L << (INT8 - 208)) | (1L << (TINYINT - 208)) | (1L << (SMALLINT - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (BIGINT - 272)) | (1L << (FLOAT4 - 272)) | (1L << (FLOAT8 - 272)) | (1L << (REAL - 272)) | (1L << (FLOAT - 272)) | (1L << (DOUBLE - 272)) | (1L << (NUMERIC - 272)) | (1L << (DECIMAL - 272)) | (1L << (CHAR - 272)) | (1L << (VARCHAR - 272)) | (1L << (NCHAR - 272)) | (1L << (NVARCHAR - 272)) | (1L << (DATE - 272)) | (1L << (INTERVAL - 272)) | (1L << (TIME - 272)) | (1L << (TIMETZ - 272)) | (1L << (TIMESTAMP - 272)) | (1L << (TIMESTAMPTZ - 272)) | (1L << (TEXT - 272)) | (1L << (VARBINARY - 272)) | (1L << (BLOB - 272)) | (1L << (BYTEA - 272)) | (1L << (INET4 - 272)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
					{
					setState(975);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(974); match(AS);
						}
					}

					setState(977); ((Return_expressionContext)_localctx).alias = identifier();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980); qualified_asterisk();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_listContext extends ParserRuleContext {
		public Update_per_columnContext update_per_column() {
			return getRuleContext(Update_per_columnContext.class,0);
		}
		public Update_column_listContext update_column_list() {
			return getRuleContext(Update_column_listContext.class,0);
		}
		public Update_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_list; }
	}

	public final Update_listContext update_list() throws RecognitionException {
		Update_listContext _localctx = new Update_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_list);
		try {
			setState(985);
			switch (_input.LA(1)) {
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(983); update_per_column();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(984); update_column_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_per_columnContext extends ParserRuleContext {
		public List<Update_assignmentContext> update_assignment() {
			return getRuleContexts(Update_assignmentContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Update_assignmentContext update_assignment(int i) {
			return getRuleContext(Update_assignmentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Update_per_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_per_column; }
	}

	public final Update_per_columnContext update_per_column() throws RecognitionException {
		Update_per_columnContext _localctx = new Update_per_columnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_update_per_column);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(987); update_assignment();
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(988); match(COMMA);
					setState(989); update_assignment();
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_assignmentContext extends ParserRuleContext {
		public Update_valueContext update_value() {
			return getRuleContext(Update_valueContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_update_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995); column_reference();
			setState(996); match(EQUAL);
			setState(997); update_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_valueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Update_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value; }
	}

	public final Update_valueContext update_value() throws RecognitionException {
		Update_valueContext _localctx = new Update_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_update_value);
		try {
			setState(1002);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999); value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000); data_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001); match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_value_listContext extends ParserRuleContext {
		public List<Update_valueContext> update_value() {
			return getRuleContexts(Update_valueContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Update_valueContext update_value(int i) {
			return getRuleContext(Update_valueContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Update_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value_list; }
	}

	public final Update_value_listContext update_value_list() throws RecognitionException {
		Update_value_listContext _localctx = new Update_value_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_update_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); update_value();
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1005); match(COMMA);
				setState(1006); update_value();
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_column_listContext extends ParserRuleContext {
		public Update_value_listContext update_value_list() {
			return getRuleContext(Update_value_listContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public Update_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_column_list; }
	}

	public final Update_column_listContext update_column_list() throws RecognitionException {
		Update_column_listContext _localctx = new Update_column_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_update_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012); match(LEFT_PAREN);
			setState(1013); column_name_list();
			setState(1014); match(RIGHT_PAREN);
			setState(1015); match(EQUAL);
			setState(1016); match(LEFT_PAREN);
			setState(1017); update_value_list();
			setState(1018); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public Named_columns_joinContext named_columns_join() {
			return getRuleContext(Named_columns_joinContext.class,0);
		}
		public Returning_statementContext returning_statement() {
			return getRuleContext(Returning_statementContext.class,0);
		}
		public Where_cursor_clauseContext where_cursor_clause() {
			return getRuleContext(Where_cursor_clauseContext.class,0);
		}
		public Table_reference_listContext table_reference_list() {
			return getRuleContext(Table_reference_listContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode ONLY() { return getToken(SQLParser.ONLY, 0); }
		public With_qualifierContext with_qualifier() {
			return getRuleContext(With_qualifierContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public As_clauseContext as_clause() {
			return getRuleContext(As_clauseContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1020); with_qualifier();
				}
			}

			setState(1023); match(DELETE);
			setState(1024); match(FROM);
			setState(1026);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1025); match(ONLY);
				}
				break;
			}
			setState(1028); table_name();
			setState(1030);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(1029); match(MULTIPLY);
				}
			}

			setState(1033);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(1032); as_clause();
				}
				break;
			}
			setState(1037);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1035); match(USING);
				setState(1036); table_reference_list();
				}
				break;
			}
			setState(1040);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1039); named_columns_join();
				}
			}

			setState(1043);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1042); where_cursor_clause();
				}
			}

			setState(1046);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1045); returning_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_cursor_clauseContext extends ParserRuleContext {
		public IdentifierContext cursor_name;
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode OF() { return getToken(SQLParser.OF, 0); }
		public TerminalNode CURRENT() { return getToken(SQLParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Where_cursor_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_cursor_clause; }
	}

	public final Where_cursor_clauseContext where_cursor_clause() throws RecognitionException {
		Where_cursor_clauseContext _localctx = new Where_cursor_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_where_cursor_clause);
		try {
			setState(1053);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048); where_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049); match(WHERE);
				setState(1050); match(CURRENT);
				setState(1051); match(OF);
				setState(1052); ((Where_cursor_clauseContext)_localctx).cursor_name = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_statementContext extends ParserRuleContext {
		public IdentifierContext index_name;
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public With_param_clauseContext with_param_clause() {
			return getRuleContext(With_param_clauseContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(SQLParser.CONCURRENTLY, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public Method_specifierContext method_specifier() {
			return getRuleContext(Method_specifierContext.class,0);
		}
		public Create_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_statement; }
	}

	public final Create_index_statementContext create_index_statement() throws RecognitionException {
		Create_index_statementContext _localctx = new Create_index_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); match(CREATE);
			setState(1057);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1056); match(UNIQUE);
				}
			}

			setState(1059); match(INDEX);
			setState(1061);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1060); match(CONCURRENTLY);
				}
			}

			setState(1064);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ANALYZE - 80)) | (1L << (AVG - 80)) | (1L << (BETWEEN - 80)) | (1L << (BY - 80)) | (1L << (CASCADE - 80)) | (1L << (CENTURY - 80)) | (1L << (CHARACTER - 80)) | (1L << (COLLECT - 80)) | (1L << (COALESCE - 80)) | (1L << (COLUMN - 80)) | (1L << (COUNT - 80)) | (1L << (CUBE - 80)) | (1L << (CURSOR - 80)) | (1L << (CYCLE - 80)) | (1L << (DATA - 80)) | (1L << (DAY - 80)) | (1L << (DEC - 80)) | (1L << (DECADE - 80)) | (1L << (DOW - 80)) | (1L << (DOY - 80)) | (1L << (DROP - 80)) | (1L << (EPOCH - 80)) | (1L << (EVERY - 80)) | (1L << (EXTERNAL - 80)) | (1L << (EXTRACT - 80)) | (1L << (FILTER - 80)) | (1L << (FIRST - 80)) | (1L << (FOLLOWING - 80)) | (1L << (FORMAT - 80)) | (1L << (FUSION - 80)) | (1L << (GROUPING - 80)) | (1L << (HASH - 80)) | (1L << (HOUR - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (INDEX - 144)) | (1L << (INSERT - 144)) | (1L << (INTERSECTION - 144)) | (1L << (ISODOW - 144)) | (1L << (ISOYEAR - 144)) | (1L << (KEY - 144)) | (1L << (LAST - 144)) | (1L << (LESS - 144)) | (1L << (LIST - 144)) | (1L << (LOCATION - 144)) | (1L << (MAX - 144)) | (1L << (MAXVALUE - 144)) | (1L << (MICROSECONDS - 144)) | (1L << (MILLENNIUM - 144)) | (1L << (MILLISECONDS - 144)) | (1L << (MIN - 144)) | (1L << (MINUTE - 144)) | (1L << (MONTH - 144)) | (1L << (NATIONAL - 144)) | (1L << (NULLIF - 144)) | (1L << (ONLY - 144)) | (1L << (OVERWRITE - 144)) | (1L << (PARTITION - 144)) | (1L << (PARTITIONS - 144)) | (1L << (PRECEDING - 144)) | (1L << (PRECISION - 144)) | (1L << (QUARTER - 144)) | (1L << (RANGE - 144)) | (1L << (RECURSIVE - 144)) | (1L << (REGEXP - 144)) | (1L << (REPLACE - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (RESTRICT - 208)) | (1L << (RETURNING - 208)) | (1L << (RLIKE - 208)) | (1L << (ROLLUP - 208)) | (1L << (ROWS - 208)) | (1L << (SCHEMA - 208)) | (1L << (SECOND - 208)) | (1L << (SEQUENCE - 208)) | (1L << (SEQUENCES - 208)) | (1L << (SET - 208)) | (1L << (SIMILAR - 208)) | (1L << (STDDEV_POP - 208)) | (1L << (STDDEV_SAMP - 208)) | (1L << (SUBPARTITION - 208)) | (1L << (SUM - 208)) | (1L << (TABLES - 208)) | (1L << (TABLESPACE - 208)) | (1L << (THAN - 208)) | (1L << (TIMEZONE - 208)) | (1L << (TIMEZONE_HOUR - 208)) | (1L << (TIMEZONE_MINUTE - 208)) | (1L << (TRIM - 208)) | (1L << (TO - 208)) | (1L << (TYPE - 208)) | (1L << (UNBOUNDED - 208)) | (1L << (UNKNOWN - 208)) | (1L << (USAGE - 208)) | (1L << (VAR_SAMP - 208)) | (1L << (VAR_POP - 208)) | (1L << (VARYING - 208)) | (1L << (VERBOSE - 208)) | (1L << (WEEK - 208)) | (1L << (WINDOW - 208)) | (1L << (YEAR - 208)) | (1L << (ZONE - 208)) | (1L << (BOOLEAN - 208)) | (1L << (BOOL - 208)) | (1L << (BIT - 208)) | (1L << (VARBIT - 208)) | (1L << (INT1 - 208)) | (1L << (INT2 - 208)) | (1L << (INT4 - 208)) | (1L << (INT8 - 208)) | (1L << (TINYINT - 208)) | (1L << (SMALLINT - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (BIGINT - 272)) | (1L << (FLOAT4 - 272)) | (1L << (FLOAT8 - 272)) | (1L << (REAL - 272)) | (1L << (FLOAT - 272)) | (1L << (DOUBLE - 272)) | (1L << (NUMERIC - 272)) | (1L << (DECIMAL - 272)) | (1L << (CHAR - 272)) | (1L << (VARCHAR - 272)) | (1L << (NCHAR - 272)) | (1L << (NVARCHAR - 272)) | (1L << (DATE - 272)) | (1L << (INTERVAL - 272)) | (1L << (TIME - 272)) | (1L << (TIMETZ - 272)) | (1L << (TIMESTAMP - 272)) | (1L << (TIMESTAMPTZ - 272)) | (1L << (TEXT - 272)) | (1L << (VARBINARY - 272)) | (1L << (BLOB - 272)) | (1L << (BYTEA - 272)) | (1L << (INET4 - 272)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(1063); ((Create_index_statementContext)_localctx).index_name = identifier();
				}
			}

			setState(1066); match(ON);
			setState(1067); table_name();
			setState(1069);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1068); method_specifier();
				}
			}

			setState(1071); match(LEFT_PAREN);
			setState(1072); index_column_list();
			setState(1073); match(RIGHT_PAREN);
			setState(1075);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1074); with_param_clause();
				}
			}

			setState(1078);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1077); where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_listContext extends ParserRuleContext {
		public Index_columnContext index_column(int i) {
			return getRuleContext(Index_columnContext.class,i);
		}
		public List<Index_columnContext> index_column() {
			return getRuleContexts(Index_columnContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Index_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_list; }
	}

	public final Index_column_listContext index_column_list() throws RecognitionException {
		Index_column_listContext _localctx = new Index_column_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_index_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); index_column();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1081); match(COMMA);
				setState(1082); index_column();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_columnContext extends ParserRuleContext {
		public IdentifierContext opclass;
		public Order_specificationContext order;
		public Null_orderingContext null_order;
		public Order_specificationContext order_specification() {
			return getRuleContext(Order_specificationContext.class,0);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Null_orderingContext null_ordering() {
			return getRuleContext(Null_orderingContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Index_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column; }
	}

	public final Index_columnContext index_column() throws RecognitionException {
		Index_columnContext _localctx = new Index_columnContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_index_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); value_expression();
			setState(1090);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ANALYZE - 80)) | (1L << (AVG - 80)) | (1L << (BETWEEN - 80)) | (1L << (BY - 80)) | (1L << (CASCADE - 80)) | (1L << (CENTURY - 80)) | (1L << (CHARACTER - 80)) | (1L << (COLLECT - 80)) | (1L << (COALESCE - 80)) | (1L << (COLUMN - 80)) | (1L << (COUNT - 80)) | (1L << (CUBE - 80)) | (1L << (CURSOR - 80)) | (1L << (CYCLE - 80)) | (1L << (DATA - 80)) | (1L << (DAY - 80)) | (1L << (DEC - 80)) | (1L << (DECADE - 80)) | (1L << (DOW - 80)) | (1L << (DOY - 80)) | (1L << (DROP - 80)) | (1L << (EPOCH - 80)) | (1L << (EVERY - 80)) | (1L << (EXTERNAL - 80)) | (1L << (EXTRACT - 80)) | (1L << (FILTER - 80)) | (1L << (FIRST - 80)) | (1L << (FOLLOWING - 80)) | (1L << (FORMAT - 80)) | (1L << (FUSION - 80)) | (1L << (GROUPING - 80)) | (1L << (HASH - 80)) | (1L << (HOUR - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (INDEX - 144)) | (1L << (INSERT - 144)) | (1L << (INTERSECTION - 144)) | (1L << (ISODOW - 144)) | (1L << (ISOYEAR - 144)) | (1L << (KEY - 144)) | (1L << (LAST - 144)) | (1L << (LESS - 144)) | (1L << (LIST - 144)) | (1L << (LOCATION - 144)) | (1L << (MAX - 144)) | (1L << (MAXVALUE - 144)) | (1L << (MICROSECONDS - 144)) | (1L << (MILLENNIUM - 144)) | (1L << (MILLISECONDS - 144)) | (1L << (MIN - 144)) | (1L << (MINUTE - 144)) | (1L << (MONTH - 144)) | (1L << (NATIONAL - 144)) | (1L << (NULLIF - 144)) | (1L << (ONLY - 144)) | (1L << (OVERWRITE - 144)) | (1L << (PARTITION - 144)) | (1L << (PARTITIONS - 144)) | (1L << (PRECEDING - 144)) | (1L << (PRECISION - 144)) | (1L << (QUARTER - 144)) | (1L << (RANGE - 144)) | (1L << (RECURSIVE - 144)) | (1L << (REGEXP - 144)) | (1L << (REPLACE - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (RESTRICT - 208)) | (1L << (RETURNING - 208)) | (1L << (RLIKE - 208)) | (1L << (ROLLUP - 208)) | (1L << (ROWS - 208)) | (1L << (SCHEMA - 208)) | (1L << (SECOND - 208)) | (1L << (SEQUENCE - 208)) | (1L << (SEQUENCES - 208)) | (1L << (SET - 208)) | (1L << (SIMILAR - 208)) | (1L << (STDDEV_POP - 208)) | (1L << (STDDEV_SAMP - 208)) | (1L << (SUBPARTITION - 208)) | (1L << (SUM - 208)) | (1L << (TABLES - 208)) | (1L << (TABLESPACE - 208)) | (1L << (THAN - 208)) | (1L << (TIMEZONE - 208)) | (1L << (TIMEZONE_HOUR - 208)) | (1L << (TIMEZONE_MINUTE - 208)) | (1L << (TRIM - 208)) | (1L << (TO - 208)) | (1L << (TYPE - 208)) | (1L << (UNBOUNDED - 208)) | (1L << (UNKNOWN - 208)) | (1L << (USAGE - 208)) | (1L << (VAR_SAMP - 208)) | (1L << (VAR_POP - 208)) | (1L << (VARYING - 208)) | (1L << (VERBOSE - 208)) | (1L << (WEEK - 208)) | (1L << (WINDOW - 208)) | (1L << (YEAR - 208)) | (1L << (ZONE - 208)) | (1L << (BOOLEAN - 208)) | (1L << (BOOL - 208)) | (1L << (BIT - 208)) | (1L << (VARBIT - 208)) | (1L << (INT1 - 208)) | (1L << (INT2 - 208)) | (1L << (INT4 - 208)) | (1L << (INT8 - 208)) | (1L << (TINYINT - 208)) | (1L << (SMALLINT - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (BIGINT - 272)) | (1L << (FLOAT4 - 272)) | (1L << (FLOAT8 - 272)) | (1L << (REAL - 272)) | (1L << (FLOAT - 272)) | (1L << (DOUBLE - 272)) | (1L << (NUMERIC - 272)) | (1L << (DECIMAL - 272)) | (1L << (CHAR - 272)) | (1L << (VARCHAR - 272)) | (1L << (NCHAR - 272)) | (1L << (NVARCHAR - 272)) | (1L << (DATE - 272)) | (1L << (INTERVAL - 272)) | (1L << (TIME - 272)) | (1L << (TIMETZ - 272)) | (1L << (TIMESTAMP - 272)) | (1L << (TIMESTAMPTZ - 272)) | (1L << (TEXT - 272)) | (1L << (VARBINARY - 272)) | (1L << (BLOB - 272)) | (1L << (BYTEA - 272)) | (1L << (INET4 - 272)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(1089); ((Index_columnContext)_localctx).opclass = identifier();
				}
			}

			setState(1093);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (ASC - 7)) | (1L << (DESC - 7)) | (1L << (USING - 7)))) != 0)) {
				{
				setState(1092); ((Index_columnContext)_localctx).order = order_specification();
				}
			}

			setState(1096);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1095); ((Index_columnContext)_localctx).null_order = null_ordering();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_statementContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode VIEW() { return getToken(SQLParser.VIEW, 0); }
		public TerminalNode CHECK() { return getToken(SQLParser.CHECK, 0); }
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SQLParser.TEMPORARY, 0); }
		public TerminalNode OR() { return getToken(SQLParser.OR, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public With_param_clauseContext with_param_clause() {
			return getRuleContext(With_param_clauseContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(SQLParser.RECURSIVE, 0); }
		public TerminalNode REPLACE() { return getToken(SQLParser.REPLACE, 0); }
		public TerminalNode LOCAL() { return getToken(SQLParser.LOCAL, 0); }
		public TerminalNode TEMP() { return getToken(SQLParser.TEMP, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPTION() { return getToken(SQLParser.OPTION, 0); }
		public Create_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_statement; }
	}

	public final Create_view_statementContext create_view_statement() throws RecognitionException {
		Create_view_statementContext _localctx = new Create_view_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098); match(CREATE);
			setState(1101);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1099); match(OR);
				setState(1100); match(REPLACE);
				}
			}

			setState(1104);
			_la = _input.LA(1);
			if (_la==TEMPORARY || _la==TEMP) {
				{
				setState(1103);
				_la = _input.LA(1);
				if ( !(_la==TEMPORARY || _la==TEMP) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1107);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(1106); match(RECURSIVE);
				}
			}

			setState(1109); match(VIEW);
			setState(1110); table_name();
			setState(1112);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1111); with_param_clause();
				}
			}

			setState(1114); match(AS);
			setState(1115); data_statement();
			setState(1122);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1116); match(WITH);
				setState(1118);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1117); match(LOCAL);
					}
				}

				setState(1120); match(CHECK);
				setState(1121); match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_materialized_view_statementContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SQLParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SQLParser.VIEW, 0); }
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public With_param_clauseContext with_param_clause() {
			return getRuleContext(With_param_clauseContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SQLParser.DATA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Create_materialized_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_materialized_view_statement; }
	}

	public final Create_materialized_view_statementContext create_materialized_view_statement() throws RecognitionException {
		Create_materialized_view_statementContext _localctx = new Create_materialized_view_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_materialized_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124); match(CREATE);
			setState(1125); match(MATERIALIZED);
			setState(1126); match(VIEW);
			setState(1127); table_name();
			setState(1132);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1128); match(LEFT_PAREN);
				setState(1129); column_name_list();
				setState(1130); match(RIGHT_PAREN);
				}
			}

			setState(1135);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1134); with_param_clause();
				}
			}

			setState(1137); match(AS);
			setState(1138); data_statement();
			setState(1144);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1139); match(WITH);
				setState(1141);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1140); match(NO);
					}
				}

				setState(1143); match(DATA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Refresh_materialized_view_statementContext extends ParserRuleContext {
		public TerminalNode REFRESH() { return getToken(SQLParser.REFRESH, 0); }
		public TerminalNode VIEW() { return getToken(SQLParser.VIEW, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SQLParser.MATERIALIZED, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(SQLParser.CONCURRENTLY, 0); }
		public TerminalNode DATA() { return getToken(SQLParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Refresh_materialized_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refresh_materialized_view_statement; }
	}

	public final Refresh_materialized_view_statementContext refresh_materialized_view_statement() throws RecognitionException {
		Refresh_materialized_view_statementContext _localctx = new Refresh_materialized_view_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_refresh_materialized_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146); match(REFRESH);
			setState(1147); match(MATERIALIZED);
			setState(1148); match(VIEW);
			setState(1150);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1149); match(CONCURRENTLY);
				}
			}

			setState(1152); table_name();
			setState(1158);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1153); match(WITH);
				setState(1155);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1154); match(NO);
					}
				}

				setState(1157); match(DATA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_sequence_statementContext extends ParserRuleContext {
		public Table_nameContext sequence_name;
		public TerminalNode BY(int i) {
			return getToken(SQLParser.BY, i);
		}
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SQLParser.TEMPORARY, 0); }
		public List<Signed_numerical_literalContext> signed_numerical_literal() {
			return getRuleContexts(Signed_numerical_literalContext.class);
		}
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public List<TerminalNode> NO() { return getTokens(SQLParser.NO); }
		public TerminalNode OWNED() { return getToken(SQLParser.OWNED, 0); }
		public TerminalNode MAXVALUE() { return getToken(SQLParser.MAXVALUE, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLParser.SEQUENCE, 0); }
		public TerminalNode INCREMENT() { return getToken(SQLParser.INCREMENT, 0); }
		public TerminalNode NONE() { return getToken(SQLParser.NONE, 0); }
		public TerminalNode START() { return getToken(SQLParser.START, 0); }
		public TerminalNode MINVALUE() { return getToken(SQLParser.MINVALUE, 0); }
		public List<TerminalNode> BY() { return getTokens(SQLParser.BY); }
		public TerminalNode CYCLE() { return getToken(SQLParser.CYCLE, 0); }
		public TerminalNode TEMP() { return getToken(SQLParser.TEMP, 0); }
		public TerminalNode NO(int i) {
			return getToken(SQLParser.NO, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Signed_numerical_literalContext signed_numerical_literal(int i) {
			return getRuleContext(Signed_numerical_literalContext.class,i);
		}
		public TerminalNode CACHE() { return getToken(SQLParser.CACHE, 0); }
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Create_sequence_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_sequence_statement; }
	}

	public final Create_sequence_statementContext create_sequence_statement() throws RecognitionException {
		Create_sequence_statementContext _localctx = new Create_sequence_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_sequence_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); match(CREATE);
			setState(1162);
			_la = _input.LA(1);
			if (_la==TEMPORARY || _la==TEMP) {
				{
				setState(1161);
				_la = _input.LA(1);
				if ( !(_la==TEMPORARY || _la==TEMP) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1164); match(SEQUENCE);
			setState(1165); ((Create_sequence_statementContext)_localctx).sequence_name = table_name();
			setState(1171);
			_la = _input.LA(1);
			if (_la==INCREMENT) {
				{
				setState(1166); match(INCREMENT);
				setState(1168);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1167); match(BY);
					}
				}

				setState(1170); signed_numerical_literal();
				}
			}

			setState(1177);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1173); match(MINVALUE);
				setState(1174); signed_numerical_literal();
				}
				break;
			case 2:
				{
				setState(1175); match(NO);
				setState(1176); match(MINVALUE);
				}
				break;
			}
			setState(1183);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1179); match(MAXVALUE);
				setState(1180); signed_numerical_literal();
				}
				break;
			case 2:
				{
				setState(1181); match(NO);
				setState(1182); match(MAXVALUE);
				}
				break;
			}
			setState(1190);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(1185); match(START);
				setState(1187);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1186); match(WITH);
					}
				}

				setState(1189); signed_numerical_literal();
				}
			}

			setState(1194);
			_la = _input.LA(1);
			if (_la==CACHE) {
				{
				setState(1192); match(CACHE);
				setState(1193); unsigned_numeric_literal();
				}
			}

			setState(1200);
			_la = _input.LA(1);
			if (_la==CYCLE || _la==NO) {
				{
				setState(1197);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1196); match(NO);
					}
				}

				setState(1199); match(CYCLE);
				}
			}

			setState(1208);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(1202); match(OWNED);
				setState(1203); match(BY);
				setState(1206);
				switch (_input.LA(1)) {
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(1204); column_name();
					}
					break;
				case NONE:
					{
					setState(1205); match(NONE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public Token IF;
		public List<Token> ifNotExists = new ArrayList<Token>();
		public Token NOT;
		public Token EXISTS;
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public List<Table_modifiersContext> table_modifiers() {
			return getRuleContexts(Table_modifiersContext.class);
		}
		public Normal_create_tableContext normal_create_table() {
			return getRuleContext(Normal_create_tableContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Table_modifiersContext table_modifiers(int i) {
			return getRuleContext(Table_modifiersContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_as_statementContext create_table_as_statement() {
			return getRuleContext(Create_table_as_statementContext.class,0);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); match(CREATE);
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL || _la==LOCAL || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TEMPORARY - 232)) | (1L << (TEMP - 232)) | (1L << (UNLOGGED - 232)) | (1L << (UNSECURED - 232)))) != 0)) {
				{
				{
				setState(1211); table_modifiers();
				}
				}
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1217); match(TABLE);
			setState(1221);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1218); ((Create_table_statementContext)_localctx).IF = match(IF);
				((Create_table_statementContext)_localctx).ifNotExists.add(((Create_table_statementContext)_localctx).IF);
				setState(1219); ((Create_table_statementContext)_localctx).NOT = match(NOT);
				((Create_table_statementContext)_localctx).ifNotExists.add(((Create_table_statementContext)_localctx).NOT);
				setState(1220); ((Create_table_statementContext)_localctx).EXISTS = match(EXISTS);
				((Create_table_statementContext)_localctx).ifNotExists.add(((Create_table_statementContext)_localctx).EXISTS);
				}
			}

			setState(1223); table_name();
			setState(1226);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1224); normal_create_table();
				}
				break;
			case 2:
				{
				setState(1225); create_table_as_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Normal_create_tableContext extends ParserRuleContext {
		public TerminalNode PRESERVE() { return getToken(SQLParser.PRESERVE, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode INHERITS() { return getToken(SQLParser.INHERITS, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public Table_elementsContext table_elements() {
			return getRuleContext(Table_elementsContext.class,0);
		}
		public With_param_clauseContext with_param_clause() {
			return getRuleContext(With_param_clauseContext.class,0);
		}
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode OIDS() { return getToken(SQLParser.OIDS, 0); }
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public TerminalNode COMMIT() { return getToken(SQLParser.COMMIT, 0); }
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode WITHOUT() { return getToken(SQLParser.WITHOUT, 0); }
		public Normal_create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_create_table; }
	}

	public final Normal_create_tableContext normal_create_table() throws RecognitionException {
		Normal_create_tableContext _localctx = new Normal_create_tableContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_normal_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228); table_elements();
			setState(1234);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(1229); match(INHERITS);
				setState(1230); match(LEFT_PAREN);
				setState(1231); table_name_list();
				setState(1232); match(RIGHT_PAREN);
				}
			}

			setState(1241);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1236); with_param_clause();
				}
				break;
			case 2:
				{
				setState(1237); match(WITH);
				setState(1238); match(OIDS);
				}
				break;
			case 3:
				{
				setState(1239); match(WITHOUT);
				setState(1240); match(OIDS);
				}
				break;
			}
			setState(1252);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1243); match(ON);
				setState(1244); match(COMMIT);
				setState(1250);
				switch (_input.LA(1)) {
				case PRESERVE:
					{
					setState(1245); match(PRESERVE);
					setState(1246); match(ROWS);
					}
					break;
				case DELETE:
					{
					setState(1247); match(DELETE);
					setState(1248); match(ROWS);
					}
					break;
				case DROP:
					{
					setState(1249); match(DROP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_as_statementContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode PRESERVE() { return getToken(SQLParser.PRESERVE, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public List<TerminalNode> WITH() { return getTokens(SQLParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SQLParser.WITH, i);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public With_param_clauseContext with_param_clause() {
			return getRuleContext(With_param_clauseContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode OIDS() { return getToken(SQLParser.OIDS, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SQLParser.DATA, 0); }
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public TerminalNode COMMIT() { return getToken(SQLParser.COMMIT, 0); }
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode WITHOUT() { return getToken(SQLParser.WITHOUT, 0); }
		public Create_table_as_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_as_statement; }
	}

	public final Create_table_as_statementContext create_table_as_statement() throws RecognitionException {
		Create_table_as_statementContext _localctx = new Create_table_as_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_as_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1254); match(LEFT_PAREN);
				setState(1256);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ANALYZE - 80)) | (1L << (AVG - 80)) | (1L << (BETWEEN - 80)) | (1L << (BY - 80)) | (1L << (CASCADE - 80)) | (1L << (CENTURY - 80)) | (1L << (CHARACTER - 80)) | (1L << (COLLECT - 80)) | (1L << (COALESCE - 80)) | (1L << (COLUMN - 80)) | (1L << (COUNT - 80)) | (1L << (CUBE - 80)) | (1L << (CURSOR - 80)) | (1L << (CYCLE - 80)) | (1L << (DATA - 80)) | (1L << (DAY - 80)) | (1L << (DEC - 80)) | (1L << (DECADE - 80)) | (1L << (DOW - 80)) | (1L << (DOY - 80)) | (1L << (DROP - 80)) | (1L << (EPOCH - 80)) | (1L << (EVERY - 80)) | (1L << (EXTERNAL - 80)) | (1L << (EXTRACT - 80)) | (1L << (FILTER - 80)) | (1L << (FIRST - 80)) | (1L << (FOLLOWING - 80)) | (1L << (FORMAT - 80)) | (1L << (FUSION - 80)) | (1L << (GROUPING - 80)) | (1L << (HASH - 80)) | (1L << (HOUR - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (INDEX - 144)) | (1L << (INSERT - 144)) | (1L << (INTERSECTION - 144)) | (1L << (ISODOW - 144)) | (1L << (ISOYEAR - 144)) | (1L << (KEY - 144)) | (1L << (LAST - 144)) | (1L << (LESS - 144)) | (1L << (LIST - 144)) | (1L << (LOCATION - 144)) | (1L << (MAX - 144)) | (1L << (MAXVALUE - 144)) | (1L << (MICROSECONDS - 144)) | (1L << (MILLENNIUM - 144)) | (1L << (MILLISECONDS - 144)) | (1L << (MIN - 144)) | (1L << (MINUTE - 144)) | (1L << (MONTH - 144)) | (1L << (NATIONAL - 144)) | (1L << (NULLIF - 144)) | (1L << (ONLY - 144)) | (1L << (OVERWRITE - 144)) | (1L << (PARTITION - 144)) | (1L << (PARTITIONS - 144)) | (1L << (PRECEDING - 144)) | (1L << (PRECISION - 144)) | (1L << (QUARTER - 144)) | (1L << (RANGE - 144)) | (1L << (RECURSIVE - 144)) | (1L << (REGEXP - 144)) | (1L << (REPLACE - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (RESTRICT - 208)) | (1L << (RETURNING - 208)) | (1L << (RLIKE - 208)) | (1L << (ROLLUP - 208)) | (1L << (ROWS - 208)) | (1L << (SCHEMA - 208)) | (1L << (SECOND - 208)) | (1L << (SEQUENCE - 208)) | (1L << (SEQUENCES - 208)) | (1L << (SET - 208)) | (1L << (SIMILAR - 208)) | (1L << (STDDEV_POP - 208)) | (1L << (STDDEV_SAMP - 208)) | (1L << (SUBPARTITION - 208)) | (1L << (SUM - 208)) | (1L << (TABLES - 208)) | (1L << (TABLESPACE - 208)) | (1L << (THAN - 208)) | (1L << (TIMEZONE - 208)) | (1L << (TIMEZONE_HOUR - 208)) | (1L << (TIMEZONE_MINUTE - 208)) | (1L << (TRIM - 208)) | (1L << (TO - 208)) | (1L << (TYPE - 208)) | (1L << (UNBOUNDED - 208)) | (1L << (UNKNOWN - 208)) | (1L << (USAGE - 208)) | (1L << (VAR_SAMP - 208)) | (1L << (VAR_POP - 208)) | (1L << (VARYING - 208)) | (1L << (VERBOSE - 208)) | (1L << (WEEK - 208)) | (1L << (WINDOW - 208)) | (1L << (YEAR - 208)) | (1L << (ZONE - 208)) | (1L << (BOOLEAN - 208)) | (1L << (BOOL - 208)) | (1L << (BIT - 208)) | (1L << (VARBIT - 208)) | (1L << (INT1 - 208)) | (1L << (INT2 - 208)) | (1L << (INT4 - 208)) | (1L << (INT8 - 208)) | (1L << (TINYINT - 208)) | (1L << (SMALLINT - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (BIGINT - 272)) | (1L << (FLOAT4 - 272)) | (1L << (FLOAT8 - 272)) | (1L << (REAL - 272)) | (1L << (FLOAT - 272)) | (1L << (DOUBLE - 272)) | (1L << (NUMERIC - 272)) | (1L << (DECIMAL - 272)) | (1L << (CHAR - 272)) | (1L << (VARCHAR - 272)) | (1L << (NCHAR - 272)) | (1L << (NVARCHAR - 272)) | (1L << (DATE - 272)) | (1L << (INTERVAL - 272)) | (1L << (TIME - 272)) | (1L << (TIMETZ - 272)) | (1L << (TIMESTAMP - 272)) | (1L << (TIMESTAMPTZ - 272)) | (1L << (TEXT - 272)) | (1L << (VARBINARY - 272)) | (1L << (BLOB - 272)) | (1L << (BYTEA - 272)) | (1L << (INET4 - 272)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
					{
					setState(1255); column_name_list();
					}
				}

				setState(1258); match(RIGHT_PAREN);
				}
			}

			setState(1266);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1261); with_param_clause();
				}
				break;
			case 2:
				{
				setState(1262); match(WITH);
				setState(1263); match(OIDS);
				}
				break;
			case 3:
				{
				setState(1264); match(WITHOUT);
				setState(1265); match(OIDS);
				}
				break;
			}
			setState(1277);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1268); match(ON);
				setState(1269); match(COMMIT);
				setState(1275);
				switch (_input.LA(1)) {
				case PRESERVE:
					{
					setState(1270); match(PRESERVE);
					setState(1271); match(ROWS);
					}
					break;
				case DELETE:
					{
					setState(1272); match(DELETE);
					setState(1273); match(ROWS);
					}
					break;
				case DROP:
					{
					setState(1274); match(DROP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1279); match(AS);
			setState(1280); data_statement();
			setState(1286);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1281); match(WITH);
				setState(1283);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1282); match(NO);
					}
				}

				setState(1285); match(DATA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_modifiersContext extends ParserRuleContext {
		public TerminalNode UNLOGGED() { return getToken(SQLParser.UNLOGGED, 0); }
		public TerminalNode GLOBAL() { return getToken(SQLParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SQLParser.TEMPORARY, 0); }
		public TerminalNode UNSECURED() { return getToken(SQLParser.UNSECURED, 0); }
		public TerminalNode TEMP() { return getToken(SQLParser.TEMP, 0); }
		public TerminalNode LOCAL() { return getToken(SQLParser.LOCAL, 0); }
		public Table_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_modifiers; }
	}

	public final Table_modifiersContext table_modifiers() throws RecognitionException {
		Table_modifiersContext _localctx = new Table_modifiersContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			_la = _input.LA(1);
			if ( !(_la==GLOBAL || _la==LOCAL || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TEMPORARY - 232)) | (1L << (TEMP - 232)) | (1L << (UNLOGGED - 232)) | (1L << (UNSECURED - 232)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_elementsContext extends ParserRuleContext {
		public Field_elementContext field_element(int i) {
			return getRuleContext(Field_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Field_elementContext> field_element() {
			return getRuleContexts(Field_elementContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_elements; }
	}

	public final Table_elementsContext table_elements() throws RecognitionException {
		Table_elementsContext _localctx = new Table_elementsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); match(LEFT_PAREN);
			setState(1299);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LIKE - 41)) | (1L << (UNIQUE - 41)) | (1L << (ANALYZE - 41)) | (1L << (AVG - 41)) | (1L << (BETWEEN - 41)) | (1L << (BY - 41)) | (1L << (CASCADE - 41)) | (1L << (CENTURY - 41)) | (1L << (CHARACTER - 41)) | (1L << (CHECK - 41)) | (1L << (COLLECT - 41)) | (1L << (COALESCE - 41)) | (1L << (COLUMN - 41)) | (1L << (CONSTRAINT - 41)) | (1L << (COUNT - 41)) | (1L << (CUBE - 41)) | (1L << (CURSOR - 41)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (CYCLE - 105)) | (1L << (DATA - 105)) | (1L << (DAY - 105)) | (1L << (DEC - 105)) | (1L << (DECADE - 105)) | (1L << (DOW - 105)) | (1L << (DOY - 105)) | (1L << (DROP - 105)) | (1L << (EPOCH - 105)) | (1L << (EVERY - 105)) | (1L << (EXCLUDE - 105)) | (1L << (EXTERNAL - 105)) | (1L << (EXTRACT - 105)) | (1L << (FILTER - 105)) | (1L << (FIRST - 105)) | (1L << (FOLLOWING - 105)) | (1L << (FOREIGN - 105)) | (1L << (FORMAT - 105)) | (1L << (FUSION - 105)) | (1L << (GROUPING - 105)) | (1L << (HASH - 105)) | (1L << (HOUR - 105)) | (1L << (INDEX - 105)) | (1L << (INSERT - 105)) | (1L << (INTERSECTION - 105)) | (1L << (ISODOW - 105)) | (1L << (ISOYEAR - 105)) | (1L << (KEY - 105)) | (1L << (LAST - 105)) | (1L << (LESS - 105)) | (1L << (LIST - 105)) | (1L << (LOCATION - 105)) | (1L << (MAX - 105)) | (1L << (MAXVALUE - 105)) | (1L << (MICROSECONDS - 105)) | (1L << (MILLENNIUM - 105)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (MILLISECONDS - 169)) | (1L << (MIN - 169)) | (1L << (MINUTE - 169)) | (1L << (MONTH - 169)) | (1L << (NATIONAL - 169)) | (1L << (NULLIF - 169)) | (1L << (ONLY - 169)) | (1L << (OVERWRITE - 169)) | (1L << (PARTITION - 169)) | (1L << (PARTITIONS - 169)) | (1L << (PRECEDING - 169)) | (1L << (PRECISION - 169)) | (1L << (PRIMARY - 169)) | (1L << (QUARTER - 169)) | (1L << (RANGE - 169)) | (1L << (RECURSIVE - 169)) | (1L << (REGEXP - 169)) | (1L << (REPLACE - 169)) | (1L << (RESTRICT - 169)) | (1L << (RETURNING - 169)) | (1L << (RLIKE - 169)) | (1L << (ROLLUP - 169)) | (1L << (ROWS - 169)) | (1L << (SCHEMA - 169)) | (1L << (SECOND - 169)) | (1L << (SEQUENCE - 169)) | (1L << (SEQUENCES - 169)) | (1L << (SET - 169)) | (1L << (SIMILAR - 169)) | (1L << (STDDEV_POP - 169)) | (1L << (STDDEV_SAMP - 169)) | (1L << (SUBPARTITION - 169)) | (1L << (SUM - 169)) | (1L << (TABLES - 169)) | (1L << (TABLESPACE - 169)))) != 0) || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (THAN - 234)) | (1L << (TIMEZONE - 234)) | (1L << (TIMEZONE_HOUR - 234)) | (1L << (TIMEZONE_MINUTE - 234)) | (1L << (TRIM - 234)) | (1L << (TO - 234)) | (1L << (TYPE - 234)) | (1L << (UNBOUNDED - 234)) | (1L << (UNKNOWN - 234)) | (1L << (USAGE - 234)) | (1L << (VAR_SAMP - 234)) | (1L << (VAR_POP - 234)) | (1L << (VARYING - 234)) | (1L << (VERBOSE - 234)) | (1L << (WEEK - 234)) | (1L << (WINDOW - 234)) | (1L << (YEAR - 234)) | (1L << (ZONE - 234)) | (1L << (BOOLEAN - 234)) | (1L << (BOOL - 234)) | (1L << (BIT - 234)) | (1L << (VARBIT - 234)) | (1L << (INT1 - 234)) | (1L << (INT2 - 234)) | (1L << (INT4 - 234)) | (1L << (INT8 - 234)) | (1L << (TINYINT - 234)) | (1L << (SMALLINT - 234)) | (1L << (INT - 234)) | (1L << (INTEGER - 234)) | (1L << (BIGINT - 234)) | (1L << (FLOAT4 - 234)) | (1L << (FLOAT8 - 234)) | (1L << (REAL - 234)) | (1L << (FLOAT - 234)) | (1L << (DOUBLE - 234)) | (1L << (NUMERIC - 234)) | (1L << (DECIMAL - 234)) | (1L << (CHAR - 234)) | (1L << (VARCHAR - 234)) | (1L << (NCHAR - 234)) | (1L << (NVARCHAR - 234)) | (1L << (DATE - 234)) | (1L << (INTERVAL - 234)) | (1L << (TIME - 234)) | (1L << (TIMETZ - 234)) | (1L << (TIMESTAMP - 234)) | (1L << (TIMESTAMPTZ - 234)) | (1L << (TEXT - 234)) | (1L << (VARBINARY - 234)) | (1L << (BLOB - 234)) | (1L << (BYTEA - 234)) | (1L << (INET4 - 234)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(1291); field_element();
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1292); match(COMMA);
					setState(1293); field_element();
					}
					}
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1301); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public IdentifierContext name;
		public Value_expressionContext default_val;
		public TerminalNode CHECK() { return getToken(SQLParser.CHECK, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public References_statementContext references_statement() {
			return getRuleContext(References_statementContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1303); match(CONSTRAINT);
				setState(1304); ((Column_constraintContext)_localctx).name = identifier();
				}
			}

			setState(1321);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(1307); match(NOT);
				setState(1308); match(NULL);
				}
				break;
			case NULL:
				{
				setState(1309); match(NULL);
				}
				break;
			case CHECK:
				{
				setState(1310); match(CHECK);
				setState(1311); match(LEFT_PAREN);
				setState(1312); search_condition();
				setState(1313); match(RIGHT_PAREN);
				}
				break;
			case DEFAULT:
				{
				setState(1315); match(DEFAULT);
				setState(1316); ((Column_constraintContext)_localctx).default_val = value_expression();
				}
				break;
			case UNIQUE:
				{
				setState(1317); match(UNIQUE);
				}
				break;
			case PRIMARY:
				{
				setState(1318); match(PRIMARY);
				setState(1319); match(KEY);
				}
				break;
			case REFERENCES:
				{
				setState(1320); references_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class References_statementContext extends ParserRuleContext {
		public Table_nameContext ref_table;
		public TerminalNode DEFERRED() { return getToken(SQLParser.DEFERRED, 0); }
		public TerminalNode FULL() { return getToken(SQLParser.FULL, 0); }
		public TerminalNode ON(int i) {
			return getToken(SQLParser.ON, i);
		}
		public Column_actionContext column_action(int i) {
			return getRuleContext(Column_actionContext.class,i);
		}
		public TerminalNode DEFERRABLE() { return getToken(SQLParser.DEFERRABLE, 0); }
		public List<Column_actionContext> column_action() {
			return getRuleContexts(Column_actionContext.class);
		}
		public TerminalNode DELETE(int i) {
			return getToken(SQLParser.DELETE, i);
		}
		public TerminalNode PARTIAL() { return getToken(SQLParser.PARTIAL, 0); }
		public TerminalNode INITIALLY() { return getToken(SQLParser.INITIALLY, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLParser.REFERENCES, 0); }
		public TerminalNode MATCH() { return getToken(SQLParser.MATCH, 0); }
		public List<TerminalNode> ON() { return getTokens(SQLParser.ON); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode UPDATE(int i) {
			return getToken(SQLParser.UPDATE, i);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public List<TerminalNode> DELETE() { return getTokens(SQLParser.DELETE); }
		public TerminalNode SIMPLE() { return getToken(SQLParser.SIMPLE, 0); }
		public List<TerminalNode> UPDATE() { return getTokens(SQLParser.UPDATE); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode IMMEDIATE() { return getToken(SQLParser.IMMEDIATE, 0); }
		public References_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references_statement; }
	}

	public final References_statementContext references_statement() throws RecognitionException {
		References_statementContext _localctx = new References_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_references_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323); match(REFERENCES);
			setState(1324); ((References_statementContext)_localctx).ref_table = table_name();
			setState(1329);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1325); match(LEFT_PAREN);
				setState(1326); column_name_list();
				setState(1327); match(RIGHT_PAREN);
				}
			}

			setState(1333);
			_la = _input.LA(1);
			if (_la==MATCH) {
				{
				setState(1331); match(MATCH);
				setState(1332);
				_la = _input.LA(1);
				if ( !(_la==FULL || _la==PARTIAL || _la==SIMPLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(1335); match(ON);
				setState(1336);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1337); column_action();
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1346);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1343); match(DEFERRABLE);
				}
				break;
			case 2:
				{
				setState(1344); match(NOT);
				setState(1345); match(DEFERRABLE);
				}
				break;
			}
			setState(1352);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1348); match(INITIALLY);
				setState(1349); match(DEFERRED);
				}
				break;
			case 2:
				{
				setState(1350); match(INITIALLY);
				setState(1351); match(IMMEDIATE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_actionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public TerminalNode ACTION() { return getToken(SQLParser.ACTION, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Column_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_action; }
	}

	public final Column_actionContext column_action() throws RecognitionException {
		Column_actionContext _localctx = new Column_actionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_column_action);
		int _la;
		try {
			setState(1359);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1354); match(NO);
				setState(1355); match(ACTION);
				}
				break;
			case CASCADE:
			case RESTRICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356); cascade();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357); match(SET);
				setState(1358);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NULL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext index_method;
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(SQLParser.CHECK, 0); }
		public TerminalNode EXCLUDE() { return getToken(SQLParser.EXCLUDE, 0); }
		public Exclude_listContext exclude_list() {
			return getRuleContext(Exclude_listContext.class,0);
		}
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public References_statementContext references_statement() {
			return getRuleContext(References_statementContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode INHERIT() { return getToken(SQLParser.INHERIT, 0); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode FOREIGN() { return getToken(SQLParser.FOREIGN, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1361); match(CONSTRAINT);
				setState(1362); ((Table_constraintContext)_localctx).name = identifier();
				}
			}

			setState(1402);
			switch (_input.LA(1)) {
			case CHECK:
				{
				setState(1365); match(CHECK);
				setState(1366); match(LEFT_PAREN);
				setState(1367); search_condition();
				setState(1368); match(RIGHT_PAREN);
				setState(1371);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1369); match(NO);
					setState(1370); match(INHERIT);
					}
				}

				}
				break;
			case UNIQUE:
				{
				setState(1373); match(UNIQUE);
				setState(1374); match(LEFT_PAREN);
				setState(1375); column_name_list();
				setState(1376); match(RIGHT_PAREN);
				}
				break;
			case EXCLUDE:
				{
				setState(1378); match(EXCLUDE);
				setState(1381);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1379); match(USING);
					setState(1380); ((Table_constraintContext)_localctx).index_method = identifier();
					}
				}

				setState(1383); match(LEFT_PAREN);
				setState(1384); exclude_list();
				setState(1385); match(RIGHT_PAREN);
				setState(1387);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1386); where_clause();
					}
				}

				}
				break;
			case PRIMARY:
				{
				setState(1389); match(PRIMARY);
				setState(1390); match(KEY);
				setState(1391); match(LEFT_PAREN);
				setState(1392); column_name_list();
				setState(1393); match(RIGHT_PAREN);
				}
				break;
			case FOREIGN:
				{
				setState(1395); match(FOREIGN);
				setState(1396); match(KEY);
				setState(1397); match(LEFT_PAREN);
				setState(1398); column_name_list();
				setState(1399); match(RIGHT_PAREN);
				setState(1400); references_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclude_listContext extends ParserRuleContext {
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public List<Custom_operatorContext> custom_operator() {
			return getRuleContexts(Custom_operatorContext.class);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Custom_operatorContext custom_operator(int i) {
			return getRuleContext(Custom_operatorContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SQLParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SQLParser.WITH, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Exclude_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_list; }
	}

	public final Exclude_listContext exclude_list() throws RecognitionException {
		Exclude_listContext _localctx = new Exclude_listContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_exclude_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404); column_name();
			setState(1405); match(WITH);
			setState(1408);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
			case TILDE:
			case INTERSECT2D:
			case INTERSECT3D:
			case OVERLAP:
			case LEFT_OF:
			case RIGHT_OF:
			case ABOVE:
			case OVERLAPS_ABOVE:
			case BELOW:
			case BOX_EQUAL:
			case DISTANCE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
			case CUSTOME_OPERAND:
				{
				setState(1406); custom_operator();
				}
				break;
			case EQUAL:
			case NOT_EQUAL:
			case LTH:
			case LEQ:
			case GTH:
			case GEQ:
				{
				setState(1407); comp_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1410); match(COMMA);
				setState(1411); column_name();
				setState(1412); match(WITH);
				setState(1415);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULTIPLY:
				case DIVIDE:
				case TILDE:
				case INTERSECT2D:
				case INTERSECT3D:
				case OVERLAP:
				case LEFT_OF:
				case RIGHT_OF:
				case ABOVE:
				case OVERLAPS_ABOVE:
				case BELOW:
				case BOX_EQUAL:
				case DISTANCE:
				case NOT_SIMILAR:
				case SIMILAR_INSENSITIVE:
				case NOT_SIMILAR_INSENSITIVE:
				case CUSTOME_OPERAND:
					{
					setState(1413); custom_operator();
					}
					break;
				case EQUAL:
				case NOT_EQUAL:
				case LTH:
				case LEQ:
				case GTH:
				case GEQ:
					{
					setState(1414); comp_op();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_elementContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode CONSTRAINTS(int i) {
			return getToken(SQLParser.CONSTRAINTS, i);
		}
		public Field_typeContext field_type() {
			return getRuleContext(Field_typeContext.class,0);
		}
		public TerminalNode DEFAULTS(int i) {
			return getToken(SQLParser.DEFAULTS, i);
		}
		public TerminalNode INDEXES(int i) {
			return getToken(SQLParser.INDEXES, i);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public TerminalNode INCLUDING(int i) {
			return getToken(SQLParser.INCLUDING, i);
		}
		public List<TerminalNode> INCLUDING() { return getTokens(SQLParser.INCLUDING); }
		public List<TerminalNode> INDEXES() { return getTokens(SQLParser.INDEXES); }
		public List<TerminalNode> CONSTRAINTS() { return getTokens(SQLParser.CONSTRAINTS); }
		public List<TerminalNode> DEFAULTS() { return getTokens(SQLParser.DEFAULTS); }
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public TerminalNode EXCLUDING(int i) {
			return getToken(SQLParser.EXCLUDING, i);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> EXCLUDING() { return getTokens(SQLParser.EXCLUDING); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Field_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_element; }
	}

	public final Field_elementContext field_element() throws RecognitionException {
		Field_elementContext _localctx = new Field_elementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_field_element);
		int _la;
		try {
			setState(1443);
			switch (_input.LA(1)) {
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422); ((Field_elementContext)_localctx).name = identifier();
				setState(1423); field_type();
				setState(1425);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1424); collate_expression();
					}
				}

				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (UNIQUE - 68)) | (1L << (CHECK - 68)) | (1L << (CONSTRAINT - 68)))) != 0) || _la==PRIMARY || _la==REFERENCES) {
					{
					{
					setState(1427); column_constraint();
					}
					}
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNIQUE:
			case CHECK:
			case CONSTRAINT:
			case EXCLUDE:
			case FOREIGN:
			case PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433); table_constraint();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1434); match(LIKE);
				setState(1435); table_name();
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCLUDING || _la==INCLUDING) {
					{
					{
					setState(1436);
					_la = _input.LA(1);
					if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1437);
					_la = _input.LA(1);
					if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (CONSTRAINTS - 99)) | (1L << (DEFAULTS - 99)) | (1L << (INDEXES - 99)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(1442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Field_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_type; }
	}

	public final Field_typeContext field_type() throws RecognitionException {
		Field_typeContext _localctx = new Field_typeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_field_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445); data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_param_clauseContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public With_param_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_param_clause; }
	}

	public final With_param_clauseContext with_param_clause() throws RecognitionException {
		With_param_clauseContext _localctx = new With_param_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_with_param_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447); match(WITH);
			setState(1448); match(LEFT_PAREN);
			setState(1449); param();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1450); match(COMMA);
				setState(1451); param();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1457); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Numeric_value_expressionContext value;
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			switch (_input.LA(1)) {
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				{
				setState(1459); identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(1460); match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1465);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1463); match(EQUAL);
				setState(1464); ((ParamContext)_localctx).value = numeric_value_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_specifierContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public Method_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_specifier; }
	}

	public final Method_specifierContext method_specifier() throws RecognitionException {
		Method_specifierContext _localctx = new Method_specifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_method_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467); match(USING);
			setState(1468); value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_statementContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode FORCE() { return getToken(SQLParser.FORCE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode REINDEX() { return getToken(SQLParser.REINDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public Reindex_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_statement; }
	}

	public final Reindex_statementContext reindex_statement() throws RecognitionException {
		Reindex_statementContext _localctx = new Reindex_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_reindex_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470); match(REINDEX);
			setState(1471);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1472); ((Reindex_statementContext)_localctx).name = identifier();
			setState(1474);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(1473); match(FORCE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public Alter_table_actionContext alter_table_action(int i) {
			return getRuleContext(Alter_table_actionContext.class,i);
		}
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode ONLY() { return getToken(SQLParser.ONLY, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Alter_table_actionContext> alter_table_action() {
			return getRuleContexts(Alter_table_actionContext.class);
		}
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476); match(ALTER);
			setState(1477); match(TABLE);
			setState(1480);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1478); match(IF);
				setState(1479); match(EXISTS);
				}
			}

			setState(1483);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1482); match(ONLY);
				}
				break;
			}
			setState(1485); table_name();
			setState(1487);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(1486); match(MULTIPLY);
				}
			}

			setState(1489); alter_table_action();
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1490); match(COMMA);
				setState(1491); alter_table_action();
				}
				}
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_actionContext extends ParserRuleContext {
		public Table_nameContext new_table_name;
		public Table_nameContext inherit_table_name;
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public Alter_table_alter_columnContext alter_table_alter_column() {
			return getRuleContext(Alter_table_alter_columnContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public Alter_table_drop_constraintContext alter_table_drop_constraint() {
			return getRuleContext(Alter_table_drop_constraintContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SQLParser.RENAME, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode OIDS() { return getToken(SQLParser.OIDS, 0); }
		public Alter_table_rename_columnContext alter_table_rename_column() {
			return getRuleContext(Alter_table_rename_columnContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Alter_table_add_columnContext alter_table_add_column() {
			return getRuleContext(Alter_table_add_columnContext.class,0);
		}
		public TerminalNode OF() { return getToken(SQLParser.OF, 0); }
		public TerminalNode INHERIT() { return getToken(SQLParser.INHERIT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode WITHOUT() { return getToken(SQLParser.WITHOUT, 0); }
		public Alter_table_drop_columnContext alter_table_drop_column() {
			return getRuleContext(Alter_table_drop_columnContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Alter_table_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_action; }
	}

	public final Alter_table_actionContext alter_table_action() throws RecognitionException {
		Alter_table_actionContext _localctx = new Alter_table_actionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_alter_table_action);
		int _la;
		try {
			setState(1529);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497); alter_table_add_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498); alter_table_drop_column();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1499); alter_table_alter_column();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1500); alter_table_rename_column();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1501); alter_table_add_constraint();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1502); alter_table_drop_constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1503); match(RENAME);
				setState(1504); match(TO);
				setState(1505); ((Alter_table_actionContext)_localctx).new_table_name = table_name();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1506); match(SET);
				setState(1507); match(LEFT_PAREN);
				setState(1508); param();
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1509); match(COMMA);
					setState(1510); param();
					}
					}
					setState(1515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1516); match(RIGHT_PAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1519);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1518); match(NO);
					}
				}

				setState(1521); match(INHERIT);
				setState(1522); ((Alter_table_actionContext)_localctx).inherit_table_name = table_name();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1523);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1524); match(OIDS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1525); match(OF);
				setState(1526); data_type();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1527); match(NOT);
				setState(1528); match(OF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_columnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_constraintContext column_constraint() {
			return getRuleContext(Column_constraintContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public Alter_table_add_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_column; }
	}

	public final Alter_table_add_columnContext alter_table_add_column() throws RecognitionException {
		Alter_table_add_columnContext _localctx = new Alter_table_add_columnContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alter_table_add_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531); match(ADD);
			setState(1533);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1532); match(COLUMN);
				}
				break;
			}
			setState(1535); column_name();
			setState(1536); data_type();
			setState(1538);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1537); collate_expression();
				}
			}

			setState(1541);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFAULT) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (UNIQUE - 68)) | (1L << (CHECK - 68)) | (1L << (CONSTRAINT - 68)))) != 0) || _la==PRIMARY || _la==REFERENCES) {
				{
				setState(1540); column_constraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_drop_columnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public Alter_table_drop_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_drop_column; }
	}

	public final Alter_table_drop_columnContext alter_table_drop_column() throws RecognitionException {
		Alter_table_drop_columnContext _localctx = new Alter_table_drop_columnContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_alter_table_drop_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543); match(DROP);
			setState(1545);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1544); match(COLUMN);
				}
				break;
			}
			setState(1549);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1547); match(IF);
				setState(1548); match(EXISTS);
				}
			}

			setState(1551); column_name();
			setState(1553);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1552); cascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_alter_columnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public Alter_column_expressionContext alter_column_expression() {
			return getRuleContext(Alter_column_expressionContext.class,0);
		}
		public Alter_table_alter_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_alter_column; }
	}

	public final Alter_table_alter_columnContext alter_table_alter_column() throws RecognitionException {
		Alter_table_alter_columnContext _localctx = new Alter_table_alter_columnContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_alter_table_alter_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555); match(ALTER);
			setState(1557);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1556); match(COLUMN);
				}
				break;
			}
			setState(1559); column_name();
			setState(1560); alter_column_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_column_expressionContext extends ParserRuleContext {
		public IdentifierContext constraint_name;
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public TerminalNode EXTENDED() { return getToken(SQLParser.EXTENDED, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode STORAGE() { return getToken(SQLParser.STORAGE, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode MAIN() { return getToken(SQLParser.MAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLParser.EXTERNAL, 0); }
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public TerminalNode VALIDATE() { return getToken(SQLParser.VALIDATE, 0); }
		public TerminalNode DATA() { return getToken(SQLParser.DATA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode PLAIN() { return getToken(SQLParser.PLAIN, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public TerminalNode TYPE() { return getToken(SQLParser.TYPE, 0); }
		public Method_specifierContext method_specifier() {
			return getRuleContext(Method_specifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Alter_column_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_column_expression; }
	}

	public final Alter_column_expressionContext alter_column_expression() throws RecognitionException {
		Alter_column_expressionContext _localctx = new Alter_column_expressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_alter_column_expression);
		int _la;
		try {
			setState(1600);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1562); match(SET);
					setState(1563); match(DATA);
					}
				}

				setState(1566); match(TYPE);
				setState(1567); data_type();
				setState(1569);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1568); collate_expression();
					}
				}

				setState(1572);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1571); method_specifier();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574); match(VALIDATE);
				setState(1575); match(CONSTRAINT);
				setState(1576); ((Alter_column_expressionContext)_localctx).constraint_name = identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1577); match(SET);
				setState(1578); match(DEFAULT);
				setState(1579); value_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1580); match(SET);
				setState(1581); match(LEFT_PAREN);
				setState(1582); param();
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1583); match(COMMA);
					setState(1584); param();
					}
					}
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1590); match(RIGHT_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1592); match(SET);
				setState(1593); match(STORAGE);
				setState(1594);
				_la = _input.LA(1);
				if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (EXTENDED - 124)) | (1L << (EXTERNAL - 124)) | (1L << (MAIN - 124)))) != 0) || _la==PLAIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1595); match(DROP);
				setState(1596); match(DEFAULT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1597);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1598); match(NOT);
				setState(1599); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_rename_columnContext extends ParserRuleContext {
		public Column_nameContext src;
		public Column_nameContext dest;
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(SQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public Alter_table_rename_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_rename_column; }
	}

	public final Alter_table_rename_columnContext alter_table_rename_column() throws RecognitionException {
		Alter_table_rename_columnContext _localctx = new Alter_table_rename_columnContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alter_table_rename_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602); match(RENAME);
			setState(1604);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1603); match(COLUMN);
				}
				break;
			}
			setState(1606); ((Alter_table_rename_columnContext)_localctx).src = column_name();
			setState(1607); match(TO);
			setState(1608); ((Alter_table_rename_columnContext)_localctx).dest = column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public IdentifierContext name;
		public Table_nameContext index_name;
		public TerminalNode VALID() { return getToken(SQLParser.VALID, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_alter_table_add_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610); match(ADD);
			setState(1628);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1611); table_constraint();
				setState(1614);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1612); match(NOT);
					setState(1613); match(VALID);
					}
				}

				}
				break;
			case 2:
				{
				setState(1618);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1616); match(CONSTRAINT);
					setState(1617); ((Alter_table_add_constraintContext)_localctx).name = identifier();
					}
				}

				setState(1623);
				switch (_input.LA(1)) {
				case UNIQUE:
					{
					setState(1620); match(UNIQUE);
					}
					break;
				case PRIMARY:
					{
					setState(1621); match(PRIMARY);
					setState(1622); match(KEY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1625); match(USING);
				setState(1626); match(INDEX);
				setState(1627); ((Alter_table_add_constraintContext)_localctx).index_name = table_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_drop_constraintContext extends ParserRuleContext {
		public IdentifierContext constraint_name;
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Alter_table_drop_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_drop_constraint; }
	}

	public final Alter_table_drop_constraintContext alter_table_drop_constraint() throws RecognitionException {
		Alter_table_drop_constraintContext _localctx = new Alter_table_drop_constraintContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_alter_table_drop_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630); match(DROP);
			setState(1631); match(CONSTRAINT);
			setState(1634);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1632); match(IF);
				setState(1633); match(EXISTS);
				}
			}

			setState(1636); ((Alter_table_drop_constraintContext)_localctx).constraint_name = identifier();
			setState(1638);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1637); cascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640); match(DROP);
			setState(1641); match(TABLE);
			setState(1644);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1642); match(IF);
				setState(1643); match(EXISTS);
				}
			}

			setState(1646); table_name_list();
			setState(1648);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1647); cascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_statementContext extends ParserRuleContext {
		public Table_name_listContext view_name_list;
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SQLParser.MATERIALIZED, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(SQLParser.VIEW, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public Drop_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_statement; }
	}

	public final Drop_view_statementContext drop_view_statement() throws RecognitionException {
		Drop_view_statementContext _localctx = new Drop_view_statementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_drop_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650); match(DROP);
			setState(1652);
			_la = _input.LA(1);
			if (_la==MATERIALIZED) {
				{
				setState(1651); match(MATERIALIZED);
				}
			}

			setState(1654); match(VIEW);
			setState(1657);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1655); match(IF);
				setState(1656); match(EXISTS);
				}
			}

			setState(1659); ((Drop_view_statementContext)_localctx).view_name_list = table_name_list();
			setState(1661);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1660); cascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_statementContext extends ParserRuleContext {
		public Table_name_listContext index_name_list;
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(SQLParser.CONCURRENTLY, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public Drop_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_statement; }
	}

	public final Drop_index_statementContext drop_index_statement() throws RecognitionException {
		Drop_index_statementContext _localctx = new Drop_index_statementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_drop_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663); match(DROP);
			setState(1664); match(INDEX);
			setState(1666);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1665); match(CONCURRENTLY);
				}
			}

			setState(1670);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1668); match(IF);
				setState(1669); match(EXISTS);
				}
			}

			setState(1672); ((Drop_index_statementContext)_localctx).index_name_list = table_name_list();
			setState(1674);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1673); cascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_sequence_statementContext extends ParserRuleContext {
		public Table_name_listContext sequence_name_list;
		public TerminalNode DISCARD() { return getToken(SQLParser.DISCARD, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode SEQUENCE() { return getToken(SQLParser.SEQUENCE, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode SEQUENCES() { return getToken(SQLParser.SEQUENCES, 0); }
		public Drop_sequence_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_sequence_statement; }
	}

	public final Drop_sequence_statementContext drop_sequence_statement() throws RecognitionException {
		Drop_sequence_statementContext _localctx = new Drop_sequence_statementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_drop_sequence_statement);
		int _la;
		try {
			setState(1688);
			switch (_input.LA(1)) {
			case DROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1676); match(DROP);
				setState(1677); match(SEQUENCE);
				setState(1680);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1678); match(IF);
					setState(1679); match(EXISTS);
					}
				}

				setState(1682); ((Drop_sequence_statementContext)_localctx).sequence_name_list = table_name_list();
				setState(1684);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(1683); cascade();
					}
				}

				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1686); match(DISCARD);
				setState(1687); match(SEQUENCES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_statementContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(SQLParser.IDENTITY, 0); }
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public TerminalNode RESTART() { return getToken(SQLParser.RESTART, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SQLParser.TRUNCATE, 0); }
		public TerminalNode CONTINUE() { return getToken(SQLParser.CONTINUE, 0); }
		public Truncate_target_listContext truncate_target_list() {
			return getRuleContext(Truncate_target_listContext.class,0);
		}
		public Truncate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_statement; }
	}

	public final Truncate_statementContext truncate_statement() throws RecognitionException {
		Truncate_statementContext _localctx = new Truncate_statementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_truncate_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690); match(TRUNCATE);
			setState(1692);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1691); match(TABLE);
				}
			}

			setState(1694); truncate_target_list();
			setState(1697);
			_la = _input.LA(1);
			if (_la==CONTINUE || _la==RESTART) {
				{
				setState(1695);
				_la = _input.LA(1);
				if ( !(_la==CONTINUE || _la==RESTART) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1696); match(IDENTITY);
				}
			}

			setState(1700);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1699); cascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_target_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode ONLY(int i) {
			return getToken(SQLParser.ONLY, i);
		}
		public List<TerminalNode> ONLY() { return getTokens(SQLParser.ONLY); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Truncate_target_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_target_list; }
	}

	public final Truncate_target_listContext truncate_target_list() throws RecognitionException {
		Truncate_target_listContext _localctx = new Truncate_target_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_truncate_target_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1702); match(ONLY);
				}
				break;
			}
			setState(1705); table_name();
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1706); match(COMMA);
				setState(1708);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1707); match(ONLY);
					}
					break;
				}
				setState(1710); table_name();
				}
				}
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CascadeContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(SQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLParser.RESTRICT, 0); }
		public CascadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascade; }
	}

	public final CascadeContext cascade() throws RecognitionException {
		CascadeContext _localctx = new CascadeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_cascade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			_la = _input.LA(1);
			if ( !(_la==CASCADE || _la==RESTRICT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SQLParser.QUOTED_IDENTIFIER, 0); }
		public Nonreserved_keywordsContext nonreserved_keywords() {
			return getRuleContext(Nonreserved_keywordsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifier);
		int _la;
		try {
			setState(1720);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==QUOTED_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1719); nonreserved_keywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonreserved_keywordsContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode BIT() { return getToken(SQLParser.BIT, 0); }
		public TerminalNode COALESCE() { return getToken(SQLParser.COALESCE, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SQLParser.VAR_SAMP, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode EVERY() { return getToken(SQLParser.EVERY, 0); }
		public TerminalNode NVARCHAR() { return getToken(SQLParser.NVARCHAR, 0); }
		public TerminalNode INT1() { return getToken(SQLParser.INT1, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode ROLLUP() { return getToken(SQLParser.ROLLUP, 0); }
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode SIMILAR() { return getToken(SQLParser.SIMILAR, 0); }
		public TerminalNode RLIKE() { return getToken(SQLParser.RLIKE, 0); }
		public TerminalNode BYTEA() { return getToken(SQLParser.BYTEA, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLParser.INTERVAL, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLParser.VARBINARY, 0); }
		public TerminalNode ANALYZE() { return getToken(SQLParser.ANALYZE, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode INET4() { return getToken(SQLParser.INET4, 0); }
		public TerminalNode FLOAT8() { return getToken(SQLParser.FLOAT8, 0); }
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode USAGE() { return getToken(SQLParser.USAGE, 0); }
		public TerminalNode VAR_POP() { return getToken(SQLParser.VAR_POP, 0); }
		public TerminalNode ISOYEAR() { return getToken(SQLParser.ISOYEAR, 0); }
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public TerminalNode LAST() { return getToken(SQLParser.LAST, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode CASCADE() { return getToken(SQLParser.CASCADE, 0); }
		public TerminalNode DATA() { return getToken(SQLParser.DATA, 0); }
		public TerminalNode OVERWRITE() { return getToken(SQLParser.OVERWRITE, 0); }
		public TerminalNode NCHAR() { return getToken(SQLParser.NCHAR, 0); }
		public TerminalNode ONLY() { return getToken(SQLParser.ONLY, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(SQLParser.TIMEZONE_HOUR, 0); }
		public TerminalNode TIMETZ() { return getToken(SQLParser.TIMETZ, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLParser.FOLLOWING, 0); }
		public TerminalNode TABLESPACE() { return getToken(SQLParser.TABLESPACE, 0); }
		public TerminalNode VERBOSE() { return getToken(SQLParser.VERBOSE, 0); }
		public TerminalNode TEXT() { return getToken(SQLParser.TEXT, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode BLOB() { return getToken(SQLParser.BLOB, 0); }
		public TerminalNode DEC() { return getToken(SQLParser.DEC, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLParser.PRECEDING, 0); }
		public TerminalNode INTERSECTION() { return getToken(SQLParser.INTERSECTION, 0); }
		public TerminalNode CURSOR() { return getToken(SQLParser.CURSOR, 0); }
		public TerminalNode LESS() { return getToken(SQLParser.LESS, 0); }
		public TerminalNode MILLENNIUM() { return getToken(SQLParser.MILLENNIUM, 0); }
		public TerminalNode TINYINT() { return getToken(SQLParser.TINYINT, 0); }
		public TerminalNode GROUPING() { return getToken(SQLParser.GROUPING, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(SQLParser.TIMESTAMPTZ, 0); }
		public TerminalNode NATIONAL() { return getToken(SQLParser.NATIONAL, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public TerminalNode FUSION() { return getToken(SQLParser.FUSION, 0); }
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public TerminalNode INT2() { return getToken(SQLParser.INT2, 0); }
		public TerminalNode VARBIT() { return getToken(SQLParser.VARBIT, 0); }
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode SEQUENCES() { return getToken(SQLParser.SEQUENCES, 0); }
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode LOCATION() { return getToken(SQLParser.LOCATION, 0); }
		public TerminalNode CENTURY() { return getToken(SQLParser.CENTURY, 0); }
		public TerminalNode LIST() { return getToken(SQLParser.LIST, 0); }
		public TerminalNode RETURNING() { return getToken(SQLParser.RETURNING, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode RECURSIVE() { return getToken(SQLParser.RECURSIVE, 0); }
		public TerminalNode CYCLE() { return getToken(SQLParser.CYCLE, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode TYPE() { return getToken(SQLParser.TYPE, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLParser.SMALLINT, 0); }
		public TerminalNode ISODOW() { return getToken(SQLParser.ISODOW, 0); }
		public TerminalNode FORMAT() { return getToken(SQLParser.FORMAT, 0); }
		public TerminalNode WINDOW() { return getToken(SQLParser.WINDOW, 0); }
		public TerminalNode DOY() { return getToken(SQLParser.DOY, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode FILTER() { return getToken(SQLParser.FILTER, 0); }
		public TerminalNode PRECISION() { return getToken(SQLParser.PRECISION, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLParser.RESTRICT, 0); }
		public TerminalNode SUBPARTITION() { return getToken(SQLParser.SUBPARTITION, 0); }
		public TerminalNode DOW() { return getToken(SQLParser.DOW, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLParser.EXTERNAL, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SQLParser.MICROSECONDS, 0); }
		public TerminalNode HASH() { return getToken(SQLParser.HASH, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLParser.DECIMAL, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode THAN() { return getToken(SQLParser.THAN, 0); }
		public TerminalNode EPOCH() { return getToken(SQLParser.EPOCH, 0); }
		public TerminalNode REGEXP() { return getToken(SQLParser.REGEXP, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public TerminalNode TIMEZONE() { return getToken(SQLParser.TIMEZONE, 0); }
		public TerminalNode FLOAT4() { return getToken(SQLParser.FLOAT4, 0); }
		public TerminalNode TABLES() { return getToken(SQLParser.TABLES, 0); }
		public TerminalNode CUBE() { return getToken(SQLParser.CUBE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(SQLParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode REAL() { return getToken(SQLParser.REAL, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode COLLECT() { return getToken(SQLParser.COLLECT, 0); }
		public TerminalNode BIGINT() { return getToken(SQLParser.BIGINT, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public TerminalNode EXTRACT() { return getToken(SQLParser.EXTRACT, 0); }
		public TerminalNode INT4() { return getToken(SQLParser.INT4, 0); }
		public TerminalNode MAXVALUE() { return getToken(SQLParser.MAXVALUE, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SQLParser.MILLISECONDS, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLParser.NUMERIC, 0); }
		public TerminalNode BOOL() { return getToken(SQLParser.BOOL, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLParser.SEQUENCE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLParser.UNBOUNDED, 0); }
		public TerminalNode INT8() { return getToken(SQLParser.INT8, 0); }
		public TerminalNode HOUR() { return getToken(SQLParser.HOUR, 0); }
		public TerminalNode REPLACE() { return getToken(SQLParser.REPLACE, 0); }
		public TerminalNode DECADE() { return getToken(SQLParser.DECADE, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLParser.PARTITIONS, 0); }
		public Nonreserved_keywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonreserved_keywords; }
	}

	public final Nonreserved_keywordsContext nonreserved_keywords() throws RecognitionException {
		Nonreserved_keywordsContext _localctx = new Nonreserved_keywordsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ANALYZE - 80)) | (1L << (AVG - 80)) | (1L << (BETWEEN - 80)) | (1L << (BY - 80)) | (1L << (CASCADE - 80)) | (1L << (CENTURY - 80)) | (1L << (CHARACTER - 80)) | (1L << (COLLECT - 80)) | (1L << (COALESCE - 80)) | (1L << (COLUMN - 80)) | (1L << (COUNT - 80)) | (1L << (CUBE - 80)) | (1L << (CURSOR - 80)) | (1L << (CYCLE - 80)) | (1L << (DATA - 80)) | (1L << (DAY - 80)) | (1L << (DEC - 80)) | (1L << (DECADE - 80)) | (1L << (DOW - 80)) | (1L << (DOY - 80)) | (1L << (DROP - 80)) | (1L << (EPOCH - 80)) | (1L << (EVERY - 80)) | (1L << (EXTERNAL - 80)) | (1L << (EXTRACT - 80)) | (1L << (FILTER - 80)) | (1L << (FIRST - 80)) | (1L << (FOLLOWING - 80)) | (1L << (FORMAT - 80)) | (1L << (FUSION - 80)) | (1L << (GROUPING - 80)) | (1L << (HASH - 80)) | (1L << (HOUR - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (INDEX - 144)) | (1L << (INSERT - 144)) | (1L << (INTERSECTION - 144)) | (1L << (ISODOW - 144)) | (1L << (ISOYEAR - 144)) | (1L << (KEY - 144)) | (1L << (LAST - 144)) | (1L << (LESS - 144)) | (1L << (LIST - 144)) | (1L << (LOCATION - 144)) | (1L << (MAX - 144)) | (1L << (MAXVALUE - 144)) | (1L << (MICROSECONDS - 144)) | (1L << (MILLENNIUM - 144)) | (1L << (MILLISECONDS - 144)) | (1L << (MIN - 144)) | (1L << (MINUTE - 144)) | (1L << (MONTH - 144)) | (1L << (NATIONAL - 144)) | (1L << (NULLIF - 144)) | (1L << (ONLY - 144)) | (1L << (OVERWRITE - 144)) | (1L << (PARTITION - 144)) | (1L << (PARTITIONS - 144)) | (1L << (PRECEDING - 144)) | (1L << (PRECISION - 144)) | (1L << (QUARTER - 144)) | (1L << (RANGE - 144)) | (1L << (RECURSIVE - 144)) | (1L << (REGEXP - 144)) | (1L << (REPLACE - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (RESTRICT - 208)) | (1L << (RETURNING - 208)) | (1L << (RLIKE - 208)) | (1L << (ROLLUP - 208)) | (1L << (ROWS - 208)) | (1L << (SCHEMA - 208)) | (1L << (SECOND - 208)) | (1L << (SEQUENCE - 208)) | (1L << (SEQUENCES - 208)) | (1L << (SET - 208)) | (1L << (SIMILAR - 208)) | (1L << (STDDEV_POP - 208)) | (1L << (STDDEV_SAMP - 208)) | (1L << (SUBPARTITION - 208)) | (1L << (SUM - 208)) | (1L << (TABLES - 208)) | (1L << (TABLESPACE - 208)) | (1L << (THAN - 208)) | (1L << (TIMEZONE - 208)) | (1L << (TIMEZONE_HOUR - 208)) | (1L << (TIMEZONE_MINUTE - 208)) | (1L << (TRIM - 208)) | (1L << (TO - 208)) | (1L << (TYPE - 208)) | (1L << (UNBOUNDED - 208)) | (1L << (UNKNOWN - 208)) | (1L << (USAGE - 208)) | (1L << (VAR_SAMP - 208)) | (1L << (VAR_POP - 208)) | (1L << (VARYING - 208)) | (1L << (VERBOSE - 208)) | (1L << (WEEK - 208)) | (1L << (WINDOW - 208)) | (1L << (YEAR - 208)) | (1L << (ZONE - 208)) | (1L << (BOOLEAN - 208)) | (1L << (BOOL - 208)) | (1L << (BIT - 208)) | (1L << (VARBIT - 208)) | (1L << (INT1 - 208)) | (1L << (INT2 - 208)) | (1L << (INT4 - 208)) | (1L << (INT8 - 208)) | (1L << (TINYINT - 208)) | (1L << (SMALLINT - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (BIGINT - 272)) | (1L << (FLOAT4 - 272)) | (1L << (FLOAT8 - 272)) | (1L << (REAL - 272)) | (1L << (FLOAT - 272)) | (1L << (DOUBLE - 272)) | (1L << (NUMERIC - 272)) | (1L << (DECIMAL - 272)) | (1L << (CHAR - 272)) | (1L << (VARCHAR - 272)) | (1L << (NCHAR - 272)) | (1L << (NVARCHAR - 272)) | (1L << (DATE - 272)) | (1L << (INTERVAL - 272)) | (1L << (TIME - 272)) | (1L << (TIMETZ - 272)) | (1L << (TIMESTAMP - 272)) | (1L << (TIMESTAMPTZ - 272)) | (1L << (TEXT - 272)) | (1L << (VARBINARY - 272)) | (1L << (BLOB - 272)) | (1L << (BYTEA - 272)) | (1L << (INET4 - 272)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_literalContext extends ParserRuleContext {
		public General_literalContext general_literal() {
			return getRuleContext(General_literalContext.class,0);
		}
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Unsigned_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_literal; }
	}

	public final Unsigned_literalContext unsigned_literal() throws RecognitionException {
		Unsigned_literalContext _localctx = new Unsigned_literalContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unsigned_literal);
		try {
			setState(1726);
			switch (_input.LA(1)) {
			case NUMBER:
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724); unsigned_numeric_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case REGEX:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1725); general_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode REGEX() { return getToken(SQLParser.REGEX, 0); }
		public Datetime_literalContext datetime_literal() {
			return getRuleContext(Datetime_literalContext.class,0);
		}
		public General_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_literal; }
	}

	public final General_literalContext general_literal() throws RecognitionException {
		General_literalContext _localctx = new General_literalContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_general_literal);
		try {
			setState(1732);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1728); match(STRING_LITERAL);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1729); match(REGEX);
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1730); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1731); boolean_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datetime_literalContext extends ParserRuleContext {
		public Interval_literalContext interval_literal() {
			return getRuleContext(Interval_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Time_literalContext time_literal() {
			return getRuleContext(Time_literalContext.class,0);
		}
		public Datetime_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_literal; }
	}

	public final Datetime_literalContext datetime_literal() throws RecognitionException {
		Datetime_literalContext _localctx = new Datetime_literalContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_datetime_literal);
		try {
			setState(1738);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1736); date_literal();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1737); interval_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_literalContext extends ParserRuleContext {
		public Token interval_string;
		public Interval_precisionContext interval_precision(int i) {
			return getRuleContext(Interval_precisionContext.class,i);
		}
		public List<Interval_precisionContext> interval_precision() {
			return getRuleContexts(Interval_precisionContext.class);
		}
		public Interval_qualifierContext interval_qualifier() {
			return getRuleContext(Interval_qualifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLParser.INTERVAL, 0); }
		public Interval_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_literal; }
	}

	public final Interval_literalContext interval_literal() throws RecognitionException {
		Interval_literalContext _localctx = new Interval_literalContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_interval_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740); match(INTERVAL);
			setState(1742);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(1741); interval_precision();
				}
			}

			setState(1744); ((Interval_literalContext)_localctx).interval_string = match(STRING_LITERAL);
			setState(1746);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1745); interval_qualifier();
				}
				break;
			}
			setState(1749);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1748); interval_precision();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_qualifierContext extends ParserRuleContext {
		public List<Primary_datetime_fieldContext> primary_datetime_field() {
			return getRuleContexts(Primary_datetime_fieldContext.class);
		}
		public Primary_datetime_fieldContext primary_datetime_field(int i) {
			return getRuleContext(Primary_datetime_fieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public Interval_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_qualifier; }
	}

	public final Interval_qualifierContext interval_qualifier() throws RecognitionException {
		Interval_qualifierContext _localctx = new Interval_qualifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_interval_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751); primary_datetime_field();
			setState(1754);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1752); match(TO);
				setState(1753); primary_datetime_field();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_precisionContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Interval_precisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_precision; }
	}

	public final Interval_precisionContext interval_precision() throws RecognitionException {
		Interval_precisionContext _localctx = new Interval_precisionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_interval_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756); match(LEFT_PAREN);
			setState(1757); unsigned_numeric_literal();
			setState(1758); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_literalContext extends ParserRuleContext {
		public Token time_string;
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Time_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_literal; }
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760); match(TIME);
			setState(1761); ((Time_literalContext)_localctx).time_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public Token timestamp_string;
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763); match(TIMESTAMP);
			setState(1764); ((Timestamp_literalContext)_localctx).timestamp_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public Token date_string;
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); match(DATE);
			setState(1767); ((Date_literalContext)_localctx).date_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public List<Array_type_qualifierContext> array_type_qualifier() {
			return getRuleContexts(Array_type_qualifierContext.class);
		}
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Postgis_typeContext postgis_type() {
			return getRuleContext(Postgis_typeContext.class,0);
		}
		public Array_type_qualifierContext array_type_qualifier(int i) {
			return getRuleContext(Array_type_qualifierContext.class,i);
		}
		public UdtContext udt() {
			return getRuleContext(UdtContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_data_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1771); predefined_type();
				}
				break;
			case 2:
				{
				setState(1772); postgis_type();
				}
				break;
			case 3:
				{
				setState(1773); udt();
				}
				break;
			}
			setState(1779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1776); array_type_qualifier();
					}
					} 
				}
				setState(1781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UdtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udt; }
	}

	public final UdtContext udt() throws RecognitionException {
		UdtContext _localctx = new UdtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_udt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postgis_typeContext extends ParserRuleContext {
		public TerminalNode GEOMETRY() { return getToken(SQLParser.GEOMETRY, 0); }
		public TerminalNode BOX2D() { return getToken(SQLParser.BOX2D, 0); }
		public TerminalNode GEOGRAPHY() { return getToken(SQLParser.GEOGRAPHY, 0); }
		public TerminalNode GEOMETRY_DUMP() { return getToken(SQLParser.GEOMETRY_DUMP, 0); }
		public TerminalNode BOX3D() { return getToken(SQLParser.BOX3D, 0); }
		public Postgis_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postgis_type; }
	}

	public final Postgis_typeContext postgis_type() throws RecognitionException {
		Postgis_typeContext _localctx = new Postgis_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_postgis_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			_la = _input.LA(1);
			if ( !(((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (BOX2D - 298)) | (1L << (BOX3D - 298)) | (1L << (GEOMETRY - 298)) | (1L << (GEOMETRY_DUMP - 298)) | (1L << (GEOGRAPHY - 298)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public Bit_typeContext bit_type() {
			return getRuleContext(Bit_typeContext.class,0);
		}
		public Network_typeContext network_type() {
			return getRuleContext(Network_typeContext.class,0);
		}
		public Character_string_typeContext character_string_type() {
			return getRuleContext(Character_string_typeContext.class,0);
		}
		public Binary_large_object_string_typeContext binary_large_object_string_type() {
			return getRuleContext(Binary_large_object_string_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public National_character_string_typeContext national_character_string_type() {
			return getRuleContext(National_character_string_typeContext.class,0);
		}
		public Text_search_typeContext text_search_type() {
			return getRuleContext(Text_search_typeContext.class,0);
		}
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Binary_typeContext binary_type() {
			return getRuleContext(Binary_typeContext.class,0);
		}
		public Datetime_typeContext datetime_type() {
			return getRuleContext(Datetime_typeContext.class,0);
		}
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_predefined_type);
		try {
			setState(1796);
			switch (_input.LA(1)) {
			case CHARACTER:
			case CHAR:
			case VARCHAR:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1786); character_string_type();
				}
				break;
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1787); national_character_string_type();
				}
				break;
			case BLOB:
			case BYTEA:
				enterOuterAlt(_localctx, 3);
				{
				setState(1788); binary_large_object_string_type();
				}
				break;
			case TSVECTOR:
			case TSQUERY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1789); text_search_type();
				}
				break;
			case DEC:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1790); numeric_type();
				}
				break;
			case BOOLEAN:
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1791); boolean_type();
				}
				break;
			case DATE:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
				enterOuterAlt(_localctx, 7);
				{
				setState(1792); datetime_type();
				}
				break;
			case BIT:
			case VARBIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1793); bit_type();
				}
				break;
			case BINARY:
			case VARBINARY:
				enterOuterAlt(_localctx, 9);
				{
				setState(1794); binary_type();
				}
				break;
			case INET4:
				enterOuterAlt(_localctx, 10);
				{
				setState(1795); network_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_type_qualifierContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE() { return getToken(SQLParser.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(SQLParser.RIGHT_SQUARE, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(SQLParser.ARRAY, 0); }
		public Array_type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type_qualifier; }
	}

	public final Array_type_qualifierContext array_type_qualifier() throws RecognitionException {
		Array_type_qualifierContext _localctx = new Array_type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_array_type_qualifier);
		int _la;
		try {
			setState(1808);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799);
				_la = _input.LA(1);
				if (_la==ARRAY) {
					{
					setState(1798); match(ARRAY);
					}
				}

				setState(1801); match(LEFT_SQUARE);
				setState(1804);
				switch (_input.LA(1)) {
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case TSVECTOR:
				case TSQUERY:
				case BINARY:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case BOX2D:
				case BOX3D:
				case GEOMETRY:
				case GEOMETRY_DUMP:
				case GEOGRAPHY:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(1802); data_type();
					}
					break;
				case NUMBER:
				case REAL_NUMBER:
					{
					setState(1803); unsigned_numeric_literal();
					}
					break;
				case RIGHT_SQUARE:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1806); match(RIGHT_SQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807); match(ARRAY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Network_typeContext extends ParserRuleContext {
		public TerminalNode INET4() { return getToken(SQLParser.INET4, 0); }
		public Network_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_network_type; }
	}

	public final Network_typeContext network_type() throws RecognitionException {
		Network_typeContext _localctx = new Network_typeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_network_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810); match(INET4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_string_typeContext extends ParserRuleContext {
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(SQLParser.TEXT, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public Character_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_string_type; }
	}

	public final Character_string_typeContext character_string_type() throws RecognitionException {
		Character_string_typeContext _localctx = new Character_string_typeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_character_string_type);
		try {
			setState(1835);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1812); match(CHARACTER);
				setState(1814);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1813); type_length();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816); match(CHAR);
				setState(1818);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1817); type_length();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1820); match(CHARACTER);
				setState(1821); match(VARYING);
				setState(1823);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1822); type_length();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1825); match(CHAR);
				setState(1826); match(VARYING);
				setState(1828);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1827); type_length();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1830); match(VARCHAR);
				setState(1832);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1831); type_length();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1834); match(TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_search_typeContext extends ParserRuleContext {
		public TerminalNode TSVECTOR() { return getToken(SQLParser.TSVECTOR, 0); }
		public TerminalNode TSQUERY() { return getToken(SQLParser.TSQUERY, 0); }
		public Text_search_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_search_type; }
	}

	public final Text_search_typeContext text_search_type() throws RecognitionException {
		Text_search_typeContext _localctx = new Text_search_typeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_text_search_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			_la = _input.LA(1);
			if ( !(_la==TSVECTOR || _la==TSQUERY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_lengthContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Type_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_length; }
	}

	public final Type_lengthContext type_length() throws RecognitionException {
		Type_lengthContext _localctx = new Type_lengthContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_type_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839); match(LEFT_PAREN);
			setState(1840); match(NUMBER);
			setState(1841); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class National_character_string_typeContext extends ParserRuleContext {
		public TerminalNode NATIONAL() { return getToken(SQLParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode CHARACTER() { return getToken(SQLParser.CHARACTER, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode NVARCHAR() { return getToken(SQLParser.NVARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(SQLParser.NCHAR, 0); }
		public TerminalNode CHAR() { return getToken(SQLParser.CHAR, 0); }
		public National_character_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_national_character_string_type; }
	}

	public final National_character_string_typeContext national_character_string_type() throws RecognitionException {
		National_character_string_typeContext _localctx = new National_character_string_typeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_national_character_string_type);
		try {
			setState(1878);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1843); match(NATIONAL);
				setState(1844); match(CHARACTER);
				setState(1846);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1845); type_length();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1848); match(NATIONAL);
				setState(1849); match(CHAR);
				setState(1851);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1850); type_length();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1853); match(NCHAR);
				setState(1855);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1854); type_length();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1857); match(NATIONAL);
				setState(1858); match(CHARACTER);
				setState(1859); match(VARYING);
				setState(1861);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1860); type_length();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1863); match(NATIONAL);
				setState(1864); match(CHAR);
				setState(1865); match(VARYING);
				setState(1867);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1866); type_length();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1869); match(NCHAR);
				setState(1870); match(VARYING);
				setState(1872);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1871); type_length();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1874); match(NVARCHAR);
				setState(1876);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1875); type_length();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_large_object_string_typeContext extends ParserRuleContext {
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode BLOB() { return getToken(SQLParser.BLOB, 0); }
		public TerminalNode BYTEA() { return getToken(SQLParser.BYTEA, 0); }
		public Binary_large_object_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_large_object_string_type; }
	}

	public final Binary_large_object_string_typeContext binary_large_object_string_type() throws RecognitionException {
		Binary_large_object_string_typeContext _localctx = new Binary_large_object_string_typeContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_binary_large_object_string_type);
		try {
			setState(1888);
			switch (_input.LA(1)) {
			case BLOB:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880); match(BLOB);
				setState(1882);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1881); type_length();
					}
					break;
				}
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1884); match(BYTEA);
				setState(1886);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1885); type_length();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_typeContext extends ParserRuleContext {
		public Exact_numeric_typeContext exact_numeric_type() {
			return getRuleContext(Exact_numeric_typeContext.class,0);
		}
		public Approximate_numeric_typeContext approximate_numeric_type() {
			return getRuleContext(Approximate_numeric_typeContext.class,0);
		}
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_numeric_type);
		try {
			setState(1892);
			switch (_input.LA(1)) {
			case DEC:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case NUMERIC:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890); exact_numeric_type();
				}
				break;
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1891); approximate_numeric_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exact_numeric_typeContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(SQLParser.TINYINT, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode DEC() { return getToken(SQLParser.DEC, 0); }
		public TerminalNode INT1() { return getToken(SQLParser.INT1, 0); }
		public TerminalNode INT4() { return getToken(SQLParser.INT4, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLParser.NUMERIC, 0); }
		public Precision_paramContext precision_param() {
			return getRuleContext(Precision_paramContext.class,0);
		}
		public TerminalNode INT8() { return getToken(SQLParser.INT8, 0); }
		public TerminalNode INT2() { return getToken(SQLParser.INT2, 0); }
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(SQLParser.BIGINT, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLParser.DECIMAL, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLParser.SMALLINT, 0); }
		public Exact_numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact_numeric_type; }
	}

	public final Exact_numeric_typeContext exact_numeric_type() throws RecognitionException {
		Exact_numeric_typeContext _localctx = new Exact_numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_exact_numeric_type);
		int _la;
		try {
			setState(1907);
			switch (_input.LA(1)) {
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1894); match(NUMERIC);
				setState(1896);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1895); precision_param();
					}
					break;
				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898); match(DECIMAL);
				setState(1900);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1899); precision_param();
					}
					break;
				}
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1902); match(DEC);
				setState(1904);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1903); precision_param();
					}
					break;
				}
				}
				break;
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1906);
				_la = _input.LA(1);
				if ( !(((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Approximate_numeric_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public Precision_paramContext precision_param() {
			return getRuleContext(Precision_paramContext.class,0);
		}
		public TerminalNode FLOAT4() { return getToken(SQLParser.FLOAT4, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode REAL() { return getToken(SQLParser.REAL, 0); }
		public TerminalNode PRECISION() { return getToken(SQLParser.PRECISION, 0); }
		public TerminalNode FLOAT8() { return getToken(SQLParser.FLOAT8, 0); }
		public Approximate_numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_approximate_numeric_type; }
	}

	public final Approximate_numeric_typeContext approximate_numeric_type() throws RecognitionException {
		Approximate_numeric_typeContext _localctx = new Approximate_numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_approximate_numeric_type);
		int _la;
		try {
			setState(1916);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1909);
				_la = _input.LA(1);
				if ( !(((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & ((1L << (FLOAT4 - 273)) | (1L << (FLOAT8 - 273)) | (1L << (REAL - 273)) | (1L << (DOUBLE - 273)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1910); match(DOUBLE);
				setState(1911); match(PRECISION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1912); match(FLOAT);
				setState(1914);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1913); precision_param();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precision_paramContext extends ParserRuleContext {
		public Token precision;
		public Token scale;
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(SQLParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SQLParser.NUMBER); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Precision_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_param; }
	}

	public final Precision_paramContext precision_param() throws RecognitionException {
		Precision_paramContext _localctx = new Precision_paramContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_precision_param);
		try {
			setState(1926);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918); match(LEFT_PAREN);
				setState(1919); ((Precision_paramContext)_localctx).precision = match(NUMBER);
				setState(1920); match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921); match(LEFT_PAREN);
				setState(1922); ((Precision_paramContext)_localctx).precision = match(NUMBER);
				setState(1923); match(COMMA);
				setState(1924); ((Precision_paramContext)_localctx).scale = match(NUMBER);
				setState(1925); match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SQLParser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLParser.BOOLEAN, 0); }
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_boolean_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datetime_typeContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(SQLParser.TIME); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public TerminalNode TIME(int i) {
			return getToken(SQLParser.TIME, i);
		}
		public TerminalNode TIMETZ() { return getToken(SQLParser.TIMETZ, 0); }
		public TerminalNode WITHOUT() { return getToken(SQLParser.WITHOUT, 0); }
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(SQLParser.TIMESTAMPTZ, 0); }
		public Datetime_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_type; }
	}

	public final Datetime_typeContext datetime_type() throws RecognitionException {
		Datetime_typeContext _localctx = new Datetime_typeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_datetime_type);
		int _la;
		try {
			setState(1948);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				_la = _input.LA(1);
				if ( !(((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (DATE - 284)) | (1L << (TIME - 284)) | (1L << (TIMETZ - 284)) | (1L << (TIMESTAMP - 284)) | (1L << (TIMESTAMPTZ - 284)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1932);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1931); type_length();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934); match(TIME);
				setState(1936);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1935); type_length();
					}
				}

				setState(1938);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1939); match(TIME);
				setState(1940); match(ZONE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1941); match(TIMESTAMP);
				setState(1943);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(1942); type_length();
					}
				}

				setState(1945);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1946); match(TIME);
				setState(1947); match(ZONE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_typeContext extends ParserRuleContext {
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public TerminalNode BIT() { return getToken(SQLParser.BIT, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode VARBIT() { return getToken(SQLParser.VARBIT, 0); }
		public Bit_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_type; }
	}

	public final Bit_typeContext bit_type() throws RecognitionException {
		Bit_typeContext _localctx = new Bit_typeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_bit_type);
		try {
			setState(1963);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950); match(BIT);
				setState(1952);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1951); type_length();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954); match(VARBIT);
				setState(1956);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1955); type_length();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1958); match(BIT);
				setState(1959); match(VARYING);
				setState(1961);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1960); type_length();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_typeContext extends ParserRuleContext {
		public TerminalNode VARBINARY() { return getToken(SQLParser.VARBINARY, 0); }
		public TerminalNode VARYING() { return getToken(SQLParser.VARYING, 0); }
		public Type_lengthContext type_length() {
			return getRuleContext(Type_lengthContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(SQLParser.BINARY, 0); }
		public Binary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_type; }
	}

	public final Binary_typeContext binary_type() throws RecognitionException {
		Binary_typeContext _localctx = new Binary_typeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_binary_type);
		try {
			setState(1978);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1965); match(BINARY);
				setState(1967);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1966); type_length();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969); match(BINARY);
				setState(1970); match(VARYING);
				setState(1972);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1971); type_length();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1974); match(VARBINARY);
				setState(1976);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1975); type_length();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_expression_primaryContext extends ParserRuleContext {
		public Token timezone;
		public Cast_targetContext cast_target(int i) {
			return getRuleContext(Cast_targetContext.class,i);
		}
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public List<Fix_unary_operatorContext> fix_unary_operator() {
			return getRuleContexts(Fix_unary_operatorContext.class);
		}
		public List<TerminalNode> CAST_EXPRESSION() { return getTokens(SQLParser.CAST_EXPRESSION); }
		public TerminalNode CAST_EXPRESSION(int i) {
			return getToken(SQLParser.CAST_EXPRESSION, i);
		}
		public TerminalNode AT() { return getToken(SQLParser.AT, 0); }
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Parenthesized_value_expressionContext parenthesized_value_expression() {
			return getRuleContext(Parenthesized_value_expressionContext.class,0);
		}
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Cast_targetContext> cast_target() {
			return getRuleContexts(Cast_targetContext.class);
		}
		public Fix_unary_operatorContext fix_unary_operator(int i) {
			return getRuleContext(Fix_unary_operatorContext.class,i);
		}
		public TerminalNode ZONE() { return getToken(SQLParser.ZONE, 0); }
		public Array_sliceContext array_slice() {
			return getRuleContext(Array_sliceContext.class,0);
		}
		public Value_expression_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression_primary; }
	}

	public final Value_expression_primaryContext value_expression_primary() throws RecognitionException {
		Value_expression_primaryContext _localctx = new Value_expression_primaryContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_value_expression_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_la = _input.LA(1);
			if (((((_la - 319)) & ~0x3f) == 0 && ((1L << (_la - 319)) & ((1L << (PLUS - 319)) | (1L << (MINUS - 319)) | (1L << (MULTIPLY - 319)) | (1L << (DIVIDE - 319)) | (1L << (TILDE - 319)) | (1L << (INTERSECT2D - 319)) | (1L << (INTERSECT3D - 319)) | (1L << (OVERLAP - 319)) | (1L << (LEFT_OF - 319)) | (1L << (RIGHT_OF - 319)) | (1L << (ABOVE - 319)) | (1L << (OVERLAPS_ABOVE - 319)) | (1L << (BELOW - 319)) | (1L << (BOX_EQUAL - 319)) | (1L << (DISTANCE - 319)) | (1L << (NOT_SIMILAR - 319)) | (1L << (SIMILAR_INSENSITIVE - 319)) | (1L << (NOT_SIMILAR_INSENSITIVE - 319)) | (1L << (CUSTOME_OPERAND - 319)))) != 0)) {
				{
				setState(1980); fix_unary_operator();
				}
			}

			setState(1985);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1983); parenthesized_value_expression();
				}
				break;
			case 2:
				{
				setState(1984); nonparenthesized_value_expression_primary();
				}
				break;
			}
			setState(1988);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(1987); fix_unary_operator();
				}
				break;
			}
			setState(1995);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1990); array_slice();
				}
				break;
			case 2:
				{
				setState(1993);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1991); match(DOT);
					setState(1992); column_reference();
					}
				}

				}
				break;
			}
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CAST_EXPRESSION) {
				{
				{
				setState(1997); match(CAST_EXPRESSION);
				setState(1998); cast_target();
				}
				}
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2008);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2004); match(AT);
				setState(2005); match(TIME);
				setState(2006); match(ZONE);
				setState(2007); ((Value_expression_primaryContext)_localctx).timezone = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_sliceContext extends ParserRuleContext {
		public List<TerminalNode> LEFT_SQUARE() { return getTokens(SQLParser.LEFT_SQUARE); }
		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(SQLParser.LEFT_SQUARE, i);
		}
		public List<TerminalNode> RIGHT_SQUARE() { return getTokens(SQLParser.RIGHT_SQUARE); }
		public TerminalNode COLON(int i) {
			return getToken(SQLParser.COLON, i);
		}
		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(SQLParser.RIGHT_SQUARE, i);
		}
		public List<Numeric_value_expressionContext> numeric_value_expression() {
			return getRuleContexts(Numeric_value_expressionContext.class);
		}
		public Numeric_value_expressionContext numeric_value_expression(int i) {
			return getRuleContext(Numeric_value_expressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(SQLParser.COLON); }
		public Array_sliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_slice; }
	}

	public final Array_sliceContext array_slice() throws RecognitionException {
		Array_sliceContext _localctx = new Array_sliceContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_array_slice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2010); match(LEFT_SQUARE);
					setState(2011); numeric_value_expression();
					setState(2014);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(2012); match(COLON);
						setState(2013); numeric_value_expression();
						}
					}

					setState(2016); match(RIGHT_SQUARE);
					}
					} 
				}
				setState(2022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_value_expressionContext extends ParserRuleContext {
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Parenthesized_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_value_expression; }
	}

	public final Parenthesized_value_expressionContext parenthesized_value_expression() throws RecognitionException {
		Parenthesized_value_expressionContext _localctx = new Parenthesized_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_parenthesized_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023); match(LEFT_PAREN);
			setState(2024); value_expression();
			setState(2025); match(RIGHT_PAREN);
			setState(2027);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2026); collate_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonparenthesized_value_expression_primaryContext extends ParserRuleContext {
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public Unsigned_value_specificationContext unsigned_value_specification() {
			return getRuleContext(Unsigned_value_specificationContext.class,0);
		}
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public Cast_specificationContext cast_specification() {
			return getRuleContext(Cast_specificationContext.class,0);
		}
		public Tuple_valueContext tuple_value() {
			return getRuleContext(Tuple_valueContext.class,0);
		}
		public Array_constructorContext array_constructor() {
			return getRuleContext(Array_constructorContext.class,0);
		}
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Set_function_specificationContext set_function_specification() {
			return getRuleContext(Set_function_specificationContext.class,0);
		}
		public Explicit_row_value_constructorContext explicit_row_value_constructor() {
			return getRuleContext(Explicit_row_value_constructorContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Nonparenthesized_value_expression_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonparenthesized_value_expression_primary; }
	}

	public final Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() throws RecognitionException {
		Nonparenthesized_value_expression_primaryContext _localctx = new Nonparenthesized_value_expression_primaryContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nonparenthesized_value_expression_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2029); unsigned_value_specification();
				}
				break;
			case 2:
				{
				setState(2030); array_constructor();
				}
				break;
			case 3:
				{
				setState(2031); explicit_row_value_constructor();
				}
				break;
			case 4:
				{
				setState(2032); column_reference();
				}
				break;
			case 5:
				{
				setState(2033); constant_value();
				}
				break;
			case 6:
				{
				setState(2034); set_function_specification();
				}
				break;
			case 7:
				{
				setState(2035); scalar_subquery();
				}
				break;
			case 8:
				{
				setState(2036); case_expression();
				}
				break;
			case 9:
				{
				setState(2037); cast_specification();
				}
				break;
			case 10:
				{
				setState(2038); routine_invocation();
				}
				break;
			case 11:
				{
				setState(2039); tuple_value();
				}
				break;
			case 12:
				{
				setState(2040); match(NULL);
				}
				break;
			}
			setState(2044);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2043); collate_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_valueContext extends ParserRuleContext {
		public Value_expression_listContext value_expression_list() {
			return getRuleContext(Value_expression_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Tuple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_value; }
	}

	public final Tuple_valueContext tuple_value() throws RecognitionException {
		Tuple_valueContext _localctx = new Tuple_valueContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_tuple_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046); match(LEFT_PAREN);
			setState(2047); value_expression_list();
			setState(2048); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collate_expressionContext extends ParserRuleContext {
		public Column_nameContext collate_id;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLParser.COLLATE, 0); }
		public Collate_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collate_expression; }
	}

	public final Collate_expressionContext collate_expression() throws RecognitionException {
		Collate_expressionContext _localctx = new Collate_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_collate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050); match(COLLATE);
			setState(2051); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_constant_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053); data_type();
			setState(2054); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_value_specificationContext extends ParserRuleContext {
		public Unsigned_literalContext unsigned_literal() {
			return getRuleContext(Unsigned_literalContext.class,0);
		}
		public Unsigned_value_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_value_specification; }
	}

	public final Unsigned_value_specificationContext unsigned_value_specification() throws RecognitionException {
		Unsigned_value_specificationContext _localctx = new Unsigned_value_specificationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unsigned_value_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056); unsigned_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_numeric_literalContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(SQLParser.REAL_NUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(SQLParser.NUMBER, 0); }
		public Unsigned_numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_numeric_literal; }
	}

	public final Unsigned_numeric_literalContext unsigned_numeric_literal() throws RecognitionException {
		Unsigned_numeric_literalContext _localctx = new Unsigned_numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_unsigned_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2058);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numerical_literalContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Signed_numerical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_numerical_literal; }
	}

	public final Signed_numerical_literalContext signed_numerical_literal() throws RecognitionException {
		Signed_numerical_literalContext _localctx = new Signed_numerical_literalContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_signed_numerical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2060); sign();
				}
			}

			setState(2063); unsigned_numeric_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fix_unary_operatorContext extends ParserRuleContext {
		public Custom_operatorContext custom_operator() {
			return getRuleContext(Custom_operatorContext.class,0);
		}
		public Fix_unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fix_unary_operator; }
	}

	public final Fix_unary_operatorContext fix_unary_operator() throws RecognitionException {
		Fix_unary_operatorContext _localctx = new Fix_unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_fix_unary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065); custom_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_constructorContext extends ParserRuleContext {
		public Array_valuesContext array_values() {
			return getRuleContext(Array_valuesContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode ARRAY() { return getToken(SQLParser.ARRAY, 0); }
		public Array_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructor; }
	}

	public final Array_constructorContext array_constructor() throws RecognitionException {
		Array_constructorContext _localctx = new Array_constructorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_array_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067); match(ARRAY);
			setState(2073);
			switch (_input.LA(1)) {
			case LEFT_SQUARE:
				{
				setState(2068); array_values();
				}
				break;
			case LEFT_PAREN:
				{
				setState(2069); match(LEFT_PAREN);
				setState(2070); data_statement();
				setState(2071); match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_valuesContext extends ParserRuleContext {
		public List<Array_valuesContext> array_values() {
			return getRuleContexts(Array_valuesContext.class);
		}
		public TerminalNode LEFT_SQUARE() { return getToken(SQLParser.LEFT_SQUARE, 0); }
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE() { return getToken(SQLParser.RIGHT_SQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_valuesContext array_values(int i) {
			return getRuleContext(Array_valuesContext.class,i);
		}
		public Array_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_values; }
	}

	public final Array_valuesContext array_values() throws RecognitionException {
		Array_valuesContext _localctx = new Array_valuesContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_array_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075); match(LEFT_SQUARE);
			setState(2090);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << FALSE) | (1L << LEFT) | (1L << NOT) | (1L << NULL) | (1L << RIGHT) | (1L << ROW) | (1L << SOME))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRUE - 65)) | (1L << (ANALYZE - 65)) | (1L << (ARRAY - 65)) | (1L << (AVG - 65)) | (1L << (BETWEEN - 65)) | (1L << (BY - 65)) | (1L << (CASCADE - 65)) | (1L << (CENTURY - 65)) | (1L << (CHARACTER - 65)) | (1L << (COLLECT - 65)) | (1L << (COALESCE - 65)) | (1L << (COLUMN - 65)) | (1L << (COUNT - 65)) | (1L << (CUBE - 65)) | (1L << (CURSOR - 65)) | (1L << (CYCLE - 65)) | (1L << (DATA - 65)) | (1L << (DAY - 65)) | (1L << (DEC - 65)) | (1L << (DECADE - 65)) | (1L << (DOW - 65)) | (1L << (DOY - 65)) | (1L << (DROP - 65)) | (1L << (EPOCH - 65)) | (1L << (EVERY - 65)) | (1L << (EXISTS - 65)) | (1L << (EXTERNAL - 65)) | (1L << (EXTRACT - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FOLLOWING - 129)) | (1L << (FORMAT - 129)) | (1L << (FUSION - 129)) | (1L << (GROUPING - 129)) | (1L << (HASH - 129)) | (1L << (HOUR - 129)) | (1L << (INDEX - 129)) | (1L << (INSERT - 129)) | (1L << (INTERSECTION - 129)) | (1L << (ISODOW - 129)) | (1L << (ISOYEAR - 129)) | (1L << (KEY - 129)) | (1L << (LAST - 129)) | (1L << (LESS - 129)) | (1L << (LIST - 129)) | (1L << (LOCATION - 129)) | (1L << (MAX - 129)) | (1L << (MAXVALUE - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLENNIUM - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MIN - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (NATIONAL - 129)) | (1L << (NULLIF - 129)) | (1L << (ONLY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PRECISION - 193)) | (1L << (QUARTER - 193)) | (1L << (RANGE - 193)) | (1L << (RECURSIVE - 193)) | (1L << (REGEXP - 193)) | (1L << (REPLACE - 193)) | (1L << (RESTRICT - 193)) | (1L << (RETURNING - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SECOND - 193)) | (1L << (SEQUENCE - 193)) | (1L << (SEQUENCES - 193)) | (1L << (SET - 193)) | (1L << (SIMILAR - 193)) | (1L << (STDDEV_POP - 193)) | (1L << (STDDEV_SAMP - 193)) | (1L << (SUBPARTITION - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SUM - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESPACE - 193)) | (1L << (THAN - 193)) | (1L << (TIMEZONE - 193)) | (1L << (TIMEZONE_HOUR - 193)) | (1L << (TIMEZONE_MINUTE - 193)) | (1L << (TRIM - 193)) | (1L << (TO - 193)) | (1L << (TYPE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNKNOWN - 193)) | (1L << (USAGE - 193)) | (1L << (VAR_SAMP - 193)) | (1L << (VAR_POP - 193)) | (1L << (VARYING - 193)) | (1L << (VERBOSE - 193)) | (1L << (WEEK - 193)) | (1L << (WINDOW - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (BOOLEAN - 258)) | (1L << (BOOL - 258)) | (1L << (BIT - 258)) | (1L << (VARBIT - 258)) | (1L << (INT1 - 258)) | (1L << (INT2 - 258)) | (1L << (INT4 - 258)) | (1L << (INT8 - 258)) | (1L << (TINYINT - 258)) | (1L << (SMALLINT - 258)) | (1L << (INT - 258)) | (1L << (INTEGER - 258)) | (1L << (BIGINT - 258)) | (1L << (FLOAT4 - 258)) | (1L << (FLOAT8 - 258)) | (1L << (REAL - 258)) | (1L << (FLOAT - 258)) | (1L << (DOUBLE - 258)) | (1L << (NUMERIC - 258)) | (1L << (DECIMAL - 258)) | (1L << (CHAR - 258)) | (1L << (VARCHAR - 258)) | (1L << (NCHAR - 258)) | (1L << (NVARCHAR - 258)) | (1L << (DATE - 258)) | (1L << (INTERVAL - 258)) | (1L << (TIME - 258)) | (1L << (TIMETZ - 258)) | (1L << (TIMESTAMP - 258)) | (1L << (TIMESTAMPTZ - 258)) | (1L << (TEXT - 258)) | (1L << (TSVECTOR - 258)) | (1L << (TSQUERY - 258)) | (1L << (BINARY - 258)) | (1L << (VARBINARY - 258)) | (1L << (BLOB - 258)) | (1L << (BYTEA - 258)) | (1L << (INET4 - 258)) | (1L << (BOX2D - 258)) | (1L << (BOX3D - 258)) | (1L << (GEOMETRY - 258)) | (1L << (GEOMETRY_DUMP - 258)) | (1L << (GEOGRAPHY - 258)) | (1L << (LEFT_PAREN - 258)) | (1L << (LEFT_SQUARE - 258)) | (1L << (PLUS - 258)) | (1L << (MINUS - 258)) | (1L << (MULTIPLY - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (DIVIDE - 322)) | (1L << (TILDE - 322)) | (1L << (INTERSECT2D - 322)) | (1L << (INTERSECT3D - 322)) | (1L << (OVERLAP - 322)) | (1L << (LEFT_OF - 322)) | (1L << (RIGHT_OF - 322)) | (1L << (ABOVE - 322)) | (1L << (OVERLAPS_ABOVE - 322)) | (1L << (BELOW - 322)) | (1L << (BOX_EQUAL - 322)) | (1L << (DISTANCE - 322)) | (1L << (NOT_SIMILAR - 322)) | (1L << (SIMILAR_INSENSITIVE - 322)) | (1L << (NOT_SIMILAR_INSENSITIVE - 322)) | (1L << (NUMBER - 322)) | (1L << (REAL_NUMBER - 322)) | (1L << (CUSTOME_OPERAND - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (REGEX - 322)) | (1L << (STRING_LITERAL - 322)))) != 0)) {
				{
				setState(2078);
				switch (_input.LA(1)) {
				case ALL:
				case ANY:
				case CASE:
				case CAST:
				case DEFAULT:
				case FALSE:
				case LEFT:
				case NOT:
				case NULL:
				case RIGHT:
				case ROW:
				case SOME:
				case TRUE:
				case ANALYZE:
				case ARRAY:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXISTS:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case POSITION:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUBSTRING:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case TSVECTOR:
				case TSQUERY:
				case BINARY:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case BOX2D:
				case BOX3D:
				case GEOMETRY:
				case GEOMETRY_DUMP:
				case GEOGRAPHY:
				case LEFT_PAREN:
				case PLUS:
				case MINUS:
				case MULTIPLY:
				case DIVIDE:
				case TILDE:
				case INTERSECT2D:
				case INTERSECT3D:
				case OVERLAP:
				case LEFT_OF:
				case RIGHT_OF:
				case ABOVE:
				case OVERLAPS_ABOVE:
				case BELOW:
				case BOX_EQUAL:
				case DISTANCE:
				case NOT_SIMILAR:
				case SIMILAR_INSENSITIVE:
				case NOT_SIMILAR_INSENSITIVE:
				case NUMBER:
				case REAL_NUMBER:
				case CUSTOME_OPERAND:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case REGEX:
				case STRING_LITERAL:
					{
					setState(2076); value_expression();
					}
					break;
				case LEFT_SQUARE:
					{
					setState(2077); array_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2080); match(COMMA);
					setState(2083);
					switch (_input.LA(1)) {
					case ALL:
					case ANY:
					case CASE:
					case CAST:
					case DEFAULT:
					case FALSE:
					case LEFT:
					case NOT:
					case NULL:
					case RIGHT:
					case ROW:
					case SOME:
					case TRUE:
					case ANALYZE:
					case ARRAY:
					case AVG:
					case BETWEEN:
					case BY:
					case CASCADE:
					case CENTURY:
					case CHARACTER:
					case COLLECT:
					case COALESCE:
					case COLUMN:
					case COUNT:
					case CUBE:
					case CURSOR:
					case CYCLE:
					case DATA:
					case DAY:
					case DEC:
					case DECADE:
					case DOW:
					case DOY:
					case DROP:
					case EPOCH:
					case EVERY:
					case EXISTS:
					case EXTERNAL:
					case EXTRACT:
					case FILTER:
					case FIRST:
					case FOLLOWING:
					case FORMAT:
					case FUSION:
					case GROUPING:
					case HASH:
					case HOUR:
					case INDEX:
					case INSERT:
					case INTERSECTION:
					case ISODOW:
					case ISOYEAR:
					case KEY:
					case LAST:
					case LESS:
					case LIST:
					case LOCATION:
					case MAX:
					case MAXVALUE:
					case MICROSECONDS:
					case MILLENNIUM:
					case MILLISECONDS:
					case MIN:
					case MINUTE:
					case MONTH:
					case NATIONAL:
					case NULLIF:
					case ONLY:
					case OVERWRITE:
					case PARTITION:
					case PARTITIONS:
					case POSITION:
					case PRECEDING:
					case PRECISION:
					case QUARTER:
					case RANGE:
					case RECURSIVE:
					case REGEXP:
					case REPLACE:
					case RESTRICT:
					case RETURNING:
					case RLIKE:
					case ROLLUP:
					case ROWS:
					case SCHEMA:
					case SECOND:
					case SEQUENCE:
					case SEQUENCES:
					case SET:
					case SIMILAR:
					case STDDEV_POP:
					case STDDEV_SAMP:
					case SUBPARTITION:
					case SUBSTRING:
					case SUM:
					case TABLES:
					case TABLESPACE:
					case THAN:
					case TIMEZONE:
					case TIMEZONE_HOUR:
					case TIMEZONE_MINUTE:
					case TRIM:
					case TO:
					case TYPE:
					case UNBOUNDED:
					case UNKNOWN:
					case USAGE:
					case VAR_SAMP:
					case VAR_POP:
					case VARYING:
					case VERBOSE:
					case WEEK:
					case WINDOW:
					case YEAR:
					case ZONE:
					case BOOLEAN:
					case BOOL:
					case BIT:
					case VARBIT:
					case INT1:
					case INT2:
					case INT4:
					case INT8:
					case TINYINT:
					case SMALLINT:
					case INT:
					case INTEGER:
					case BIGINT:
					case FLOAT4:
					case FLOAT8:
					case REAL:
					case FLOAT:
					case DOUBLE:
					case NUMERIC:
					case DECIMAL:
					case CHAR:
					case VARCHAR:
					case NCHAR:
					case NVARCHAR:
					case DATE:
					case INTERVAL:
					case TIME:
					case TIMETZ:
					case TIMESTAMP:
					case TIMESTAMPTZ:
					case TEXT:
					case TSVECTOR:
					case TSQUERY:
					case BINARY:
					case VARBINARY:
					case BLOB:
					case BYTEA:
					case INET4:
					case BOX2D:
					case BOX3D:
					case GEOMETRY:
					case GEOMETRY_DUMP:
					case GEOGRAPHY:
					case LEFT_PAREN:
					case PLUS:
					case MINUS:
					case MULTIPLY:
					case DIVIDE:
					case TILDE:
					case INTERSECT2D:
					case INTERSECT3D:
					case OVERLAP:
					case LEFT_OF:
					case RIGHT_OF:
					case ABOVE:
					case OVERLAPS_ABOVE:
					case BELOW:
					case BOX_EQUAL:
					case DISTANCE:
					case NOT_SIMILAR:
					case SIMILAR_INSENSITIVE:
					case NOT_SIMILAR_INSENSITIVE:
					case NUMBER:
					case REAL_NUMBER:
					case CUSTOME_OPERAND:
					case IDENTIFIER:
					case QUOTED_IDENTIFIER:
					case REGEX:
					case STRING_LITERAL:
						{
						setState(2081); value_expression();
						}
						break;
					case LEFT_SQUARE:
						{
						setState(2082); array_values();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(2089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2092); match(RIGHT_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_function_specificationContext extends ParserRuleContext {
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public Set_function_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_function_specification; }
	}

	public final Set_function_specificationContext set_function_specification() throws RecognitionException {
		Set_function_specificationContext _localctx = new Set_function_specificationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_set_function_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2094); aggregate_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_functionContext extends ParserRuleContext {
		public Within_groupContext within_group() {
			return getRuleContext(Within_groupContext.class,0);
		}
		public Value_expression_listContext value_expression_list() {
			return getRuleContext(Value_expression_listContext.class,0);
		}
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public Set_function_typeContext set_function_type() {
			return getRuleContext(Set_function_typeContext.class,0);
		}
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_aggregate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096); set_function_type();
			setState(2097); match(LEFT_PAREN);
			setState(2107);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2099);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2098); set_qualifier();
					}
					break;
				}
				setState(2101); value_expression_list();
				setState(2103);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(2102); orderby_clause();
					}
				}

				}
				break;
			case 2:
				{
				setState(2105); match(MULTIPLY);
				}
				break;
			case 3:
				{
				setState(2106); query_expression();
				}
				break;
			}
			setState(2109); match(RIGHT_PAREN);
			setState(2111);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(2110); within_group();
				}
			}

			setState(2114);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2113); filter_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Within_groupContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode WITHIN() { return getToken(SQLParser.WITHIN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public Within_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_group; }
	}

	public final Within_groupContext within_group() throws RecognitionException {
		Within_groupContext _localctx = new Within_groupContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_within_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116); match(WITHIN);
			setState(2117); match(GROUP);
			setState(2118); match(LEFT_PAREN);
			setState(2119); orderby_clause();
			setState(2120); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_function_typeContext extends ParserRuleContext {
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(SQLParser.VAR_SAMP, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode EVERY() { return getToken(SQLParser.EVERY, 0); }
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode INTERSECTION() { return getToken(SQLParser.INTERSECTION, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode VAR_POP() { return getToken(SQLParser.VAR_POP, 0); }
		public TerminalNode SOME() { return getToken(SQLParser.SOME, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode FUSION() { return getToken(SQLParser.FUSION, 0); }
		public TerminalNode COLLECT() { return getToken(SQLParser.COLLECT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Set_function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_function_type; }
	}

	public final Set_function_typeContext set_function_type() throws RecognitionException {
		Set_function_typeContext _localctx = new Set_function_typeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_set_function_type);
		int _la;
		try {
			setState(2124);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122);
				_la = _input.LA(1);
				if ( !(_la==ANY || _la==SOME || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AVG - 83)) | (1L << (COLLECT - 83)) | (1L << (COUNT - 83)) | (1L << (EVERY - 83)) | (1L << (FUSION - 83)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (INTERSECTION - 151)) | (1L << (MAX - 151)) | (1L << (MIN - 151)))) != 0) || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (STDDEV_POP - 224)) | (1L << (STDDEV_SAMP - 224)) | (1L << (SUM - 224)) | (1L << (VAR_SAMP - 224)) | (1L << (VAR_POP - 224)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2123); identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_clauseContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode FILTER() { return getToken(SQLParser.FILTER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126); match(FILTER);
			setState(2127); match(LEFT_PAREN);
			setState(2128); where_clause();
			setState(2129); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_operationContext extends ParserRuleContext {
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode GROUPING() { return getToken(SQLParser.GROUPING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Grouping_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_operation; }
	}

	public final Grouping_operationContext grouping_operation() throws RecognitionException {
		Grouping_operationContext _localctx = new Grouping_operationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_grouping_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131); match(GROUPING);
			setState(2132); match(LEFT_PAREN);
			setState(2133); column_reference_list();
			setState(2134); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_expressionContext extends ParserRuleContext {
		public Case_specificationContext case_specification() {
			return getRuleContext(Case_specificationContext.class,0);
		}
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_case_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136); case_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_abbreviationContext extends ParserRuleContext {
		public TerminalNode COALESCE() { return getToken(SQLParser.COALESCE, 0); }
		public Boolean_value_expressionContext boolean_value_expression(int i) {
			return getRuleContext(Boolean_value_expressionContext.class,i);
		}
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Boolean_value_expressionContext> boolean_value_expression() {
			return getRuleContexts(Boolean_value_expressionContext.class);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Case_abbreviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_abbreviation; }
	}

	public final Case_abbreviationContext case_abbreviation() throws RecognitionException {
		Case_abbreviationContext _localctx = new Case_abbreviationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_case_abbreviation);
		int _la;
		try {
			setState(2156);
			switch (_input.LA(1)) {
			case NULLIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(2138); match(NULLIF);
				setState(2139); match(LEFT_PAREN);
				setState(2140); numeric_value_expression();
				setState(2141); match(COMMA);
				setState(2142); boolean_value_expression();
				setState(2143); match(RIGHT_PAREN);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2145); match(COALESCE);
				setState(2146); match(LEFT_PAREN);
				setState(2147); numeric_value_expression();
				setState(2150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2148); match(COMMA);
					setState(2149); boolean_value_expression();
					}
					}
					setState(2152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(2154); match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_specificationContext extends ParserRuleContext {
		public Searched_caseContext searched_case() {
			return getRuleContext(Searched_caseContext.class,0);
		}
		public Simple_caseContext simple_case() {
			return getRuleContext(Simple_caseContext.class,0);
		}
		public Case_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_specification; }
	}

	public final Case_specificationContext case_specification() throws RecognitionException {
		Case_specificationContext _localctx = new Case_specificationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_case_specification);
		try {
			setState(2160);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2158); simple_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2159); searched_case();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_caseContext extends ParserRuleContext {
		public List<Simple_when_clauseContext> simple_when_clause() {
			return getRuleContexts(Simple_when_clauseContext.class);
		}
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public TerminalNode CASE() { return getToken(SQLParser.CASE, 0); }
		public Simple_when_clauseContext simple_when_clause(int i) {
			return getRuleContext(Simple_when_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public TerminalNode END() { return getToken(SQLParser.END, 0); }
		public Simple_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_case; }
	}

	public final Simple_caseContext simple_case() throws RecognitionException {
		Simple_caseContext _localctx = new Simple_caseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_simple_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2162); match(CASE);
			setState(2163); boolean_value_expression();
			setState(2165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2164); simple_when_clause();
				}
				}
				setState(2167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(2170);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2169); else_clause();
				}
			}

			setState(2172); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Searched_caseContext extends ParserRuleContext {
		public List<Searched_when_clauseContext> searched_when_clause() {
			return getRuleContexts(Searched_when_clauseContext.class);
		}
		public TerminalNode CASE() { return getToken(SQLParser.CASE, 0); }
		public Searched_when_clauseContext searched_when_clause(int i) {
			return getRuleContext(Searched_when_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public TerminalNode END() { return getToken(SQLParser.END, 0); }
		public Searched_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_case; }
	}

	public final Searched_caseContext searched_case() throws RecognitionException {
		Searched_caseContext _localctx = new Searched_caseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_searched_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174); match(CASE);
			setState(2176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2175); searched_when_clause();
				}
				}
				setState(2178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(2181);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2180); else_clause();
				}
			}

			setState(2183); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_when_clauseContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SQLParser.THEN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(SQLParser.WHEN, 0); }
		public Simple_when_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_when_clause; }
	}

	public final Simple_when_clauseContext simple_when_clause() throws RecognitionException {
		Simple_when_clauseContext _localctx = new Simple_when_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_simple_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185); match(WHEN);
			setState(2186); search_condition();
			setState(2187); match(THEN);
			setState(2188); result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Searched_when_clauseContext extends ParserRuleContext {
		public Search_conditionContext c;
		public ResultContext r;
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SQLParser.THEN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(SQLParser.WHEN, 0); }
		public Searched_when_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searched_when_clause; }
	}

	public final Searched_when_clauseContext searched_when_clause() throws RecognitionException {
		Searched_when_clauseContext _localctx = new Searched_when_clauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_searched_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190); match(WHEN);
			setState(2191); ((Searched_when_clauseContext)_localctx).c = search_condition();
			setState(2192); match(THEN);
			setState(2193); ((Searched_when_clauseContext)_localctx).r = result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public ResultContext r;
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SQLParser.ELSE, 0); }
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195); match(ELSE);
			setState(2196); ((Else_clauseContext)_localctx).r = result();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_result);
		try {
			setState(2200);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2198); value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2199); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_specificationContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_operandContext cast_operand() {
			return getRuleContext(Cast_operandContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SQLParser.CAST, 0); }
		public Cast_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_specification; }
	}

	public final Cast_specificationContext cast_specification() throws RecognitionException {
		Cast_specificationContext _localctx = new Cast_specificationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_cast_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202); match(CAST);
			setState(2203); match(LEFT_PAREN);
			setState(2204); cast_operand();
			setState(2205); match(AS);
			setState(2206); cast_target();
			setState(2207); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_operandContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Cast_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_operand; }
	}

	public final Cast_operandContext cast_operand() throws RecognitionException {
		Cast_operandContext _localctx = new Cast_operandContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_cast_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209); value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_targetContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_cast_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211); data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_expressionContext extends ParserRuleContext {
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
		}
		public Row_value_expressionContext row_value_expression() {
			return getRuleContext(Row_value_expressionContext.class,0);
		}
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2213); common_value_expression();
				}
				break;
			case 2:
				{
				setState(2214); row_value_expression();
				}
				break;
			case 3:
				{
				setState(2215); boolean_value_expression();
				}
				break;
			case 4:
				{
				setState(2216); routine_invocation();
				}
				break;
			case 5:
				{
				setState(2217);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==MULTIPLY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(2221);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(2220); collate_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_value_expressionContext extends ParserRuleContext {
		public String_value_expressionContext string_value_expression() {
			return getRuleContext(String_value_expressionContext.class,0);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Common_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_value_expression; }
	}

	public final Common_value_expressionContext common_value_expression() throws RecognitionException {
		Common_value_expressionContext _localctx = new Common_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_common_value_expression);
		try {
			setState(2226);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2223); numeric_value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224); string_value_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_values_listContext extends ParserRuleContext {
		public List<Value_expression_listContext> value_expression_list() {
			return getRuleContexts(Value_expression_listContext.class);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public Value_expression_listContext value_expression_list(int i) {
			return getRuleContext(Value_expression_listContext.class,i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public Row_values_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_values_list; }
	}

	public final Row_values_listContext row_values_list() throws RecognitionException {
		Row_values_listContext _localctx = new Row_values_listContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_row_values_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2228); match(VALUES);
			setState(2229); match(LEFT_PAREN);
			setState(2231);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << FALSE) | (1L << LEFT) | (1L << NOT) | (1L << NULL) | (1L << RIGHT) | (1L << ROW) | (1L << SOME))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRUE - 65)) | (1L << (ANALYZE - 65)) | (1L << (ARRAY - 65)) | (1L << (AVG - 65)) | (1L << (BETWEEN - 65)) | (1L << (BY - 65)) | (1L << (CASCADE - 65)) | (1L << (CENTURY - 65)) | (1L << (CHARACTER - 65)) | (1L << (COLLECT - 65)) | (1L << (COALESCE - 65)) | (1L << (COLUMN - 65)) | (1L << (COUNT - 65)) | (1L << (CUBE - 65)) | (1L << (CURSOR - 65)) | (1L << (CYCLE - 65)) | (1L << (DATA - 65)) | (1L << (DAY - 65)) | (1L << (DEC - 65)) | (1L << (DECADE - 65)) | (1L << (DOW - 65)) | (1L << (DOY - 65)) | (1L << (DROP - 65)) | (1L << (EPOCH - 65)) | (1L << (EVERY - 65)) | (1L << (EXISTS - 65)) | (1L << (EXTERNAL - 65)) | (1L << (EXTRACT - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FOLLOWING - 129)) | (1L << (FORMAT - 129)) | (1L << (FUSION - 129)) | (1L << (GROUPING - 129)) | (1L << (HASH - 129)) | (1L << (HOUR - 129)) | (1L << (INDEX - 129)) | (1L << (INSERT - 129)) | (1L << (INTERSECTION - 129)) | (1L << (ISODOW - 129)) | (1L << (ISOYEAR - 129)) | (1L << (KEY - 129)) | (1L << (LAST - 129)) | (1L << (LESS - 129)) | (1L << (LIST - 129)) | (1L << (LOCATION - 129)) | (1L << (MAX - 129)) | (1L << (MAXVALUE - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLENNIUM - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MIN - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (NATIONAL - 129)) | (1L << (NULLIF - 129)) | (1L << (ONLY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PRECISION - 193)) | (1L << (QUARTER - 193)) | (1L << (RANGE - 193)) | (1L << (RECURSIVE - 193)) | (1L << (REGEXP - 193)) | (1L << (REPLACE - 193)) | (1L << (RESTRICT - 193)) | (1L << (RETURNING - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SECOND - 193)) | (1L << (SEQUENCE - 193)) | (1L << (SEQUENCES - 193)) | (1L << (SET - 193)) | (1L << (SIMILAR - 193)) | (1L << (STDDEV_POP - 193)) | (1L << (STDDEV_SAMP - 193)) | (1L << (SUBPARTITION - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SUM - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESPACE - 193)) | (1L << (THAN - 193)) | (1L << (TIMEZONE - 193)) | (1L << (TIMEZONE_HOUR - 193)) | (1L << (TIMEZONE_MINUTE - 193)) | (1L << (TRIM - 193)) | (1L << (TO - 193)) | (1L << (TYPE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNKNOWN - 193)) | (1L << (USAGE - 193)) | (1L << (VAR_SAMP - 193)) | (1L << (VAR_POP - 193)) | (1L << (VARYING - 193)) | (1L << (VERBOSE - 193)) | (1L << (WEEK - 193)) | (1L << (WINDOW - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (BOOLEAN - 258)) | (1L << (BOOL - 258)) | (1L << (BIT - 258)) | (1L << (VARBIT - 258)) | (1L << (INT1 - 258)) | (1L << (INT2 - 258)) | (1L << (INT4 - 258)) | (1L << (INT8 - 258)) | (1L << (TINYINT - 258)) | (1L << (SMALLINT - 258)) | (1L << (INT - 258)) | (1L << (INTEGER - 258)) | (1L << (BIGINT - 258)) | (1L << (FLOAT4 - 258)) | (1L << (FLOAT8 - 258)) | (1L << (REAL - 258)) | (1L << (FLOAT - 258)) | (1L << (DOUBLE - 258)) | (1L << (NUMERIC - 258)) | (1L << (DECIMAL - 258)) | (1L << (CHAR - 258)) | (1L << (VARCHAR - 258)) | (1L << (NCHAR - 258)) | (1L << (NVARCHAR - 258)) | (1L << (DATE - 258)) | (1L << (INTERVAL - 258)) | (1L << (TIME - 258)) | (1L << (TIMETZ - 258)) | (1L << (TIMESTAMP - 258)) | (1L << (TIMESTAMPTZ - 258)) | (1L << (TEXT - 258)) | (1L << (TSVECTOR - 258)) | (1L << (TSQUERY - 258)) | (1L << (BINARY - 258)) | (1L << (VARBINARY - 258)) | (1L << (BLOB - 258)) | (1L << (BYTEA - 258)) | (1L << (INET4 - 258)) | (1L << (BOX2D - 258)) | (1L << (BOX3D - 258)) | (1L << (GEOMETRY - 258)) | (1L << (GEOMETRY_DUMP - 258)) | (1L << (GEOGRAPHY - 258)) | (1L << (LEFT_PAREN - 258)) | (1L << (PLUS - 258)) | (1L << (MINUS - 258)) | (1L << (MULTIPLY - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (DIVIDE - 322)) | (1L << (TILDE - 322)) | (1L << (INTERSECT2D - 322)) | (1L << (INTERSECT3D - 322)) | (1L << (OVERLAP - 322)) | (1L << (LEFT_OF - 322)) | (1L << (RIGHT_OF - 322)) | (1L << (ABOVE - 322)) | (1L << (OVERLAPS_ABOVE - 322)) | (1L << (BELOW - 322)) | (1L << (BOX_EQUAL - 322)) | (1L << (DISTANCE - 322)) | (1L << (NOT_SIMILAR - 322)) | (1L << (SIMILAR_INSENSITIVE - 322)) | (1L << (NOT_SIMILAR_INSENSITIVE - 322)) | (1L << (NUMBER - 322)) | (1L << (REAL_NUMBER - 322)) | (1L << (CUSTOME_OPERAND - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (REGEX - 322)) | (1L << (STRING_LITERAL - 322)))) != 0)) {
				{
				setState(2230); value_expression_list();
				}
			}

			setState(2233); match(RIGHT_PAREN);
			setState(2241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2234); match(COMMA);
					setState(2235); match(LEFT_PAREN);
					setState(2236); value_expression_list();
					setState(2237); match(RIGHT_PAREN);
					}
					} 
				}
				setState(2243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_expression_listContext extends ParserRuleContext {
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Value_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression_list; }
	}

	public final Value_expression_listContext value_expression_list() throws RecognitionException {
		Value_expression_listContext _localctx = new Value_expression_listContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_value_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244); value_expression();
			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2245); match(COMMA);
				setState(2246); value_expression();
				}
				}
				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_value_expressionContext extends ParserRuleContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Numeric_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_value_expression; }
	}

	public final Numeric_value_expressionContext numeric_value_expression() throws RecognitionException {
		Numeric_value_expressionContext _localctx = new Numeric_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_numeric_value_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2252); ((Numeric_value_expressionContext)_localctx).left = term();
			setState(2257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2253);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(2254); ((Numeric_value_expressionContext)_localctx).right = term();
					}
					} 
				}
				setState(2259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext left;
		public FactorContext right;
		public List<TerminalNode> MODULAR() { return getTokens(SQLParser.MODULAR); }
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MULTIPLY(int i) {
			return getToken(SQLParser.MULTIPLY, i);
		}
		public TerminalNode CARET(int i) {
			return getToken(SQLParser.CARET, i);
		}
		public TerminalNode DIVIDE(int i) {
			return getToken(SQLParser.DIVIDE, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(SQLParser.MULTIPLY); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public List<TerminalNode> CARET() { return getTokens(SQLParser.CARET); }
		public List<TerminalNode> DIVIDE() { return getTokens(SQLParser.DIVIDE); }
		public TerminalNode MODULAR(int i) {
			return getToken(SQLParser.MODULAR, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2260); ((TermContext)_localctx).left = factor();
			setState(2265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2261);
					_la = _input.LA(1);
					if ( !(((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (MULTIPLY - 321)) | (1L << (DIVIDE - 321)) | (1L << (MODULAR - 321)) | (1L << (CARET - 321)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(2262); ((TermContext)_localctx).right = factor();
					}
					} 
				}
				setState(2267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public List<Numeric_primaryContext> numeric_primary() {
			return getRuleContexts(Numeric_primaryContext.class);
		}
		public List<Custom_operatorContext> custom_operator() {
			return getRuleContexts(Custom_operatorContext.class);
		}
		public Numeric_primaryContext numeric_primary(int i) {
			return getRuleContext(Numeric_primaryContext.class,i);
		}
		public Custom_operatorContext custom_operator(int i) {
			return getRuleContext(Custom_operatorContext.class,i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_factor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2268); sign();
				}
				break;
			}
			setState(2271); numeric_primary();
			setState(2280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2272); custom_operator();
					setState(2274);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						setState(2273); sign();
						}
						break;
					}
					setState(2276); numeric_primary();
					}
					} 
				}
				setState(2282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_primaryContext extends ParserRuleContext {
		public Numeric_value_functionContext numeric_value_function() {
			return getRuleContext(Numeric_value_functionContext.class,0);
		}
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public Numeric_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_primary; }
	}

	public final Numeric_primaryContext numeric_primary() throws RecognitionException {
		Numeric_primaryContext _localctx = new Numeric_primaryContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_numeric_primary);
		try {
			setState(2285);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2283); value_expression_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2284); numeric_value_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_value_functionContext extends ParserRuleContext {
		public Extract_expressionContext extract_expression() {
			return getRuleContext(Extract_expressionContext.class,0);
		}
		public Bit_position_functionContext bit_position_function() {
			return getRuleContext(Bit_position_functionContext.class,0);
		}
		public Numeric_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_value_function; }
	}

	public final Numeric_value_functionContext numeric_value_function() throws RecognitionException {
		Numeric_value_functionContext _localctx = new Numeric_value_functionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_numeric_value_function);
		try {
			setState(2291);
			switch (_input.LA(1)) {
			case EXTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2289); extract_expression();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(2290); bit_position_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_position_functionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode POSITION() { return getToken(SQLParser.POSITION, 0); }
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Bit_position_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_position_function; }
	}

	public final Bit_position_functionContext bit_position_function() throws RecognitionException {
		Bit_position_functionContext _localctx = new Bit_position_functionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_bit_position_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293); match(POSITION);
			setState(2294); match(LEFT_PAREN);
			setState(2295); value_expression();
			setState(2296); match(IN);
			setState(2297); value_expression();
			setState(2298); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_expressionContext extends ParserRuleContext {
		public Extract_fieldContext extract_field_string;
		public Extract_fieldContext extract_field() {
			return getRuleContext(Extract_fieldContext.class,0);
		}
		public TerminalNode EXTRACT() { return getToken(SQLParser.EXTRACT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Extract_sourceContext extract_source() {
			return getRuleContext(Extract_sourceContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Extract_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_expression; }
	}

	public final Extract_expressionContext extract_expression() throws RecognitionException {
		Extract_expressionContext _localctx = new Extract_expressionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_extract_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300); match(EXTRACT);
			setState(2301); match(LEFT_PAREN);
			setState(2302); ((Extract_expressionContext)_localctx).extract_field_string = extract_field();
			setState(2303); match(FROM);
			setState(2304); extract_source();
			setState(2305); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_fieldContext extends ParserRuleContext {
		public Extended_datetime_fieldContext extended_datetime_field() {
			return getRuleContext(Extended_datetime_fieldContext.class,0);
		}
		public Primary_datetime_fieldContext primary_datetime_field() {
			return getRuleContext(Primary_datetime_fieldContext.class,0);
		}
		public Time_zone_fieldContext time_zone_field() {
			return getRuleContext(Time_zone_fieldContext.class,0);
		}
		public Extract_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_field; }
	}

	public final Extract_fieldContext extract_field() throws RecognitionException {
		Extract_fieldContext _localctx = new Extract_fieldContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_extract_field);
		try {
			setState(2310);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2307); primary_datetime_field();
				}
				break;
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2308); time_zone_field();
				}
				break;
			case CENTURY:
			case DECADE:
			case DOW:
			case DOY:
			case EPOCH:
			case ISODOW:
			case ISOYEAR:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case QUARTER:
			case WEEK:
				enterOuterAlt(_localctx, 3);
				{
				setState(2309); extended_datetime_field();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_zone_fieldContext extends ParserRuleContext {
		public TerminalNode TIMEZONE_MINUTE() { return getToken(SQLParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode TIMEZONE() { return getToken(SQLParser.TIMEZONE, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(SQLParser.TIMEZONE_HOUR, 0); }
		public Time_zone_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_zone_field; }
	}

	public final Time_zone_fieldContext time_zone_field() throws RecognitionException {
		Time_zone_fieldContext _localctx = new Time_zone_fieldContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_time_zone_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			_la = _input.LA(1);
			if ( !(((((_la - 235)) & ~0x3f) == 0 && ((1L << (_la - 235)) & ((1L << (TIMEZONE - 235)) | (1L << (TIMEZONE_HOUR - 235)) | (1L << (TIMEZONE_MINUTE - 235)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_sourceContext extends ParserRuleContext {
		public Column_referenceContext column_reference() {
			return getRuleContext(Column_referenceContext.class,0);
		}
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Datetime_literalContext datetime_literal() {
			return getRuleContext(Datetime_literalContext.class,0);
		}
		public Extract_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_source; }
	}

	public final Extract_sourceContext extract_source() throws RecognitionException {
		Extract_sourceContext _localctx = new Extract_sourceContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_extract_source);
		try {
			setState(2317);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2314); column_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2315); datetime_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2316); routine_invocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_value_expressionContext extends ParserRuleContext {
		public Character_value_expressionContext character_value_expression() {
			return getRuleContext(Character_value_expressionContext.class,0);
		}
		public String_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value_expression; }
	}

	public final String_value_expressionContext string_value_expression() throws RecognitionException {
		String_value_expressionContext _localctx = new String_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_string_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319); character_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_value_expressionContext extends ParserRuleContext {
		public List<TerminalNode> CONCATENATION_OPERATOR() { return getTokens(SQLParser.CONCATENATION_OPERATOR); }
		public List<Character_primaryContext> character_primary() {
			return getRuleContexts(Character_primaryContext.class);
		}
		public TerminalNode CONCATENATION_OPERATOR(int i) {
			return getToken(SQLParser.CONCATENATION_OPERATOR, i);
		}
		public Character_primaryContext character_primary(int i) {
			return getRuleContext(Character_primaryContext.class,i);
		}
		public Character_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_value_expression; }
	}

	public final Character_value_expressionContext character_value_expression() throws RecognitionException {
		Character_value_expressionContext _localctx = new Character_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_character_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321); character_primary();
			setState(2326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCATENATION_OPERATOR) {
				{
				{
				setState(2322); match(CONCATENATION_OPERATOR);
				setState(2323); character_primary();
				}
				}
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_primaryContext extends ParserRuleContext {
		public String_value_functionContext string_value_function() {
			return getRuleContext(String_value_functionContext.class,0);
		}
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public Character_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_primary; }
	}

	public final Character_primaryContext character_primary() throws RecognitionException {
		Character_primaryContext _localctx = new Character_primaryContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_character_primary);
		try {
			setState(2331);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329); value_expression_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2330); string_value_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_value_functionContext extends ParserRuleContext {
		public Trim_functionContext trim_function() {
			return getRuleContext(Trim_functionContext.class,0);
		}
		public Substring_functionContext substring_function() {
			return getRuleContext(Substring_functionContext.class,0);
		}
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public String_value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value_function; }
	}

	public final String_value_functionContext string_value_function() throws RecognitionException {
		String_value_functionContext _localctx = new String_value_functionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_string_value_function);
		try {
			setState(2336);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2333); trim_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2334); substring_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2335); routine_invocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Substring_functionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SQLParser.FOR, 0); }
		public Common_value_expressionContext common_value_expression(int i) {
			return getRuleContext(Common_value_expressionContext.class,i);
		}
		public String_value_expressionContext string_value_expression() {
			return getRuleContext(String_value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode SUBSTRING() { return getToken(SQLParser.SUBSTRING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public List<Common_value_expressionContext> common_value_expression() {
			return getRuleContexts(Common_value_expressionContext.class);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Substring_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring_function; }
	}

	public final Substring_functionContext substring_function() throws RecognitionException {
		Substring_functionContext _localctx = new Substring_functionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_substring_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338); match(SUBSTRING);
			setState(2339); match(LEFT_PAREN);
			setState(2340); string_value_expression();
			setState(2343);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2341); match(FROM);
				setState(2342); common_value_expression();
				}
			}

			setState(2347);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(2345); match(FOR);
				setState(2346); common_value_expression();
				}
			}

			setState(2349); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_functionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Trim_operandsContext trim_operands() {
			return getRuleContext(Trim_operandsContext.class,0);
		}
		public Trim_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_function; }
	}

	public final Trim_functionContext trim_function() throws RecognitionException {
		Trim_functionContext _localctx = new Trim_functionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_trim_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351); match(TRIM);
			setState(2352); match(LEFT_PAREN);
			setState(2353); trim_operands();
			setState(2354); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_operandsContext extends ParserRuleContext {
		public Character_value_expressionContext trim_character;
		public Character_value_expressionContext trim_source;
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Character_value_expressionContext character_value_expression(int i) {
			return getRuleContext(Character_value_expressionContext.class,i);
		}
		public Trim_specificationContext trim_specification() {
			return getRuleContext(Trim_specificationContext.class,0);
		}
		public List<Character_value_expressionContext> character_value_expression() {
			return getRuleContexts(Character_value_expressionContext.class);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Trim_operandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_operands; }
	}

	public final Trim_operandsContext trim_operands() throws RecognitionException {
		Trim_operandsContext _localctx = new Trim_operandsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_trim_operands);
		int _la;
		try {
			setState(2370);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2363);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2357);
					_la = _input.LA(1);
					if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (BOTH - 9)) | (1L << (LEADING - 9)) | (1L << (TRAILING - 9)))) != 0)) {
						{
						setState(2356); trim_specification();
						}
					}

					setState(2360);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << FALSE) | (1L << LEFT) | (1L << NULL) | (1L << RIGHT) | (1L << ROW) | (1L << SOME))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRUE - 65)) | (1L << (ANALYZE - 65)) | (1L << (ARRAY - 65)) | (1L << (AVG - 65)) | (1L << (BETWEEN - 65)) | (1L << (BY - 65)) | (1L << (CASCADE - 65)) | (1L << (CENTURY - 65)) | (1L << (CHARACTER - 65)) | (1L << (COLLECT - 65)) | (1L << (COALESCE - 65)) | (1L << (COLUMN - 65)) | (1L << (COUNT - 65)) | (1L << (CUBE - 65)) | (1L << (CURSOR - 65)) | (1L << (CYCLE - 65)) | (1L << (DATA - 65)) | (1L << (DAY - 65)) | (1L << (DEC - 65)) | (1L << (DECADE - 65)) | (1L << (DOW - 65)) | (1L << (DOY - 65)) | (1L << (DROP - 65)) | (1L << (EPOCH - 65)) | (1L << (EVERY - 65)) | (1L << (EXTERNAL - 65)) | (1L << (EXTRACT - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FOLLOWING - 129)) | (1L << (FORMAT - 129)) | (1L << (FUSION - 129)) | (1L << (GROUPING - 129)) | (1L << (HASH - 129)) | (1L << (HOUR - 129)) | (1L << (INDEX - 129)) | (1L << (INSERT - 129)) | (1L << (INTERSECTION - 129)) | (1L << (ISODOW - 129)) | (1L << (ISOYEAR - 129)) | (1L << (KEY - 129)) | (1L << (LAST - 129)) | (1L << (LESS - 129)) | (1L << (LIST - 129)) | (1L << (LOCATION - 129)) | (1L << (MAX - 129)) | (1L << (MAXVALUE - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLENNIUM - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MIN - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (NATIONAL - 129)) | (1L << (NULLIF - 129)) | (1L << (ONLY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PRECEDING - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PRECISION - 193)) | (1L << (QUARTER - 193)) | (1L << (RANGE - 193)) | (1L << (RECURSIVE - 193)) | (1L << (REGEXP - 193)) | (1L << (REPLACE - 193)) | (1L << (RESTRICT - 193)) | (1L << (RETURNING - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SECOND - 193)) | (1L << (SEQUENCE - 193)) | (1L << (SEQUENCES - 193)) | (1L << (SET - 193)) | (1L << (SIMILAR - 193)) | (1L << (STDDEV_POP - 193)) | (1L << (STDDEV_SAMP - 193)) | (1L << (SUBPARTITION - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SUM - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESPACE - 193)) | (1L << (THAN - 193)) | (1L << (TIMEZONE - 193)) | (1L << (TIMEZONE_HOUR - 193)) | (1L << (TIMEZONE_MINUTE - 193)) | (1L << (TRIM - 193)) | (1L << (TO - 193)) | (1L << (TYPE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNKNOWN - 193)) | (1L << (USAGE - 193)) | (1L << (VAR_SAMP - 193)) | (1L << (VAR_POP - 193)) | (1L << (VARYING - 193)) | (1L << (VERBOSE - 193)) | (1L << (WEEK - 193)) | (1L << (WINDOW - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (BOOLEAN - 258)) | (1L << (BOOL - 258)) | (1L << (BIT - 258)) | (1L << (VARBIT - 258)) | (1L << (INT1 - 258)) | (1L << (INT2 - 258)) | (1L << (INT4 - 258)) | (1L << (INT8 - 258)) | (1L << (TINYINT - 258)) | (1L << (SMALLINT - 258)) | (1L << (INT - 258)) | (1L << (INTEGER - 258)) | (1L << (BIGINT - 258)) | (1L << (FLOAT4 - 258)) | (1L << (FLOAT8 - 258)) | (1L << (REAL - 258)) | (1L << (FLOAT - 258)) | (1L << (DOUBLE - 258)) | (1L << (NUMERIC - 258)) | (1L << (DECIMAL - 258)) | (1L << (CHAR - 258)) | (1L << (VARCHAR - 258)) | (1L << (NCHAR - 258)) | (1L << (NVARCHAR - 258)) | (1L << (DATE - 258)) | (1L << (INTERVAL - 258)) | (1L << (TIME - 258)) | (1L << (TIMETZ - 258)) | (1L << (TIMESTAMP - 258)) | (1L << (TIMESTAMPTZ - 258)) | (1L << (TEXT - 258)) | (1L << (TSVECTOR - 258)) | (1L << (TSQUERY - 258)) | (1L << (BINARY - 258)) | (1L << (VARBINARY - 258)) | (1L << (BLOB - 258)) | (1L << (BYTEA - 258)) | (1L << (INET4 - 258)) | (1L << (BOX2D - 258)) | (1L << (BOX3D - 258)) | (1L << (GEOMETRY - 258)) | (1L << (GEOMETRY_DUMP - 258)) | (1L << (GEOGRAPHY - 258)) | (1L << (LEFT_PAREN - 258)) | (1L << (PLUS - 258)) | (1L << (MINUS - 258)) | (1L << (MULTIPLY - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (DIVIDE - 322)) | (1L << (TILDE - 322)) | (1L << (INTERSECT2D - 322)) | (1L << (INTERSECT3D - 322)) | (1L << (OVERLAP - 322)) | (1L << (LEFT_OF - 322)) | (1L << (RIGHT_OF - 322)) | (1L << (ABOVE - 322)) | (1L << (OVERLAPS_ABOVE - 322)) | (1L << (BELOW - 322)) | (1L << (BOX_EQUAL - 322)) | (1L << (DISTANCE - 322)) | (1L << (NOT_SIMILAR - 322)) | (1L << (SIMILAR_INSENSITIVE - 322)) | (1L << (NOT_SIMILAR_INSENSITIVE - 322)) | (1L << (NUMBER - 322)) | (1L << (REAL_NUMBER - 322)) | (1L << (CUSTOME_OPERAND - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (REGEX - 322)) | (1L << (STRING_LITERAL - 322)))) != 0)) {
						{
						setState(2359); ((Trim_operandsContext)_localctx).trim_character = character_value_expression();
						}
					}

					setState(2362); match(FROM);
					}
					break;
				}
				setState(2365); ((Trim_operandsContext)_localctx).trim_source = character_value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2366); ((Trim_operandsContext)_localctx).trim_source = character_value_expression();
				setState(2367); match(COMMA);
				setState(2368); ((Trim_operandsContext)_localctx).trim_character = character_value_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trim_specificationContext extends ParserRuleContext {
		public TerminalNode BOTH() { return getToken(SQLParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(SQLParser.TRAILING, 0); }
		public TerminalNode LEADING() { return getToken(SQLParser.LEADING, 0); }
		public Trim_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_specification; }
	}

	public final Trim_specificationContext trim_specification() throws RecognitionException {
		Trim_specificationContext _localctx = new Trim_specificationContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			_la = _input.LA(1);
			if ( !(((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (BOTH - 9)) | (1L << (LEADING - 9)) | (1L << (TRAILING - 9)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_value_expressionContext extends ParserRuleContext {
		public Or_predicateContext or_predicate() {
			return getRuleContext(Or_predicateContext.class,0);
		}
		public Boolean_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value_expression; }
	}

	public final Boolean_value_expressionContext boolean_value_expression() throws RecognitionException {
		Boolean_value_expressionContext _localctx = new Boolean_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_boolean_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374); or_predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_predicateContext extends ParserRuleContext {
		public List<Or_predicateContext> or_predicate() {
			return getRuleContexts(Or_predicateContext.class);
		}
		public Or_predicateContext or_predicate(int i) {
			return getRuleContext(Or_predicateContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SQLParser.OR); }
		public And_predicateContext and_predicate() {
			return getRuleContext(And_predicateContext.class,0);
		}
		public TerminalNode OR(int i) {
			return getToken(SQLParser.OR, i);
		}
		public Or_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_predicate; }
	}

	public final Or_predicateContext or_predicate() throws RecognitionException {
		Or_predicateContext _localctx = new Or_predicateContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_or_predicate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2376); and_predicate();
			setState(2381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2377); match(OR);
					setState(2378); or_predicate();
					}
					} 
				}
				setState(2383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_predicateContext extends ParserRuleContext {
		public Boolean_factorContext boolean_factor() {
			return getRuleContext(Boolean_factorContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(SQLParser.AND); }
		public List<And_predicateContext> and_predicate() {
			return getRuleContexts(And_predicateContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(SQLParser.AND, i);
		}
		public And_predicateContext and_predicate(int i) {
			return getRuleContext(And_predicateContext.class,i);
		}
		public And_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_predicate; }
	}

	public final And_predicateContext and_predicate() throws RecognitionException {
		And_predicateContext _localctx = new And_predicateContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_and_predicate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2384); boolean_factor();
			setState(2389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2385); match(AND);
					setState(2386); and_predicate();
					}
					} 
				}
				setState(2391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_factorContext extends ParserRuleContext {
		public Boolean_testContext boolean_test() {
			return getRuleContext(Boolean_testContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Boolean_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_factor; }
	}

	public final Boolean_factorContext boolean_factor() throws RecognitionException {
		Boolean_factorContext _localctx = new Boolean_factorContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_boolean_factor);
		try {
			setState(2395);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2392); boolean_test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2393); match(NOT);
				setState(2394); boolean_test();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_testContext extends ParserRuleContext {
		public Is_clauseContext is_clause() {
			return getRuleContext(Is_clauseContext.class,0);
		}
		public Boolean_primaryContext boolean_primary() {
			return getRuleContext(Boolean_primaryContext.class,0);
		}
		public Boolean_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_test; }
	}

	public final Boolean_testContext boolean_test() throws RecognitionException {
		Boolean_testContext _localctx = new Boolean_testContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_boolean_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397); boolean_primary();
			setState(2399);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2398); is_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_clauseContext extends ParserRuleContext {
		public Truth_valueContext t;
		public Truth_valueContext truth_value() {
			return getRuleContext(Truth_valueContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public Is_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_clause; }
	}

	public final Is_clauseContext is_clause() throws RecognitionException {
		Is_clauseContext _localctx = new Is_clauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_is_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401); match(IS);
			setState(2403);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2402); match(NOT);
				}
			}

			setState(2405); ((Is_clauseContext)_localctx).t = truth_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truth_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLParser.UNKNOWN, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public Truth_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truth_value; }
	}

	public final Truth_valueContext truth_value() throws RecognitionException {
		Truth_valueContext _localctx = new Truth_valueContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_truth_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_primaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Boolean_predicandContext boolean_predicand() {
			return getRuleContext(Boolean_predicandContext.class,0);
		}
		public Boolean_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_primary; }
	}

	public final Boolean_primaryContext boolean_primary() throws RecognitionException {
		Boolean_primaryContext _localctx = new Boolean_primaryContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_boolean_primary);
		try {
			setState(2411);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2409); predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2410); boolean_predicand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_predicandContext extends ParserRuleContext {
		public Parenthesized_boolean_value_expressionContext parenthesized_boolean_value_expression() {
			return getRuleContext(Parenthesized_boolean_value_expressionContext.class,0);
		}
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public Boolean_predicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_predicand; }
	}

	public final Boolean_predicandContext boolean_predicand() throws RecognitionException {
		Boolean_predicandContext _localctx = new Boolean_predicandContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_boolean_predicand);
		try {
			setState(2415);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413); parenthesized_boolean_value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2414); nonparenthesized_value_expression_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_boolean_value_expressionContext extends ParserRuleContext {
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Parenthesized_boolean_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_boolean_value_expression; }
	}

	public final Parenthesized_boolean_value_expressionContext parenthesized_boolean_value_expression() throws RecognitionException {
		Parenthesized_boolean_value_expressionContext _localctx = new Parenthesized_boolean_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_parenthesized_boolean_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417); match(LEFT_PAREN);
			setState(2418); boolean_value_expression();
			setState(2419); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_expressionContext extends ParserRuleContext {
		public Row_value_special_caseContext row_value_special_case() {
			return getRuleContext(Row_value_special_caseContext.class,0);
		}
		public Explicit_row_value_constructorContext explicit_row_value_constructor() {
			return getRuleContext(Explicit_row_value_constructorContext.class,0);
		}
		public Row_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_expression; }
	}

	public final Row_value_expressionContext row_value_expression() throws RecognitionException {
		Row_value_expressionContext _localctx = new Row_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_row_value_expression);
		try {
			setState(2423);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421); row_value_special_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2422); explicit_row_value_constructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_special_caseContext extends ParserRuleContext {
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public Row_value_special_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_special_case; }
	}

	public final Row_value_special_caseContext row_value_special_case() throws RecognitionException {
		Row_value_special_caseContext _localctx = new Row_value_special_caseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_row_value_special_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425); nonparenthesized_value_expression_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_row_value_constructorContext extends ParserRuleContext {
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Explicit_row_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_row_value_constructor; }
	}

	public final Explicit_row_value_constructorContext explicit_row_value_constructor() throws RecognitionException {
		Explicit_row_value_constructorContext _localctx = new Explicit_row_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_explicit_row_value_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427); match(ROW);
			setState(2428); match(LEFT_PAREN);
			setState(2437);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << FALSE) | (1L << LEFT) | (1L << NOT) | (1L << NULL) | (1L << RIGHT) | (1L << ROW) | (1L << SOME))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRUE - 65)) | (1L << (ANALYZE - 65)) | (1L << (ARRAY - 65)) | (1L << (AVG - 65)) | (1L << (BETWEEN - 65)) | (1L << (BY - 65)) | (1L << (CASCADE - 65)) | (1L << (CENTURY - 65)) | (1L << (CHARACTER - 65)) | (1L << (COLLECT - 65)) | (1L << (COALESCE - 65)) | (1L << (COLUMN - 65)) | (1L << (COUNT - 65)) | (1L << (CUBE - 65)) | (1L << (CURSOR - 65)) | (1L << (CYCLE - 65)) | (1L << (DATA - 65)) | (1L << (DAY - 65)) | (1L << (DEC - 65)) | (1L << (DECADE - 65)) | (1L << (DOW - 65)) | (1L << (DOY - 65)) | (1L << (DROP - 65)) | (1L << (EPOCH - 65)) | (1L << (EVERY - 65)) | (1L << (EXISTS - 65)) | (1L << (EXTERNAL - 65)) | (1L << (EXTRACT - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FOLLOWING - 129)) | (1L << (FORMAT - 129)) | (1L << (FUSION - 129)) | (1L << (GROUPING - 129)) | (1L << (HASH - 129)) | (1L << (HOUR - 129)) | (1L << (INDEX - 129)) | (1L << (INSERT - 129)) | (1L << (INTERSECTION - 129)) | (1L << (ISODOW - 129)) | (1L << (ISOYEAR - 129)) | (1L << (KEY - 129)) | (1L << (LAST - 129)) | (1L << (LESS - 129)) | (1L << (LIST - 129)) | (1L << (LOCATION - 129)) | (1L << (MAX - 129)) | (1L << (MAXVALUE - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLENNIUM - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MIN - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (NATIONAL - 129)) | (1L << (NULLIF - 129)) | (1L << (ONLY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PRECISION - 193)) | (1L << (QUARTER - 193)) | (1L << (RANGE - 193)) | (1L << (RECURSIVE - 193)) | (1L << (REGEXP - 193)) | (1L << (REPLACE - 193)) | (1L << (RESTRICT - 193)) | (1L << (RETURNING - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SECOND - 193)) | (1L << (SEQUENCE - 193)) | (1L << (SEQUENCES - 193)) | (1L << (SET - 193)) | (1L << (SIMILAR - 193)) | (1L << (STDDEV_POP - 193)) | (1L << (STDDEV_SAMP - 193)) | (1L << (SUBPARTITION - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SUM - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESPACE - 193)) | (1L << (THAN - 193)) | (1L << (TIMEZONE - 193)) | (1L << (TIMEZONE_HOUR - 193)) | (1L << (TIMEZONE_MINUTE - 193)) | (1L << (TRIM - 193)) | (1L << (TO - 193)) | (1L << (TYPE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNKNOWN - 193)) | (1L << (USAGE - 193)) | (1L << (VAR_SAMP - 193)) | (1L << (VAR_POP - 193)) | (1L << (VARYING - 193)) | (1L << (VERBOSE - 193)) | (1L << (WEEK - 193)) | (1L << (WINDOW - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (BOOLEAN - 258)) | (1L << (BOOL - 258)) | (1L << (BIT - 258)) | (1L << (VARBIT - 258)) | (1L << (INT1 - 258)) | (1L << (INT2 - 258)) | (1L << (INT4 - 258)) | (1L << (INT8 - 258)) | (1L << (TINYINT - 258)) | (1L << (SMALLINT - 258)) | (1L << (INT - 258)) | (1L << (INTEGER - 258)) | (1L << (BIGINT - 258)) | (1L << (FLOAT4 - 258)) | (1L << (FLOAT8 - 258)) | (1L << (REAL - 258)) | (1L << (FLOAT - 258)) | (1L << (DOUBLE - 258)) | (1L << (NUMERIC - 258)) | (1L << (DECIMAL - 258)) | (1L << (CHAR - 258)) | (1L << (VARCHAR - 258)) | (1L << (NCHAR - 258)) | (1L << (NVARCHAR - 258)) | (1L << (DATE - 258)) | (1L << (INTERVAL - 258)) | (1L << (TIME - 258)) | (1L << (TIMETZ - 258)) | (1L << (TIMESTAMP - 258)) | (1L << (TIMESTAMPTZ - 258)) | (1L << (TEXT - 258)) | (1L << (TSVECTOR - 258)) | (1L << (TSQUERY - 258)) | (1L << (BINARY - 258)) | (1L << (VARBINARY - 258)) | (1L << (BLOB - 258)) | (1L << (BYTEA - 258)) | (1L << (INET4 - 258)) | (1L << (BOX2D - 258)) | (1L << (BOX3D - 258)) | (1L << (GEOMETRY - 258)) | (1L << (GEOMETRY_DUMP - 258)) | (1L << (GEOGRAPHY - 258)) | (1L << (LEFT_PAREN - 258)) | (1L << (PLUS - 258)) | (1L << (MINUS - 258)) | (1L << (MULTIPLY - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (DIVIDE - 322)) | (1L << (TILDE - 322)) | (1L << (INTERSECT2D - 322)) | (1L << (INTERSECT3D - 322)) | (1L << (OVERLAP - 322)) | (1L << (LEFT_OF - 322)) | (1L << (RIGHT_OF - 322)) | (1L << (ABOVE - 322)) | (1L << (OVERLAPS_ABOVE - 322)) | (1L << (BELOW - 322)) | (1L << (BOX_EQUAL - 322)) | (1L << (DISTANCE - 322)) | (1L << (NOT_SIMILAR - 322)) | (1L << (SIMILAR_INSENSITIVE - 322)) | (1L << (NOT_SIMILAR_INSENSITIVE - 322)) | (1L << (NUMBER - 322)) | (1L << (REAL_NUMBER - 322)) | (1L << (CUSTOME_OPERAND - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (REGEX - 322)) | (1L << (STRING_LITERAL - 322)))) != 0)) {
				{
				setState(2429); value_expression();
				setState(2434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2430); match(COMMA);
					setState(2431); value_expression();
					}
					}
					setState(2436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2439); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_predicandContext extends ParserRuleContext {
		public Row_value_special_caseContext row_value_special_case() {
			return getRuleContext(Row_value_special_caseContext.class,0);
		}
		public Row_value_constructor_predicandContext row_value_constructor_predicand() {
			return getRuleContext(Row_value_constructor_predicandContext.class,0);
		}
		public Row_value_predicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_predicand; }
	}

	public final Row_value_predicandContext row_value_predicand() throws RecognitionException {
		Row_value_predicandContext _localctx = new Row_value_predicandContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_row_value_predicand);
		try {
			setState(2443);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2441); row_value_special_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2442); row_value_constructor_predicand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_constructor_predicandContext extends ParserRuleContext {
		public Boolean_predicandContext boolean_predicand() {
			return getRuleContext(Boolean_predicandContext.class,0);
		}
		public Common_value_expressionContext common_value_expression() {
			return getRuleContext(Common_value_expressionContext.class,0);
		}
		public Row_value_constructor_predicandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_constructor_predicand; }
	}

	public final Row_value_constructor_predicandContext row_value_constructor_predicand() throws RecognitionException {
		Row_value_constructor_predicandContext _localctx = new Row_value_constructor_predicandContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_row_value_constructor_predicand);
		try {
			setState(2447);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2445); common_value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2446); boolean_predicand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_expressionContext extends ParserRuleContext {
		public TerminalNode UNLOGGED() { return getToken(SQLParser.UNLOGGED, 0); }
		public TerminalNode TEMPORARY() { return getToken(SQLParser.TEMPORARY, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TerminalNode TEMP() { return getToken(SQLParser.TEMP, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Into_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_expression; }
	}

	public final Into_expressionContext into_expression() throws RecognitionException {
		Into_expressionContext _localctx = new Into_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_into_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2449); match(INTO);
			setState(2451);
			_la = _input.LA(1);
			if (((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TEMPORARY - 232)) | (1L << (TEMP - 232)) | (1L << (UNLOGGED - 232)))) != 0)) {
				{
				setState(2450);
				_la = _input.LA(1);
				if ( !(((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (TEMPORARY - 232)) | (1L << (TEMP - 232)) | (1L << (UNLOGGED - 232)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(2454);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2453); match(TABLE);
				}
			}

			setState(2456); table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_expressionContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Offset_clauseContext offset_clause() {
			return getRuleContext(Offset_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Window_clauseContext window_clause() {
			return getRuleContext(Window_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Fetch_clauseContext fetch_clause() {
			return getRuleContext(Fetch_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_expression; }
	}

	public final Table_expressionContext table_expression() throws RecognitionException {
		Table_expressionContext _localctx = new Table_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_table_expression);
		try {
			setState(2468);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(2458); from_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2459); where_clause();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(2460); groupby_clause();
				}
				break;
			case HAVING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2461); having_clause();
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(2462); window_clause();
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 6);
				{
				setState(2463); orderby_clause();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2464); limit_clause();
				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 8);
				{
				setState(2465); offset_clause();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(2466); fetch_clause();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(2467); for_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public Table_reference_listContext table_reference_list() {
			return getRuleContext(Table_reference_listContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(SQLParser.ONLY, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470); match(FROM);
			setState(2472);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2471); match(ONLY);
				}
				break;
			}
			setState(2474); table_reference_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_reference_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference_list; }
	}

	public final Table_reference_listContext table_reference_list() throws RecognitionException {
		Table_reference_listContext _localctx = new Table_reference_listContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_table_reference_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2476); table_reference();
			setState(2481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2477); match(COMMA);
					setState(2478); table_reference();
					}
					} 
				}
				setState(2483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Routine_invocationContext table_function;
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_table_reference);
		try {
			setState(2496);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2490);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2484); joined_table();
					}
					break;
				case 2:
					{
					setState(2485); ((Table_referenceContext)_localctx).table_function = routine_invocation();
					}
					break;
				case 3:
					{
					setState(2486); match(LEFT_PAREN);
					setState(2487); table_reference();
					setState(2488); match(RIGHT_PAREN);
					}
					break;
				}
				setState(2493);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2492); table_alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2495); table_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public IdentifierContext alias;
		public Column_name_listContext column_aliases;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_table_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2498); match(AS);
				}
			}

			setState(2501); ((Table_aliasContext)_localctx).alias = identifier();
			setState(2507);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(2502); match(LEFT_PAREN);
				setState(2504);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ANALYZE - 80)) | (1L << (AVG - 80)) | (1L << (BETWEEN - 80)) | (1L << (BY - 80)) | (1L << (CASCADE - 80)) | (1L << (CENTURY - 80)) | (1L << (CHARACTER - 80)) | (1L << (COLLECT - 80)) | (1L << (COALESCE - 80)) | (1L << (COLUMN - 80)) | (1L << (COUNT - 80)) | (1L << (CUBE - 80)) | (1L << (CURSOR - 80)) | (1L << (CYCLE - 80)) | (1L << (DATA - 80)) | (1L << (DAY - 80)) | (1L << (DEC - 80)) | (1L << (DECADE - 80)) | (1L << (DOW - 80)) | (1L << (DOY - 80)) | (1L << (DROP - 80)) | (1L << (EPOCH - 80)) | (1L << (EVERY - 80)) | (1L << (EXTERNAL - 80)) | (1L << (EXTRACT - 80)) | (1L << (FILTER - 80)) | (1L << (FIRST - 80)) | (1L << (FOLLOWING - 80)) | (1L << (FORMAT - 80)) | (1L << (FUSION - 80)) | (1L << (GROUPING - 80)) | (1L << (HASH - 80)) | (1L << (HOUR - 80)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (INDEX - 144)) | (1L << (INSERT - 144)) | (1L << (INTERSECTION - 144)) | (1L << (ISODOW - 144)) | (1L << (ISOYEAR - 144)) | (1L << (KEY - 144)) | (1L << (LAST - 144)) | (1L << (LESS - 144)) | (1L << (LIST - 144)) | (1L << (LOCATION - 144)) | (1L << (MAX - 144)) | (1L << (MAXVALUE - 144)) | (1L << (MICROSECONDS - 144)) | (1L << (MILLENNIUM - 144)) | (1L << (MILLISECONDS - 144)) | (1L << (MIN - 144)) | (1L << (MINUTE - 144)) | (1L << (MONTH - 144)) | (1L << (NATIONAL - 144)) | (1L << (NULLIF - 144)) | (1L << (ONLY - 144)) | (1L << (OVERWRITE - 144)) | (1L << (PARTITION - 144)) | (1L << (PARTITIONS - 144)) | (1L << (PRECEDING - 144)) | (1L << (PRECISION - 144)) | (1L << (QUARTER - 144)) | (1L << (RANGE - 144)) | (1L << (RECURSIVE - 144)) | (1L << (REGEXP - 144)) | (1L << (REPLACE - 144)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (RESTRICT - 208)) | (1L << (RETURNING - 208)) | (1L << (RLIKE - 208)) | (1L << (ROLLUP - 208)) | (1L << (ROWS - 208)) | (1L << (SCHEMA - 208)) | (1L << (SECOND - 208)) | (1L << (SEQUENCE - 208)) | (1L << (SEQUENCES - 208)) | (1L << (SET - 208)) | (1L << (SIMILAR - 208)) | (1L << (STDDEV_POP - 208)) | (1L << (STDDEV_SAMP - 208)) | (1L << (SUBPARTITION - 208)) | (1L << (SUM - 208)) | (1L << (TABLES - 208)) | (1L << (TABLESPACE - 208)) | (1L << (THAN - 208)) | (1L << (TIMEZONE - 208)) | (1L << (TIMEZONE_HOUR - 208)) | (1L << (TIMEZONE_MINUTE - 208)) | (1L << (TRIM - 208)) | (1L << (TO - 208)) | (1L << (TYPE - 208)) | (1L << (UNBOUNDED - 208)) | (1L << (UNKNOWN - 208)) | (1L << (USAGE - 208)) | (1L << (VAR_SAMP - 208)) | (1L << (VAR_POP - 208)) | (1L << (VARYING - 208)) | (1L << (VERBOSE - 208)) | (1L << (WEEK - 208)) | (1L << (WINDOW - 208)) | (1L << (YEAR - 208)) | (1L << (ZONE - 208)) | (1L << (BOOLEAN - 208)) | (1L << (BOOL - 208)) | (1L << (BIT - 208)) | (1L << (VARBIT - 208)) | (1L << (INT1 - 208)) | (1L << (INT2 - 208)) | (1L << (INT4 - 208)) | (1L << (INT8 - 208)) | (1L << (TINYINT - 208)) | (1L << (SMALLINT - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (BIGINT - 272)) | (1L << (FLOAT4 - 272)) | (1L << (FLOAT8 - 272)) | (1L << (REAL - 272)) | (1L << (FLOAT - 272)) | (1L << (DOUBLE - 272)) | (1L << (NUMERIC - 272)) | (1L << (DECIMAL - 272)) | (1L << (CHAR - 272)) | (1L << (VARCHAR - 272)) | (1L << (NCHAR - 272)) | (1L << (NVARCHAR - 272)) | (1L << (DATE - 272)) | (1L << (INTERVAL - 272)) | (1L << (TIME - 272)) | (1L << (TIMETZ - 272)) | (1L << (TIMESTAMP - 272)) | (1L << (TIMESTAMPTZ - 272)) | (1L << (TEXT - 272)) | (1L << (VARBINARY - 272)) | (1L << (BLOB - 272)) | (1L << (BYTEA - 272)) | (1L << (INET4 - 272)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
					{
					setState(2503); ((Table_aliasContext)_localctx).column_aliases = column_name_list();
					}
				}

				setState(2506); match(RIGHT_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joined_tableContext extends ParserRuleContext {
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public List<Joined_table_primaryContext> joined_table_primary() {
			return getRuleContexts(Joined_table_primaryContext.class);
		}
		public Joined_table_primaryContext joined_table_primary(int i) {
			return getRuleContext(Joined_table_primaryContext.class,i);
		}
		public Joined_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_table; }
	}

	public final Joined_tableContext joined_table() throws RecognitionException {
		Joined_tableContext _localctx = new Joined_tableContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_joined_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2509); table_primary();
			setState(2511); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2510); joined_table_primary();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2513); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joined_table_primaryContext extends ParserRuleContext {
		public Table_primaryContext right;
		public Join_typeContext t;
		public Join_specificationContext s;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public Joined_table_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_table_primary; }
	}

	public final Joined_table_primaryContext joined_table_primary() throws RecognitionException {
		Joined_table_primaryContext _localctx = new Joined_table_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_joined_table_primary);
		int _la;
		try {
			setState(2534);
			switch (_input.LA(1)) {
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2515); match(CROSS);
				setState(2516); match(JOIN);
				setState(2517); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2519);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(2518); ((Joined_table_primaryContext)_localctx).t = join_type();
					}
				}

				setState(2521); match(JOIN);
				setState(2522); ((Joined_table_primaryContext)_localctx).right = table_primary();
				setState(2523); ((Joined_table_primaryContext)_localctx).s = join_specification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2525); match(NATURAL);
				setState(2527);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
					{
					setState(2526); ((Joined_table_primaryContext)_localctx).t = join_type();
					}
				}

				setState(2529); match(JOIN);
				setState(2530); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 4);
				{
				setState(2531); match(UNION);
				setState(2532); match(JOIN);
				setState(2533); ((Joined_table_primaryContext)_localctx).right = table_primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cross_joinContext extends ParserRuleContext {
		public Table_primaryContext r;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Cross_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cross_join; }
	}

	public final Cross_joinContext cross_join() throws RecognitionException {
		Cross_joinContext _localctx = new Cross_joinContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_cross_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536); match(CROSS);
			setState(2537); match(JOIN);
			setState(2538); ((Cross_joinContext)_localctx).r = table_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_joinContext extends ParserRuleContext {
		public Join_typeContext t;
		public Table_primaryContext r;
		public Join_specificationContext s;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public Qualified_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_join; }
	}

	public final Qualified_joinContext qualified_join() throws RecognitionException {
		Qualified_joinContext _localctx = new Qualified_joinContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_qualified_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2541);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				setState(2540); ((Qualified_joinContext)_localctx).t = join_type();
				}
			}

			setState(2543); match(JOIN);
			setState(2544); ((Qualified_joinContext)_localctx).r = table_primary();
			setState(2545); ((Qualified_joinContext)_localctx).s = join_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Natural_joinContext extends ParserRuleContext {
		public Join_typeContext t;
		public Table_primaryContext r;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Natural_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join; }
	}

	public final Natural_joinContext natural_join() throws RecognitionException {
		Natural_joinContext _localctx = new Natural_joinContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_natural_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547); match(NATURAL);
			setState(2549);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				setState(2548); ((Natural_joinContext)_localctx).t = join_type();
				}
			}

			setState(2551); match(JOIN);
			setState(2552); ((Natural_joinContext)_localctx).r = table_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_joinContext extends ParserRuleContext {
		public Table_primaryContext r;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Union_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_join; }
	}

	public final Union_joinContext union_join() throws RecognitionException {
		Union_joinContext _localctx = new Union_joinContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_union_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554); match(UNION);
			setState(2555); match(JOIN);
			setState(2556); ((Union_joinContext)_localctx).r = table_primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public Outer_join_typeContext t;
		public Outer_join_typeContext outer_join_type() {
			return getRuleContext(Outer_join_typeContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLParser.INNER, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_join_type);
		try {
			setState(2560);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2558); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2559); ((Join_typeContext)_localctx).t = outer_join_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_typeContext extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(SQLParser.OUTER, 0); }
		public Outer_join_type_part2Context outer_join_type_part2() {
			return getRuleContext(Outer_join_type_part2Context.class,0);
		}
		public Outer_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_type; }
	}

	public final Outer_join_typeContext outer_join_type() throws RecognitionException {
		Outer_join_typeContext _localctx = new Outer_join_typeContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562); outer_join_type_part2();
			setState(2564);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(2563); match(OUTER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outer_join_type_part2Context extends ParserRuleContext {
		public TerminalNode FULL() { return getToken(SQLParser.FULL, 0); }
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public Outer_join_type_part2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_type_part2; }
	}

	public final Outer_join_type_part2Context outer_join_type_part2() throws RecognitionException {
		Outer_join_type_part2Context _localctx = new Outer_join_type_part2Context(_ctx, getState());
		enterRule(_localctx, 392, RULE_outer_join_type_part2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << LEFT) | (1L << RIGHT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_specificationContext extends ParserRuleContext {
		public Named_columns_joinContext named_columns_join() {
			return getRuleContext(Named_columns_joinContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Join_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_specification; }
	}

	public final Join_specificationContext join_specification() throws RecognitionException {
		Join_specificationContext _localctx = new Join_specificationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_join_specification);
		try {
			setState(2570);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2568); join_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2569); named_columns_join();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_join_condition);
		try {
			setState(2582);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2572); match(ON);
				setState(2573); search_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2574); match(USING);
				setState(2580);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
					{
					setState(2575); match(LEFT_PAREN);
					setState(2576); column_name_list();
					setState(2577); match(RIGHT_PAREN);
					}
					break;
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(2579); column_name_list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Named_columns_joinContext extends ParserRuleContext {
		public Column_reference_listContext f;
		public Column_reference_listContext column_reference_list() {
			return getRuleContext(Column_reference_listContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Named_columns_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_columns_join; }
	}

	public final Named_columns_joinContext named_columns_join() throws RecognitionException {
		Named_columns_joinContext _localctx = new Named_columns_joinContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584); match(USING);
			setState(2585); match(LEFT_PAREN);
			setState(2586); ((Named_columns_joinContext)_localctx).f = column_reference_list();
			setState(2587); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_primaryContext extends ParserRuleContext {
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public Table_or_query_nameContext table_or_query_name() {
			return getRuleContext(Table_or_query_nameContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Row_values_listContext row_values_list() {
			return getRuleContext(Row_values_listContext.class,0);
		}
		public Table_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_primary; }
	}

	public final Table_primaryContext table_primary() throws RecognitionException {
		Table_primaryContext _localctx = new Table_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_table_primary);
		int _la;
		try {
			setState(2609);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2591);
				switch (_input.LA(1)) {
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(2589); table_or_query_name();
					}
					break;
				case LATERAL:
				case LEFT_PAREN:
					{
					setState(2590); derived_table();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2594);
				_la = _input.LA(1);
				if (_la==MULTIPLY) {
					{
					setState(2593); match(MULTIPLY);
					}
				}

				setState(2597);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2596); table_alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2599); row_values_list();
				setState(2601);
				switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
				case 1:
					{
					setState(2600); table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2603); match(LEFT_PAREN);
				setState(2604); table_primary();
				setState(2605); match(RIGHT_PAREN);
				setState(2607);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
				case 1:
					{
					setState(2606); table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Table_nameContext name;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613); ((Column_nameContext)_localctx).name = table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_column_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2615); column_name();
			setState(2620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2616); match(COMMA);
					setState(2617); column_name();
					}
					} 
				}
				setState(2622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Role_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Role_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_name; }
	}

	public final Role_nameContext role_name() throws RecognitionException {
		Role_nameContext _localctx = new Role_nameContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_role_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SQLParser.LATERAL, 0); }
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Routine_invocationContext routine_invocation() {
			return getRuleContext(Routine_invocationContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_derived_table);
		try {
			setState(2634);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625); table_subquery();
				}
				break;
			case LATERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626); match(LATERAL);
				setState(2632);
				switch (_input.LA(1)) {
				case LEFT_PAREN:
					{
					setState(2627); match(LEFT_PAREN);
					setState(2628); data_statement();
					setState(2629); match(RIGHT_PAREN);
					}
					break;
				case ALL:
				case ANY:
				case LEFT:
				case RIGHT:
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(2631); routine_invocation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636); match(WHERE);
			setState(2637); search_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639); value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public Grouping_element_listContext g;
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Grouping_element_listContext grouping_element_list() {
			return getRuleContext(Grouping_element_listContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_groupby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2641); match(GROUP);
			setState(2642); match(BY);
			setState(2643); ((Groupby_clauseContext)_localctx).g = grouping_element_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_element_listContext extends ParserRuleContext {
		public Grouping_elementContext grouping_element(int i) {
			return getRuleContext(Grouping_elementContext.class,i);
		}
		public List<Grouping_elementContext> grouping_element() {
			return getRuleContexts(Grouping_elementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Grouping_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_element_list; }
	}

	public final Grouping_element_listContext grouping_element_list() throws RecognitionException {
		Grouping_element_listContext _localctx = new Grouping_element_listContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_grouping_element_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2645); grouping_element();
			setState(2650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2646); match(COMMA);
					setState(2647); grouping_element();
					}
					} 
				}
				setState(2652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_elementContext extends ParserRuleContext {
		public Cube_listContext cube_list() {
			return getRuleContext(Cube_listContext.class,0);
		}
		public Empty_grouping_setContext empty_grouping_set() {
			return getRuleContext(Empty_grouping_setContext.class,0);
		}
		public Ordinary_grouping_setContext ordinary_grouping_set() {
			return getRuleContext(Ordinary_grouping_setContext.class,0);
		}
		public Rollup_listContext rollup_list() {
			return getRuleContext(Rollup_listContext.class,0);
		}
		public Grouping_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_element; }
	}

	public final Grouping_elementContext grouping_element() throws RecognitionException {
		Grouping_elementContext _localctx = new Grouping_elementContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_grouping_element);
		try {
			setState(2657);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2653); rollup_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654); cube_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2655); empty_grouping_set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2656); ordinary_grouping_set();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordinary_grouping_setContext extends ParserRuleContext {
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Row_value_predicand_listContext row_value_predicand_list() {
			return getRuleContext(Row_value_predicand_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Ordinary_grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinary_grouping_set; }
	}

	public final Ordinary_grouping_setContext ordinary_grouping_set() throws RecognitionException {
		Ordinary_grouping_setContext _localctx = new Ordinary_grouping_setContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_ordinary_grouping_set);
		try {
			setState(2664);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2659); row_value_predicand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2660); match(LEFT_PAREN);
				setState(2661); row_value_predicand_list();
				setState(2662); match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordinary_grouping_set_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public List<Ordinary_grouping_setContext> ordinary_grouping_set() {
			return getRuleContexts(Ordinary_grouping_setContext.class);
		}
		public Ordinary_grouping_setContext ordinary_grouping_set(int i) {
			return getRuleContext(Ordinary_grouping_setContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Ordinary_grouping_set_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinary_grouping_set_list; }
	}

	public final Ordinary_grouping_set_listContext ordinary_grouping_set_list() throws RecognitionException {
		Ordinary_grouping_set_listContext _localctx = new Ordinary_grouping_set_listContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_ordinary_grouping_set_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666); ordinary_grouping_set();
			setState(2671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2667); match(COMMA);
				setState(2668); ordinary_grouping_set();
				}
				}
				setState(2673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollup_listContext extends ParserRuleContext {
		public Ordinary_grouping_set_listContext c;
		public Ordinary_grouping_set_listContext ordinary_grouping_set_list() {
			return getRuleContext(Ordinary_grouping_set_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SQLParser.ROLLUP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Rollup_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollup_list; }
	}

	public final Rollup_listContext rollup_list() throws RecognitionException {
		Rollup_listContext _localctx = new Rollup_listContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_rollup_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2674); match(ROLLUP);
			setState(2675); match(LEFT_PAREN);
			setState(2676); ((Rollup_listContext)_localctx).c = ordinary_grouping_set_list();
			setState(2677); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cube_listContext extends ParserRuleContext {
		public Ordinary_grouping_set_listContext c;
		public Ordinary_grouping_set_listContext ordinary_grouping_set_list() {
			return getRuleContext(Ordinary_grouping_set_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode CUBE() { return getToken(SQLParser.CUBE, 0); }
		public Cube_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube_list; }
	}

	public final Cube_listContext cube_list() throws RecognitionException {
		Cube_listContext _localctx = new Cube_listContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_cube_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679); match(CUBE);
			setState(2680); match(LEFT_PAREN);
			setState(2681); ((Cube_listContext)_localctx).c = ordinary_grouping_set_list();
			setState(2682); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_grouping_setContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Empty_grouping_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_grouping_set; }
	}

	public final Empty_grouping_setContext empty_grouping_set() throws RecognitionException {
		Empty_grouping_setContext _localctx = new Empty_grouping_setContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_empty_grouping_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684); match(LEFT_PAREN);
			setState(2685); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
		public Boolean_value_expressionContext boolean_value_expression() {
			return getRuleContext(Boolean_value_expressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687); match(HAVING);
			setState(2688); boolean_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_value_predicand_listContext extends ParserRuleContext {
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Row_value_predicand_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_value_predicand_list; }
	}

	public final Row_value_predicand_listContext row_value_predicand_list() throws RecognitionException {
		Row_value_predicand_listContext _localctx = new Row_value_predicand_listContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_row_value_predicand_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690); row_value_predicand();
			setState(2695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2691); match(COMMA);
				setState(2692); row_value_predicand();
				}
				}
				setState(2697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_qualifierContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode RECURSIVE() { return getToken(SQLParser.RECURSIVE, 0); }
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public List<With_subqueryContext> with_subquery() {
			return getRuleContexts(With_subqueryContext.class);
		}
		public With_subqueryContext with_subquery(int i) {
			return getRuleContext(With_subqueryContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public With_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_qualifier; }
	}

	public final With_qualifierContext with_qualifier() throws RecognitionException {
		With_qualifierContext _localctx = new With_qualifierContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_with_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2698); match(WITH);
			setState(2700);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2699); match(RECURSIVE);
				}
				break;
			}
			setState(2702); with_subquery();
			setState(2707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2703); match(COMMA);
				setState(2704); with_subquery();
				}
				}
				setState(2709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_subqueryContext extends ParserRuleContext {
		public IdentifierContext alias;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SQLParser.LEFT_PAREN, i);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SQLParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SQLParser.LEFT_PAREN); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SQLParser.RIGHT_PAREN, i);
		}
		public With_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_subquery; }
	}

	public final With_subqueryContext with_subquery() throws RecognitionException {
		With_subqueryContext _localctx = new With_subqueryContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_with_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2710); ((With_subqueryContext)_localctx).alias = identifier();
			setState(2715);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(2711); match(LEFT_PAREN);
				setState(2712); column_name_list();
				setState(2713); match(RIGHT_PAREN);
				}
			}

			setState(2717); match(AS);
			setState(2718); match(LEFT_PAREN);
			setState(2723);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				{
				setState(2719); data_statement();
				}
				break;
			case 2:
				{
				setState(2720); insert_statement();
				}
				break;
			case 3:
				{
				setState(2721); update_statement();
				}
				break;
			case 4:
				{
				setState(2722); delete_statement();
				}
				break;
			}
			setState(2725); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public Query_expression_bodyContext query_expression_body() {
			return getRuleContext(Query_expression_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2727); query_expression_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expression_bodyContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_expressionContext non_join_query_expression() {
			return getRuleContext(Non_join_query_expressionContext.class,0);
		}
		public Query_expression_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression_body; }
	}

	public final Query_expression_bodyContext query_expression_body() throws RecognitionException {
		Query_expression_bodyContext _localctx = new Query_expression_bodyContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_query_expression_body);
		try {
			setState(2731);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2729); non_join_query_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2730); joined_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_join_query_expressionContext extends ParserRuleContext {
		public List<TerminalNode> EXCEPT() { return getTokens(SQLParser.EXCEPT); }
		public List<TerminalNode> UNION() { return getTokens(SQLParser.UNION); }
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
		public TerminalNode EXCEPT(int i) {
			return getToken(SQLParser.EXCEPT, i);
		}
		public Query_termContext query_term(int i) {
			return getRuleContext(Query_termContext.class,i);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_termContext non_join_query_term() {
			return getRuleContext(Non_join_query_termContext.class,0);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLParser.DISTINCT); }
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLParser.DISTINCT, i);
		}
		public List<Query_termContext> query_term() {
			return getRuleContexts(Query_termContext.class);
		}
		public TerminalNode UNION(int i) {
			return getToken(SQLParser.UNION, i);
		}
		public Non_join_query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_join_query_expression; }
	}

	public final Non_join_query_expressionContext non_join_query_expression() throws RecognitionException {
		Non_join_query_expressionContext _localctx = new Non_join_query_expressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_non_join_query_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2733); non_join_query_term();
				}
				break;
			case 2:
				{
				setState(2734); joined_table();
				setState(2735);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2737);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2736);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2739); query_term();
				}
				break;
			}
			setState(2750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCEPT || _la==UNION) {
				{
				{
				setState(2743);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(2745);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2744);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2747); query_term();
				}
				}
				setState(2752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_termContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_termContext non_join_query_term() {
			return getRuleContext(Non_join_query_termContext.class,0);
		}
		public Query_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_term; }
	}

	public final Query_termContext query_term() throws RecognitionException {
		Query_termContext _localctx = new Query_termContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_query_term);
		try {
			setState(2755);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2753); non_join_query_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2754); joined_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_join_query_termContext extends ParserRuleContext {
		public List<TerminalNode> ALL() { return getTokens(SQLParser.ALL); }
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(SQLParser.DISTINCT); }
		public TerminalNode ALL(int i) {
			return getToken(SQLParser.ALL, i);
		}
		public List<Query_primaryContext> query_primary() {
			return getRuleContexts(Query_primaryContext.class);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(SQLParser.INTERSECT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(SQLParser.DISTINCT, i);
		}
		public Query_primaryContext query_primary(int i) {
			return getRuleContext(Query_primaryContext.class,i);
		}
		public Non_join_query_primaryContext non_join_query_primary() {
			return getRuleContext(Non_join_query_primaryContext.class,0);
		}
		public TerminalNode INTERSECT(int i) {
			return getToken(SQLParser.INTERSECT, i);
		}
		public Non_join_query_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_join_query_term; }
	}

	public final Non_join_query_termContext non_join_query_term() throws RecognitionException {
		Non_join_query_termContext _localctx = new Non_join_query_termContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_non_join_query_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				setState(2757); non_join_query_primary();
				}
				break;
			case 2:
				{
				setState(2758); joined_table();
				setState(2759); match(INTERSECT);
				setState(2761);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2760);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2763); query_primary();
				}
				break;
			}
			setState(2774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERSECT) {
				{
				{
				setState(2767); match(INTERSECT);
				setState(2769);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(2768);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(2771); query_primary();
				}
				}
				setState(2776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_primaryContext extends ParserRuleContext {
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Non_join_query_primaryContext non_join_query_primary() {
			return getRuleContext(Non_join_query_primaryContext.class,0);
		}
		public Row_values_listContext row_values_list() {
			return getRuleContext(Row_values_listContext.class,0);
		}
		public Query_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_primary; }
	}

	public final Query_primaryContext query_primary() throws RecognitionException {
		Query_primaryContext _localctx = new Query_primaryContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_query_primary);
		try {
			setState(2780);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2777); non_join_query_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2778); joined_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2779); row_values_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_join_query_primaryContext extends ParserRuleContext {
		public Simple_tableContext simple_table() {
			return getRuleContext(Simple_tableContext.class,0);
		}
		public Non_join_query_expressionContext non_join_query_expression() {
			return getRuleContext(Non_join_query_expressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Non_join_query_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_join_query_primary; }
	}

	public final Non_join_query_primaryContext non_join_query_primary() throws RecognitionException {
		Non_join_query_primaryContext _localctx = new Non_join_query_primaryContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_non_join_query_primary);
		try {
			setState(2787);
			switch (_input.LA(1)) {
			case SELECT:
			case VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(2782); simple_table();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2783); match(LEFT_PAREN);
				setState(2784); non_join_query_expression();
				setState(2785); match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_tableContext extends ParserRuleContext {
		public Explicit_tableContext explicit_table() {
			return getRuleContext(Explicit_tableContext.class,0);
		}
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Simple_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_table; }
	}

	public final Simple_tableContext simple_table() throws RecognitionException {
		Simple_tableContext _localctx = new Simple_tableContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_simple_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789); query_specification();
			setState(2791);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2790); explicit_table();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_tableContext extends ParserRuleContext {
		public Table_or_query_nameContext table_or_query_name() {
			return getRuleContext(Table_or_query_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public Explicit_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_table; }
	}

	public final Explicit_tableContext explicit_table() throws RecognitionException {
		Explicit_tableContext _localctx = new Explicit_tableContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_explicit_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793); match(TABLE);
			setState(2794); table_or_query_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_query_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_or_query_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_query_name; }
	}

	public final Table_or_query_nameContext table_or_query_name() throws RecognitionException {
		Table_or_query_nameContext _localctx = new Table_or_query_nameContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_table_or_query_name);
		try {
			setState(2798);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2796); table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2797); identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2800); identifier();
			setState(2810);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				{
				setState(2801); match(DOT);
				setState(2804);
				switch (_input.LA(1)) {
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(2802); identifier();
					}
					break;
				case MULTIPLY:
					{
					setState(2803); match(MULTIPLY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2808);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(2806); match(DOT);
					setState(2807); identifier();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_name_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_list; }
	}

	public final Table_name_listContext table_name_list() throws RecognitionException {
		Table_name_listContext _localctx = new Table_name_listContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_table_name_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2812); table_name();
			setState(2817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2813); match(COMMA);
					setState(2814); table_name();
					}
					} 
				}
				setState(2819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_specificationContext extends ParserRuleContext {
		public List<Table_expressionContext> table_expression() {
			return getRuleContexts(Table_expressionContext.class);
		}
		public Into_expressionContext into_expression() {
			return getRuleContext(Into_expressionContext.class,0);
		}
		public Table_expressionContext table_expression(int i) {
			return getRuleContext(Table_expressionContext.class,i);
		}
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Row_values_listContext row_values_list() {
			return getRuleContext(Row_values_listContext.class,0);
		}
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_query_specification);
		int _la;
		try {
			int _alt;
			setState(2835);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2820); match(SELECT);
				setState(2822);
				switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
				case 1:
					{
					setState(2821); set_qualifier();
					}
					break;
				}
				setState(2824); select_list();
				setState(2826);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(2825); into_expression();
					}
				}

				setState(2831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2828); table_expression();
						}
						} 
					}
					setState(2833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
				}
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(2834); row_values_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public Select_sublistContext select_sublist(int i) {
			return getRuleContext(Select_sublistContext.class,i);
		}
		public List<Select_sublistContext> select_sublist() {
			return getRuleContexts(Select_sublistContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2837); select_sublist();
			setState(2842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2838); match(COMMA);
					setState(2839); select_sublist();
					}
					} 
				}
				setState(2844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_sublistContext extends ParserRuleContext {
		public Derived_columnContext derived_column() {
			return getRuleContext(Derived_columnContext.class,0);
		}
		public Qualified_asteriskContext qualified_asterisk() {
			return getRuleContext(Qualified_asteriskContext.class,0);
		}
		public Select_sublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_sublist; }
	}

	public final Select_sublistContext select_sublist() throws RecognitionException {
		Select_sublistContext _localctx = new Select_sublistContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_select_sublist);
		try {
			setState(2847);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2845); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2846); qualified_asterisk();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_columnContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public As_clauseContext as_clause() {
			return getRuleContext(As_clauseContext.class,0);
		}
		public Derived_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_column; }
	}

	public final Derived_columnContext derived_column() throws RecognitionException {
		Derived_columnContext _localctx = new Derived_columnContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_derived_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2849); value_expression();
			setState(2851);
			switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
			case 1:
				{
				setState(2850); as_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_asteriskContext extends ParserRuleContext {
		public Token tb_name;
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public Qualified_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_asterisk; }
	}

	public final Qualified_asteriskContext qualified_asterisk() throws RecognitionException {
		Qualified_asteriskContext _localctx = new Qualified_asteriskContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_qualified_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2855);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2853); ((Qualified_asteriskContext)_localctx).tb_name = match(IDENTIFIER);
				setState(2854); match(DOT);
				}
			}

			setState(2857); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_qualifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Set_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_qualifier; }
	}

	public final Set_qualifierContext set_qualifier() throws RecognitionException {
		Set_qualifierContext _localctx = new Set_qualifierContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_set_qualifier);
		int _la;
		try {
			setState(2865);
			switch (_input.LA(1)) {
			case DISTINCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2859); match(DISTINCT);
				setState(2862);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2860); match(ON);
					setState(2861); search_condition();
					}
				}

				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2864); match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_referenceContext extends ParserRuleContext {
		public IdentifierContext name;
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public Column_referenceContext column_reference(int i) {
			return getRuleContext(Column_referenceContext.class,i);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Column_referenceContext> column_reference() {
			return getRuleContexts(Column_referenceContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Array_sliceContext array_slice() {
			return getRuleContext(Array_sliceContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Column_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_reference; }
	}

	public final Column_referenceContext column_reference() throws RecognitionException {
		Column_referenceContext _localctx = new Column_referenceContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_column_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2867); identifier();
			setState(2873);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				{
				setState(2868); match(DOT);
				setState(2871);
				switch (_input.LA(1)) {
				case ANALYZE:
				case AVG:
				case BETWEEN:
				case BY:
				case CASCADE:
				case CENTURY:
				case CHARACTER:
				case COLLECT:
				case COALESCE:
				case COLUMN:
				case COUNT:
				case CUBE:
				case CURSOR:
				case CYCLE:
				case DATA:
				case DAY:
				case DEC:
				case DECADE:
				case DOW:
				case DOY:
				case DROP:
				case EPOCH:
				case EVERY:
				case EXTERNAL:
				case EXTRACT:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUSION:
				case GROUPING:
				case HASH:
				case HOUR:
				case INDEX:
				case INSERT:
				case INTERSECTION:
				case ISODOW:
				case ISOYEAR:
				case KEY:
				case LAST:
				case LESS:
				case LIST:
				case LOCATION:
				case MAX:
				case MAXVALUE:
				case MICROSECONDS:
				case MILLENNIUM:
				case MILLISECONDS:
				case MIN:
				case MINUTE:
				case MONTH:
				case NATIONAL:
				case NULLIF:
				case ONLY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONS:
				case PRECEDING:
				case PRECISION:
				case QUARTER:
				case RANGE:
				case RECURSIVE:
				case REGEXP:
				case REPLACE:
				case RESTRICT:
				case RETURNING:
				case RLIKE:
				case ROLLUP:
				case ROWS:
				case SCHEMA:
				case SECOND:
				case SEQUENCE:
				case SEQUENCES:
				case SET:
				case SIMILAR:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case SUBPARTITION:
				case SUM:
				case TABLES:
				case TABLESPACE:
				case THAN:
				case TIMEZONE:
				case TIMEZONE_HOUR:
				case TIMEZONE_MINUTE:
				case TRIM:
				case TO:
				case TYPE:
				case UNBOUNDED:
				case UNKNOWN:
				case USAGE:
				case VAR_SAMP:
				case VAR_POP:
				case VARYING:
				case VERBOSE:
				case WEEK:
				case WINDOW:
				case YEAR:
				case ZONE:
				case BOOLEAN:
				case BOOL:
				case BIT:
				case VARBIT:
				case INT1:
				case INT2:
				case INT4:
				case INT8:
				case TINYINT:
				case SMALLINT:
				case INT:
				case INTEGER:
				case BIGINT:
				case FLOAT4:
				case FLOAT8:
				case REAL:
				case FLOAT:
				case DOUBLE:
				case NUMERIC:
				case DECIMAL:
				case CHAR:
				case VARCHAR:
				case NCHAR:
				case NVARCHAR:
				case DATE:
				case INTERVAL:
				case TIME:
				case TIMETZ:
				case TIMESTAMP:
				case TIMESTAMPTZ:
				case TEXT:
				case VARBINARY:
				case BLOB:
				case BYTEA:
				case INET4:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
					{
					setState(2869); ((Column_referenceContext)_localctx).name = identifier();
					}
					break;
				case MULTIPLY:
					{
					setState(2870); match(MULTIPLY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(2875); array_slice();
			setState(2880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2876); match(DOT);
					setState(2877); column_reference();
					}
					} 
				}
				setState(2882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public Truth_valueContext truth_value() {
			return getRuleContext(Truth_valueContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public As_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_clause; }
	}

	public final As_clauseContext as_clause() throws RecognitionException {
		As_clauseContext _localctx = new As_clauseContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_as_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2883); match(AS);
				}
			}

			setState(2889);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(2886); identifier();
				}
				break;
			case 2:
				{
				setState(2887); truth_value();
				}
				break;
			case 3:
				{
				setState(2888); match(NULL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_reference_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Column_referenceContext column_reference(int i) {
			return getRuleContext(Column_referenceContext.class,i);
		}
		public List<Column_referenceContext> column_reference() {
			return getRuleContexts(Column_referenceContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Column_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_reference_list; }
	}

	public final Column_reference_listContext column_reference_list() throws RecognitionException {
		Column_reference_listContext _localctx = new Column_reference_listContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_column_reference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2891); column_reference();
			setState(2896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2892); match(COMMA);
				setState(2893); column_reference();
				}
				}
				setState(2898);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Scalar_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_subquery; }
	}

	public final Scalar_subqueryContext scalar_subquery() throws RecognitionException {
		Scalar_subqueryContext _localctx = new Scalar_subqueryContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2899); subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Row_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_subquery; }
	}

	public final Row_subqueryContext row_subquery() throws RecognitionException {
		Row_subqueryContext _localctx = new Row_subqueryContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_row_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2901); subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_subquery; }
	}

	public final Table_subqueryContext table_subquery() throws RecognitionException {
		Table_subqueryContext _localctx = new Table_subqueryContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_table_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903); subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Data_statementContext data_statement() {
			return getRuleContext(Data_statementContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2905); match(LEFT_PAREN);
			setState(2906); data_statement();
			setState(2907); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Distinct_from_predicateContext distinct_from_predicate() {
			return getRuleContext(Distinct_from_predicateContext.class,0);
		}
		public Type_comp_predicateContext type_comp_predicate() {
			return getRuleContext(Type_comp_predicateContext.class,0);
		}
		public Pattern_matching_predicateContext pattern_matching_predicate() {
			return getRuleContext(Pattern_matching_predicateContext.class,0);
		}
		public Exists_predicateContext exists_predicate() {
			return getRuleContext(Exists_predicateContext.class,0);
		}
		public In_predicateContext in_predicate() {
			return getRuleContext(In_predicateContext.class,0);
		}
		public Custom_predicateContext custom_predicate() {
			return getRuleContext(Custom_predicateContext.class,0);
		}
		public Null_predicateContext null_predicate() {
			return getRuleContext(Null_predicateContext.class,0);
		}
		public Between_predicateContext between_predicate() {
			return getRuleContext(Between_predicateContext.class,0);
		}
		public Comparison_predicateContext comparison_predicate() {
			return getRuleContext(Comparison_predicateContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_predicate);
		try {
			setState(2918);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2909); comparison_predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2910); type_comp_predicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2911); between_predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2912); in_predicate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2913); pattern_matching_predicate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2914); null_predicate();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2915); exists_predicate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2916); distinct_from_predicate();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2917); custom_predicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Custom_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext left;
		public Custom_operatorContext c;
		public Row_value_predicandContext right;
		public Custom_operatorContext custom_operator() {
			return getRuleContext(Custom_operatorContext.class,0);
		}
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public Custom_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_predicate; }
	}

	public final Custom_predicateContext custom_predicate() throws RecognitionException {
		Custom_predicateContext _localctx = new Custom_predicateContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_custom_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2920); ((Custom_predicateContext)_localctx).left = row_value_predicand();
			setState(2921); ((Custom_predicateContext)_localctx).c = custom_operator();
			setState(2922); ((Custom_predicateContext)_localctx).right = row_value_predicand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Custom_operatorContext extends ParserRuleContext {
		public TerminalNode NOT_SIMILAR() { return getToken(SQLParser.NOT_SIMILAR, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public Postgis_operatorContext postgis_operator() {
			return getRuleContext(Postgis_operatorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode NOT_SIMILAR_INSENSITIVE() { return getToken(SQLParser.NOT_SIMILAR_INSENSITIVE, 0); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode CUSTOME_OPERAND() { return getToken(SQLParser.CUSTOME_OPERAND, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode SIMILAR_INSENSITIVE() { return getToken(SQLParser.SIMILAR_INSENSITIVE, 0); }
		public TerminalNode DIVIDE() { return getToken(SQLParser.DIVIDE, 0); }
		public Custom_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_operator; }
	}

	public final Custom_operatorContext custom_operator() throws RecognitionException {
		Custom_operatorContext _localctx = new Custom_operatorContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_custom_operator);
		int _la;
		try {
			setState(2926);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
			case CUSTOME_OPERAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(2924);
				_la = _input.LA(1);
				if ( !(((((_la - 319)) & ~0x3f) == 0 && ((1L << (_la - 319)) & ((1L << (PLUS - 319)) | (1L << (MINUS - 319)) | (1L << (MULTIPLY - 319)) | (1L << (DIVIDE - 319)) | (1L << (TILDE - 319)) | (1L << (NOT_SIMILAR - 319)) | (1L << (SIMILAR_INSENSITIVE - 319)) | (1L << (NOT_SIMILAR_INSENSITIVE - 319)) | (1L << (CUSTOME_OPERAND - 319)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case INTERSECT2D:
			case INTERSECT3D:
			case OVERLAP:
			case LEFT_OF:
			case RIGHT_OF:
			case ABOVE:
			case OVERLAPS_ABOVE:
			case BELOW:
			case BOX_EQUAL:
			case DISTANCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2925); postgis_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postgis_operatorContext extends ParserRuleContext {
		public TerminalNode BOX_EQUAL() { return getToken(SQLParser.BOX_EQUAL, 0); }
		public TerminalNode DISTANCE() { return getToken(SQLParser.DISTANCE, 0); }
		public TerminalNode ABOVE() { return getToken(SQLParser.ABOVE, 0); }
		public TerminalNode RIGHT_OF() { return getToken(SQLParser.RIGHT_OF, 0); }
		public TerminalNode INTERSECT3D() { return getToken(SQLParser.INTERSECT3D, 0); }
		public TerminalNode BELOW() { return getToken(SQLParser.BELOW, 0); }
		public TerminalNode OVERLAPS_ABOVE() { return getToken(SQLParser.OVERLAPS_ABOVE, 0); }
		public TerminalNode LEFT_OF() { return getToken(SQLParser.LEFT_OF, 0); }
		public TerminalNode INTERSECT2D() { return getToken(SQLParser.INTERSECT2D, 0); }
		public TerminalNode OVERLAP() { return getToken(SQLParser.OVERLAP, 0); }
		public Postgis_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postgis_operator; }
	}

	public final Postgis_operatorContext postgis_operator() throws RecognitionException {
		Postgis_operatorContext _localctx = new Postgis_operatorContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2928);
			_la = _input.LA(1);
			if ( !(((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (INTERSECT2D - 330)) | (1L << (INTERSECT3D - 330)) | (1L << (OVERLAP - 330)) | (1L << (LEFT_OF - 330)) | (1L << (RIGHT_OF - 330)) | (1L << (ABOVE - 330)) | (1L << (OVERLAPS_ABOVE - 330)) | (1L << (BELOW - 330)) | (1L << (BOX_EQUAL - 330)) | (1L << (DISTANCE - 330)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext left;
		public Comp_opContext c;
		public Row_value_predicandContext right;
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public Comparison_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_predicate; }
	}

	public final Comparison_predicateContext comparison_predicate() throws RecognitionException {
		Comparison_predicateContext _localctx = new Comparison_predicateContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2930); ((Comparison_predicateContext)_localctx).left = row_value_predicand();
			setState(2931); ((Comparison_predicateContext)_localctx).c = comp_op();
			setState(2932); ((Comparison_predicateContext)_localctx).right = row_value_predicand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(SQLParser.GEQ, 0); }
		public TerminalNode GTH() { return getToken(SQLParser.GTH, 0); }
		public TerminalNode LEQ() { return getToken(SQLParser.LEQ, 0); }
		public TerminalNode EQUAL() { return getToken(SQLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SQLParser.NOT_EQUAL, 0); }
		public TerminalNode LTH() { return getToken(SQLParser.LTH, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2934);
			_la = _input.LA(1);
			if ( !(((((_la - 305)) & ~0x3f) == 0 && ((1L << (_la - 305)) & ((1L << (EQUAL - 305)) | (1L << (NOT_EQUAL - 305)) | (1L << (LTH - 305)) | (1L << (LEQ - 305)) | (1L << (GTH - 305)) | (1L << (GEQ - 305)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_comp_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public TerminalNode OF() { return getToken(SQLParser.OF, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public Type_comp_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_comp_predicate; }
	}

	public final Type_comp_predicateContext type_comp_predicate() throws RecognitionException {
		Type_comp_predicateContext _localctx = new Type_comp_predicateContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_type_comp_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2936); row_value_predicand();
			setState(2937); match(IS);
			setState(2938); match(OF);
			setState(2939); match(LEFT_PAREN);
			setState(2940); data_type();
			setState(2941); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext predicand;
		public Between_predicate_part_2Context between_predicate_part_2() {
			return getRuleContext(Between_predicate_part_2Context.class,0);
		}
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public Between_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_predicate; }
	}

	public final Between_predicateContext between_predicate() throws RecognitionException {
		Between_predicateContext _localctx = new Between_predicateContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_between_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2943); ((Between_predicateContext)_localctx).predicand = row_value_predicand();
			setState(2944); between_predicate_part_2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_predicate_part_2Context extends ParserRuleContext {
		public Row_value_predicandContext begin;
		public Row_value_predicandContext end;
		public TerminalNode ASYMMETRIC() { return getToken(SQLParser.ASYMMETRIC, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLParser.SYMMETRIC, 0); }
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Between_predicate_part_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_predicate_part_2; }
	}

	public final Between_predicate_part_2Context between_predicate_part_2() throws RecognitionException {
		Between_predicate_part_2Context _localctx = new Between_predicate_part_2Context(_ctx, getState());
		enterRule(_localctx, 506, RULE_between_predicate_part_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2946); match(NOT);
				}
			}

			setState(2949); match(BETWEEN);
			setState(2951);
			_la = _input.LA(1);
			if (_la==ASYMMETRIC || _la==SYMMETRIC) {
				{
				setState(2950);
				_la = _input.LA(1);
				if ( !(_la==ASYMMETRIC || _la==SYMMETRIC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(2953); ((Between_predicate_part_2Context)_localctx).begin = row_value_predicand();
			setState(2954); match(AND);
			setState(2955); ((Between_predicate_part_2Context)_localctx).end = row_value_predicand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_predicateContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public In_value_listContext in_value_list() {
			return getRuleContext(In_value_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public In_predicate_valueContext in_predicate_value() {
			return getRuleContext(In_predicate_valueContext.class,0);
		}
		public In_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_predicate; }
	}

	public final In_predicateContext in_predicate() throws RecognitionException {
		In_predicateContext _localctx = new In_predicateContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_in_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2959);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				{
				setState(2957); numeric_value_expression();
				}
				break;
			case 2:
				{
				setState(2958); in_value_list();
				}
				break;
			}
			setState(2962);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2961); match(NOT);
				}
			}

			setState(2964); match(IN);
			setState(2965); in_predicate_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_predicate_valueContext extends ParserRuleContext {
		public In_value_listContext in_value_list() {
			return getRuleContext(In_value_listContext.class,0);
		}
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public Row_values_listContext row_values_list() {
			return getRuleContext(Row_values_listContext.class,0);
		}
		public In_predicate_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_predicate_value; }
	}

	public final In_predicate_valueContext in_predicate_value() throws RecognitionException {
		In_predicate_valueContext _localctx = new In_predicate_valueContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_in_predicate_value);
		try {
			setState(2970);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2967); table_subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2968); in_value_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2969); row_values_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_value_listContext extends ParserRuleContext {
		public List<In_value_listContext> in_value_list() {
			return getRuleContexts(In_value_listContext.class);
		}
		public List<Numeric_primaryContext> numeric_primary() {
			return getRuleContexts(Numeric_primaryContext.class);
		}
		public Numeric_primaryContext numeric_primary(int i) {
			return getRuleContext(Numeric_primaryContext.class,i);
		}
		public In_value_listContext in_value_list(int i) {
			return getRuleContext(In_value_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public In_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_value_list; }
	}

	public final In_value_listContext in_value_list() throws RecognitionException {
		In_value_listContext _localctx = new In_value_listContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_in_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972); match(LEFT_PAREN);
			setState(2975);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(2973); numeric_primary();
				}
				break;
			case 2:
				{
				setState(2974); in_value_list();
				}
				break;
			}
			setState(2984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2977); match(COMMA);
				setState(2980);
				switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
				case 1:
					{
					setState(2978); numeric_primary();
					}
					break;
				case 2:
					{
					setState(2979); in_value_list();
					}
					break;
				}
				}
				}
				setState(2986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2987); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_matching_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext left;
		public Row_value_predicandContext right;
		public TerminalNode ESCAPE() { return getToken(SQLParser.ESCAPE, 0); }
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pattern_matcherContext pattern_matcher() {
			return getRuleContext(Pattern_matcherContext.class,0);
		}
		public Pattern_matching_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matching_predicate; }
	}

	public final Pattern_matching_predicateContext pattern_matching_predicate() throws RecognitionException {
		Pattern_matching_predicateContext _localctx = new Pattern_matching_predicateContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_pattern_matching_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2989); ((Pattern_matching_predicateContext)_localctx).left = row_value_predicand();
			setState(2990); pattern_matcher();
			setState(2991); ((Pattern_matching_predicateContext)_localctx).right = row_value_predicand();
			setState(2994);
			_la = _input.LA(1);
			if (_la==ESCAPE) {
				{
				setState(2992); match(ESCAPE);
				setState(2993); match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_matcherContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Negativable_matcherContext negativable_matcher() {
			return getRuleContext(Negativable_matcherContext.class,0);
		}
		public Regex_matcherContext regex_matcher() {
			return getRuleContext(Regex_matcherContext.class,0);
		}
		public Pattern_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matcher; }
	}

	public final Pattern_matcherContext pattern_matcher() throws RecognitionException {
		Pattern_matcherContext _localctx = new Pattern_matcherContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_pattern_matcher);
		int _la;
		try {
			setState(3001);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2997);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2996); match(NOT);
					}
				}

				setState(2999); negativable_matcher();
				}
				break;
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3000); regex_matcher();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negativable_matcherContext extends ParserRuleContext {
		public TerminalNode SIMILAR() { return getToken(SQLParser.SIMILAR, 0); }
		public TerminalNode REGEXP() { return getToken(SQLParser.REGEXP, 0); }
		public TerminalNode ILIKE() { return getToken(SQLParser.ILIKE, 0); }
		public TerminalNode RLIKE() { return getToken(SQLParser.RLIKE, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public Negativable_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativable_matcher; }
	}

	public final Negativable_matcherContext negativable_matcher() throws RecognitionException {
		Negativable_matcherContext _localctx = new Negativable_matcherContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_negativable_matcher);
		int _la;
		try {
			setState(3006);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case REGEXP:
			case RLIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3003);
				_la = _input.LA(1);
				if ( !(_la==ILIKE || _la==LIKE || _la==REGEXP || _la==RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(3004); match(SIMILAR);
				setState(3005); match(TO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Regex_matcherContext extends ParserRuleContext {
		public TerminalNode NOT_SIMILAR() { return getToken(SQLParser.NOT_SIMILAR, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode NOT_SIMILAR_INSENSITIVE() { return getToken(SQLParser.NOT_SIMILAR_INSENSITIVE, 0); }
		public TerminalNode SIMILAR_INSENSITIVE() { return getToken(SQLParser.SIMILAR_INSENSITIVE, 0); }
		public Regex_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_matcher; }
	}

	public final Regex_matcherContext regex_matcher() throws RecognitionException {
		Regex_matcherContext _localctx = new Regex_matcherContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3008);
			_la = _input.LA(1);
			if ( !(((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & ((1L << (TILDE - 329)) | (1L << (NOT_SIMILAR - 329)) | (1L << (SIMILAR_INSENSITIVE - 329)) | (1L << (NOT_SIMILAR_INSENSITIVE - 329)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext predicand;
		public Row_value_predicandContext row_value_predicand() {
			return getRuleContext(Row_value_predicandContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Null_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_predicate; }
	}

	public final Null_predicateContext null_predicate() throws RecognitionException {
		Null_predicateContext _localctx = new Null_predicateContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_null_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3010); ((Null_predicateContext)_localctx).predicand = row_value_predicand();
			setState(3011); match(IS);
			setState(3013);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3012); match(NOT);
				}
			}

			setState(3015); match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantified_comparison_predicateContext extends ParserRuleContext {
		public QuantifierContext q;
		public Custom_operatorContext custom_operator() {
			return getRuleContext(Custom_operatorContext.class,0);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Quantified_comparison_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantified_comparison_predicate; }
	}

	public final Quantified_comparison_predicateContext quantified_comparison_predicate() throws RecognitionException {
		Quantified_comparison_predicateContext _localctx = new Quantified_comparison_predicateContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_quantified_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3017); numeric_value_expression();
			setState(3020);
			switch (_input.LA(1)) {
			case EQUAL:
			case NOT_EQUAL:
			case LTH:
			case LEQ:
			case GTH:
			case GEQ:
				{
				setState(3018); comp_op();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
			case TILDE:
			case INTERSECT2D:
			case INTERSECT3D:
			case OVERLAP:
			case LEFT_OF:
			case RIGHT_OF:
			case ABOVE:
			case OVERLAPS_ABOVE:
			case BELOW:
			case BOX_EQUAL:
			case DISTANCE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
			case CUSTOME_OPERAND:
				{
				setState(3019); custom_operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3022); ((Quantified_comparison_predicateContext)_localctx).q = quantifier();
			setState(3023); table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public SomeContext some() {
			return getRuleContext(SomeContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_quantifier);
		try {
			setState(3027);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3025); all();
				}
				break;
			case ANY:
			case SOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(3026); some();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3029); match(ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomeContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(SQLParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public SomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some; }
	}

	public final SomeContext some() throws RecognitionException {
		SomeContext _localctx = new SomeContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3031);
			_la = _input.LA(1);
			if ( !(_la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exists_predicateContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public Exists_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_predicate; }
	}

	public final Exists_predicateContext exists_predicate() throws RecognitionException {
		Exists_predicateContext _localctx = new Exists_predicateContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_exists_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3034);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3033); match(NOT);
				}
			}

			setState(3036); match(EXISTS);
			setState(3037); table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unique_predicateContext extends ParserRuleContext {
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public Unique_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique_predicate; }
	}

	public final Unique_predicateContext unique_predicate() throws RecognitionException {
		Unique_predicateContext _localctx = new Unique_predicateContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_unique_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3039); match(UNIQUE);
			setState(3040); table_subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distinct_from_predicateContext extends ParserRuleContext {
		public Row_value_predicandContext left;
		public Row_value_predicandContext right;
		public Row_value_predicandContext row_value_predicand(int i) {
			return getRuleContext(Row_value_predicandContext.class,i);
		}
		public List<Row_value_predicandContext> row_value_predicand() {
			return getRuleContexts(Row_value_predicandContext.class);
		}
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public Distinct_from_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct_from_predicate; }
	}

	public final Distinct_from_predicateContext distinct_from_predicate() throws RecognitionException {
		Distinct_from_predicateContext _localctx = new Distinct_from_predicateContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_distinct_from_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3042); ((Distinct_from_predicateContext)_localctx).left = row_value_predicand();
			setState(3043); match(IS);
			setState(3045);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3044); match(NOT);
				}
			}

			setState(3047); match(DISTINCT);
			setState(3048); match(FROM);
			setState(3049); ((Distinct_from_predicateContext)_localctx).right = row_value_predicand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
		public Non_second_primary_datetime_fieldContext non_second_primary_datetime_field() {
			return getRuleContext(Non_second_primary_datetime_fieldContext.class,0);
		}
		public Primary_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_datetime_field; }
	}

	public final Primary_datetime_fieldContext primary_datetime_field() throws RecognitionException {
		Primary_datetime_fieldContext _localctx = new Primary_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_primary_datetime_field);
		try {
			setState(3053);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(3051); non_second_primary_datetime_field();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(3052); match(SECOND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_second_primary_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode HOUR() { return getToken(SQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public Non_second_primary_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_second_primary_datetime_field; }
	}

	public final Non_second_primary_datetime_fieldContext non_second_primary_datetime_field() throws RecognitionException {
		Non_second_primary_datetime_fieldContext _localctx = new Non_second_primary_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_non_second_primary_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3055);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==MONTH || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extended_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode ISODOW() { return getToken(SQLParser.ISODOW, 0); }
		public TerminalNode EPOCH() { return getToken(SQLParser.EPOCH, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode DOY() { return getToken(SQLParser.DOY, 0); }
		public TerminalNode MILLENNIUM() { return getToken(SQLParser.MILLENNIUM, 0); }
		public TerminalNode DECADE() { return getToken(SQLParser.DECADE, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SQLParser.MICROSECONDS, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode CENTURY() { return getToken(SQLParser.CENTURY, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SQLParser.MILLISECONDS, 0); }
		public TerminalNode ISOYEAR() { return getToken(SQLParser.ISOYEAR, 0); }
		public TerminalNode DOW() { return getToken(SQLParser.DOW, 0); }
		public Extended_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_datetime_field; }
	}

	public final Extended_datetime_fieldContext extended_datetime_field() throws RecognitionException {
		Extended_datetime_fieldContext _localctx = new Extended_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_extended_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3057);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (CENTURY - 89)) | (1L << (DECADE - 89)) | (1L << (DOW - 89)) | (1L << (DOY - 89)) | (1L << (EPOCH - 89)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (ISODOW - 153)) | (1L << (ISOYEAR - 153)) | (1L << (MICROSECONDS - 153)) | (1L << (MILLENNIUM - 153)) | (1L << (MILLISECONDS - 153)) | (1L << (QUARTER - 153)))) != 0) || _la==WEEK) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_clauseContext extends ParserRuleContext {
		public Unsigned_numeric_literalContext count;
		public TerminalNode NEXT() { return getToken(SQLParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public TerminalNode ONLY() { return getToken(SQLParser.ONLY, 0); }
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public TerminalNode FETCH() { return getToken(SQLParser.FETCH, 0); }
		public Fetch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_clause; }
	}

	public final Fetch_clauseContext fetch_clause() throws RecognitionException {
		Fetch_clauseContext _localctx = new Fetch_clauseContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_fetch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3059); match(FETCH);
			setState(3060);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(3062);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==REAL_NUMBER) {
				{
				setState(3061); ((Fetch_clauseContext)_localctx).count = unsigned_numeric_literal();
				}
			}

			setState(3064);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(3065); match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLParser.FOR, 0); }
		public TerminalNode NO() { return getToken(SQLParser.NO, 0); }
		public TerminalNode OF() { return getToken(SQLParser.OF, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(SQLParser.SHARE, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_for_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3067); match(FOR);
			setState(3075);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(3068); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(3069); match(NO);
				setState(3070); match(KEY);
				setState(3071); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(3072); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(3073); match(KEY);
				setState(3074); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3079);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(3077); match(OF);
				setState(3078); table_name_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Routine_invocationContext extends ParserRuleContext {
		public Sql_argument_listContext sql_argument_list() {
			return getRuleContext(Sql_argument_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Routine_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_invocation; }
	}

	public final Routine_invocationContext routine_invocation() throws RecognitionException {
		Routine_invocationContext _localctx = new Routine_invocationContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_routine_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3081); function_name();
			setState(3082); match(LEFT_PAREN);
			setState(3084);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << FALSE) | (1L << LEFT) | (1L << NOT) | (1L << NULL) | (1L << RIGHT) | (1L << ROW) | (1L << SOME))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRUE - 65)) | (1L << (ANALYZE - 65)) | (1L << (ARRAY - 65)) | (1L << (AVG - 65)) | (1L << (BETWEEN - 65)) | (1L << (BY - 65)) | (1L << (CASCADE - 65)) | (1L << (CENTURY - 65)) | (1L << (CHARACTER - 65)) | (1L << (COLLECT - 65)) | (1L << (COALESCE - 65)) | (1L << (COLUMN - 65)) | (1L << (COUNT - 65)) | (1L << (CUBE - 65)) | (1L << (CURSOR - 65)) | (1L << (CYCLE - 65)) | (1L << (DATA - 65)) | (1L << (DAY - 65)) | (1L << (DEC - 65)) | (1L << (DECADE - 65)) | (1L << (DOW - 65)) | (1L << (DOY - 65)) | (1L << (DROP - 65)) | (1L << (EPOCH - 65)) | (1L << (EVERY - 65)) | (1L << (EXISTS - 65)) | (1L << (EXTERNAL - 65)) | (1L << (EXTRACT - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (FOLLOWING - 129)) | (1L << (FORMAT - 129)) | (1L << (FUSION - 129)) | (1L << (GROUPING - 129)) | (1L << (HASH - 129)) | (1L << (HOUR - 129)) | (1L << (INDEX - 129)) | (1L << (INSERT - 129)) | (1L << (INTERSECTION - 129)) | (1L << (ISODOW - 129)) | (1L << (ISOYEAR - 129)) | (1L << (KEY - 129)) | (1L << (LAST - 129)) | (1L << (LESS - 129)) | (1L << (LIST - 129)) | (1L << (LOCATION - 129)) | (1L << (MAX - 129)) | (1L << (MAXVALUE - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLENNIUM - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MIN - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (NATIONAL - 129)) | (1L << (NULLIF - 129)) | (1L << (ONLY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PRECISION - 193)) | (1L << (QUARTER - 193)) | (1L << (RANGE - 193)) | (1L << (RECURSIVE - 193)) | (1L << (REGEXP - 193)) | (1L << (REPLACE - 193)) | (1L << (RESTRICT - 193)) | (1L << (RETURNING - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROWS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SECOND - 193)) | (1L << (SEQUENCE - 193)) | (1L << (SEQUENCES - 193)) | (1L << (SET - 193)) | (1L << (SIMILAR - 193)) | (1L << (STDDEV_POP - 193)) | (1L << (STDDEV_SAMP - 193)) | (1L << (SUBPARTITION - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SUM - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESPACE - 193)) | (1L << (THAN - 193)) | (1L << (TIMEZONE - 193)) | (1L << (TIMEZONE_HOUR - 193)) | (1L << (TIMEZONE_MINUTE - 193)) | (1L << (TRIM - 193)) | (1L << (TO - 193)) | (1L << (TYPE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNKNOWN - 193)) | (1L << (USAGE - 193)) | (1L << (VARIADIC - 193)) | (1L << (VAR_SAMP - 193)) | (1L << (VAR_POP - 193)) | (1L << (VARYING - 193)) | (1L << (VERBOSE - 193)) | (1L << (WEEK - 193)) | (1L << (WINDOW - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (BOOLEAN - 258)) | (1L << (BOOL - 258)) | (1L << (BIT - 258)) | (1L << (VARBIT - 258)) | (1L << (INT1 - 258)) | (1L << (INT2 - 258)) | (1L << (INT4 - 258)) | (1L << (INT8 - 258)) | (1L << (TINYINT - 258)) | (1L << (SMALLINT - 258)) | (1L << (INT - 258)) | (1L << (INTEGER - 258)) | (1L << (BIGINT - 258)) | (1L << (FLOAT4 - 258)) | (1L << (FLOAT8 - 258)) | (1L << (REAL - 258)) | (1L << (FLOAT - 258)) | (1L << (DOUBLE - 258)) | (1L << (NUMERIC - 258)) | (1L << (DECIMAL - 258)) | (1L << (CHAR - 258)) | (1L << (VARCHAR - 258)) | (1L << (NCHAR - 258)) | (1L << (NVARCHAR - 258)) | (1L << (DATE - 258)) | (1L << (INTERVAL - 258)) | (1L << (TIME - 258)) | (1L << (TIMETZ - 258)) | (1L << (TIMESTAMP - 258)) | (1L << (TIMESTAMPTZ - 258)) | (1L << (TEXT - 258)) | (1L << (TSVECTOR - 258)) | (1L << (TSQUERY - 258)) | (1L << (BINARY - 258)) | (1L << (VARBINARY - 258)) | (1L << (BLOB - 258)) | (1L << (BYTEA - 258)) | (1L << (INET4 - 258)) | (1L << (BOX2D - 258)) | (1L << (BOX3D - 258)) | (1L << (GEOMETRY - 258)) | (1L << (GEOMETRY_DUMP - 258)) | (1L << (GEOGRAPHY - 258)) | (1L << (LEFT_PAREN - 258)) | (1L << (PLUS - 258)) | (1L << (MINUS - 258)) | (1L << (MULTIPLY - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (DIVIDE - 322)) | (1L << (TILDE - 322)) | (1L << (INTERSECT2D - 322)) | (1L << (INTERSECT3D - 322)) | (1L << (OVERLAP - 322)) | (1L << (LEFT_OF - 322)) | (1L << (RIGHT_OF - 322)) | (1L << (ABOVE - 322)) | (1L << (OVERLAPS_ABOVE - 322)) | (1L << (BELOW - 322)) | (1L << (BOX_EQUAL - 322)) | (1L << (DISTANCE - 322)) | (1L << (NOT_SIMILAR - 322)) | (1L << (SIMILAR_INSENSITIVE - 322)) | (1L << (NOT_SIMILAR_INSENSITIVE - 322)) | (1L << (NUMBER - 322)) | (1L << (REAL_NUMBER - 322)) | (1L << (CUSTOME_OPERAND - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (REGEX - 322)) | (1L << (STRING_LITERAL - 322)))) != 0)) {
				{
				setState(3083); sql_argument_list();
				}
			}

			setState(3086); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_names_for_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQLParser.ANY, 0); }
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public Function_names_for_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_names_for_reserved_words; }
	}

	public final Function_names_for_reserved_wordsContext function_names_for_reserved_words() throws RecognitionException {
		Function_names_for_reserved_wordsContext _localctx = new Function_names_for_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_function_names_for_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3088);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << LEFT) | (1L << RIGHT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Table_nameContext func_name;
		public Function_names_for_reserved_wordsContext function_names_for_reserved_words() {
			return getRuleContext(Function_names_for_reserved_wordsContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_function_name);
		try {
			setState(3092);
			switch (_input.LA(1)) {
			case ANALYZE:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3090); ((Function_nameContext)_localctx).func_name = table_name();
				}
				break;
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3091); function_names_for_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_argument_listContext extends ParserRuleContext {
		public List<Sql_argumentContext> sql_argument() {
			return getRuleContexts(Sql_argumentContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public Sql_argumentContext sql_argument(int i) {
			return getRuleContext(Sql_argumentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Sql_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_argument_list; }
	}

	public final Sql_argument_listContext sql_argument_list() throws RecognitionException {
		Sql_argument_listContext _localctx = new Sql_argument_listContext(_ctx, getState());
		enterRule(_localctx, 554, RULE_sql_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3094); sql_argument();
			setState(3099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3095); match(COMMA);
				setState(3096); sql_argument();
				}
				}
				setState(3101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_argumentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode VARIADIC() { return getToken(SQLParser.VARIADIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Sql_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_argument; }
	}

	public final Sql_argumentContext sql_argument() throws RecognitionException {
		Sql_argumentContext _localctx = new Sql_argumentContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_sql_argument);
		int _la;
		try {
			setState(3110);
			switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3103);
				_la = _input.LA(1);
				if (_la==VARIADIC) {
					{
					setState(3102); match(VARIADIC);
					}
				}

				setState(3105); value_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3106); identifier();
				setState(3107); match(ASSIGN);
				setState(3108); value_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode WINDOW() { return getToken(SQLParser.WINDOW, 0); }
		public Window_definitionContext window_definition() {
			return getRuleContext(Window_definitionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SQLParser.LEFT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Window_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_clause; }
	}

	public final Window_clauseContext window_clause() throws RecognitionException {
		Window_clauseContext _localctx = new Window_clauseContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_window_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3112); match(WINDOW);
			setState(3113); identifier();
			setState(3114); match(AS);
			setState(3115); match(LEFT_PAREN);
			setState(3116); window_definition();
			setState(3117); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_definitionContext extends ParserRuleContext {
		public IdentifierContext existing_window_name;
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Window_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition; }
	}

	public final Window_definitionContext window_definition() throws RecognitionException {
		Window_definitionContext _localctx = new Window_definitionContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3120);
			switch ( getInterpreter().adaptivePredict(_input,428,_ctx) ) {
			case 1:
				{
				setState(3119); ((Window_definitionContext)_localctx).existing_window_name = identifier();
				}
				break;
			}
			setState(3124);
			switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
			case 1:
				{
				setState(3122); match(PARTITION);
				setState(3123); match(BY);
				}
				break;
			}
			setState(3127);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(3126); orderby_clause();
				}
			}

			setState(3129); frame_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_clauseContext extends ParserRuleContext {
		public FrameContext frame_start;
		public FrameContext frame_end;
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode RANGE() { return getToken(SQLParser.RANGE, 0); }
		public FrameContext frame(int i) {
			return getRuleContext(FrameContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SQLParser.ROWS, 0); }
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public List<FrameContext> frame() {
			return getRuleContexts(FrameContext.class);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 562, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3132);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				{
				setState(3131);
				_la = _input.LA(1);
				if ( !(_la==RANGE || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(3135);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(3134); match(BETWEEN);
				}
				break;
			}
			setState(3137); ((Frame_clauseContext)_localctx).frame_start = frame();
			setState(3140);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(3138); match(AND);
				setState(3139); ((Frame_clauseContext)_localctx).frame_end = frame();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameContext extends ParserRuleContext {
		public Nonparenthesized_value_expression_primaryContext value;
		public TerminalNode ROW() { return getToken(SQLParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLParser.PRECEDING, 0); }
		public TerminalNode CURRENT() { return getToken(SQLParser.CURRENT, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLParser.FOLLOWING, 0); }
		public Nonparenthesized_value_expression_primaryContext nonparenthesized_value_expression_primary() {
			return getRuleContext(Nonparenthesized_value_expression_primaryContext.class,0);
		}
		public FrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame; }
	}

	public final FrameContext frame() throws RecognitionException {
		FrameContext _localctx = new FrameContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_frame);
		int _la;
		try {
			setState(3150);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CASE:
			case CAST:
			case FALSE:
			case LEFT:
			case NULL:
			case RIGHT:
			case ROW:
			case SOME:
			case TRUE:
			case ANALYZE:
			case ARRAY:
			case AVG:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case COLLECT:
			case COALESCE:
			case COLUMN:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DOW:
			case DOY:
			case DROP:
			case EPOCH:
			case EVERY:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUSION:
			case GROUPING:
			case HASH:
			case HOUR:
			case INDEX:
			case INSERT:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LESS:
			case LIST:
			case LOCATION:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINUTE:
			case MONTH:
			case NATIONAL:
			case NULLIF:
			case ONLY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONS:
			case PRECEDING:
			case PRECISION:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REGEXP:
			case REPLACE:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case ROWS:
			case SCHEMA:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SET:
			case SIMILAR:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case SUBPARTITION:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRIM:
			case TO:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case USAGE:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case YEAR:
			case ZONE:
			case BOOLEAN:
			case BOOL:
			case BIT:
			case VARBIT:
			case INT1:
			case INT2:
			case INT4:
			case INT8:
			case TINYINT:
			case SMALLINT:
			case INT:
			case INTEGER:
			case BIGINT:
			case FLOAT4:
			case FLOAT8:
			case REAL:
			case FLOAT:
			case DOUBLE:
			case NUMERIC:
			case DECIMAL:
			case CHAR:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMETZ:
			case TIMESTAMP:
			case TIMESTAMPTZ:
			case TEXT:
			case TSVECTOR:
			case TSQUERY:
			case BINARY:
			case VARBINARY:
			case BLOB:
			case BYTEA:
			case INET4:
			case BOX2D:
			case BOX3D:
			case GEOMETRY:
			case GEOMETRY_DUMP:
			case GEOGRAPHY:
			case LEFT_PAREN:
			case NUMBER:
			case REAL_NUMBER:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case REGEX:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3146);
				switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
				case 1:
					{
					setState(3142); match(UNBOUNDED);
					}
					break;
				case 2:
					{
					{
					setState(3143); ((FrameContext)_localctx).value = nonparenthesized_value_expression_primary();
					setState(3144);
					_la = _input.LA(1);
					if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				}
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3148); match(CURRENT);
				setState(3149); match(ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Offset_clauseContext extends ParserRuleContext {
		public Numeric_value_expressionContext e;
		public TerminalNode OFFSET() { return getToken(SQLParser.OFFSET, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Offset_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_clause; }
	}

	public final Offset_clauseContext offset_clause() throws RecognitionException {
		Offset_clauseContext _localctx = new Offset_clauseContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_offset_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3152); match(OFFSET);
			setState(3153); ((Offset_clauseContext)_localctx).e = numeric_value_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public Sort_specifier_listContext sort_specifier_list() {
			return getRuleContext(Sort_specifier_listContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_orderby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3155); match(ORDER);
			setState(3156); match(BY);
			setState(3157); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_specifier_listContext extends ParserRuleContext {
		public List<Sort_specifierContext> sort_specifier() {
			return getRuleContexts(Sort_specifierContext.class);
		}
		public Sort_specifierContext sort_specifier(int i) {
			return getRuleContext(Sort_specifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Sort_specifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_specifier_list; }
	}

	public final Sort_specifier_listContext sort_specifier_list() throws RecognitionException {
		Sort_specifier_listContext _localctx = new Sort_specifier_listContext(_ctx, getState());
		enterRule(_localctx, 570, RULE_sort_specifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3159); sort_specifier();
			setState(3164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3160); match(COMMA);
					setState(3161); sort_specifier();
					}
					} 
				}
				setState(3166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_specifierContext extends ParserRuleContext {
		public Order_specificationContext order;
		public Null_orderingContext null_order;
		public Order_specificationContext order_specification() {
			return getRuleContext(Order_specificationContext.class,0);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Null_orderingContext null_ordering() {
			return getRuleContext(Null_orderingContext.class,0);
		}
		public Sort_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_specifier; }
	}

	public final Sort_specifierContext sort_specifier() throws RecognitionException {
		Sort_specifierContext _localctx = new Sort_specifierContext(_ctx, getState());
		enterRule(_localctx, 572, RULE_sort_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3167); value_expression();
			setState(3169);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (ASC - 7)) | (1L << (DESC - 7)) | (1L << (USING - 7)))) != 0)) {
				{
				setState(3168); ((Sort_specifierContext)_localctx).order = order_specification();
				}
			}

			setState(3172);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(3171); ((Sort_specifierContext)_localctx).null_order = null_ordering();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_specificationContext extends ParserRuleContext {
		public TerminalNode MODULAR() { return getToken(SQLParser.MODULAR, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public TerminalNode GTH() { return getToken(SQLParser.GTH, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(SQLParser.MULTIPLY, 0); }
		public TerminalNode USING() { return getToken(SQLParser.USING, 0); }
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode CUSTOME_OPERAND() { return getToken(SQLParser.CUSTOME_OPERAND, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode DIVIDE() { return getToken(SQLParser.DIVIDE, 0); }
		public TerminalNode LTH() { return getToken(SQLParser.LTH, 0); }
		public Order_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_specification; }
	}

	public final Order_specificationContext order_specification() throws RecognitionException {
		Order_specificationContext _localctx = new Order_specificationContext(_ctx, getState());
		enterRule(_localctx, 574, RULE_order_specification);
		int _la;
		try {
			setState(3177);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3174);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(3175); match(USING);
				setState(3176);
				_la = _input.LA(1);
				if ( !(((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (LTH - 311)) | (1L << (GTH - 311)) | (1L << (PLUS - 311)) | (1L << (MINUS - 311)) | (1L << (MULTIPLY - 311)) | (1L << (DIVIDE - 311)) | (1L << (MODULAR - 311)) | (1L << (CUSTOME_OPERAND - 311)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public Numeric_value_expressionContext e;
		public TerminalNode LIMIT() { return getToken(SQLParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public Numeric_value_expressionContext numeric_value_expression() {
			return getRuleContext(Numeric_value_expressionContext.class,0);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 576, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3179); match(LIMIT);
			setState(3182);
			switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
			case 1:
				{
				setState(3180); ((Limit_clauseContext)_localctx).e = numeric_value_expression();
				}
				break;
			case 2:
				{
				setState(3181); match(ALL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_orderingContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SQLParser.FIRST, 0); }
		public TerminalNode NULLS() { return getToken(SQLParser.NULLS, 0); }
		public TerminalNode LAST() { return getToken(SQLParser.LAST, 0); }
		public Null_orderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_ordering; }
	}

	public final Null_orderingContext null_ordering() throws RecognitionException {
		Null_orderingContext _localctx = new Null_orderingContext(_ctx, getState());
		enterRule(_localctx, 578, RULE_null_ordering);
		try {
			setState(3188);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3184); match(NULLS);
				setState(3185); match(FIRST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3186); match(NULLS);
				setState(3187); match(LAST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0164\u0c79\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119\t\u0119"+
		"\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d\4\u011e"+
		"\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122\t\u0122"+
		"\4\u0123\t\u0123\3\2\3\2\3\2\7\2\u024a\n\2\f\2\16\2\u024d\13\2\3\2\3\2"+
		"\5\2\u0251\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u025c\n\3\3\4\5"+
		"\4\u025f\n\4\3\4\3\4\5\4\u0263\n\4\3\5\3\5\3\5\5\5\u0268\n\5\3\6\5\6\u026b"+
		"\n\6\3\6\3\6\3\6\5\6\u0270\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u027c\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0283\n\b\3\t\3\t\5\t\u0287\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u028e\n\t\3\t\5\t\u0291\n\t\3\t\3\t\5\t\u0295"+
		"\n\t\3\t\5\t\u0298\n\t\3\n\3\n\3\n\3\n\5\n\u029e\n\n\3\13\3\13\3\13\5"+
		"\13\u02a3\n\13\3\13\5\13\u02a6\n\13\3\13\5\13\u02a9\n\13\3\13\5\13\u02ac"+
		"\n\13\3\13\3\13\3\13\5\13\u02b1\n\13\3\13\3\13\3\13\3\f\3\f\5\f\u02b8"+
		"\n\f\3\f\3\f\3\r\3\r\5\r\u02be\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u02c5\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u02cb\n\17\3\17\3\17\3\17\5\17\u02d0\n\17"+
		"\3\17\5\17\u02d3\n\17\3\17\5\17\u02d6\n\17\3\20\3\20\5\20\u02da\n\20\3"+
		"\20\3\20\3\20\5\20\u02df\n\20\3\21\6\21\u02e2\n\21\r\21\16\21\u02e3\3"+
		"\21\3\21\3\21\3\21\7\21\u02ea\n\21\f\21\16\21\u02ed\13\21\5\21\u02ef\n"+
		"\21\3\21\5\21\u02f2\n\21\3\22\3\22\5\22\u02f6\n\22\3\23\3\23\5\23\u02fa"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u0301\n\24\3\24\3\24\3\24\5\24\u0306"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u030c\n\25\3\25\3\25\3\25\5\25\u0311\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0319\n\25\3\25\3\25\5\25\u031d"+
		"\n\25\3\25\3\25\5\25\u0321\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u032a\n\27\f\27\16\27\u032d\13\27\3\30\3\30\5\30\u0331\n\30\3\31\3\31"+
		"\3\31\7\31\u0336\n\31\f\31\16\31\u0339\13\31\3\31\3\31\5\31\u033d\n\31"+
		"\5\31\u033f\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0349\n"+
		"\31\3\31\3\31\5\31\u034d\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33"+
		"\u0356\n\33\f\33\16\33\u0359\13\33\3\33\3\33\5\33\u035d\n\33\5\33\u035f"+
		"\n\33\3\33\3\33\5\33\u0363\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u036b"+
		"\n\33\3\33\3\33\5\33\u036f\n\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\7\36\u037d\n\36\f\36\16\36\u0380\13\36\3\37\5\37"+
		"\u0383\n\37\3\37\3\37\5\37\u0387\n\37\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u038f\n\37\3\37\3\37\5\37\u0393\n\37\3 \3 \3 \7 \u0398\n \f \16 \u039b"+
		"\13 \3!\3!\3!\3!\5!\u03a1\n!\3\"\5\"\u03a4\n\"\3\"\3\"\5\"\u03a8\n\"\3"+
		"\"\3\"\5\"\u03ac\n\"\3\"\5\"\u03af\n\"\3\"\5\"\u03b2\n\"\3\"\3\"\3\"\3"+
		"\"\7\"\u03b8\n\"\f\"\16\"\u03bb\13\"\3\"\3\"\5\"\u03bf\n\"\3\"\5\"\u03c2"+
		"\n\"\3\"\5\"\u03c5\n\"\3#\3#\3#\3#\7#\u03cb\n#\f#\16#\u03ce\13#\3$\3$"+
		"\5$\u03d2\n$\3$\5$\u03d5\n$\3$\5$\u03d8\n$\3%\3%\5%\u03dc\n%\3&\3&\3&"+
		"\7&\u03e1\n&\f&\16&\u03e4\13&\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u03ed\n(\3)"+
		"\3)\3)\7)\u03f2\n)\f)\16)\u03f5\13)\3*\3*\3*\3*\3*\3*\3*\3*\3+\5+\u0400"+
		"\n+\3+\3+\3+\5+\u0405\n+\3+\3+\5+\u0409\n+\3+\5+\u040c\n+\3+\3+\5+\u0410"+
		"\n+\3+\5+\u0413\n+\3+\5+\u0416\n+\3+\5+\u0419\n+\3,\3,\3,\3,\3,\5,\u0420"+
		"\n,\3-\3-\5-\u0424\n-\3-\3-\5-\u0428\n-\3-\5-\u042b\n-\3-\3-\3-\5-\u0430"+
		"\n-\3-\3-\3-\3-\5-\u0436\n-\3-\5-\u0439\n-\3.\3.\3.\7.\u043e\n.\f.\16"+
		".\u0441\13.\3/\3/\5/\u0445\n/\3/\5/\u0448\n/\3/\5/\u044b\n/\3\60\3\60"+
		"\3\60\5\60\u0450\n\60\3\60\5\60\u0453\n\60\3\60\5\60\u0456\n\60\3\60\3"+
		"\60\3\60\5\60\u045b\n\60\3\60\3\60\3\60\3\60\5\60\u0461\n\60\3\60\3\60"+
		"\5\60\u0465\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u046f\n"+
		"\61\3\61\5\61\u0472\n\61\3\61\3\61\3\61\3\61\5\61\u0478\n\61\3\61\5\61"+
		"\u047b\n\61\3\62\3\62\3\62\3\62\5\62\u0481\n\62\3\62\3\62\3\62\5\62\u0486"+
		"\n\62\3\62\5\62\u0489\n\62\3\63\3\63\5\63\u048d\n\63\3\63\3\63\3\63\3"+
		"\63\5\63\u0493\n\63\3\63\5\63\u0496\n\63\3\63\3\63\3\63\3\63\5\63\u049c"+
		"\n\63\3\63\3\63\3\63\3\63\5\63\u04a2\n\63\3\63\3\63\5\63\u04a6\n\63\3"+
		"\63\5\63\u04a9\n\63\3\63\3\63\5\63\u04ad\n\63\3\63\5\63\u04b0\n\63\3\63"+
		"\5\63\u04b3\n\63\3\63\3\63\3\63\3\63\5\63\u04b9\n\63\5\63\u04bb\n\63\3"+
		"\64\3\64\7\64\u04bf\n\64\f\64\16\64\u04c2\13\64\3\64\3\64\3\64\3\64\5"+
		"\64\u04c8\n\64\3\64\3\64\3\64\5\64\u04cd\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u04d5\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u04dc\n\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u04e5\n\65\5\65\u04e7\n\65\3\66\3\66"+
		"\5\66\u04eb\n\66\3\66\5\66\u04ee\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u04f5"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u04fe\n\66\5\66\u0500\n"+
		"\66\3\66\3\66\3\66\3\66\5\66\u0506\n\66\3\66\5\66\u0509\n\66\3\67\3\67"+
		"\38\38\38\38\78\u0511\n8\f8\168\u0514\138\58\u0516\n8\38\38\39\39\59\u051c"+
		"\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u052c\n9\3:\3:\3:\3:"+
		"\3:\3:\5:\u0534\n:\3:\3:\5:\u0538\n:\3:\3:\3:\7:\u053d\n:\f:\16:\u0540"+
		"\13:\3:\3:\3:\5:\u0545\n:\3:\3:\3:\3:\5:\u054b\n:\3;\3;\3;\3;\3;\5;\u0552"+
		"\n;\3<\3<\5<\u0556\n<\3<\3<\3<\3<\3<\3<\5<\u055e\n<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\5<\u0568\n<\3<\3<\3<\3<\5<\u056e\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\5<\u057d\n<\3=\3=\3=\3=\5=\u0583\n=\3=\3=\3=\3=\3=\5=\u058a"+
		"\n=\7=\u058c\n=\f=\16=\u058f\13=\3>\3>\3>\5>\u0594\n>\3>\7>\u0597\n>\f"+
		">\16>\u059a\13>\3>\3>\3>\3>\3>\7>\u05a1\n>\f>\16>\u05a4\13>\5>\u05a6\n"+
		">\3?\3?\3@\3@\3@\3@\3@\7@\u05af\n@\f@\16@\u05b2\13@\3@\3@\3A\3A\5A\u05b8"+
		"\nA\3A\3A\5A\u05bc\nA\3B\3B\3B\3C\3C\3C\3C\5C\u05c5\nC\3D\3D\3D\3D\5D"+
		"\u05cb\nD\3D\5D\u05ce\nD\3D\3D\5D\u05d2\nD\3D\3D\3D\7D\u05d7\nD\fD\16"+
		"D\u05da\13D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u05ea\nE\fE\16"+
		"E\u05ed\13E\3E\3E\3E\5E\u05f2\nE\3E\3E\3E\3E\3E\3E\3E\3E\5E\u05fc\nE\3"+
		"F\3F\5F\u0600\nF\3F\3F\3F\5F\u0605\nF\3F\5F\u0608\nF\3G\3G\5G\u060c\n"+
		"G\3G\3G\5G\u0610\nG\3G\3G\5G\u0614\nG\3H\3H\5H\u0618\nH\3H\3H\3H\3I\3"+
		"I\5I\u061f\nI\3I\3I\3I\5I\u0624\nI\3I\5I\u0627\nI\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\7I\u0634\nI\fI\16I\u0637\13I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\5I\u0643\nI\3J\3J\5J\u0647\nJ\3J\3J\3J\3J\3K\3K\3K\3K\5K\u0651\nK"+
		"\3K\3K\5K\u0655\nK\3K\3K\3K\5K\u065a\nK\3K\3K\3K\5K\u065f\nK\3L\3L\3L"+
		"\3L\5L\u0665\nL\3L\3L\5L\u0669\nL\3M\3M\3M\3M\5M\u066f\nM\3M\3M\5M\u0673"+
		"\nM\3N\3N\5N\u0677\nN\3N\3N\3N\5N\u067c\nN\3N\3N\5N\u0680\nN\3O\3O\3O"+
		"\5O\u0685\nO\3O\3O\5O\u0689\nO\3O\3O\5O\u068d\nO\3P\3P\3P\3P\5P\u0693"+
		"\nP\3P\3P\5P\u0697\nP\3P\3P\5P\u069b\nP\3Q\3Q\5Q\u069f\nQ\3Q\3Q\3Q\5Q"+
		"\u06a4\nQ\3Q\5Q\u06a7\nQ\3R\5R\u06aa\nR\3R\3R\3R\5R\u06af\nR\3R\7R\u06b2"+
		"\nR\fR\16R\u06b5\13R\3S\3S\3T\3T\5T\u06bb\nT\3U\3U\3V\3V\5V\u06c1\nV\3"+
		"W\3W\3W\3W\5W\u06c7\nW\3X\3X\3X\3X\5X\u06cd\nX\3Y\3Y\5Y\u06d1\nY\3Y\3"+
		"Y\5Y\u06d5\nY\3Y\5Y\u06d8\nY\3Z\3Z\3Z\5Z\u06dd\nZ\3[\3[\3[\3[\3\\\3\\"+
		"\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3`\3`\3`\5`\u06f1\n`\3`\7`\u06f4\n`\f`\16"+
		"`\u06f7\13`\3a\3a\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0707\nc\3d\5"+
		"d\u070a\nd\3d\3d\3d\5d\u070f\nd\3d\3d\5d\u0713\nd\3e\3e\3f\3f\5f\u0719"+
		"\nf\3f\3f\5f\u071d\nf\3f\3f\3f\5f\u0722\nf\3f\3f\3f\5f\u0727\nf\3f\3f"+
		"\5f\u072b\nf\3f\5f\u072e\nf\3g\3g\3h\3h\3h\3h\3i\3i\3i\5i\u0739\ni\3i"+
		"\3i\3i\5i\u073e\ni\3i\3i\5i\u0742\ni\3i\3i\3i\3i\5i\u0748\ni\3i\3i\3i"+
		"\3i\5i\u074e\ni\3i\3i\3i\5i\u0753\ni\3i\3i\5i\u0757\ni\5i\u0759\ni\3j"+
		"\3j\5j\u075d\nj\3j\3j\5j\u0761\nj\5j\u0763\nj\3k\3k\5k\u0767\nk\3l\3l"+
		"\5l\u076b\nl\3l\3l\5l\u076f\nl\3l\3l\5l\u0773\nl\3l\5l\u0776\nl\3m\3m"+
		"\3m\3m\3m\5m\u077d\nm\5m\u077f\nm\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0789\nn"+
		"\3o\3o\3p\3p\5p\u078f\np\3p\3p\5p\u0793\np\3p\3p\3p\3p\3p\5p\u079a\np"+
		"\3p\3p\3p\5p\u079f\np\3q\3q\5q\u07a3\nq\3q\3q\5q\u07a7\nq\3q\3q\3q\5q"+
		"\u07ac\nq\5q\u07ae\nq\3r\3r\5r\u07b2\nr\3r\3r\3r\5r\u07b7\nr\3r\3r\5r"+
		"\u07bb\nr\5r\u07bd\nr\3s\5s\u07c0\ns\3s\3s\5s\u07c4\ns\3s\5s\u07c7\ns"+
		"\3s\3s\3s\5s\u07cc\ns\5s\u07ce\ns\3s\3s\7s\u07d2\ns\fs\16s\u07d5\13s\3"+
		"s\3s\3s\3s\5s\u07db\ns\3t\3t\3t\3t\5t\u07e1\nt\3t\3t\7t\u07e5\nt\ft\16"+
		"t\u07e8\13t\3u\3u\3u\3u\5u\u07ee\nu\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\5v\u07fc\nv\3v\5v\u07ff\nv\3w\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3{\3"+
		"{\3|\5|\u0810\n|\3|\3|\3}\3}\3~\3~\3~\3~\3~\3~\5~\u081c\n~\3\177\3\177"+
		"\3\177\5\177\u0821\n\177\3\177\3\177\3\177\5\177\u0826\n\177\7\177\u0828"+
		"\n\177\f\177\16\177\u082b\13\177\5\177\u082d\n\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u0836\n\u0081\3\u0081\3\u0081"+
		"\5\u0081\u083a\n\u0081\3\u0081\3\u0081\5\u0081\u083e\n\u0081\3\u0081\3"+
		"\u0081\5\u0081\u0842\n\u0081\3\u0081\5\u0081\u0845\n\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u084f\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\6\u0087\u0869\n\u0087"+
		"\r\u0087\16\u0087\u086a\3\u0087\3\u0087\5\u0087\u086f\n\u0087\3\u0088"+
		"\3\u0088\5\u0088\u0873\n\u0088\3\u0089\3\u0089\3\u0089\6\u0089\u0878\n"+
		"\u0089\r\u0089\16\u0089\u0879\3\u0089\5\u0089\u087d\n\u0089\3\u0089\3"+
		"\u0089\3\u008a\3\u008a\6\u008a\u0883\n\u008a\r\u008a\16\u008a\u0884\3"+
		"\u008a\5\u008a\u0888\n\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3"+
		"\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\5\u008e\u089b\n\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u08ad\n\u0092\3\u0092\5\u0092"+
		"\u08b0\n\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u08b5\n\u0093\3\u0094\3"+
		"\u0094\3\u0094\5\u0094\u08ba\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3"+
		"\u0094\3\u0094\7\u0094\u08c2\n\u0094\f\u0094\16\u0094\u08c5\13\u0094\3"+
		"\u0095\3\u0095\3\u0095\7\u0095\u08ca\n\u0095\f\u0095\16\u0095\u08cd\13"+
		"\u0095\3\u0096\3\u0096\3\u0096\7\u0096\u08d2\n\u0096\f\u0096\16\u0096"+
		"\u08d5\13\u0096\3\u0097\3\u0097\3\u0097\7\u0097\u08da\n\u0097\f\u0097"+
		"\16\u0097\u08dd\13\u0097\3\u0098\5\u0098\u08e0\n\u0098\3\u0098\3\u0098"+
		"\3\u0098\5\u0098\u08e5\n\u0098\3\u0098\3\u0098\7\u0098\u08e9\n\u0098\f"+
		"\u0098\16\u0098\u08ec\13\u0098\3\u0099\3\u0099\5\u0099\u08f0\n\u0099\3"+
		"\u009a\3\u009a\3\u009b\3\u009b\5\u009b\u08f6\n\u009b\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u0909\n\u009e"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0910\n\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u0917\n\u00a2\f\u00a2\16\u00a2"+
		"\u091a\13\u00a2\3\u00a3\3\u00a3\5\u00a3\u091e\n\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\5\u00a4\u0923\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u092a\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u092e\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\5\u00a7\u0938\n"+
		"\u00a7\3\u00a7\5\u00a7\u093b\n\u00a7\3\u00a7\5\u00a7\u093e\n\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0945\n\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u094e\n\u00aa\f\u00aa"+
		"\16\u00aa\u0951\13\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0956\n\u00ab"+
		"\f\u00ab\16\u00ab\u0959\13\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u095e"+
		"\n\u00ac\3\u00ad\3\u00ad\5\u00ad\u0962\n\u00ad\3\u00ae\3\u00ae\5\u00ae"+
		"\u0966\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0"+
		"\u096e\n\u00b0\3\u00b1\3\u00b1\5\u00b1\u0972\n\u00b1\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u097a\n\u00b3\3\u00b4\3\u00b4\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0983\n\u00b5\f\u00b5\16"+
		"\u00b5\u0986\13\u00b5\5\u00b5\u0988\n\u00b5\3\u00b5\3\u00b5\3\u00b6\3"+
		"\u00b6\5\u00b6\u098e\n\u00b6\3\u00b7\3\u00b7\5\u00b7\u0992\n\u00b7\3\u00b8"+
		"\3\u00b8\5\u00b8\u0996\n\u00b8\3\u00b8\5\u00b8\u0999\n\u00b8\3\u00b8\3"+
		"\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u09a7\n\u00b9\3\u00ba\3\u00ba\5\u00ba\u09ab\n"+
		"\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u09b2\n\u00bb\f"+
		"\u00bb\16\u00bb\u09b5\13\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u09bd\n\u00bc\3\u00bc\5\u00bc\u09c0\n\u00bc\3\u00bc\5"+
		"\u00bc\u09c3\n\u00bc\3\u00bd\5\u00bd\u09c6\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u09cb\n\u00bd\3\u00bd\5\u00bd\u09ce\n\u00bd\3\u00be\3\u00be\6"+
		"\u00be\u09d2\n\u00be\r\u00be\16\u00be\u09d3\3\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u09da\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u09e2\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u09e9\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\5\u00c1\u09f0"+
		"\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\5\u00c2\u09f8"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\5\u00c4\u0a03\n\u00c4\3\u00c5\3\u00c5\5\u00c5\u0a07\n\u00c5\3"+
		"\u00c6\3\u00c6\3\u00c7\3\u00c7\5\u00c7\u0a0d\n\u00c7\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0a17\n\u00c8\5"+
		"\u00c8\u0a19\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3"+
		"\u00ca\5\u00ca\u0a22\n\u00ca\3\u00ca\5\u00ca\u0a25\n\u00ca\3\u00ca\5\u00ca"+
		"\u0a28\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0a2c\n\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\5\u00ca\u0a32\n\u00ca\5\u00ca\u0a34\n\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u0a3d\n\u00cd\f\u00cd"+
		"\16\u00cd\u0a40\13\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0a4b\n\u00cf\5\u00cf\u0a4d\n\u00cf\3"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u0a5b\n\u00d3\f\u00d3\16\u00d3\u0a5e"+
		"\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a64\n\u00d4\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a6b\n\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d6\7\u00d6\u0a70\n\u00d6\f\u00d6\16\u00d6\u0a73\13\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db"+
		"\7\u00db\u0a88\n\u00db\f\u00db\16\u00db\u0a8b\13\u00db\3\u00dc\3\u00dc"+
		"\5\u00dc\u0a8f\n\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a94\n\u00dc\f"+
		"\u00dc\16\u00dc\u0a97\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u0a9e\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u0aa6\n\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00df\3\u00df"+
		"\5\u00df\u0aae\n\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0ab4\n"+
		"\u00e0\3\u00e0\3\u00e0\5\u00e0\u0ab8\n\u00e0\3\u00e0\3\u00e0\5\u00e0\u0abc"+
		"\n\u00e0\3\u00e0\7\u00e0\u0abf\n\u00e0\f\u00e0\16\u00e0\u0ac2\13\u00e0"+
		"\3\u00e1\3\u00e1\5\u00e1\u0ac6\n\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\5\u00e2\u0acc\n\u00e2\3\u00e2\3\u00e2\5\u00e2\u0ad0\n\u00e2\3\u00e2\3"+
		"\u00e2\5\u00e2\u0ad4\n\u00e2\3\u00e2\7\u00e2\u0ad7\n\u00e2\f\u00e2\16"+
		"\u00e2\u0ada\13\u00e2\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0adf\n\u00e3\3"+
		"\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0ae6\n\u00e4\3\u00e5\3"+
		"\u00e5\5\u00e5\u0aea\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\5"+
		"\u00e7\u0af1\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0af7\n\u00e8"+
		"\3\u00e8\3\u00e8\5\u00e8\u0afb\n\u00e8\5\u00e8\u0afd\n\u00e8\3\u00e9\3"+
		"\u00e9\3\u00e9\7\u00e9\u0b02\n\u00e9\f\u00e9\16\u00e9\u0b05\13\u00e9\3"+
		"\u00ea\3\u00ea\5\u00ea\u0b09\n\u00ea\3\u00ea\3\u00ea\5\u00ea\u0b0d\n\u00ea"+
		"\3\u00ea\7\u00ea\u0b10\n\u00ea\f\u00ea\16\u00ea\u0b13\13\u00ea\3\u00ea"+
		"\5\u00ea\u0b16\n\u00ea\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0b1b\n\u00eb\f"+
		"\u00eb\16\u00eb\u0b1e\13\u00eb\3\u00ec\3\u00ec\5\u00ec\u0b22\n\u00ec\3"+
		"\u00ed\3\u00ed\5\u00ed\u0b26\n\u00ed\3\u00ee\3\u00ee\5\u00ee\u0b2a\n\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0b31\n\u00ef\3\u00ef"+
		"\5\u00ef\u0b34\n\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b3a\n"+
		"\u00f0\5\u00f0\u0b3c\n\u00f0\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0b41\n\u00f0"+
		"\f\u00f0\16\u00f0\u0b44\13\u00f0\3\u00f1\5\u00f1\u0b47\n\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\5\u00f1\u0b4c\n\u00f1\3\u00f2\3\u00f2\3\u00f2\7\u00f2"+
		"\u0b51\n\u00f2\f\u00f2\16\u00f2\u0b54\13\u00f2\3\u00f3\3\u00f3\3\u00f4"+
		"\3\u00f4\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0b69"+
		"\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9\5\u00f9\u0b71"+
		"\n\u00f9\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc"+
		"\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe"+
		"\3\u00fe\3\u00ff\5\u00ff\u0b86\n\u00ff\3\u00ff\3\u00ff\5\u00ff\u0b8a\n"+
		"\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u0100\3\u0100\5\u0100\u0b92\n"+
		"\u0100\3\u0100\5\u0100\u0b95\n\u0100\3\u0100\3\u0100\3\u0100\3\u0101\3"+
		"\u0101\3\u0101\5\u0101\u0b9d\n\u0101\3\u0102\3\u0102\3\u0102\5\u0102\u0ba2"+
		"\n\u0102\3\u0102\3\u0102\3\u0102\5\u0102\u0ba7\n\u0102\7\u0102\u0ba9\n"+
		"\u0102\f\u0102\16\u0102\u0bac\13\u0102\3\u0102\3\u0102\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\3\u0103\5\u0103\u0bb5\n\u0103\3\u0104\5\u0104\u0bb8\n"+
		"\u0104\3\u0104\3\u0104\5\u0104\u0bbc\n\u0104\3\u0105\3\u0105\3\u0105\5"+
		"\u0105\u0bc1\n\u0105\3\u0106\3\u0106\3\u0107\3\u0107\3\u0107\5\u0107\u0bc8"+
		"\n\u0107\3\u0107\3\u0107\3\u0108\3\u0108\3\u0108\5\u0108\u0bcf\n\u0108"+
		"\3\u0108\3\u0108\3\u0108\3\u0109\3\u0109\5\u0109\u0bd6\n\u0109\3\u010a"+
		"\3\u010a\3\u010b\3\u010b\3\u010c\5\u010c\u0bdd\n\u010c\3\u010c\3\u010c"+
		"\3\u010c\3\u010d\3\u010d\3\u010d\3\u010e\3\u010e\3\u010e\5\u010e\u0be8"+
		"\n\u010e\3\u010e\3\u010e\3\u010e\3\u010e\3\u010f\3\u010f\5\u010f\u0bf0"+
		"\n\u010f\3\u0110\3\u0110\3\u0111\3\u0111\3\u0112\3\u0112\3\u0112\5\u0112"+
		"\u0bf9\n\u0112\3\u0112\3\u0112\3\u0112\3\u0113\3\u0113\3\u0113\3\u0113"+
		"\3\u0113\3\u0113\3\u0113\3\u0113\5\u0113\u0c06\n\u0113\3\u0113\3\u0113"+
		"\5\u0113\u0c0a\n\u0113\3\u0114\3\u0114\3\u0114\5\u0114\u0c0f\n\u0114\3"+
		"\u0114\3\u0114\3\u0115\3\u0115\3\u0116\3\u0116\5\u0116\u0c17\n\u0116\3"+
		"\u0117\3\u0117\3\u0117\7\u0117\u0c1c\n\u0117\f\u0117\16\u0117\u0c1f\13"+
		"\u0117\3\u0118\5\u0118\u0c22\n\u0118\3\u0118\3\u0118\3\u0118\3\u0118\3"+
		"\u0118\5\u0118\u0c29\n\u0118\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3"+
		"\u0119\3\u0119\3\u011a\5\u011a\u0c33\n\u011a\3\u011a\3\u011a\5\u011a\u0c37"+
		"\n\u011a\3\u011a\5\u011a\u0c3a\n\u011a\3\u011a\3\u011a\3\u011b\5\u011b"+
		"\u0c3f\n\u011b\3\u011b\5\u011b\u0c42\n\u011b\3\u011b\3\u011b\3\u011b\5"+
		"\u011b\u0c47\n\u011b\3\u011c\3\u011c\3\u011c\3\u011c\5\u011c\u0c4d\n\u011c"+
		"\3\u011c\3\u011c\5\u011c\u0c51\n\u011c\3\u011d\3\u011d\3\u011d\3\u011e"+
		"\3\u011e\3\u011e\3\u011e\3\u011f\3\u011f\3\u011f\7\u011f\u0c5d\n\u011f"+
		"\f\u011f\16\u011f\u0c60\13\u011f\3\u0120\3\u0120\5\u0120\u0c64\n\u0120"+
		"\3\u0120\5\u0120\u0c67\n\u0120\3\u0121\3\u0121\3\u0121\5\u0121\u0c6c\n"+
		"\u0121\3\u0122\3\u0122\3\u0122\5\u0122\u0c71\n\u0122\3\u0123\3\u0123\3"+
		"\u0123\3\u0123\5\u0123\u0c77\n\u0123\3\u0123\2\2\u0124\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2"+
		"\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa"+
		"\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212"+
		"\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a"+
		"\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a\u023c\u023e\u0240\u0242"+
		"\u0244\2=\6\2\n\n\16\16\26\26NN\4\2MM\u0103\u0103\7\2\4\4\u0082\u0082"+
		"\u009e\u009e\u00b2\u00b2\u00c6\u00c6\4\2VV\u0088\u0088\4\2OO\u00cd\u00cd"+
		"\4\2\35\35##\4\2RR\u00ff\u00ff\5\2RRgg\u00ff\u00ff\7\2\32\32\60\60\62"+
		"\62CC\u0159\u0159\4\2ZZ\u00d2\u00d2\5\2==GG\u00f8\u00f8\7\2\23\23==DD"+
		"GG\u0098\u0098\3\2\u00ea\u00eb\6\2\u008a\u008a\u00a2\u00a2\u00ea\u00eb"+
		"\u00f6\u00f7\5\2\34\34\u00bd\u00bd\u00e0\u00e0\4\2\23\23GG\4\2\22\22/"+
		"/\4\2||\u0090\u0090\5\2eeqq\u0093\u0093\4\2@@\u0092\u0092\5\2~\177\u00a4"+
		"\u00a4\u00c0\u00c0\4\2ww\u00dd\u00dd\4\2ff\u00d1\u00d1\3\2\u015e\u015f"+
		"+\2RRUUWXZ\\`bhouxzz\177\u0083\u0087\u0087\u0089\u0089\u008b\u008c\u008e"+
		"\u008e\u0092\u0092\u0098\u0099\u009b\u009e\u00a0\u00a1\u00a3\u00a3\u00a7"+
		"\u00ac\u00ae\u00af\u00b1\u00b1\u00b6\u00b6\u00ba\u00bb\u00be\u00bf\u00c2"+
		"\u00c3\u00c7\u00c9\u00cc\u00cc\u00d0\u00d0\u00d2\u00d3\u00d5\u00d8\u00da"+
		"\u00dd\u00df\u00df\u00e2\u00e3\u00e5\u00e5\u00e7\u00e9\u00ec\u00ef\u00f1"+
		"\u00f5\u00f8\u00f8\u00fc\u0101\u0104\u0124\u0128\u012b\5\2\32\32CC\u00f5"+
		"\u00f5\3\2\u012c\u0130\3\2\u0125\u0126\3\2\u010a\u0112\4\2\u0113\u0115"+
		"\u0117\u0117\3\2\u0106\u0107\4\2\u011e\u011e\u0120\u0123\3\2\u0159\u015a"+
		"\17\2\7\7>>UU``hhzz\u0089\u0089\u0099\u0099\u00a7\u00a7\u00ac\u00ac\u00e2"+
		"\u00e3\u00e7\u00e7\u00fc\u00fd\4\2\22\22\u0143\u0143\3\2\u0141\u0142\3"+
		"\2\u0143\u0146\3\2\u00ed\u00ef\5\2\13\13))BB\4\2\u00ea\u00eb\u00f6\u00f6"+
		"\5\2\34\34**99\4\2\30\30EE\4\2\4\4\25\25\6\2\u0141\u0144\u014b\u014b\u0156"+
		"\u0158\u015d\u015d\3\2\u014c\u0155\4\2\u0133\u0133\u0138\u013c\4\2\b\b"+
		"??\6\2\"\"++\u00cc\u00cc\u00d5\u00d5\4\2\u014b\u014b\u0156\u0158\4\2\7"+
		"\7>>\6\2mm\u008e\u008e\u00ae\u00af\u0104\u0104\n\2[[oouvxx\u009b\u009c"+
		"\u00a9\u00ab\u00c7\u00c7\u0100\u0100\4\2\u0082\u0082\u00b2\u00b2\4\2;"+
		";\u00d7\u00d7\6\2\4\4\7\7**99\4\2\u00c8\u00c8\u00d7\u00d7\4\2\u0083\u0083"+
		"\u00c2\u00c2\4\2\t\t\24\24\6\2\u0139\u0139\u013b\u013b\u0141\u0145\u015d"+
		"\u015d\u0d9b\2\u024b\3\2\2\2\4\u025b\3\2\2\2\6\u025e\3\2\2\2\b\u0267\3"+
		"\2\2\2\n\u026a\3\2\2\2\f\u027b\3\2\2\2\16\u0282\3\2\2\2\20\u0297\3\2\2"+
		"\2\22\u029d\3\2\2\2\24\u029f\3\2\2\2\26\u02b5\3\2\2\2\30\u02bb\3\2\2\2"+
		"\32\u02c1\3\2\2\2\34\u02d5\3\2\2\2\36\u02d7\3\2\2\2 \u02f1\3\2\2\2\"\u02f3"+
		"\3\2\2\2$\u02f7\3\2\2\2&\u02fd\3\2\2\2(\u0307\3\2\2\2*\u0322\3\2\2\2,"+
		"\u0326\3\2\2\2.\u0330\3\2\2\2\60\u033e\3\2\2\2\62\u0350\3\2\2\2\64\u035e"+
		"\3\2\2\2\66\u0372\3\2\2\28\u0374\3\2\2\2:\u0379\3\2\2\2<\u0382\3\2\2\2"+
		">\u0394\3\2\2\2@\u03a0\3\2\2\2B\u03a3\3\2\2\2D\u03c6\3\2\2\2F\u03d7\3"+
		"\2\2\2H\u03db\3\2\2\2J\u03dd\3\2\2\2L\u03e5\3\2\2\2N\u03ec\3\2\2\2P\u03ee"+
		"\3\2\2\2R\u03f6\3\2\2\2T\u03ff\3\2\2\2V\u041f\3\2\2\2X\u0421\3\2\2\2Z"+
		"\u043a\3\2\2\2\\\u0442\3\2\2\2^\u044c\3\2\2\2`\u0466\3\2\2\2b\u047c\3"+
		"\2\2\2d\u048a\3\2\2\2f\u04bc\3\2\2\2h\u04ce\3\2\2\2j\u04ed\3\2\2\2l\u050a"+
		"\3\2\2\2n\u050c\3\2\2\2p\u051b\3\2\2\2r\u052d\3\2\2\2t\u0551\3\2\2\2v"+
		"\u0555\3\2\2\2x\u057e\3\2\2\2z\u05a5\3\2\2\2|\u05a7\3\2\2\2~\u05a9\3\2"+
		"\2\2\u0080\u05b7\3\2\2\2\u0082\u05bd\3\2\2\2\u0084\u05c0\3\2\2\2\u0086"+
		"\u05c6\3\2\2\2\u0088\u05fb\3\2\2\2\u008a\u05fd\3\2\2\2\u008c\u0609\3\2"+
		"\2\2\u008e\u0615\3\2\2\2\u0090\u0642\3\2\2\2\u0092\u0644\3\2\2\2\u0094"+
		"\u064c\3\2\2\2\u0096\u0660\3\2\2\2\u0098\u066a\3\2\2\2\u009a\u0674\3\2"+
		"\2\2\u009c\u0681\3\2\2\2\u009e\u069a\3\2\2\2\u00a0\u069c\3\2\2\2\u00a2"+
		"\u06a9\3\2\2\2\u00a4\u06b6\3\2\2\2\u00a6\u06ba\3\2\2\2\u00a8\u06bc\3\2"+
		"\2\2\u00aa\u06c0\3\2\2\2\u00ac\u06c6\3\2\2\2\u00ae\u06cc\3\2\2\2\u00b0"+
		"\u06ce\3\2\2\2\u00b2\u06d9\3\2\2\2\u00b4\u06de\3\2\2\2\u00b6\u06e2\3\2"+
		"\2\2\u00b8\u06e5\3\2\2\2\u00ba\u06e8\3\2\2\2\u00bc\u06eb\3\2\2\2\u00be"+
		"\u06f0\3\2\2\2\u00c0\u06f8\3\2\2\2\u00c2\u06fa\3\2\2\2\u00c4\u0706\3\2"+
		"\2\2\u00c6\u0712\3\2\2\2\u00c8\u0714\3\2\2\2\u00ca\u072d\3\2\2\2\u00cc"+
		"\u072f\3\2\2\2\u00ce\u0731\3\2\2\2\u00d0\u0758\3\2\2\2\u00d2\u0762\3\2"+
		"\2\2\u00d4\u0766\3\2\2\2\u00d6\u0775\3\2\2\2\u00d8\u077e\3\2\2\2\u00da"+
		"\u0788\3\2\2\2\u00dc\u078a\3\2\2\2\u00de\u079e\3\2\2\2\u00e0\u07ad\3\2"+
		"\2\2\u00e2\u07bc\3\2\2\2\u00e4\u07bf\3\2\2\2\u00e6\u07e6\3\2\2\2\u00e8"+
		"\u07e9\3\2\2\2\u00ea\u07fb\3\2\2\2\u00ec\u0800\3\2\2\2\u00ee\u0804\3\2"+
		"\2\2\u00f0\u0807\3\2\2\2\u00f2\u080a\3\2\2\2\u00f4\u080c\3\2\2\2\u00f6"+
		"\u080f\3\2\2\2\u00f8\u0813\3\2\2\2\u00fa\u0815\3\2\2\2\u00fc\u081d\3\2"+
		"\2\2\u00fe\u0830\3\2\2\2\u0100\u0832\3\2\2\2\u0102\u0846\3\2\2\2\u0104"+
		"\u084e\3\2\2\2\u0106\u0850\3\2\2\2\u0108\u0855\3\2\2\2\u010a\u085a\3\2"+
		"\2\2\u010c\u086e\3\2\2\2\u010e\u0872\3\2\2\2\u0110\u0874\3\2\2\2\u0112"+
		"\u0880\3\2\2\2\u0114\u088b\3\2\2\2\u0116\u0890\3\2\2\2\u0118\u0895\3\2"+
		"\2\2\u011a\u089a\3\2\2\2\u011c\u089c\3\2\2\2\u011e\u08a3\3\2\2\2\u0120"+
		"\u08a5\3\2\2\2\u0122\u08ac\3\2\2\2\u0124\u08b4\3\2\2\2\u0126\u08b6\3\2"+
		"\2\2\u0128\u08c6\3\2\2\2\u012a\u08ce\3\2\2\2\u012c\u08d6\3\2\2\2\u012e"+
		"\u08df\3\2\2\2\u0130\u08ef\3\2\2\2\u0132\u08f1\3\2\2\2\u0134\u08f5\3\2"+
		"\2\2\u0136\u08f7\3\2\2\2\u0138\u08fe\3\2\2\2\u013a\u0908\3\2\2\2\u013c"+
		"\u090a\3\2\2\2\u013e\u090f\3\2\2\2\u0140\u0911\3\2\2\2\u0142\u0913\3\2"+
		"\2\2\u0144\u091d\3\2\2\2\u0146\u0922\3\2\2\2\u0148\u0924\3\2\2\2\u014a"+
		"\u0931\3\2\2\2\u014c\u0944\3\2\2\2\u014e\u0946\3\2\2\2\u0150\u0948\3\2"+
		"\2\2\u0152\u094a\3\2\2\2\u0154\u0952\3\2\2\2\u0156\u095d\3\2\2\2\u0158"+
		"\u095f\3\2\2\2\u015a\u0963\3\2\2\2\u015c\u0969\3\2\2\2\u015e\u096d\3\2"+
		"\2\2\u0160\u0971\3\2\2\2\u0162\u0973\3\2\2\2\u0164\u0979\3\2\2\2\u0166"+
		"\u097b\3\2\2\2\u0168\u097d\3\2\2\2\u016a\u098d\3\2\2\2\u016c\u0991\3\2"+
		"\2\2\u016e\u0993\3\2\2\2\u0170\u09a6\3\2\2\2\u0172\u09a8\3\2\2\2\u0174"+
		"\u09ae\3\2\2\2\u0176\u09c2\3\2\2\2\u0178\u09c5\3\2\2\2\u017a\u09cf\3\2"+
		"\2\2\u017c\u09e8\3\2\2\2\u017e\u09ea\3\2\2\2\u0180\u09ef\3\2\2\2\u0182"+
		"\u09f5\3\2\2\2\u0184\u09fc\3\2\2\2\u0186\u0a02\3\2\2\2\u0188\u0a04\3\2"+
		"\2\2\u018a\u0a08\3\2\2\2\u018c\u0a0c\3\2\2\2\u018e\u0a18\3\2\2\2\u0190"+
		"\u0a1a\3\2\2\2\u0192\u0a33\3\2\2\2\u0194\u0a35\3\2\2\2\u0196\u0a37\3\2"+
		"\2\2\u0198\u0a39\3\2\2\2\u019a\u0a41\3\2\2\2\u019c\u0a4c\3\2\2\2\u019e"+
		"\u0a4e\3\2\2\2\u01a0\u0a51\3\2\2\2\u01a2\u0a53\3\2\2\2\u01a4\u0a57\3\2"+
		"\2\2\u01a6\u0a63\3\2\2\2\u01a8\u0a6a\3\2\2\2\u01aa\u0a6c\3\2\2\2\u01ac"+
		"\u0a74\3\2\2\2\u01ae\u0a79\3\2\2\2\u01b0\u0a7e\3\2\2\2\u01b2\u0a81\3\2"+
		"\2\2\u01b4\u0a84\3\2\2\2\u01b6\u0a8c\3\2\2\2\u01b8\u0a98\3\2\2\2\u01ba"+
		"\u0aa9\3\2\2\2\u01bc\u0aad\3\2\2\2\u01be\u0ab7\3\2\2\2\u01c0\u0ac5\3\2"+
		"\2\2\u01c2\u0acf\3\2\2\2\u01c4\u0ade\3\2\2\2\u01c6\u0ae5\3\2\2\2\u01c8"+
		"\u0ae7\3\2\2\2\u01ca\u0aeb\3\2\2\2\u01cc\u0af0\3\2\2\2\u01ce\u0af2\3\2"+
		"\2\2\u01d0\u0afe\3\2\2\2\u01d2\u0b15\3\2\2\2\u01d4\u0b17\3\2\2\2\u01d6"+
		"\u0b21\3\2\2\2\u01d8\u0b23\3\2\2\2\u01da\u0b29\3\2\2\2\u01dc\u0b33\3\2"+
		"\2\2\u01de\u0b35\3\2\2\2\u01e0\u0b46\3\2\2\2\u01e2\u0b4d\3\2\2\2\u01e4"+
		"\u0b55\3\2\2\2\u01e6\u0b57\3\2\2\2\u01e8\u0b59\3\2\2\2\u01ea\u0b5b\3\2"+
		"\2\2\u01ec\u0b68\3\2\2\2\u01ee\u0b6a\3\2\2\2\u01f0\u0b70\3\2\2\2\u01f2"+
		"\u0b72\3\2\2\2\u01f4\u0b74\3\2\2\2\u01f6\u0b78\3\2\2\2\u01f8\u0b7a\3\2"+
		"\2\2\u01fa\u0b81\3\2\2\2\u01fc\u0b85\3\2\2\2\u01fe\u0b91\3\2\2\2\u0200"+
		"\u0b9c\3\2\2\2\u0202\u0b9e\3\2\2\2\u0204\u0baf\3\2\2\2\u0206\u0bbb\3\2"+
		"\2\2\u0208\u0bc0\3\2\2\2\u020a\u0bc2\3\2\2\2\u020c\u0bc4\3\2\2\2\u020e"+
		"\u0bcb\3\2\2\2\u0210\u0bd5\3\2\2\2\u0212\u0bd7\3\2\2\2\u0214\u0bd9\3\2"+
		"\2\2\u0216\u0bdc\3\2\2\2\u0218\u0be1\3\2\2\2\u021a\u0be4\3\2\2\2\u021c"+
		"\u0bef\3\2\2\2\u021e\u0bf1\3\2\2\2\u0220\u0bf3\3\2\2\2\u0222\u0bf5\3\2"+
		"\2\2\u0224\u0bfd\3\2\2\2\u0226\u0c0b\3\2\2\2\u0228\u0c12\3\2\2\2\u022a"+
		"\u0c16\3\2\2\2\u022c\u0c18\3\2\2\2\u022e\u0c28\3\2\2\2\u0230\u0c2a\3\2"+
		"\2\2\u0232\u0c32\3\2\2\2\u0234\u0c3e\3\2\2\2\u0236\u0c50\3\2\2\2\u0238"+
		"\u0c52\3\2\2\2\u023a\u0c55\3\2\2\2\u023c\u0c59\3\2\2\2\u023e\u0c61\3\2"+
		"\2\2\u0240\u0c6b\3\2\2\2\u0242\u0c6d\3\2\2\2\u0244\u0c76\3\2\2\2\u0246"+
		"\u0247\5\4\3\2\u0247\u0248\7\u0135\2\2\u0248\u024a\3\2\2\2\u0249\u0246"+
		"\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\5\4\3\2\u024f\u0251\7\u0135"+
		"\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\7\2\2\3\u0253\3\3\2\2\2\u0254\u025c\5\6\4\2\u0255\u025c\5\n\6\2"+
		"\u0256\u025c\5\f\7\2\u0257\u025c\5\b\5\2\u0258\u025c\5\16\b\2\u0259\u025c"+
		"\5\20\t\2\u025a\u025c\5\22\n\2\u025b\u0254\3\2\2\2\u025b\u0255\3\2\2\2"+
		"\u025b\u0256\3\2\2\2\u025b\u0257\3\2\2\2\u025b\u0258\3\2\2\2\u025b\u0259"+
		"\3\2\2\2\u025b\u025a\3\2\2\2\u025c\5\3\2\2\2\u025d\u025f\5\u01b6\u00dc"+
		"\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u0263"+
		"\5\u01ba\u00de\2\u0261\u0263\5\u0126\u0094\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0261\3\2\2\2\u0263\7\3\2\2\2\u0264\u0268\5X-\2\u0265\u0268\5\u009cO"+
		"\2\u0266\u0268\5\u0084C\2\u0267\u0264\3\2\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0266\3\2\2\2\u0268\t\3\2\2\2\u0269\u026b\5\u01b6\u00dc\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026f\3\2\2\2\u026c\u0270\5<\37\2\u026d"+
		"\u0270\5B\"\2\u026e\u0270\5T+\2\u026f\u026c\3\2\2\2\u026f\u026d\3\2\2"+
		"\2\u026f\u026e\3\2\2\2\u0270\13\3\2\2\2\u0271\u027c\5f\64\2\u0272\u027c"+
		"\5^\60\2\u0273\u027c\5`\61\2\u0274\u027c\5d\63\2\u0275\u027c\5\u0098M"+
		"\2\u0276\u027c\5\u009aN\2\u0277\u027c\5\u009eP\2\u0278\u027c\5\u0086D"+
		"\2\u0279\u027c\5b\62\2\u027a\u027c\5\u00a0Q\2\u027b\u0271\3\2\2\2\u027b"+
		"\u0272\3\2\2\2\u027b\u0273\3\2\2\2\u027b\u0274\3\2\2\2\u027b\u0275\3\2"+
		"\2\2\u027b\u0276\3\2\2\2\u027b\u0277\3\2\2\2\u027b\u0278\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027c\r\3\2\2\2\u027d\u0283\5&\24\2"+
		"\u027e\u0283\5(\25\2\u027f\u0283\5\36\20\2\u0280\u0283\5$\23\2\u0281\u0283"+
		"\58\35\2\u0282\u027d\3\2\2\2\u0282\u027e\3\2\2\2\u0282\u027f\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\17\3\2\2\2\u0284\u0286\t\2\2"+
		"\2\u0285\u0287\7\u00f0\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0298\3\2\2\2\u0288\u0289\7<\2\2\u0289\u0298\5\u00a6T\2\u028a\u0290\7"+
		":\2\2\u028b\u028d\7\u00f2\2\2\u028c\u028e\7<\2\2\u028d\u028c\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\5\u00a6T\2\u0290\u028b"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0298\3\2\2\2\u0292\u0294\7\u00ce\2"+
		"\2\u0293\u0295\7<\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296"+
		"\3\2\2\2\u0296\u0298\5\u00a6T\2\u0297\u0284\3\2\2\2\u0297\u0288\3\2\2"+
		"\2\u0297\u028a\3\2\2\2\u0297\u0292\3\2\2\2\u0298\21\3\2\2\2\u0299\u029e"+
		"\5\24\13\2\u029a\u029e\5\26\f\2\u029b\u029e\5\30\r\2\u029c\u029e\5\32"+
		"\16\2\u029d\u0299\3\2\2\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029c\3\2\2\2\u029e\23\3\2\2\2\u029f\u02a0\7p\2\2\u02a0\u02a2\5\u00a6"+
		"T\2\u02a1\u02a3\7\u0127\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a5\3\2\2\2\u02a4\u02a6\7\u0097\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02ab\3\2\2\2\u02a7\u02a9\7\u00b3\2\2\u02a8\u02a7\3\2\2"+
		"\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\7\u00d9\2\2\u02ab"+
		"\u02a8\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b0\7j"+
		"\2\2\u02ae\u02af\t\3\2\2\u02af\u02b1\7\u008d\2\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\u0084\2\2\u02b3\u02b4"+
		"\5\6\4\2\u02b4\25\3\2\2\2\u02b5\u02b7\7\33\2\2\u02b6\u02b8\5\34\17\2\u02b7"+
		"\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\5\u00a6"+
		"T\2\u02ba\27\3\2\2\2\u02bb\u02bd\7\u00b0\2\2\u02bc\u02be\5\34\17\2\u02bd"+
		"\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\5\u00a6"+
		"T\2\u02c0\31\3\2\2\2\u02c1\u02c4\7^\2\2\u02c2\u02c5\5\u00a6T\2\u02c3\u02c5"+
		"\7\4\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\33\3\2\2\2\u02c6"+
		"\u02d0\t\4\2\2\u02c7\u02ca\t\5\2\2\u02c8\u02cb\5\u00f6|\2\u02c9\u02cb"+
		"\7\4\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02d0\3\2\2\2\u02cc\u02cd\t\6\2\2\u02cd\u02d0\5\u00f6|\2\u02ce\u02d0"+
		"\5\u00f6|\2\u02cf\u02c6\3\2\2\2\u02cf\u02c7\3\2\2\2\u02cf\u02cc\3\2\2"+
		"\2\u02cf\u02ce\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02d3\t\7\2\2\u02d2\u02d1"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d6\t\7\2\2\u02d5"+
		"\u02cf\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\35\3\2\2\2\u02d7\u02d9\7\31\2"+
		"\2\u02d8\u02da\5 \21\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02de"+
		"\3\2\2\2\u02db\u02df\5\6\4\2\u02dc\u02df\5\n\6\2\u02dd\u02df\5\f\7\2\u02de"+
		"\u02db\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\37\3\2\2"+
		"\2\u02e0\u02e2\t\b\2\2\u02e1\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e1"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02f2\3\2\2\2\u02e5\u02ee\7\u013d\2"+
		"\2\u02e6\u02eb\5\"\22\2\u02e7\u02e8\7\u0136\2\2\u02e8\u02ea\5\"\22\2\u02e9"+
		"\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02e6\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\7\u013e\2\2\u02f1\u02e1"+
		"\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f2!\3\2\2\2\u02f3\u02f5\t\t\2\2\u02f4"+
		"\u02f6\t\n\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6#\3\2\2\2"+
		"\u02f7\u02f9\7R\2\2\u02f8\u02fa\7\u00ff\2\2\u02f9\u02f8\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\5\u01ce\u00e8\2\u02fc%"+
		"\3\2\2\2\u02fd\u0300\7\36\2\2\u02fe\u0301\5*\26\2\u02ff\u0301\5.\30\2"+
		"\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301\u0305\3\2\2\2\u0302\u0303"+
		"\7M\2\2\u0303\u0304\7\36\2\2\u0304\u0306\7\63\2\2\u0305\u0302\3\2\2\2"+
		"\u0305\u0306\3\2\2\2\u0306\'\3\2\2\2\u0307\u030b\7\u00d4\2\2\u0308\u0309"+
		"\7\36\2\2\u0309\u030a\7\63\2\2\u030a\u030c\7\u0084\2\2\u030b\u0308\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\5,\27\2\u030e"+
		"\u0318\7\62\2\2\u030f\u0311\7@\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0319\5\u01d0\u00e9\2\u0313\u0314\7\4\2"+
		"\2\u0314\u0315\7\u00e8\2\2\u0315\u0316\7#\2\2\u0316\u0317\7\u00d8\2\2"+
		"\u0317\u0319\5\u0194\u00cb\2\u0318\u0310\3\2\2\2\u0318\u0313\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031c\7\35\2\2\u031b\u031d\7\37\2\2\u031c\u031b\3"+
		"\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\5,\27\2\u031f"+
		"\u0321\t\13\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321)\3\2\2\2"+
		"\u0322\u0323\5,\27\2\u0323\u0324\7\u00f2\2\2\u0324\u0325\5,\27\2\u0325"+
		"+\3\2\2\2\u0326\u032b\5\u00a6T\2\u0327\u0328\7\u0136\2\2\u0328\u032a\5"+
		"\u00a6T\2\u0329\u0327\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2"+
		"\u032b\u032c\3\2\2\2\u032c-\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u0331\5"+
		"\64\33\2\u032f\u0331\5\60\31\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2"+
		"\u0331/\3\2\2\2\u0332\u0337\5\62\32\2\u0333\u0334\7\u0136\2\2\u0334\u0336"+
		"\5\62\32\2\u0335\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2"+
		"\u0337\u0338\3\2\2\2\u0338\u033f\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033c"+
		"\7\4\2\2\u033b\u033d\7\67\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2"+
		"\u033d\u033f\3\2\2\2\u033e\u0332\3\2\2\2\u033e\u033a\3\2\2\2\u033f\u0340"+
		"\3\2\2\2\u0340\u0348\7\62\2\2\u0341\u0342\7\u00db\2\2\u0342\u0349\5\u00a6"+
		"T\2\u0343\u0344\7\4\2\2\u0344\u0345\7\u00dc\2\2\u0345\u0346\7#\2\2\u0346"+
		"\u0347\7\u00d8\2\2\u0347\u0349\5\u0194\u00cb\2\u0348\u0341\3\2\2\2\u0348"+
		"\u0343\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\7\u00f2\2\2\u034b\u034d"+
		"\7\37\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2"+
		"\u034e\u034f\5\u019a\u00ce\2\u034f\61\3\2\2\2\u0350\u0351\t\f\2\2\u0351"+
		"\63\3\2\2\2\u0352\u0357\5\66\34\2\u0353\u0354\7\u0136\2\2\u0354\u0356"+
		"\5\66\34\2\u0355\u0353\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2"+
		"\u0357\u0358\3\2\2\2\u0358\u035f\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035c"+
		"\7\4\2\2\u035b\u035d\7\67\2\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2"+
		"\u035d\u035f\3\2\2\2\u035e\u0352\3\2\2\2\u035e\u035a\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u036a\7\62\2\2\u0361\u0363\7@\2\2\u0362\u0361\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u036b\5\u01d0\u00e9\2\u0365\u0366"+
		"\7\4\2\2\u0366\u0367\7\u00e8\2\2\u0367\u0368\7#\2\2\u0368\u0369\7\u00d8"+
		"\2\2\u0369\u036b\5\u0194\u00cb\2\u036a\u0362\3\2\2\2\u036a\u0365\3\2\2"+
		"\2\u036b\u036c\3\2\2\2\u036c\u036e\7\u00f2\2\2\u036d\u036f\7\37\2\2\u036e"+
		"\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\5\u019a"+
		"\u00ce\2\u0371\65\3\2\2\2\u0372\u0373\t\r\2\2\u0373\67\3\2\2\2\u0374\u0375"+
		"\7\u00dd\2\2\u0375\u0376\5:\36\2\u0376\u0377\7\u0133\2\2\u0377\u0378\7"+
		"\u0162\2\2\u03789\3\2\2\2\u0379\u037e\5\u00a6T\2\u037a\u037b\7\u0147\2"+
		"\2\u037b\u037d\5\u00a6T\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e"+
		"\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f;\3\2\2\2\u0380\u037e\3\2\2\2"+
		"\u0381\u0383\5\6\4\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384"+
		"\3\2\2\2\u0384\u0386\7\u0098\2\2\u0385\u0387\7\u00bb\2\2\u0386\u0385\3"+
		"\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\7&\2\2\u0389"+
		"\u038e\5\u01ce\u00e8\2\u038a\u038b\7\u013d\2\2\u038b\u038c\5> \2\u038c"+
		"\u038d\7\u013e\2\2\u038d\u038f\3\2\2\2\u038e\u038a\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\5@!\2\u0391\u0393\5D#\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393=\3\2\2\2\u0394\u0399\5\u01de"+
		"\u00f0\2\u0395\u0396\7\u0136\2\2\u0396\u0398\5\u01de\u00f0\2\u0397\u0395"+
		"\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"?\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039d\7\22\2\2\u039d\u03a1\7I\2\2"+
		"\u039e\u03a1\5\u0126\u0094\2\u039f\u03a1\5\6\4\2\u03a0\u039c\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1A\3\2\2\2\u03a2\u03a4\5\6\4\2"+
		"\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7"+
		"\7G\2\2\u03a6\u03a8\7\u00ba\2\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2"+
		"\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\5\u01ce\u00e8\2\u03aa\u03ac\5\u01da"+
		"\u00ee\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b1\3\2\2\2\u03ad"+
		"\u03af\7\3\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2"+
		"\2\2\u03b0\u03b2\5\u00a6T\2\u03b1\u03ae\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b4\7\u00dd\2\2\u03b4\u03b9\5H%\2\u03b5\u03b6\7"+
		"\u0136\2\2\u03b6\u03b8\5H%\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03be\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bc\u03bd\7\35\2\2\u03bd\u03bf\5\u0174\u00bb\2\u03be\u03bc\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03c2\5V,\2\u03c1\u03c0"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\5D#\2\u03c4"+
		"\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5C\3\2\2\2\u03c6\u03c7\7\u00d3"+
		"\2\2\u03c7\u03cc\5F$\2\u03c8\u03c9\7\u0136\2\2\u03c9\u03cb\5F$\2\u03ca"+
		"\u03c8\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2"+
		"\2\2\u03cdE\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d4\5\u0122\u0092\2\u03d0"+
		"\u03d2\7\3\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2"+
		"\2\2\u03d3\u03d5\5\u00a6T\2\u03d4\u03d1\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d8\3\2\2\2\u03d6\u03d8\5\u01da\u00ee\2\u03d7\u03cf\3\2\2\2\u03d7\u03d6"+
		"\3\2\2\2\u03d8G\3\2\2\2\u03d9\u03dc\5J&\2\u03da\u03dc\5R*\2\u03db\u03d9"+
		"\3\2\2\2\u03db\u03da\3\2\2\2\u03dcI\3\2\2\2\u03dd\u03e2\5L\'\2\u03de\u03df"+
		"\7\u0136\2\2\u03df\u03e1\5L\'\2\u03e0\u03de\3\2\2\2\u03e1\u03e4\3\2\2"+
		"\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3K\3\2\2\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03e6\5\u01de\u00f0\2\u03e6\u03e7\7\u0133\2\2\u03e7\u03e8"+
		"\5N(\2\u03e8M\3\2\2\2\u03e9\u03ed\5\u0122\u0092\2\u03ea\u03ed\5\6\4\2"+
		"\u03eb\u03ed\7\22\2\2\u03ec\u03e9\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03eb"+
		"\3\2\2\2\u03edO\3\2\2\2\u03ee\u03f3\5N(\2\u03ef\u03f0\7\u0136\2\2\u03f0"+
		"\u03f2\5N(\2\u03f1\u03ef\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2"+
		"\2\u03f3\u03f4\3\2\2\2\u03f4Q\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7"+
		"\7\u013d\2\2\u03f7\u03f8\5\u0198\u00cd\2\u03f8\u03f9\7\u013e\2\2\u03f9"+
		"\u03fa\7\u0133\2\2\u03fa\u03fb\7\u013d\2\2\u03fb\u03fc\5P)\2\u03fc\u03fd"+
		"\7\u013e\2\2\u03fdS\3\2\2\2\u03fe\u0400\5\u01b6\u00dc\2\u03ff\u03fe\3"+
		"\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\7\23\2\2\u0402"+
		"\u0404\7\35\2\2\u0403\u0405\7\u00ba\2\2\u0404\u0403\3\2\2\2\u0404\u0405"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\5\u01ce\u00e8\2\u0407\u0409\7"+
		"\u0143\2\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2"+
		"\u040a\u040c\5\u01e0\u00f1\2\u040b\u040a\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u040f\3\2\2\2\u040d\u040e\7H\2\2\u040e\u0410\5\u0174\u00bb\2\u040f\u040d"+
		"\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u0413\5\u0190\u00c9"+
		"\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\3\2\2\2\u0414\u0416"+
		"\5V,\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417"+
		"\u0419\5D#\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419U\3\2\2\2\u041a"+
		"\u0420\5\u019e\u00d0\2\u041b\u041c\7L\2\2\u041c\u041d\7\21\2\2\u041d\u041e"+
		"\7\u00b8\2\2\u041e\u0420\5\u00a6T\2\u041f\u041a\3\2\2\2\u041f\u041b\3"+
		"\2\2\2\u0420W\3\2\2\2\u0421\u0423\7\17\2\2\u0422\u0424\7F\2\2\u0423\u0422"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\7\u0092\2"+
		"\2\u0426\u0428\7c\2\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042a"+
		"\3\2\2\2\u0429\u042b\5\u00a6T\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2"+
		"\2\u042b\u042c\3\2\2\2\u042c\u042d\7\62\2\2\u042d\u042f\5\u01ce\u00e8"+
		"\2\u042e\u0430\5\u0082B\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\7\u013d\2\2\u0432\u0433\5Z.\2\u0433\u0435\7"+
		"\u013e\2\2\u0434\u0436\5~@\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0438\3\2\2\2\u0437\u0439\5\u019e\u00d0\2\u0438\u0437\3\2\2\2\u0438\u0439"+
		"\3\2\2\2\u0439Y\3\2\2\2\u043a\u043f\5\\/\2\u043b\u043c\7\u0136\2\2\u043c"+
		"\u043e\5\\/\2\u043d\u043b\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440[\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0444"+
		"\5\u0122\u0092\2\u0443\u0445\5\u00a6T\2\u0444\u0443\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0448\5\u0240\u0121\2\u0447\u0446\3"+
		"\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u044b\5\u0244\u0123"+
		"\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b]\3\2\2\2\u044c\u044f"+
		"\7\17\2\2\u044d\u044e\7\65\2\2\u044e\u0450\7\u00d0\2\2\u044f\u044d\3\2"+
		"\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u0453\t\16\2\2\u0452"+
		"\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0456\7\u00c9"+
		"\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u0458\7J\2\2\u0458\u045a\5\u01ce\u00e8\2\u0459\u045b\5~@\2\u045a\u0459"+
		"\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\7\3\2\2\u045d"+
		"\u0464\5\6\4\2\u045e\u0460\7M\2\2\u045f\u0461\7\u00a2\2\2\u0460\u045f"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\7]\2\2\u0463"+
		"\u0465\7\63\2\2\u0464\u045e\3\2\2\2\u0464\u0465\3\2\2\2\u0465_\3\2\2\2"+
		"\u0466\u0467\7\17\2\2\u0467\u0468\7\u00a6\2\2\u0468\u0469\7J\2\2\u0469"+
		"\u046e\5\u01ce\u00e8\2\u046a\u046b\7\u013d\2\2\u046b\u046c\5\u0198\u00cd"+
		"\2\u046c\u046d\7\u013e\2\2\u046d\u046f\3\2\2\2\u046e\u046a\3\2\2\2\u046e"+
		"\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u0472\5~@\2\u0471\u0470\3\2\2"+
		"\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\7\3\2\2\u0474\u047a"+
		"\5\6\4\2\u0475\u0477\7M\2\2\u0476\u0478\7\u00b3\2\2\u0477\u0476\3\2\2"+
		"\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\7l\2\2\u047a\u0475"+
		"\3\2\2\2\u047a\u047b\3\2\2\2\u047ba\3\2\2\2\u047c\u047d\7\u00cb\2\2\u047d"+
		"\u047e\7\u00a6\2\2\u047e\u0480\7J\2\2\u047f\u0481\7c\2\2\u0480\u047f\3"+
		"\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0488\5\u01ce\u00e8"+
		"\2\u0483\u0485\7M\2\2\u0484\u0486\7\u00b3\2\2\u0485\u0484\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\7l\2\2\u0488\u0483\3\2"+
		"\2\2\u0488\u0489\3\2\2\2\u0489c\3\2\2\2\u048a\u048c\7\17\2\2\u048b\u048d"+
		"\t\16\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2"+
		"\u048e\u048f\7\u00db\2\2\u048f\u0495\5\u01ce\u00e8\2\u0490\u0492\7\u0091"+
		"\2\2\u0491\u0493\7X\2\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0496\5\u00f6|\2\u0495\u0490\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u049b\3\2\2\2\u0497\u0498\7\u00ad\2\2\u0498\u049c\5\u00f6"+
		"|\2\u0499\u049a\7\u00b3\2\2\u049a\u049c\7\u00ad\2\2\u049b\u0497\3\2\2"+
		"\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a1\3\2\2\2\u049d\u049e"+
		"\7\u00a8\2\2\u049e\u04a2\5\u00f6|\2\u049f\u04a0\7\u00b3\2\2\u04a0\u04a2"+
		"\7\u00a8\2\2\u04a1\u049d\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2"+
		"\2\u04a2\u04a8\3\2\2\2\u04a3\u04a5\7\u00e1\2\2\u04a4\u04a6\7M\2\2\u04a5"+
		"\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\5\u00f6"+
		"|\2\u04a8\u04a3\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa"+
		"\u04ab\7Y\2\2\u04ab\u04ad\5\u00f4{\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3"+
		"\2\2\2\u04ad\u04b2\3\2\2\2\u04ae\u04b0\7\u00b3\2\2\u04af\u04ae\3\2\2\2"+
		"\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\7k\2\2\u04b2\u04af"+
		"\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04ba\3\2\2\2\u04b4\u04b5\7\u00bc\2"+
		"\2\u04b5\u04b8\7X\2\2\u04b6\u04b9\5\u0196\u00cc\2\u04b7\u04b9\7\u00b5"+
		"\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba"+
		"\u04b4\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bbe\3\2\2\2\u04bc\u04c0\7\17\2\2"+
		"\u04bd\u04bf\5l\67\2\u04be\u04bd\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be"+
		"\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3"+
		"\u04c7\7@\2\2\u04c4\u04c5\7!\2\2\u04c5\u04c6\7.\2\2\u04c6\u04c8\7}\2\2"+
		"\u04c7\u04c4\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cc"+
		"\5\u01ce\u00e8\2\u04ca\u04cd\5h\65\2\u04cb\u04cd\5j\66\2\u04cc\u04ca\3"+
		"\2\2\2\u04cc\u04cb\3\2\2\2\u04cdg\3\2\2\2\u04ce\u04d4\5n8\2\u04cf\u04d0"+
		"\7\u0095\2\2\u04d0\u04d1\7\u013d\2\2\u04d1\u04d2\5\u01d0\u00e9\2\u04d2"+
		"\u04d3\7\u013e\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04cf\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u04db\3\2\2\2\u04d6\u04dc\5~@\2\u04d7\u04d8\7M\2\2\u04d8"+
		"\u04dc\7\u00b9\2\2\u04d9\u04da\7\u0103\2\2\u04da\u04dc\7\u00b9\2\2\u04db"+
		"\u04d6\3\2\2\2\u04db\u04d7\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2"+
		"\2\2\u04dc\u04e6\3\2\2\2\u04dd\u04de\7\62\2\2\u04de\u04e4\7\16\2\2\u04df"+
		"\u04e0\7\u00c4\2\2\u04e0\u04e5\7\u00d7\2\2\u04e1\u04e2\7\23\2\2\u04e2"+
		"\u04e5\7\u00d7\2\2\u04e3\u04e5\7w\2\2\u04e4\u04df\3\2\2\2\u04e4\u04e1"+
		"\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04dd\3\2\2\2\u04e6"+
		"\u04e7\3\2\2\2\u04e7i\3\2\2\2\u04e8\u04ea\7\u013d\2\2\u04e9\u04eb\5\u0198"+
		"\u00cd\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04ee\7\u013e\2\2\u04ed\u04e8\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f4"+
		"\3\2\2\2\u04ef\u04f5\5~@\2\u04f0\u04f1\7M\2\2\u04f1\u04f5\7\u00b9\2\2"+
		"\u04f2\u04f3\7\u0103\2\2\u04f3\u04f5\7\u00b9\2\2\u04f4\u04ef\3\2\2\2\u04f4"+
		"\u04f0\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04ff\3\2"+
		"\2\2\u04f6\u04f7\7\62\2\2\u04f7\u04fd\7\16\2\2\u04f8\u04f9\7\u00c4\2\2"+
		"\u04f9\u04fe\7\u00d7\2\2\u04fa\u04fb\7\23\2\2\u04fb\u04fe\7\u00d7\2\2"+
		"\u04fc\u04fe\7w\2\2\u04fd\u04f8\3\2\2\2\u04fd\u04fa\3\2\2\2\u04fd\u04fc"+
		"\3\2\2\2\u04fe\u0500\3\2\2\2\u04ff\u04f6\3\2\2\2\u04ff\u0500\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501\u0502\7\3\2\2\u0502\u0508\5\6\4\2\u0503\u0505\7M"+
		"\2\2\u0504\u0506\7\u00b3\2\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0509\7l\2\2\u0508\u0503\3\2\2\2\u0508\u0509\3\2"+
		"\2\2\u0509k\3\2\2\2\u050a\u050b\t\17\2\2\u050bm\3\2\2\2\u050c\u0515\7"+
		"\u013d\2\2\u050d\u0512\5z>\2\u050e\u050f\7\u0136\2\2\u050f\u0511\5z>\2"+
		"\u0510\u050e\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513"+
		"\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u050d\3\2\2\2\u0515"+
		"\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\7\u013e\2\2\u0518o\3\2"+
		"\2\2\u0519\u051a\7d\2\2\u051a\u051c\5\u00a6T\2\u051b\u0519\3\2\2\2\u051b"+
		"\u051c\3\2\2\2\u051c\u052b\3\2\2\2\u051d\u051e\7.\2\2\u051e\u052c\7/\2"+
		"\2\u051f\u052c\7/\2\2\u0520\u0521\7]\2\2\u0521\u0522\7\u013d\2\2\u0522"+
		"\u0523\5\u01a0\u00d1\2\u0523\u0524\7\u013e\2\2\u0524\u052c\3\2\2\2\u0525"+
		"\u0526\7\22\2\2\u0526\u052c\5\u0122\u0092\2\u0527\u052c\7F\2\2\u0528\u0529"+
		"\7\u00c5\2\2\u0529\u052c\7\u009d\2\2\u052a\u052c\5r:\2\u052b\u051d\3\2"+
		"\2\2\u052b\u051f\3\2\2\2\u052b\u0520\3\2\2\2\u052b\u0525\3\2\2\2\u052b"+
		"\u0527\3\2\2\2\u052b\u0528\3\2\2\2\u052b\u052a\3\2\2\2\u052cq\3\2\2\2"+
		"\u052d\u052e\7\u00ca\2\2\u052e\u0533\5\u01ce\u00e8\2\u052f\u0530\7\u013d"+
		"\2\2\u0530\u0531\5\u0198\u00cd\2\u0531\u0532\7\u013e\2\2\u0532\u0534\3"+
		"\2\2\2\u0533\u052f\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0537\3\2\2\2\u0535"+
		"\u0536\7\u00a5\2\2\u0536\u0538\t\20\2\2\u0537\u0535\3\2\2\2\u0537\u0538"+
		"\3\2\2\2\u0538\u053e\3\2\2\2\u0539\u053a\7\62\2\2\u053a\u053b\t\21\2\2"+
		"\u053b\u053d\5t;\2\u053c\u0539\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0544\3\2\2\2\u0540\u053e\3\2\2\2\u0541"+
		"\u0545\7s\2\2\u0542\u0543\7.\2\2\u0543\u0545\7s\2\2\u0544\u0541\3\2\2"+
		"\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u054a\3\2\2\2\u0546\u0547"+
		"\7\u0096\2\2\u0547\u054b\7r\2\2\u0548\u0549\7\u0096\2\2\u0549\u054b\7"+
		"\u009a\2\2\u054a\u0546\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2"+
		"\u054bs\3\2\2\2\u054c\u054d\7\u00b3\2\2\u054d\u0552\7P\2\2\u054e\u0552"+
		"\5\u00a4S\2\u054f\u0550\7\u00dd\2\2\u0550\u0552\t\22\2\2\u0551\u054c\3"+
		"\2\2\2\u0551\u054e\3\2\2\2\u0551\u054f\3\2\2\2\u0552u\3\2\2\2\u0553\u0554"+
		"\7d\2\2\u0554\u0556\5\u00a6T\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2"+
		"\u0556\u057c\3\2\2\2\u0557\u0558\7]\2\2\u0558\u0559\7\u013d\2\2\u0559"+
		"\u055a\5\u01a0\u00d1\2\u055a\u055d\7\u013e\2\2\u055b\u055c\7\u00b3\2\2"+
		"\u055c\u055e\7\u0094\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u057d\3\2\2\2\u055f\u0560\7F\2\2\u0560\u0561\7\u013d\2\2\u0561\u0562"+
		"\5\u0198\u00cd\2\u0562\u0563\7\u013e\2\2\u0563\u057d\3\2\2\2\u0564\u0567"+
		"\7{\2\2\u0565\u0566\7H\2\2\u0566\u0568\5\u00a6T\2\u0567\u0565\3\2\2\2"+
		"\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\7\u013d\2\2\u056a"+
		"\u056b\5x=\2\u056b\u056d\7\u013e\2\2\u056c\u056e\5\u019e\u00d0\2\u056d"+
		"\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u057d\3\2\2\2\u056f\u0570\7\u00c5"+
		"\2\2\u0570\u0571\7\u009d\2\2\u0571\u0572\7\u013d\2\2\u0572\u0573\5\u0198"+
		"\u00cd\2\u0573\u0574\7\u013e\2\2\u0574\u057d\3\2\2\2\u0575\u0576\7\u0086"+
		"\2\2\u0576\u0577\7\u009d\2\2\u0577\u0578\7\u013d\2\2\u0578\u0579\5\u0198"+
		"\u00cd\2\u0579\u057a\7\u013e\2\2\u057a\u057b\5r:\2\u057b\u057d\3\2\2\2"+
		"\u057c\u0557\3\2\2\2\u057c\u055f\3\2\2\2\u057c\u0564\3\2\2\2\u057c\u056f"+
		"\3\2\2\2\u057c\u0575\3\2\2\2\u057dw\3\2\2\2\u057e\u057f\5\u0196\u00cc"+
		"\2\u057f\u0582\7M\2\2\u0580\u0583\5\u01f0\u00f9\2\u0581\u0583\5\u01f6"+
		"\u00fc\2\u0582\u0580\3\2\2\2\u0582\u0581\3\2\2\2\u0583\u058d\3\2\2\2\u0584"+
		"\u0585\7\u0136\2\2\u0585\u0586\5\u0196\u00cc\2\u0586\u0589\7M\2\2\u0587"+
		"\u058a\5\u01f0\u00f9\2\u0588\u058a\5\u01f6\u00fc\2\u0589\u0587\3\2\2\2"+
		"\u0589\u0588\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u0584\3\2\2\2\u058c\u058f"+
		"\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058ey\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u0590\u0591\5\u00a6T\2\u0591\u0593\5|?\2\u0592\u0594\5"+
		"\u00eex\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0598\3\2\2\2"+
		"\u0595\u0597\5p9\2\u0596\u0595\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u05a6\3\2\2\2\u059a\u0598\3\2\2\2\u059b"+
		"\u05a6\5v<\2\u059c\u059d\7+\2\2\u059d\u05a2\5\u01ce\u00e8\2\u059e\u059f"+
		"\t\23\2\2\u059f\u05a1\t\24\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a4\3\2\2\2"+
		"\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2"+
		"\3\2\2\2\u05a5\u0590\3\2\2\2\u05a5\u059b\3\2\2\2\u05a5\u059c\3\2\2\2\u05a6"+
		"{\3\2\2\2\u05a7\u05a8\5\u00be`\2\u05a8}\3\2\2\2\u05a9\u05aa\7M\2\2\u05aa"+
		"\u05ab\7\u013d\2\2\u05ab\u05b0\5\u0080A\2\u05ac\u05ad\7\u0136\2\2\u05ad"+
		"\u05af\5\u0080A\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae"+
		"\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3"+
		"\u05b4\7\u013e\2\2\u05b4\177\3\2\2\2\u05b5\u05b8\5\u00a6T\2\u05b6\u05b8"+
		"\7\u0162\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6\3\2\2\2\u05b8\u05bb\3\2\2"+
		"\2\u05b9\u05ba\7\u0133\2\2\u05ba\u05bc\5\u012a\u0096\2\u05bb\u05b9\3\2"+
		"\2\2\u05bb\u05bc\3\2\2\2\u05bc\u0081\3\2\2\2\u05bd\u05be\7H\2\2\u05be"+
		"\u05bf\5\u0122\u0092\2\u05bf\u0083\3\2\2\2\u05c0\u05c1\78\2\2\u05c1\u05c2"+
		"\t\25\2\2\u05c2\u05c4\5\u00a6T\2\u05c3\u05c5\7\u0085\2\2\u05c4\u05c3\3"+
		"\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u0085\3\2\2\2\u05c6\u05c7\7\5\2\2\u05c7"+
		"\u05ca\7@\2\2\u05c8\u05c9\7!\2\2\u05c9\u05cb\7}\2\2\u05ca\u05c8\3\2\2"+
		"\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05ce\7\u00ba\2\2\u05cd"+
		"\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\5\u01ce"+
		"\u00e8\2\u05d0\u05d2\7\u0143\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2"+
		"\2\u05d2\u05d3\3\2\2\2\u05d3\u05d8\5\u0088E\2\u05d4\u05d5\7\u0136\2\2"+
		"\u05d5\u05d7\5\u0088E\2\u05d6\u05d4\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8"+
		"\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u0087\3\2\2\2\u05da\u05d8\3\2"+
		"\2\2\u05db\u05fc\5\u008aF\2\u05dc\u05fc\5\u008cG\2\u05dd\u05fc\5\u008e"+
		"H\2\u05de\u05fc\5\u0092J\2\u05df\u05fc\5\u0094K\2\u05e0\u05fc\5\u0096"+
		"L\2\u05e1\u05e2\7\u00cf\2\2\u05e2\u05e3\7\u00f2\2\2\u05e3\u05fc\5\u01ce"+
		"\u00e8\2\u05e4\u05e5\7\u00dd\2\2\u05e5\u05e6\7\u013d\2\2\u05e6\u05eb\5"+
		"\u0080A\2\u05e7\u05e8\7\u0136\2\2\u05e8\u05ea\5\u0080A\2\u05e9\u05e7\3"+
		"\2\2\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec"+
		"\u05ee\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05ef\7\u013e\2\2\u05ef\u05fc"+
		"\3\2\2\2\u05f0\u05f2\7\u00b3\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2"+
		"\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\7\u0094\2\2\u05f4\u05fc\5\u01ce\u00e8"+
		"\2\u05f5\u05f6\t\3\2\2\u05f6\u05fc\7\u00b9\2\2\u05f7\u05f8\7\u00b8\2\2"+
		"\u05f8\u05fc\5\u00be`\2\u05f9\u05fa\7.\2\2\u05fa\u05fc\7\u00b8\2\2\u05fb"+
		"\u05db\3\2\2\2\u05fb\u05dc\3\2\2\2\u05fb\u05dd\3\2\2\2\u05fb\u05de\3\2"+
		"\2\2\u05fb\u05df\3\2\2\2\u05fb\u05e0\3\2\2\2\u05fb\u05e1\3\2\2\2\u05fb"+
		"\u05e4\3\2\2\2\u05fb\u05f1\3\2\2\2\u05fb\u05f5\3\2\2\2\u05fb\u05f7\3\2"+
		"\2\2\u05fb\u05f9\3\2\2\2\u05fc\u0089\3\2\2\2\u05fd\u05ff\7Q\2\2\u05fe"+
		"\u0600\7b\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2"+
		"\2\2\u0601\u0602\5\u0196\u00cc\2\u0602\u0604\5\u00be`\2\u0603\u0605\5"+
		"\u00eex\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2\2\2"+
		"\u0606\u0608\5p9\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u008b"+
		"\3\2\2\2\u0609\u060b\7w\2\2\u060a\u060c\7b\2\2\u060b\u060a\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060c\u060f\3\2\2\2\u060d\u060e\7!\2\2\u060e\u0610\7}\2"+
		"\2\u060f\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613"+
		"\5\u0196\u00cc\2\u0612\u0614\5\u00a4S\2\u0613\u0612\3\2\2\2\u0613\u0614"+
		"\3\2\2\2\u0614\u008d\3\2\2\2\u0615\u0617\7\5\2\2\u0616\u0618\7b\2\2\u0617"+
		"\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\5\u0196"+
		"\u00cc\2\u061a\u061b\5\u0090I\2\u061b\u008f\3\2\2\2\u061c\u061d\7\u00dd"+
		"\2\2\u061d\u061f\7l\2\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f"+
		"\u0620\3\2\2\2\u0620\u0621\7\u00f3\2\2\u0621\u0623\5\u00be`\2\u0622\u0624"+
		"\5\u00eex\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2"+
		"\2\u0625\u0627\5\u0082B\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627"+
		"\u0643\3\2\2\2\u0628\u0629\7\u00fa\2\2\u0629\u062a\7d\2\2\u062a\u0643"+
		"\5\u00a6T\2\u062b\u062c\7\u00dd\2\2\u062c\u062d\7\22\2\2\u062d\u0643\5"+
		"\u0122\u0092\2\u062e\u062f\7\u00dd\2\2\u062f\u0630\7\u013d\2\2\u0630\u0635"+
		"\5\u0080A\2\u0631\u0632\7\u0136\2\2\u0632\u0634\5\u0080A\2\u0633\u0631"+
		"\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0638\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u0639\7\u013e\2\2\u0639\u0643"+
		"\3\2\2\2\u063a\u063b\7\u00dd\2\2\u063b\u063c\7\u00e4\2\2\u063c\u0643\t"+
		"\26\2\2\u063d\u063e\7w\2\2\u063e\u0643\7\22\2\2\u063f\u0640\t\27\2\2\u0640"+
		"\u0641\7.\2\2\u0641\u0643\7/\2\2\u0642\u061e\3\2\2\2\u0642\u0628\3\2\2"+
		"\2\u0642\u062b\3\2\2\2\u0642\u062e\3\2\2\2\u0642\u063a\3\2\2\2\u0642\u063d"+
		"\3\2\2\2\u0642\u063f\3\2\2\2\u0643\u0091\3\2\2\2\u0644\u0646\7\u00cf\2"+
		"\2\u0645\u0647\7b\2\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648"+
		"\3\2\2\2\u0648\u0649\5\u0196\u00cc\2\u0649\u064a\7\u00f2\2\2\u064a\u064b"+
		"\5\u0196\u00cc\2\u064b\u0093\3\2\2\2\u064c\u065e\7Q\2\2\u064d\u0650\5"+
		"v<\2\u064e\u064f\7.\2\2\u064f\u0651\7\u00f9\2\2\u0650\u064e\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u065f\3\2\2\2\u0652\u0653\7d\2\2\u0653\u0655\5\u00a6"+
		"T\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0659\3\2\2\2\u0656"+
		"\u065a\7F\2\2\u0657\u0658\7\u00c5\2\2\u0658\u065a\7\u009d\2\2\u0659\u0656"+
		"\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\7H\2\2\u065c"+
		"\u065d\7\u0092\2\2\u065d\u065f\5\u01ce\u00e8\2\u065e\u064d\3\2\2\2\u065e"+
		"\u0654\3\2\2\2\u065f\u0095\3\2\2\2\u0660\u0661\7w\2\2\u0661\u0664\7d\2"+
		"\2\u0662\u0663\7!\2\2\u0663\u0665\7}\2\2\u0664\u0662\3\2\2\2\u0664\u0665"+
		"\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\5\u00a6T\2\u0667\u0669\5\u00a4"+
		"S\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u0097\3\2\2\2\u066a"+
		"\u066b\7w\2\2\u066b\u066e\7@\2\2\u066c\u066d\7!\2\2\u066d\u066f\7}\2\2"+
		"\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672"+
		"\5\u01d0\u00e9\2\u0671\u0673\5\u00a4S\2\u0672\u0671\3\2\2\2\u0672\u0673"+
		"\3\2\2\2\u0673\u0099\3\2\2\2\u0674\u0676\7w\2\2\u0675\u0677\7\u00a6\2"+
		"\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067b"+
		"\7J\2\2\u0679\u067a\7!\2\2\u067a\u067c\7}\2\2\u067b\u0679\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\5\u01d0\u00e9\2\u067e\u0680"+
		"\5\u00a4S\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u009b\3\2\2"+
		"\2\u0681\u0682\7w\2\2\u0682\u0684\7\u0092\2\2\u0683\u0685\7c\2\2\u0684"+
		"\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0687\7!"+
		"\2\2\u0687\u0689\7}\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a\u068c\5\u01d0\u00e9\2\u068b\u068d\5\u00a4S\2\u068c"+
		"\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u009d\3\2\2\2\u068e\u068f\7w"+
		"\2\2\u068f\u0692\7\u00db\2\2\u0690\u0691\7!\2\2\u0691\u0693\7}\2\2\u0692"+
		"\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0696\5\u01d0"+
		"\u00e9\2\u0695\u0697\5\u00a4S\2\u0696\u0695\3\2\2\2\u0696\u0697\3\2\2"+
		"\2\u0697\u069b\3\2\2\2\u0698\u0699\7t\2\2\u0699\u069b\7\u00dc\2\2\u069a"+
		"\u068e\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u009f\3\2\2\2\u069c\u069e\7D"+
		"\2\2\u069d\u069f\7@\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a3\5\u00a2R\2\u06a1\u06a2\t\30\2\2\u06a2\u06a4"+
		"\7\u008f\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2"+
		"\2\u06a5\u06a7\5\u00a4S\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7"+
		"\u00a1\3\2\2\2\u06a8\u06aa\7\u00ba\2\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06b3\5\u01ce\u00e8\2\u06ac\u06ae\7"+
		"\u0136\2\2\u06ad\u06af\7\u00ba\2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2"+
		"\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\5\u01ce\u00e8\2\u06b1\u06ac\3\2\2"+
		"\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u00a3"+
		"\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06b7\t\13\2\2\u06b7\u00a5\3\2\2\2"+
		"\u06b8\u06bb\t\31\2\2\u06b9\u06bb\5\u00a8U\2\u06ba\u06b8\3\2\2\2\u06ba"+
		"\u06b9\3\2\2\2\u06bb\u00a7\3\2\2\2\u06bc\u06bd\t\32\2\2\u06bd\u00a9\3"+
		"\2\2\2\u06be\u06c1\5\u00f4{\2\u06bf\u06c1\5\u00acW\2\u06c0\u06be\3\2\2"+
		"\2\u06c0\u06bf\3\2\2\2\u06c1\u00ab\3\2\2\2\u06c2\u06c7\7\u0162\2\2\u06c3"+
		"\u06c7\7\u0161\2\2\u06c4\u06c7\5\u00aeX\2\u06c5\u06c7\5\u00bc_\2\u06c6"+
		"\u06c2\3\2\2\2\u06c6\u06c3\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c5\3\2"+
		"\2\2\u06c7\u00ad\3\2\2\2\u06c8\u06cd\5\u00b8]\2\u06c9\u06cd\5\u00b6\\"+
		"\2\u06ca\u06cd\5\u00ba^\2\u06cb\u06cd\5\u00b0Y\2\u06cc\u06c8\3\2\2\2\u06cc"+
		"\u06c9\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cb\3\2\2\2\u06cd\u00af\3\2"+
		"\2\2\u06ce\u06d0\7\u011f\2\2\u06cf\u06d1\5\u00b4[\2\u06d0\u06cf\3\2\2"+
		"\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\7\u0162\2\2\u06d3"+
		"\u06d5\5\u00b2Z\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7"+
		"\3\2\2\2\u06d6\u06d8\5\u00b4[\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3\2\2"+
		"\2\u06d8\u00b1\3\2\2\2\u06d9\u06dc\5\u021c\u010f\2\u06da\u06db\7\u00f2"+
		"\2\2\u06db\u06dd\5\u021c\u010f\2\u06dc\u06da\3\2\2\2\u06dc\u06dd\3\2\2"+
		"\2\u06dd\u00b3\3\2\2\2\u06de\u06df\7\u013d\2\2\u06df\u06e0\5\u00f4{\2"+
		"\u06e0\u06e1\7\u013e\2\2\u06e1\u00b5\3\2\2\2\u06e2\u06e3\7\u0120\2\2\u06e3"+
		"\u06e4\7\u0162\2\2\u06e4\u00b7\3\2\2\2\u06e5\u06e6\7\u0122\2\2\u06e6\u06e7"+
		"\7\u0162\2\2\u06e7\u00b9\3\2\2\2\u06e8\u06e9\7\u011e\2\2\u06e9\u06ea\7"+
		"\u0162\2\2\u06ea\u00bb\3\2\2\2\u06eb\u06ec\t\33\2\2\u06ec\u00bd\3\2\2"+
		"\2\u06ed\u06f1\5\u00c4c\2\u06ee\u06f1\5\u00c2b\2\u06ef\u06f1\5\u00c0a"+
		"\2\u06f0\u06ed\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f0\u06ef\3\2\2\2\u06f1\u06f5"+
		"\3\2\2\2\u06f2\u06f4\5\u00c6d\2\u06f3\u06f2\3\2\2\2\u06f4\u06f7\3\2\2"+
		"\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u00bf\3\2\2\2\u06f7\u06f5"+
		"\3\2\2\2\u06f8\u06f9\5\u00a6T\2\u06f9\u00c1\3\2\2\2\u06fa\u06fb\t\34\2"+
		"\2\u06fb\u00c3\3\2\2\2\u06fc\u0707\5\u00caf\2\u06fd\u0707\5\u00d0i\2\u06fe"+
		"\u0707\5\u00d2j\2\u06ff\u0707\5\u00ccg\2\u0700\u0707\5\u00d4k\2\u0701"+
		"\u0707\5\u00dco\2\u0702\u0707\5\u00dep\2\u0703\u0707\5\u00e0q\2\u0704"+
		"\u0707\5\u00e2r\2\u0705\u0707\5\u00c8e\2\u0706\u06fc\3\2\2\2\u0706\u06fd"+
		"\3\2\2\2\u0706\u06fe\3\2\2\2\u0706\u06ff\3\2\2\2\u0706\u0700\3\2\2\2\u0706"+
		"\u0701\3\2\2\2\u0706\u0702\3\2\2\2\u0706\u0703\3\2\2\2\u0706\u0704\3\2"+
		"\2\2\u0706\u0705\3\2\2\2\u0707\u00c5\3\2\2\2\u0708\u070a\7S\2\2\u0709"+
		"\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070e\7\u013f"+
		"\2\2\u070c\u070f\5\u00be`\2\u070d\u070f\5\u00f4{\2\u070e\u070c\3\2\2\2"+
		"\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0713"+
		"\7\u0140\2\2\u0711\u0713\7S\2\2\u0712\u0709\3\2\2\2\u0712\u0711\3\2\2"+
		"\2\u0713\u00c7\3\2\2\2\u0714\u0715\7\u012b\2\2\u0715\u00c9\3\2\2\2\u0716"+
		"\u0718\7\\\2\2\u0717\u0719\5\u00ceh\2\u0718\u0717\3\2\2\2\u0718\u0719"+
		"\3\2\2\2\u0719\u072e\3\2\2\2\u071a\u071c\7\u011a\2\2\u071b\u071d\5\u00ce"+
		"h\2\u071c\u071b\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u072e\3\2\2\2\u071e"+
		"\u071f\7\\\2\2\u071f\u0721\7\u00fe\2\2\u0720\u0722\5\u00ceh\2\u0721\u0720"+
		"\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u072e\3\2\2\2\u0723\u0724\7\u011a\2"+
		"\2\u0724\u0726\7\u00fe\2\2\u0725\u0727\5\u00ceh\2\u0726\u0725\3\2\2\2"+
		"\u0726\u0727\3\2\2\2\u0727\u072e\3\2\2\2\u0728\u072a\7\u011b\2\2\u0729"+
		"\u072b\5\u00ceh\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072e"+
		"\3\2\2\2\u072c\u072e\7\u0124\2\2\u072d\u0716\3\2\2\2\u072d\u071a\3\2\2"+
		"\2\u072d\u071e\3\2\2\2\u072d\u0723\3\2\2\2\u072d\u0728\3\2\2\2\u072d\u072c"+
		"\3\2\2\2\u072e\u00cb\3\2\2\2\u072f\u0730\t\35\2\2\u0730\u00cd\3\2\2\2"+
		"\u0731\u0732\7\u013d\2\2\u0732\u0733\7\u0159\2\2\u0733\u0734\7\u013e\2"+
		"\2\u0734\u00cf\3\2\2\2\u0735\u0736\7\u00b1\2\2\u0736\u0738\7\\\2\2\u0737"+
		"\u0739\5\u00ceh\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0759"+
		"\3\2\2\2\u073a\u073b\7\u00b1\2\2\u073b\u073d\7\u011a\2\2\u073c\u073e\5"+
		"\u00ceh\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0759\3\2\2\2"+
		"\u073f\u0741\7\u011c\2\2\u0740\u0742\5\u00ceh\2\u0741\u0740\3\2\2\2\u0741"+
		"\u0742\3\2\2\2\u0742\u0759\3\2\2\2\u0743\u0744\7\u00b1\2\2\u0744\u0745"+
		"\7\\\2\2\u0745\u0747\7\u00fe\2\2\u0746\u0748\5\u00ceh\2\u0747\u0746\3"+
		"\2\2\2\u0747\u0748\3\2\2\2\u0748\u0759\3\2\2\2\u0749\u074a\7\u00b1\2\2"+
		"\u074a\u074b\7\u011a\2\2\u074b\u074d\7\u00fe\2\2\u074c\u074e\5\u00ceh"+
		"\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0759\3\2\2\2\u074f\u0750"+
		"\7\u011c\2\2\u0750\u0752\7\u00fe\2\2\u0751\u0753\5\u00ceh\2\u0752\u0751"+
		"\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0759\3\2\2\2\u0754\u0756\7\u011d\2"+
		"\2\u0755\u0757\5\u00ceh\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757"+
		"\u0759\3\2\2\2\u0758\u0735\3\2\2\2\u0758\u073a\3\2\2\2\u0758\u073f\3\2"+
		"\2\2\u0758\u0743\3\2\2\2\u0758\u0749\3\2\2\2\u0758\u074f\3\2\2\2\u0758"+
		"\u0754\3\2\2\2\u0759\u00d1\3\2\2\2\u075a\u075c\7\u0129\2\2\u075b\u075d"+
		"\5\u00ceh\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0763\3\2\2"+
		"\2\u075e\u0760\7\u012a\2\2\u075f\u0761\5\u00ceh\2\u0760\u075f\3\2\2\2"+
		"\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762\u075a\3\2\2\2\u0762\u075e"+
		"\3\2\2\2\u0763\u00d3\3\2\2\2\u0764\u0767\5\u00d6l\2\u0765\u0767\5\u00d8"+
		"m\2\u0766\u0764\3\2\2\2\u0766\u0765\3\2\2\2\u0767\u00d5\3\2\2\2\u0768"+
		"\u076a\7\u0118\2\2\u0769\u076b\5\u00dan\2\u076a\u0769\3\2\2\2\u076a\u076b"+
		"\3\2\2\2\u076b\u0776\3\2\2\2\u076c\u076e\7\u0119\2\2\u076d\u076f\5\u00da"+
		"n\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0776\3\2\2\2\u0770"+
		"\u0772\7n\2\2\u0771\u0773\5\u00dan\2\u0772\u0771\3\2\2\2\u0772\u0773\3"+
		"\2\2\2\u0773\u0776\3\2\2\2\u0774\u0776\t\36\2\2\u0775\u0768\3\2\2\2\u0775"+
		"\u076c\3\2\2\2\u0775\u0770\3\2\2\2\u0775\u0774\3\2\2\2\u0776\u00d7\3\2"+
		"\2\2\u0777\u077f\t\37\2\2\u0778\u0779\7\u0117\2\2\u0779\u077f\7\u00c3"+
		"\2\2\u077a\u077c\7\u0116\2\2\u077b\u077d\5\u00dan\2\u077c\u077b\3\2\2"+
		"\2\u077c\u077d\3\2\2\2\u077d\u077f\3\2\2\2\u077e\u0777\3\2\2\2\u077e\u0778"+
		"\3\2\2\2\u077e\u077a\3\2\2\2\u077f\u00d9\3\2\2\2\u0780\u0781\7\u013d\2"+
		"\2\u0781\u0782\7\u0159\2\2\u0782\u0789\7\u013e\2\2\u0783\u0784\7\u013d"+
		"\2\2\u0784\u0785\7\u0159\2\2\u0785\u0786\7\u0136\2\2\u0786\u0787\7\u0159"+
		"\2\2\u0787\u0789\7\u013e\2\2\u0788\u0780\3\2\2\2\u0788\u0783\3\2\2\2\u0789"+
		"\u00db\3\2\2\2\u078a\u078b\t \2\2\u078b\u00dd\3\2\2\2\u078c\u078e\t!\2"+
		"\2\u078d\u078f\5\u00ceh\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u079f\3\2\2\2\u0790\u0792\7\u0120\2\2\u0791\u0793\5\u00ceh\2\u0792\u0791"+
		"\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0795\t\3\2\2\u0795"+
		"\u0796\7\u0120\2\2\u0796\u079f\7\u0105\2\2\u0797\u0799\7\u0122\2\2\u0798"+
		"\u079a\5\u00ceh\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b"+
		"\3\2\2\2\u079b\u079c\t\3\2\2\u079c\u079d\7\u0120\2\2\u079d\u079f\7\u0105"+
		"\2\2\u079e\u078c\3\2\2\2\u079e\u0790\3\2\2\2\u079e\u0797\3\2\2\2\u079f"+
		"\u00df\3\2\2\2\u07a0\u07a2\7\u0108\2\2\u07a1\u07a3\5\u00ceh\2\u07a2\u07a1"+
		"\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07ae\3\2\2\2\u07a4\u07a6\7\u0109\2"+
		"\2\u07a5\u07a7\5\u00ceh\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7"+
		"\u07ae\3\2\2\2\u07a8\u07a9\7\u0108\2\2\u07a9\u07ab\7\u00fe\2\2\u07aa\u07ac"+
		"\5\u00ceh\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae\3\2\2"+
		"\2\u07ad\u07a0\3\2\2\2\u07ad\u07a4\3\2\2\2\u07ad\u07a8\3\2\2\2\u07ae\u00e1"+
		"\3\2\2\2\u07af\u07b1\7\u0127\2\2\u07b0\u07b2\5\u00ceh\2\u07b1\u07b0\3"+
		"\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07bd\3\2\2\2\u07b3\u07b4\7\u0127\2\2"+
		"\u07b4\u07b6\7\u00fe\2\2\u07b5\u07b7\5\u00ceh\2\u07b6\u07b5\3\2\2\2\u07b6"+
		"\u07b7\3\2\2\2\u07b7\u07bd\3\2\2\2\u07b8\u07ba\7\u0128\2\2\u07b9\u07bb"+
		"\5\u00ceh\2\u07ba\u07b9\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bd\3\2\2"+
		"\2\u07bc\u07af\3\2\2\2\u07bc\u07b3\3\2\2\2\u07bc\u07b8\3\2\2\2\u07bd\u00e3"+
		"\3\2\2\2\u07be\u07c0\5\u00f8}\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3\2\2"+
		"\2\u07c0\u07c3\3\2\2\2\u07c1\u07c4\5\u00e8u\2\u07c2\u07c4\5\u00eav\2\u07c3"+
		"\u07c1\3\2\2\2\u07c3\u07c2\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c7\5\u00f8"+
		"}\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07cd\3\2\2\2\u07c8"+
		"\u07ce\5\u00e6t\2\u07c9\u07ca\7\u0147\2\2\u07ca\u07cc\5\u01de\u00f0\2"+
		"\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07ce\3\2\2\2\u07cd\u07c8"+
		"\3\2\2\2\u07cd\u07cb\3\2\2\2\u07ce\u07d3\3\2\2\2\u07cf\u07d0\7\u0131\2"+
		"\2\u07d0\u07d2\5\u0120\u0091\2\u07d1\u07cf\3\2\2\2\u07d2\u07d5\3\2\2\2"+
		"\u07d3\u07d1\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07da\3\2\2\2\u07d5\u07d3"+
		"\3\2\2\2\u07d6\u07d7\7T\2\2\u07d7\u07d8\7\u0120\2\2\u07d8\u07d9\7\u0105"+
		"\2\2\u07d9\u07db\7\u0162\2\2\u07da\u07d6\3\2\2\2\u07da\u07db\3\2\2\2\u07db"+
		"\u00e5\3\2\2\2\u07dc\u07dd\7\u013f\2\2\u07dd\u07e0\5\u012a\u0096\2\u07de"+
		"\u07df\7\u0134\2\2\u07df\u07e1\5\u012a\u0096\2\u07e0\u07de\3\2\2\2\u07e0"+
		"\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\7\u0140\2\2\u07e3\u07e5"+
		"\3\2\2\2\u07e4\u07dc\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u00e7\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\7\u013d"+
		"\2\2\u07ea\u07eb\5\u0122\u0092\2\u07eb\u07ed\7\u013e\2\2\u07ec\u07ee\5"+
		"\u00eex\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u00e9\3\2\2\2"+
		"\u07ef\u07fc\5\u00f2z\2\u07f0\u07fc\5\u00fa~\2\u07f1\u07fc\5\u0168\u00b5"+
		"\2\u07f2\u07fc\5\u01de\u00f0\2\u07f3\u07fc\5\u00f0y\2\u07f4\u07fc\5\u00fe"+
		"\u0080\2\u07f5\u07fc\5\u01e4\u00f3\2\u07f6\u07fc\5\u010a\u0086\2\u07f7"+
		"\u07fc\5\u011c\u008f\2\u07f8\u07fc\5\u0226\u0114\2\u07f9\u07fc\5\u00ec"+
		"w\2\u07fa\u07fc\7/\2\2\u07fb\u07ef\3\2\2\2\u07fb\u07f0\3\2\2\2\u07fb\u07f1"+
		"\3\2\2\2\u07fb\u07f2\3\2\2\2\u07fb\u07f3\3\2\2\2\u07fb\u07f4\3\2\2\2\u07fb"+
		"\u07f5\3\2\2\2\u07fb\u07f6\3\2\2\2\u07fb\u07f7\3\2\2\2\u07fb\u07f8\3\2"+
		"\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fa\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd"+
		"\u07ff\5\u00eex\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u00eb"+
		"\3\2\2\2\u0800\u0801\7\u013d\2\2\u0801\u0802\5\u0128\u0095\2\u0802\u0803"+
		"\7\u013e\2\2\u0803\u00ed\3\2\2\2\u0804\u0805\7_\2\2\u0805\u0806\5\u0196"+
		"\u00cc\2\u0806\u00ef\3\2\2\2\u0807\u0808\5\u00be`\2\u0808\u0809\7\u0162"+
		"\2\2\u0809\u00f1\3\2\2\2\u080a\u080b\5\u00aaV\2\u080b\u00f3\3\2\2\2\u080c"+
		"\u080d\t\"\2\2\u080d\u00f5\3\2\2\2\u080e\u0810\5\u0132\u009a\2\u080f\u080e"+
		"\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\5\u00f4{"+
		"\2\u0812\u00f7\3\2\2\2\u0813\u0814\5\u01f0\u00f9\2\u0814\u00f9\3\2\2\2"+
		"\u0815\u081b\7S\2\2\u0816\u081c\5\u00fc\177\2\u0817\u0818\7\u013d\2\2"+
		"\u0818\u0819\5\6\4\2\u0819\u081a\7\u013e\2\2\u081a\u081c\3\2\2\2\u081b"+
		"\u0816\3\2\2\2\u081b\u0817\3\2\2\2\u081c\u00fb\3\2\2\2\u081d\u082c\7\u013f"+
		"\2\2\u081e\u0821\5\u0122\u0092\2\u081f\u0821\5\u00fc\177\2\u0820\u081e"+
		"\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u0829\3\2\2\2\u0822\u0825\7\u0136\2"+
		"\2\u0823\u0826\5\u0122\u0092\2\u0824\u0826\5\u00fc\177\2\u0825\u0823\3"+
		"\2\2\2\u0825\u0824\3\2\2\2\u0826\u0828\3\2\2\2\u0827\u0822\3\2\2\2\u0828"+
		"\u082b\3\2\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082d\3\2"+
		"\2\2\u082b\u0829\3\2\2\2\u082c\u0820\3\2\2\2\u082c\u082d\3\2\2\2\u082d"+
		"\u082e\3\2\2\2\u082e\u082f\7\u0140\2\2\u082f\u00fd\3\2\2\2\u0830\u0831"+
		"\5\u0100\u0081\2\u0831\u00ff\3\2\2\2\u0832\u0833\5\u0104\u0083\2\u0833"+
		"\u083d\7\u013d\2\2\u0834\u0836\5\u01dc\u00ef\2\u0835\u0834\3\2\2\2\u0835"+
		"\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0839\5\u0128\u0095\2\u0838\u083a"+
		"\5\u023a\u011e\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083e\3"+
		"\2\2\2\u083b\u083e\7\u0143\2\2\u083c\u083e\5\u01ba\u00de\2\u083d\u0835"+
		"\3\2\2\2\u083d\u083b\3\2\2\2\u083d\u083c\3\2\2\2\u083d\u083e\3\2\2\2\u083e"+
		"\u083f\3\2\2\2\u083f\u0841\7\u013e\2\2\u0840\u0842\5\u0102\u0082\2\u0841"+
		"\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0844\3\2\2\2\u0843\u0845\5\u0106"+
		"\u0084\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0101\3\2\2\2\u0846"+
		"\u0847\7\u0102\2\2\u0847\u0848\7\37\2\2\u0848\u0849\7\u013d\2\2\u0849"+
		"\u084a\5\u023a\u011e\2\u084a\u084b\7\u013e\2\2\u084b\u0103\3\2\2\2\u084c"+
		"\u084f\t#\2\2\u084d\u084f\5\u00a6T\2\u084e\u084c\3\2\2\2\u084e\u084d\3"+
		"\2\2\2\u084f\u0105\3\2\2\2\u0850\u0851\7\u0081\2\2\u0851\u0852\7\u013d"+
		"\2\2\u0852\u0853\5\u019e\u00d0\2\u0853\u0854\7\u013e\2\2\u0854\u0107\3"+
		"\2\2\2\u0855\u0856\7\u008b\2\2\u0856\u0857\7\u013d\2\2\u0857\u0858\5\u01e2"+
		"\u00f2\2\u0858\u0859\7\u013e\2\2\u0859\u0109\3\2\2\2\u085a\u085b\5\u010e"+
		"\u0088\2\u085b\u010b\3\2\2\2\u085c\u085d\7\u00b6\2\2\u085d\u085e\7\u013d"+
		"\2\2\u085e\u085f\5\u012a\u0096\2\u085f\u0860\7\u0136\2\2\u0860\u0861\5"+
		"\u0150\u00a9\2\u0861\u0862\7\u013e\2\2\u0862\u086f\3\2\2\2\u0863\u0864"+
		"\7a\2\2\u0864\u0865\7\u013d\2\2\u0865\u0868\5\u012a\u0096\2\u0866\u0867"+
		"\7\u0136\2\2\u0867\u0869\5\u0150\u00a9\2\u0868\u0866\3\2\2\2\u0869\u086a"+
		"\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u086d\7\u013e\2\2\u086d\u086f\3\2\2\2\u086e\u085c\3\2\2\2\u086e\u0863"+
		"\3\2\2\2\u086f\u010d\3\2\2\2\u0870\u0873\5\u0110\u0089\2\u0871\u0873\5"+
		"\u0112\u008a\2\u0872\u0870\3\2\2\2\u0872\u0871\3\2\2\2\u0873\u010f\3\2"+
		"\2\2\u0874\u0875\7\f\2\2\u0875\u0877\5\u0150\u00a9\2\u0876\u0878\5\u0114"+
		"\u008b\2\u0877\u0876\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0877\3\2\2\2\u0879"+
		"\u087a\3\2\2\2\u087a\u087c\3\2\2\2\u087b\u087d\5\u0118\u008d\2\u087c\u087b"+
		"\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\7\26\2\2"+
		"\u087f\u0111\3\2\2\2\u0880\u0882\7\f\2\2\u0881\u0883\5\u0116\u008c\2\u0882"+
		"\u0881\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0882\3\2\2\2\u0884\u0885\3\2"+
		"\2\2\u0885\u0887\3\2\2\2\u0886\u0888\5\u0118\u008d\2\u0887\u0886\3\2\2"+
		"\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a\7\26\2\2\u088a"+
		"\u0113\3\2\2\2\u088b\u088c\7K\2\2\u088c\u088d\5\u01a0\u00d1\2\u088d\u088e"+
		"\7A\2\2\u088e\u088f\5\u011a\u008e\2\u088f\u0115\3\2\2\2\u0890\u0891\7"+
		"K\2\2\u0891\u0892\5\u01a0\u00d1\2\u0892\u0893\7A\2\2\u0893\u0894\5\u011a"+
		"\u008e\2\u0894\u0117\3\2\2\2\u0895\u0896\7\27\2\2\u0896\u0897\5\u011a"+
		"\u008e\2\u0897\u0119\3\2\2\2\u0898\u089b\5\u0122\u0092\2\u0899\u089b\7"+
		"/\2\2\u089a\u0898\3\2\2\2\u089a\u0899\3\2\2\2\u089b\u011b\3\2\2\2\u089c"+
		"\u089d\7\r\2\2\u089d\u089e\7\u013d\2\2\u089e\u089f\5\u011e\u0090\2\u089f"+
		"\u08a0\7\3\2\2\u08a0\u08a1\5\u0120\u0091\2\u08a1\u08a2\7\u013e\2\2\u08a2"+
		"\u011d\3\2\2\2\u08a3\u08a4\5\u0122\u0092\2\u08a4\u011f\3\2\2\2\u08a5\u08a6"+
		"\5\u00be`\2\u08a6\u0121\3\2\2\2\u08a7\u08ad\5\u0124\u0093\2\u08a8\u08ad"+
		"\5\u0164\u00b3\2\u08a9\u08ad\5\u0150\u00a9\2\u08aa\u08ad\5\u0226\u0114"+
		"\2\u08ab\u08ad\t$\2\2\u08ac\u08a7\3\2\2\2\u08ac\u08a8\3\2\2\2\u08ac\u08a9"+
		"\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ab\3\2\2\2\u08ad\u08af\3\2\2\2\u08ae"+
		"\u08b0\5\u00eex\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u0123"+
		"\3\2\2\2\u08b1\u08b5\5\u012a\u0096\2\u08b2\u08b5\5\u0140\u00a1\2\u08b3"+
		"\u08b5\7/\2\2\u08b4\u08b1\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b4\u08b3\3\2"+
		"\2\2\u08b5\u0125\3\2\2\2\u08b6\u08b7\7I\2\2\u08b7\u08b9\7\u013d\2\2\u08b8"+
		"\u08ba\5\u0128\u0095\2\u08b9\u08b8\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb"+
		"\3\2\2\2\u08bb\u08c3\7\u013e\2\2\u08bc\u08bd\7\u0136\2\2\u08bd\u08be\7"+
		"\u013d\2\2\u08be\u08bf\5\u0128\u0095\2\u08bf\u08c0\7\u013e\2\2\u08c0\u08c2"+
		"\3\2\2\2\u08c1\u08bc\3\2\2\2\u08c2\u08c5\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c3"+
		"\u08c4\3\2\2\2\u08c4\u0127\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c6\u08cb\5\u0122"+
		"\u0092\2\u08c7\u08c8";
	private static final String _serializedATNSegment1 =
		"\7\u0136\2\2\u08c8\u08ca\5\u0122\u0092\2\u08c9\u08c7\3\2\2\2\u08ca\u08cd"+
		"\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u0129\3\2\2\2\u08cd"+
		"\u08cb\3\2\2\2\u08ce\u08d3\5\u012c\u0097\2\u08cf\u08d0\t%\2\2\u08d0\u08d2"+
		"\5\u012c\u0097\2\u08d1\u08cf\3\2\2\2\u08d2\u08d5\3\2\2\2\u08d3\u08d1\3"+
		"\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u012b\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6"+
		"\u08db\5\u012e\u0098\2\u08d7\u08d8\t&\2\2\u08d8\u08da\5\u012e\u0098\2"+
		"\u08d9\u08d7\3\2\2\2\u08da\u08dd\3\2\2\2\u08db\u08d9\3\2\2\2\u08db\u08dc"+
		"\3\2\2\2\u08dc\u012d\3\2\2\2\u08dd\u08db\3\2\2\2\u08de\u08e0\5\u0132\u009a"+
		"\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08ea"+
		"\5\u0130\u0099\2\u08e2\u08e4\5\u01f0\u00f9\2\u08e3\u08e5\5\u0132\u009a"+
		"\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7"+
		"\5\u0130\u0099\2\u08e7\u08e9\3\2\2\2\u08e8\u08e2\3\2\2\2\u08e9\u08ec\3"+
		"\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u012f\3\2\2\2\u08ec"+
		"\u08ea\3\2\2\2\u08ed\u08f0\5\u00e4s\2\u08ee\u08f0\5\u0134\u009b\2\u08ef"+
		"\u08ed\3\2\2\2\u08ef\u08ee\3\2\2\2\u08f0\u0131\3\2\2\2\u08f1\u08f2\t%"+
		"\2\2\u08f2\u0133\3\2\2\2\u08f3\u08f6\5\u0138\u009d\2\u08f4\u08f6\5\u0136"+
		"\u009c\2\u08f5\u08f3\3\2\2\2\u08f5\u08f4\3\2\2\2\u08f6\u0135\3\2\2\2\u08f7"+
		"\u08f8\7\u00c1\2\2\u08f8\u08f9\7\u013d\2\2\u08f9\u08fa\5\u0122\u0092\2"+
		"\u08fa\u08fb\7#\2\2\u08fb\u08fc\5\u0122\u0092\2\u08fc\u08fd\7\u013e\2"+
		"\2\u08fd\u0137\3\2\2\2\u08fe\u08ff\7\u0080\2\2\u08ff\u0900\7\u013d\2\2"+
		"\u0900\u0901\5\u013a\u009e\2\u0901\u0902\7\35\2\2\u0902\u0903\5\u013e"+
		"\u00a0\2\u0903\u0904\7\u013e\2\2\u0904\u0139\3\2\2\2\u0905\u0909\5\u021c"+
		"\u010f\2\u0906\u0909\5\u013c\u009f\2\u0907\u0909\5\u0220\u0111\2\u0908"+
		"\u0905\3\2\2\2\u0908\u0906\3\2\2\2\u0908\u0907\3\2\2\2\u0909\u013b\3\2"+
		"\2\2\u090a\u090b\t\'\2\2\u090b\u013d\3\2\2\2\u090c\u0910\5\u01de\u00f0"+
		"\2\u090d\u0910\5\u00aeX\2\u090e\u0910\5\u0226\u0114\2\u090f\u090c\3\2"+
		"\2\2\u090f\u090d\3\2\2\2\u090f\u090e\3\2\2\2\u0910\u013f\3\2\2\2\u0911"+
		"\u0912\5\u0142\u00a2\2\u0912\u0141\3\2\2\2\u0913\u0918\5\u0144\u00a3\2"+
		"\u0914\u0915\7\u0137\2\2\u0915\u0917\5\u0144\u00a3\2\u0916\u0914\3\2\2"+
		"\2\u0917\u091a\3\2\2\2\u0918\u0916\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u0143"+
		"\3\2\2\2\u091a\u0918\3\2\2\2\u091b\u091e\5\u00e4s\2\u091c\u091e\5\u0146"+
		"\u00a4\2\u091d\u091b\3\2\2\2\u091d\u091c\3\2\2\2\u091e\u0145\3\2\2\2\u091f"+
		"\u0923\5\u014a\u00a6\2\u0920\u0923\5\u0148\u00a5\2\u0921\u0923\5\u0226"+
		"\u0114\2\u0922\u091f\3\2\2\2\u0922\u0920\3\2\2\2\u0922\u0921\3\2\2\2\u0923"+
		"\u0147\3\2\2\2\u0924\u0925\7\u00e6\2\2\u0925\u0926\7\u013d\2\2\u0926\u0929"+
		"\5\u0140\u00a1\2\u0927\u0928\7\35\2\2\u0928\u092a\5\u0124\u0093\2\u0929"+
		"\u0927\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092d\3\2\2\2\u092b\u092c\7\u0084"+
		"\2\2\u092c\u092e\5\u0124\u0093\2\u092d\u092b\3\2\2\2\u092d\u092e\3\2\2"+
		"\2\u092e\u092f\3\2\2\2\u092f\u0930\7\u013e\2\2\u0930\u0149\3\2\2\2\u0931"+
		"\u0932\7\u00f1\2\2\u0932\u0933\7\u013d\2\2\u0933\u0934\5\u014c\u00a7\2"+
		"\u0934\u0935\7\u013e\2\2\u0935\u014b\3\2\2\2\u0936\u0938\5\u014e\u00a8"+
		"\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u093a\3\2\2\2\u0939\u093b"+
		"\5\u0142\u00a2\2\u093a\u0939\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093c\3"+
		"\2\2\2\u093c\u093e\7\35\2\2\u093d\u0937\3\2\2\2\u093d\u093e\3\2\2\2\u093e"+
		"\u093f\3\2\2\2\u093f\u0945\5\u0142\u00a2\2\u0940\u0941\5\u0142\u00a2\2"+
		"\u0941\u0942\7\u0136\2\2\u0942\u0943\5\u0142\u00a2\2\u0943\u0945\3\2\2"+
		"\2\u0944\u093d\3\2\2\2\u0944\u0940\3\2\2\2\u0945\u014d\3\2\2\2\u0946\u0947"+
		"\t(\2\2\u0947\u014f\3\2\2\2\u0948\u0949\5\u0152\u00aa\2\u0949\u0151\3"+
		"\2\2\2\u094a\u094f\5\u0154\u00ab\2\u094b\u094c\7\65\2\2\u094c\u094e\5"+
		"\u0152\u00aa\2\u094d\u094b\3\2\2\2\u094e\u0951\3\2\2\2\u094f\u094d\3\2"+
		"\2\2\u094f\u0950\3\2\2\2\u0950\u0153\3\2\2\2\u0951\u094f\3\2\2\2\u0952"+
		"\u0957\5\u0156\u00ac\2\u0953\u0954\7\6\2\2\u0954\u0956\5\u0154\u00ab\2"+
		"\u0955\u0953\3\2\2\2\u0956\u0959\3\2\2\2\u0957\u0955\3\2\2\2\u0957\u0958"+
		"\3\2\2\2\u0958\u0155\3\2\2\2\u0959\u0957\3\2\2\2\u095a\u095e\5\u0158\u00ad"+
		"\2\u095b\u095c\7.\2\2\u095c\u095e\5\u0158\u00ad\2\u095d\u095a\3\2\2\2"+
		"\u095d\u095b\3\2\2\2\u095e\u0157\3\2\2\2\u095f\u0961\5\u015e\u00b0\2\u0960"+
		"\u0962\5\u015a\u00ae\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0159"+
		"\3\2\2\2\u0963\u0965\7\'\2\2\u0964\u0966\7.\2\2\u0965\u0964\3\2\2\2\u0965"+
		"\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\5\u015c\u00af\2\u0968\u015b"+
		"\3\2\2\2\u0969\u096a\t\33\2\2\u096a\u015d\3\2\2\2\u096b\u096e\5\u01ec"+
		"\u00f7\2\u096c\u096e\5\u0160\u00b1\2\u096d\u096b\3\2\2\2\u096d\u096c\3"+
		"\2\2\2\u096e\u015f\3\2\2\2\u096f\u0972\5\u0162\u00b2\2\u0970\u0972\5\u00ea"+
		"v\2\u0971\u096f\3\2\2\2\u0971\u0970\3\2\2\2\u0972\u0161\3\2\2\2\u0973"+
		"\u0974\7\u013d\2\2\u0974\u0975\5\u0150\u00a9\2\u0975\u0976\7\u013e\2\2"+
		"\u0976\u0163\3\2\2\2\u0977\u097a\5\u0166\u00b4\2\u0978\u097a\5\u0168\u00b5"+
		"\2\u0979\u0977\3\2\2\2\u0979\u0978\3\2\2\2\u097a\u0165\3\2\2\2\u097b\u097c"+
		"\5\u00eav\2\u097c\u0167\3\2\2\2\u097d\u097e\7;\2\2\u097e\u0987\7\u013d"+
		"\2\2\u097f\u0984\5\u0122\u0092\2\u0980\u0981\7\u0136\2\2\u0981\u0983\5"+
		"\u0122\u0092\2\u0982\u0980\3\2\2\2\u0983\u0986\3\2\2\2\u0984\u0982\3\2"+
		"\2\2\u0984\u0985\3\2\2\2\u0985\u0988\3\2\2\2\u0986\u0984\3\2\2\2\u0987"+
		"\u097f\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\7\u013e"+
		"\2\2\u098a\u0169\3\2\2\2\u098b\u098e\5\u0166\u00b4\2\u098c\u098e\5\u016c"+
		"\u00b7\2\u098d\u098b\3\2\2\2\u098d\u098c\3\2\2\2\u098e\u016b\3\2\2\2\u098f"+
		"\u0992\5\u0124\u0093\2\u0990\u0992\5\u0160\u00b1\2\u0991\u098f\3\2\2\2"+
		"\u0991\u0990\3\2\2\2\u0992\u016d\3\2\2\2\u0993\u0995\7&\2\2\u0994\u0996"+
		"\t)\2\2\u0995\u0994\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0998\3\2\2\2\u0997"+
		"\u0999\7@\2\2\u0998\u0997\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a\3\2"+
		"\2\2\u099a\u099b\5\u01ce\u00e8\2\u099b\u016f\3\2\2\2\u099c\u09a7\5\u0172"+
		"\u00ba\2\u099d\u09a7\5\u019e\u00d0\2\u099e\u09a7\5\u01a2\u00d2\2\u099f"+
		"\u09a7\5\u01b2\u00da\2\u09a0\u09a7\5\u0230\u0119\2\u09a1\u09a7\5\u023a"+
		"\u011e\2\u09a2\u09a7\5\u0242\u0122\2\u09a3\u09a7\5\u0238\u011d\2\u09a4"+
		"\u09a7\5\u0222\u0112\2\u09a5\u09a7\5\u0224\u0113\2\u09a6\u099c\3\2\2\2"+
		"\u09a6\u099d\3\2\2\2\u09a6\u099e\3\2\2\2\u09a6\u099f\3\2\2\2\u09a6\u09a0"+
		"\3\2\2\2\u09a6\u09a1\3\2\2\2\u09a6\u09a2\3\2\2\2\u09a6\u09a3\3\2\2\2\u09a6"+
		"\u09a4\3\2\2\2\u09a6\u09a5\3\2\2\2\u09a7\u0171\3\2\2\2\u09a8\u09aa\7\35"+
		"\2\2\u09a9\u09ab\7\u00ba\2\2\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab"+
		"\u09ac\3\2\2\2\u09ac\u09ad\5\u0174\u00bb\2\u09ad\u0173\3\2\2\2\u09ae\u09b3"+
		"\5\u0176\u00bc\2\u09af\u09b0\7\u0136\2\2\u09b0\u09b2\5\u0176\u00bc\2\u09b1"+
		"\u09af\3\2\2\2\u09b2\u09b5\3\2\2\2\u09b3\u09b1\3\2\2\2\u09b3\u09b4\3\2"+
		"\2\2\u09b4\u0175\3\2\2\2\u09b5\u09b3\3\2\2\2\u09b6\u09bd\5\u017a\u00be"+
		"\2\u09b7\u09bd\5\u0226\u0114\2\u09b8\u09b9\7\u013d\2\2\u09b9\u09ba\5\u0176"+
		"\u00bc\2\u09ba\u09bb\7\u013e\2\2\u09bb\u09bd\3\2\2\2\u09bc\u09b6\3\2\2"+
		"\2\u09bc\u09b7\3\2\2\2\u09bc\u09b8\3\2\2\2\u09bd\u09bf\3\2\2\2\u09be\u09c0"+
		"\5\u0178\u00bd\2\u09bf\u09be\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c3\3"+
		"\2\2\2\u09c1\u09c3\5\u0192\u00ca\2\u09c2\u09bc\3\2\2\2\u09c2\u09c1\3\2"+
		"\2\2\u09c3\u0177\3\2\2\2\u09c4\u09c6\7\3\2\2\u09c5\u09c4\3\2\2\2\u09c5"+
		"\u09c6\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09cd\5\u00a6T\2\u09c8\u09ca"+
		"\7\u013d\2\2\u09c9\u09cb\5\u0198\u00cd\2\u09ca\u09c9\3\2\2\2\u09ca\u09cb"+
		"\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09ce\7\u013e\2\2\u09cd\u09c8\3\2\2"+
		"\2\u09cd\u09ce\3\2\2\2\u09ce\u0179\3\2\2\2\u09cf\u09d1\5\u0192\u00ca\2"+
		"\u09d0\u09d2\5\u017c\u00bf\2\u09d1\u09d0\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3"+
		"\u09d1\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u017b\3\2\2\2\u09d5\u09d6\7\20"+
		"\2\2\u09d6\u09d7\7(\2\2\u09d7\u09e9\5\u0192\u00ca\2\u09d8\u09da\5\u0186"+
		"\u00c4\2\u09d9\u09d8\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db"+
		"\u09dc\7(\2\2\u09dc\u09dd\5\u0192\u00ca\2\u09dd\u09de\5\u018c\u00c7\2"+
		"\u09de\u09e9\3\2\2\2\u09df\u09e1\7-\2\2\u09e0\u09e2\5\u0186\u00c4\2\u09e1"+
		"\u09e0\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\7("+
		"\2\2\u09e4\u09e9\5\u0192\u00ca\2\u09e5\u09e6\7E\2\2\u09e6\u09e7\7(\2\2"+
		"\u09e7\u09e9\5\u0192\u00ca\2\u09e8\u09d5\3\2\2\2\u09e8\u09d9\3\2\2\2\u09e8"+
		"\u09df\3\2\2\2\u09e8\u09e5\3\2\2\2\u09e9\u017d\3\2\2\2\u09ea\u09eb\7\20"+
		"\2\2\u09eb\u09ec\7(\2\2\u09ec\u09ed\5\u0192\u00ca\2\u09ed\u017f\3\2\2"+
		"\2\u09ee\u09f0\5\u0186\u00c4\2\u09ef\u09ee\3\2\2\2\u09ef\u09f0\3\2\2\2"+
		"\u09f0\u09f1\3\2\2\2\u09f1\u09f2\7(\2\2\u09f2\u09f3\5\u0192\u00ca\2\u09f3"+
		"\u09f4\5\u018c\u00c7\2\u09f4\u0181\3\2\2\2\u09f5\u09f7\7-\2\2\u09f6\u09f8"+
		"\5\u0186\u00c4\2\u09f7\u09f6\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\3"+
		"\2\2\2\u09f9\u09fa\7(\2\2\u09fa\u09fb\5\u0192\u00ca\2\u09fb\u0183\3\2"+
		"\2\2\u09fc\u09fd\7E\2\2\u09fd\u09fe\7(\2\2\u09fe\u09ff\5\u0192\u00ca\2"+
		"\u09ff\u0185\3\2\2\2\u0a00\u0a03\7$\2\2\u0a01\u0a03\5\u0188\u00c5\2\u0a02"+
		"\u0a00\3\2\2\2\u0a02\u0a01\3\2\2\2\u0a03\u0187\3\2\2\2\u0a04\u0a06\5\u018a"+
		"\u00c6\2\u0a05\u0a07\7\64\2\2\u0a06\u0a05\3\2\2\2\u0a06\u0a07\3\2\2\2"+
		"\u0a07\u0189\3\2\2\2\u0a08\u0a09\t*\2\2\u0a09\u018b\3\2\2\2\u0a0a\u0a0d"+
		"\5\u018e\u00c8\2\u0a0b\u0a0d\5\u0190\u00c9\2\u0a0c\u0a0a\3\2\2\2\u0a0c"+
		"\u0a0b\3\2\2\2\u0a0d\u018d\3\2\2\2\u0a0e\u0a0f\7\62\2\2\u0a0f\u0a19\5"+
		"\u01a0\u00d1\2\u0a10\u0a16\7H\2\2\u0a11\u0a12\7\u013d\2\2\u0a12\u0a13"+
		"\5\u0198\u00cd\2\u0a13\u0a14\7\u013e\2\2\u0a14\u0a17\3\2\2\2\u0a15\u0a17"+
		"\5\u0198\u00cd\2\u0a16\u0a11\3\2\2\2\u0a16\u0a15\3\2\2\2\u0a17\u0a19\3"+
		"\2\2\2\u0a18\u0a0e\3\2\2\2\u0a18\u0a10\3\2\2\2\u0a19\u018f\3\2\2\2\u0a1a"+
		"\u0a1b\7H\2\2\u0a1b\u0a1c\7\u013d\2\2\u0a1c\u0a1d\5\u01e2\u00f2\2\u0a1d"+
		"\u0a1e\7\u013e\2\2\u0a1e\u0191\3\2\2\2\u0a1f\u0a22\5\u01cc\u00e7\2\u0a20"+
		"\u0a22\5\u019c\u00cf\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a20\3\2\2\2\u0a22\u0a24"+
		"\3\2\2\2\u0a23\u0a25\7\u0143\2\2\u0a24\u0a23\3\2\2\2\u0a24\u0a25\3\2\2"+
		"\2\u0a25\u0a27\3\2\2\2\u0a26\u0a28\5\u0178\u00bd\2\u0a27\u0a26\3\2\2\2"+
		"\u0a27\u0a28\3\2\2\2\u0a28\u0a34\3\2\2\2\u0a29\u0a2b\5\u0126\u0094\2\u0a2a"+
		"\u0a2c\5\u0178\u00bd\2\u0a2b\u0a2a\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a34"+
		"\3\2\2\2\u0a2d\u0a2e\7\u013d\2\2\u0a2e\u0a2f\5\u0192\u00ca\2\u0a2f\u0a31"+
		"\7\u013e\2\2\u0a30\u0a32\5\u0178\u00bd\2\u0a31\u0a30\3\2\2\2\u0a31\u0a32"+
		"\3\2\2\2\u0a32\u0a34\3\2\2\2\u0a33\u0a21\3\2\2\2\u0a33\u0a29\3\2\2\2\u0a33"+
		"\u0a2d\3\2\2\2\u0a34\u0193\3\2\2\2\u0a35\u0a36\5\u00a6T\2\u0a36\u0195"+
		"\3\2\2\2\u0a37\u0a38\5\u01ce\u00e8\2\u0a38\u0197\3\2\2\2\u0a39\u0a3e\5"+
		"\u0196\u00cc\2\u0a3a\u0a3b\7\u0136\2\2\u0a3b\u0a3d\5\u0196\u00cc\2\u0a3c"+
		"\u0a3a\3\2\2\2\u0a3d\u0a40\3\2\2\2\u0a3e\u0a3c\3\2\2\2\u0a3e\u0a3f\3\2"+
		"\2\2\u0a3f\u0199\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a41\u0a42\5\u00a6T\2\u0a42"+
		"\u019b\3\2\2\2\u0a43\u0a4d\5\u01e8\u00f5\2\u0a44\u0a4a\7\u009f\2\2\u0a45"+
		"\u0a46\7\u013d\2\2\u0a46\u0a47\5\6\4\2\u0a47\u0a48\7\u013e\2\2\u0a48\u0a4b"+
		"\3\2\2\2\u0a49\u0a4b\5\u0226\u0114\2\u0a4a\u0a45\3\2\2\2\u0a4a\u0a49\3"+
		"\2\2\2\u0a4b\u0a4d\3\2\2\2\u0a4c\u0a43\3\2\2\2\u0a4c\u0a44\3\2\2\2\u0a4d"+
		"\u019d\3\2\2\2\u0a4e\u0a4f\7L\2\2\u0a4f\u0a50\5\u01a0\u00d1\2\u0a50\u019f"+
		"\3\2\2\2\u0a51\u0a52\5\u0122\u0092\2\u0a52\u01a1\3\2\2\2\u0a53\u0a54\7"+
		"\37\2\2\u0a54\u0a55\7X\2\2\u0a55\u0a56\5\u01a4\u00d3\2\u0a56\u01a3\3\2"+
		"\2\2\u0a57\u0a5c\5\u01a6\u00d4\2\u0a58\u0a59\7\u0136\2\2\u0a59\u0a5b\5"+
		"\u01a6\u00d4\2\u0a5a\u0a58\3\2\2\2\u0a5b\u0a5e\3\2\2\2\u0a5c\u0a5a\3\2"+
		"\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u01a5\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5f"+
		"\u0a64\5\u01ac\u00d7\2\u0a60\u0a64\5\u01ae\u00d8\2\u0a61\u0a64\5\u01b0"+
		"\u00d9\2\u0a62\u0a64\5\u01a8\u00d5\2\u0a63\u0a5f\3\2\2\2\u0a63\u0a60\3"+
		"\2\2\2\u0a63\u0a61\3\2\2\2\u0a63\u0a62\3\2\2\2\u0a64\u01a7\3\2\2\2\u0a65"+
		"\u0a6b\5\u016a\u00b6\2\u0a66\u0a67\7\u013d\2\2\u0a67\u0a68\5\u01b4\u00db"+
		"\2\u0a68\u0a69\7\u013e\2\2\u0a69\u0a6b\3\2\2\2\u0a6a\u0a65\3\2\2\2\u0a6a"+
		"\u0a66\3\2\2\2\u0a6b\u01a9\3\2\2\2\u0a6c\u0a71\5\u01a8\u00d5\2\u0a6d\u0a6e"+
		"\7\u0136\2\2\u0a6e\u0a70\5\u01a8\u00d5\2\u0a6f\u0a6d\3\2\2\2\u0a70\u0a73"+
		"\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u01ab\3\2\2\2\u0a73"+
		"\u0a71\3\2\2\2\u0a74\u0a75\7\u00d6\2\2\u0a75\u0a76\7\u013d\2\2\u0a76\u0a77"+
		"\5\u01aa\u00d6\2\u0a77\u0a78\7\u013e\2\2\u0a78\u01ad\3\2\2\2\u0a79\u0a7a"+
		"\7i\2\2\u0a7a\u0a7b\7\u013d\2\2\u0a7b\u0a7c\5\u01aa\u00d6\2\u0a7c\u0a7d"+
		"\7\u013e\2\2\u0a7d\u01af\3\2\2\2\u0a7e\u0a7f\7\u013d\2\2\u0a7f\u0a80\7"+
		"\u013e\2\2\u0a80\u01b1\3\2\2\2\u0a81\u0a82\7 \2\2\u0a82\u0a83\5\u0150"+
		"\u00a9\2\u0a83\u01b3\3\2\2\2\u0a84\u0a89\5\u016a\u00b6\2\u0a85\u0a86\7"+
		"\u0136\2\2\u0a86\u0a88\5\u016a\u00b6\2\u0a87\u0a85\3\2\2\2\u0a88\u0a8b"+
		"\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u01b5\3\2\2\2\u0a8b"+
		"\u0a89\3\2\2\2\u0a8c\u0a8e\7M\2\2\u0a8d\u0a8f\7\u00c9\2\2\u0a8e\u0a8d"+
		"\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a95\5\u01b8\u00dd"+
		"\2\u0a91\u0a92\7\u0136\2\2\u0a92\u0a94\5\u01b8\u00dd\2\u0a93\u0a91\3\2"+
		"\2\2\u0a94\u0a97\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96"+
		"\u01b7\3\2\2\2\u0a97\u0a95\3\2\2\2\u0a98\u0a9d\5\u00a6T\2\u0a99\u0a9a"+
		"\7\u013d\2\2\u0a9a\u0a9b\5\u0198\u00cd\2\u0a9b\u0a9c\7\u013e\2\2\u0a9c"+
		"\u0a9e\3\2\2\2\u0a9d\u0a99\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\3\2"+
		"\2\2\u0a9f\u0aa0\7\3\2\2\u0aa0\u0aa5\7\u013d\2\2\u0aa1\u0aa6\5\6\4\2\u0aa2"+
		"\u0aa6\5<\37\2\u0aa3\u0aa6\5B\"\2\u0aa4\u0aa6\5T+\2\u0aa5\u0aa1\3\2\2"+
		"\2\u0aa5\u0aa2\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa5\u0aa4\3\2\2\2\u0aa6\u0aa7"+
		"\3\2\2\2\u0aa7\u0aa8\7\u013e\2\2\u0aa8\u01b9\3\2\2\2\u0aa9\u0aaa\5\u01bc"+
		"\u00df\2\u0aaa\u01bb\3\2\2\2\u0aab\u0aae\5\u01be\u00e0\2\u0aac\u0aae\5"+
		"\u017a\u00be\2\u0aad\u0aab\3\2\2\2\u0aad\u0aac\3\2\2\2\u0aae\u01bd\3\2"+
		"\2\2\u0aaf\u0ab8\5\u01c2\u00e2\2\u0ab0\u0ab1\5\u017a\u00be\2\u0ab1\u0ab3"+
		"\t+\2\2\u0ab2\u0ab4\t,\2\2\u0ab3\u0ab2\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4"+
		"\u0ab5\3\2\2\2\u0ab5\u0ab6\5\u01c0\u00e1\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0aaf"+
		"\3\2\2\2\u0ab7\u0ab0\3\2\2\2\u0ab8\u0ac0\3\2\2\2\u0ab9\u0abb\t+\2\2\u0aba"+
		"\u0abc\t,\2\2\u0abb\u0aba\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0abd\3\2"+
		"\2\2\u0abd\u0abf\5\u01c0\u00e1\2\u0abe\u0ab9\3\2\2\2\u0abf\u0ac2\3\2\2"+
		"\2\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1\u01bf\3\2\2\2\u0ac2\u0ac0"+
		"\3\2\2\2\u0ac3\u0ac6\5\u01c2\u00e2\2\u0ac4\u0ac6\5\u017a\u00be\2\u0ac5"+
		"\u0ac3\3\2\2\2\u0ac5\u0ac4\3\2\2\2\u0ac6\u01c1\3\2\2\2\u0ac7\u0ad0\5\u01c6"+
		"\u00e4\2\u0ac8\u0ac9\5\u017a\u00be\2\u0ac9\u0acb\7%\2\2\u0aca\u0acc\t"+
		",\2\2\u0acb\u0aca\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd"+
		"\u0ace\5\u01c4\u00e3\2\u0ace\u0ad0\3\2\2\2\u0acf\u0ac7\3\2\2\2\u0acf\u0ac8"+
		"\3\2\2\2\u0ad0\u0ad8\3\2\2\2\u0ad1\u0ad3\7%\2\2\u0ad2\u0ad4\t,\2\2\u0ad3"+
		"\u0ad2\3\2\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad5\u0ad7\5\u01c4"+
		"\u00e3\2\u0ad6\u0ad1\3\2\2\2\u0ad7\u0ada\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad8"+
		"\u0ad9\3\2\2\2\u0ad9\u01c3\3\2\2\2\u0ada\u0ad8\3\2\2\2\u0adb\u0adf\5\u01c6"+
		"\u00e4\2\u0adc\u0adf\5\u017a\u00be\2\u0add\u0adf\5\u0126\u0094\2\u0ade"+
		"\u0adb\3\2\2\2\u0ade\u0adc\3\2\2\2\u0ade\u0add\3\2\2\2\u0adf\u01c5\3\2"+
		"\2\2\u0ae0\u0ae6\5\u01c8\u00e5\2\u0ae1\u0ae2\7\u013d\2\2\u0ae2\u0ae3\5"+
		"\u01be\u00e0\2\u0ae3\u0ae4\7\u013e\2\2\u0ae4\u0ae6\3\2\2\2\u0ae5\u0ae0"+
		"\3\2\2\2\u0ae5\u0ae1\3\2\2\2\u0ae6\u01c7\3\2\2\2\u0ae7\u0ae9\5\u01d2\u00ea"+
		"\2\u0ae8\u0aea\5\u01ca\u00e6\2\u0ae9\u0ae8\3\2\2\2\u0ae9\u0aea\3\2\2\2"+
		"\u0aea\u01c9\3\2\2\2\u0aeb\u0aec\7@\2\2\u0aec\u0aed\5\u01cc\u00e7\2\u0aed"+
		"\u01cb\3\2\2\2\u0aee\u0af1\5\u01ce\u00e8\2\u0aef\u0af1\5\u00a6T\2\u0af0"+
		"\u0aee\3\2\2\2\u0af0\u0aef\3\2\2\2\u0af1\u01cd\3\2\2\2\u0af2\u0afc\5\u00a6"+
		"T\2\u0af3\u0af6\7\u0147\2\2\u0af4\u0af7\5\u00a6T\2\u0af5\u0af7\7\u0143"+
		"\2\2\u0af6\u0af4\3\2\2\2\u0af6\u0af5\3\2\2\2\u0af7\u0afa\3\2\2\2\u0af8"+
		"\u0af9\7\u0147\2\2\u0af9\u0afb\5\u00a6T\2\u0afa\u0af8\3\2\2\2\u0afa\u0afb"+
		"\3\2\2\2\u0afb\u0afd\3\2\2\2\u0afc\u0af3\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd"+
		"\u01cf\3\2\2\2\u0afe\u0b03\5\u01ce\u00e8\2\u0aff\u0b00\7\u0136\2\2\u0b00"+
		"\u0b02\5\u01ce\u00e8\2\u0b01\u0aff\3\2\2\2\u0b02\u0b05\3\2\2\2\u0b03\u0b01"+
		"\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u01d1\3\2\2\2\u0b05\u0b03\3\2\2\2\u0b06"+
		"\u0b08\7=\2\2\u0b07\u0b09\5\u01dc\u00ef\2\u0b08\u0b07\3\2\2\2\u0b08\u0b09"+
		"\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u0b0c\5\u01d4\u00eb\2\u0b0b\u0b0d\5"+
		"\u016e\u00b8\2\u0b0c\u0b0b\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b11\3\2"+
		"\2\2\u0b0e\u0b10\5\u0170\u00b9\2\u0b0f\u0b0e\3\2\2\2\u0b10\u0b13\3\2\2"+
		"\2\u0b11\u0b0f\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b16\3\2\2\2\u0b13\u0b11"+
		"\3\2\2\2\u0b14\u0b16\5\u0126\u0094\2\u0b15\u0b06\3\2\2\2\u0b15\u0b14\3"+
		"\2\2\2\u0b16\u01d3\3\2\2\2\u0b17\u0b1c\5\u01d6\u00ec\2\u0b18\u0b19\7\u0136"+
		"\2\2\u0b19\u0b1b\5\u01d6\u00ec\2\u0b1a\u0b18\3\2\2\2\u0b1b\u0b1e\3\2\2"+
		"\2\u0b1c\u0b1a\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u01d5\3\2\2\2\u0b1e\u0b1c"+
		"\3\2\2\2\u0b1f\u0b22\5\u01d8\u00ed\2\u0b20\u0b22\5\u01da\u00ee\2\u0b21"+
		"\u0b1f\3\2\2\2\u0b21\u0b20\3\2\2\2\u0b22\u01d7\3\2\2\2\u0b23\u0b25\5\u0122"+
		"\u0092\2\u0b24\u0b26\5\u01e0\u00f1\2\u0b25\u0b24\3\2\2\2\u0b25\u0b26\3"+
		"\2\2\2\u0b26\u01d9\3\2\2\2\u0b27\u0b28\7\u015e\2\2\u0b28\u0b2a\7\u0147"+
		"\2\2\u0b29\u0b27\3\2\2\2\u0b29\u0b2a\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b"+
		"\u0b2c\7\u0143\2\2\u0b2c\u01db\3\2\2\2\u0b2d\u0b30\7\25\2\2\u0b2e\u0b2f"+
		"\7\62\2\2\u0b2f\u0b31\5\u01a0\u00d1\2\u0b30\u0b2e\3\2\2\2\u0b30\u0b31"+
		"\3\2\2\2\u0b31\u0b34\3\2\2\2\u0b32\u0b34\7\4\2\2\u0b33\u0b2d\3\2\2\2\u0b33"+
		"\u0b32\3\2\2\2\u0b34\u01dd\3\2\2\2\u0b35\u0b3b\5\u00a6T\2\u0b36\u0b39"+
		"\7\u0147\2\2\u0b37\u0b3a\5\u00a6T\2\u0b38\u0b3a\7\u0143\2\2\u0b39\u0b37"+
		"\3\2\2\2\u0b39\u0b38\3\2\2\2\u0b3a\u0b3c\3\2\2\2\u0b3b\u0b36\3\2\2\2\u0b3b"+
		"\u0b3c\3\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b42\5\u00e6t\2\u0b3e\u0b3f"+
		"\7\u0147\2\2\u0b3f\u0b41\5\u01de\u00f0\2\u0b40\u0b3e\3\2\2\2\u0b41\u0b44"+
		"\3\2\2\2\u0b42\u0b40\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u01df\3\2\2\2\u0b44"+
		"\u0b42\3\2\2\2\u0b45\u0b47\7\3\2\2\u0b46\u0b45\3\2\2\2\u0b46\u0b47\3\2"+
		"\2\2\u0b47\u0b4b\3\2\2\2\u0b48\u0b4c\5\u00a6T\2\u0b49\u0b4c\5\u015c\u00af"+
		"\2\u0b4a\u0b4c\7/\2\2\u0b4b\u0b48\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4b\u0b4a"+
		"\3\2\2\2\u0b4c\u01e1\3\2\2\2\u0b4d\u0b52\5\u01de\u00f0\2\u0b4e\u0b4f\7"+
		"\u0136\2\2\u0b4f\u0b51\5\u01de\u00f0\2\u0b50\u0b4e\3\2\2\2\u0b51\u0b54"+
		"\3\2\2\2\u0b52\u0b50\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u01e3\3\2\2\2\u0b54"+
		"\u0b52\3\2\2\2\u0b55\u0b56\5\u01ea\u00f6\2\u0b56\u01e5\3\2\2\2\u0b57\u0b58"+
		"\5\u01ea\u00f6\2\u0b58\u01e7\3\2\2\2\u0b59\u0b5a\5\u01ea\u00f6\2\u0b5a"+
		"\u01e9\3\2\2\2\u0b5b\u0b5c\7\u013d\2\2\u0b5c\u0b5d\5\6\4\2\u0b5d\u0b5e"+
		"\7\u013e\2\2\u0b5e\u01eb\3\2\2\2\u0b5f\u0b69\5\u01f4\u00fb\2\u0b60\u0b69"+
		"\5\u01f8\u00fd\2\u0b61\u0b69\5\u01fa\u00fe\2\u0b62\u0b69\5\u01fe\u0100"+
		"\2\u0b63\u0b69\5\u0204\u0103\2\u0b64\u0b69\5\u020c\u0107\2\u0b65\u0b69"+
		"\5\u0216\u010c\2\u0b66\u0b69\5\u021a\u010e\2\u0b67\u0b69\5\u01ee\u00f8"+
		"\2\u0b68\u0b5f\3\2\2\2\u0b68\u0b60\3\2\2\2\u0b68\u0b61\3\2\2\2\u0b68\u0b62"+
		"\3\2\2\2\u0b68\u0b63\3\2\2\2\u0b68\u0b64\3\2\2\2\u0b68\u0b65\3\2\2\2\u0b68"+
		"\u0b66\3\2\2\2\u0b68\u0b67\3\2\2\2\u0b69\u01ed\3\2\2\2\u0b6a\u0b6b\5\u016a"+
		"\u00b6\2\u0b6b\u0b6c\5\u01f0\u00f9\2\u0b6c\u0b6d\5\u016a\u00b6\2\u0b6d"+
		"\u01ef\3\2\2\2\u0b6e\u0b71\t-\2\2\u0b6f\u0b71\5\u01f2\u00fa\2\u0b70\u0b6e"+
		"\3\2\2\2\u0b70\u0b6f\3\2\2\2\u0b71\u01f1\3\2\2\2\u0b72\u0b73\t.\2\2\u0b73"+
		"\u01f3\3\2\2\2\u0b74\u0b75\5\u016a\u00b6\2\u0b75\u0b76\5\u01f6\u00fc\2"+
		"\u0b76\u0b77\5\u016a\u00b6\2\u0b77\u01f5\3\2\2\2\u0b78\u0b79\t/\2\2\u0b79"+
		"\u01f7\3\2\2\2\u0b7a\u0b7b\5\u016a\u00b6\2\u0b7b\u0b7c\7\'\2\2\u0b7c\u0b7d"+
		"\7\u00b8\2\2\u0b7d\u0b7e\7\u013d\2\2\u0b7e\u0b7f\5\u00be`\2\u0b7f\u0b80"+
		"\7\u013e\2\2\u0b80\u01f9\3\2\2\2\u0b81\u0b82\5\u016a\u00b6\2\u0b82\u0b83"+
		"\5\u01fc\u00ff\2\u0b83\u01fb\3\2\2\2\u0b84\u0b86\7.\2\2\u0b85\u0b84\3"+
		"\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0b87\3\2\2\2\u0b87\u0b89\7W\2\2\u0b88"+
		"\u0b8a\t\60\2\2\u0b89\u0b88\3\2\2\2\u0b89\u0b8a\3\2\2\2\u0b8a\u0b8b\3"+
		"\2\2\2\u0b8b\u0b8c\5\u016a\u00b6\2\u0b8c\u0b8d\7\6\2\2\u0b8d\u0b8e\5\u016a"+
		"\u00b6\2\u0b8e\u01fd\3\2\2\2\u0b8f\u0b92\5\u012a\u0096\2\u0b90\u0b92\5"+
		"\u0202\u0102\2\u0b91\u0b8f\3\2\2\2\u0b91\u0b90\3\2\2\2\u0b92\u0b94\3\2"+
		"\2\2\u0b93\u0b95\7.\2\2\u0b94\u0b93\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95"+
		"\u0b96\3\2\2\2\u0b96\u0b97\7#\2\2\u0b97\u0b98\5\u0200\u0101\2\u0b98\u01ff"+
		"\3\2\2\2\u0b99\u0b9d\5\u01e8\u00f5\2\u0b9a\u0b9d\5\u0202\u0102\2\u0b9b"+
		"\u0b9d\5\u0126\u0094\2\u0b9c\u0b99\3\2\2\2\u0b9c\u0b9a\3\2\2\2\u0b9c\u0b9b"+
		"\3\2\2\2\u0b9d\u0201\3\2\2\2\u0b9e\u0ba1\7\u013d\2\2\u0b9f\u0ba2\5\u0130"+
		"\u0099\2\u0ba0\u0ba2\5\u0202\u0102\2\u0ba1\u0b9f\3\2\2\2\u0ba1\u0ba0\3"+
		"\2\2\2\u0ba2\u0baa\3\2\2\2\u0ba3\u0ba6\7\u0136\2\2\u0ba4\u0ba7\5\u0130"+
		"\u0099\2\u0ba5\u0ba7\5\u0202\u0102\2\u0ba6\u0ba4\3\2\2\2\u0ba6\u0ba5\3"+
		"\2\2\2\u0ba7\u0ba9\3\2\2\2\u0ba8\u0ba3\3\2\2\2\u0ba9\u0bac\3\2\2\2\u0baa"+
		"\u0ba8\3\2\2\2\u0baa\u0bab\3\2\2\2\u0bab\u0bad\3\2\2\2\u0bac\u0baa\3\2"+
		"\2\2\u0bad\u0bae\7\u013e\2\2\u0bae\u0203\3\2\2\2\u0baf\u0bb0\5\u016a\u00b6"+
		"\2\u0bb0\u0bb1\5\u0206\u0104\2\u0bb1\u0bb4\5\u016a\u00b6\2\u0bb2\u0bb3"+
		"\7y\2\2\u0bb3\u0bb5\7\u0162\2\2\u0bb4\u0bb2\3\2\2\2\u0bb4\u0bb5\3\2\2"+
		"\2\u0bb5\u0205\3\2\2\2\u0bb6\u0bb8\7.\2\2\u0bb7\u0bb6\3\2\2\2\u0bb7\u0bb8"+
		"\3\2\2\2\u0bb8\u0bb9\3\2\2\2\u0bb9\u0bbc\5\u0208\u0105\2\u0bba\u0bbc\5"+
		"\u020a\u0106\2\u0bbb\u0bb7\3\2\2\2\u0bbb\u0bba\3\2\2\2\u0bbc\u0207\3\2"+
		"\2\2\u0bbd\u0bc1\t\61\2\2\u0bbe\u0bbf\7\u00df\2\2\u0bbf\u0bc1\7\u00f2"+
		"\2\2\u0bc0\u0bbd\3\2\2\2\u0bc0\u0bbe\3\2\2\2\u0bc1\u0209\3\2\2\2\u0bc2"+
		"\u0bc3\t\62\2\2\u0bc3\u020b\3\2\2\2\u0bc4\u0bc5\5\u016a\u00b6\2\u0bc5"+
		"\u0bc7\7\'\2\2\u0bc6\u0bc8\7.\2\2\u0bc7\u0bc6\3\2\2\2\u0bc7\u0bc8\3\2"+
		"\2\2\u0bc8\u0bc9\3\2\2\2\u0bc9\u0bca\7/\2\2\u0bca\u020d\3\2\2\2\u0bcb"+
		"\u0bce\5\u012a\u0096\2\u0bcc\u0bcf\5\u01f6\u00fc\2\u0bcd\u0bcf\5\u01f0"+
		"\u00f9\2\u0bce\u0bcc\3\2\2\2\u0bce\u0bcd\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0"+
		"\u0bd1\5\u0210\u0109\2\u0bd1\u0bd2\5\u01e8\u00f5\2\u0bd2\u020f\3\2\2\2"+
		"\u0bd3\u0bd6\5\u0212\u010a\2\u0bd4\u0bd6\5\u0214\u010b\2\u0bd5\u0bd3\3"+
		"\2\2\2\u0bd5\u0bd4\3\2\2\2\u0bd6\u0211\3\2\2\2\u0bd7\u0bd8\7\4\2\2\u0bd8"+
		"\u0213\3\2\2\2\u0bd9\u0bda\t\63\2\2\u0bda\u0215\3\2\2\2\u0bdb\u0bdd\7"+
		".\2\2\u0bdc\u0bdb\3\2\2\2\u0bdc\u0bdd\3\2\2\2\u0bdd\u0bde\3\2\2\2\u0bde"+
		"\u0bdf\7}\2\2\u0bdf\u0be0\5\u01e8\u00f5\2\u0be0\u0217\3\2\2\2\u0be1\u0be2"+
		"\7F\2\2\u0be2\u0be3\5\u01e8\u00f5\2\u0be3\u0219\3\2\2\2\u0be4\u0be5\5"+
		"\u016a\u00b6\2\u0be5\u0be7\7\'\2\2\u0be6\u0be8\7.\2\2\u0be7\u0be6\3\2"+
		"\2\2\u0be7\u0be8\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bea\7\25\2\2\u0bea"+
		"\u0beb\7\35\2\2\u0beb\u0bec\5\u016a\u00b6\2\u0bec\u021b\3\2\2\2\u0bed"+
		"\u0bf0\5\u021e\u0110\2\u0bee\u0bf0\7\u00da\2\2\u0bef\u0bed\3\2\2\2\u0bef"+
		"\u0bee\3\2\2\2\u0bf0\u021d\3\2\2\2\u0bf1\u0bf2\t\64\2\2\u0bf2\u021f\3"+
		"\2\2\2\u0bf3\u0bf4\t\65\2\2\u0bf4\u0221\3\2\2\2\u0bf5\u0bf6\7\33\2\2\u0bf6"+
		"\u0bf8\t\66\2\2\u0bf7\u0bf9\5\u00f4{\2\u0bf8\u0bf7\3\2\2\2\u0bf8\u0bf9"+
		"\3\2\2\2\u0bf9\u0bfa\3\2\2\2\u0bfa\u0bfb\t\67\2\2\u0bfb\u0bfc\7\u00ba"+
		"\2\2\u0bfc\u0223\3\2\2\2\u0bfd\u0c05\7\u0084\2\2\u0bfe\u0c06\7G\2\2\u0bff"+
		"\u0c00\7\u00b3\2\2\u0c00\u0c01\7\u009d\2\2\u0c01\u0c06\7G\2\2\u0c02\u0c06"+
		"\7\u00de\2\2\u0c03\u0c04\7\u009d\2\2\u0c04\u0c06\7\u00de\2\2\u0c05\u0bfe"+
		"\3\2\2\2\u0c05\u0bff\3\2\2\2\u0c05\u0c02\3\2\2\2\u0c05\u0c03\3\2\2\2\u0c06"+
		"\u0c09\3\2\2\2\u0c07\u0c08\7\u00b8\2\2\u0c08\u0c0a\5\u01d0\u00e9\2\u0c09"+
		"\u0c07\3\2\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0225\3\2\2\2\u0c0b\u0c0c\5\u022a"+
		"\u0116\2\u0c0c\u0c0e\7\u013d\2\2\u0c0d\u0c0f\5\u022c\u0117\2\u0c0e\u0c0d"+
		"\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c11\7\u013e\2"+
		"\2\u0c11\u0227\3\2\2\2\u0c12\u0c13\t8\2\2\u0c13\u0229\3\2\2\2\u0c14\u0c17"+
		"\5\u01ce\u00e8\2\u0c15\u0c17\5\u0228\u0115\2\u0c16\u0c14\3\2\2\2\u0c16"+
		"\u0c15\3\2\2\2\u0c17\u022b\3\2\2\2\u0c18\u0c1d\5\u022e\u0118\2\u0c19\u0c1a"+
		"\7\u0136\2\2\u0c1a\u0c1c\5\u022e\u0118\2\u0c1b\u0c19\3\2\2\2\u0c1c\u0c1f"+
		"\3\2\2\2\u0c1d\u0c1b\3\2\2\2\u0c1d\u0c1e\3\2\2\2\u0c1e\u022d\3\2\2\2\u0c1f"+
		"\u0c1d\3\2\2\2\u0c20\u0c22\7\u00fb\2\2\u0c21\u0c20\3\2\2\2\u0c21\u0c22"+
		"\3\2\2\2\u0c22\u0c23\3\2\2\2\u0c23\u0c29\5\u0122\u0092\2\u0c24\u0c25\5"+
		"\u00a6T\2\u0c25\u0c26\7\u0132\2\2\u0c26\u0c27\5\u0122\u0092\2\u0c27\u0c29"+
		"\3\2\2\2\u0c28\u0c21\3\2\2\2\u0c28\u0c24\3\2\2\2\u0c29\u022f\3\2\2\2\u0c2a"+
		"\u0c2b\7\u0101\2\2\u0c2b\u0c2c\5\u00a6T\2\u0c2c\u0c2d\7\3\2\2\u0c2d\u0c2e"+
		"\7\u013d\2\2\u0c2e\u0c2f\5\u0232\u011a\2\u0c2f\u0c30\7\u013e\2\2\u0c30"+
		"\u0231\3\2\2\2\u0c31\u0c33\5\u00a6T\2\u0c32\u0c31\3\2\2\2\u0c32\u0c33"+
		"\3\2\2\2\u0c33\u0c36\3\2\2\2\u0c34\u0c35\7\u00be\2\2\u0c35\u0c37\7X\2"+
		"\2\u0c36\u0c34\3\2\2\2\u0c36\u0c37\3\2\2\2\u0c37\u0c39\3\2\2\2\u0c38\u0c3a"+
		"\5\u023a\u011e\2\u0c39\u0c38\3\2\2\2\u0c39\u0c3a\3\2\2\2\u0c3a\u0c3b\3"+
		"\2\2\2\u0c3b\u0c3c\5\u0234\u011b\2\u0c3c\u0233\3\2\2\2\u0c3d\u0c3f\t9"+
		"\2\2\u0c3e\u0c3d\3\2\2\2\u0c3e\u0c3f\3\2\2\2\u0c3f\u0c41\3\2\2\2\u0c40"+
		"\u0c42\7W\2\2\u0c41\u0c40\3\2\2\2\u0c41\u0c42\3\2\2\2\u0c42\u0c43\3\2"+
		"\2\2\u0c43\u0c46\5\u0236\u011c\2\u0c44\u0c45\7\6\2\2\u0c45\u0c47\5\u0236"+
		"\u011c\2\u0c46\u0c44\3\2\2\2\u0c46\u0c47\3\2\2\2\u0c47\u0235\3\2\2\2\u0c48"+
		"\u0c4d\7\u00f4\2\2\u0c49\u0c4a\5\u00eav\2\u0c4a\u0c4b\t:\2\2\u0c4b\u0c4d"+
		"\3\2\2\2\u0c4c\u0c48\3\2\2\2\u0c4c\u0c49\3\2\2\2\u0c4d\u0c51\3\2\2\2\u0c4e"+
		"\u0c4f\7\21\2\2\u0c4f\u0c51\7;\2\2\u0c50\u0c4c\3\2\2\2\u0c50\u0c4e\3\2"+
		"\2\2\u0c51\u0237\3\2\2\2\u0c52\u0c53\7\61\2\2\u0c53\u0c54\5\u012a\u0096"+
		"\2\u0c54\u0239\3\2\2\2\u0c55\u0c56\7\66\2\2\u0c56\u0c57\7X\2\2\u0c57\u0c58"+
		"\5\u023c\u011f\2\u0c58\u023b\3\2\2\2\u0c59\u0c5e\5\u023e\u0120\2\u0c5a"+
		"\u0c5b\7\u0136\2\2\u0c5b\u0c5d\5\u023e\u0120\2\u0c5c\u0c5a\3\2\2\2\u0c5d"+
		"\u0c60\3\2\2\2\u0c5e\u0c5c\3\2\2\2\u0c5e\u0c5f\3\2\2\2\u0c5f\u023d\3\2"+
		"\2\2\u0c60\u0c5e\3\2\2\2\u0c61\u0c63\5\u0122\u0092\2\u0c62\u0c64\5\u0240"+
		"\u0121\2\u0c63\u0c62\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c66\3\2\2\2\u0c65"+
		"\u0c67\5\u0244\u0123\2\u0c66\u0c65\3\2\2\2\u0c66\u0c67\3\2\2\2\u0c67\u023f"+
		"\3\2\2\2\u0c68\u0c6c\t;\2\2\u0c69\u0c6a\7H\2\2\u0c6a\u0c6c\t<\2\2\u0c6b"+
		"\u0c68\3\2\2\2\u0c6b\u0c69\3\2\2\2\u0c6c\u0241\3\2\2\2\u0c6d\u0c70\7,"+
		"\2\2\u0c6e\u0c71\5\u012a\u0096\2\u0c6f\u0c71\7\4\2\2\u0c70\u0c6e\3\2\2"+
		"\2\u0c70\u0c6f\3\2\2\2\u0c71\u0243\3\2\2\2\u0c72\u0c73\7\u00b7\2\2\u0c73"+
		"\u0c77\7\u0082\2\2\u0c74\u0c75\7\u00b7\2\2\u0c75\u0c77\7\u009e\2\2\u0c76"+
		"\u0c72\3\2\2\2\u0c76\u0c74\3\2\2\2\u0c77\u0245\3\2\2\2\u01bc\u024b\u0250"+
		"\u025b\u025e\u0262\u0267\u026a\u026f\u027b\u0282\u0286\u028d\u0290\u0294"+
		"\u0297\u029d\u02a2\u02a5\u02a8\u02ab\u02b0\u02b7\u02bd\u02c4\u02ca\u02cf"+
		"\u02d2\u02d5\u02d9\u02de\u02e3\u02eb\u02ee\u02f1\u02f5\u02f9\u0300\u0305"+
		"\u030b\u0310\u0318\u031c\u0320\u032b\u0330\u0337\u033c\u033e\u0348\u034c"+
		"\u0357\u035c\u035e\u0362\u036a\u036e\u037e\u0382\u0386\u038e\u0392\u0399"+
		"\u03a0\u03a3\u03a7\u03ab\u03ae\u03b1\u03b9\u03be\u03c1\u03c4\u03cc\u03d1"+
		"\u03d4\u03d7\u03db\u03e2\u03ec\u03f3\u03ff\u0404\u0408\u040b\u040f\u0412"+
		"\u0415\u0418\u041f\u0423\u0427\u042a\u042f\u0435\u0438\u043f\u0444\u0447"+
		"\u044a\u044f\u0452\u0455\u045a\u0460\u0464\u046e\u0471\u0477\u047a\u0480"+
		"\u0485\u0488\u048c\u0492\u0495\u049b\u04a1\u04a5\u04a8\u04ac\u04af\u04b2"+
		"\u04b8\u04ba\u04c0\u04c7\u04cc\u04d4\u04db\u04e4\u04e6\u04ea\u04ed\u04f4"+
		"\u04fd\u04ff\u0505\u0508\u0512\u0515\u051b\u052b\u0533\u0537\u053e\u0544"+
		"\u054a\u0551\u0555\u055d\u0567\u056d\u057c\u0582\u0589\u058d\u0593\u0598"+
		"\u05a2\u05a5\u05b0\u05b7\u05bb\u05c4\u05ca\u05cd\u05d1\u05d8\u05eb\u05f1"+
		"\u05fb\u05ff\u0604\u0607\u060b\u060f\u0613\u0617\u061e\u0623\u0626\u0635"+
		"\u0642\u0646\u0650\u0654\u0659\u065e\u0664\u0668\u066e\u0672\u0676\u067b"+
		"\u067f\u0684\u0688\u068c\u0692\u0696\u069a\u069e\u06a3\u06a6\u06a9\u06ae"+
		"\u06b3\u06ba\u06c0\u06c6\u06cc\u06d0\u06d4\u06d7\u06dc\u06f0\u06f5\u0706"+
		"\u0709\u070e\u0712\u0718\u071c\u0721\u0726\u072a\u072d\u0738\u073d\u0741"+
		"\u0747\u074d\u0752\u0756\u0758\u075c\u0760\u0762\u0766\u076a\u076e\u0772"+
		"\u0775\u077c\u077e\u0788\u078e\u0792\u0799\u079e\u07a2\u07a6\u07ab\u07ad"+
		"\u07b1\u07b6\u07ba\u07bc\u07bf\u07c3\u07c6\u07cb\u07cd\u07d3\u07da\u07e0"+
		"\u07e6\u07ed\u07fb\u07fe\u080f\u081b\u0820\u0825\u0829\u082c\u0835\u0839"+
		"\u083d\u0841\u0844\u084e\u086a\u086e\u0872\u0879\u087c\u0884\u0887\u089a"+
		"\u08ac\u08af\u08b4\u08b9\u08c3\u08cb\u08d3\u08db\u08df\u08e4\u08ea\u08ef"+
		"\u08f5\u0908\u090f\u0918\u091d\u0922\u0929\u092d\u0937\u093a\u093d\u0944"+
		"\u094f\u0957\u095d\u0961\u0965\u096d\u0971\u0979\u0984\u0987\u098d\u0991"+
		"\u0995\u0998\u09a6\u09aa\u09b3\u09bc\u09bf\u09c2\u09c5\u09ca\u09cd\u09d3"+
		"\u09d9\u09e1\u09e8\u09ef\u09f7\u0a02\u0a06\u0a0c\u0a16\u0a18\u0a21\u0a24"+
		"\u0a27\u0a2b\u0a31\u0a33\u0a3e\u0a4a\u0a4c\u0a5c\u0a63\u0a6a\u0a71\u0a89"+
		"\u0a8e\u0a95\u0a9d\u0aa5\u0aad\u0ab3\u0ab7\u0abb\u0ac0\u0ac5\u0acb\u0acf"+
		"\u0ad3\u0ad8\u0ade\u0ae5\u0ae9\u0af0\u0af6\u0afa\u0afc\u0b03\u0b08\u0b0c"+
		"\u0b11\u0b15\u0b1c\u0b21\u0b25\u0b29\u0b30\u0b33\u0b39\u0b3b\u0b42\u0b46"+
		"\u0b4b\u0b52\u0b68\u0b70\u0b85\u0b89\u0b91\u0b94\u0b9c\u0ba1\u0ba6\u0baa"+
		"\u0bb4\u0bb7\u0bbb\u0bc0\u0bc7\u0bce\u0bd5\u0bdc\u0be7\u0bef\u0bf8\u0c05"+
		"\u0c09\u0c0e\u0c16\u0c1d\u0c21\u0c28\u0c32\u0c36\u0c39\u0c3e\u0c41\u0c46"+
		"\u0c4c\u0c50\u0c5e\u0c63\u0c66\u0c6b\u0c70\u0c76";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}