// Generated from D:/Work/Code/Intelij IDEA/grammars-v4/idb\IdbParser.g4 by ANTLR 4.4.1-dev

    package com.intple.dbone.parser.v4.idb;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IdbParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ROW=102, PRECISION=247, ILIKE=48, EXCEPT=34, BYTEA=349, VARBIT=316, DISTANCE=410, 
		CREATE=24, STRING_LITERAL=427, UNLOGGED=292, TIMEZONE_MINUTE=286, OFF=82, 
		VARIADIC=296, PRECEDING=246, TIMESTAMPTZ=342, REGEXP=256, ANALYZE=141, 
		GEQ=385, NOCOMPRESS=75, XMLDATA=373, DIVIDE=393, ASC=8, GROUPING=193, 
		PRESERVE=248, TRANSACTION=287, REFRESH=255, TEMP=282, MATERIALIZED=216, 
		INTERSECT2D=401, INT=323, SEMI_COLON=378, CONTENT=157, RLIKE=263, FILE=39, 
		LEADING=61, RESTRICT=261, MILLISECONDS=221, GROUP=44, INTERSECT=56, FETCH=38, 
		USER=126, INTERSECT3D=402, JSON_OBJECT_AT_PATH_AS_TEXT=417, CONSTRAINT=155, 
		TIMEZONE_HOUR=285, MODIFY=72, ALTER=4, FORCE=187, NCHAR=335, TABLE=116, 
		VARCHAR=334, SUB=391, MICROSECONDS=219, VERSION=301, FLOAT=329, NOTNULL=76, 
		SUM=278, WHITE_SPACE=429, NOWAIT=78, AT=143, STORAGE=275, AS=7, PASSING=243, 
		RIGHT_PAREN=387, GEOMETRY=353, DOCUMENT=173, MAXVALUE=218, COMPRESS=22, 
		AVG=144, LEFT=62, TRUNCATE=121, ZONE=312, BOX3D=352, PLUS=390, MODE=71, 
		LIKE=64, COLLATE=151, OUTER=90, BY=14, DEFERRABLE=171, WHENEVER=133, BOX2D=351, 
		VARCHAR2=130, INHERIT=200, RIGHT=100, HAVING=45, SESSION=106, MINUS=69, 
		CONCATENATION_OPERATOR=380, COLON=377, ROWS=103, FORMAT=189, NATURAL=73, 
		LONG=67, PUBLIC=94, UNSECURED=293, WEEK=302, OBJECT_ID=362, INT8=320, 
		CHAR=333, YES=311, DAY=165, COUNT=160, XMLROOT=308, RELEASE=258, INT2=318, 
		INT1=317, INT4=319, EXPLAIN=37, EXTENDED=181, QUOTE=398, MODULAR=394, 
		QUARTER=250, THAN=283, ESCAPE=177, CONNECT=23, INHERITS=201, INTERSECTION=204, 
		RETURNING=262, LESS=210, DOUBLE=330, ROWNUM=366, COMMENT=20, SELECT=105, 
		JSON_AS_TEXT=415, INTO=57, ARRAY=142, DUAL=360, NO_INHERIT=230, COALESCE=153, 
		SECOND=267, EPOCH=176, NULL=79, WITHOUT=305, NO=229, EVERY=178, ON=85, 
		MATCH=215, DELETE=28, NUMERIC=331, INET4=350, OF=81, TABLES=279, UNDERLINE=397, 
		VERSIONS_OPERATION=369, DISCARD=172, CUBE=161, NATIONAL=227, OR=88, FILTER=184, 
		CURRVAL=359, COLLECT=152, FALSE=136, UNBOUNDED=290, CURSOR=162, PCTFREE=91, 
		TIMESTAMP=341, RIGHT_SQUARE=389, DEC=166, CONSTRAINTS=156, WHERE=134, 
		NULLIF=232, VAR_SAMP=297, FORWARD=190, YEAR=310, LIMIT=65, MAX=217, DEFERRED=170, 
		FLOAT4=326, CUSTOME_OPERATOR=423, FLOAT8=327, SPACE=428, RESOURCE=98, 
		CROSS=25, USAGE=294, IF=47, RAW=95, GEOMETRY_DUMP=354, BOOLEAN=313, IN=50, 
		MULTIPLY=392, REFERENCES=254, COMMA=379, IS=58, PARTITION=241, SOME=110, 
		EQUAL=376, NEXT=228, CENTURY=148, EXCLUDE=179, WITH=135, INITIALLY=202, 
		REINDEX=96, FUSION=191, GRANT=43, VARBINARY=347, DEFAULT=27, BACKWARD=145, 
		MILLENNIUM=220, XMLEXISTS=306, REF=253, SUBSTRING=277, INCREMENT=51, LEFT_OF=404, 
		ASSIGN=375, IMMEDIATE=49, CLUSTER=18, WINDOW=303, STANDALONE=272, GLOBAL=192, 
		MINUTE=224, LEFT_SQUARE=388, INCLUDING=198, LEQ=383, ISODOW=205, OVERWRITE=238, 
		ONLINE=86, XMLSERIALIZE=309, VERSIONS_ENDTIME=368, REGEX=426, NOT=77, 
		FOREIGN=188, CACHE=146, PRIVILEGES=93, CHARACTER=149, ACTION=140, MONTH=225, 
		TYPE=289, STDDEV_POP=273, USING=127, NOT_EQUAL=381, BEGIN=11, VALID=295, 
		CAST_OPERATOR=374, UID=122, TSQUERY=345, STDDEV_SAMP=274, BLOB=348, VERSIONS_XID=372, 
		SUBPARTITION=276, KEY=207, INITIAL=53, ELSE=32, NUMBER=80, BOOL=314, TRAILING=119, 
		RECURSIVE=252, ROLLBACK=101, TABLESPACE=280, REAL=328, MAXEXTENTS=68, 
		SEQUENCES=269, LEVEL=63, INSENSITIVE=203, NONE=231, TRIM=288, NOT_SIMILAR_INSENSITIVE=413, 
		WITHIN=304, LEFT_PAREN=386, LOCATION=213, CONNECT_BY_ISLEAF=358, GEOGRAPHY=355, 
		END=33, SIZE=109, RENAME=97, OPTION=87, IDENTITY=197, ISOYEAR=206, AUDIT=10, 
		PLAIN=244, ONLY=235, ISNULL=59, ASYMMETRIC=9, OWNED=239, POSITION=245, 
		TIME=339, BIND_PARAMETER=418, THEN=117, TSVECTOR=344, OFFSET=84, REPLACE=259, 
		COLUMN=19, ACCESS=1, OBJECT_VALUE=363, EXISTS=36, NVARCHAR=336, ADD=2, 
		INTEGER=324, BOX_EQUAL=409, TO=118, OVERLAPS=237, SUCCESSFUL=112, SET=107, 
		RELATIVE=257, JSON_OBJECT_AT_PATH=416, MIN=222, TEXT=343, HOUR=196, UNION=123, 
		CURRENT=26, NULLS=233, COMMIT=21, SCHEMA=265, CLOSE=150, DECIMAL=332, 
		DROP=31, VERSIONS_STARTSCN=370, BIGINT=325, WHEN=132, MOVE=226, VALIDATE=128, 
		CONCURRENTLY=154, DECLARE=168, START=111, QUOTED_IDENTIFIER=425, BIT=315, 
		REVOKE=99, BETWEEN=12, FIRST=185, PRIOR=92, CAST=16, EXTERNAL=182, ORA_ROWSCN=364, 
		DOUBLE_QUOTE=399, JSON_ARRAY_ELEMENT_OR_FIELD=414, VARYING=299, TRIGGER=120, 
		CASE=15, CASCADE=147, VERBOSE=300, FULL=42, INSERT=55, CARET=395, SAVEPOINT=104, 
		ROWID=365, BOTH=13, TINYINT=321, BLOCK_COMMENT=421, REAL_NUM=420, SYMMETRIC=113, 
		SHARE=108, OFFLINE=83, LAST=208, ABORT=138, SYNONYM=114, UNIQUE=124, VIEW=131, 
		LINE_COMMENT=422, OVERLAPS_ABOVE=407, ROLLUP=264, RESTART=260, ABOVE=406, 
		PRIMARY=249, RIGHT_OF=405, LOCAL=212, EXCLUDING=180, LIST=211, SEQUENCE=268, 
		XMLPARSE=307, COSTS=159, VAR_POP=298, NOT_SIMILAR=411, CHECK=17, FROM=41, 
		DISTINCT=30, TEMPORARY=281, SIMPLE=271, OVER=236, MAIN=214, TIMETZ=340, 
		INNER=54, ORDER=89, TIMEZONE=284, DECADE=167, CYCLE=163, GTH=384, UPDATE=125, 
		FOR=40, COLUMN_VALUE=356, HOLD=195, EXCLUSIVE=35, FOLLOWING=186, AND=5, 
		IDENTIFIED=46, SCROLL=266, INTERVAL=338, LOCK=66, OVERLAP=403, INDEX=52, 
		OIDS=234, MLSLABEL=70, MINVALUE=223, UNKNOWN=291, CONTINUE=158, SYSDATE=115, 
		IDENTIFIER=424, PARTITIONS=242, ALL=3, TILDE=400, DOT=396, EXTRACT=183, 
		DOW=174, PARTIAL=240, NOAUDIT=74, DOY=175, LATERAL=209, VERSIONS_STARTTIME=371, 
		VALUES=129, HASH=194, INDEXES=199, RANGE=251, BELOW=408, TRUE=137, JOIN=60, 
		SIMILAR=270, NUM=419, DEFAULTS=169, LTH=382, ANY=6, NEXTVAL=361, CONNECT_BY_ISCYCLE=357, 
		SIMILAR_INSENSITIVE=412, DESC=29, BINARY=346, DATE=337, VERSIONS_ENDSCN=367, 
		ABSOLUTE=139, DATA=164, SMALLINT=322, VALUE=430;
	public static final String[] tokenNames = {
		"<INVALID>", "ACCESS", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", 
		"ASYMMETRIC", "AUDIT", "BEGIN", "BETWEEN", "BOTH", "BY", "CASE", "CAST", 
		"CHECK", "CLUSTER", "COLUMN", "COMMENT", "COMMIT", "COMPRESS", "CONNECT", 
		"CREATE", "CROSS", "CURRENT", "DEFAULT", "DELETE", "DESC", "DISTINCT", 
		"DROP", "ELSE", "END", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FETCH", 
		"FILE", "FOR", "FROM", "FULL", "GRANT", "GROUP", "HAVING", "IDENTIFIED", 
		"IF", "ILIKE", "IMMEDIATE", "IN", "INCREMENT", "INDEX", "INITIAL", "INNER", 
		"INSERT", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "LEADING", "LEFT", 
		"LEVEL", "LIKE", "LIMIT", "LOCK", "LONG", "MAXEXTENTS", "MINUS", "MLSLABEL", 
		"MODE", "MODIFY", "NATURAL", "NOAUDIT", "NOCOMPRESS", "NOTNULL", "NOT", 
		"NOWAIT", "NULL", "NUMBER", "OF", "OFF", "OFFLINE", "OFFSET", "ON", "ONLINE", 
		"OPTION", "OR", "ORDER", "OUTER", "PCTFREE", "PRIOR", "PRIVILEGES", "PUBLIC", 
		"RAW", "REINDEX", "RENAME", "RESOURCE", "REVOKE", "RIGHT", "ROLLBACK", 
		"ROW", "ROWS", "SAVEPOINT", "SELECT", "SESSION", "SET", "SHARE", "SIZE", 
		"SOME", "START", "SUCCESSFUL", "SYMMETRIC", "SYNONYM", "SYSDATE", "TABLE", 
		"THEN", "TO", "TRAILING", "TRIGGER", "TRUNCATE", "UID", "UNION", "UNIQUE", 
		"UPDATE", "USER", "USING", "VALIDATE", "VALUES", "VARCHAR2", "VIEW", "WHEN", 
		"WHENEVER", "WHERE", "WITH", "FALSE", "TRUE", "ABORT", "ABSOLUTE", "ACTION", 
		"ANALYZE", "ARRAY", "AT", "AVG", "BACKWARD", "CACHE", "CASCADE", "CENTURY", 
		"CHARACTER", "CLOSE", "COLLATE", "COLLECT", "COALESCE", "CONCURRENTLY", 
		"CONSTRAINT", "CONSTRAINTS", "CONTENT", "CONTINUE", "COSTS", "COUNT", 
		"CUBE", "CURSOR", "CYCLE", "DATA", "DAY", "DEC", "DECADE", "DECLARE", 
		"DEFAULTS", "DEFERRED", "DEFERRABLE", "DISCARD", "DOCUMENT", "DOW", "DOY", 
		"EPOCH", "ESCAPE", "EVERY", "EXCLUDE", "EXCLUDING", "EXTENDED", "EXTERNAL", 
		"EXTRACT", "FILTER", "FIRST", "FOLLOWING", "FORCE", "FOREIGN", "FORMAT", 
		"FORWARD", "FUSION", "GLOBAL", "GROUPING", "HASH", "HOLD", "HOUR", "IDENTITY", 
		"INCLUDING", "INDEXES", "INHERIT", "INHERITS", "INITIALLY", "INSENSITIVE", 
		"INTERSECTION", "ISODOW", "ISOYEAR", "KEY", "LAST", "LATERAL", "LESS", 
		"LIST", "LOCAL", "LOCATION", "MAIN", "MATCH", "MATERIALIZED", "MAX", "MAXVALUE", 
		"MICROSECONDS", "MILLENNIUM", "MILLISECONDS", "MIN", "MINVALUE", "MINUTE", 
		"MONTH", "MOVE", "NATIONAL", "NEXT", "NO", "NO_INHERIT", "NONE", "NULLIF", 
		"NULLS", "OIDS", "ONLY", "OVER", "OVERLAPS", "OVERWRITE", "OWNED", "PARTIAL", 
		"PARTITION", "PARTITIONS", "PASSING", "PLAIN", "POSITION", "PRECEDING", 
		"PRECISION", "PRESERVE", "PRIMARY", "QUARTER", "RANGE", "RECURSIVE", "REF", 
		"REFERENCES", "REFRESH", "REGEXP", "RELATIVE", "RELEASE", "REPLACE", "RESTART", 
		"RESTRICT", "RETURNING", "RLIKE", "ROLLUP", "SCHEMA", "SCROLL", "SECOND", 
		"SEQUENCE", "SEQUENCES", "SIMILAR", "SIMPLE", "STANDALONE", "STDDEV_POP", 
		"STDDEV_SAMP", "STORAGE", "SUBPARTITION", "SUBSTRING", "SUM", "TABLES", 
		"TABLESPACE", "TEMPORARY", "TEMP", "THAN", "TIMEZONE", "TIMEZONE_HOUR", 
		"TIMEZONE_MINUTE", "TRANSACTION", "TRIM", "TYPE", "UNBOUNDED", "UNKNOWN", 
		"UNLOGGED", "UNSECURED", "USAGE", "VALID", "VARIADIC", "VAR_SAMP", "VAR_POP", 
		"VARYING", "VERBOSE", "VERSION", "WEEK", "WINDOW", "WITHIN", "WITHOUT", 
		"XMLEXISTS", "XMLPARSE", "XMLROOT", "XMLSERIALIZE", "YEAR", "YES", "ZONE", 
		"BOOLEAN", "BOOL", "BIT", "VARBIT", "INT1", "INT2", "INT4", "INT8", "TINYINT", 
		"SMALLINT", "INT", "INTEGER", "BIGINT", "FLOAT4", "FLOAT8", "REAL", "FLOAT", 
		"DOUBLE", "NUMERIC", "DECIMAL", "CHAR", "VARCHAR", "NCHAR", "NVARCHAR", 
		"DATE", "INTERVAL", "TIME", "TIMETZ", "TIMESTAMP", "TIMESTAMPTZ", "TEXT", 
		"TSVECTOR", "TSQUERY", "BINARY", "VARBINARY", "BLOB", "BYTEA", "INET4", 
		"BOX2D", "BOX3D", "GEOMETRY", "GEOMETRY_DUMP", "GEOGRAPHY", "COLUMN_VALUE", 
		"CONNECT_BY_ISCYCLE", "CONNECT_BY_ISLEAF", "CURRVAL", "DUAL", "NEXTVAL", 
		"OBJECT_ID", "OBJECT_VALUE", "ORA_ROWSCN", "ROWID", "ROWNUM", "VERSIONS_ENDSCN", 
		"VERSIONS_ENDTIME", "VERSIONS_OPERATION", "VERSIONS_STARTSCN", "VERSIONS_STARTTIME", 
		"VERSIONS_XID", "XMLDATA", "CAST_OPERATOR", "':='", "'='", "':'", "';'", 
		"','", "'||'", "NOT_EQUAL", "'<'", "'<='", "'>'", "'>='", "'('", "')'", 
		"'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'", "'_'", 
		"'''", "'\"'", "'~'", "'&&'", "'&&&'", "OVERLAP", "'<<'", "'>>'", "'|>>'", 
		"'|&>'", "'<<|'", "'~='", "DISTANCE", "'!~'", "'~*'", "'!~*'", "'->'", 
		"'->>'", "'#>'", "'#>>'", "BIND_PARAMETER", "NUM", "REAL_NUM", "BLOCK_COMMENT", 
		"LINE_COMMENT", "CUSTOME_OPERATOR", "IDENTIFIER", "QUOTED_IDENTIFIER", 
		"REGEX", "STRING_LITERAL", "' '", "WHITE_SPACE", "VALUE"
	};
	public static final int
		RULE_sql = 0, RULE_statement = 1, RULE_dml = 2, RULE_select_stmt = 3, 
		RULE_update_stmt = 4, RULE_delete_stmt = 5, RULE_insert_stmt = 6, RULE_using_clause = 7, 
		RULE_insert_value = 8, RULE_update_list = 9, RULE_update_content = 10, 
		RULE_update_value = 11, RULE_returning_clause = 12, RULE_query_expression = 13, 
		RULE_query_specification = 14, RULE_query_rel = 15, RULE_set_qualifier = 16, 
		RULE_select_list = 17, RULE_select_sublist = 18, RULE_derived_column = 19, 
		RULE_qualified_asterisk = 20, RULE_over_clause = 21, RULE_as_clause = 22, 
		RULE_into_expression = 23, RULE_with_query = 24, RULE_with_query_name = 25, 
		RULE_with_query_clause = 26, RULE_table_stmt = 27, RULE_subquery = 28, 
		RULE_from_clause = 29, RULE_where_clause = 30, RULE_group_clause = 31, 
		RULE_having_clause = 32, RULE_window_clause = 33, RULE_window_specifier_list = 34, 
		RULE_window_specifier = 35, RULE_order_clause = 36, RULE_sort_specifier_list = 37, 
		RULE_sort_specifier = 38, RULE_order_specification = 39, RULE_operators = 40, 
		RULE_null_ordering = 41, RULE_limit_clause = 42, RULE_offset_clause = 43, 
		RULE_fetch_clause = 44, RULE_for_clause = 45, RULE_count = 46, RULE_start = 47, 
		RULE_table_reference = 48, RULE_simple_table = 49, RULE_joined_table = 50, 
		RULE_join_type = 51, RULE_outer_join_type = 52, RULE_correlation_specification = 53, 
		RULE_derived_column_list = 54, RULE_derived_table = 55, RULE_table_subquery = 56, 
		RULE_function = 57, RULE_join_specification = 58, RULE_join_condition = 59, 
		RULE_named_columns_join = 60, RULE_join_column_list = 61, RULE_values_stmt = 62, 
		RULE_search_condition = 63, RULE_expr = 64, RULE_unsigned_numeric_literal = 65, 
		RULE_string_literal = 66, RULE_datetime_literal = 67, RULE_interval_literal = 68, 
		RULE_interval_qualifier = 69, RULE_interval_precision = 70, RULE_time_literal = 71, 
		RULE_timestamp_literal = 72, RULE_date_literal = 73, RULE_boolean_literal = 74, 
		RULE_primary_datetime_field = 75, RULE_extended_datetime_field = 76, RULE_const_value = 77, 
		RULE_expr_suffix = 78, RULE_time_zone = 79, RULE_quantifier = 80, RULE_all = 81, 
		RULE_some = 82, RULE_compare_operator = 83, RULE_unary_operator = 84, 
		RULE_any_other_operator = 85, RULE_custome_operator = 86, RULE_postgis_operator = 87, 
		RULE_scalar_subquery = 88, RULE_tuple_value = 89, RULE_case_when = 90, 
		RULE_cast_expr = 91, RULE_value_function = 92, RULE_bit_position_function = 93, 
		RULE_extract_function = 94, RULE_extract_field = 95, RULE_time_zone_field = 96, 
		RULE_substring_function = 97, RULE_trim_function = 98, RULE_trim_operands = 99, 
		RULE_trim_specification = 100, RULE_array_constructor = 101, RULE_row_constructor = 102, 
		RULE_pattern_matcher = 103, RULE_negativable_matcher = 104, RULE_regex_matcher = 105, 
		RULE_xml_parse_expr = 106, RULE_xml_serialize_expr = 107, RULE_xml_value = 108, 
		RULE_xml_predicate = 109, RULE_xml_function = 110, RULE_by_ref = 111, 
		RULE_expr_list = 112, RULE_data_type = 113, RULE_precision = 114, RULE_scale = 115, 
		RULE_variable_length = 116, RULE_interval_fields = 117, RULE_data_type_list = 118, 
		RULE_function_name = 119, RULE_function_reserved_name = 120, RULE_function_args = 121, 
		RULE_function_arg = 122, RULE_variable_name = 123, RULE_database_name = 124, 
		RULE_schema_name = 125, RULE_qualified_schema_name = 126, RULE_table_name = 127, 
		RULE_qualified_table_name = 128, RULE_column_name = 129, RULE_qualified_column_name = 130, 
		RULE_window_name = 131, RULE_exists_window_name = 132, RULE_window_definition = 133, 
		RULE_frame_clause = 134, RULE_frame = 135, RULE_table_name_list = 136, 
		RULE_column_name_list = 137, RULE_column_definition = 138, RULE_column_definition_list = 139, 
		RULE_correlation_name = 140, RULE_column_alias = 141, RULE_any_name = 142, 
		RULE_identifier = 143, RULE_nonreserved_keywords = 144;
	public static final String[] ruleNames = {
		"sql", "statement", "dml", "select_stmt", "update_stmt", "delete_stmt", 
		"insert_stmt", "using_clause", "insert_value", "update_list", "update_content", 
		"update_value", "returning_clause", "query_expression", "query_specification", 
		"query_rel", "set_qualifier", "select_list", "select_sublist", "derived_column", 
		"qualified_asterisk", "over_clause", "as_clause", "into_expression", "with_query", 
		"with_query_name", "with_query_clause", "table_stmt", "subquery", "from_clause", 
		"where_clause", "group_clause", "having_clause", "window_clause", "window_specifier_list", 
		"window_specifier", "order_clause", "sort_specifier_list", "sort_specifier", 
		"order_specification", "operators", "null_ordering", "limit_clause", "offset_clause", 
		"fetch_clause", "for_clause", "count", "start", "table_reference", "simple_table", 
		"joined_table", "join_type", "outer_join_type", "correlation_specification", 
		"derived_column_list", "derived_table", "table_subquery", "function", 
		"join_specification", "join_condition", "named_columns_join", "join_column_list", 
		"values_stmt", "search_condition", "expr", "unsigned_numeric_literal", 
		"string_literal", "datetime_literal", "interval_literal", "interval_qualifier", 
		"interval_precision", "time_literal", "timestamp_literal", "date_literal", 
		"boolean_literal", "primary_datetime_field", "extended_datetime_field", 
		"const_value", "expr_suffix", "time_zone", "quantifier", "all", "some", 
		"compare_operator", "unary_operator", "any_other_operator", "custome_operator", 
		"postgis_operator", "scalar_subquery", "tuple_value", "case_when", "cast_expr", 
		"value_function", "bit_position_function", "extract_function", "extract_field", 
		"time_zone_field", "substring_function", "trim_function", "trim_operands", 
		"trim_specification", "array_constructor", "row_constructor", "pattern_matcher", 
		"negativable_matcher", "regex_matcher", "xml_parse_expr", "xml_serialize_expr", 
		"xml_value", "xml_predicate", "xml_function", "by_ref", "expr_list", "data_type", 
		"precision", "scale", "variable_length", "interval_fields", "data_type_list", 
		"function_name", "function_reserved_name", "function_args", "function_arg", 
		"variable_name", "database_name", "schema_name", "qualified_schema_name", 
		"table_name", "qualified_table_name", "column_name", "qualified_column_name", 
		"window_name", "exists_window_name", "window_definition", "frame_clause", 
		"frame", "table_name_list", "column_name_list", "column_definition", "column_definition_list", 
		"correlation_name", "column_alias", "any_name", "identifier", "nonreserved_keywords"
	};

	@Override
	public String getGrammarFileName() { return "IdbParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public IdbParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SqlContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON(int i) {
			return getToken(IdbParser.SEMI_COLON, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(IdbParser.SEMI_COLON); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode EOF() { return getToken(IdbParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290); statement();
					setState(291); match(SEMI_COLON);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(298); statement();
			setState(300);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(299); match(SEMI_COLON);
				}
			}

			setState(302); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public DmlContext dml() {
			return getRuleContext(DmlContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); dml();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlContext extends ParserRuleContext {
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public DmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dml);
		try {
			setState(310);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case VALUES:
			case WITH:
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); select_stmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(307); update_stmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); insert_stmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(309); delete_stmt();
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Offset_clauseContext offset_clause() {
			return getRuleContext(Offset_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Fetch_clauseContext fetch_clause() {
			return getRuleContext(Fetch_clauseContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Order_clauseContext order_clause() {
			return getRuleContext(Order_clauseContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); query_expression();
			setState(314);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(313); order_clause();
				}
			}

			setState(317);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(316); limit_clause();
				}
			}

			setState(320);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(319); offset_clause();
				}
			}

			setState(323);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(322); fetch_clause();
				}
			}

			setState(326);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(325); for_clause();
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

	public static class Update_stmtContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode SET() { return getToken(IdbParser.SET, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public Update_listContext update_list() {
			return getRuleContext(Update_listContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(IdbParser.UPDATE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(UPDATE);
			setState(329); qualified_table_name();
			setState(330); match(SET);
			setState(331); update_list();
			setState(333);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(332); from_clause();
				}
			}

			setState(336);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(335); where_clause();
				}
			}

			setState(339);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(338); returning_clause();
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(IdbParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(IdbParser.FROM, 0); }
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(DELETE);
			setState(342); match(FROM);
			setState(343); qualified_table_name();
			setState(345);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(344); using_clause();
				}
			}

			setState(348);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(347); where_clause();
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(350); returning_clause();
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(IdbParser.DEFAULT, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(IdbParser.LEFT_PAREN, i);
		}
		public Into_expressionContext into_expression() {
			return getRuleContext(Into_expressionContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(IdbParser.INSERT, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(IdbParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(IdbParser.LEFT_PAREN); }
		public TerminalNode VALUES() { return getToken(IdbParser.VALUES, 0); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(IdbParser.RIGHT_PAREN, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_valueContext insert_value() {
			return getRuleContext(Insert_valueContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(INSERT);
			setState(354); into_expression();
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(355); match(LEFT_PAREN);
				setState(356); column_name_list();
				setState(357); match(RIGHT_PAREN);
				}
				break;
			}
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(361); match(VALUES);
				setState(362); insert_value();
				}
				break;
			case 2:
				{
				setState(363); select_stmt();
				}
				break;
			case 3:
				{
				setState(364); match(LEFT_PAREN);
				setState(365); select_stmt();
				setState(366); match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				setState(368); match(DEFAULT);
				setState(369); match(VALUES);
				}
				break;
			}
			setState(373);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(372); returning_clause();
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

	public static class Using_clauseContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode USING() { return getToken(IdbParser.USING, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_using_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(USING);
			setState(376); table_reference();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377); match(COMMA);
				setState(378); table_reference();
				}
				}
				setState(383);
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

	public static class Insert_valueContext extends ParserRuleContext {
		public List<Expr_listContext> expr_list() {
			return getRuleContexts(Expr_listContext.class);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(IdbParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Expr_listContext expr_list(int i) {
			return getRuleContext(Expr_listContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(IdbParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(IdbParser.LEFT_PAREN); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(IdbParser.RIGHT_PAREN, i);
		}
		public Insert_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInsert_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valueContext insert_value() throws RecognitionException {
		Insert_valueContext _localctx = new Insert_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(LEFT_PAREN);
			setState(385); expr_list();
			setState(386); match(RIGHT_PAREN);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387); match(COMMA);
				setState(388); match(LEFT_PAREN);
				setState(389); expr_list();
				setState(390); match(RIGHT_PAREN);
				}
				}
				setState(396);
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

	public static class Update_listContext extends ParserRuleContext {
		public List<Update_contentContext> update_content() {
			return getRuleContexts(Update_contentContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Update_contentContext update_content(int i) {
			return getRuleContext(Update_contentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Update_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUpdate_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_listContext update_list() throws RecognitionException {
		Update_listContext _localctx = new Update_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_update_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); update_content();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398); match(COMMA);
				setState(399); update_content();
				}
				}
				setState(404);
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

	public static class Update_contentContext extends ParserRuleContext {
		public Update_valueContext update_value() {
			return getRuleContext(Update_valueContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode EQUAL() { return getToken(IdbParser.EQUAL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Qualified_column_nameContext qualified_column_name() {
			return getRuleContext(Qualified_column_nameContext.class,0);
		}
		public Update_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUpdate_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_contentContext update_content() throws RecognitionException {
		Update_contentContext _localctx = new Update_contentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update_content);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case WITH:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(405); qualified_column_name();
				setState(406); match(EQUAL);
				setState(407); expr(0);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(409); match(LEFT_PAREN);
				setState(410); column_name_list();
				setState(411); match(RIGHT_PAREN);
				setState(412); match(EQUAL);
				setState(413); update_value();
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

	public static class Update_valueContext extends ParserRuleContext {
		public List<Expr_listContext> expr_list() {
			return getRuleContexts(Expr_listContext.class);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(IdbParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Expr_listContext expr_list(int i) {
			return getRuleContext(Expr_listContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(IdbParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(IdbParser.LEFT_PAREN); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(IdbParser.RIGHT_PAREN, i);
		}
		public Update_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUpdate_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_valueContext update_value() throws RecognitionException {
		Update_valueContext _localctx = new Update_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_update_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(LEFT_PAREN);
			setState(418); expr_list();
			setState(419); match(RIGHT_PAREN);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420); match(COMMA);
					setState(421); match(LEFT_PAREN);
					setState(422); expr_list();
					setState(423); match(RIGHT_PAREN);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Returning_clauseContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(IdbParser.RETURNING, 0); }
		public Returning_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitReturning_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returning_clauseContext returning_clause() throws RecognitionException {
		Returning_clauseContext _localctx = new Returning_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returning_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(RETURNING);
			setState(431); select_list();
			}
		}
		catch (RecognitionException re) {
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
		public Query_expressionContext query_expression(int i) {
			return getRuleContext(Query_expressionContext.class,i);
		}
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
		public List<Query_expressionContext> query_expression() {
			return getRuleContexts(Query_expressionContext.class);
		}
		public Table_stmtContext table_stmt() {
			return getRuleContext(Table_stmtContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Query_relContext query_rel(int i) {
			return getRuleContext(Query_relContext.class,i);
		}
		public Query_specificationContext query_specification(int i) {
			return getRuleContext(Query_specificationContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Query_specificationContext> query_specification() {
			return getRuleContexts(Query_specificationContext.class);
		}
		public List<Query_relContext> query_rel() {
			return getRuleContexts(Query_relContext.class);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_query_expression);
		try {
			int _alt;
			setState(457);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(433); query_specification();
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434); query_rel();
						setState(437);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(435); query_specification();
							}
							break;
						case 2:
							{
							setState(436); query_expression();
							}
							break;
						}
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); match(LEFT_PAREN);
				setState(445); select_stmt();
				setState(446); match(RIGHT_PAREN);
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(447); query_rel();
						setState(448); query_expression();
						}
						} 
					}
					setState(454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(455); table_stmt();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 4);
				{
				setState(456); values_stmt();
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

	public static class Query_specificationContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public With_queryContext with_query() {
			return getRuleContext(With_queryContext.class,0);
		}
		public Window_clauseContext window_clause() {
			return getRuleContext(Window_clauseContext.class,0);
		}
		public Group_clauseContext group_clause() {
			return getRuleContext(Group_clauseContext.class,0);
		}
		public Into_expressionContext into_expression() {
			return getRuleContext(Into_expressionContext.class,0);
		}
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(IdbParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQuery_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_query_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(459); with_query();
				}
			}

			setState(462); match(SELECT);
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(463); set_qualifier();
				}
				break;
			}
			setState(466); select_list();
			setState(468);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(467); into_expression();
				}
			}

			setState(471);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(470); from_clause();
				}
			}

			setState(474);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(473); where_clause();
				}
			}

			setState(477);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(476); group_clause();
				}
			}

			setState(480);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(479); having_clause();
				}
			}

			setState(483);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(482); window_clause();
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

	public static class Query_relContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(IdbParser.EXCEPT, 0); }
		public TerminalNode UNION() { return getToken(IdbParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(IdbParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(IdbParser.DISTINCT, 0); }
		public TerminalNode INTERSECT() { return getToken(IdbParser.INTERSECT, 0); }
		public Query_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQuery_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_relContext query_rel() throws RecognitionException {
		Query_relContext _localctx = new Query_relContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(487);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(486);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class Set_qualifierContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(IdbParser.ON, 0); }
		public TerminalNode ALL() { return getToken(IdbParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(IdbParser.DISTINCT, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Set_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSet_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_qualifierContext set_qualifier() throws RecognitionException {
		Set_qualifierContext _localctx = new Set_qualifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_set_qualifier);
		int _la;
		try {
			setState(498);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(489); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(490); match(DISTINCT);
				setState(496);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(491); match(ON);
					setState(492); match(LEFT_PAREN);
					setState(493); expr_list();
					setState(494); match(RIGHT_PAREN);
					}
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

	public static class Select_listContext extends ParserRuleContext {
		public Select_sublistContext select_sublist(int i) {
			return getRuleContext(Select_sublistContext.class,i);
		}
		public List<Select_sublistContext> select_sublist() {
			return getRuleContexts(Select_sublistContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); select_sublist();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501); match(COMMA);
				setState(502); select_sublist();
				}
				}
				setState(507);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSelect_sublist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_sublistContext select_sublist() throws RecognitionException {
		Select_sublistContext _localctx = new Select_sublistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_select_sublist);
		try {
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509); qualified_asterisk();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public As_clauseContext as_clause() {
			return getRuleContext(As_clauseContext.class,0);
		}
		public Derived_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDerived_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_columnContext derived_column() throws RecognitionException {
		Derived_columnContext _localctx = new Derived_columnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_derived_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); expr(0);
			setState(514);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(513); as_clause();
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
		public TerminalNode DOT() { return getToken(IdbParser.DOT, 0); }
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Qualified_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_asterisk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQualified_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_asteriskContext qualified_asterisk() throws RecognitionException {
		Qualified_asteriskContext _localctx = new Qualified_asteriskContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qualified_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (WITH - 135)) | (1L << (ABORT - 135)) | (1L << (ABSOLUTE - 135)) | (1L << (ACTION - 135)) | (1L << (ANALYZE - 135)) | (1L << (ARRAY - 135)) | (1L << (AT - 135)) | (1L << (AVG - 135)) | (1L << (BACKWARD - 135)) | (1L << (CACHE - 135)) | (1L << (CASCADE - 135)) | (1L << (CENTURY - 135)) | (1L << (CHARACTER - 135)) | (1L << (CLOSE - 135)) | (1L << (COLLATE - 135)) | (1L << (COLLECT - 135)) | (1L << (COALESCE - 135)) | (1L << (CONCURRENTLY - 135)) | (1L << (CONSTRAINT - 135)) | (1L << (CONSTRAINTS - 135)) | (1L << (CONTINUE - 135)) | (1L << (COSTS - 135)) | (1L << (COUNT - 135)) | (1L << (CUBE - 135)) | (1L << (CURSOR - 135)) | (1L << (CYCLE - 135)) | (1L << (DATA - 135)) | (1L << (DAY - 135)) | (1L << (DEC - 135)) | (1L << (DECADE - 135)) | (1L << (DECLARE - 135)) | (1L << (DEFAULTS - 135)) | (1L << (DEFERRED - 135)) | (1L << (DEFERRABLE - 135)) | (1L << (DISCARD - 135)) | (1L << (DOW - 135)) | (1L << (DOY - 135)) | (1L << (EPOCH - 135)) | (1L << (ESCAPE - 135)) | (1L << (EVERY - 135)) | (1L << (EXCLUDE - 135)) | (1L << (EXCLUDING - 135)) | (1L << (EXTENDED - 135)) | (1L << (EXTERNAL - 135)) | (1L << (EXTRACT - 135)) | (1L << (FILTER - 135)) | (1L << (FIRST - 135)) | (1L << (FOLLOWING - 135)) | (1L << (FORCE - 135)) | (1L << (FOREIGN - 135)) | (1L << (FORMAT - 135)) | (1L << (FORWARD - 135)) | (1L << (FUSION - 135)) | (1L << (GLOBAL - 135)) | (1L << (GROUPING - 135)) | (1L << (HASH - 135)) | (1L << (HOLD - 135)) | (1L << (HOUR - 135)) | (1L << (IDENTITY - 135)) | (1L << (INCLUDING - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (INDEXES - 199)) | (1L << (INHERIT - 199)) | (1L << (INHERITS - 199)) | (1L << (INITIALLY - 199)) | (1L << (INSENSITIVE - 199)) | (1L << (INTERSECTION - 199)) | (1L << (ISODOW - 199)) | (1L << (ISOYEAR - 199)) | (1L << (KEY - 199)) | (1L << (LAST - 199)) | (1L << (LATERAL - 199)) | (1L << (LESS - 199)) | (1L << (LIST - 199)) | (1L << (LOCAL - 199)) | (1L << (LOCATION - 199)) | (1L << (MAIN - 199)) | (1L << (MATCH - 199)) | (1L << (MATERIALIZED - 199)) | (1L << (MAX - 199)) | (1L << (MAXVALUE - 199)) | (1L << (MICROSECONDS - 199)) | (1L << (MILLENNIUM - 199)) | (1L << (MILLISECONDS - 199)) | (1L << (MIN - 199)) | (1L << (MINVALUE - 199)) | (1L << (MINUTE - 199)) | (1L << (MONTH - 199)) | (1L << (MOVE - 199)) | (1L << (NATIONAL - 199)) | (1L << (NEXT - 199)) | (1L << (NO - 199)) | (1L << (NO_INHERIT - 199)) | (1L << (NONE - 199)) | (1L << (NULLIF - 199)) | (1L << (NULLS - 199)) | (1L << (OIDS - 199)) | (1L << (ONLY - 199)) | (1L << (OVERWRITE - 199)) | (1L << (OWNED - 199)) | (1L << (PARTIAL - 199)) | (1L << (PARTITION - 199)) | (1L << (PARTITIONS - 199)) | (1L << (PLAIN - 199)) | (1L << (POSITION - 199)) | (1L << (PRECEDING - 199)) | (1L << (PRECISION - 199)) | (1L << (PRESERVE - 199)) | (1L << (PRIMARY - 199)) | (1L << (QUARTER - 199)) | (1L << (RANGE - 199)) | (1L << (RECURSIVE - 199)) | (1L << (REFERENCES - 199)) | (1L << (REFRESH - 199)) | (1L << (REGEXP - 199)) | (1L << (RELATIVE - 199)) | (1L << (RELEASE - 199)) | (1L << (REPLACE - 199)) | (1L << (RESTART - 199)) | (1L << (RESTRICT - 199)) | (1L << (RETURNING - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (RLIKE - 263)) | (1L << (ROLLUP - 263)) | (1L << (SCHEMA - 263)) | (1L << (SCROLL - 263)) | (1L << (SECOND - 263)) | (1L << (SEQUENCE - 263)) | (1L << (SEQUENCES - 263)) | (1L << (SIMILAR - 263)) | (1L << (SIMPLE - 263)) | (1L << (STDDEV_POP - 263)) | (1L << (STDDEV_SAMP - 263)) | (1L << (STORAGE - 263)) | (1L << (SUBPARTITION - 263)) | (1L << (SUBSTRING - 263)) | (1L << (SUM - 263)) | (1L << (TABLES - 263)) | (1L << (TABLESPACE - 263)) | (1L << (TEMPORARY - 263)) | (1L << (TEMP - 263)) | (1L << (THAN - 263)) | (1L << (TIMEZONE - 263)) | (1L << (TIMEZONE_HOUR - 263)) | (1L << (TIMEZONE_MINUTE - 263)) | (1L << (TRANSACTION - 263)) | (1L << (TRIM - 263)) | (1L << (TYPE - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UNKNOWN - 263)) | (1L << (UNLOGGED - 263)) | (1L << (UNSECURED - 263)) | (1L << (USAGE - 263)) | (1L << (VALID - 263)) | (1L << (VARIADIC - 263)) | (1L << (VAR_SAMP - 263)) | (1L << (VAR_POP - 263)) | (1L << (VARYING - 263)) | (1L << (VERBOSE - 263)) | (1L << (WEEK - 263)) | (1L << (WINDOW - 263)) | (1L << (WITHIN - 263)) | (1L << (WITHOUT - 263)) | (1L << (YEAR - 263)) | (1L << (ZONE - 263)) | (1L << (BOOLEAN - 263)) | (1L << (BOOL - 263)) | (1L << (BIT - 263)) | (1L << (VARBIT - 263)) | (1L << (INT1 - 263)) | (1L << (INT2 - 263)) | (1L << (INT4 - 263)) | (1L << (INT8 - 263)) | (1L << (TINYINT - 263)) | (1L << (SMALLINT - 263)) | (1L << (INT - 263)) | (1L << (INTEGER - 263)) | (1L << (BIGINT - 263)) | (1L << (FLOAT4 - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (FLOAT8 - 327)) | (1L << (REAL - 327)) | (1L << (FLOAT - 327)) | (1L << (DOUBLE - 327)) | (1L << (NUMERIC - 327)) | (1L << (DECIMAL - 327)) | (1L << (CHAR - 327)) | (1L << (VARCHAR - 327)) | (1L << (NCHAR - 327)) | (1L << (NVARCHAR - 327)) | (1L << (DATE - 327)) | (1L << (INTERVAL - 327)) | (1L << (TIME - 327)) | (1L << (TIMETZ - 327)) | (1L << (TIMESTAMP - 327)) | (1L << (TIMESTAMPTZ - 327)) | (1L << (TEXT - 327)) | (1L << (TSVECTOR - 327)) | (1L << (TSQUERY - 327)) | (1L << (BINARY - 327)) | (1L << (VARBINARY - 327)) | (1L << (BLOB - 327)) | (1L << (BYTEA - 327)) | (1L << (INET4 - 327)) | (1L << (BOX2D - 327)) | (1L << (BOX3D - 327)) | (1L << (GEOMETRY - 327)) | (1L << (GEOMETRY_DUMP - 327)) | (1L << (GEOGRAPHY - 327)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(516); table_name();
				setState(517); match(DOT);
				}
			}

			setState(521); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(IdbParser.OVER, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public Window_definitionContext window_definition() {
			return getRuleContext(Window_definitionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOver_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_over_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(OVER);
			setState(529);
			switch (_input.LA(1)) {
			case WITH:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
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
				setState(524); window_name();
				}
				break;
			case LEFT_PAREN:
				{
				setState(525); match(LEFT_PAREN);
				setState(526); window_definition();
				setState(527); match(RIGHT_PAREN);
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

	public static class As_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(IdbParser.NULL, 0); }
		public As_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitAs_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_clauseContext as_clause() throws RecognitionException {
		As_clauseContext _localctx = new As_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_as_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(531); match(AS);
				}
			}

			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(534); column_alias();
				}
				break;
			case 2:
				{
				setState(535); boolean_literal();
				}
				break;
			case 3:
				{
				setState(536); match(NULL);
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

	public static class Into_expressionContext extends ParserRuleContext {
		public TerminalNode UNLOGGED() { return getToken(IdbParser.UNLOGGED, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(IdbParser.TEMPORARY, 0); }
		public TerminalNode INTO() { return getToken(IdbParser.INTO, 0); }
		public TerminalNode TEMP() { return getToken(IdbParser.TEMP, 0); }
		public TerminalNode TABLE() { return getToken(IdbParser.TABLE, 0); }
		public Into_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInto_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_expressionContext into_expression() throws RecognitionException {
		Into_expressionContext _localctx = new Into_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_into_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); match(INTO);
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(540);
				_la = _input.LA(1);
				if ( !(((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (TEMPORARY - 281)) | (1L << (TEMP - 281)) | (1L << (UNLOGGED - 281)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(544);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(543); match(TABLE);
				}
			}

			setState(546); qualified_table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_queryContext extends ParserRuleContext {
		public With_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_query; }
	 
		public With_queryContext() { }
		public void copyFrom(With_queryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithQueryContext extends With_queryContext {
		public With_query_clauseContext with_query_clause(int i) {
			return getRuleContext(With_query_clauseContext.class,i);
		}
		public List<With_query_clauseContext> with_query_clause() {
			return getRuleContexts(With_query_clauseContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public TerminalNode RECURSIVE() { return getToken(IdbParser.RECURSIVE, 0); }
		public TerminalNode WITH() { return getToken(IdbParser.WITH, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public WithQueryContext(With_queryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWithQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_queryContext with_query() throws RecognitionException {
		With_queryContext _localctx = new With_queryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_with_query);
		int _la;
		try {
			_localctx = new WithQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(548); match(WITH);
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(549); match(RECURSIVE);
				}
				break;
			}
			setState(552); with_query_clause();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(553); match(COMMA);
				setState(554); with_query_clause();
				}
				}
				setState(559);
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

	public static class With_query_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public With_query_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_query_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWith_query_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_query_nameContext with_query_name() throws RecognitionException {
		With_query_nameContext _localctx = new With_query_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_with_query_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_query_clauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(IdbParser.LEFT_PAREN, i);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(IdbParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(IdbParser.LEFT_PAREN); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(IdbParser.RIGHT_PAREN, i);
		}
		public With_query_nameContext with_query_name() {
			return getRuleContext(With_query_nameContext.class,0);
		}
		public With_query_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_query_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWith_query_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_query_clauseContext with_query_clause() throws RecognitionException {
		With_query_clauseContext _localctx = new With_query_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_with_query_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); with_query_name();
			setState(567);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(563); match(LEFT_PAREN);
				setState(564); column_name_list();
				setState(565); match(RIGHT_PAREN);
				}
			}

			setState(569); match(AS);
			setState(570); match(LEFT_PAREN);
			setState(576);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(571); select_stmt();
				}
				break;
			case 2:
				{
				setState(572); values_stmt();
				}
				break;
			case 3:
				{
				setState(573); insert_stmt();
				}
				break;
			case 4:
				{
				setState(574); update_stmt();
				}
				break;
			case 5:
				{
				setState(575); delete_stmt();
				}
				break;
			}
			setState(578); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_stmtContext extends ParserRuleContext {
		public Table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_stmt; }
	 
		public Table_stmtContext() { }
		public void copyFrom(Table_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableStmtContext extends Table_stmtContext {
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public TerminalNode TABLE() { return getToken(IdbParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TableStmtContext(Table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_stmtContext table_stmt() throws RecognitionException {
		Table_stmtContext _localctx = new Table_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_stmt);
		int _la;
		try {
			_localctx = new TableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(580); match(TABLE);
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(581); match(ONLY);
				}
				break;
			}
			setState(584); table_name();
			setState(586);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(585); match(MULTIPLY);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); match(LEFT_PAREN);
			setState(589); select_stmt();
			setState(590); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	 
		public From_clauseContext() { }
		public void copyFrom(From_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FromClauseContext extends From_clauseContext {
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public TerminalNode FROM() { return getToken(IdbParser.FROM, 0); }
		public FromClauseContext(From_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_from_clause);
		int _la;
		try {
			_localctx = new FromClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(592); match(FROM);
			setState(593); table_reference();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(594); match(COMMA);
				setState(595); table_reference();
				}
				}
				setState(600);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	 
		public Where_clauseContext() { }
		public void copyFrom(Where_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereClauseContext extends Where_clauseContext {
		public TerminalNode WHERE() { return getToken(IdbParser.WHERE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public WhereClauseContext(Where_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_where_clause);
		try {
			_localctx = new WhereClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(WHERE);
			setState(602); search_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_clauseContext extends ParserRuleContext {
		public Group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_clause; }
	 
		public Group_clauseContext() { }
		public void copyFrom(Group_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupClauseContext extends Group_clauseContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode BY() { return getToken(IdbParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(IdbParser.GROUP, 0); }
		public GroupClauseContext(Group_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitGroupClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_clauseContext group_clause() throws RecognitionException {
		Group_clauseContext _localctx = new Group_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_group_clause);
		try {
			_localctx = new GroupClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(604); match(GROUP);
			setState(605); match(BY);
			setState(606); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
	 
		public Having_clauseContext() { }
		public void copyFrom(Having_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingClauseContext extends Having_clauseContext {
		public TerminalNode HAVING() { return getToken(IdbParser.HAVING, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public HavingClauseContext(Having_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_having_clause);
		try {
			_localctx = new HavingClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(HAVING);
			setState(609); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		public Window_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_clause; }
	 
		public Window_clauseContext() { }
		public void copyFrom(Window_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowClauseContext extends Window_clauseContext {
		public TerminalNode WINDOW() { return getToken(IdbParser.WINDOW, 0); }
		public Window_specifier_listContext window_specifier_list() {
			return getRuleContext(Window_specifier_listContext.class,0);
		}
		public WindowClauseContext(Window_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_clauseContext window_clause() throws RecognitionException {
		Window_clauseContext _localctx = new Window_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_window_clause);
		try {
			_localctx = new WindowClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(611); match(WINDOW);
			setState(612); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_specifier_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Window_specifierContext window_specifier(int i) {
			return getRuleContext(Window_specifierContext.class,i);
		}
		public List<Window_specifierContext> window_specifier() {
			return getRuleContexts(Window_specifierContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Window_specifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_specifier_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWindow_specifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_specifier_listContext window_specifier_list() throws RecognitionException {
		Window_specifier_listContext _localctx = new Window_specifier_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_window_specifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); window_specifier();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(615); match(COMMA);
				setState(616); window_specifier();
				}
				}
				setState(621);
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

	public static class Window_specifierContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public Window_definitionContext window_definition() {
			return getRuleContext(Window_definitionContext.class,0);
		}
		public Window_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWindow_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_specifierContext window_specifier() throws RecognitionException {
		Window_specifierContext _localctx = new Window_specifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_window_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); window_name();
			setState(623); match(AS);
			setState(624); window_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_clauseContext extends ParserRuleContext {
		public Order_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_clause; }
	 
		public Order_clauseContext() { }
		public void copyFrom(Order_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrderClauseContext extends Order_clauseContext {
		public Sort_specifier_listContext sort_specifier_list() {
			return getRuleContext(Sort_specifier_listContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(IdbParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(IdbParser.BY, 0); }
		public OrderClauseContext(Order_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_clauseContext order_clause() throws RecognitionException {
		Order_clauseContext _localctx = new Order_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_order_clause);
		try {
			_localctx = new OrderClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(626); match(ORDER);
			setState(627); match(BY);
			setState(628); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Sort_specifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_specifier_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSort_specifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_specifier_listContext sort_specifier_list() throws RecognitionException {
		Sort_specifier_listContext _localctx = new Sort_specifier_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sort_specifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630); sort_specifier();
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631); match(COMMA);
					setState(632); sort_specifier();
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		public Order_specificationContext order_specification() {
			return getRuleContext(Order_specificationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Null_orderingContext null_ordering() {
			return getRuleContext(Null_orderingContext.class,0);
		}
		public Sort_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSort_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_specifierContext sort_specifier() throws RecognitionException {
		Sort_specifierContext _localctx = new Sort_specifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sort_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); expr(0);
			setState(640);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(639); order_specification();
				}
				break;
			}
			setState(643);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(642); null_ordering();
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

	public static class Order_specificationContext extends ParserRuleContext {
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode DESC() { return getToken(IdbParser.DESC, 0); }
		public TerminalNode USING() { return getToken(IdbParser.USING, 0); }
		public TerminalNode ASC() { return getToken(IdbParser.ASC, 0); }
		public Order_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOrder_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_specificationContext order_specification() throws RecognitionException {
		Order_specificationContext _localctx = new Order_specificationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_order_specification);
		try {
			setState(649);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(647); match(USING);
				setState(648); operators();
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode MODULAR() { return getToken(IdbParser.MODULAR, 0); }
		public TerminalNode GTH() { return getToken(IdbParser.GTH, 0); }
		public TerminalNode CUSTOME_OPERATOR() { return getToken(IdbParser.CUSTOME_OPERATOR, 0); }
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public TerminalNode DIVIDE() { return getToken(IdbParser.DIVIDE, 0); }
		public TerminalNode LTH() { return getToken(IdbParser.LTH, 0); }
		public TerminalNode SUB() { return getToken(IdbParser.SUB, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(((((_la - 382)) & ~0x3f) == 0 && ((1L << (_la - 382)) & ((1L << (LTH - 382)) | (1L << (GTH - 382)) | (1L << (PLUS - 382)) | (1L << (SUB - 382)) | (1L << (MULTIPLY - 382)) | (1L << (DIVIDE - 382)) | (1L << (MODULAR - 382)) | (1L << (CUSTOME_OPERATOR - 382)))) != 0)) ) {
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

	public static class Null_orderingContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(IdbParser.FIRST, 0); }
		public TerminalNode NULLS() { return getToken(IdbParser.NULLS, 0); }
		public TerminalNode LAST() { return getToken(IdbParser.LAST, 0); }
		public Null_orderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_ordering; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNull_ordering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_orderingContext null_ordering() throws RecognitionException {
		Null_orderingContext _localctx = new Null_orderingContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_null_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); match(NULLS);
			setState(654);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==LAST) ) {
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

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(IdbParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(IdbParser.ALL, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656); match(LIMIT);
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(657); count();
				}
				break;
			case 2:
				{
				setState(658); match(ALL);
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

	public static class Offset_clauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(IdbParser.OFFSET, 0); }
		public TerminalNode ROW() { return getToken(IdbParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(IdbParser.ROWS, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Offset_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOffset_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Offset_clauseContext offset_clause() throws RecognitionException {
		Offset_clauseContext _localctx = new Offset_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); match(OFFSET);
			setState(662); start();
			setState(664);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(663);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
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

	public static class Fetch_clauseContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(IdbParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(IdbParser.FIRST, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode ROW() { return getToken(IdbParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(IdbParser.ROWS, 0); }
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public TerminalNode FETCH() { return getToken(IdbParser.FETCH, 0); }
		public Fetch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFetch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_clauseContext fetch_clause() throws RecognitionException {
		Fetch_clauseContext _localctx = new Fetch_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fetch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); match(FETCH);
			setState(667);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(668); count();
				}
				break;
			}
			setState(671);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(672); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FOR() { return getToken(IdbParser.FOR, 0); }
		public TerminalNode NOWAIT() { return getToken(IdbParser.NOWAIT, 0); }
		public TerminalNode NO() { return getToken(IdbParser.NO, 0); }
		public TerminalNode OF() { return getToken(IdbParser.OF, 0); }
		public TerminalNode KEY() { return getToken(IdbParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(IdbParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(IdbParser.SHARE, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFor_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_for_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674); match(FOR);
			setState(682);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(675); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(676); match(NO);
				setState(677); match(KEY);
				setState(678); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(679); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(680); match(KEY);
				setState(681); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(686);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(684); match(OF);
				setState(685); table_name_list();
				}
			}

			setState(688); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public Simple_tableContext simple_table() {
			return getRuleContext(Simple_tableContext.class,0);
		}
		public Joined_tableContext joined_table() {
			return getRuleContext(Joined_tableContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_table_reference);
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695); joined_table(0);
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

	public static class Simple_tableContext extends ParserRuleContext {
		public Correlation_specificationContext correlation_specification() {
			return getRuleContext(Correlation_specificationContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public Simple_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSimple_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_tableContext simple_table() throws RecognitionException {
		Simple_tableContext _localctx = new Simple_tableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simple_table);
		try {
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(698); match(ONLY);
					}
					break;
				}
				setState(701); qualified_table_name();
				setState(703);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(702); match(MULTIPLY);
					}
					break;
				}
				setState(706);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(705); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708); derived_table();
				setState(710);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(709); correlation_specification();
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

	public static class Joined_tableContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(IdbParser.JOIN, 0); }
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode UNION() { return getToken(IdbParser.UNION, 0); }
		public TerminalNode NATURAL() { return getToken(IdbParser.NATURAL, 0); }
		public Simple_tableContext simple_table() {
			return getRuleContext(Simple_tableContext.class,0);
		}
		public List<Joined_tableContext> joined_table() {
			return getRuleContexts(Joined_tableContext.class);
		}
		public TerminalNode CROSS() { return getToken(IdbParser.CROSS, 0); }
		public Join_specificationContext join_specification() {
			return getRuleContext(Join_specificationContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Joined_tableContext joined_table(int i) {
			return getRuleContext(Joined_tableContext.class,i);
		}
		public Joined_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitJoined_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joined_tableContext joined_table() throws RecognitionException {
		return joined_table(0);
	}

	private Joined_tableContext joined_table(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Joined_tableContext _localctx = new Joined_tableContext(_ctx, _parentState);
		Joined_tableContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_joined_table, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(715); match(LEFT_PAREN);
				setState(716); joined_table(0);
				setState(717); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(719); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(742);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(722);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(723); match(CROSS);
						setState(724); match(JOIN);
						setState(725); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(726);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(727); match(UNION);
						setState(728); match(JOIN);
						setState(729); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(730);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(732);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(731); match(NATURAL);
							}
						}

						setState(735);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(734); join_type();
							}
						}

						setState(737); match(JOIN);
						setState(738); joined_table(0);
						setState(740);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(739); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode OUTER() { return getToken(IdbParser.OUTER, 0); }
		public Outer_join_typeContext outer_join_type() {
			return getRuleContext(Outer_join_typeContext.class,0);
		}
		public TerminalNode INNER() { return getToken(IdbParser.INNER, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_type);
		int _la;
		try {
			setState(752);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(747); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(748); outer_join_type();
				setState(750);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(749); match(OUTER);
					}
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

	public static class Outer_join_typeContext extends ParserRuleContext {
		public TerminalNode FULL() { return getToken(IdbParser.FULL, 0); }
		public TerminalNode LEFT() { return getToken(IdbParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(IdbParser.RIGHT, 0); }
		public Outer_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outer_join_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOuter_join_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outer_join_typeContext outer_join_type() throws RecognitionException {
		Outer_join_typeContext _localctx = new Outer_join_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) ) {
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

	public static class Correlation_specificationContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public Correlation_nameContext correlation_name() {
			return getRuleContext(Correlation_nameContext.class,0);
		}
		public Derived_column_listContext derived_column_list() {
			return getRuleContext(Derived_column_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Correlation_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlation_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCorrelation_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correlation_specificationContext correlation_specification() throws RecognitionException {
		Correlation_specificationContext _localctx = new Correlation_specificationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_correlation_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(756); match(AS);
				}
			}

			setState(759); correlation_name();
			setState(764);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(760); match(LEFT_PAREN);
				setState(761); derived_column_list();
				setState(762); match(RIGHT_PAREN);
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

	public static class Derived_column_listContext extends ParserRuleContext {
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Derived_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_column_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDerived_column_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_column_listContext derived_column_list() throws RecognitionException {
		Derived_column_listContext _localctx = new Derived_column_listContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_derived_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(IdbParser.LATERAL, 0); }
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDerived_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_derived_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(768); match(LATERAL);
				}
				break;
			}
			setState(773);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(771); table_subquery();
				}
				break;
			case LEFT:
			case RIGHT:
			case WITH:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
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
				setState(772); function();
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

	public static class Table_subqueryContext extends ParserRuleContext {
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Table_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTable_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_subqueryContext table_subquery() throws RecognitionException {
		Table_subqueryContext _localctx = new Table_subqueryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_table_subquery);
		try {
			setState(780);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775); subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776); match(LEFT_PAREN);
				setState(777); values_stmt();
				setState(778); match(RIGHT_PAREN);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public Order_clauseContext order_clause() {
			return getRuleContext(Order_clauseContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782); function_name();
			setState(783); match(LEFT_PAREN);
			setState(785);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(784); set_qualifier();
				}
				break;
			}
			setState(788);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (SOME - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SEQUENCES - 269)) | (1L << (SIMILAR - 269)) | (1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLEXISTS - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (CHAR - 333)) | (1L << (VARCHAR - 333)) | (1L << (NCHAR - 333)) | (1L << (NVARCHAR - 333)) | (1L << (DATE - 333)) | (1L << (INTERVAL - 333)) | (1L << (TIME - 333)) | (1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)))) != 0) || ((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (INTERSECT2D - 401)) | (1L << (INTERSECT3D - 401)) | (1L << (OVERLAP - 401)) | (1L << (LEFT_OF - 401)) | (1L << (RIGHT_OF - 401)) | (1L << (ABOVE - 401)) | (1L << (OVERLAPS_ABOVE - 401)) | (1L << (BELOW - 401)) | (1L << (BOX_EQUAL - 401)) | (1L << (DISTANCE - 401)) | (1L << (NOT_SIMILAR - 401)) | (1L << (SIMILAR_INSENSITIVE - 401)) | (1L << (NOT_SIMILAR_INSENSITIVE - 401)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 401)) | (1L << (JSON_AS_TEXT - 401)) | (1L << (JSON_OBJECT_AT_PATH - 401)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 401)) | (1L << (BIND_PARAMETER - 401)) | (1L << (NUM - 401)) | (1L << (REAL_NUM - 401)) | (1L << (CUSTOME_OPERATOR - 401)) | (1L << (IDENTIFIER - 401)) | (1L << (QUOTED_IDENTIFIER - 401)) | (1L << (REGEX - 401)) | (1L << (STRING_LITERAL - 401)))) != 0)) {
				{
				setState(787); function_args();
				}
			}

			setState(791);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(790); order_clause();
				}
			}

			setState(793); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitJoin_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_specificationContext join_specification() throws RecognitionException {
		Join_specificationContext _localctx = new Join_specificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_join_specification);
		try {
			setState(797);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(795); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(796); named_columns_join();
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

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(IdbParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); match(ON);
			setState(800); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode USING() { return getToken(IdbParser.USING, 0); }
		public Join_column_listContext join_column_list() {
			return getRuleContext(Join_column_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Named_columns_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_columns_join; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNamed_columns_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_columns_joinContext named_columns_join() throws RecognitionException {
		Named_columns_joinContext _localctx = new Named_columns_joinContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802); match(USING);
			setState(803); match(LEFT_PAREN);
			setState(804); join_column_list();
			setState(805); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_column_listContext extends ParserRuleContext {
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Join_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_column_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitJoin_column_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_column_listContext join_column_list() throws RecognitionException {
		Join_column_listContext _localctx = new Join_column_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_join_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); column_name_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_stmtContext extends ParserRuleContext {
		public Values_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_stmt; }
	 
		public Values_stmtContext() { }
		public void copyFrom(Values_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValuesStmtContext extends Values_stmtContext {
		public List<Expr_listContext> expr_list() {
			return getRuleContexts(Expr_listContext.class);
		}
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(IdbParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Expr_listContext expr_list(int i) {
			return getRuleContext(Expr_listContext.class,i);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Order_clauseContext order_clause() {
			return getRuleContext(Order_clauseContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(IdbParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(IdbParser.LEFT_PAREN); }
		public TerminalNode VALUES() { return getToken(IdbParser.VALUES, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(IdbParser.RIGHT_PAREN, i);
		}
		public ValuesStmtContext(Values_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitValuesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_stmtContext values_stmt() throws RecognitionException {
		Values_stmtContext _localctx = new Values_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_values_stmt);
		try {
			int _alt;
			_localctx = new ValuesStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(809); match(VALUES);
			setState(810); match(LEFT_PAREN);
			setState(811); expr_list();
			setState(812); match(RIGHT_PAREN);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(813); match(COMMA);
					setState(814); match(LEFT_PAREN);
					setState(815); expr_list();
					setState(816); match(RIGHT_PAREN);
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(823); order_clause();
				}
				break;
			}
			setState(827);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(826); limit_clause();
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

	public static class Search_conditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AND() { return getToken(IdbParser.AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarSubqueryContext extends ExprContext {
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ScalarSubqueryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitScalarSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullOrNotExprContext extends ExprContext {
		public TerminalNode NOTNULL() { return getToken(IdbParser.NOTNULL, 0); }
		public TerminalNode ISNULL() { return getToken(IdbParser.ISNULL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NullOrNotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNullOrNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XmlPredicateContext extends ExprContext {
		public Xml_predicateContext xml_predicate() {
			return getRuleContext(Xml_predicateContext.class,0);
		}
		public XmlPredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXmlPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprContext extends ExprContext {
		public Cast_exprContext cast_expr() {
			return getRuleContext(Cast_exprContext.class,0);
		}
		public CastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstValueContext extends ExprContext {
		public Const_valueContext const_value() {
			return getRuleContext(Const_valueContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public ConstValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitConstValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(IdbParser.SUB, 0); }
		public PlusSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitPlusSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastOpExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CAST_OPERATOR() { return getToken(IdbParser.CAST_OPERATOR, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public CastOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCastOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XmlParserExprContext extends ExprContext {
		public Xml_parse_exprContext xml_parse_expr() {
			return getRuleContext(Xml_parse_exprContext.class,0);
		}
		public XmlParserExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXmlParserExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorExprContext extends ExprContext {
		public TerminalNode PRIOR() { return getToken(IdbParser.PRIOR, 0); }
		public Qualified_column_nameContext qualified_column_name() {
			return getRuleContext(Qualified_column_nameContext.class,0);
		}
		public PriorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitPriorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ExprContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOtherOpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Any_other_operatorContext any_other_operator() {
			return getRuleContext(Any_other_operatorContext.class,0);
		}
		public UnaryOtherOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUnaryOtherOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<TerminalNode> LEFT_SQUARE() { return getTokens(IdbParser.LEFT_SQUARE); }
		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(IdbParser.LEFT_SQUARE, i);
		}
		public List<TerminalNode> RIGHT_SQUARE() { return getTokens(IdbParser.RIGHT_SQUARE); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(IdbParser.COLON, i);
		}
		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(IdbParser.RIGHT_SQUARE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(IdbParser.COLON); }
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleExprContext extends ExprContext {
		public Tuple_valueContext tuple_value() {
			return getRuleContext(Tuple_valueContext.class,0);
		}
		public TupleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTupleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikePredicateContext extends ExprContext {
		public TerminalNode ESCAPE() { return getToken(IdbParser.ESCAPE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Pattern_matcherContext pattern_matcher() {
			return getRuleContext(Pattern_matcherContext.class,0);
		}
		public LikePredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessOrGreatThanExprContext extends ExprContext {
		public TerminalNode GTH() { return getToken(IdbParser.GTH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTH() { return getToken(IdbParser.LTH, 0); }
		public LessOrGreatThanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitLessOrGreatThanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprWithSuffixContext extends ExprContext {
		public Expr_suffixContext expr_suffix() {
			return getRuleContext(Expr_suffixContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprWithSuffixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExprWithSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public ParenthesizedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public UnaryOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUnaryOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenPredicateContext extends ExprContext {
		public TerminalNode BETWEEN() { return getToken(IdbParser.BETWEEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AND() { return getToken(IdbParser.AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public BetweenPredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitBetweenPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ExprContext {
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public NumericLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(IdbParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(IdbParser.NOT_EQUAL, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InPredicateContext extends ExprContext {
		public TerminalNode IN() { return getToken(IdbParser.IN, 0); }
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
		public Tuple_valueContext tuple_value() {
			return getRuleContext(Tuple_valueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public InPredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeComparePredicateContext extends ExprContext {
		public Data_type_listContext data_type_list() {
			return getRuleContext(Data_type_listContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OF() { return getToken(IdbParser.OF, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode IS() { return getToken(IdbParser.IS, 0); }
		public TypeComparePredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTypeComparePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlapsExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OVERLAPS() { return getToken(IdbParser.OVERLAPS, 0); }
		public OverlapsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOverlapsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnExprContext extends ExprContext {
		public Qualified_column_nameContext qualified_column_name() {
			return getRuleContext(Qualified_column_nameContext.class,0);
		}
		public ColumnExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitColumnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaretExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CARET() { return getToken(IdbParser.CARET, 0); }
		public CaretExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCaretExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode OR() { return getToken(IdbParser.OR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueFunctionContext extends ExprContext {
		public Value_functionContext value_function() {
			return getRuleContext(Value_functionContext.class,0);
		}
		public ValueFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsDistinctExprContext extends ExprContext {
		public TerminalNode DISTINCT() { return getToken(IdbParser.DISTINCT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public TerminalNode IS() { return getToken(IdbParser.IS, 0); }
		public TerminalNode FROM() { return getToken(IdbParser.FROM, 0); }
		public IsDistinctExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitIsDistinctExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends ExprContext {
		public Array_constructorContext array_constructor() {
			return getRuleContext(Array_constructorContext.class,0);
		}
		public ArrayConstructorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsPredicateContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(IdbParser.EXISTS, 0); }
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public ExistsPredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExistsPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends ExprContext {
		public Row_constructorContext row_constructor() {
			return getRuleContext(Row_constructorContext.class,0);
		}
		public RowConstructorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseWhenContext extends ExprContext {
		public Case_whenContext case_when() {
			return getRuleContext(Case_whenContext.class,0);
		}
		public CaseWhenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OtherOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Any_other_operatorContext any_other_operator() {
			return getRuleContext(Any_other_operatorContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OtherOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitOtherOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public TerminalNode IS() { return getToken(IdbParser.IS, 0); }
		public IsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitIsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XmlSerializeExprContext extends ExprContext {
		public Xml_serialize_exprContext xml_serialize_expr() {
			return getRuleContext(Xml_serialize_exprContext.class,0);
		}
		public XmlSerializeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXmlSerializeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModExprContext extends ExprContext {
		public TerminalNode MODULAR() { return getToken(IdbParser.MODULAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(IdbParser.DIVIDE, 0); }
		public MulDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitMulDivModExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(832); unary_operator();
				setState(833); expr(34);
				}
				break;
			case 2:
				{
				_localctx = new UnaryOtherOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(835); any_other_operator();
				setState(836); expr(28);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(838); match(NOT);
				setState(839); expr(17);
				}
				break;
			case 4:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(840); unsigned_numeric_literal();
				}
				break;
			case 5:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(841); string_literal();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(842); qualified_column_name();
				}
				break;
			case 7:
				{
				_localctx = new ConstValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(843); data_type();
				setState(844); const_value();
				}
				break;
			case 8:
				{
				_localctx = new ExistsPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(847);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(846); match(NOT);
					}
				}

				setState(849); match(EXISTS);
				setState(850); scalar_subquery();
				}
				break;
			case 9:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(851); cast_expr();
				}
				break;
			case 10:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(852); array_constructor();
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(853); row_constructor();
				}
				break;
			case 12:
				{
				_localctx = new ValueFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(854); value_function();
				}
				break;
			case 13:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855); function();
				setState(857);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(856); over_clause();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new CaseWhenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(859); case_when();
				}
				break;
			case 15:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(860); match(LEFT_PAREN);
				setState(861); expr(0);
				setState(862); match(RIGHT_PAREN);
				}
				break;
			case 16:
				{
				_localctx = new ScalarSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY || _la==SOME) {
					{
					setState(864); quantifier();
					}
				}

				setState(867); scalar_subquery();
				}
				break;
			case 17:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(868); tuple_value();
				}
				break;
			case 18:
				{
				_localctx = new XmlPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(869); xml_predicate();
				}
				break;
			case 19:
				{
				_localctx = new XmlParserExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(870); xml_parse_expr();
				}
				break;
			case 20:
				{
				_localctx = new XmlSerializeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(871); xml_serialize_expr();
				}
				break;
			case 21:
				{
				_localctx = new PriorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(872); match(PRIOR);
				setState(873); qualified_column_name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(971);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new CaretExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(876);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(877); match(CARET);
						setState(878); expr(33);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(879);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(880);
						_la = _input.LA(1);
						if ( !(((((_la - 392)) & ~0x3f) == 0 && ((1L << (_la - 392)) & ((1L << (MULTIPLY - 392)) | (1L << (DIVIDE - 392)) | (1L << (MODULAR - 392)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(881); expr(33);
						}
						break;
					case 3:
						{
						_localctx = new PlusSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(882);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(883);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(884); expr(32);
						}
						break;
					case 4:
						{
						_localctx = new IsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(885);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(886); match(IS);
						setState(888);
						switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
						case 1:
							{
							setState(887); match(NOT);
							}
							break;
						}
						setState(890); expr(31);
						}
						break;
					case 5:
						{
						_localctx = new OtherOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(891);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(892); any_other_operator();
						setState(893); expr(28);
						}
						break;
					case 6:
						{
						_localctx = new IsDistinctExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(895);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(896); match(IS);
						setState(898);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(897); match(NOT);
							}
						}

						setState(900); match(DISTINCT);
						setState(901); match(FROM);
						setState(902); expr(26);
						}
						break;
					case 7:
						{
						_localctx = new BetweenPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(903);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(905);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(904); match(NOT);
							}
						}

						setState(907); match(BETWEEN);
						setState(908); expr(0);
						setState(909); match(AND);
						setState(910); expr(23);
						}
						break;
					case 8:
						{
						_localctx = new OverlapsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(912);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(913); match(OVERLAPS);
						setState(914); expr(22);
						}
						break;
					case 9:
						{
						_localctx = new LessOrGreatThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(915);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(916);
						_la = _input.LA(1);
						if ( !(_la==LTH || _la==GTH) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(917); expr(20);
						}
						break;
					case 10:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(918);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(919);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(920); expr(18);
						}
						break;
					case 11:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(921);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(922); match(AND);
						setState(923); expr(17);
						}
						break;
					case 12:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(924);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(925); match(OR);
						setState(926); expr(16);
						}
						break;
					case 13:
						{
						_localctx = new CastOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(927);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(928); match(CAST_OPERATOR);
						setState(929); data_type();
						}
						break;
					case 14:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(930);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(939); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(931); match(LEFT_SQUARE);
								setState(932); expr(0);
								setState(935);
								_la = _input.LA(1);
								if (_la==COLON) {
									{
									setState(933); match(COLON);
									setState(934); expr(0);
									}
								}

								setState(937); match(RIGHT_SQUARE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(941); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 15:
						{
						_localctx = new NullOrNotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(943);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(944);
						_la = _input.LA(1);
						if ( !(_la==ISNULL || _la==NOTNULL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 16:
						{
						_localctx = new TypeComparePredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(945);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(946); match(IS);
						setState(947); match(OF);
						setState(948); match(LEFT_PAREN);
						setState(949); data_type_list();
						setState(950); match(RIGHT_PAREN);
						}
						break;
					case 17:
						{
						_localctx = new InPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(952);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(954);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(953); match(NOT);
							}
						}

						setState(956); match(IN);
						setState(960);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(957); subquery();
							}
							break;
						case 2:
							{
							setState(958); values_stmt();
							}
							break;
						case 3:
							{
							setState(959); tuple_value();
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new LikePredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(962);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(963); pattern_matcher();
						setState(964); expr(0);
						setState(967);
						switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
						case 1:
							{
							setState(965); match(ESCAPE);
							setState(966); match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					case 19:
						{
						_localctx = new ExprWithSuffixContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(969);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(970); expr_suffix();
						}
						break;
					}
					} 
				}
				setState(975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unsigned_numeric_literalContext extends ParserRuleContext {
		public TerminalNode REAL_NUM() { return getToken(IdbParser.REAL_NUM, 0); }
		public TerminalNode NUM() { return getToken(IdbParser.NUM, 0); }
		public Unsigned_numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_numeric_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUnsigned_numeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_numeric_literalContext unsigned_numeric_literal() throws RecognitionException {
		Unsigned_numeric_literalContext _localctx = new Unsigned_numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unsigned_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==REAL_NUM) ) {
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode BIND_PARAMETER() { return getToken(IdbParser.BIND_PARAMETER, 0); }
		public TerminalNode DEFAULT() { return getToken(IdbParser.DEFAULT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode REGEX() { return getToken(IdbParser.REGEX, 0); }
		public TerminalNode NULL() { return getToken(IdbParser.NULL, 0); }
		public Datetime_literalContext datetime_literal() {
			return getRuleContext(Datetime_literalContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_string_literal);
		try {
			setState(985);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(978); match(STRING_LITERAL);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(979); match(REGEX);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(980); match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(981); match(DEFAULT);
				}
				break;
			case BIND_PARAMETER:
				enterOuterAlt(_localctx, 5);
				{
				setState(982); match(BIND_PARAMETER);
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(983); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 7);
				{
				setState(984); boolean_literal();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDatetime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_literalContext datetime_literal() throws RecognitionException {
		Datetime_literalContext _localctx = new Datetime_literalContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_datetime_literal);
		try {
			setState(991);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(987); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(988); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(989); date_literal();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(990); interval_literal();
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
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public TerminalNode INTERVAL() { return getToken(IdbParser.INTERVAL, 0); }
		public Interval_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInterval_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_literalContext interval_literal() throws RecognitionException {
		Interval_literalContext _localctx = new Interval_literalContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_interval_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(INTERVAL);
			setState(995);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(994); interval_precision();
				}
			}

			setState(997); ((Interval_literalContext)_localctx).interval_string = match(STRING_LITERAL);
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(998); interval_qualifier();
				}
				break;
			}
			setState(1002);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1001); interval_precision();
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
		public TerminalNode TO() { return getToken(IdbParser.TO, 0); }
		public Interval_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInterval_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_qualifierContext interval_qualifier() throws RecognitionException {
		Interval_qualifierContext _localctx = new Interval_qualifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_interval_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); primary_datetime_field();
			setState(1007);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1005); match(TO);
				setState(1006); primary_datetime_field();
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
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public Interval_precisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_precision; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInterval_precision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_precisionContext interval_precision() throws RecognitionException {
		Interval_precisionContext _localctx = new Interval_precisionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_interval_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009); match(LEFT_PAREN);
			setState(1010); unsigned_numeric_literal();
			setState(1011); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TIME() { return getToken(IdbParser.TIME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Time_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013); match(TIME);
			setState(1014); ((Time_literalContext)_localctx).time_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TIMESTAMP() { return getToken(IdbParser.TIMESTAMP, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016); match(TIMESTAMP);
			setState(1017); ((Timestamp_literalContext)_localctx).timestamp_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DATE() { return getToken(IdbParser.DATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); match(DATE);
			setState(1020); ((Date_literalContext)_localctx).date_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TRUE() { return getToken(IdbParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(IdbParser.UNKNOWN, 0); }
		public TerminalNode FALSE() { return getToken(IdbParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
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

	public static class Primary_datetime_fieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(IdbParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(IdbParser.MONTH, 0); }
		public TerminalNode HOUR() { return getToken(IdbParser.HOUR, 0); }
		public TerminalNode SECOND() { return getToken(IdbParser.SECOND, 0); }
		public TerminalNode DAY() { return getToken(IdbParser.DAY, 0); }
		public TerminalNode MINUTE() { return getToken(IdbParser.MINUTE, 0); }
		public Primary_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_datetime_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitPrimary_datetime_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_datetime_fieldContext primary_datetime_field() throws RecognitionException {
		Primary_datetime_fieldContext _localctx = new Primary_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_primary_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (DAY - 165)) | (1L << (HOUR - 165)) | (1L << (MINUTE - 165)) | (1L << (MONTH - 165)))) != 0) || _la==SECOND || _la==YEAR) ) {
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
		public TerminalNode ISODOW() { return getToken(IdbParser.ISODOW, 0); }
		public TerminalNode EPOCH() { return getToken(IdbParser.EPOCH, 0); }
		public TerminalNode QUARTER() { return getToken(IdbParser.QUARTER, 0); }
		public TerminalNode DOY() { return getToken(IdbParser.DOY, 0); }
		public TerminalNode MILLENNIUM() { return getToken(IdbParser.MILLENNIUM, 0); }
		public TerminalNode DECADE() { return getToken(IdbParser.DECADE, 0); }
		public TerminalNode MICROSECONDS() { return getToken(IdbParser.MICROSECONDS, 0); }
		public TerminalNode WEEK() { return getToken(IdbParser.WEEK, 0); }
		public TerminalNode CENTURY() { return getToken(IdbParser.CENTURY, 0); }
		public TerminalNode MILLISECONDS() { return getToken(IdbParser.MILLISECONDS, 0); }
		public TerminalNode ISOYEAR() { return getToken(IdbParser.ISOYEAR, 0); }
		public TerminalNode DOW() { return getToken(IdbParser.DOW, 0); }
		public Extended_datetime_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_datetime_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExtended_datetime_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extended_datetime_fieldContext extended_datetime_field() throws RecognitionException {
		Extended_datetime_fieldContext _localctx = new Extended_datetime_fieldContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_extended_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (CENTURY - 148)) | (1L << (DECADE - 148)) | (1L << (DOW - 148)) | (1L << (DOY - 148)) | (1L << (EPOCH - 148)) | (1L << (ISODOW - 148)) | (1L << (ISOYEAR - 148)))) != 0) || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (MICROSECONDS - 219)) | (1L << (MILLENNIUM - 219)) | (1L << (MILLISECONDS - 219)) | (1L << (QUARTER - 219)))) != 0) || _la==WEEK) ) {
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

	public static class Const_valueContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(IdbParser.BIND_PARAMETER, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Const_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitConst_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valueContext const_value() throws RecognitionException {
		Const_valueContext _localctx = new Const_valueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_const_value);
		try {
			setState(1032);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028); match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029); match(BIND_PARAMETER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1030); qualified_table_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1031); any_name();
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

	public static class Expr_suffixContext extends ParserRuleContext {
		public Column_nameContext collate_id;
		public TerminalNode DOCUMENT() { return getToken(IdbParser.DOCUMENT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(IdbParser.COLLATE, 0); }
		public TerminalNode TIME() { return getToken(IdbParser.TIME, 0); }
		public Time_zoneContext time_zone() {
			return getRuleContext(Time_zoneContext.class,0);
		}
		public TerminalNode IS() { return getToken(IdbParser.IS, 0); }
		public TerminalNode ZONE() { return getToken(IdbParser.ZONE, 0); }
		public TerminalNode AT() { return getToken(IdbParser.AT, 0); }
		public Expr_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_suffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExpr_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_suffixContext expr_suffix() throws RecognitionException {
		Expr_suffixContext _localctx = new Expr_suffixContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_expr_suffix);
		try {
			setState(1042);
			switch (_input.LA(1)) {
			case COLLATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034); match(COLLATE);
				setState(1035); ((Expr_suffixContext)_localctx).collate_id = column_name();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036); match(AT);
				setState(1037); match(TIME);
				setState(1038); match(ZONE);
				setState(1039); time_zone();
				}
				break;
			case IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040); match(IS);
				setState(1041); match(DOCUMENT);
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

	public static class Time_zoneContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Time_zoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_zone; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTime_zone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_zoneContext time_zone() throws RecognitionException {
		Time_zoneContext _localctx = new Time_zoneContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_time_zone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_quantifier);
		try {
			setState(1048);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046); all();
				}
				break;
			case ANY:
			case SOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047); some();
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
		public TerminalNode ALL() { return getToken(IdbParser.ALL, 0); }
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050); match(ALL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SOME() { return getToken(IdbParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(IdbParser.ANY, 0); }
		public SomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeContext some() throws RecognitionException {
		SomeContext _localctx = new SomeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
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

	public static class Compare_operatorContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(IdbParser.GEQ, 0); }
		public TerminalNode GTH() { return getToken(IdbParser.GTH, 0); }
		public TerminalNode LEQ() { return getToken(IdbParser.LEQ, 0); }
		public TerminalNode EQUAL() { return getToken(IdbParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(IdbParser.NOT_EQUAL, 0); }
		public TerminalNode LTH() { return getToken(IdbParser.LTH, 0); }
		public Compare_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCompare_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_operatorContext compare_operator() throws RecognitionException {
		Compare_operatorContext _localctx = new Compare_operatorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_compare_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_la = _input.LA(1);
			if ( !(((((_la - 376)) & ~0x3f) == 0 && ((1L << (_la - 376)) & ((1L << (EQUAL - 376)) | (1L << (NOT_EQUAL - 376)) | (1L << (LTH - 376)) | (1L << (LEQ - 376)) | (1L << (GTH - 376)) | (1L << (GEQ - 376)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(IdbParser.SUB, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==SUB) ) {
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

	public static class Any_other_operatorContext extends ParserRuleContext {
		public TerminalNode NOT_SIMILAR() { return getToken(IdbParser.NOT_SIMILAR, 0); }
		public TerminalNode CONCATENATION_OPERATOR() { return getToken(IdbParser.CONCATENATION_OPERATOR, 0); }
		public TerminalNode GEQ() { return getToken(IdbParser.GEQ, 0); }
		public TerminalNode JSON_OBJECT_AT_PATH() { return getToken(IdbParser.JSON_OBJECT_AT_PATH, 0); }
		public TerminalNode JSON_AS_TEXT() { return getToken(IdbParser.JSON_AS_TEXT, 0); }
		public TerminalNode JSON_ARRAY_ELEMENT_OR_FIELD() { return getToken(IdbParser.JSON_ARRAY_ELEMENT_OR_FIELD, 0); }
		public TerminalNode NOT_SIMILAR_INSENSITIVE() { return getToken(IdbParser.NOT_SIMILAR_INSENSITIVE, 0); }
		public TerminalNode LEQ() { return getToken(IdbParser.LEQ, 0); }
		public TerminalNode JSON_OBJECT_AT_PATH_AS_TEXT() { return getToken(IdbParser.JSON_OBJECT_AT_PATH_AS_TEXT, 0); }
		public TerminalNode SIMILAR_INSENSITIVE() { return getToken(IdbParser.SIMILAR_INSENSITIVE, 0); }
		public Custome_operatorContext custome_operator() {
			return getRuleContext(Custome_operatorContext.class,0);
		}
		public Any_other_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_other_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitAny_other_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_other_operatorContext any_other_operator() throws RecognitionException {
		Any_other_operatorContext _localctx = new Any_other_operatorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_any_other_operator);
		try {
			setState(1069);
			switch (_input.LA(1)) {
			case LEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058); match(LEQ);
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059); match(GEQ);
				}
				break;
			case CONCATENATION_OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060); match(CONCATENATION_OPERATOR);
				}
				break;
			case NOT_SIMILAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1061); match(NOT_SIMILAR);
				}
				break;
			case SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1062); match(SIMILAR_INSENSITIVE);
				}
				break;
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1063); match(NOT_SIMILAR_INSENSITIVE);
				}
				break;
			case JSON_ARRAY_ELEMENT_OR_FIELD:
				enterOuterAlt(_localctx, 7);
				{
				setState(1064); match(JSON_ARRAY_ELEMENT_OR_FIELD);
				}
				break;
			case JSON_AS_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1065); match(JSON_AS_TEXT);
				}
				break;
			case JSON_OBJECT_AT_PATH:
				enterOuterAlt(_localctx, 9);
				{
				setState(1066); match(JSON_OBJECT_AT_PATH);
				}
				break;
			case JSON_OBJECT_AT_PATH_AS_TEXT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1067); match(JSON_OBJECT_AT_PATH_AS_TEXT);
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
			case CUSTOME_OPERATOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(1068); custome_operator();
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

	public static class Custome_operatorContext extends ParserRuleContext {
		public TerminalNode CUSTOME_OPERATOR() { return getToken(IdbParser.CUSTOME_OPERATOR, 0); }
		public Postgis_operatorContext postgis_operator() {
			return getRuleContext(Postgis_operatorContext.class,0);
		}
		public Custome_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custome_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCustome_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Custome_operatorContext custome_operator() throws RecognitionException {
		Custome_operatorContext _localctx = new Custome_operatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_custome_operator);
		try {
			setState(1073);
			switch (_input.LA(1)) {
			case CUSTOME_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071); match(CUSTOME_OPERATOR);
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
				setState(1072); postgis_operator();
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
		public TerminalNode BOX_EQUAL() { return getToken(IdbParser.BOX_EQUAL, 0); }
		public TerminalNode DISTANCE() { return getToken(IdbParser.DISTANCE, 0); }
		public TerminalNode ABOVE() { return getToken(IdbParser.ABOVE, 0); }
		public TerminalNode RIGHT_OF() { return getToken(IdbParser.RIGHT_OF, 0); }
		public TerminalNode INTERSECT3D() { return getToken(IdbParser.INTERSECT3D, 0); }
		public TerminalNode BELOW() { return getToken(IdbParser.BELOW, 0); }
		public TerminalNode OVERLAPS_ABOVE() { return getToken(IdbParser.OVERLAPS_ABOVE, 0); }
		public TerminalNode LEFT_OF() { return getToken(IdbParser.LEFT_OF, 0); }
		public TerminalNode INTERSECT2D() { return getToken(IdbParser.INTERSECT2D, 0); }
		public TerminalNode OVERLAP() { return getToken(IdbParser.OVERLAP, 0); }
		public Postgis_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postgis_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitPostgis_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postgis_operatorContext postgis_operator() throws RecognitionException {
		Postgis_operatorContext _localctx = new Postgis_operatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_la = _input.LA(1);
			if ( !(((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (INTERSECT2D - 401)) | (1L << (INTERSECT3D - 401)) | (1L << (OVERLAP - 401)) | (1L << (LEFT_OF - 401)) | (1L << (RIGHT_OF - 401)) | (1L << (ABOVE - 401)) | (1L << (OVERLAPS_ABOVE - 401)) | (1L << (BELOW - 401)) | (1L << (BOX_EQUAL - 401)) | (1L << (DISTANCE - 401)))) != 0)) ) {
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

	public static class Scalar_subqueryContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Scalar_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitScalar_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_subqueryContext scalar_subquery() throws RecognitionException {
		Scalar_subqueryContext _localctx = new Scalar_subqueryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077); subquery();
			}
		}
		catch (RecognitionException re) {
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
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Tuple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTuple_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_valueContext tuple_value() throws RecognitionException {
		Tuple_valueContext _localctx = new Tuple_valueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_tuple_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079); match(LEFT_PAREN);
			setState(1080); expr_list();
			setState(1081); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_whenContext extends ParserRuleContext {
		public List<TerminalNode> THEN() { return getTokens(IdbParser.THEN); }
		public TerminalNode WHEN(int i) {
			return getToken(IdbParser.WHEN, i);
		}
		public TerminalNode THEN(int i) {
			return getToken(IdbParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(IdbParser.ELSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CASE() { return getToken(IdbParser.CASE, 0); }
		public List<TerminalNode> WHEN() { return getTokens(IdbParser.WHEN); }
		public TerminalNode END() { return getToken(IdbParser.END, 0); }
		public Case_whenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCase_when(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_whenContext case_when() throws RecognitionException {
		Case_whenContext _localctx = new Case_whenContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_case_when);
		int _la;
		try {
			setState(1116);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083); match(CASE);
				setState(1084); expr(0);
				setState(1090); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1085); match(WHEN);
					setState(1086); expr(0);
					setState(1087); match(THEN);
					setState(1088); expr(0);
					}
					}
					setState(1092); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1096);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1094); match(ELSE);
					setState(1095); expr(0);
					}
				}

				setState(1098); match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100); match(CASE);
				setState(1106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1101); match(WHEN);
					setState(1102); expr(0);
					setState(1103); match(THEN);
					setState(1104); expr(0);
					}
					}
					setState(1108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1112);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1110); match(ELSE);
					setState(1111); expr(0);
					}
				}

				setState(1114); match(END);
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

	public static class Cast_exprContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(IdbParser.CAST, 0); }
		public Cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_exprContext cast_expr() throws RecognitionException {
		Cast_exprContext _localctx = new Cast_exprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118); match(CAST);
			setState(1119); match(LEFT_PAREN);
			setState(1120); expr(0);
			setState(1121); match(AS);
			setState(1122); data_type();
			setState(1123); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_functionContext extends ParserRuleContext {
		public Trim_functionContext trim_function() {
			return getRuleContext(Trim_functionContext.class,0);
		}
		public Substring_functionContext substring_function() {
			return getRuleContext(Substring_functionContext.class,0);
		}
		public Extract_functionContext extract_function() {
			return getRuleContext(Extract_functionContext.class,0);
		}
		public Bit_position_functionContext bit_position_function() {
			return getRuleContext(Bit_position_functionContext.class,0);
		}
		public Value_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitValue_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_functionContext value_function() throws RecognitionException {
		Value_functionContext _localctx = new Value_functionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_value_function);
		try {
			setState(1129);
			switch (_input.LA(1)) {
			case POSITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125); bit_position_function();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126); extract_function();
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127); substring_function();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1128); trim_function();
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
		public TerminalNode IN() { return getToken(IdbParser.IN, 0); }
		public TerminalNode POSITION() { return getToken(IdbParser.POSITION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Bit_position_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_position_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitBit_position_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_position_functionContext bit_position_function() throws RecognitionException {
		Bit_position_functionContext _localctx = new Bit_position_functionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_bit_position_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131); match(POSITION);
			setState(1132); match(LEFT_PAREN);
			setState(1133); expr(0);
			setState(1134); match(IN);
			setState(1135); expr(0);
			setState(1136); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_functionContext extends ParserRuleContext {
		public Extract_fieldContext extract_field_string;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Extract_fieldContext extract_field() {
			return getRuleContext(Extract_fieldContext.class,0);
		}
		public TerminalNode EXTRACT() { return getToken(IdbParser.EXTRACT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(IdbParser.FROM, 0); }
		public Extract_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExtract_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_functionContext extract_function() throws RecognitionException {
		Extract_functionContext _localctx = new Extract_functionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_extract_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); match(EXTRACT);
			setState(1139); match(LEFT_PAREN);
			setState(1140); ((Extract_functionContext)_localctx).extract_field_string = extract_field();
			setState(1141); match(FROM);
			setState(1142); expr(0);
			setState(1143); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExtract_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extract_fieldContext extract_field() throws RecognitionException {
		Extract_fieldContext _localctx = new Extract_fieldContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_extract_field);
		try {
			setState(1148);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1145); primary_datetime_field();
				}
				break;
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146); time_zone_field();
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
				setState(1147); extended_datetime_field();
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
		public TerminalNode TIMEZONE_MINUTE() { return getToken(IdbParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode TIMEZONE() { return getToken(IdbParser.TIMEZONE, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(IdbParser.TIMEZONE_HOUR, 0); }
		public Time_zone_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_zone_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTime_zone_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_zone_fieldContext time_zone_field() throws RecognitionException {
		Time_zone_fieldContext _localctx = new Time_zone_fieldContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_time_zone_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_la = _input.LA(1);
			if ( !(((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (TIMEZONE - 284)) | (1L << (TIMEZONE_HOUR - 284)) | (1L << (TIMEZONE_MINUTE - 284)))) != 0)) ) {
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

	public static class Substring_functionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(IdbParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode SUBSTRING() { return getToken(IdbParser.SUBSTRING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(IdbParser.FROM, 0); }
		public Substring_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSubstring_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Substring_functionContext substring_function() throws RecognitionException {
		Substring_functionContext _localctx = new Substring_functionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_substring_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152); match(SUBSTRING);
			setState(1153); match(LEFT_PAREN);
			setState(1154); expr(0);
			setState(1157);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1155); match(FROM);
				setState(1156); expr(0);
				}
			}

			setState(1161);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1159); match(FOR);
				setState(1160); expr(0);
				}
			}

			setState(1163); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TRIM() { return getToken(IdbParser.TRIM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Trim_operandsContext trim_operands() {
			return getRuleContext(Trim_operandsContext.class,0);
		}
		public Trim_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTrim_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_functionContext trim_function() throws RecognitionException {
		Trim_functionContext _localctx = new Trim_functionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_trim_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165); match(TRIM);
			setState(1166); match(LEFT_PAREN);
			setState(1167); trim_operands();
			setState(1168); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext trim_character;
		public ExprContext trim_source;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode COMMA() { return getToken(IdbParser.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Trim_specificationContext trim_specification() {
			return getRuleContext(Trim_specificationContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IdbParser.FROM, 0); }
		public Trim_operandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_operands; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTrim_operands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_operandsContext trim_operands() throws RecognitionException {
		Trim_operandsContext _localctx = new Trim_operandsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_trim_operands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1171);
				_la = _input.LA(1);
				if (_la==BOTH || _la==LEADING || _la==TRAILING) {
					{
					setState(1170); trim_specification();
					}
				}

				setState(1174);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (SOME - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SEQUENCES - 269)) | (1L << (SIMILAR - 269)) | (1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLEXISTS - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (CHAR - 333)) | (1L << (VARCHAR - 333)) | (1L << (NCHAR - 333)) | (1L << (NVARCHAR - 333)) | (1L << (DATE - 333)) | (1L << (INTERVAL - 333)) | (1L << (TIME - 333)) | (1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)))) != 0) || ((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (INTERSECT2D - 401)) | (1L << (INTERSECT3D - 401)) | (1L << (OVERLAP - 401)) | (1L << (LEFT_OF - 401)) | (1L << (RIGHT_OF - 401)) | (1L << (ABOVE - 401)) | (1L << (OVERLAPS_ABOVE - 401)) | (1L << (BELOW - 401)) | (1L << (BOX_EQUAL - 401)) | (1L << (DISTANCE - 401)) | (1L << (NOT_SIMILAR - 401)) | (1L << (SIMILAR_INSENSITIVE - 401)) | (1L << (NOT_SIMILAR_INSENSITIVE - 401)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 401)) | (1L << (JSON_AS_TEXT - 401)) | (1L << (JSON_OBJECT_AT_PATH - 401)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 401)) | (1L << (BIND_PARAMETER - 401)) | (1L << (NUM - 401)) | (1L << (REAL_NUM - 401)) | (1L << (CUSTOME_OPERATOR - 401)) | (1L << (IDENTIFIER - 401)) | (1L << (QUOTED_IDENTIFIER - 401)) | (1L << (REGEX - 401)) | (1L << (STRING_LITERAL - 401)))) != 0)) {
					{
					setState(1173); ((Trim_operandsContext)_localctx).trim_character = expr(0);
					}
				}

				setState(1176); match(FROM);
				}
				break;
			}
			setState(1179); ((Trim_operandsContext)_localctx).trim_source = expr(0);
			setState(1182);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1180); match(COMMA);
				setState(1181); ((Trim_operandsContext)_localctx).trim_character = expr(0);
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

	public static class Trim_specificationContext extends ParserRuleContext {
		public TerminalNode BOTH() { return getToken(IdbParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(IdbParser.TRAILING, 0); }
		public TerminalNode LEADING() { return getToken(IdbParser.LEADING, 0); }
		public Trim_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTrim_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_specificationContext trim_specification() throws RecognitionException {
		Trim_specificationContext _localctx = new Trim_specificationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			_la = _input.LA(1);
			if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
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

	public static class Array_constructorContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE() { return getToken(IdbParser.LEFT_SQUARE, 0); }
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE() { return getToken(IdbParser.RIGHT_SQUARE, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(IdbParser.ARRAY, 0); }
		public Array_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitArray_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_constructorContext array_constructor() throws RecognitionException {
		Array_constructorContext _localctx = new Array_constructorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_array_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186); match(ARRAY);
			setState(1193);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(1187); scalar_subquery();
				}
				break;
			case LEFT_SQUARE:
				{
				setState(1188); match(LEFT_SQUARE);
				setState(1190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (SOME - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SEQUENCES - 269)) | (1L << (SIMILAR - 269)) | (1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLEXISTS - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (CHAR - 333)) | (1L << (VARCHAR - 333)) | (1L << (NCHAR - 333)) | (1L << (NVARCHAR - 333)) | (1L << (DATE - 333)) | (1L << (INTERVAL - 333)) | (1L << (TIME - 333)) | (1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)))) != 0) || ((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (INTERSECT2D - 401)) | (1L << (INTERSECT3D - 401)) | (1L << (OVERLAP - 401)) | (1L << (LEFT_OF - 401)) | (1L << (RIGHT_OF - 401)) | (1L << (ABOVE - 401)) | (1L << (OVERLAPS_ABOVE - 401)) | (1L << (BELOW - 401)) | (1L << (BOX_EQUAL - 401)) | (1L << (DISTANCE - 401)) | (1L << (NOT_SIMILAR - 401)) | (1L << (SIMILAR_INSENSITIVE - 401)) | (1L << (NOT_SIMILAR_INSENSITIVE - 401)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 401)) | (1L << (JSON_AS_TEXT - 401)) | (1L << (JSON_OBJECT_AT_PATH - 401)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 401)) | (1L << (BIND_PARAMETER - 401)) | (1L << (NUM - 401)) | (1L << (REAL_NUM - 401)) | (1L << (CUSTOME_OPERATOR - 401)) | (1L << (IDENTIFIER - 401)) | (1L << (QUOTED_IDENTIFIER - 401)) | (1L << (REGEX - 401)) | (1L << (STRING_LITERAL - 401)))) != 0)) {
					{
					setState(1189); expr_list();
					}
				}

				setState(1192); match(RIGHT_SQUARE);
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

	public static class Row_constructorContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(IdbParser.ROW, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Row_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitRow_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_constructorContext row_constructor() throws RecognitionException {
		Row_constructorContext _localctx = new Row_constructorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_row_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195); match(ROW);
			setState(1196); match(LEFT_PAREN);
			setState(1198);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (SOME - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SEQUENCES - 269)) | (1L << (SIMILAR - 269)) | (1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLEXISTS - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (CHAR - 333)) | (1L << (VARCHAR - 333)) | (1L << (NCHAR - 333)) | (1L << (NVARCHAR - 333)) | (1L << (DATE - 333)) | (1L << (INTERVAL - 333)) | (1L << (TIME - 333)) | (1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)))) != 0) || ((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (INTERSECT2D - 401)) | (1L << (INTERSECT3D - 401)) | (1L << (OVERLAP - 401)) | (1L << (LEFT_OF - 401)) | (1L << (RIGHT_OF - 401)) | (1L << (ABOVE - 401)) | (1L << (OVERLAPS_ABOVE - 401)) | (1L << (BELOW - 401)) | (1L << (BOX_EQUAL - 401)) | (1L << (DISTANCE - 401)) | (1L << (NOT_SIMILAR - 401)) | (1L << (SIMILAR_INSENSITIVE - 401)) | (1L << (NOT_SIMILAR_INSENSITIVE - 401)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 401)) | (1L << (JSON_AS_TEXT - 401)) | (1L << (JSON_OBJECT_AT_PATH - 401)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 401)) | (1L << (BIND_PARAMETER - 401)) | (1L << (NUM - 401)) | (1L << (REAL_NUM - 401)) | (1L << (CUSTOME_OPERATOR - 401)) | (1L << (IDENTIFIER - 401)) | (1L << (QUOTED_IDENTIFIER - 401)) | (1L << (REGEX - 401)) | (1L << (STRING_LITERAL - 401)))) != 0)) {
				{
				setState(1197); expr_list();
				}
			}

			setState(1200); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitPattern_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_matcherContext pattern_matcher() throws RecognitionException {
		Pattern_matcherContext _localctx = new Pattern_matcherContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_pattern_matcher);
		int _la;
		try {
			setState(1207);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1202); match(NOT);
					}
				}

				setState(1205); negativable_matcher();
				}
				break;
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206); regex_matcher();
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
		public TerminalNode SIMILAR() { return getToken(IdbParser.SIMILAR, 0); }
		public TerminalNode REGEXP() { return getToken(IdbParser.REGEXP, 0); }
		public TerminalNode ILIKE() { return getToken(IdbParser.ILIKE, 0); }
		public TerminalNode RLIKE() { return getToken(IdbParser.RLIKE, 0); }
		public TerminalNode TO() { return getToken(IdbParser.TO, 0); }
		public TerminalNode LIKE() { return getToken(IdbParser.LIKE, 0); }
		public Negativable_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativable_matcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNegativable_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negativable_matcherContext negativable_matcher() throws RecognitionException {
		Negativable_matcherContext _localctx = new Negativable_matcherContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_negativable_matcher);
		try {
			setState(1215);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209); match(LIKE);
				}
				break;
			case ILIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210); match(ILIKE);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211); match(REGEXP);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1212); match(RLIKE);
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1213); match(SIMILAR);
				setState(1214); match(TO);
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
		public TerminalNode NOT_SIMILAR() { return getToken(IdbParser.NOT_SIMILAR, 0); }
		public TerminalNode TILDE() { return getToken(IdbParser.TILDE, 0); }
		public TerminalNode NOT_SIMILAR_INSENSITIVE() { return getToken(IdbParser.NOT_SIMILAR_INSENSITIVE, 0); }
		public TerminalNode SIMILAR_INSENSITIVE() { return getToken(IdbParser.SIMILAR_INSENSITIVE, 0); }
		public Regex_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_matcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitRegex_matcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regex_matcherContext regex_matcher() throws RecognitionException {
		Regex_matcherContext _localctx = new Regex_matcherContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_la = _input.LA(1);
			if ( !(((((_la - 400)) & ~0x3f) == 0 && ((1L << (_la - 400)) & ((1L << (TILDE - 400)) | (1L << (NOT_SIMILAR - 400)) | (1L << (SIMILAR_INSENSITIVE - 400)) | (1L << (NOT_SIMILAR_INSENSITIVE - 400)))) != 0)) ) {
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

	public static class Xml_parse_exprContext extends ParserRuleContext {
		public TerminalNode DOCUMENT() { return getToken(IdbParser.DOCUMENT, 0); }
		public TerminalNode CONTENT() { return getToken(IdbParser.CONTENT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode XMLPARSE() { return getToken(IdbParser.XMLPARSE, 0); }
		public Xml_valueContext xml_value() {
			return getRuleContext(Xml_valueContext.class,0);
		}
		public Xml_parse_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_parse_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXml_parse_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_parse_exprContext xml_parse_expr() throws RecognitionException {
		Xml_parse_exprContext _localctx = new Xml_parse_exprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_xml_parse_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219); match(XMLPARSE);
			setState(1220); match(LEFT_PAREN);
			setState(1221);
			_la = _input.LA(1);
			if ( !(_la==CONTENT || _la==DOCUMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1222); xml_value();
			setState(1223); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_serialize_exprContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public TerminalNode DOCUMENT() { return getToken(IdbParser.DOCUMENT, 0); }
		public TerminalNode XMLSERIALIZE() { return getToken(IdbParser.XMLSERIALIZE, 0); }
		public TerminalNode CONTENT() { return getToken(IdbParser.CONTENT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Xml_valueContext xml_value() {
			return getRuleContext(Xml_valueContext.class,0);
		}
		public Xml_serialize_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_serialize_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXml_serialize_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_serialize_exprContext xml_serialize_expr() throws RecognitionException {
		Xml_serialize_exprContext _localctx = new Xml_serialize_exprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_xml_serialize_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225); match(XMLSERIALIZE);
			setState(1226); match(LEFT_PAREN);
			setState(1227);
			_la = _input.LA(1);
			if ( !(_la==CONTENT || _la==DOCUMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1228); xml_value();
			setState(1229); match(AS);
			setState(1230); data_type();
			setState(1231); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_valueContext extends ParserRuleContext {
		public TerminalNode BIND_PARAMETER() { return getToken(IdbParser.BIND_PARAMETER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Xml_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXml_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_valueContext xml_value() throws RecognitionException {
		Xml_valueContext _localctx = new Xml_valueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_xml_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_la = _input.LA(1);
			if ( !(_la==BIND_PARAMETER || _la==STRING_LITERAL) ) {
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

	public static class Xml_predicateContext extends ParserRuleContext {
		public List<By_refContext> by_ref() {
			return getRuleContexts(By_refContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode XMLEXISTS() { return getToken(IdbParser.XMLEXISTS, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public By_refContext by_ref(int i) {
			return getRuleContext(By_refContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode PASSING() { return getToken(IdbParser.PASSING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Xml_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXml_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_predicateContext xml_predicate() throws RecognitionException {
		Xml_predicateContext _localctx = new Xml_predicateContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_xml_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235); match(XMLEXISTS);
			setState(1236); match(LEFT_PAREN);
			setState(1237); expr(0);
			setState(1238); match(PASSING);
			setState(1240);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1239); by_ref();
				}
			}

			setState(1242); expr(0);
			setState(1244);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1243); by_ref();
				}
			}

			setState(1246); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_functionContext extends ParserRuleContext {
		public TerminalNode YES() { return getToken(IdbParser.YES, 0); }
		public TerminalNode XMLROOT() { return getToken(IdbParser.XMLROOT, 0); }
		public List<TerminalNode> VALUE() { return getTokens(IdbParser.VALUE); }
		public TerminalNode VERSION() { return getToken(IdbParser.VERSION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NO() { return getTokens(IdbParser.NO); }
		public TerminalNode STANDALONE() { return getToken(IdbParser.STANDALONE, 0); }
		public TerminalNode NO(int i) {
			return getToken(IdbParser.NO, i);
		}
		public TerminalNode VALUE(int i) {
			return getToken(IdbParser.VALUE, i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Xml_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitXml_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_functionContext xml_function() throws RecognitionException {
		Xml_functionContext _localctx = new Xml_functionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_xml_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248); match(XMLROOT);
			setState(1249); match(LEFT_PAREN);
			setState(1250); expr(0);
			setState(1255);
			switch (_input.LA(1)) {
			case VERSION:
				{
				setState(1251); match(VERSION);
				setState(1252); expr(0);
				}
				break;
			case NO:
				{
				setState(1253); match(NO);
				setState(1254); match(VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1265);
			_la = _input.LA(1);
			if (_la==STANDALONE) {
				{
				setState(1257); match(STANDALONE);
				setState(1263);
				switch (_input.LA(1)) {
				case YES:
					{
					setState(1258); match(YES);
					}
					break;
				case NO:
					{
					setState(1259); match(NO);
					setState(1261);
					_la = _input.LA(1);
					if (_la==VALUE) {
						{
						setState(1260); match(VALUE);
						}
					}

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

	public static class By_refContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(IdbParser.REF, 0); }
		public TerminalNode BY() { return getToken(IdbParser.BY, 0); }
		public By_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by_ref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitBy_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final By_refContext by_ref() throws RecognitionException {
		By_refContext _localctx = new By_refContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_by_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267); match(BY);
			setState(1268); match(REF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1270); expr(0);
			setState(1275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1271); match(COMMA);
					setState(1272); expr(0);
					}
					} 
				}
				setState(1277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class Data_typeContext extends ParserRuleContext {
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(IdbParser.LEFT_SQUARE, i);
		}
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode TIME() { return getToken(IdbParser.TIME, 0); }
		public List<Variable_lengthContext> variable_length() {
			return getRuleContexts(Variable_lengthContext.class);
		}
		public List<TerminalNode> RIGHT_SQUARE() { return getTokens(IdbParser.RIGHT_SQUARE); }
		public Variable_lengthContext variable_length(int i) {
			return getRuleContext(Variable_lengthContext.class,i);
		}
		public TerminalNode WITH() { return getToken(IdbParser.WITH, 0); }
		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(IdbParser.RIGHT_SQUARE, i);
		}
		public Interval_fieldsContext interval_fields() {
			return getRuleContext(Interval_fieldsContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public List<TerminalNode> LEFT_SQUARE() { return getTokens(IdbParser.LEFT_SQUARE); }
		public TerminalNode COMMA() { return getToken(IdbParser.COMMA, 0); }
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode ZONE() { return getToken(IdbParser.ZONE, 0); }
		public TerminalNode WITHOUT() { return getToken(IdbParser.WITHOUT, 0); }
		public TerminalNode INTERVAL() { return getToken(IdbParser.INTERVAL, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_data_type);
		int _la;
		try {
			int _alt;
			setState(1320);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1278); any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1300);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1283); match(LEFT_PAREN);
					setState(1284); precision();
					setState(1287);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1285); match(COMMA);
						setState(1286); scale();
						}
					}

					setState(1289); match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(1296); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1291); match(LEFT_SQUARE);
							setState(1293);
							_la = _input.LA(1);
							if (_la==NUM) {
								{
								setState(1292); variable_length();
								}
							}

							setState(1295); match(RIGHT_SQUARE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1298); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(1305);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1302);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1303); match(TIME);
					setState(1304); match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307); match(INTERVAL);
				setState(1312);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1308); match(LEFT_SQUARE);
					setState(1309); interval_fields();
					setState(1310); match(RIGHT_SQUARE);
					}
					break;
				}
				setState(1318);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1314); match(LEFT_PAREN);
					setState(1315); precision();
					setState(1316); match(RIGHT_PAREN);
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

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IdbParser.NUM, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IdbParser.NUM, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_lengthContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IdbParser.NUM, 0); }
		public Variable_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitVariable_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_lengthContext variable_length() throws RecognitionException {
		Variable_lengthContext _localctx = new Variable_lengthContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_variable_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_fieldsContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(IdbParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(IdbParser.MONTH, 0); }
		public TerminalNode HOUR() { return getToken(IdbParser.HOUR, 0); }
		public TerminalNode SECOND() { return getToken(IdbParser.SECOND, 0); }
		public TerminalNode DAY() { return getToken(IdbParser.DAY, 0); }
		public TerminalNode TO() { return getToken(IdbParser.TO, 0); }
		public TerminalNode MINUTE() { return getToken(IdbParser.MINUTE, 0); }
		public Interval_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_fields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitInterval_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_fieldsContext interval_fields() throws RecognitionException {
		Interval_fieldsContext _localctx = new Interval_fieldsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_interval_fields);
		try {
			setState(1355);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328); match(YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329); match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330); match(DAY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1331); match(HOUR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1332); match(MINUTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1333); match(SECOND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1334); match(YEAR);
				setState(1335); match(TO);
				setState(1336); match(MONTH);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1337); match(DAY);
				setState(1338); match(TO);
				setState(1339); match(HOUR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1340); match(DAY);
				setState(1341); match(TO);
				setState(1342); match(MINUTE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1343); match(DAY);
				setState(1344); match(TO);
				setState(1345); match(SECOND);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1346); match(HOUR);
				setState(1347); match(TO);
				setState(1348); match(MINUTE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1349); match(HOUR);
				setState(1350); match(TO);
				setState(1351); match(SECOND);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1352); match(MINUTE);
				setState(1353); match(TO);
				setState(1354); match(SECOND);
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

	public static class Data_type_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Data_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitData_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_type_listContext data_type_list() throws RecognitionException {
		Data_type_listContext _localctx = new Data_type_listContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_data_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357); data_type();
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1358); match(COMMA);
				setState(1359); data_type();
				}
				}
				setState(1364);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_reserved_nameContext function_reserved_name() {
			return getRuleContext(Function_reserved_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_function_name);
		try {
			setState(1367);
			switch (_input.LA(1)) {
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365); function_reserved_name();
				}
				break;
			case WITH:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1366); any_name();
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

	public static class Function_reserved_nameContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(IdbParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(IdbParser.RIGHT, 0); }
		public Function_reserved_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_reserved_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunction_reserved_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_reserved_nameContext function_reserved_name() throws RecognitionException {
		Function_reserved_nameContext _localctx = new Function_reserved_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			_la = _input.LA(1);
			if ( !(_la==LEFT || _la==RIGHT) ) {
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

	public static class Function_argsContext extends ParserRuleContext {
		public List<Function_argContext> function_arg() {
			return getRuleContexts(Function_argContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public Function_argContext function_arg(int i) {
			return getRuleContext(Function_argContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunction_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_function_args);
		int _la;
		try {
			setState(1380);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CASE:
			case CAST:
			case DEFAULT:
			case EXISTS:
			case LEFT:
			case NOT:
			case NULL:
			case PRIOR:
			case RIGHT:
			case ROW:
			case SOME:
			case WITH:
			case FALSE:
			case TRUE:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
			case XMLEXISTS:
			case XMLPARSE:
			case XMLSERIALIZE:
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
			case CONCATENATION_OPERATOR:
			case LEQ:
			case GEQ:
			case LEFT_PAREN:
			case PLUS:
			case SUB:
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
			case JSON_ARRAY_ELEMENT_OR_FIELD:
			case JSON_AS_TEXT:
			case JSON_OBJECT_AT_PATH:
			case JSON_OBJECT_AT_PATH_AS_TEXT:
			case BIND_PARAMETER:
			case NUM:
			case REAL_NUM:
			case CUSTOME_OPERATOR:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case REGEX:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371); function_arg();
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1372); match(COMMA);
					setState(1373); function_arg();
					}
					}
					setState(1378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1379); match(MULTIPLY);
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

	public static class Function_argContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ASSIGN() { return getToken(IdbParser.ASSIGN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode VARIADIC() { return getToken(IdbParser.VARIADIC, 0); }
		public Function_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunction_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argContext function_arg() throws RecognitionException {
		Function_argContext _localctx = new Function_argContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_function_arg);
		try {
			setState(1394);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1382); match(VARIADIC);
					}
					break;
				}
				setState(1385); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386); variable_name();
				setState(1387); match(ASSIGN);
				setState(1388); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390); expr(0);
				setState(1391); match(AS);
				setState(1392); expr(0);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398); any_name();
			}
		}
		catch (RecognitionException re) {
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_schema_nameContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(IdbParser.DOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Qualified_schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_schema_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQualified_schema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_schema_nameContext qualified_schema_name() throws RecognitionException {
		Qualified_schema_nameContext _localctx = new Qualified_schema_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_qualified_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1402); database_name();
				setState(1403); match(DOT);
				}
				break;
			}
			setState(1407); schema_name();
			}
		}
		catch (RecognitionException re) {
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(IdbParser.DOT); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(IdbParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1414);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1411); database_name();
					setState(1412); match(DOT);
					}
					break;
				}
				setState(1416); schema_name();
				setState(1417); match(DOT);
				}
				break;
			}
			setState(1421); table_name();
			}
		}
		catch (RecognitionException re) {
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(IdbParser.DOT); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(IdbParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Qualified_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQualified_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_column_nameContext qualified_column_name() throws RecognitionException {
		Qualified_column_nameContext _localctx = new Qualified_column_nameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_qualified_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1428);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1425); database_name();
					setState(1426); match(DOT);
					}
					break;
				}
				setState(1430); schema_name();
				setState(1431); match(DOT);
				setState(1432); table_name();
				setState(1433); match(DOT);
				}
				break;
			case 2:
				{
				setState(1438);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1435); schema_name();
					setState(1436); match(DOT);
					}
					break;
				}
				setState(1440); table_name();
				setState(1441); match(DOT);
				}
				break;
			case 3:
				{
				setState(1443); table_name();
				setState(1444); match(DOT);
				}
				break;
			}
			setState(1448); column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWindow_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exists_window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Exists_window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_window_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExists_window_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exists_window_nameContext exists_window_name() throws RecognitionException {
		Exists_window_nameContext _localctx = new Exists_window_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452); any_name();
			}
		}
		catch (RecognitionException re) {
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
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode BY() { return getToken(IdbParser.BY, 0); }
		public Order_clauseContext order_clause() {
			return getRuleContext(Order_clauseContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(IdbParser.PARTITION, 0); }
		public Exists_window_nameContext exists_window_name() {
			return getRuleContext(Exists_window_nameContext.class,0);
		}
		public Window_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitWindow_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_definitionContext window_definition() throws RecognitionException {
		Window_definitionContext _localctx = new Window_definitionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_window_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1454); exists_window_name();
				}
				break;
			}
			setState(1460);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1457); match(PARTITION);
				setState(1458); match(BY);
				setState(1459); expr_list();
				}
				break;
			}
			setState(1463);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1462); order_clause();
				}
				break;
			}
			setState(1466);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1465); frame_clause();
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

	public static class Frame_clauseContext extends ParserRuleContext {
		public FrameContext frame_start;
		public FrameContext frame_end;
		public TerminalNode BETWEEN() { return getToken(IdbParser.BETWEEN, 0); }
		public TerminalNode RANGE() { return getToken(IdbParser.RANGE, 0); }
		public FrameContext frame(int i) {
			return getRuleContext(FrameContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(IdbParser.ROWS, 0); }
		public List<FrameContext> frame() {
			return getRuleContexts(FrameContext.class);
		}
		public TerminalNode END() { return getToken(IdbParser.END, 0); }
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFrame_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1468);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(1477);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CASE:
			case CAST:
			case CURRENT:
			case DEFAULT:
			case EXISTS:
			case LEFT:
			case NOT:
			case NULL:
			case PRIOR:
			case RIGHT:
			case ROW:
			case SOME:
			case WITH:
			case FALSE:
			case TRUE:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
			case XMLEXISTS:
			case XMLPARSE:
			case XMLSERIALIZE:
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
			case CONCATENATION_OPERATOR:
			case LEQ:
			case GEQ:
			case LEFT_PAREN:
			case PLUS:
			case SUB:
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
			case JSON_ARRAY_ELEMENT_OR_FIELD:
			case JSON_AS_TEXT:
			case JSON_OBJECT_AT_PATH:
			case JSON_OBJECT_AT_PATH_AS_TEXT:
			case BIND_PARAMETER:
			case NUM:
			case REAL_NUM:
			case CUSTOME_OPERATOR:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case REGEX:
			case STRING_LITERAL:
				{
				setState(1471); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(1472); match(BETWEEN);
				setState(1473); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(1474); match(END);
				setState(1475); ((Frame_clauseContext)_localctx).frame_end = frame();
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

	public static class FrameContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROW() { return getToken(IdbParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(IdbParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(IdbParser.PRECEDING, 0); }
		public TerminalNode CURRENT() { return getToken(IdbParser.CURRENT, 0); }
		public TerminalNode FOLLOWING() { return getToken(IdbParser.FOLLOWING, 0); }
		public FrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameContext frame() throws RecognitionException {
		FrameContext _localctx = new FrameContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_frame);
		try {
			setState(1491);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479); match(UNBOUNDED);
				setState(1480); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481); match(CURRENT);
				setState(1482); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1483); match(UNBOUNDED);
				setState(1484); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1485); expr(0);
				setState(1486); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1488); expr(0);
				setState(1489); match(FOLLOWING);
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

	public static class Table_name_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Table_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTable_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_name_listContext table_name_list() throws RecognitionException {
		Table_name_listContext _localctx = new Table_name_listContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493); table_name();
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1494); match(COMMA);
				setState(1495); table_name();
				}
				}
				setState(1500);
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

	public static class Column_name_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501); column_name();
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1502); match(COMMA);
				setState(1503); column_name();
				}
				}
				setState(1508);
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

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509); column_name();
			setState(1510); data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definition_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Column_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitColumn_definition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definition_listContext column_definition_list() throws RecognitionException {
		Column_definition_listContext _localctx = new Column_definition_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512); column_definition();
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1513); match(COMMA);
				setState(1514); column_definition();
				}
				}
				setState(1519);
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

	public static class Correlation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Correlation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlation_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCorrelation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Correlation_nameContext correlation_name() throws RecognitionException {
		Correlation_nameContext _localctx = new Correlation_nameContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524); identifier();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(IdbParser.QUOTED_IDENTIFIER, 0); }
		public Nonreserved_keywordsContext nonreserved_keywords() {
			return getRuleContext(Nonreserved_keywordsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(IdbParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_identifier);
		int _la;
		try {
			setState(1528);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1526);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==QUOTED_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case WITH:
			case ABORT:
			case ABSOLUTE:
			case ACTION:
			case ANALYZE:
			case ARRAY:
			case AT:
			case AVG:
			case BACKWARD:
			case CACHE:
			case CASCADE:
			case CENTURY:
			case CHARACTER:
			case CLOSE:
			case COLLATE:
			case COLLECT:
			case COALESCE:
			case CONCURRENTLY:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTINUE:
			case COSTS:
			case COUNT:
			case CUBE:
			case CURSOR:
			case CYCLE:
			case DATA:
			case DAY:
			case DEC:
			case DECADE:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFERRABLE:
			case DISCARD:
			case DOW:
			case DOY:
			case EPOCH:
			case ESCAPE:
			case EVERY:
			case EXCLUDE:
			case EXCLUDING:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FOREIGN:
			case FORMAT:
			case FORWARD:
			case FUSION:
			case GLOBAL:
			case GROUPING:
			case HASH:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case INCLUDING:
			case INDEXES:
			case INHERIT:
			case INHERITS:
			case INITIALLY:
			case INSENSITIVE:
			case INTERSECTION:
			case ISODOW:
			case ISOYEAR:
			case KEY:
			case LAST:
			case LATERAL:
			case LESS:
			case LIST:
			case LOCAL:
			case LOCATION:
			case MAIN:
			case MATCH:
			case MATERIALIZED:
			case MAX:
			case MAXVALUE:
			case MICROSECONDS:
			case MILLENNIUM:
			case MILLISECONDS:
			case MIN:
			case MINVALUE:
			case MINUTE:
			case MONTH:
			case MOVE:
			case NATIONAL:
			case NEXT:
			case NO:
			case NO_INHERIT:
			case NONE:
			case NULLIF:
			case NULLS:
			case OIDS:
			case ONLY:
			case OVERWRITE:
			case OWNED:
			case PARTIAL:
			case PARTITION:
			case PARTITIONS:
			case PLAIN:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRESERVE:
			case PRIMARY:
			case QUARTER:
			case RANGE:
			case RECURSIVE:
			case REFERENCES:
			case REFRESH:
			case REGEXP:
			case RELATIVE:
			case RELEASE:
			case REPLACE:
			case RESTART:
			case RESTRICT:
			case RETURNING:
			case RLIKE:
			case ROLLUP:
			case SCHEMA:
			case SCROLL:
			case SECOND:
			case SEQUENCE:
			case SEQUENCES:
			case SIMILAR:
			case SIMPLE:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STORAGE:
			case SUBPARTITION:
			case SUBSTRING:
			case SUM:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case TEMP:
			case THAN:
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TRANSACTION:
			case TRIM:
			case TYPE:
			case UNBOUNDED:
			case UNKNOWN:
			case UNLOGGED:
			case UNSECURED:
			case USAGE:
			case VALID:
			case VARIADIC:
			case VAR_SAMP:
			case VAR_POP:
			case VARYING:
			case VERBOSE:
			case WEEK:
			case WINDOW:
			case WITHIN:
			case WITHOUT:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1527); nonreserved_keywords();
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
		public TerminalNode DEFERRED() { return getToken(IdbParser.DEFERRED, 0); }
		public TerminalNode TIMESTAMP() { return getToken(IdbParser.TIMESTAMP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(IdbParser.VAR_SAMP, 0); }
		public TerminalNode BIT() { return getToken(IdbParser.BIT, 0); }
		public TerminalNode ABORT() { return getToken(IdbParser.ABORT, 0); }
		public TerminalNode SUM() { return getToken(IdbParser.SUM, 0); }
		public TerminalNode QUARTER() { return getToken(IdbParser.QUARTER, 0); }
		public TerminalNode EVERY() { return getToken(IdbParser.EVERY, 0); }
		public TerminalNode DEFERRABLE() { return getToken(IdbParser.DEFERRABLE, 0); }
		public TerminalNode NVARCHAR() { return getToken(IdbParser.NVARCHAR, 0); }
		public TerminalNode GEOGRAPHY() { return getToken(IdbParser.GEOGRAPHY, 0); }
		public TerminalNode SECOND() { return getToken(IdbParser.SECOND, 0); }
		public TerminalNode INITIALLY() { return getToken(IdbParser.INITIALLY, 0); }
		public TerminalNode YEAR() { return getToken(IdbParser.YEAR, 0); }
		public TerminalNode INDEXES() { return getToken(IdbParser.INDEXES, 0); }
		public TerminalNode INTERVAL() { return getToken(IdbParser.INTERVAL, 0); }
		public TerminalNode GEOMETRY_DUMP() { return getToken(IdbParser.GEOMETRY_DUMP, 0); }
		public TerminalNode FORWARD() { return getToken(IdbParser.FORWARD, 0); }
		public TerminalNode ANALYZE() { return getToken(IdbParser.ANALYZE, 0); }
		public TerminalNode WITH() { return getToken(IdbParser.WITH, 0); }
		public TerminalNode NO() { return getToken(IdbParser.NO, 0); }
		public TerminalNode VARIADIC() { return getToken(IdbParser.VARIADIC, 0); }
		public TerminalNode NULLS() { return getToken(IdbParser.NULLS, 0); }
		public TerminalNode VAR_POP() { return getToken(IdbParser.VAR_POP, 0); }
		public TerminalNode ISOYEAR() { return getToken(IdbParser.ISOYEAR, 0); }
		public TerminalNode CONTINUE() { return getToken(IdbParser.CONTINUE, 0); }
		public TerminalNode MINUTE() { return getToken(IdbParser.MINUTE, 0); }
		public TerminalNode LAST() { return getToken(IdbParser.LAST, 0); }
		public TerminalNode COLLATE() { return getToken(IdbParser.COLLATE, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(IdbParser.CONCURRENTLY, 0); }
		public TerminalNode NCHAR() { return getToken(IdbParser.NCHAR, 0); }
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public TerminalNode INHERIT() { return getToken(IdbParser.INHERIT, 0); }
		public TerminalNode SUBSTRING() { return getToken(IdbParser.SUBSTRING, 0); }
		public TerminalNode TIMETZ() { return getToken(IdbParser.TIMETZ, 0); }
		public TerminalNode FOREIGN() { return getToken(IdbParser.FOREIGN, 0); }
		public TerminalNode TABLESPACE() { return getToken(IdbParser.TABLESPACE, 0); }
		public TerminalNode HOLD() { return getToken(IdbParser.HOLD, 0); }
		public TerminalNode MONTH() { return getToken(IdbParser.MONTH, 0); }
		public TerminalNode BLOB() { return getToken(IdbParser.BLOB, 0); }
		public TerminalNode INTERSECTION() { return getToken(IdbParser.INTERSECTION, 0); }
		public TerminalNode DEFAULTS() { return getToken(IdbParser.DEFAULTS, 0); }
		public TerminalNode SIMPLE() { return getToken(IdbParser.SIMPLE, 0); }
		public TerminalNode TEMP() { return getToken(IdbParser.TEMP, 0); }
		public TerminalNode BINARY() { return getToken(IdbParser.BINARY, 0); }
		public TerminalNode INSENSITIVE() { return getToken(IdbParser.INSENSITIVE, 0); }
		public TerminalNode TINYINT() { return getToken(IdbParser.TINYINT, 0); }
		public TerminalNode STORAGE() { return getToken(IdbParser.STORAGE, 0); }
		public TerminalNode GROUPING() { return getToken(IdbParser.GROUPING, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(IdbParser.TIMESTAMPTZ, 0); }
		public TerminalNode DATE() { return getToken(IdbParser.DATE, 0); }
		public TerminalNode INT2() { return getToken(IdbParser.INT2, 0); }
		public TerminalNode VARBIT() { return getToken(IdbParser.VARBIT, 0); }
		public TerminalNode LOCAL() { return getToken(IdbParser.LOCAL, 0); }
		public TerminalNode WEEK() { return getToken(IdbParser.WEEK, 0); }
		public TerminalNode MATERIALIZED() { return getToken(IdbParser.MATERIALIZED, 0); }
		public TerminalNode NULLIF() { return getToken(IdbParser.NULLIF, 0); }
		public TerminalNode TIME() { return getToken(IdbParser.TIME, 0); }
		public TerminalNode PRESERVE() { return getToken(IdbParser.PRESERVE, 0); }
		public TerminalNode TRIM() { return getToken(IdbParser.TRIM, 0); }
		public TerminalNode DOUBLE() { return getToken(IdbParser.DOUBLE, 0); }
		public TerminalNode RETURNING() { return getToken(IdbParser.RETURNING, 0); }
		public TerminalNode GEOMETRY() { return getToken(IdbParser.GEOMETRY, 0); }
		public TerminalNode FORCE() { return getToken(IdbParser.FORCE, 0); }
		public TerminalNode BOX3D() { return getToken(IdbParser.BOX3D, 0); }
		public TerminalNode FORMAT() { return getToken(IdbParser.FORMAT, 0); }
		public TerminalNode EXCLUDE() { return getToken(IdbParser.EXCLUDE, 0); }
		public TerminalNode WINDOW() { return getToken(IdbParser.WINDOW, 0); }
		public TerminalNode DOY() { return getToken(IdbParser.DOY, 0); }
		public TerminalNode MIN() { return getToken(IdbParser.MIN, 0); }
		public TerminalNode FILTER() { return getToken(IdbParser.FILTER, 0); }
		public TerminalNode DOW() { return getToken(IdbParser.DOW, 0); }
		public TerminalNode REFERENCES() { return getToken(IdbParser.REFERENCES, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(IdbParser.CONSTRAINTS, 0); }
		public TerminalNode HASH() { return getToken(IdbParser.HASH, 0); }
		public TerminalNode EPOCH() { return getToken(IdbParser.EPOCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(IdbParser.TRANSACTION, 0); }
		public TerminalNode FLOAT4() { return getToken(IdbParser.FLOAT4, 0); }
		public TerminalNode TABLES() { return getToken(IdbParser.TABLES, 0); }
		public TerminalNode RELATIVE() { return getToken(IdbParser.RELATIVE, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(IdbParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode BOOLEAN() { return getToken(IdbParser.BOOLEAN, 0); }
		public TerminalNode GLOBAL() { return getToken(IdbParser.GLOBAL, 0); }
		public TerminalNode VALID() { return getToken(IdbParser.VALID, 0); }
		public TerminalNode DAY() { return getToken(IdbParser.DAY, 0); }
		public TerminalNode REAL() { return getToken(IdbParser.REAL, 0); }
		public TerminalNode PLAIN() { return getToken(IdbParser.PLAIN, 0); }
		public TerminalNode COLLECT() { return getToken(IdbParser.COLLECT, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(IdbParser.STDDEV_SAMP, 0); }
		public TerminalNode FLOAT() { return getToken(IdbParser.FLOAT, 0); }
		public TerminalNode EXTRACT() { return getToken(IdbParser.EXTRACT, 0); }
		public TerminalNode INT4() { return getToken(IdbParser.INT4, 0); }
		public TerminalNode MILLISECONDS() { return getToken(IdbParser.MILLISECONDS, 0); }
		public TerminalNode BOOL() { return getToken(IdbParser.BOOL, 0); }
		public TerminalNode NUMERIC() { return getToken(IdbParser.NUMERIC, 0); }
		public TerminalNode MATCH() { return getToken(IdbParser.MATCH, 0); }
		public TerminalNode INT8() { return getToken(IdbParser.INT8, 0); }
		public TerminalNode HOUR() { return getToken(IdbParser.HOUR, 0); }
		public TerminalNode DECADE() { return getToken(IdbParser.DECADE, 0); }
		public TerminalNode BACKWARD() { return getToken(IdbParser.BACKWARD, 0); }
		public TerminalNode COSTS() { return getToken(IdbParser.COSTS, 0); }
		public TerminalNode INTEGER() { return getToken(IdbParser.INTEGER, 0); }
		public TerminalNode COALESCE() { return getToken(IdbParser.COALESCE, 0); }
		public TerminalNode STDDEV_POP() { return getToken(IdbParser.STDDEV_POP, 0); }
		public TerminalNode INT() { return getToken(IdbParser.INT, 0); }
		public TerminalNode OWNED() { return getToken(IdbParser.OWNED, 0); }
		public TerminalNode INT1() { return getToken(IdbParser.INT1, 0); }
		public TerminalNode MAX() { return getToken(IdbParser.MAX, 0); }
		public TerminalNode ROLLUP() { return getToken(IdbParser.ROLLUP, 0); }
		public TerminalNode COUNT() { return getToken(IdbParser.COUNT, 0); }
		public TerminalNode VARYING() { return getToken(IdbParser.VARYING, 0); }
		public TerminalNode SIMILAR() { return getToken(IdbParser.SIMILAR, 0); }
		public TerminalNode RELEASE() { return getToken(IdbParser.RELEASE, 0); }
		public TerminalNode RLIKE() { return getToken(IdbParser.RLIKE, 0); }
		public TerminalNode BYTEA() { return getToken(IdbParser.BYTEA, 0); }
		public TerminalNode PARTITION() { return getToken(IdbParser.PARTITION, 0); }
		public TerminalNode CHAR() { return getToken(IdbParser.CHAR, 0); }
		public TerminalNode VARBINARY() { return getToken(IdbParser.VARBINARY, 0); }
		public TerminalNode ESCAPE() { return getToken(IdbParser.ESCAPE, 0); }
		public TerminalNode EXTENDED() { return getToken(IdbParser.EXTENDED, 0); }
		public TerminalNode VARCHAR() { return getToken(IdbParser.VARCHAR, 0); }
		public TerminalNode AVG() { return getToken(IdbParser.AVG, 0); }
		public TerminalNode INET4() { return getToken(IdbParser.INET4, 0); }
		public TerminalNode FLOAT8() { return getToken(IdbParser.FLOAT8, 0); }
		public TerminalNode USAGE() { return getToken(IdbParser.USAGE, 0); }
		public TerminalNode INCLUDING() { return getToken(IdbParser.INCLUDING, 0); }
		public TerminalNode CASCADE() { return getToken(IdbParser.CASCADE, 0); }
		public TerminalNode DATA() { return getToken(IdbParser.DATA, 0); }
		public TerminalNode OVERWRITE() { return getToken(IdbParser.OVERWRITE, 0); }
		public TerminalNode CLOSE() { return getToken(IdbParser.CLOSE, 0); }
		public TerminalNode UNSECURED() { return getToken(IdbParser.UNSECURED, 0); }
		public TerminalNode PRIMARY() { return getToken(IdbParser.PRIMARY, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(IdbParser.TIMEZONE_HOUR, 0); }
		public TerminalNode FOLLOWING() { return getToken(IdbParser.FOLLOWING, 0); }
		public TerminalNode EXCLUDING() { return getToken(IdbParser.EXCLUDING, 0); }
		public TerminalNode CACHE() { return getToken(IdbParser.CACHE, 0); }
		public TerminalNode MOVE() { return getToken(IdbParser.MOVE, 0); }
		public TerminalNode VERBOSE() { return getToken(IdbParser.VERBOSE, 0); }
		public TerminalNode TEXT() { return getToken(IdbParser.TEXT, 0); }
		public TerminalNode DEC() { return getToken(IdbParser.DEC, 0); }
		public TerminalNode PRECEDING() { return getToken(IdbParser.PRECEDING, 0); }
		public TerminalNode RESTART() { return getToken(IdbParser.RESTART, 0); }
		public TerminalNode CURSOR() { return getToken(IdbParser.CURSOR, 0); }
		public TerminalNode ABSOLUTE() { return getToken(IdbParser.ABSOLUTE, 0); }
		public TerminalNode LESS() { return getToken(IdbParser.LESS, 0); }
		public TerminalNode MILLENNIUM() { return getToken(IdbParser.MILLENNIUM, 0); }
		public TerminalNode ARRAY() { return getToken(IdbParser.ARRAY, 0); }
		public TerminalNode NATIONAL() { return getToken(IdbParser.NATIONAL, 0); }
		public TerminalNode REFRESH() { return getToken(IdbParser.REFRESH, 0); }
		public TerminalNode FUSION() { return getToken(IdbParser.FUSION, 0); }
		public TerminalNode POSITION() { return getToken(IdbParser.POSITION, 0); }
		public TerminalNode UNLOGGED() { return getToken(IdbParser.UNLOGGED, 0); }
		public TerminalNode SCROLL() { return getToken(IdbParser.SCROLL, 0); }
		public TerminalNode LATERAL() { return getToken(IdbParser.LATERAL, 0); }
		public TerminalNode WITHIN() { return getToken(IdbParser.WITHIN, 0); }
		public TerminalNode ZONE() { return getToken(IdbParser.ZONE, 0); }
		public TerminalNode TSQUERY() { return getToken(IdbParser.TSQUERY, 0); }
		public TerminalNode SEQUENCES() { return getToken(IdbParser.SEQUENCES, 0); }
		public TerminalNode IDENTITY() { return getToken(IdbParser.IDENTITY, 0); }
		public TerminalNode NEXT() { return getToken(IdbParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(IdbParser.FIRST, 0); }
		public TerminalNode DECLARE() { return getToken(IdbParser.DECLARE, 0); }
		public TerminalNode KEY() { return getToken(IdbParser.KEY, 0); }
		public TerminalNode LOCATION() { return getToken(IdbParser.LOCATION, 0); }
		public TerminalNode CENTURY() { return getToken(IdbParser.CENTURY, 0); }
		public TerminalNode LIST() { return getToken(IdbParser.LIST, 0); }
		public TerminalNode RECURSIVE() { return getToken(IdbParser.RECURSIVE, 0); }
		public TerminalNode CYCLE() { return getToken(IdbParser.CYCLE, 0); }
		public TerminalNode TYPE() { return getToken(IdbParser.TYPE, 0); }
		public TerminalNode SMALLINT() { return getToken(IdbParser.SMALLINT, 0); }
		public TerminalNode ISODOW() { return getToken(IdbParser.ISODOW, 0); }
		public TerminalNode TSVECTOR() { return getToken(IdbParser.TSVECTOR, 0); }
		public TerminalNode AT() { return getToken(IdbParser.AT, 0); }
		public TerminalNode PRECISION() { return getToken(IdbParser.PRECISION, 0); }
		public TerminalNode RESTRICT() { return getToken(IdbParser.RESTRICT, 0); }
		public TerminalNode SUBPARTITION() { return getToken(IdbParser.SUBPARTITION, 0); }
		public TerminalNode EXTERNAL() { return getToken(IdbParser.EXTERNAL, 0); }
		public TerminalNode MINVALUE() { return getToken(IdbParser.MINVALUE, 0); }
		public TerminalNode NO_INHERIT() { return getToken(IdbParser.NO_INHERIT, 0); }
		public TerminalNode MICROSECONDS() { return getToken(IdbParser.MICROSECONDS, 0); }
		public TerminalNode DECIMAL() { return getToken(IdbParser.DECIMAL, 0); }
		public TerminalNode THAN() { return getToken(IdbParser.THAN, 0); }
		public TerminalNode REGEXP() { return getToken(IdbParser.REGEXP, 0); }
		public TerminalNode SCHEMA() { return getToken(IdbParser.SCHEMA, 0); }
		public TerminalNode TIMEZONE() { return getToken(IdbParser.TIMEZONE, 0); }
		public TerminalNode INHERITS() { return getToken(IdbParser.INHERITS, 0); }
		public TerminalNode CUBE() { return getToken(IdbParser.CUBE, 0); }
		public TerminalNode PARTIAL() { return getToken(IdbParser.PARTIAL, 0); }
		public TerminalNode UNKNOWN() { return getToken(IdbParser.UNKNOWN, 0); }
		public TerminalNode CHARACTER() { return getToken(IdbParser.CHARACTER, 0); }
		public TerminalNode BOX2D() { return getToken(IdbParser.BOX2D, 0); }
		public TerminalNode CONSTRAINT() { return getToken(IdbParser.CONSTRAINT, 0); }
		public TerminalNode WITHOUT() { return getToken(IdbParser.WITHOUT, 0); }
		public TerminalNode BIGINT() { return getToken(IdbParser.BIGINT, 0); }
		public TerminalNode RANGE() { return getToken(IdbParser.RANGE, 0); }
		public TerminalNode TEMPORARY() { return getToken(IdbParser.TEMPORARY, 0); }
		public TerminalNode MAXVALUE() { return getToken(IdbParser.MAXVALUE, 0); }
		public TerminalNode MAIN() { return getToken(IdbParser.MAIN, 0); }
		public TerminalNode DISCARD() { return getToken(IdbParser.DISCARD, 0); }
		public TerminalNode SEQUENCE() { return getToken(IdbParser.SEQUENCE, 0); }
		public TerminalNode OIDS() { return getToken(IdbParser.OIDS, 0); }
		public TerminalNode ACTION() { return getToken(IdbParser.ACTION, 0); }
		public TerminalNode NONE() { return getToken(IdbParser.NONE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(IdbParser.UNBOUNDED, 0); }
		public TerminalNode REPLACE() { return getToken(IdbParser.REPLACE, 0); }
		public TerminalNode PARTITIONS() { return getToken(IdbParser.PARTITIONS, 0); }
		public Nonreserved_keywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonreserved_keywords; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNonreserved_keywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonreserved_keywordsContext nonreserved_keywords() throws RecognitionException {
		Nonreserved_keywordsContext _localctx = new Nonreserved_keywordsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (WITH - 135)) | (1L << (ABORT - 135)) | (1L << (ABSOLUTE - 135)) | (1L << (ACTION - 135)) | (1L << (ANALYZE - 135)) | (1L << (ARRAY - 135)) | (1L << (AT - 135)) | (1L << (AVG - 135)) | (1L << (BACKWARD - 135)) | (1L << (CACHE - 135)) | (1L << (CASCADE - 135)) | (1L << (CENTURY - 135)) | (1L << (CHARACTER - 135)) | (1L << (CLOSE - 135)) | (1L << (COLLATE - 135)) | (1L << (COLLECT - 135)) | (1L << (COALESCE - 135)) | (1L << (CONCURRENTLY - 135)) | (1L << (CONSTRAINT - 135)) | (1L << (CONSTRAINTS - 135)) | (1L << (CONTINUE - 135)) | (1L << (COSTS - 135)) | (1L << (COUNT - 135)) | (1L << (CUBE - 135)) | (1L << (CURSOR - 135)) | (1L << (CYCLE - 135)) | (1L << (DATA - 135)) | (1L << (DAY - 135)) | (1L << (DEC - 135)) | (1L << (DECADE - 135)) | (1L << (DECLARE - 135)) | (1L << (DEFAULTS - 135)) | (1L << (DEFERRED - 135)) | (1L << (DEFERRABLE - 135)) | (1L << (DISCARD - 135)) | (1L << (DOW - 135)) | (1L << (DOY - 135)) | (1L << (EPOCH - 135)) | (1L << (ESCAPE - 135)) | (1L << (EVERY - 135)) | (1L << (EXCLUDE - 135)) | (1L << (EXCLUDING - 135)) | (1L << (EXTENDED - 135)) | (1L << (EXTERNAL - 135)) | (1L << (EXTRACT - 135)) | (1L << (FILTER - 135)) | (1L << (FIRST - 135)) | (1L << (FOLLOWING - 135)) | (1L << (FORCE - 135)) | (1L << (FOREIGN - 135)) | (1L << (FORMAT - 135)) | (1L << (FORWARD - 135)) | (1L << (FUSION - 135)) | (1L << (GLOBAL - 135)) | (1L << (GROUPING - 135)) | (1L << (HASH - 135)) | (1L << (HOLD - 135)) | (1L << (HOUR - 135)) | (1L << (IDENTITY - 135)) | (1L << (INCLUDING - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (INDEXES - 199)) | (1L << (INHERIT - 199)) | (1L << (INHERITS - 199)) | (1L << (INITIALLY - 199)) | (1L << (INSENSITIVE - 199)) | (1L << (INTERSECTION - 199)) | (1L << (ISODOW - 199)) | (1L << (ISOYEAR - 199)) | (1L << (KEY - 199)) | (1L << (LAST - 199)) | (1L << (LATERAL - 199)) | (1L << (LESS - 199)) | (1L << (LIST - 199)) | (1L << (LOCAL - 199)) | (1L << (LOCATION - 199)) | (1L << (MAIN - 199)) | (1L << (MATCH - 199)) | (1L << (MATERIALIZED - 199)) | (1L << (MAX - 199)) | (1L << (MAXVALUE - 199)) | (1L << (MICROSECONDS - 199)) | (1L << (MILLENNIUM - 199)) | (1L << (MILLISECONDS - 199)) | (1L << (MIN - 199)) | (1L << (MINVALUE - 199)) | (1L << (MINUTE - 199)) | (1L << (MONTH - 199)) | (1L << (MOVE - 199)) | (1L << (NATIONAL - 199)) | (1L << (NEXT - 199)) | (1L << (NO - 199)) | (1L << (NO_INHERIT - 199)) | (1L << (NONE - 199)) | (1L << (NULLIF - 199)) | (1L << (NULLS - 199)) | (1L << (OIDS - 199)) | (1L << (ONLY - 199)) | (1L << (OVERWRITE - 199)) | (1L << (OWNED - 199)) | (1L << (PARTIAL - 199)) | (1L << (PARTITION - 199)) | (1L << (PARTITIONS - 199)) | (1L << (PLAIN - 199)) | (1L << (POSITION - 199)) | (1L << (PRECEDING - 199)) | (1L << (PRECISION - 199)) | (1L << (PRESERVE - 199)) | (1L << (PRIMARY - 199)) | (1L << (QUARTER - 199)) | (1L << (RANGE - 199)) | (1L << (RECURSIVE - 199)) | (1L << (REFERENCES - 199)) | (1L << (REFRESH - 199)) | (1L << (REGEXP - 199)) | (1L << (RELATIVE - 199)) | (1L << (RELEASE - 199)) | (1L << (REPLACE - 199)) | (1L << (RESTART - 199)) | (1L << (RESTRICT - 199)) | (1L << (RETURNING - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (RLIKE - 263)) | (1L << (ROLLUP - 263)) | (1L << (SCHEMA - 263)) | (1L << (SCROLL - 263)) | (1L << (SECOND - 263)) | (1L << (SEQUENCE - 263)) | (1L << (SEQUENCES - 263)) | (1L << (SIMILAR - 263)) | (1L << (SIMPLE - 263)) | (1L << (STDDEV_POP - 263)) | (1L << (STDDEV_SAMP - 263)) | (1L << (STORAGE - 263)) | (1L << (SUBPARTITION - 263)) | (1L << (SUBSTRING - 263)) | (1L << (SUM - 263)) | (1L << (TABLES - 263)) | (1L << (TABLESPACE - 263)) | (1L << (TEMPORARY - 263)) | (1L << (TEMP - 263)) | (1L << (THAN - 263)) | (1L << (TIMEZONE - 263)) | (1L << (TIMEZONE_HOUR - 263)) | (1L << (TIMEZONE_MINUTE - 263)) | (1L << (TRANSACTION - 263)) | (1L << (TRIM - 263)) | (1L << (TYPE - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UNKNOWN - 263)) | (1L << (UNLOGGED - 263)) | (1L << (UNSECURED - 263)) | (1L << (USAGE - 263)) | (1L << (VALID - 263)) | (1L << (VARIADIC - 263)) | (1L << (VAR_SAMP - 263)) | (1L << (VAR_POP - 263)) | (1L << (VARYING - 263)) | (1L << (VERBOSE - 263)) | (1L << (WEEK - 263)) | (1L << (WINDOW - 263)) | (1L << (WITHIN - 263)) | (1L << (WITHOUT - 263)) | (1L << (YEAR - 263)) | (1L << (ZONE - 263)) | (1L << (BOOLEAN - 263)) | (1L << (BOOL - 263)) | (1L << (BIT - 263)) | (1L << (VARBIT - 263)) | (1L << (INT1 - 263)) | (1L << (INT2 - 263)) | (1L << (INT4 - 263)) | (1L << (INT8 - 263)) | (1L << (TINYINT - 263)) | (1L << (SMALLINT - 263)) | (1L << (INT - 263)) | (1L << (INTEGER - 263)) | (1L << (BIGINT - 263)) | (1L << (FLOAT4 - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (FLOAT8 - 327)) | (1L << (REAL - 327)) | (1L << (FLOAT - 327)) | (1L << (DOUBLE - 327)) | (1L << (NUMERIC - 327)) | (1L << (DECIMAL - 327)) | (1L << (CHAR - 327)) | (1L << (VARCHAR - 327)) | (1L << (NCHAR - 327)) | (1L << (NVARCHAR - 327)) | (1L << (DATE - 327)) | (1L << (INTERVAL - 327)) | (1L << (TIME - 327)) | (1L << (TIMETZ - 327)) | (1L << (TIMESTAMP - 327)) | (1L << (TIMESTAMPTZ - 327)) | (1L << (TEXT - 327)) | (1L << (TSVECTOR - 327)) | (1L << (TSQUERY - 327)) | (1L << (BINARY - 327)) | (1L << (VARBINARY - 327)) | (1L << (BLOB - 327)) | (1L << (BYTEA - 327)) | (1L << (INET4 - 327)) | (1L << (BOX2D - 327)) | (1L << (BOX3D - 327)) | (1L << (GEOMETRY - 327)) | (1L << (GEOMETRY_DUMP - 327)) | (1L << (GEOGRAPHY - 327)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50: return joined_table_sempred((Joined_tableContext)_localctx, predIndex);
		case 64: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean joined_table_sempred(Joined_tableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 3);
		case 2: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 33);
		case 4: return precpred(_ctx, 32);
		case 5: return precpred(_ctx, 31);
		case 6: return precpred(_ctx, 30);
		case 7: return precpred(_ctx, 27);
		case 8: return precpred(_ctx, 25);
		case 9: return precpred(_ctx, 22);
		case 10: return precpred(_ctx, 21);
		case 11: return precpred(_ctx, 19);
		case 12: return precpred(_ctx, 18);
		case 13: return precpred(_ctx, 16);
		case 14: return precpred(_ctx, 15);
		case 15: return precpred(_ctx, 36);
		case 17: return precpred(_ctx, 29);
		case 16: return precpred(_ctx, 35);
		case 19: return precpred(_ctx, 24);
		case 18: return precpred(_ctx, 26);
		case 21: return precpred(_ctx, 5);
		case 20: return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01b0\u05ff\4\2\t"+
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
		"\3\2\3\2\3\2\7\2\u0128\n\2\f\2\16\2\u012b\13\2\3\2\3\2\5\2\u012f\n\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0139\n\4\3\5\3\5\5\5\u013d\n\5\3\5"+
		"\5\5\u0140\n\5\3\5\5\5\u0143\n\5\3\5\5\5\u0146\n\5\3\5\5\5\u0149\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0150\n\6\3\6\5\6\u0153\n\6\3\6\5\6\u0156\n\6\3"+
		"\7\3\7\3\7\3\7\5\7\u015c\n\7\3\7\5\7\u015f\n\7\3\7\5\7\u0162\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u016a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0175\n\b\3\b\5\b\u0178\n\b\3\t\3\t\3\t\3\t\7\t\u017e\n\t\f\t\16\t"+
		"\u0181\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u018b\n\n\f\n\16\n\u018e"+
		"\13\n\3\13\3\13\3\13\7\13\u0193\n\13\f\13\16\13\u0196\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01a2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u01ac\n\r\f\r\16\r\u01af\13\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\5\17\u01b8\n\17\7\17\u01ba\n\17\f\17\16\17\u01bd\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u01c5\n\17\f\17\16\17\u01c8\13\17\3\17\3\17"+
		"\5\17\u01cc\n\17\3\20\5\20\u01cf\n\20\3\20\3\20\5\20\u01d3\n\20\3\20\3"+
		"\20\5\20\u01d7\n\20\3\20\5\20\u01da\n\20\3\20\5\20\u01dd\n\20\3\20\5\20"+
		"\u01e0\n\20\3\20\5\20\u01e3\n\20\3\20\5\20\u01e6\n\20\3\21\3\21\5\21\u01ea"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01f3\n\22\5\22\u01f5\n"+
		"\22\3\23\3\23\3\23\7\23\u01fa\n\23\f\23\16\23\u01fd\13\23\3\24\3\24\5"+
		"\24\u0201\n\24\3\25\3\25\5\25\u0205\n\25\3\26\3\26\3\26\5\26\u020a\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0214\n\27\3\30\5\30\u0217"+
		"\n\30\3\30\3\30\3\30\5\30\u021c\n\30\3\31\3\31\5\31\u0220\n\31\3\31\5"+
		"\31\u0223\n\31\3\31\3\31\3\32\3\32\5\32\u0229\n\32\3\32\3\32\3\32\7\32"+
		"\u022e\n\32\f\32\16\32\u0231\13\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u023a\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0243\n\34\3"+
		"\34\3\34\3\35\3\35\5\35\u0249\n\35\3\35\3\35\5\35\u024d\n\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0257\n\37\f\37\16\37\u025a\13\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\7$\u026c\n$\f$\16"+
		"$\u026f\13$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u027c\n\'\f\'\16\'"+
		"\u027f\13\'\3(\3(\5(\u0283\n(\3(\5(\u0286\n(\3)\3)\3)\3)\5)\u028c\n)\3"+
		"*\3*\3+\3+\3+\3,\3,\3,\5,\u0296\n,\3-\3-\3-\5-\u029b\n-\3.\3.\3.\5.\u02a0"+
		"\n.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02ad\n/\3/\3/\5/\u02b1\n/\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\5\62\u02bb\n\62\3\63\5\63\u02be\n\63"+
		"\3\63\3\63\5\63\u02c2\n\63\3\63\5\63\u02c5\n\63\3\63\3\63\5\63\u02c9\n"+
		"\63\5\63\u02cb\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02d3\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02df\n\64\3\64\5\64"+
		"\u02e2\n\64\3\64\3\64\3\64\5\64\u02e7\n\64\7\64\u02e9\n\64\f\64\16\64"+
		"\u02ec\13\64\3\65\3\65\3\65\5\65\u02f1\n\65\5\65\u02f3\n\65\3\66\3\66"+
		"\3\67\5\67\u02f8\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u02ff\n\67\38\38\3"+
		"9\59\u0304\n9\39\39\59\u0308\n9\3:\3:\3:\3:\3:\5:\u030f\n:\3;\3;\3;\5"+
		";\u0314\n;\3;\5;\u0317\n;\3;\5;\u031a\n;\3;\3;\3<\3<\5<\u0320\n<\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0335\n@\f@\16"+
		"@\u0338\13@\3@\5@\u033b\n@\3@\5@\u033e\n@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0352\nB\3B\3B\3B\3B\3B\3B\3B\3B\5B\u035c"+
		"\nB\3B\3B\3B\3B\3B\3B\5B\u0364\nB\3B\3B\3B\3B\3B\3B\3B\5B\u036d\nB\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u037b\nB\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\5B\u0385\nB\3B\3B\3B\3B\3B\5B\u038c\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u03aa\nB\3B"+
		"\3B\6B\u03ae\nB\rB\16B\u03af\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u03bd"+
		"\nB\3B\3B\3B\3B\5B\u03c3\nB\3B\3B\3B\3B\3B\5B\u03ca\nB\3B\3B\7B\u03ce"+
		"\nB\fB\16B\u03d1\13B\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D\u03dc\nD\3E\3E\3E\3"+
		"E\5E\u03e2\nE\3F\3F\5F\u03e6\nF\3F\3F\5F\u03ea\nF\3F\5F\u03ed\nF\3G\3"+
		"G\3G\5G\u03f2\nG\3H\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3M\3M\3"+
		"N\3N\3O\3O\3O\3O\5O\u040b\nO\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0415\nP\3Q\3"+
		"Q\3R\3R\5R\u041b\nR\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\5W\u0430\nW\3X\3X\5X\u0434\nX\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\6\\\u0445\n\\\r\\\16\\\u0446\3\\\3\\\5\\\u044b\n"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\6\\\u0455\n\\\r\\\16\\\u0456\3\\\3"+
		"\\\5\\\u045b\n\\\3\\\3\\\5\\\u045f\n\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3"+
		"^\5^\u046c\n^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\5a\u047f"+
		"\na\3b\3b\3c\3c\3c\3c\3c\5c\u0488\nc\3c\3c\5c\u048c\nc\3c\3c\3d\3d\3d"+
		"\3d\3d\3e\5e\u0496\ne\3e\5e\u0499\ne\3e\5e\u049c\ne\3e\3e\3e\5e\u04a1"+
		"\ne\3f\3f\3g\3g\3g\3g\5g\u04a9\ng\3g\5g\u04ac\ng\3h\3h\3h\5h\u04b1\nh"+
		"\3h\3h\3i\5i\u04b6\ni\3i\3i\5i\u04ba\ni\3j\3j\3j\3j\3j\3j\5j\u04c2\nj"+
		"\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3n\3n\3o\3o\3o\3o\3o"+
		"\5o\u04db\no\3o\3o\5o\u04df\no\3o\3o\3p\3p\3p\3p\3p\3p\3p\5p\u04ea\np"+
		"\3p\3p\3p\3p\5p\u04f0\np\5p\u04f2\np\5p\u04f4\np\3q\3q\3q\3r\3r\3r\7r"+
		"\u04fc\nr\fr\16r\u04ff\13r\3s\6s\u0502\ns\rs\16s\u0503\3s\3s\3s\3s\5s"+
		"\u050a\ns\3s\3s\3s\3s\5s\u0510\ns\3s\6s\u0513\ns\rs\16s\u0514\5s\u0517"+
		"\ns\3s\3s\3s\5s\u051c\ns\3s\3s\3s\3s\3s\5s\u0523\ns\3s\3s\3s\3s\5s\u0529"+
		"\ns\5s\u052b\ns\3t\3t\3u\3u\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w"+
		"\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u054e\nw\3x\3x\3x\7x"+
		"\u0553\nx\fx\16x\u0556\13x\3y\3y\5y\u055a\ny\3z\3z\3{\3{\3{\7{\u0561\n"+
		"{\f{\16{\u0564\13{\3{\5{\u0567\n{\3|\5|\u056a\n|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\5|\u0575\n|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0580\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u0589\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u058e\n\u0082\3"+
		"\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u0597\n"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u05a1\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u05a9\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\5\u0087\u05b2\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05b7\n"+
		"\u0087\3\u0087\5\u0087\u05ba\n\u0087\3\u0087\5\u0087\u05bd\n\u0087\3\u0088"+
		"\5\u0088\u05c0\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u05c8\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u05d6\n\u0089"+
		"\3\u008a\3\u008a\3\u008a\7\u008a\u05db\n\u008a\f\u008a\16\u008a\u05de"+
		"\13\u008a\3\u008b\3\u008b\3\u008b\7\u008b\u05e3\n\u008b\f\u008b\16\u008b"+
		"\u05e6\13\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d"+
		"\u05ee\n\u008d\f\u008d\16\u008d\u05f1\13\u008d\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u05fb\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\2\4f\u0082\u0093\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\2 \5\2$$::}}\4\2\5\5"+
		"  \4\2\u011b\u011c\u0126\u0126\6\2\u0180\u0180\u0182\u0182\u0188\u018c"+
		"\u01a9\u01a9\4\2\u00bb\u00bb\u00d2\u00d2\3\2hi\4\2\u00bb\u00bb\u00e6\u00e6"+
		"\5\2,,@@ff\3\2\u018a\u018c\3\2\u0188\u0189\4\2\u0180\u0180\u0182\u0182"+
		"\4\2\u017a\u017a\u017f\u017f\4\2==NN\3\2\u01a5\u01a6\4\2\u008a\u008b\u0125"+
		"\u0125\7\2\u00a7\u00a7\u00c6\u00c6\u00e2\u00e3\u010d\u010d\u0138\u0138"+
		"\t\2\u0096\u0096\u00a9\u00a9\u00b0\u00b2\u00cf\u00d0\u00dd\u00df\u00fc"+
		"\u00fc\u0130\u0130\4\2\b\bpp\4\2\u017a\u017a\u017f\u0183\3\2\u0193\u019c"+
		"\3\2\u011e\u0120\5\2\17\17??yy\4\2\u0192\u0192\u019d\u019f\4\2\u009f\u009f"+
		"\u00af\u00af\4\2\u01a4\u01a4\u01ad\u01ad\4\2\u0089\u0089\u0133\u0133\4"+
		"\2@@ff\4\2ii\u00fd\u00fd\3\2\u01aa\u01ab\r\2\u0089\u0089\u008c\u009e\u00a0"+
		"\u00ae\u00b0\u00ed\u00f0\u00f4\u00f6\u00fe\u0100\u0111\u0113\u012e\u0130"+
		"\u0133\u0138\u0138\u013a\u0165\u0678\2\u0129\3\2\2\2\4\u0132\3\2\2\2\6"+
		"\u0138\3\2\2\2\b\u013a\3\2\2\2\n\u014a\3\2\2\2\f\u0157\3\2\2\2\16\u0163"+
		"\3\2\2\2\20\u0179\3\2\2\2\22\u0182\3\2\2\2\24\u018f\3\2\2\2\26\u01a1\3"+
		"\2\2\2\30\u01a3\3\2\2\2\32\u01b0\3\2\2\2\34\u01cb\3\2\2\2\36\u01ce\3\2"+
		"\2\2 \u01e7\3\2\2\2\"\u01f4\3\2\2\2$\u01f6\3\2\2\2&\u0200\3\2\2\2(\u0202"+
		"\3\2\2\2*\u0209\3\2\2\2,\u020d\3\2\2\2.\u0216\3\2\2\2\60\u021d\3\2\2\2"+
		"\62\u0226\3\2\2\2\64\u0232\3\2\2\2\66\u0234\3\2\2\28\u0246\3\2\2\2:\u024e"+
		"\3\2\2\2<\u0252\3\2\2\2>\u025b\3\2\2\2@\u025e\3\2\2\2B\u0262\3\2\2\2D"+
		"\u0265\3\2\2\2F\u0268\3\2\2\2H\u0270\3\2\2\2J\u0274\3\2\2\2L\u0278\3\2"+
		"\2\2N\u0280\3\2\2\2P\u028b\3\2\2\2R\u028d\3\2\2\2T\u028f\3\2\2\2V\u0292"+
		"\3\2\2\2X\u0297\3\2\2\2Z\u029c\3\2\2\2\\\u02a4\3\2\2\2^\u02b4\3\2\2\2"+
		"`\u02b6\3\2\2\2b\u02ba\3\2\2\2d\u02ca\3\2\2\2f\u02d2\3\2\2\2h\u02f2\3"+
		"\2\2\2j\u02f4\3\2\2\2l\u02f7\3\2\2\2n\u0300\3\2\2\2p\u0303\3\2\2\2r\u030e"+
		"\3\2\2\2t\u0310\3\2\2\2v\u031f\3\2\2\2x\u0321\3\2\2\2z\u0324\3\2\2\2|"+
		"\u0329\3\2\2\2~\u032b\3\2\2\2\u0080\u033f\3\2\2\2\u0082\u036c\3\2\2\2"+
		"\u0084\u03d2\3\2\2\2\u0086\u03db\3\2\2\2\u0088\u03e1\3\2\2\2\u008a\u03e3"+
		"\3\2\2\2\u008c\u03ee\3\2\2\2\u008e\u03f3\3\2\2\2\u0090\u03f7\3\2\2\2\u0092"+
		"\u03fa\3\2\2\2\u0094\u03fd\3\2\2\2\u0096\u0400\3\2\2\2\u0098\u0402\3\2"+
		"\2\2\u009a\u0404\3\2\2\2\u009c\u040a\3\2\2\2\u009e\u0414\3\2\2\2\u00a0"+
		"\u0416\3\2\2\2\u00a2\u041a\3\2\2\2\u00a4\u041c\3\2\2\2\u00a6\u041e\3\2"+
		"\2\2\u00a8\u0420\3\2\2\2\u00aa\u0422\3\2\2\2\u00ac\u042f\3\2\2\2\u00ae"+
		"\u0433\3\2\2\2\u00b0\u0435\3\2\2\2\u00b2\u0437\3\2\2\2\u00b4\u0439\3\2"+
		"\2\2\u00b6\u045e\3\2\2\2\u00b8\u0460\3\2\2\2\u00ba\u046b\3\2\2\2\u00bc"+
		"\u046d\3\2\2\2\u00be\u0474\3\2\2\2\u00c0\u047e\3\2\2\2\u00c2\u0480\3\2"+
		"\2\2\u00c4\u0482\3\2\2\2\u00c6\u048f\3\2\2\2\u00c8\u049b\3\2\2\2\u00ca"+
		"\u04a2\3\2\2\2\u00cc\u04a4\3\2\2\2\u00ce\u04ad\3\2\2\2\u00d0\u04b9\3\2"+
		"\2\2\u00d2\u04c1\3\2\2\2\u00d4\u04c3\3\2\2\2\u00d6\u04c5\3\2\2\2\u00d8"+
		"\u04cb\3\2\2\2\u00da\u04d3\3\2\2\2\u00dc\u04d5\3\2\2\2\u00de\u04e2\3\2"+
		"\2\2\u00e0\u04f5\3\2\2\2\u00e2\u04f8\3\2\2\2\u00e4\u052a\3\2\2\2\u00e6"+
		"\u052c\3\2\2\2\u00e8\u052e\3\2\2\2\u00ea\u0530\3\2\2\2\u00ec\u054d\3\2"+
		"\2\2\u00ee\u054f\3\2\2\2\u00f0\u0559\3\2\2\2\u00f2\u055b\3\2\2\2\u00f4"+
		"\u0566\3\2\2\2\u00f6\u0574\3\2\2\2\u00f8\u0576\3\2\2\2\u00fa\u0578\3\2"+
		"\2\2\u00fc\u057a\3\2\2\2\u00fe\u057f\3\2\2\2\u0100\u0583\3\2\2\2\u0102"+
		"\u058d\3\2\2\2\u0104\u0591\3\2\2\2\u0106\u05a8\3\2\2\2\u0108\u05ac\3\2"+
		"\2\2\u010a\u05ae\3\2\2\2\u010c\u05b1\3\2\2\2\u010e\u05bf\3\2\2\2\u0110"+
		"\u05d5\3\2\2\2\u0112\u05d7\3\2\2\2\u0114\u05df\3\2\2\2\u0116\u05e7\3\2"+
		"\2\2\u0118\u05ea\3\2\2\2\u011a\u05f2\3\2\2\2\u011c\u05f4\3\2\2\2\u011e"+
		"\u05f6\3\2\2\2\u0120\u05fa\3\2\2\2\u0122\u05fc\3\2\2\2\u0124\u0125\5\4"+
		"\3\2\u0125\u0126\7\u017c\2\2\u0126\u0128\3\2\2\2\u0127\u0124\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u012e\5\4\3\2\u012d\u012f\7\u017c\2\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\2"+
		"\2\3\u0131\3\3\2\2\2\u0132\u0133\5\6\4\2\u0133\5\3\2\2\2\u0134\u0139\5"+
		"\b\5\2\u0135\u0139\5\n\6\2\u0136\u0139\5\16\b\2\u0137\u0139\5\f\7\2\u0138"+
		"\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\7\3\2\2\2\u013a\u013c\5\34\17\2\u013b\u013d\5J&\2\u013c\u013b"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\5V,\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5X"+
		"-\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0146\5Z.\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2"+
		"\2\u0147\u0149\5\\/\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\t"+
		"\3\2\2\2\u014a\u014b\7\177\2\2\u014b\u014c\5\u0102\u0082\2\u014c\u014d"+
		"\7m\2\2\u014d\u014f\5\24\13\2\u014e\u0150\5<\37\2\u014f\u014e\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5> \2\u0152\u0151"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5\32\16\2"+
		"\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\13\3\2\2\2\u0157\u0158"+
		"\7\36\2\2\u0158\u0159\7+\2\2\u0159\u015b\5\u0102\u0082\2\u015a\u015c\5"+
		"\20\t\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015f\5> \2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2"+
		"\2\u0160\u0162\5\32\16\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\r\3\2\2\2\u0163\u0164\79\2\2\u0164\u0169\5\60\31\2\u0165\u0166\7\u0184"+
		"\2\2\u0166\u0167\5\u0114\u008b\2\u0167\u0168\7\u0185\2\2\u0168\u016a\3"+
		"\2\2\2\u0169\u0165\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0174\3\2\2\2\u016b"+
		"\u016c\7\u0083\2\2\u016c\u0175\5\22\n\2\u016d\u0175\5\b\5\2\u016e\u016f"+
		"\7\u0184\2\2\u016f\u0170\5\b\5\2\u0170\u0171\7\u0185\2\2\u0171\u0175\3"+
		"\2\2\2\u0172\u0173\7\35\2\2\u0173\u0175\7\u0083\2\2\u0174\u016b\3\2\2"+
		"\2\u0174\u016d\3\2\2\2\u0174\u016e\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0178\5\32\16\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\17\3\2\2\2\u0179\u017a\7\u0081\2\2\u017a\u017f\5b\62\2\u017b\u017c"+
		"\7\u017d\2\2\u017c\u017e\5b\62\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2"+
		"\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\21\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0182\u0183\7\u0184\2\2\u0183\u0184\5\u00e2r\2\u0184\u018c\7"+
		"\u0185\2\2\u0185\u0186\7\u017d\2\2\u0186\u0187\7\u0184\2\2\u0187\u0188"+
		"\5\u00e2r\2\u0188\u0189\7\u0185\2\2\u0189\u018b\3\2\2\2\u018a\u0185\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\23\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0194\5\26\f\2\u0190\u0191\7\u017d"+
		"\2\2\u0191\u0193\5\26\f\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\25\3\2\2\2\u0196\u0194\3\2\2"+
		"\2\u0197\u0198\5\u0106\u0084\2\u0198\u0199\7\u017a\2\2\u0199\u019a\5\u0082"+
		"B\2\u019a\u01a2\3\2\2\2\u019b\u019c\7\u0184\2\2\u019c\u019d\5\u0114\u008b"+
		"\2\u019d\u019e\7\u0185\2\2\u019e\u019f\7\u017a\2\2\u019f\u01a0\5\30\r"+
		"\2\u01a0\u01a2\3\2\2\2\u01a1\u0197\3\2\2\2\u01a1\u019b\3\2\2\2\u01a2\27"+
		"\3\2\2\2\u01a3\u01a4\7\u0184\2\2\u01a4\u01a5\5\u00e2r\2\u01a5\u01ad\7"+
		"\u0185\2\2\u01a6\u01a7\7\u017d\2\2\u01a7\u01a8\7\u0184\2\2\u01a8\u01a9"+
		"\5\u00e2r\2\u01a9\u01aa\7\u0185\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a6\3"+
		"\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\31\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\u0108\2\2\u01b1\u01b2\5"+
		"$\23\2\u01b2\33\3\2\2\2\u01b3\u01bb\5\36\20\2\u01b4\u01b7\5 \21\2\u01b5"+
		"\u01b8\5\36\20\2\u01b6\u01b8\5\34\17\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6"+
		"\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b4\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01cc\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\u01bf\7\u0184\2\2\u01bf\u01c0\5\b\5\2\u01c0\u01c6\7\u0185\2"+
		"\2\u01c1\u01c2\5 \21\2\u01c2\u01c3\5\34\17\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c1\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01cc\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\58\35\2\u01ca"+
		"\u01cc\5~@\2\u01cb\u01b3\3\2\2\2\u01cb\u01be\3\2\2\2\u01cb\u01c9\3\2\2"+
		"\2\u01cb\u01ca\3\2\2\2\u01cc\35\3\2\2\2\u01cd\u01cf\5\62\32\2\u01ce\u01cd"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\7k\2\2\u01d1"+
		"\u01d3\5\"\22\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d6\5$\23\2\u01d5\u01d7\5\60\31\2\u01d6\u01d5\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5<\37\2\u01d9\u01d8\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd\5> \2\u01dc\u01db"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5@!\2\u01df"+
		"\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5B"+
		"\"\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e6\5D#\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\37\3\2\2\2"+
		"\u01e7\u01e9\t\2\2\2\u01e8\u01ea\t\3\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea!\3\2\2\2\u01eb\u01f5\7\5\2\2\u01ec\u01f2\7 \2\2\u01ed\u01ee"+
		"\7W\2\2\u01ee\u01ef\7\u0184\2\2\u01ef\u01f0\5\u00e2r\2\u01f0\u01f1\7\u0185"+
		"\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01eb\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f5#\3\2\2\2"+
		"\u01f6\u01fb\5&\24\2\u01f7\u01f8\7\u017d\2\2\u01f8\u01fa\5&\24\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc%\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\5(\25\2\u01ff\u0201"+
		"\5*\26\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\'\3\2\2\2\u0202"+
		"\u0204\5\u0082B\2\u0203\u0205\5.\30\2\u0204\u0203\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205)\3\2\2\2\u0206\u0207\5\u0100\u0081\2\u0207\u0208\7\u018e"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u0206\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\7\u018a\2\2\u020c+\3\2\2\2\u020d\u0213\7\u00ee"+
		"\2\2\u020e\u0214\5\u0108\u0085\2\u020f\u0210\7\u0184\2\2\u0210\u0211\5"+
		"\u010c\u0087\2\u0211\u0212\7\u0185\2\2\u0212\u0214\3\2\2\2\u0213\u020e"+
		"\3\2\2\2\u0213\u020f\3\2\2\2\u0214-\3\2\2\2\u0215\u0217\7\t\2\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021b\3\2\2\2\u0218\u021c\5\u011c"+
		"\u008f\2\u0219\u021c\5\u0096L\2\u021a\u021c\7Q\2\2\u021b\u0218\3\2\2\2"+
		"\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c/\3\2\2\2\u021d\u021f\7"+
		";\2\2\u021e\u0220\t\4\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0222\3\2\2\2\u0221\u0223\7v\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5\u0102\u0082\2\u0225\61\3\2\2\2"+
		"\u0226\u0228\7\u0089\2\2\u0227\u0229\7\u00fe\2\2\u0228\u0227\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022f\5\66\34\2\u022b\u022c\7"+
		"\u017d\2\2\u022c\u022e\5\66\34\2\u022d\u022b\3\2\2\2\u022e\u0231\3\2\2"+
		"\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\63\3\2\2\2\u0231\u022f"+
		"\3\2\2\2\u0232\u0233\5\u011e\u0090\2\u0233\65\3\2\2\2\u0234\u0239\5\64"+
		"\33\2\u0235\u0236\7\u0184\2\2\u0236\u0237\5\u0114\u008b\2\u0237\u0238"+
		"\7\u0185\2\2\u0238\u023a\3\2\2\2\u0239\u0235\3\2\2\2\u0239\u023a\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023c\7\t\2\2\u023c\u0242\7\u0184\2\2\u023d"+
		"\u0243\5\b\5\2\u023e\u0243\5~@\2\u023f\u0243\5\16\b\2\u0240\u0243\5\n"+
		"\6\2\u0241\u0243\5\f\7\2\u0242\u023d\3\2\2\2\u0242\u023e\3\2\2\2\u0242"+
		"\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0245\7\u0185\2\2\u0245\67\3\2\2\2\u0246\u0248\7v\2\2\u0247"+
		"\u0249\7\u00ed\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024c\5\u0100\u0081\2\u024b\u024d\7\u018a\2\2\u024c\u024b"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d9\3\2\2\2\u024e\u024f\7\u0184\2\2\u024f"+
		"\u0250\5\b\5\2\u0250\u0251\7\u0185\2\2\u0251;\3\2\2\2\u0252\u0253\7+\2"+
		"\2\u0253\u0258\5b\62\2\u0254\u0255\7\u017d\2\2\u0255\u0257\5b\62\2\u0256"+
		"\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259=\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7\u0088\2\2\u025c"+
		"\u025d\5\u0080A\2\u025d?\3\2\2\2\u025e\u025f\7.\2\2\u025f\u0260\7\20\2"+
		"\2\u0260\u0261\5\u00e2r\2\u0261A\3\2\2\2\u0262\u0263\7/\2\2\u0263\u0264"+
		"\5\u00e2r\2\u0264C\3\2\2\2\u0265\u0266\7\u0131\2\2\u0266\u0267\5F$\2\u0267"+
		"E\3\2\2\2\u0268\u026d\5H%\2\u0269\u026a\7\u017d\2\2\u026a\u026c\5H%\2"+
		"\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026eG\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\5\u0108\u0085"+
		"\2\u0271\u0272\7\t\2\2\u0272\u0273\5\u010c\u0087\2\u0273I\3\2\2\2\u0274"+
		"\u0275\7[\2\2\u0275\u0276\7\20\2\2\u0276\u0277\5L\'\2\u0277K\3\2\2\2\u0278"+
		"\u027d\5N(\2\u0279\u027a\7\u017d\2\2\u027a\u027c\5N(\2\u027b\u0279\3\2"+
		"\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"M\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0282\5\u0082B\2\u0281\u0283\5P)\2"+
		"\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0286"+
		"\5T+\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286O\3\2\2\2\u0287\u028c"+
		"\7\n\2\2\u0288\u028c\7\37\2\2\u0289\u028a\7\u0081\2\2\u028a\u028c\5R*"+
		"\2\u028b\u0287\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u0289\3\2\2\2\u028cQ"+
		"\3\2\2\2\u028d\u028e\t\5\2\2\u028eS\3\2\2\2\u028f\u0290\7\u00eb\2\2\u0290"+
		"\u0291\t\6\2\2\u0291U\3\2\2\2\u0292\u0295\7C\2\2\u0293\u0296\5^\60\2\u0294"+
		"\u0296\7\5\2\2\u0295\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296W\3\2\2\2"+
		"\u0297\u0298\7V\2\2\u0298\u029a\5`\61\2\u0299\u029b\t\7\2\2\u029a\u0299"+
		"\3\2\2\2\u029a\u029b\3\2\2\2\u029bY\3\2\2\2\u029c\u029d\7(\2\2\u029d\u029f"+
		"\t\b\2\2\u029e\u02a0\5^\60\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a2\t\7\2\2\u02a2\u02a3\7\u00ed\2\2\u02a3[\3\2"+
		"\2\2\u02a4\u02ac\7*\2\2\u02a5\u02ad\7\177\2\2\u02a6\u02a7\7\u00e7\2\2"+
		"\u02a7\u02a8\7\u00d1\2\2\u02a8\u02ad\7\177\2\2\u02a9\u02ad\7n\2\2\u02aa"+
		"\u02ab\7\u00d1\2\2\u02ab\u02ad\7n\2\2\u02ac\u02a5\3\2\2\2\u02ac\u02a6"+
		"\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae"+
		"\u02af\7S\2\2\u02af\u02b1\5\u0112\u008a\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7P\2\2\u02b3]\3\2\2\2\u02b4\u02b5"+
		"\5\u0082B\2\u02b5_\3\2\2\2\u02b6\u02b7\5\u0082B\2\u02b7a\3\2\2\2\u02b8"+
		"\u02bb\5d\63\2\u02b9\u02bb\5f\64\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2"+
		"\2\2\u02bbc\3\2\2\2\u02bc\u02be\7\u00ed\2\2\u02bd\u02bc\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\5\u0102\u0082\2\u02c0\u02c2"+
		"\7\u018a\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2"+
		"\2\u02c3\u02c5\5l\67\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02cb"+
		"\3\2\2\2\u02c6\u02c8\5p9\2\u02c7\u02c9\5l\67\2\u02c8\u02c7\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02bd\3\2\2\2\u02ca\u02c6\3\2"+
		"\2\2\u02cbe\3\2\2\2\u02cc\u02cd\b\64\1\2\u02cd\u02ce\7\u0184\2\2\u02ce"+
		"\u02cf\5f\64\2\u02cf\u02d0\7\u0185\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02d3"+
		"\5d\63\2\u02d2\u02cc\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02ea\3\2\2\2\u02d4"+
		"\u02d5\f\7\2\2\u02d5\u02d6\7\33\2\2\u02d6\u02d7\7>\2\2\u02d7\u02e9\5f"+
		"\64\b\u02d8\u02d9\f\5\2\2\u02d9\u02da\7}\2\2\u02da\u02db\7>\2\2\u02db"+
		"\u02e9\5f\64\6\u02dc\u02de\f\6\2\2\u02dd\u02df\7K\2\2\u02de\u02dd\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02e2\5h\65\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7>"+
		"\2\2\u02e4\u02e6\5f\64\2\u02e5\u02e7\5v<\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02d4\3\2\2\2\u02e8\u02d8\3\2\2\2\u02e8"+
		"\u02dc\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02ebg\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02f3\78\2\2\u02ee\u02f0"+
		"\5j\66\2\u02ef\u02f1\7\\\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f3\3\2\2\2\u02f2\u02ed\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f3i\3\2\2\2"+
		"\u02f4\u02f5\t\t\2\2\u02f5k\3\2\2\2\u02f6\u02f8\7\t\2\2\u02f7\u02f6\3"+
		"\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fe\5\u011a\u008e"+
		"\2\u02fa\u02fb\7\u0184\2\2\u02fb\u02fc\5n8\2\u02fc\u02fd\7\u0185\2\2\u02fd"+
		"\u02ff\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffm\3\2\2\2"+
		"\u0300\u0301\5\u0114\u008b\2\u0301o\3\2\2\2\u0302\u0304\7\u00d3\2\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0308\5r"+
		":\2\u0306\u0308\5t;\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308q\3"+
		"\2\2\2\u0309\u030f\5:\36\2\u030a\u030b\7\u0184\2\2\u030b\u030c\5~@\2\u030c"+
		"\u030d\7\u0185\2\2\u030d\u030f\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030a"+
		"\3\2\2\2\u030fs\3\2\2\2\u0310\u0311\5\u00f0y\2\u0311\u0313\7\u0184\2\2"+
		"\u0312\u0314\5\"\22\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316"+
		"\3\2\2\2\u0315\u0317\5\u00f4{\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2"+
		"\2\u0317\u0319\3\2\2\2\u0318\u031a\5J&\2\u0319\u0318\3\2\2\2\u0319\u031a"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\u0185\2\2\u031cu\3\2\2\2\u031d"+
		"\u0320\5x=\2\u031e\u0320\5z>\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2"+
		"\u0320w\3\2\2\2\u0321\u0322\7W\2\2\u0322\u0323\5\u0080A\2\u0323y\3\2\2"+
		"\2\u0324\u0325\7\u0081\2\2\u0325\u0326\7\u0184\2\2\u0326\u0327\5|?\2\u0327"+
		"\u0328\7\u0185\2\2\u0328{\3\2\2\2\u0329\u032a\5\u0114\u008b\2\u032a}\3"+
		"\2\2\2\u032b\u032c\7\u0083\2\2\u032c\u032d\7\u0184\2\2\u032d\u032e\5\u00e2"+
		"r\2\u032e\u0336\7\u0185\2\2\u032f\u0330\7\u017d\2\2\u0330\u0331\7\u0184"+
		"\2\2\u0331\u0332\5\u00e2r\2\u0332\u0333\7\u0185\2\2\u0333\u0335\3\2\2"+
		"\2\u0334\u032f\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033b\5J&\2\u033a"+
		"\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033e\5V"+
		",\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\177\3\2\2\2\u033f\u0340"+
		"\5\u0082B\2\u0340\u0081\3\2\2\2\u0341\u0342\bB\1\2\u0342\u0343\5\u00aa"+
		"V\2\u0343\u0344\5\u0082B$\u0344\u036d\3\2\2\2\u0345\u0346\5\u00acW\2\u0346"+
		"\u0347\5\u0082B\36\u0347\u036d\3\2\2\2\u0348\u0349\7O\2\2\u0349\u036d"+
		"\5\u0082B\23\u034a\u036d\5\u0084C\2\u034b\u036d\5\u0086D\2\u034c\u036d"+
		"\5\u0106\u0084\2\u034d\u034e\5\u00e4s\2\u034e\u034f\5\u009cO\2\u034f\u036d"+
		"\3\2\2\2\u0350\u0352\7O\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0354\7&\2\2\u0354\u036d\5\u00b2Z\2\u0355\u036d\5"+
		"\u00b8]\2\u0356\u036d\5\u00ccg\2\u0357\u036d\5\u00ceh\2\u0358\u036d\5"+
		"\u00ba^\2\u0359\u035b\5t;\2\u035a\u035c\5,\27\2\u035b\u035a\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u036d\3\2\2\2\u035d\u036d\5\u00b6\\\2\u035e\u035f"+
		"\7\u0184\2\2\u035f\u0360\5\u0082B\2\u0360\u0361\7\u0185\2\2\u0361\u036d"+
		"\3\2\2\2\u0362\u0364\5\u00a2R\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2"+
		"\2\u0364\u0365\3\2\2\2\u0365\u036d\5\u00b2Z\2\u0366\u036d\5\u00b4[\2\u0367"+
		"\u036d\5\u00dco\2\u0368\u036d\5\u00d6l\2\u0369\u036d\5\u00d8m\2\u036a"+
		"\u036b\7^\2\2\u036b\u036d\5\u0106\u0084\2\u036c\u0341\3\2\2\2\u036c\u0345"+
		"\3\2\2\2\u036c\u0348\3\2\2\2\u036c\u034a\3\2\2\2\u036c\u034b\3\2\2\2\u036c"+
		"\u034c\3\2\2\2\u036c\u034d\3\2\2\2\u036c\u0351\3\2\2\2\u036c\u0355\3\2"+
		"\2\2\u036c\u0356\3\2\2\2\u036c\u0357\3\2\2\2\u036c\u0358\3\2\2\2\u036c"+
		"\u0359\3\2\2\2\u036c\u035d\3\2\2\2\u036c\u035e\3\2\2\2\u036c\u0363\3\2"+
		"\2\2\u036c\u0366\3\2\2\2\u036c\u0367\3\2\2\2\u036c\u0368\3\2\2\2\u036c"+
		"\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u03cf\3\2\2\2\u036e\u036f\f#"+
		"\2\2\u036f\u0370\7\u018d\2\2\u0370\u03ce\5\u0082B#\u0371\u0372\f\"\2\2"+
		"\u0372\u0373\t\n\2\2\u0373\u03ce\5\u0082B#\u0374\u0375\f!\2\2\u0375\u0376"+
		"\t\13\2\2\u0376\u03ce\5\u0082B\"\u0377\u0378\f \2\2\u0378\u037a\7<\2\2"+
		"\u0379\u037b\7O\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u03ce\5\u0082B!\u037d\u037e\f\35\2\2\u037e\u037f\5\u00ac"+
		"W\2\u037f\u0380\5\u0082B\36\u0380\u03ce\3\2\2\2\u0381\u0382\f\33\2\2\u0382"+
		"\u0384\7<\2\2\u0383\u0385\7O\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2"+
		"\2\u0385\u0386\3\2\2\2\u0386\u0387\7 \2\2\u0387\u0388\7+\2\2\u0388\u03ce"+
		"\5\u0082B\34\u0389\u038b\f\30\2\2\u038a\u038c\7O\2\2\u038b\u038a\3\2\2"+
		"\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\7\16\2\2\u038e"+
		"\u038f\5\u0082B\2\u038f\u0390\7\7\2\2\u0390\u0391\5\u0082B\31\u0391\u03ce"+
		"\3\2\2\2\u0392\u0393\f\27\2\2\u0393\u0394\7\u00ef\2\2\u0394\u03ce\5\u0082"+
		"B\30\u0395\u0396\f\25\2\2\u0396\u0397\t\f\2\2\u0397\u03ce\5\u0082B\26"+
		"\u0398\u0399\f\24\2\2\u0399\u039a\t\r\2\2\u039a\u03ce\5\u0082B\24\u039b"+
		"\u039c\f\22\2\2\u039c\u039d\7\7\2\2\u039d\u03ce\5\u0082B\23\u039e\u039f"+
		"\f\21\2\2\u039f\u03a0\7Z\2\2\u03a0\u03ce\5\u0082B\22\u03a1\u03a2\f&\2"+
		"\2\u03a2\u03a3\7\u0178\2\2\u03a3\u03ce\5\u00e4s\2\u03a4\u03ad\f%\2\2\u03a5"+
		"\u03a6\7\u0186\2\2\u03a6\u03a9\5\u0082B\2\u03a7\u03a8\7\u017b\2\2\u03a8"+
		"\u03aa\5\u0082B\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u03ac\7\u0187\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03a5\3\2\2"+
		"\2\u03ae\u03af\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03ce"+
		"\3\2\2\2\u03b1\u03b2\f\37\2\2\u03b2\u03ce\t\16\2\2\u03b3\u03b4\f\34\2"+
		"\2\u03b4\u03b5\7<\2\2\u03b5\u03b6\7S\2\2\u03b6\u03b7\7\u0184\2\2\u03b7"+
		"\u03b8\5\u00eex\2\u03b8\u03b9\7\u0185\2\2\u03b9\u03ce\3\2\2\2\u03ba\u03bc"+
		"\f\32\2\2\u03bb\u03bd\7O\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03c2\7\64\2\2\u03bf\u03c3\5:\36\2\u03c0\u03c3\5"+
		"~@\2\u03c1\u03c3\5\u00b4[\2\u03c2\u03bf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c3\u03ce\3\2\2\2\u03c4\u03c5\f\26\2\2\u03c5\u03c6\5"+
		"\u00d0i\2\u03c6\u03c9\5\u0082B\2\u03c7\u03c8\7\u00b3\2\2\u03c8\u03ca\7"+
		"\u01ad\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03ce\3\2\2\2"+
		"\u03cb\u03cc\f\7\2\2\u03cc\u03ce\5\u009eP\2\u03cd\u036e\3\2\2\2\u03cd"+
		"\u0371\3\2\2\2\u03cd\u0374\3\2\2\2\u03cd\u0377\3\2\2\2\u03cd\u037d\3\2"+
		"\2\2\u03cd\u0381\3\2\2\2\u03cd\u0389\3\2\2\2\u03cd\u0392\3\2\2\2\u03cd"+
		"\u0395\3\2\2\2\u03cd\u0398\3\2\2\2\u03cd\u039b\3\2\2\2\u03cd\u039e\3\2"+
		"\2\2\u03cd\u03a1\3\2\2\2\u03cd\u03a4\3\2\2\2\u03cd\u03b1\3\2\2\2\u03cd"+
		"\u03b3\3\2\2\2\u03cd\u03ba\3\2\2\2\u03cd\u03c4\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u0083\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\t\17\2\2\u03d3\u0085\3"+
		"\2\2\2\u03d4\u03dc\7\u01ad\2\2\u03d5\u03dc\7\u01ac\2\2\u03d6\u03dc\7Q"+
		"\2\2\u03d7\u03dc\7\35\2\2\u03d8\u03dc\7\u01a4\2\2\u03d9\u03dc\5\u0088"+
		"E\2\u03da\u03dc\5\u0096L\2\u03db\u03d4\3\2\2\2\u03db\u03d5\3\2\2\2\u03db"+
		"\u03d6\3\2\2\2\u03db\u03d7\3\2\2\2\u03db\u03d8\3\2\2\2\u03db\u03d9\3\2"+
		"\2\2\u03db\u03da\3\2\2\2\u03dc\u0087\3\2\2\2\u03dd\u03e2\5\u0092J\2\u03de"+
		"\u03e2\5\u0090I\2\u03df\u03e2\5\u0094K\2\u03e0\u03e2\5\u008aF\2\u03e1"+
		"\u03dd\3\2\2\2\u03e1\u03de\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2"+
		"\2\2\u03e2\u0089\3\2\2\2\u03e3\u03e5\7\u0154\2\2\u03e4\u03e6\5\u008eH"+
		"\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9"+
		"\7\u01ad\2\2\u03e8\u03ea\5\u008cG\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3"+
		"\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\5\u008eH\2\u03ec\u03eb\3\2\2\2"+
		"\u03ec\u03ed\3\2\2\2\u03ed\u008b\3\2\2\2\u03ee\u03f1\5\u0098M\2\u03ef"+
		"\u03f0\7x\2\2\u03f0\u03f2\5\u0098M\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3"+
		"\2\2\2\u03f2\u008d\3\2\2\2\u03f3\u03f4\7\u0184\2\2\u03f4\u03f5\5\u0084"+
		"C\2\u03f5\u03f6\7\u0185\2\2\u03f6\u008f\3\2\2\2\u03f7\u03f8\7\u0155\2"+
		"\2\u03f8\u03f9\7\u01ad\2\2\u03f9\u0091\3\2\2\2\u03fa\u03fb\7\u0157\2\2"+
		"\u03fb\u03fc\7\u01ad\2\2\u03fc\u0093\3\2\2\2\u03fd\u03fe\7\u0153\2\2\u03fe"+
		"\u03ff\7\u01ad\2\2\u03ff\u0095\3\2\2\2\u0400\u0401\t\20\2\2\u0401\u0097"+
		"\3\2\2\2\u0402\u0403\t\21\2\2\u0403\u0099\3\2\2\2\u0404\u0405\t\22\2\2"+
		"\u0405\u009b\3\2\2\2\u0406\u040b\7\u01ad\2\2\u0407\u040b\7\u01a4\2\2\u0408"+
		"\u040b\5\u0102\u0082\2\u0409\u040b\5\u011e\u0090\2\u040a\u0406\3\2\2\2"+
		"\u040a\u0407\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u0409\3\2\2\2\u040b\u009d"+
		"\3\2\2\2\u040c\u040d\7\u0099\2\2\u040d\u0415\5\u0104\u0083\2\u040e\u040f"+
		"\7\u0091\2\2\u040f\u0410\7\u0155\2\2\u0410\u0411\7\u013a\2\2\u0411\u0415"+
		"\5\u00a0Q\2\u0412\u0413\7<\2\2\u0413\u0415\7\u00af\2\2\u0414\u040c\3\2"+
		"\2\2\u0414\u040e\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u009f\3\2\2\2\u0416"+
		"\u0417\7\u01ad\2\2\u0417\u00a1\3\2\2\2\u0418\u041b\5\u00a4S\2\u0419\u041b"+
		"\5\u00a6T\2\u041a\u0418\3\2\2\2\u041a\u0419\3\2\2\2\u041b\u00a3\3\2\2"+
		"\2\u041c\u041d\7\5\2\2\u041d\u00a5\3\2\2\2\u041e\u041f\t\23\2\2\u041f"+
		"\u00a7\3\2\2\2\u0420\u0421\t\24\2\2\u0421\u00a9\3\2\2\2\u0422\u0423\t"+
		"\13\2\2\u0423\u00ab\3\2\2\2\u0424\u0430\7\u0181\2\2\u0425\u0430\7\u0183"+
		"\2\2\u0426\u0430\7\u017e\2\2\u0427\u0430\7\u019d\2\2\u0428\u0430\7\u019e"+
		"\2\2\u0429\u0430\7\u019f\2\2\u042a\u0430\7\u01a0\2\2\u042b\u0430\7\u01a1"+
		"\2\2\u042c\u0430\7\u01a2\2\2\u042d\u0430\7\u01a3\2\2\u042e\u0430\5\u00ae"+
		"X\2\u042f\u0424\3\2\2\2\u042f\u0425\3\2\2\2\u042f\u0426\3\2\2\2\u042f"+
		"\u0427\3\2\2\2\u042f\u0428\3\2\2\2\u042f\u0429\3\2\2\2\u042f\u042a\3\2"+
		"\2\2\u042f\u042b\3\2\2\2\u042f\u042c\3\2\2\2\u042f\u042d\3\2\2\2\u042f"+
		"\u042e\3\2\2\2\u0430\u00ad\3\2\2\2\u0431\u0434\7\u01a9\2\2\u0432\u0434"+
		"\5\u00b0Y\2\u0433\u0431\3\2\2\2\u0433\u0432\3\2\2\2\u0434\u00af\3\2\2"+
		"\2\u0435\u0436\t\25\2\2\u0436\u00b1\3\2\2\2\u0437\u0438\5:\36\2\u0438"+
		"\u00b3\3\2\2\2\u0439\u043a\7\u0184\2\2\u043a\u043b\5\u00e2r\2\u043b\u043c"+
		"\7\u0185\2\2\u043c\u00b5\3\2\2\2\u043d\u043e\7\21\2\2\u043e\u0444\5\u0082"+
		"B\2\u043f\u0440\7\u0086\2\2\u0440\u0441\5\u0082B\2\u0441\u0442\7w\2\2"+
		"\u0442\u0443\5\u0082B\2\u0443\u0445\3\2\2\2\u0444\u043f\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u044a\3\2"+
		"\2\2\u0448\u0449\7\"\2\2\u0449\u044b\5\u0082B\2\u044a\u0448\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\7#\2\2\u044d\u045f\3\2"+
		"\2\2\u044e\u0454\7\21\2\2\u044f\u0450\7\u0086\2\2\u0450\u0451\5\u0082"+
		"B\2\u0451\u0452\7w\2\2\u0452\u0453\5\u0082B\2\u0453\u0455\3\2\2\2\u0454"+
		"\u044f\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2"+
		"\2\2\u0457\u045a\3\2\2\2\u0458\u0459\7\"\2\2\u0459\u045b\5\u0082B\2\u045a"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\7#"+
		"\2\2\u045d\u045f\3\2\2\2\u045e\u043d\3\2\2\2\u045e\u044e\3\2\2\2\u045f"+
		"\u00b7\3\2\2\2\u0460\u0461\7\22\2\2\u0461\u0462\7\u0184\2\2\u0462\u0463"+
		"\5\u0082B\2\u0463\u0464\7\t\2\2\u0464\u0465\5\u00e4s\2\u0465\u0466\7\u0185"+
		"\2\2\u0466\u00b9\3\2\2\2\u0467\u046c\5\u00bc_\2\u0468\u046c\5\u00be`\2"+
		"\u0469\u046c\5\u00c4c\2\u046a\u046c\5\u00c6d\2\u046b\u0467\3\2\2\2\u046b"+
		"\u0468\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046a\3\2\2\2\u046c\u00bb\3\2"+
		"\2\2\u046d\u046e\7\u00f7\2\2\u046e\u046f\7\u0184\2\2\u046f\u0470\5\u0082"+
		"B\2\u0470\u0471\7\64\2\2\u0471\u0472\5\u0082B\2\u0472\u0473\7\u0185\2"+
		"\2\u0473\u00bd\3\2\2\2\u0474\u0475\7\u00b9\2\2\u0475\u0476\7\u0184\2\2"+
		"\u0476\u0477\5\u00c0a\2\u0477\u0478\7+\2\2\u0478\u0479\5\u0082B\2\u0479"+
		"\u047a\7\u0185\2\2\u047a\u00bf\3\2\2\2\u047b\u047f\5\u0098M\2\u047c\u047f"+
		"\5\u00c2b\2\u047d\u047f\5\u009aN\2\u047e\u047b\3\2\2\2\u047e\u047c\3\2"+
		"\2\2\u047e\u047d\3\2\2\2\u047f\u00c1\3\2\2\2\u0480\u0481\t\26\2\2\u0481"+
		"\u00c3\3\2\2\2\u0482\u0483\7\u0117\2\2\u0483\u0484\7\u0184\2\2\u0484\u0487"+
		"\5\u0082B\2\u0485\u0486\7+\2\2\u0486\u0488\5\u0082B\2\u0487\u0485\3\2"+
		"\2\2\u0487\u0488\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u048a\7*\2\2\u048a"+
		"\u048c\5\u0082B\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048e\7\u0185\2\2\u048e\u00c5\3\2\2\2\u048f\u0490\7\u0122"+
		"\2\2\u0490\u0491\7\u0184\2\2\u0491\u0492\5\u00c8e\2\u0492\u0493\7\u0185"+
		"\2\2\u0493\u00c7\3\2\2\2\u0494\u0496\5\u00caf\2\u0495\u0494\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0499\5\u0082B\2\u0498\u0497"+
		"\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\7+\2\2\u049b"+
		"\u0495\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a0\5\u0082"+
		"B\2\u049e\u049f\7\u017d\2\2\u049f\u04a1\5\u0082B\2\u04a0\u049e\3\2\2\2"+
		"\u04a0\u04a1\3\2\2\2\u04a1\u00c9\3\2\2\2\u04a2\u04a3\t\27\2\2\u04a3\u00cb"+
		"\3\2\2\2\u04a4\u04ab\7\u0090\2\2\u04a5\u04ac\5\u00b2Z\2\u04a6\u04a8\7"+
		"\u0186\2\2\u04a7\u04a9\5\u00e2r\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2"+
		"\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\7\u0187\2\2\u04ab\u04a5\3\2\2\2\u04ab"+
		"\u04a6\3\2\2\2\u04ac\u00cd\3\2\2\2\u04ad\u04ae\7h\2\2\u04ae\u04b0\7\u0184"+
		"\2\2\u04af\u04b1\5\u00e2r\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u04b3\7\u0185\2\2\u04b3\u00cf\3\2\2\2\u04b4\u04b6"+
		"\7O\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04ba\5\u00d2j\2\u04b8\u04ba\5\u00d4k\2\u04b9\u04b5\3\2\2\2\u04b9\u04b8"+
		"\3\2\2\2\u04ba\u00d1\3\2\2\2\u04bb\u04c2\7B\2\2\u04bc\u04c2\7\62\2\2\u04bd"+
		"\u04c2\7\u0102\2\2\u04be\u04c2\7\u0109\2\2\u04bf\u04c0\7\u0110\2\2\u04c0"+
		"\u04c2\7x\2\2\u04c1\u04bb\3\2\2\2\u04c1\u04bc\3\2\2\2\u04c1\u04bd\3\2"+
		"\2\2\u04c1\u04be\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u00d3\3\2\2\2\u04c3"+
		"\u04c4\t\30\2\2\u04c4\u00d5\3\2\2\2\u04c5\u04c6\7\u0135\2\2\u04c6\u04c7"+
		"\7\u0184\2\2\u04c7\u04c8\t\31\2\2\u04c8\u04c9\5\u00dan\2\u04c9\u04ca\7"+
		"\u0185\2\2\u04ca\u00d7\3\2\2\2\u04cb\u04cc\7\u0137\2\2\u04cc\u04cd\7\u0184"+
		"\2\2\u04cd\u04ce\t\31\2\2\u04ce\u04cf\5\u00dan\2\u04cf\u04d0\7\t\2\2\u04d0"+
		"\u04d1\5\u00e4s\2\u04d1\u04d2\7\u0185\2\2\u04d2\u00d9\3\2\2\2\u04d3\u04d4"+
		"\t\32\2\2\u04d4\u00db\3\2\2\2\u04d5\u04d6\7\u0134\2\2\u04d6\u04d7\7\u0184"+
		"\2\2\u04d7\u04d8\5\u0082B\2\u04d8\u04da\7\u00f5\2\2\u04d9\u04db\5\u00e0"+
		"q\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04de\5\u0082B\2\u04dd\u04df\5\u00e0q\2\u04de\u04dd\3\2\2\2\u04de\u04df"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7\u0185\2\2\u04e1\u00dd\3\2\2"+
		"\2\u04e2\u04e3\7\u0136\2\2\u04e3\u04e4\7\u0184\2\2\u04e4\u04e9\5\u0082"+
		"B\2\u04e5\u04e6\7\u012f\2\2\u04e6\u04ea\5\u0082B\2\u04e7\u04e8\7\u00e7"+
		"\2\2\u04e8\u04ea\7\u01b0\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea"+
		"\u04f3\3\2\2\2\u04eb\u04f1\7\u0112\2\2\u04ec\u04f2\7\u0139\2\2\u04ed\u04ef"+
		"\7\u00e7\2\2\u04ee\u04f0\7\u01b0\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3"+
		"\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04ec\3\2\2\2\u04f1\u04ed\3\2\2\2\u04f2"+
		"\u04f4\3\2\2\2\u04f3\u04eb\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u00df\3\2"+
		"\2\2\u04f5\u04f6\7\20\2\2\u04f6\u04f7\7\u00ff\2\2\u04f7\u00e1\3\2\2\2"+
		"\u04f8\u04fd\5\u0082B\2\u04f9\u04fa\7\u017d\2\2\u04fa\u04fc\5\u0082B\2"+
		"\u04fb\u04f9\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe"+
		"\3\2\2\2\u04fe\u00e3\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u0502\5\u011e\u0090"+
		"\2\u0501\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0516\3\2\2\2\u0505\u0506\7\u0184\2\2\u0506\u0509\5\u00e6"+
		"t\2\u0507\u0508\7\u017d\2\2\u0508\u050a\5\u00e8u\2\u0509\u0507\3\2\2\2"+
		"\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7\u0185\2\2\u050c"+
		"\u0517\3\2\2\2\u050d\u050f\7\u0186\2\2\u050e\u0510\5\u00eav\2\u050f\u050e"+
		"\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\7\u0187\2"+
		"\2\u0512\u050d\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0505\3\2\2\2\u0516\u0512\3\2\2\2\u0516"+
		"\u0517\3\2\2\2\u0517\u051b\3\2\2\2\u0518\u0519\t\33\2\2\u0519\u051a\7"+
		"\u0155\2\2\u051a\u051c\7\u013a\2\2\u051b\u0518\3\2\2\2\u051b\u051c\3\2"+
		"\2\2\u051c\u052b\3\2\2\2\u051d\u0522\7\u0154\2\2\u051e\u051f\7\u0186\2"+
		"\2\u051f\u0520\5\u00ecw\2\u0520\u0521\7\u0187\2\2\u0521\u0523\3\2\2\2"+
		"\u0522\u051e\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0528\3\2\2\2\u0524\u0525"+
		"\7\u0184\2\2\u0525\u0526\5\u00e6t\2\u0526\u0527\7\u0185\2\2\u0527\u0529"+
		"\3\2\2\2\u0528\u0524\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\3\2\2\2\u052a"+
		"\u0501\3\2\2\2\u052a\u051d\3\2\2\2\u052b\u00e5\3\2\2\2\u052c\u052d\7\u01a5"+
		"\2\2\u052d\u00e7\3\2\2\2\u052e\u052f\7\u01a5\2\2\u052f\u00e9\3\2\2\2\u0530"+
		"\u0531\7\u01a5\2\2\u0531\u00eb\3\2\2\2\u0532\u054e\7\u0138\2\2\u0533\u054e"+
		"\7\u00e3\2\2\u0534\u054e\7\u00a7\2\2\u0535\u054e\7\u00c6\2\2\u0536\u054e"+
		"\7\u00e2\2\2\u0537\u054e\7\u010d\2\2\u0538\u0539\7\u0138\2\2\u0539\u053a"+
		"\7x\2\2\u053a\u054e\7\u00e3\2\2\u053b\u053c\7\u00a7\2\2\u053c\u053d\7"+
		"x\2\2\u053d\u054e\7\u00c6\2\2\u053e\u053f\7\u00a7\2\2\u053f\u0540\7x\2"+
		"\2\u0540\u054e\7\u00e2\2\2\u0541\u0542\7\u00a7\2\2\u0542\u0543\7x\2\2"+
		"\u0543\u054e\7\u010d\2\2\u0544\u0545\7\u00c6\2\2\u0545\u0546\7x\2\2\u0546"+
		"\u054e\7\u00e2\2\2\u0547\u0548\7\u00c6\2\2\u0548\u0549\7x\2\2\u0549\u054e"+
		"\7\u010d\2\2\u054a\u054b\7\u00e2\2\2\u054b\u054c\7x\2\2\u054c\u054e\7"+
		"\u010d\2\2\u054d\u0532\3\2\2\2\u054d\u0533\3\2\2\2\u054d\u0534\3\2\2\2"+
		"\u054d\u0535\3\2\2\2\u054d\u0536\3\2\2\2\u054d\u0537\3\2\2\2\u054d\u0538"+
		"\3\2\2\2\u054d\u053b\3\2\2\2\u054d\u053e\3\2\2\2\u054d\u0541\3\2\2\2\u054d"+
		"\u0544\3\2\2\2\u054d\u0547\3\2\2\2\u054d\u054a\3\2\2\2\u054e\u00ed\3\2"+
		"\2\2\u054f\u0554\5\u00e4s\2\u0550\u0551\7\u017d\2\2\u0551\u0553\5\u00e4"+
		"s\2\u0552\u0550\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u00ef\3\2\2\2\u0556\u0554\3\2\2\2\u0557\u055a\5\u00f2"+
		"z\2\u0558\u055a\5\u011e\u0090\2\u0559\u0557\3\2\2\2\u0559\u0558\3\2\2"+
		"\2\u055a\u00f1\3\2\2\2\u055b\u055c\t\34\2\2\u055c\u00f3\3\2\2\2\u055d"+
		"\u0562\5\u00f6|\2\u055e\u055f\7\u017d\2\2\u055f\u0561\5\u00f6|\2\u0560"+
		"\u055e\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2"+
		"\2\2\u0563\u0567\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0567\7\u018a\2\2\u0566"+
		"\u055d\3\2\2\2\u0566\u0565\3\2\2\2\u0567\u00f5\3\2\2\2\u0568\u056a\7\u012a"+
		"\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u0575\5\u0082B\2\u056c\u056d\5\u00f8}\2\u056d\u056e\7\u0179\2\2\u056e"+
		"\u056f\5\u0082B\2\u056f\u0575\3\2\2\2\u0570\u0571\5\u0082B\2\u0571\u0572"+
		"\7\t\2\2\u0572\u0573\5\u0082B\2\u0573\u0575\3\2\2\2\u0574\u0569\3\2\2"+
		"\2\u0574\u056c\3\2\2\2\u0574\u0570\3\2\2\2\u0575\u00f7\3\2\2\2\u0576\u0577"+
		"\5\u011e\u0090\2\u0577\u00f9\3\2\2\2\u0578\u0579\5\u011e\u0090\2\u0579"+
		"\u00fb\3\2\2\2\u057a\u057b\5\u011e\u0090\2\u057b\u00fd\3\2\2\2\u057c\u057d"+
		"\5\u00fa~\2\u057d\u057e\7\u018e\2\2\u057e\u0580\3\2\2\2\u057f\u057c\3"+
		"\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\5\u00fc\177"+
		"\2\u0582\u00ff\3\2\2\2\u0583\u0584\5\u011e\u0090\2\u0584\u0101\3\2\2\2"+
		"\u0585\u0586\5\u00fa~\2\u0586\u0587\7\u018e\2\2\u0587\u0589\3\2\2\2\u0588"+
		"\u0585\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\5\u00fc"+
		"\177\2\u058b\u058c\7\u018e\2\2\u058c\u058e\3\2\2\2\u058d\u0588\3\2\2\2"+
		"\u058d\u058e\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\5\u0100\u0081\2\u0590"+
		"\u0103\3\2\2\2\u0591\u0592\5\u011e\u0090\2\u0592\u0105\3\2\2\2\u0593\u0594"+
		"\5\u00fa~\2\u0594\u0595\7\u018e\2\2\u0595\u0597\3\2\2\2\u0596\u0593\3"+
		"\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\5\u00fc\177"+
		"\2\u0599\u059a\7\u018e\2\2\u059a\u059b\5\u0100\u0081\2\u059b\u059c\7\u018e"+
		"\2\2\u059c\u05a9\3\2\2\2\u059d\u059e\5\u00fc\177\2\u059e\u059f\7\u018e"+
		"\2\2\u059f\u05a1\3\2\2\2\u05a0\u059d\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a3\5\u0100\u0081\2\u05a3\u05a4\7\u018e\2\2\u05a4"+
		"\u05a9\3\2\2\2\u05a5\u05a6\5\u0100\u0081\2\u05a6\u05a7\7\u018e\2\2\u05a7"+
		"\u05a9\3\2\2\2\u05a8\u0596\3\2\2\2\u05a8\u05a0\3\2\2\2\u05a8\u05a5\3\2"+
		"\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\5\u0104\u0083"+
		"\2\u05ab\u0107\3\2\2\2\u05ac\u05ad\5\u011e\u0090\2\u05ad\u0109\3\2\2\2"+
		"\u05ae\u05af\5\u011e\u0090\2\u05af\u010b\3\2\2\2\u05b0\u05b2\5\u010a\u0086"+
		"\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b6\3\2\2\2\u05b3\u05b4"+
		"\7\u00f3\2\2\u05b4\u05b5\7\20\2\2\u05b5\u05b7\5\u00e2r\2\u05b6\u05b3\3"+
		"\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05ba\5J&\2\u05b9"+
		"\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\5\u010e"+
		"\u0088\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u010d\3\2\2\2\u05be"+
		"\u05c0\t\35\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c7\3"+
		"\2\2\2\u05c1\u05c8\5\u0110\u0089\2\u05c2\u05c3\7\16\2\2\u05c3\u05c4\5"+
		"\u0110\u0089\2\u05c4\u05c5\7#\2\2\u05c5\u05c6\5\u0110\u0089\2\u05c6\u05c8"+
		"\3\2\2\2\u05c7\u05c1\3\2\2\2\u05c7\u05c2\3\2\2\2\u05c8\u010f\3\2\2\2\u05c9"+
		"\u05ca\7\u0124\2\2\u05ca\u05d6\7\u00f8\2\2\u05cb\u05cc\7\34\2\2\u05cc"+
		"\u05d6\7h\2\2\u05cd\u05ce\7\u0124\2\2\u05ce\u05d6\7\u00bc\2\2\u05cf\u05d0"+
		"\5\u0082B\2\u05d0\u05d1\7\u00f8\2\2\u05d1\u05d6\3\2\2\2\u05d2\u05d3\5"+
		"\u0082B\2\u05d3\u05d4\7\u00bc\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05c9\3\2"+
		"\2\2\u05d5\u05cb\3\2\2\2\u05d5\u05cd\3\2\2\2\u05d5\u05cf\3\2\2\2\u05d5"+
		"\u05d2\3\2\2\2\u05d6\u0111\3\2\2\2\u05d7\u05dc\5\u0100\u0081\2\u05d8\u05d9"+
		"\7\u017d\2\2\u05d9\u05db\5\u0100\u0081\2\u05da\u05d8\3\2\2\2\u05db\u05de"+
		"\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u0113\3\2\2\2\u05de"+
		"\u05dc\3\2\2\2\u05df\u05e4\5\u0104\u0083\2\u05e0\u05e1\7\u017d\2\2\u05e1"+
		"\u05e3\5\u0104\u0083\2\u05e2\u05e0\3\2\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e2"+
		"\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u0115\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7"+
		"\u05e8\5\u0104\u0083\2\u05e8\u05e9\5\u00e4s\2\u05e9\u0117\3\2\2\2\u05ea"+
		"\u05ef\5\u0116\u008c\2\u05eb\u05ec\7\u017d\2\2\u05ec\u05ee\5\u0116\u008c"+
		"\2\u05ed\u05eb\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u0119\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2\u05f3\5\u011e\u0090"+
		"\2\u05f3\u011b\3\2\2\2\u05f4\u05f5\5\u011e\u0090\2\u05f5\u011d\3\2\2\2"+
		"\u05f6\u05f7\5\u0120\u0091\2\u05f7\u011f\3\2\2\2\u05f8\u05fb\t\36\2\2"+
		"\u05f9\u05fb\5\u0122\u0092\2\u05fa\u05f8\3\2\2\2\u05fa\u05f9\3\2\2\2\u05fb"+
		"\u0121\3\2\2\2\u05fc\u05fd\t\37\2\2\u05fd\u0123\3\2\2\2\u00af\u0129\u012e"+
		"\u0138\u013c\u013f\u0142\u0145\u0148\u014f\u0152\u0155\u015b\u015e\u0161"+
		"\u0169\u0174\u0177\u017f\u018c\u0194\u01a1\u01ad\u01b7\u01bb\u01c6\u01cb"+
		"\u01ce\u01d2\u01d6\u01d9\u01dc\u01df\u01e2\u01e5\u01e9\u01f2\u01f4\u01fb"+
		"\u0200\u0204\u0209\u0213\u0216\u021b\u021f\u0222\u0228\u022f\u0239\u0242"+
		"\u0248\u024c\u0258\u026d\u027d\u0282\u0285\u028b\u0295\u029a\u029f\u02ac"+
		"\u02b0\u02ba\u02bd\u02c1\u02c4\u02c8\u02ca\u02d2\u02de\u02e1\u02e6\u02e8"+
		"\u02ea\u02f0\u02f2\u02f7\u02fe\u0303\u0307\u030e\u0313\u0316\u0319\u031f"+
		"\u0336\u033a\u033d\u0351\u035b\u0363\u036c\u037a\u0384\u038b\u03a9\u03af"+
		"\u03bc\u03c2\u03c9\u03cd\u03cf\u03db\u03e1\u03e5\u03e9\u03ec\u03f1\u040a"+
		"\u0414\u041a\u042f\u0433\u0446\u044a\u0456\u045a\u045e\u046b\u047e\u0487"+
		"\u048b\u0495\u0498\u049b\u04a0\u04a8\u04ab\u04b0\u04b5\u04b9\u04c1\u04da"+
		"\u04de\u04e9\u04ef\u04f1\u04f3\u04fd\u0503\u0509\u050f\u0514\u0516\u051b"+
		"\u0522\u0528\u052a\u054d\u0554\u0559\u0562\u0566\u0569\u0574\u057f\u0588"+
		"\u058d\u0596\u05a0\u05a8\u05b1\u05b6\u05b9\u05bc\u05bf\u05c7\u05d5\u05dc"+
		"\u05e4\u05ef\u05fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}