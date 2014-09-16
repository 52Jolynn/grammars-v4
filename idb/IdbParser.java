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
		ROW=102, PRECISION=246, ILIKE=48, EXCEPT=34, BYTEA=342, VARBIT=309, DISTANCE=403, 
		CREATE=24, STRING_LITERAL=420, UNLOGGED=289, TIMEZONE_MINUTE=283, OFF=82, 
		VARIADIC=293, PRECEDING=245, TIMESTAMPTZ=335, REGEXP=254, ANALYZE=141, 
		GEQ=378, NOCOMPRESS=75, XMLDATA=366, DIVIDE=386, ASC=8, GROUPING=193, 
		PRESERVE=247, TRANSACTION=284, REFRESH=253, TEMP=279, MATERIALIZED=216, 
		INTERSECT2D=394, INT=316, SEMI_COLON=371, CONTENT=157, RLIKE=261, FILE=39, 
		LEADING=61, RESTRICT=259, MILLISECONDS=221, GROUP=44, INTERSECT=56, FETCH=38, 
		USER=126, INTERSECT3D=395, JSON_OBJECT_AT_PATH_AS_TEXT=410, CONSTRAINT=155, 
		TIMEZONE_HOUR=282, MODIFY=72, ALTER=4, FORCE=187, NCHAR=328, TABLE=116, 
		VARCHAR=327, SUB=384, MICROSECONDS=219, FLOAT=322, NOTNULL=76, SUM=275, 
		WHITE_SPACE=422, NOWAIT=78, AT=143, STORAGE=272, AS=7, RIGHT_PAREN=380, 
		GEOMETRY=346, DOCUMENT=173, MAXVALUE=218, COMPRESS=22, AVG=144, LEFT=62, 
		TRUNCATE=121, ZONE=305, BOX3D=345, PLUS=383, MODE=71, LIKE=64, COLLATE=151, 
		OUTER=90, BY=14, DEFERRABLE=171, WHENEVER=133, BOX2D=344, VARCHAR2=130, 
		INHERIT=200, RIGHT=100, HAVING=45, SESSION=106, MINUS=69, CONCATENATION_OPERATOR=373, 
		COLON=370, ROWS=103, FORMAT=189, NATURAL=73, LONG=67, PUBLIC=94, UNSECURED=290, 
		WEEK=298, OBJECT_ID=355, INT8=313, CHAR=326, DAY=165, COUNT=160, RELEASE=256, 
		INT2=311, INT1=310, INT4=312, EXPLAIN=37, EXTENDED=181, QUOTE=391, MODULAR=387, 
		QUARTER=249, THAN=280, ESCAPE=177, CONNECT=23, INHERITS=201, INTERSECTION=204, 
		RETURNING=260, LESS=210, DOUBLE=323, ROWNUM=359, COMMENT=20, SELECT=105, 
		JSON_AS_TEXT=408, INTO=57, ARRAY=142, DUAL=353, NO_INHERIT=230, COALESCE=153, 
		SECOND=265, EPOCH=176, NULL=79, WITHOUT=301, NO=229, EVERY=178, ON=85, 
		MATCH=215, DELETE=28, NUMERIC=324, INET4=343, OF=81, TABLES=276, UNDERLINE=390, 
		VERSIONS_OPERATION=362, DISCARD=172, CUBE=161, NATIONAL=227, OR=88, FILTER=184, 
		CURRVAL=352, COLLECT=152, FALSE=136, UNBOUNDED=287, CURSOR=162, PCTFREE=91, 
		TIMESTAMP=334, RIGHT_SQUARE=382, DEC=166, CONSTRAINTS=156, WHERE=134, 
		NULLIF=232, VAR_SAMP=294, FORWARD=190, YEAR=304, LIMIT=65, MAX=217, DEFERRED=170, 
		FLOAT4=319, CUSTOME_OPERATOR=416, FLOAT8=320, SPACE=421, RESOURCE=98, 
		CROSS=25, USAGE=291, IF=47, RAW=95, GEOMETRY_DUMP=347, BOOLEAN=306, IN=50, 
		MULTIPLY=385, REFERENCES=252, COMMA=372, IS=58, PARTITION=241, SOME=110, 
		EQUAL=369, NEXT=228, CENTURY=148, EXCLUDE=179, WITH=135, INITIALLY=202, 
		REINDEX=96, FUSION=191, GRANT=43, VARBINARY=340, DEFAULT=27, BACKWARD=145, 
		MILLENNIUM=220, SUBSTRING=274, INCREMENT=51, LEFT_OF=397, ASSIGN=368, 
		IMMEDIATE=49, CLUSTER=18, WINDOW=299, GLOBAL=192, MINUTE=224, LEFT_SQUARE=381, 
		INCLUDING=198, LEQ=376, ISODOW=205, OVERWRITE=238, ONLINE=86, XMLSERIALIZE=303, 
		VERSIONS_ENDTIME=361, REGEX=419, NOT=77, FOREIGN=188, CACHE=146, PRIVILEGES=93, 
		CHARACTER=149, ACTION=140, MONTH=225, TYPE=286, STDDEV_POP=270, USING=127, 
		NOT_EQUAL=374, BEGIN=11, VALID=292, CAST_OPERATOR=367, UID=122, TSQUERY=338, 
		STDDEV_SAMP=271, BLOB=341, VERSIONS_XID=365, SUBPARTITION=273, KEY=207, 
		INITIAL=53, ELSE=32, NUMBER=80, BOOL=307, TRAILING=119, RECURSIVE=251, 
		ROLLBACK=101, TABLESPACE=277, REAL=321, MAXEXTENTS=68, SEQUENCES=267, 
		LEVEL=63, INSENSITIVE=203, NONE=231, TRIM=285, NOT_SIMILAR_INSENSITIVE=406, 
		WITHIN=300, LOCATION=213, LEFT_PAREN=379, CONNECT_BY_ISLEAF=351, GEOGRAPHY=348, 
		END=33, SIZE=109, RENAME=97, OPTION=87, IDENTITY=197, ISOYEAR=206, AUDIT=10, 
		PLAIN=243, ONLY=235, ISNULL=59, ASYMMETRIC=9, OWNED=239, POSITION=244, 
		TIME=332, BIND_PARAMETER=411, THEN=117, TSVECTOR=337, OFFSET=84, REPLACE=257, 
		COLUMN=19, ACCESS=1, OBJECT_VALUE=356, EXISTS=36, NVARCHAR=329, ADD=2, 
		INTEGER=317, BOX_EQUAL=402, TO=118, OVERLAPS=237, SUCCESSFUL=112, SET=107, 
		RELATIVE=255, JSON_OBJECT_AT_PATH=409, MIN=222, TEXT=336, HOUR=196, UNION=123, 
		CURRENT=26, NULLS=233, COMMIT=21, SCHEMA=263, CLOSE=150, DECIMAL=325, 
		DROP=31, VERSIONS_STARTSCN=363, BIGINT=318, WHEN=132, MOVE=226, VALIDATE=128, 
		CONCURRENTLY=154, DECLARE=168, START=111, QUOTED_IDENTIFIER=418, BIT=308, 
		REVOKE=99, BETWEEN=12, FIRST=185, PRIOR=92, CAST=16, EXTERNAL=182, ORA_ROWSCN=357, 
		DOUBLE_QUOTE=392, JSON_ARRAY_ELEMENT_OR_FIELD=407, VARYING=296, TRIGGER=120, 
		CASE=15, CASCADE=147, VERBOSE=297, FULL=42, INSERT=55, CARET=388, SAVEPOINT=104, 
		ROWID=358, BOTH=13, TINYINT=314, BLOCK_COMMENT=414, REAL_NUM=413, SYMMETRIC=113, 
		SHARE=108, OFFLINE=83, LAST=208, ABORT=138, SYNONYM=114, UNIQUE=124, VIEW=131, 
		LINE_COMMENT=415, OVERLAPS_ABOVE=400, ROLLUP=262, RESTART=258, ABOVE=399, 
		PRIMARY=248, RIGHT_OF=398, LOCAL=212, EXCLUDING=180, LIST=211, SEQUENCE=266, 
		XMLPARSE=302, COSTS=159, VAR_POP=295, NOT_SIMILAR=404, CHECK=17, FROM=41, 
		DISTINCT=30, TEMPORARY=278, SIMPLE=269, OVER=236, MAIN=214, TIMETZ=333, 
		INNER=54, ORDER=89, TIMEZONE=281, DECADE=167, CYCLE=163, GTH=377, UPDATE=125, 
		FOR=40, COLUMN_VALUE=349, HOLD=195, EXCLUSIVE=35, FOLLOWING=186, AND=5, 
		IDENTIFIED=46, SCROLL=264, INTERVAL=331, LOCK=66, OVERLAP=396, INDEX=52, 
		OIDS=234, MLSLABEL=70, MINVALUE=223, UNKNOWN=288, CONTINUE=158, SYSDATE=115, 
		IDENTIFIER=417, PARTITIONS=242, ALL=3, TILDE=393, DOT=389, EXTRACT=183, 
		DOW=174, PARTIAL=240, NOAUDIT=74, DOY=175, LATERAL=209, VERSIONS_STARTTIME=364, 
		VALUES=129, HASH=194, INDEXES=199, RANGE=250, BELOW=401, TRUE=137, JOIN=60, 
		SIMILAR=268, NUM=412, DEFAULTS=169, LTH=375, ANY=6, NEXTVAL=354, CONNECT_BY_ISCYCLE=350, 
		SIMILAR_INSENSITIVE=405, DESC=29, BINARY=339, DATE=330, VERSIONS_ENDSCN=360, 
		ABSOLUTE=139, DATA=164, SMALLINT=315;
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
		"PARTITION", "PARTITIONS", "PLAIN", "POSITION", "PRECEDING", "PRECISION", 
		"PRESERVE", "PRIMARY", "QUARTER", "RANGE", "RECURSIVE", "REFERENCES", 
		"REFRESH", "REGEXP", "RELATIVE", "RELEASE", "REPLACE", "RESTART", "RESTRICT", 
		"RETURNING", "RLIKE", "ROLLUP", "SCHEMA", "SCROLL", "SECOND", "SEQUENCE", 
		"SEQUENCES", "SIMILAR", "SIMPLE", "STDDEV_POP", "STDDEV_SAMP", "STORAGE", 
		"SUBPARTITION", "SUBSTRING", "SUM", "TABLES", "TABLESPACE", "TEMPORARY", 
		"TEMP", "THAN", "TIMEZONE", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TRANSACTION", 
		"TRIM", "TYPE", "UNBOUNDED", "UNKNOWN", "UNLOGGED", "UNSECURED", "USAGE", 
		"VALID", "VARIADIC", "VAR_SAMP", "VAR_POP", "VARYING", "VERBOSE", "WEEK", 
		"WINDOW", "WITHIN", "WITHOUT", "XMLPARSE", "XMLSERIALIZE", "YEAR", "ZONE", 
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
		"REGEX", "STRING_LITERAL", "' '", "WHITE_SPACE"
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
		RULE_primary_datetime_field = 75, RULE_extended_datetime_field = 76, RULE_collate_expression = 77, 
		RULE_quantifier = 78, RULE_all = 79, RULE_some = 80, RULE_compare_operator = 81, 
		RULE_unary_operator = 82, RULE_any_other_operator = 83, RULE_custome_operator = 84, 
		RULE_postgis_operator = 85, RULE_scalar_subquery = 86, RULE_tuple_value = 87, 
		RULE_case_when = 88, RULE_cast_expr = 89, RULE_value_function = 90, RULE_bit_position_function = 91, 
		RULE_extract_function = 92, RULE_extract_field = 93, RULE_time_zone_field = 94, 
		RULE_substring_function = 95, RULE_trim_function = 96, RULE_trim_operands = 97, 
		RULE_trim_specification = 98, RULE_array_constructor = 99, RULE_row_constructor = 100, 
		RULE_pattern_matcher = 101, RULE_negativable_matcher = 102, RULE_regex_matcher = 103, 
		RULE_xml_parse_expr = 104, RULE_xml_serialize_expr = 105, RULE_xml_value = 106, 
		RULE_expr_list = 107, RULE_data_type = 108, RULE_precision = 109, RULE_scale = 110, 
		RULE_variable_length = 111, RULE_interval_fields = 112, RULE_data_type_list = 113, 
		RULE_function_name = 114, RULE_function_reserved_name = 115, RULE_function_args = 116, 
		RULE_function_arg = 117, RULE_database_name = 118, RULE_schema_name = 119, 
		RULE_qualified_schema_name = 120, RULE_table_name = 121, RULE_qualified_table_name = 122, 
		RULE_column_name = 123, RULE_qualified_column_name = 124, RULE_window_name = 125, 
		RULE_exists_window_name = 126, RULE_window_definition = 127, RULE_frame_clause = 128, 
		RULE_frame = 129, RULE_table_name_list = 130, RULE_column_name_list = 131, 
		RULE_column_definition = 132, RULE_column_definition_list = 133, RULE_correlation_name = 134, 
		RULE_column_alias = 135, RULE_any_name = 136, RULE_identifier = 137, RULE_nonreserved_keywords = 138;
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
		"collate_expression", "quantifier", "all", "some", "compare_operator", 
		"unary_operator", "any_other_operator", "custome_operator", "postgis_operator", 
		"scalar_subquery", "tuple_value", "case_when", "cast_expr", "value_function", 
		"bit_position_function", "extract_function", "extract_field", "time_zone_field", 
		"substring_function", "trim_function", "trim_operands", "trim_specification", 
		"array_constructor", "row_constructor", "pattern_matcher", "negativable_matcher", 
		"regex_matcher", "xml_parse_expr", "xml_serialize_expr", "xml_value", 
		"expr_list", "data_type", "precision", "scale", "variable_length", "interval_fields", 
		"data_type_list", "function_name", "function_reserved_name", "function_args", 
		"function_arg", "database_name", "schema_name", "qualified_schema_name", 
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
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278); statement();
					setState(279); match(SEMI_COLON);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(286); statement();
			setState(288);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(287); match(SEMI_COLON);
				}
			}

			setState(290); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(292); dml();
			}
		}
		catch (RecognitionException re) {
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
			setState(298);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case VALUES:
			case WITH:
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); select_stmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); update_stmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(296); insert_stmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(297); delete_stmt();
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
			setState(300); query_expression();
			setState(302);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(301); order_clause();
				}
			}

			setState(305);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(304); limit_clause();
				}
			}

			setState(308);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(307); offset_clause();
				}
			}

			setState(311);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(310); fetch_clause();
				}
			}

			setState(314);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(313); for_clause();
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
			setState(316); match(UPDATE);
			setState(317); qualified_table_name();
			setState(318); match(SET);
			setState(319); update_list();
			setState(321);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(320); from_clause();
				}
			}

			setState(324);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(323); where_clause();
				}
			}

			setState(327);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(326); returning_clause();
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
			setState(329); match(DELETE);
			setState(330); match(FROM);
			setState(331); qualified_table_name();
			setState(333);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(332); using_clause();
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
			setState(341); match(INSERT);
			setState(342); into_expression();
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(343); match(LEFT_PAREN);
				setState(344); column_name_list();
				setState(345); match(RIGHT_PAREN);
				}
				break;
			}
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(349); match(VALUES);
				setState(350); insert_value();
				}
				break;
			case 2:
				{
				setState(351); select_stmt();
				}
				break;
			case 3:
				{
				setState(352); match(LEFT_PAREN);
				setState(353); select_stmt();
				setState(354); match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				setState(356); match(DEFAULT);
				setState(357); match(VALUES);
				}
				break;
			}
			setState(361);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(360); returning_clause();
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
			setState(363); match(USING);
			setState(364); table_reference();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365); match(COMMA);
				setState(366); table_reference();
				}
				}
				setState(371);
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
			setState(372); match(LEFT_PAREN);
			setState(373); expr_list();
			setState(374); match(RIGHT_PAREN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(375); match(COMMA);
				setState(376); match(LEFT_PAREN);
				setState(377); expr_list();
				setState(378); match(RIGHT_PAREN);
				}
				}
				setState(384);
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
			setState(385); update_content();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386); match(COMMA);
				setState(387); update_content();
				}
				}
				setState(392);
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
			setState(403);
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
				setState(393); qualified_column_name();
				setState(394); match(EQUAL);
				setState(395); expr(0);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); match(LEFT_PAREN);
				setState(398); column_name_list();
				setState(399); match(RIGHT_PAREN);
				setState(400); match(EQUAL);
				setState(401); update_value();
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
			setState(405); match(LEFT_PAREN);
			setState(406); expr_list();
			setState(407); match(RIGHT_PAREN);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408); match(COMMA);
					setState(409); match(LEFT_PAREN);
					setState(410); expr_list();
					setState(411); match(RIGHT_PAREN);
					}
					} 
				}
				setState(417);
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
			setState(418); match(RETURNING);
			setState(419); select_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(445);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(421); query_specification();
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(422); query_rel();
						setState(425);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(423); query_specification();
							}
							break;
						case 2:
							{
							setState(424); query_expression();
							}
							break;
						}
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); match(LEFT_PAREN);
				setState(433); select_stmt();
				setState(434); match(RIGHT_PAREN);
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435); query_rel();
						setState(436); query_expression();
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(443); table_stmt();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 4);
				{
				setState(444); values_stmt();
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
			setState(448);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(447); with_query();
				}
			}

			setState(450); match(SELECT);
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(451); set_qualifier();
				}
				break;
			}
			setState(454); select_list();
			setState(456);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(455); into_expression();
				}
			}

			setState(459);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(458); from_clause();
				}
			}

			setState(462);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(461); where_clause();
				}
			}

			setState(465);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(464); group_clause();
				}
			}

			setState(468);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(467); having_clause();
				}
			}

			setState(471);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(470); window_clause();
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
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(475);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(474);
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
			setState(486);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(477); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(478); match(DISTINCT);
				setState(484);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(479); match(ON);
					setState(480); match(LEFT_PAREN);
					setState(481); expr_list();
					setState(482); match(RIGHT_PAREN);
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
			setState(488); select_sublist();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(489); match(COMMA);
				setState(490); select_sublist();
				}
				}
				setState(495);
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
			setState(498);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497); qualified_asterisk();
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
			setState(500); expr(0);
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(501); as_clause();
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
			setState(507);
			_la = _input.LA(1);
			if (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (WITH - 135)) | (1L << (ABORT - 135)) | (1L << (ABSOLUTE - 135)) | (1L << (ACTION - 135)) | (1L << (ANALYZE - 135)) | (1L << (ARRAY - 135)) | (1L << (AT - 135)) | (1L << (AVG - 135)) | (1L << (BACKWARD - 135)) | (1L << (CACHE - 135)) | (1L << (CASCADE - 135)) | (1L << (CENTURY - 135)) | (1L << (CHARACTER - 135)) | (1L << (CLOSE - 135)) | (1L << (COLLATE - 135)) | (1L << (COLLECT - 135)) | (1L << (COALESCE - 135)) | (1L << (CONCURRENTLY - 135)) | (1L << (CONSTRAINT - 135)) | (1L << (CONSTRAINTS - 135)) | (1L << (CONTINUE - 135)) | (1L << (COSTS - 135)) | (1L << (COUNT - 135)) | (1L << (CUBE - 135)) | (1L << (CURSOR - 135)) | (1L << (CYCLE - 135)) | (1L << (DATA - 135)) | (1L << (DAY - 135)) | (1L << (DEC - 135)) | (1L << (DECADE - 135)) | (1L << (DECLARE - 135)) | (1L << (DEFAULTS - 135)) | (1L << (DEFERRED - 135)) | (1L << (DEFERRABLE - 135)) | (1L << (DISCARD - 135)) | (1L << (DOW - 135)) | (1L << (DOY - 135)) | (1L << (EPOCH - 135)) | (1L << (ESCAPE - 135)) | (1L << (EVERY - 135)) | (1L << (EXCLUDE - 135)) | (1L << (EXCLUDING - 135)) | (1L << (EXTENDED - 135)) | (1L << (EXTERNAL - 135)) | (1L << (EXTRACT - 135)) | (1L << (FILTER - 135)) | (1L << (FIRST - 135)) | (1L << (FOLLOWING - 135)) | (1L << (FORCE - 135)) | (1L << (FOREIGN - 135)) | (1L << (FORMAT - 135)) | (1L << (FORWARD - 135)) | (1L << (FUSION - 135)) | (1L << (GLOBAL - 135)) | (1L << (GROUPING - 135)) | (1L << (HASH - 135)) | (1L << (HOLD - 135)) | (1L << (HOUR - 135)) | (1L << (IDENTITY - 135)) | (1L << (INCLUDING - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (INDEXES - 199)) | (1L << (INHERIT - 199)) | (1L << (INHERITS - 199)) | (1L << (INITIALLY - 199)) | (1L << (INSENSITIVE - 199)) | (1L << (INTERSECTION - 199)) | (1L << (ISODOW - 199)) | (1L << (ISOYEAR - 199)) | (1L << (KEY - 199)) | (1L << (LAST - 199)) | (1L << (LATERAL - 199)) | (1L << (LESS - 199)) | (1L << (LIST - 199)) | (1L << (LOCAL - 199)) | (1L << (LOCATION - 199)) | (1L << (MAIN - 199)) | (1L << (MATCH - 199)) | (1L << (MATERIALIZED - 199)) | (1L << (MAX - 199)) | (1L << (MAXVALUE - 199)) | (1L << (MICROSECONDS - 199)) | (1L << (MILLENNIUM - 199)) | (1L << (MILLISECONDS - 199)) | (1L << (MIN - 199)) | (1L << (MINVALUE - 199)) | (1L << (MINUTE - 199)) | (1L << (MONTH - 199)) | (1L << (MOVE - 199)) | (1L << (NATIONAL - 199)) | (1L << (NEXT - 199)) | (1L << (NO - 199)) | (1L << (NO_INHERIT - 199)) | (1L << (NONE - 199)) | (1L << (NULLIF - 199)) | (1L << (NULLS - 199)) | (1L << (OIDS - 199)) | (1L << (ONLY - 199)) | (1L << (OVERWRITE - 199)) | (1L << (OWNED - 199)) | (1L << (PARTIAL - 199)) | (1L << (PARTITION - 199)) | (1L << (PARTITIONS - 199)) | (1L << (PLAIN - 199)) | (1L << (POSITION - 199)) | (1L << (PRECEDING - 199)) | (1L << (PRECISION - 199)) | (1L << (PRESERVE - 199)) | (1L << (PRIMARY - 199)) | (1L << (QUARTER - 199)) | (1L << (RANGE - 199)) | (1L << (RECURSIVE - 199)) | (1L << (REFERENCES - 199)) | (1L << (REFRESH - 199)) | (1L << (REGEXP - 199)) | (1L << (RELATIVE - 199)) | (1L << (RELEASE - 199)) | (1L << (REPLACE - 199)) | (1L << (RESTART - 199)) | (1L << (RESTRICT - 199)) | (1L << (RETURNING - 199)) | (1L << (RLIKE - 199)) | (1L << (ROLLUP - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (SCHEMA - 263)) | (1L << (SCROLL - 263)) | (1L << (SECOND - 263)) | (1L << (SEQUENCE - 263)) | (1L << (SEQUENCES - 263)) | (1L << (SIMILAR - 263)) | (1L << (SIMPLE - 263)) | (1L << (STDDEV_POP - 263)) | (1L << (STDDEV_SAMP - 263)) | (1L << (STORAGE - 263)) | (1L << (SUBPARTITION - 263)) | (1L << (SUBSTRING - 263)) | (1L << (SUM - 263)) | (1L << (TABLES - 263)) | (1L << (TABLESPACE - 263)) | (1L << (TEMPORARY - 263)) | (1L << (TEMP - 263)) | (1L << (THAN - 263)) | (1L << (TIMEZONE - 263)) | (1L << (TIMEZONE_HOUR - 263)) | (1L << (TIMEZONE_MINUTE - 263)) | (1L << (TRANSACTION - 263)) | (1L << (TRIM - 263)) | (1L << (TYPE - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UNKNOWN - 263)) | (1L << (UNLOGGED - 263)) | (1L << (UNSECURED - 263)) | (1L << (USAGE - 263)) | (1L << (VALID - 263)) | (1L << (VARIADIC - 263)) | (1L << (VAR_SAMP - 263)) | (1L << (VAR_POP - 263)) | (1L << (VARYING - 263)) | (1L << (VERBOSE - 263)) | (1L << (WEEK - 263)) | (1L << (WINDOW - 263)) | (1L << (WITHIN - 263)) | (1L << (WITHOUT - 263)) | (1L << (YEAR - 263)) | (1L << (ZONE - 263)) | (1L << (BOOLEAN - 263)) | (1L << (BOOL - 263)) | (1L << (BIT - 263)) | (1L << (VARBIT - 263)) | (1L << (INT1 - 263)) | (1L << (INT2 - 263)) | (1L << (INT4 - 263)) | (1L << (INT8 - 263)) | (1L << (TINYINT - 263)) | (1L << (SMALLINT - 263)) | (1L << (INT - 263)) | (1L << (INTEGER - 263)) | (1L << (BIGINT - 263)) | (1L << (FLOAT4 - 263)) | (1L << (FLOAT8 - 263)) | (1L << (REAL - 263)) | (1L << (FLOAT - 263)) | (1L << (DOUBLE - 263)) | (1L << (NUMERIC - 263)) | (1L << (DECIMAL - 263)) | (1L << (CHAR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (VARCHAR - 327)) | (1L << (NCHAR - 327)) | (1L << (NVARCHAR - 327)) | (1L << (DATE - 327)) | (1L << (INTERVAL - 327)) | (1L << (TIME - 327)) | (1L << (TIMETZ - 327)) | (1L << (TIMESTAMP - 327)) | (1L << (TIMESTAMPTZ - 327)) | (1L << (TEXT - 327)) | (1L << (TSVECTOR - 327)) | (1L << (TSQUERY - 327)) | (1L << (BINARY - 327)) | (1L << (VARBINARY - 327)) | (1L << (BLOB - 327)) | (1L << (BYTEA - 327)) | (1L << (INET4 - 327)) | (1L << (BOX2D - 327)) | (1L << (BOX3D - 327)) | (1L << (GEOMETRY - 327)) | (1L << (GEOMETRY_DUMP - 327)) | (1L << (GEOGRAPHY - 327)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(504); table_name();
				setState(505); match(DOT);
				}
			}

			setState(509); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(511); match(OVER);
			setState(517);
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
				setState(512); window_name();
				}
				break;
			case LEFT_PAREN:
				{
				setState(513); match(LEFT_PAREN);
				setState(514); window_definition();
				setState(515); match(RIGHT_PAREN);
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
			setState(520);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(519); match(AS);
				}
			}

			setState(525);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(522); column_alias();
				}
				break;
			case 2:
				{
				setState(523); boolean_literal();
				}
				break;
			case 3:
				{
				setState(524); match(NULL);
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
			setState(527); match(INTO);
			setState(529);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(528);
				_la = _input.LA(1);
				if ( !(((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (TEMPORARY - 278)) | (1L << (TEMP - 278)) | (1L << (UNLOGGED - 278)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(532);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(531); match(TABLE);
				}
			}

			setState(534); qualified_table_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(536); match(WITH);
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(537); match(RECURSIVE);
				}
				break;
			}
			setState(540); with_query_clause();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541); match(COMMA);
				setState(542); with_query_clause();
				}
				}
				setState(547);
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
			setState(548); any_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(550); with_query_name();
			setState(555);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(551); match(LEFT_PAREN);
				setState(552); column_name_list();
				setState(553); match(RIGHT_PAREN);
				}
			}

			setState(557); match(AS);
			setState(558); match(LEFT_PAREN);
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(559); select_stmt();
				}
				break;
			case 2:
				{
				setState(560); values_stmt();
				}
				break;
			case 3:
				{
				setState(561); insert_stmt();
				}
				break;
			case 4:
				{
				setState(562); update_stmt();
				}
				break;
			case 5:
				{
				setState(563); delete_stmt();
				}
				break;
			}
			setState(566); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(568); match(TABLE);
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(569); match(ONLY);
				}
				break;
			}
			setState(572); table_name();
			setState(574);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(573); match(MULTIPLY);
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
			setState(576); match(LEFT_PAREN);
			setState(577); select_stmt();
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
			setState(580); match(FROM);
			setState(581); table_reference();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(582); match(COMMA);
				setState(583); table_reference();
				}
				}
				setState(588);
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
			setState(589); match(WHERE);
			setState(590); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(592); match(GROUP);
			setState(593); match(BY);
			setState(594); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(596); match(HAVING);
			setState(597); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(599); match(WINDOW);
			setState(600); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(602); window_specifier();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(603); match(COMMA);
				setState(604); window_specifier();
				}
				}
				setState(609);
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
			setState(610); window_name();
			setState(611); match(AS);
			setState(612); window_definition();
			}
		}
		catch (RecognitionException re) {
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
			setState(614); match(ORDER);
			setState(615); match(BY);
			setState(616); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(618); sort_specifier();
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619); match(COMMA);
					setState(620); sort_specifier();
					}
					} 
				}
				setState(625);
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
			setState(626); expr(0);
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(627); order_specification();
				}
				break;
			}
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(630); null_ordering();
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
			setState(637);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(634); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(635); match(USING);
				setState(636); operators();
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
			setState(639);
			_la = _input.LA(1);
			if ( !(((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (LTH - 375)) | (1L << (GTH - 375)) | (1L << (PLUS - 375)) | (1L << (SUB - 375)) | (1L << (MULTIPLY - 375)) | (1L << (DIVIDE - 375)) | (1L << (MODULAR - 375)) | (1L << (CUSTOME_OPERATOR - 375)))) != 0)) ) {
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
			setState(641); match(NULLS);
			setState(642);
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
			setState(644); match(LIMIT);
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(645); count();
				}
				break;
			case 2:
				{
				setState(646); match(ALL);
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
			setState(649); match(OFFSET);
			setState(650); start();
			setState(652);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(651);
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
			setState(654); match(FETCH);
			setState(655);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(656); count();
				}
				break;
			}
			setState(659);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(660); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(662); match(FOR);
			setState(670);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(663); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(664); match(NO);
				setState(665); match(KEY);
				setState(666); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(667); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(668); match(KEY);
				setState(669); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(674);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(672); match(OF);
				setState(673); table_name_list();
				}
			}

			setState(676); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
			setState(678); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(680); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683); joined_table(0);
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
			setState(700);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(686); match(ONLY);
					}
					break;
				}
				setState(689); qualified_table_name();
				setState(691);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(690); match(MULTIPLY);
					}
					break;
				}
				setState(694);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(693); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696); derived_table();
				setState(698);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(697); correlation_specification();
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
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(703); match(LEFT_PAREN);
				setState(704); joined_table(0);
				setState(705); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(707); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(730);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(710);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(711); match(CROSS);
						setState(712); match(JOIN);
						setState(713); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(714);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(715); match(UNION);
						setState(716); match(JOIN);
						setState(717); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(718);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(720);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(719); match(NATURAL);
							}
						}

						setState(723);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(722); join_type();
							}
						}

						setState(725); match(JOIN);
						setState(726); joined_table(0);
						setState(728);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(727); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(734);
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
			setState(740);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); outer_join_type();
				setState(738);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(737); match(OUTER);
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
			setState(742);
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
			setState(745);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(744); match(AS);
				}
			}

			setState(747); correlation_name();
			setState(752);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(748); match(LEFT_PAREN);
				setState(749); derived_column_list();
				setState(750); match(RIGHT_PAREN);
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
			setState(754); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(757);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(756); match(LATERAL);
				}
				break;
			}
			setState(761);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(759); table_subquery();
				}
				break;
			case ALL:
			case ANY:
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
				setState(760); function();
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
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763); subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764); match(LEFT_PAREN);
				setState(765); values_stmt();
				setState(766); match(RIGHT_PAREN);
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
			setState(770); function_name();
			setState(771); match(LEFT_PAREN);
			setState(773);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(772); set_qualifier();
				}
				break;
			}
			setState(776);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (LEFT_OF - 397)) | (1L << (RIGHT_OF - 397)) | (1L << (ABOVE - 397)) | (1L << (OVERLAPS_ABOVE - 397)) | (1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 397)) | (1L << (JSON_AS_TEXT - 397)) | (1L << (JSON_OBJECT_AT_PATH - 397)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(775); function_args();
				}
			}

			setState(779);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(778); order_clause();
				}
			}

			setState(781); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(785);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(783); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(784); named_columns_join();
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
			setState(787); match(ON);
			setState(788); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(790); match(USING);
			setState(791); match(LEFT_PAREN);
			setState(792); join_column_list();
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
			setState(795); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(797); match(VALUES);
			setState(798); match(LEFT_PAREN);
			setState(799); expr_list();
			setState(800); match(RIGHT_PAREN);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(801); match(COMMA);
					setState(802); match(LEFT_PAREN);
					setState(803); expr_list();
					setState(804); match(RIGHT_PAREN);
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(812);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(811); order_clause();
				}
				break;
			}
			setState(815);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(814); limit_clause();
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
			setState(817); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRIOR() { return getToken(IdbParser.PRIOR, 0); }
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
	public static class ExprCollateContext extends ExprContext {
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCollateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExprCollate(this);
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
	public static class ConstantValueContext extends ExprContext {
		public TerminalNode BIND_PARAMETER() { return getToken(IdbParser.BIND_PARAMETER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public ConstantValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitConstantValue(this);
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
	public static class QuantifiedPredicateContext extends ExprContext {
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Compare_operatorContext compare_operator() {
			return getRuleContext(Compare_operatorContext.class,0);
		}
		public Custome_operatorContext custome_operator() {
			return getRuleContext(Custome_operatorContext.class,0);
		}
		public QuantifiedPredicateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitQuantifiedPredicate(this);
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
			setState(858);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(820); unary_operator();
				setState(821); expr(34);
				}
				break;
			case 2:
				{
				_localctx = new UnaryOtherOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(823); any_other_operator();
				setState(824); expr(28);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(826); match(NOT);
				setState(827); expr(17);
				}
				break;
			case 4:
				{
				_localctx = new PriorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(828); match(PRIOR);
				setState(829); expr(1);
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(830); unsigned_numeric_literal();
				}
				break;
			case 6:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(831); string_literal();
				}
				break;
			case 7:
				{
				_localctx = new ColumnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(832); qualified_column_name();
				}
				break;
			case 8:
				{
				_localctx = new ConstantValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(833); data_type();
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==BIND_PARAMETER || _la==STRING_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 9:
				{
				_localctx = new ExistsPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(837);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(836); match(NOT);
					}
				}

				setState(839); match(EXISTS);
				setState(840); scalar_subquery();
				}
				break;
			case 10:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(841); cast_expr();
				}
				break;
			case 11:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(842); array_constructor();
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(843); row_constructor();
				}
				break;
			case 13:
				{
				_localctx = new ValueFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(844); value_function();
				}
				break;
			case 14:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(845); function();
				setState(847);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(846); over_clause();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new CaseWhenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(849); case_when();
				}
				break;
			case 16:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(850); match(LEFT_PAREN);
				setState(851); expr(0);
				setState(852); match(RIGHT_PAREN);
				}
				break;
			case 17:
				{
				_localctx = new ScalarSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(854); scalar_subquery();
				}
				break;
			case 18:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855); tuple_value();
				}
				break;
			case 19:
				{
				_localctx = new XmlParserExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(856); xml_parse_expr();
				}
				break;
			case 20:
				{
				_localctx = new XmlSerializeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(857); xml_serialize_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(965);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(963);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new CaretExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(860);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(861); match(CARET);
						setState(862); expr(33);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(863);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(864);
						_la = _input.LA(1);
						if ( !(((((_la - 385)) & ~0x3f) == 0 && ((1L << (_la - 385)) & ((1L << (MULTIPLY - 385)) | (1L << (DIVIDE - 385)) | (1L << (MODULAR - 385)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(865); expr(33);
						}
						break;
					case 3:
						{
						_localctx = new PlusSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(866);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(867);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(868); expr(32);
						}
						break;
					case 4:
						{
						_localctx = new IsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(869);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(870); match(IS);
						setState(872);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(871); match(NOT);
							}
							break;
						}
						setState(874); expr(31);
						}
						break;
					case 5:
						{
						_localctx = new OtherOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(875);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(876); any_other_operator();
						setState(877); expr(28);
						}
						break;
					case 6:
						{
						_localctx = new IsDistinctExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(879);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(880); match(IS);
						setState(882);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(881); match(NOT);
							}
						}

						setState(884); match(DISTINCT);
						setState(885); match(FROM);
						setState(886); expr(26);
						}
						break;
					case 7:
						{
						_localctx = new BetweenPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(887);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(889);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(888); match(NOT);
							}
						}

						setState(891); match(BETWEEN);
						setState(892); expr(0);
						setState(893); match(AND);
						setState(894); expr(23);
						}
						break;
					case 8:
						{
						_localctx = new OverlapsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(896);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(897); match(OVERLAPS);
						setState(898); expr(22);
						}
						break;
					case 9:
						{
						_localctx = new LessOrGreatThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(899);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(900);
						_la = _input.LA(1);
						if ( !(_la==LTH || _la==GTH) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(901); expr(20);
						}
						break;
					case 10:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(902);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(903);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(904); expr(18);
						}
						break;
					case 11:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(905);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(906); match(AND);
						setState(907); expr(17);
						}
						break;
					case 12:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(908);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(909); match(OR);
						setState(910); expr(16);
						}
						break;
					case 13:
						{
						_localctx = new CastOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(911);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(912); match(CAST_OPERATOR);
						setState(913); data_type();
						}
						break;
					case 14:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(914);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(923); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(915); match(LEFT_SQUARE);
								setState(916); expr(0);
								setState(919);
								_la = _input.LA(1);
								if (_la==COLON) {
									{
									setState(917); match(COLON);
									setState(918); expr(0);
									}
								}

								setState(921); match(RIGHT_SQUARE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(925); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 15:
						{
						_localctx = new NullOrNotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(927);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(928);
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
						setState(929);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(930); match(IS);
						setState(931); match(OF);
						setState(932); match(LEFT_PAREN);
						setState(933); data_type_list();
						setState(934); match(RIGHT_PAREN);
						}
						break;
					case 17:
						{
						_localctx = new InPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(936);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(938);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(937); match(NOT);
							}
						}

						setState(940); match(IN);
						setState(944);
						switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
						case 1:
							{
							setState(941); subquery();
							}
							break;
						case 2:
							{
							setState(942); values_stmt();
							}
							break;
						case 3:
							{
							setState(943); tuple_value();
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new LikePredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(946);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(947); pattern_matcher();
						setState(948); expr(0);
						setState(951);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(949); match(ESCAPE);
							setState(950); match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					case 19:
						{
						_localctx = new ExprCollateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(953);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(954); collate_expression();
						}
						break;
					case 20:
						{
						_localctx = new QuantifiedPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(955);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(958);
						switch (_input.LA(1)) {
						case EQUAL:
						case NOT_EQUAL:
						case LTH:
						case LEQ:
						case GTH:
						case GEQ:
							{
							setState(956); compare_operator();
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
							{
							setState(957); custome_operator();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(960); quantifier();
						setState(961); scalar_subquery();
						}
						break;
					}
					} 
				}
				setState(967);
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
			setState(968);
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
			setState(977);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(970); match(STRING_LITERAL);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(971); match(REGEX);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(972); match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(973); match(DEFAULT);
				}
				break;
			case BIND_PARAMETER:
				enterOuterAlt(_localctx, 5);
				{
				setState(974); match(BIND_PARAMETER);
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(975); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 7);
				{
				setState(976); boolean_literal();
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
			setState(983);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(979); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(980); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(981); date_literal();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(982); interval_literal();
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
			setState(985); match(INTERVAL);
			setState(987);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(986); interval_precision();
				}
			}

			setState(989); ((Interval_literalContext)_localctx).interval_string = match(STRING_LITERAL);
			setState(991);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(990); interval_qualifier();
				}
				break;
			}
			setState(994);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(993); interval_precision();
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
			setState(996); primary_datetime_field();
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(997); match(TO);
				setState(998); primary_datetime_field();
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
			setState(1001); match(LEFT_PAREN);
			setState(1002); unsigned_numeric_literal();
			setState(1003); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(1005); match(TIME);
			setState(1006); ((Time_literalContext)_localctx).time_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
			setState(1008); match(TIMESTAMP);
			setState(1009); ((Timestamp_literalContext)_localctx).timestamp_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
			setState(1011); match(DATE);
			setState(1012); ((Date_literalContext)_localctx).date_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
			setState(1014);
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
			setState(1016);
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
			setState(1018);
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

	public static class Collate_expressionContext extends ParserRuleContext {
		public Column_nameContext collate_id;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(IdbParser.COLLATE, 0); }
		public Collate_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collate_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCollate_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collate_expressionContext collate_expression() throws RecognitionException {
		Collate_expressionContext _localctx = new Collate_expressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_collate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); match(COLLATE);
			setState(1021); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_quantifier);
		try {
			setState(1025);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023); all();
				}
				break;
			case ANY:
			case SOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024); some();
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
		enterRule(_localctx, 158, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); match(ALL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
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
		enterRule(_localctx, 162, RULE_compare_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_la = _input.LA(1);
			if ( !(((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & ((1L << (EQUAL - 369)) | (1L << (NOT_EQUAL - 369)) | (1L << (LTH - 369)) | (1L << (LEQ - 369)) | (1L << (GTH - 369)) | (1L << (GEQ - 369)))) != 0)) ) {
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
		enterRule(_localctx, 164, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
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
		enterRule(_localctx, 166, RULE_any_other_operator);
		try {
			setState(1046);
			switch (_input.LA(1)) {
			case LEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035); match(LEQ);
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036); match(GEQ);
				}
				break;
			case CONCATENATION_OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037); match(CONCATENATION_OPERATOR);
				}
				break;
			case NOT_SIMILAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1038); match(NOT_SIMILAR);
				}
				break;
			case SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039); match(SIMILAR_INSENSITIVE);
				}
				break;
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040); match(NOT_SIMILAR_INSENSITIVE);
				}
				break;
			case JSON_ARRAY_ELEMENT_OR_FIELD:
				enterOuterAlt(_localctx, 7);
				{
				setState(1041); match(JSON_ARRAY_ELEMENT_OR_FIELD);
				}
				break;
			case JSON_AS_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1042); match(JSON_AS_TEXT);
				}
				break;
			case JSON_OBJECT_AT_PATH:
				enterOuterAlt(_localctx, 9);
				{
				setState(1043); match(JSON_OBJECT_AT_PATH);
				}
				break;
			case JSON_OBJECT_AT_PATH_AS_TEXT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1044); match(JSON_OBJECT_AT_PATH_AS_TEXT);
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
				setState(1045); custome_operator();
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
		enterRule(_localctx, 168, RULE_custome_operator);
		try {
			setState(1050);
			switch (_input.LA(1)) {
			case CUSTOME_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048); match(CUSTOME_OPERATOR);
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
				setState(1049); postgis_operator();
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
		enterRule(_localctx, 170, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(((((_la - 394)) & ~0x3f) == 0 && ((1L << (_la - 394)) & ((1L << (INTERSECT2D - 394)) | (1L << (INTERSECT3D - 394)) | (1L << (OVERLAP - 394)) | (1L << (LEFT_OF - 394)) | (1L << (RIGHT_OF - 394)) | (1L << (ABOVE - 394)) | (1L << (OVERLAPS_ABOVE - 394)) | (1L << (BELOW - 394)) | (1L << (BOX_EQUAL - 394)) | (1L << (DISTANCE - 394)))) != 0)) ) {
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
		enterRule(_localctx, 172, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); subquery();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_tuple_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); match(LEFT_PAREN);
			setState(1057); expr_list();
			setState(1058); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 176, RULE_case_when);
		int _la;
		try {
			setState(1093);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060); match(CASE);
				setState(1061); expr(0);
				setState(1067); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1062); match(WHEN);
					setState(1063); expr(0);
					setState(1064); match(THEN);
					setState(1065); expr(0);
					}
					}
					setState(1069); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1073);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1071); match(ELSE);
					setState(1072); expr(0);
					}
				}

				setState(1075); match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077); match(CASE);
				setState(1083); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1078); match(WHEN);
					setState(1079); expr(0);
					setState(1080); match(THEN);
					setState(1081); expr(0);
					}
					}
					setState(1085); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1089);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1087); match(ELSE);
					setState(1088); expr(0);
					}
				}

				setState(1091); match(END);
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
		enterRule(_localctx, 178, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); match(CAST);
			setState(1096); match(LEFT_PAREN);
			setState(1097); expr(0);
			setState(1098); match(AS);
			setState(1099); data_type();
			setState(1100); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_value_function);
		try {
			setState(1106);
			switch (_input.LA(1)) {
			case POSITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102); bit_position_function();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103); extract_function();
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104); substring_function();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1105); trim_function();
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
		enterRule(_localctx, 182, RULE_bit_position_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); match(POSITION);
			setState(1109); match(LEFT_PAREN);
			setState(1110); expr(0);
			setState(1111); match(IN);
			setState(1112); expr(0);
			setState(1113); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 184, RULE_extract_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115); match(EXTRACT);
			setState(1116); match(LEFT_PAREN);
			setState(1117); ((Extract_functionContext)_localctx).extract_field_string = extract_field();
			setState(1118); match(FROM);
			setState(1119); expr(0);
			setState(1120); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 186, RULE_extract_field);
		try {
			setState(1125);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122); primary_datetime_field();
				}
				break;
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123); time_zone_field();
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
				setState(1124); extended_datetime_field();
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
		enterRule(_localctx, 188, RULE_time_zone_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_la = _input.LA(1);
			if ( !(((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (TIMEZONE - 281)) | (1L << (TIMEZONE_HOUR - 281)) | (1L << (TIMEZONE_MINUTE - 281)))) != 0)) ) {
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
		enterRule(_localctx, 190, RULE_substring_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129); match(SUBSTRING);
			setState(1130); match(LEFT_PAREN);
			setState(1131); expr(0);
			setState(1134);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1132); match(FROM);
				setState(1133); expr(0);
				}
			}

			setState(1138);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1136); match(FOR);
				setState(1137); expr(0);
				}
			}

			setState(1140); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_trim_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142); match(TRIM);
			setState(1143); match(LEFT_PAREN);
			setState(1144); trim_operands();
			setState(1145); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 194, RULE_trim_operands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1148);
				_la = _input.LA(1);
				if (_la==BOTH || _la==LEADING || _la==TRAILING) {
					{
					setState(1147); trim_specification();
					}
				}

				setState(1151);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (LEFT_OF - 397)) | (1L << (RIGHT_OF - 397)) | (1L << (ABOVE - 397)) | (1L << (OVERLAPS_ABOVE - 397)) | (1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 397)) | (1L << (JSON_AS_TEXT - 397)) | (1L << (JSON_OBJECT_AT_PATH - 397)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
					{
					setState(1150); ((Trim_operandsContext)_localctx).trim_character = expr(0);
					}
				}

				setState(1153); match(FROM);
				}
				break;
			}
			setState(1156); ((Trim_operandsContext)_localctx).trim_source = expr(0);
			setState(1159);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1157); match(COMMA);
				setState(1158); ((Trim_operandsContext)_localctx).trim_character = expr(0);
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
		enterRule(_localctx, 196, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
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
		enterRule(_localctx, 198, RULE_array_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163); match(ARRAY);
			setState(1170);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(1164); scalar_subquery();
				}
				break;
			case LEFT_SQUARE:
				{
				setState(1165); match(LEFT_SQUARE);
				setState(1167);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (LEFT_OF - 397)) | (1L << (RIGHT_OF - 397)) | (1L << (ABOVE - 397)) | (1L << (OVERLAPS_ABOVE - 397)) | (1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 397)) | (1L << (JSON_AS_TEXT - 397)) | (1L << (JSON_OBJECT_AT_PATH - 397)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
					{
					setState(1166); expr_list();
					}
				}

				setState(1169); match(RIGHT_SQUARE);
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
		enterRule(_localctx, 200, RULE_row_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); match(ROW);
			setState(1173); match(LEFT_PAREN);
			setState(1175);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << EXISTS) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (PRIOR - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (WITH - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (ISODOW - 205)) | (1L << (ISOYEAR - 205)) | (1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SIMPLE - 269)) | (1L << (STDDEV_POP - 269)) | (1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (XMLPARSE - 269)) | (1L << (XMLSERIALIZE - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TIMETZ - 333)) | (1L << (TIMESTAMP - 333)) | (1L << (TIMESTAMPTZ - 333)) | (1L << (TEXT - 333)) | (1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (LEFT_OF - 397)) | (1L << (RIGHT_OF - 397)) | (1L << (ABOVE - 397)) | (1L << (OVERLAPS_ABOVE - 397)) | (1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (JSON_ARRAY_ELEMENT_OR_FIELD - 397)) | (1L << (JSON_AS_TEXT - 397)) | (1L << (JSON_OBJECT_AT_PATH - 397)) | (1L << (JSON_OBJECT_AT_PATH_AS_TEXT - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(1174); expr_list();
				}
			}

			setState(1177); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_pattern_matcher);
		int _la;
		try {
			setState(1184);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1179); match(NOT);
					}
				}

				setState(1182); negativable_matcher();
				}
				break;
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183); regex_matcher();
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
		enterRule(_localctx, 204, RULE_negativable_matcher);
		try {
			setState(1192);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186); match(LIKE);
				}
				break;
			case ILIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187); match(ILIKE);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188); match(REGEXP);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189); match(RLIKE);
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1190); match(SIMILAR);
				setState(1191); match(TO);
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
		enterRule(_localctx, 206, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_la = _input.LA(1);
			if ( !(((((_la - 393)) & ~0x3f) == 0 && ((1L << (_la - 393)) & ((1L << (TILDE - 393)) | (1L << (NOT_SIMILAR - 393)) | (1L << (SIMILAR_INSENSITIVE - 393)) | (1L << (NOT_SIMILAR_INSENSITIVE - 393)))) != 0)) ) {
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
		enterRule(_localctx, 208, RULE_xml_parse_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); match(XMLPARSE);
			setState(1197); match(LEFT_PAREN);
			setState(1198);
			_la = _input.LA(1);
			if ( !(_la==CONTENT || _la==DOCUMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1199); xml_value();
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
		enterRule(_localctx, 210, RULE_xml_serialize_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); match(XMLSERIALIZE);
			setState(1203); match(LEFT_PAREN);
			setState(1204);
			_la = _input.LA(1);
			if ( !(_la==CONTENT || _la==DOCUMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1205); xml_value();
			setState(1206); match(AS);
			setState(1207); data_type();
			setState(1208); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 212, RULE_xml_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
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
		enterRule(_localctx, 214, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1212); expr(0);
			setState(1217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213); match(COMMA);
					setState(1214); expr(0);
					}
					} 
				}
				setState(1219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		enterRule(_localctx, 216, RULE_data_type);
		int _la;
		try {
			int _alt;
			setState(1262);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1220); any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1242);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1225); match(LEFT_PAREN);
					setState(1226); precision();
					setState(1229);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1227); match(COMMA);
						setState(1228); scale();
						}
					}

					setState(1231); match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(1238); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1233); match(LEFT_SQUARE);
							setState(1235);
							_la = _input.LA(1);
							if (_la==NUM) {
								{
								setState(1234); variable_length();
								}
							}

							setState(1237); match(RIGHT_SQUARE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1240); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(1247);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1244);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1245); match(TIME);
					setState(1246); match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249); match(INTERVAL);
				setState(1254);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1250); match(LEFT_SQUARE);
					setState(1251); interval_fields();
					setState(1252); match(RIGHT_SQUARE);
					}
					break;
				}
				setState(1260);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1256); match(LEFT_PAREN);
					setState(1257); precision();
					setState(1258); match(RIGHT_PAREN);
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
		enterRule(_localctx, 218, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); match(NUM);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 220, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266); match(NUM);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 222, RULE_variable_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268); match(NUM);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 224, RULE_interval_fields);
		try {
			setState(1297);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270); match(YEAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271); match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1272); match(DAY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1273); match(HOUR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274); match(MINUTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1275); match(SECOND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1276); match(YEAR);
				setState(1277); match(TO);
				setState(1278); match(MONTH);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1279); match(DAY);
				setState(1280); match(TO);
				setState(1281); match(HOUR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1282); match(DAY);
				setState(1283); match(TO);
				setState(1284); match(MINUTE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1285); match(DAY);
				setState(1286); match(TO);
				setState(1287); match(SECOND);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1288); match(HOUR);
				setState(1289); match(TO);
				setState(1290); match(MINUTE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1291); match(HOUR);
				setState(1292); match(TO);
				setState(1293); match(SECOND);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1294); match(MINUTE);
				setState(1295); match(TO);
				setState(1296); match(SECOND);
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
		enterRule(_localctx, 226, RULE_data_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); data_type();
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1300); match(COMMA);
				setState(1301); data_type();
				}
				}
				setState(1306);
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
		enterRule(_localctx, 228, RULE_function_name);
		try {
			setState(1309);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307); function_reserved_name();
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
				setState(1308); any_name();
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
		public TerminalNode ALL() { return getToken(IdbParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(IdbParser.ANY, 0); }
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
		enterRule(_localctx, 230, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << LEFT))) != 0) || _la==RIGHT) ) {
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
		enterRule(_localctx, 232, RULE_function_args);
		int _la;
		try {
			setState(1322);
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
				setState(1313); function_arg();
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1314); match(COMMA);
					setState(1315); function_arg();
					}
					}
					setState(1320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321); match(MULTIPLY);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(IdbParser.ASSIGN, 0); }
		public TerminalNode VARIADIC() { return getToken(IdbParser.VARIADIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 234, RULE_function_arg);
		try {
			setState(1332);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1324); match(VARIADIC);
					}
					break;
				}
				setState(1327); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328); identifier();
				setState(1329); match(ASSIGN);
				setState(1330); expr(0);
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
		enterRule(_localctx, 236, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 238, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 240, RULE_qualified_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1338); database_name();
				setState(1339); match(DOT);
				}
				break;
			}
			setState(1343); schema_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 244, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1350);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1347); database_name();
					setState(1348); match(DOT);
					}
					break;
				}
				setState(1352); schema_name();
				setState(1353); match(DOT);
				}
				break;
			}
			setState(1357); table_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 246, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 248, RULE_qualified_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1364);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1361); database_name();
					setState(1362); match(DOT);
					}
					break;
				}
				setState(1366); schema_name();
				setState(1367); match(DOT);
				setState(1368); table_name();
				setState(1369); match(DOT);
				}
				break;
			case 2:
				{
				setState(1374);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1371); schema_name();
					setState(1372); match(DOT);
					}
					break;
				}
				setState(1376); table_name();
				setState(1377); match(DOT);
				}
				break;
			case 3:
				{
				setState(1379); table_name();
				setState(1380); match(DOT);
				}
				break;
			}
			setState(1384); column_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 250, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 252, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 254, RULE_window_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1390); exists_window_name();
				}
				break;
			}
			setState(1396);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1393); match(PARTITION);
				setState(1394); match(BY);
				setState(1395); expr_list();
				}
				break;
			}
			setState(1399);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1398); order_clause();
				}
				break;
			}
			setState(1402);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1401); frame_clause();
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
		enterRule(_localctx, 256, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1404);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(1413);
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
				setState(1407); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(1408); match(BETWEEN);
				setState(1409); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(1410); match(END);
				setState(1411); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 258, RULE_frame);
		try {
			setState(1427);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1415); match(UNBOUNDED);
				setState(1416); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417); match(CURRENT);
				setState(1418); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1419); match(UNBOUNDED);
				setState(1420); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1421); expr(0);
				setState(1422); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1424); expr(0);
				setState(1425); match(FOLLOWING);
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
		enterRule(_localctx, 260, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429); table_name();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1430); match(COMMA);
				setState(1431); table_name();
				}
				}
				setState(1436);
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
		enterRule(_localctx, 262, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437); column_name();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1438); match(COMMA);
				setState(1439); column_name();
				}
				}
				setState(1444);
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
		enterRule(_localctx, 264, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445); column_name();
			setState(1446); data_type();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 266, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448); column_definition();
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1449); match(COMMA);
				setState(1450); column_definition();
				}
				}
				setState(1455);
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
		enterRule(_localctx, 268, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 270, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 272, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 274, RULE_identifier);
		int _la;
		try {
			setState(1464);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
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
				setState(1463); nonreserved_keywords();
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
		enterRule(_localctx, 276, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (WITH - 135)) | (1L << (ABORT - 135)) | (1L << (ABSOLUTE - 135)) | (1L << (ACTION - 135)) | (1L << (ANALYZE - 135)) | (1L << (ARRAY - 135)) | (1L << (AT - 135)) | (1L << (AVG - 135)) | (1L << (BACKWARD - 135)) | (1L << (CACHE - 135)) | (1L << (CASCADE - 135)) | (1L << (CENTURY - 135)) | (1L << (CHARACTER - 135)) | (1L << (CLOSE - 135)) | (1L << (COLLATE - 135)) | (1L << (COLLECT - 135)) | (1L << (COALESCE - 135)) | (1L << (CONCURRENTLY - 135)) | (1L << (CONSTRAINT - 135)) | (1L << (CONSTRAINTS - 135)) | (1L << (CONTINUE - 135)) | (1L << (COSTS - 135)) | (1L << (COUNT - 135)) | (1L << (CUBE - 135)) | (1L << (CURSOR - 135)) | (1L << (CYCLE - 135)) | (1L << (DATA - 135)) | (1L << (DAY - 135)) | (1L << (DEC - 135)) | (1L << (DECADE - 135)) | (1L << (DECLARE - 135)) | (1L << (DEFAULTS - 135)) | (1L << (DEFERRED - 135)) | (1L << (DEFERRABLE - 135)) | (1L << (DISCARD - 135)) | (1L << (DOW - 135)) | (1L << (DOY - 135)) | (1L << (EPOCH - 135)) | (1L << (ESCAPE - 135)) | (1L << (EVERY - 135)) | (1L << (EXCLUDE - 135)) | (1L << (EXCLUDING - 135)) | (1L << (EXTENDED - 135)) | (1L << (EXTERNAL - 135)) | (1L << (EXTRACT - 135)) | (1L << (FILTER - 135)) | (1L << (FIRST - 135)) | (1L << (FOLLOWING - 135)) | (1L << (FORCE - 135)) | (1L << (FOREIGN - 135)) | (1L << (FORMAT - 135)) | (1L << (FORWARD - 135)) | (1L << (FUSION - 135)) | (1L << (GLOBAL - 135)) | (1L << (GROUPING - 135)) | (1L << (HASH - 135)) | (1L << (HOLD - 135)) | (1L << (HOUR - 135)) | (1L << (IDENTITY - 135)) | (1L << (INCLUDING - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (INDEXES - 199)) | (1L << (INHERIT - 199)) | (1L << (INHERITS - 199)) | (1L << (INITIALLY - 199)) | (1L << (INSENSITIVE - 199)) | (1L << (INTERSECTION - 199)) | (1L << (ISODOW - 199)) | (1L << (ISOYEAR - 199)) | (1L << (KEY - 199)) | (1L << (LAST - 199)) | (1L << (LATERAL - 199)) | (1L << (LESS - 199)) | (1L << (LIST - 199)) | (1L << (LOCAL - 199)) | (1L << (LOCATION - 199)) | (1L << (MAIN - 199)) | (1L << (MATCH - 199)) | (1L << (MATERIALIZED - 199)) | (1L << (MAX - 199)) | (1L << (MAXVALUE - 199)) | (1L << (MICROSECONDS - 199)) | (1L << (MILLENNIUM - 199)) | (1L << (MILLISECONDS - 199)) | (1L << (MIN - 199)) | (1L << (MINVALUE - 199)) | (1L << (MINUTE - 199)) | (1L << (MONTH - 199)) | (1L << (MOVE - 199)) | (1L << (NATIONAL - 199)) | (1L << (NEXT - 199)) | (1L << (NO - 199)) | (1L << (NO_INHERIT - 199)) | (1L << (NONE - 199)) | (1L << (NULLIF - 199)) | (1L << (NULLS - 199)) | (1L << (OIDS - 199)) | (1L << (ONLY - 199)) | (1L << (OVERWRITE - 199)) | (1L << (OWNED - 199)) | (1L << (PARTIAL - 199)) | (1L << (PARTITION - 199)) | (1L << (PARTITIONS - 199)) | (1L << (PLAIN - 199)) | (1L << (POSITION - 199)) | (1L << (PRECEDING - 199)) | (1L << (PRECISION - 199)) | (1L << (PRESERVE - 199)) | (1L << (PRIMARY - 199)) | (1L << (QUARTER - 199)) | (1L << (RANGE - 199)) | (1L << (RECURSIVE - 199)) | (1L << (REFERENCES - 199)) | (1L << (REFRESH - 199)) | (1L << (REGEXP - 199)) | (1L << (RELATIVE - 199)) | (1L << (RELEASE - 199)) | (1L << (REPLACE - 199)) | (1L << (RESTART - 199)) | (1L << (RESTRICT - 199)) | (1L << (RETURNING - 199)) | (1L << (RLIKE - 199)) | (1L << (ROLLUP - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (SCHEMA - 263)) | (1L << (SCROLL - 263)) | (1L << (SECOND - 263)) | (1L << (SEQUENCE - 263)) | (1L << (SEQUENCES - 263)) | (1L << (SIMILAR - 263)) | (1L << (SIMPLE - 263)) | (1L << (STDDEV_POP - 263)) | (1L << (STDDEV_SAMP - 263)) | (1L << (STORAGE - 263)) | (1L << (SUBPARTITION - 263)) | (1L << (SUBSTRING - 263)) | (1L << (SUM - 263)) | (1L << (TABLES - 263)) | (1L << (TABLESPACE - 263)) | (1L << (TEMPORARY - 263)) | (1L << (TEMP - 263)) | (1L << (THAN - 263)) | (1L << (TIMEZONE - 263)) | (1L << (TIMEZONE_HOUR - 263)) | (1L << (TIMEZONE_MINUTE - 263)) | (1L << (TRANSACTION - 263)) | (1L << (TRIM - 263)) | (1L << (TYPE - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UNKNOWN - 263)) | (1L << (UNLOGGED - 263)) | (1L << (UNSECURED - 263)) | (1L << (USAGE - 263)) | (1L << (VALID - 263)) | (1L << (VARIADIC - 263)) | (1L << (VAR_SAMP - 263)) | (1L << (VAR_POP - 263)) | (1L << (VARYING - 263)) | (1L << (VERBOSE - 263)) | (1L << (WEEK - 263)) | (1L << (WINDOW - 263)) | (1L << (WITHIN - 263)) | (1L << (WITHOUT - 263)) | (1L << (YEAR - 263)) | (1L << (ZONE - 263)) | (1L << (BOOLEAN - 263)) | (1L << (BOOL - 263)) | (1L << (BIT - 263)) | (1L << (VARBIT - 263)) | (1L << (INT1 - 263)) | (1L << (INT2 - 263)) | (1L << (INT4 - 263)) | (1L << (INT8 - 263)) | (1L << (TINYINT - 263)) | (1L << (SMALLINT - 263)) | (1L << (INT - 263)) | (1L << (INTEGER - 263)) | (1L << (BIGINT - 263)) | (1L << (FLOAT4 - 263)) | (1L << (FLOAT8 - 263)) | (1L << (REAL - 263)) | (1L << (FLOAT - 263)) | (1L << (DOUBLE - 263)) | (1L << (NUMERIC - 263)) | (1L << (DECIMAL - 263)) | (1L << (CHAR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (VARCHAR - 327)) | (1L << (NCHAR - 327)) | (1L << (NVARCHAR - 327)) | (1L << (DATE - 327)) | (1L << (INTERVAL - 327)) | (1L << (TIME - 327)) | (1L << (TIMETZ - 327)) | (1L << (TIMESTAMP - 327)) | (1L << (TIMESTAMPTZ - 327)) | (1L << (TEXT - 327)) | (1L << (TSVECTOR - 327)) | (1L << (TSQUERY - 327)) | (1L << (BINARY - 327)) | (1L << (VARBINARY - 327)) | (1L << (BLOB - 327)) | (1L << (BYTEA - 327)) | (1L << (INET4 - 327)) | (1L << (BOX2D - 327)) | (1L << (BOX3D - 327)) | (1L << (GEOMETRY - 327)) | (1L << (GEOMETRY_DUMP - 327)) | (1L << (GEOGRAPHY - 327)))) != 0)) ) {
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
		case 22: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01a8\u05bf\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\3\2\3\2\7\2\u011c"+
		"\n\2\f\2\16\2\u011f\13\2\3\2\3\2\5\2\u0123\n\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\4\u012d\n\4\3\5\3\5\5\5\u0131\n\5\3\5\5\5\u0134\n\5\3\5\5\5"+
		"\u0137\n\5\3\5\5\5\u013a\n\5\3\5\5\5\u013d\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0144\n\6\3\6\5\6\u0147\n\6\3\6\5\6\u014a\n\6\3\7\3\7\3\7\3\7\5\7\u0150"+
		"\n\7\3\7\5\7\u0153\n\7\3\7\5\7\u0156\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u015e"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0169\n\b\3\b\5\b\u016c\n"+
		"\b\3\t\3\t\3\t\3\t\7\t\u0172\n\t\f\t\16\t\u0175\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u017f\n\n\f\n\16\n\u0182\13\n\3\13\3\13\3\13\7\13\u0187"+
		"\n\13\f\13\16\13\u018a\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0196\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01a0\n\r\f\r\16\r\u01a3"+
		"\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u01ac\n\17\7\17\u01ae\n"+
		"\17\f\17\16\17\u01b1\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01b9\n"+
		"\17\f\17\16\17\u01bc\13\17\3\17\3\17\5\17\u01c0\n\17\3\20\5\20\u01c3\n"+
		"\20\3\20\3\20\5\20\u01c7\n\20\3\20\3\20\5\20\u01cb\n\20\3\20\5\20\u01ce"+
		"\n\20\3\20\5\20\u01d1\n\20\3\20\5\20\u01d4\n\20\3\20\5\20\u01d7\n\20\3"+
		"\20\5\20\u01da\n\20\3\21\3\21\5\21\u01de\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u01e7\n\22\5\22\u01e9\n\22\3\23\3\23\3\23\7\23\u01ee\n"+
		"\23\f\23\16\23\u01f1\13\23\3\24\3\24\5\24\u01f5\n\24\3\25\3\25\5\25\u01f9"+
		"\n\25\3\26\3\26\3\26\5\26\u01fe\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0208\n\27\3\30\5\30\u020b\n\30\3\30\3\30\3\30\5\30\u0210\n"+
		"\30\3\31\3\31\5\31\u0214\n\31\3\31\5\31\u0217\n\31\3\31\3\31\3\32\3\32"+
		"\5\32\u021d\n\32\3\32\3\32\3\32\7\32\u0222\n\32\f\32\16\32\u0225\13\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u022e\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0237\n\34\3\34\3\34\3\35\3\35\5\35\u023d\n\35\3"+
		"\35\3\35\5\35\u0241\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37"+
		"\u024b\n\37\f\37\16\37\u024e\13\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\7$\u0260\n$\f$\16$\u0263\13$\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\7\'\u0270\n\'\f\'\16\'\u0273\13\'\3(\3(\5(\u0277\n(\3(\5"+
		"(\u027a\n(\3)\3)\3)\3)\5)\u0280\n)\3*\3*\3+\3+\3+\3,\3,\3,\5,\u028a\n"+
		",\3-\3-\3-\5-\u028f\n-\3.\3.\3.\5.\u0294\n.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u02a1\n/\3/\3/\5/\u02a5\n/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\5\62\u02af\n\62\3\63\5\63\u02b2\n\63\3\63\3\63\5\63\u02b6\n\63\3\63"+
		"\5\63\u02b9\n\63\3\63\3\63\5\63\u02bd\n\63\5\63\u02bf\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u02c7\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u02d3\n\64\3\64\5\64\u02d6\n\64\3\64\3\64\3\64\5"+
		"\64\u02db\n\64\7\64\u02dd\n\64\f\64\16\64\u02e0\13\64\3\65\3\65\3\65\5"+
		"\65\u02e5\n\65\5\65\u02e7\n\65\3\66\3\66\3\67\5\67\u02ec\n\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u02f3\n\67\38\38\39\59\u02f8\n9\39\39\59\u02fc\n"+
		"9\3:\3:\3:\3:\3:\5:\u0303\n:\3;\3;\3;\5;\u0308\n;\3;\5;\u030b\n;\3;\5"+
		";\u030e\n;\3;\3;\3<\3<\5<\u0314\n<\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\7@\u0329\n@\f@\16@\u032c\13@\3@\5@\u032f\n@\3@"+
		"\5@\u0332\n@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\5B\u0348\nB\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0352\nB\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\5B\u035d\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u036b\nB"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0375\nB\3B\3B\3B\3B\3B\5B\u037c\nB\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\5B\u039a\nB\3B\3B\6B\u039e\nB\rB\16B\u039f\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\5B\u03ad\nB\3B\3B\3B\3B\5B\u03b3\nB\3B\3B\3B\3B\3B\5"+
		"B\u03ba\nB\3B\3B\3B\3B\3B\5B\u03c1\nB\3B\3B\3B\7B\u03c6\nB\fB\16B\u03c9"+
		"\13B\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D\u03d4\nD\3E\3E\3E\3E\5E\u03da\nE\3"+
		"F\3F\5F\u03de\nF\3F\3F\5F\u03e2\nF\3F\5F\u03e5\nF\3G\3G\3G\5G\u03ea\n"+
		"G\3H\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3"+
		"P\3P\5P\u0404\nP\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\5U\u0419\nU\3V\3V\5V\u041d\nV\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\6Z\u042e\nZ\rZ\16Z\u042f\3Z\3Z\5Z\u0434\nZ\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\6Z\u043e\nZ\rZ\16Z\u043f\3Z\3Z\5Z\u0444\nZ\3Z\3Z\5Z\u0448\nZ\3"+
		"[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\5\\\u0455\n\\\3]\3]\3]\3]\3]\3]\3"+
		"]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\5_\u0468\n_\3`\3`\3a\3a\3a\3a\3a\5a\u0471"+
		"\na\3a\3a\5a\u0475\na\3a\3a\3b\3b\3b\3b\3b\3c\5c\u047f\nc\3c\5c\u0482"+
		"\nc\3c\5c\u0485\nc\3c\3c\3c\5c\u048a\nc\3d\3d\3e\3e\3e\3e\5e\u0492\ne"+
		"\3e\5e\u0495\ne\3f\3f\3f\5f\u049a\nf\3f\3f\3g\5g\u049f\ng\3g\3g\5g\u04a3"+
		"\ng\3h\3h\3h\3h\3h\3h\5h\u04ab\nh\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k"+
		"\3k\3k\3k\3k\3l\3l\3m\3m\3m\7m\u04c2\nm\fm\16m\u04c5\13m\3n\6n\u04c8\n"+
		"n\rn\16n\u04c9\3n\3n\3n\3n\5n\u04d0\nn\3n\3n\3n\3n\5n\u04d6\nn\3n\6n\u04d9"+
		"\nn\rn\16n\u04da\5n\u04dd\nn\3n\3n\3n\5n\u04e2\nn\3n\3n\3n\3n\3n\5n\u04e9"+
		"\nn\3n\3n\3n\3n\5n\u04ef\nn\5n\u04f1\nn\3o\3o\3p\3p\3q\3q\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r"+
		"\5r\u0514\nr\3s\3s\3s\7s\u0519\ns\fs\16s\u051c\13s\3t\3t\5t\u0520\nt\3"+
		"u\3u\3v\3v\3v\7v\u0527\nv\fv\16v\u052a\13v\3v\5v\u052d\nv\3w\5w\u0530"+
		"\nw\3w\3w\3w\3w\3w\5w\u0537\nw\3x\3x\3y\3y\3z\3z\3z\5z\u0540\nz\3z\3z"+
		"\3{\3{\3|\3|\3|\5|\u0549\n|\3|\3|\3|\5|\u054e\n|\3|\3|\3}\3}\3~\3~\3~"+
		"\5~\u0557\n~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u0561\n~\3~\3~\3~\3~\3~\3~\5~"+
		"\u0569\n~\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\5\u0081\u0572\n\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u0577\n\u0081\3\u0081\5\u0081\u057a\n"+
		"\u0081\3\u0081\5\u0081\u057d\n\u0081\3\u0082\5\u0082\u0580\n\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0588\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\5\u0083\u0596\n\u0083\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u059b\n\u0084\f\u0084\16\u0084\u059e\13\u0084\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u05a3\n\u0085\f\u0085\16\u0085\u05a6\13\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\7\u0087\u05ae\n\u0087\f\u0087\16\u0087"+
		"\u05b1\13\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\5\u008b\u05bb\n\u008b\3\u008c\3\u008c\3\u008c\2\4f\u0082\u008d"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\2 \5\2$$::}}\4"+
		"\2\5\5  \4\2\u0118\u0119\u0123\u0123\6\2\u0179\u0179\u017b\u017b\u0181"+
		"\u0185\u01a2\u01a2\4\2\u00bb\u00bb\u00d2\u00d2\3\2hi\4\2\u00bb\u00bb\u00e6"+
		"\u00e6\5\2,,@@ff\4\2\u019d\u019d\u01a6\u01a6\3\2\u0183\u0185\3\2\u0181"+
		"\u0182\4\2\u0179\u0179\u017b\u017b\4\2\u0173\u0173\u0178\u0178\4\2==N"+
		"N\3\2\u019e\u019f\4\2\u008a\u008b\u0122\u0122\7\2\u00a7\u00a7\u00c6\u00c6"+
		"\u00e2\u00e3\u010b\u010b\u0132\u0132\t\2\u0096\u0096\u00a9\u00a9\u00b0"+
		"\u00b2\u00cf\u00d0\u00dd\u00df\u00fb\u00fb\u012c\u012c\4\2\b\bpp\4\2\u0173"+
		"\u0173\u0178\u017c\3\2\u018c\u0195\3\2\u011b\u011d\5\2\17\17??yy\4\2\u018b"+
		"\u018b\u0196\u0198\4\2\u009f\u009f\u00af\u00af\4\2\u0089\u0089\u012f\u012f"+
		"\6\2\5\5\b\b@@ff\4\2ii\u00fc\u00fc\3\2\u01a3\u01a4\b\2\u0089\u0089\u008c"+
		"\u009e\u00a0\u00ae\u00b0\u00ed\u00f0\u012f\u0132\u015e\u0632\2\u011d\3"+
		"\2\2\2\4\u0126\3\2\2\2\6\u012c\3\2\2\2\b\u012e\3\2\2\2\n\u013e\3\2\2\2"+
		"\f\u014b\3\2\2\2\16\u0157\3\2\2\2\20\u016d\3\2\2\2\22\u0176\3\2\2\2\24"+
		"\u0183\3\2\2\2\26\u0195\3\2\2\2\30\u0197\3\2\2\2\32\u01a4\3\2\2\2\34\u01bf"+
		"\3\2\2\2\36\u01c2\3\2\2\2 \u01db\3\2\2\2\"\u01e8\3\2\2\2$\u01ea\3\2\2"+
		"\2&\u01f4\3\2\2\2(\u01f6\3\2\2\2*\u01fd\3\2\2\2,\u0201\3\2\2\2.\u020a"+
		"\3\2\2\2\60\u0211\3\2\2\2\62\u021a\3\2\2\2\64\u0226\3\2\2\2\66\u0228\3"+
		"\2\2\28\u023a\3\2\2\2:\u0242\3\2\2\2<\u0246\3\2\2\2>\u024f\3\2\2\2@\u0252"+
		"\3\2\2\2B\u0256\3\2\2\2D\u0259\3\2\2\2F\u025c\3\2\2\2H\u0264\3\2\2\2J"+
		"\u0268\3\2\2\2L\u026c\3\2\2\2N\u0274\3\2\2\2P\u027f\3\2\2\2R\u0281\3\2"+
		"\2\2T\u0283\3\2\2\2V\u0286\3\2\2\2X\u028b\3\2\2\2Z\u0290\3\2\2\2\\\u0298"+
		"\3\2\2\2^\u02a8\3\2\2\2`\u02aa\3\2\2\2b\u02ae\3\2\2\2d\u02be\3\2\2\2f"+
		"\u02c6\3\2\2\2h\u02e6\3\2\2\2j\u02e8\3\2\2\2l\u02eb\3\2\2\2n\u02f4\3\2"+
		"\2\2p\u02f7\3\2\2\2r\u0302\3\2\2\2t\u0304\3\2\2\2v\u0313\3\2\2\2x\u0315"+
		"\3\2\2\2z\u0318\3\2\2\2|\u031d\3\2\2\2~\u031f\3\2\2\2\u0080\u0333\3\2"+
		"\2\2\u0082\u035c\3\2\2\2\u0084\u03ca\3\2\2\2\u0086\u03d3\3\2\2\2\u0088"+
		"\u03d9\3\2\2\2\u008a\u03db\3\2\2\2\u008c\u03e6\3\2\2\2\u008e\u03eb\3\2"+
		"\2\2\u0090\u03ef\3\2\2\2\u0092\u03f2\3\2\2\2\u0094\u03f5\3\2\2\2\u0096"+
		"\u03f8\3\2\2\2\u0098\u03fa\3\2\2\2\u009a\u03fc\3\2\2\2\u009c\u03fe\3\2"+
		"\2\2\u009e\u0403\3\2\2\2\u00a0\u0405\3\2\2\2\u00a2\u0407\3\2\2\2\u00a4"+
		"\u0409\3\2\2\2\u00a6\u040b\3\2\2\2\u00a8\u0418\3\2\2\2\u00aa\u041c\3\2"+
		"\2\2\u00ac\u041e\3\2\2\2\u00ae\u0420\3\2\2\2\u00b0\u0422\3\2\2\2\u00b2"+
		"\u0447\3\2\2\2\u00b4\u0449\3\2\2\2\u00b6\u0454\3\2\2\2\u00b8\u0456\3\2"+
		"\2\2\u00ba\u045d\3\2\2\2\u00bc\u0467\3\2\2\2\u00be\u0469\3\2\2\2\u00c0"+
		"\u046b\3\2\2\2\u00c2\u0478\3\2\2\2\u00c4\u0484\3\2\2\2\u00c6\u048b\3\2"+
		"\2\2\u00c8\u048d\3\2\2\2\u00ca\u0496\3\2\2\2\u00cc\u04a2\3\2\2\2\u00ce"+
		"\u04aa\3\2\2\2\u00d0\u04ac\3\2\2\2\u00d2\u04ae\3\2\2\2\u00d4\u04b4\3\2"+
		"\2\2\u00d6\u04bc\3\2\2\2\u00d8\u04be\3\2\2\2\u00da\u04f0\3\2\2\2\u00dc"+
		"\u04f2\3\2\2\2\u00de\u04f4\3\2\2\2\u00e0\u04f6\3\2\2\2\u00e2\u0513\3\2"+
		"\2\2\u00e4\u0515\3\2\2\2\u00e6\u051f\3\2\2\2\u00e8\u0521\3\2\2\2\u00ea"+
		"\u052c\3\2\2\2\u00ec\u0536\3\2\2\2\u00ee\u0538\3\2\2\2\u00f0\u053a\3\2"+
		"\2\2\u00f2\u053f\3\2\2\2\u00f4\u0543\3\2\2\2\u00f6\u054d\3\2\2\2\u00f8"+
		"\u0551\3\2\2\2\u00fa\u0568\3\2\2\2\u00fc\u056c\3\2\2\2\u00fe\u056e\3\2"+
		"\2\2\u0100\u0571\3\2\2\2\u0102\u057f\3\2\2\2\u0104\u0595\3\2\2\2\u0106"+
		"\u0597\3\2\2\2\u0108\u059f\3\2\2\2\u010a\u05a7\3\2\2\2\u010c\u05aa\3\2"+
		"\2\2\u010e\u05b2\3\2\2\2\u0110\u05b4\3\2\2\2\u0112\u05b6\3\2\2\2\u0114"+
		"\u05ba\3\2\2\2\u0116\u05bc\3\2\2\2\u0118\u0119\5\4\3\2\u0119\u011a\7\u0175"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0122\5\4\3\2\u0121\u0123\7\u0175\2\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7\2\2\3\u0125\3\3\2\2\2"+
		"\u0126\u0127\5\6\4\2\u0127\5\3\2\2\2\u0128\u012d\5\b\5\2\u0129\u012d\5"+
		"\n\6\2\u012a\u012d\5\16\b\2\u012b\u012d\5\f\7\2\u012c\u0128\3\2\2\2\u012c"+
		"\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\7\3\2\2\2"+
		"\u012e\u0130\5\34\17\2\u012f\u0131\5J&\2\u0130\u012f\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0134\5V,\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\5X-\2\u0136\u0135\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\5Z.\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\5\\/\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\t\3\2\2\2\u013e\u013f\7\177\2"+
		"\2\u013f\u0140\5\u00f6|\2\u0140\u0141\7m\2\2\u0141\u0143\5\24\13\2\u0142"+
		"\u0144\5<\37\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0147\5> \2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u014a\5\32\16\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2"+
		"\u014a\13\3\2\2\2\u014b\u014c\7\36\2\2\u014c\u014d\7+\2\2\u014d\u014f"+
		"\5\u00f6|\2\u014e\u0150\5\20\t\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2"+
		"\2\u0150\u0152\3\2\2\2\u0151\u0153\5> \2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5\32\16\2\u0155\u0154\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\r\3\2\2\2\u0157\u0158\79\2\2\u0158\u015d\5"+
		"\60\31\2\u0159\u015a\7\u017d\2\2\u015a\u015b\5\u0108\u0085\2\u015b\u015c"+
		"\7\u017e\2\2\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015e\3\2\2"+
		"\2\u015e\u0168\3\2\2\2\u015f\u0160\7\u0083\2\2\u0160\u0169\5\22\n\2\u0161"+
		"\u0169\5\b\5\2\u0162\u0163\7\u017d\2\2\u0163\u0164\5\b\5\2\u0164\u0165"+
		"\7\u017e\2\2\u0165\u0169\3\2\2\2\u0166\u0167\7\35\2\2\u0167\u0169\7\u0083"+
		"\2\2\u0168\u015f\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0162\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\5\32\16\2\u016b\u016a\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\17\3\2\2\2\u016d\u016e\7\u0081\2\2\u016e"+
		"\u0173\5b\62\2\u016f\u0170\7\u0176\2\2\u0170\u0172\5b\62\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\21\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\u017d\2\2\u0177\u0178\5"+
		"\u00d8m\2\u0178\u0180\7\u017e\2\2\u0179\u017a\7\u0176\2\2\u017a\u017b"+
		"\7\u017d\2\2\u017b\u017c\5\u00d8m\2\u017c\u017d\7\u017e\2\2\u017d\u017f"+
		"\3\2\2\2\u017e\u0179\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\23\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0188\5\26\f"+
		"\2\u0184\u0185\7\u0176\2\2\u0185\u0187\5\26\f\2\u0186\u0184\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\25\3\2\2"+
		"\2\u018a\u0188\3\2\2\2\u018b\u018c\5\u00fa~\2\u018c\u018d\7\u0173\2\2"+
		"\u018d\u018e\5\u0082B\2\u018e\u0196\3\2\2\2\u018f\u0190\7\u017d\2\2\u0190"+
		"\u0191\5\u0108\u0085\2\u0191\u0192\7\u017e\2\2\u0192\u0193\7\u0173\2\2"+
		"\u0193\u0194\5\30\r\2\u0194\u0196\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u018f"+
		"\3\2\2\2\u0196\27\3\2\2\2\u0197\u0198\7\u017d\2\2\u0198\u0199\5\u00d8"+
		"m\2\u0199\u01a1\7\u017e\2\2\u019a\u019b\7\u0176\2\2\u019b\u019c\7\u017d"+
		"\2\2\u019c\u019d\5\u00d8m\2\u019d\u019e\7\u017e\2\2\u019e\u01a0\3\2\2"+
		"\2\u019f\u019a\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\31\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\u0106\2\2"+
		"\u01a5\u01a6\5$\23\2\u01a6\33\3\2\2\2\u01a7\u01af\5\36\20\2\u01a8\u01ab"+
		"\5 \21\2\u01a9\u01ac\5\36\20\2\u01aa\u01ac\5\34\17\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01aa\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01c0\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\7\u017d\2\2\u01b3\u01b4\5\b\5\2\u01b4\u01ba"+
		"\7\u017e\2\2\u01b5\u01b6\5 \21\2\u01b6\u01b7\5\34\17\2\u01b7\u01b9\3\2"+
		"\2\2\u01b8\u01b5\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01c0\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\58"+
		"\35\2\u01be\u01c0\5~@\2\u01bf\u01a7\3\2\2\2\u01bf\u01b2\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\35\3\2\2\2\u01c1\u01c3\5\62\32"+
		"\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6"+
		"\7k\2\2\u01c5\u01c7\5\"\22\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\5$\23\2\u01c9\u01cb\5\60\31\2\u01ca\u01c9\3"+
		"\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5<\37\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5>"+
		" \2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d4\5@!\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2"+
		"\2\u01d5\u01d7\5B\"\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9"+
		"\3\2\2\2\u01d8\u01da\5D#\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\37\3\2\2\2\u01db\u01dd\t\2\2\2\u01dc\u01de\t\3\2\2\u01dd\u01dc\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de!\3\2\2\2\u01df\u01e9\7\5\2\2\u01e0\u01e6"+
		"\7 \2\2\u01e1\u01e2\7W\2\2\u01e2\u01e3\7\u017d\2\2\u01e3\u01e4\5\u00d8"+
		"m\2\u01e4\u01e5\7\u017e\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01df\3\2\2\2\u01e8\u01e0\3\2"+
		"\2\2\u01e9#\3\2\2\2\u01ea\u01ef\5&\24\2\u01eb\u01ec\7\u0176\2\2\u01ec"+
		"\u01ee\5&\24\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0%\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5"+
		"\5(\25\2\u01f3\u01f5\5*\26\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\'\3\2\2\2\u01f6\u01f8\5\u0082B\2\u01f7\u01f9\5.\30\2\u01f8\u01f7\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9)\3\2\2\2\u01fa\u01fb\5\u00f4{\2\u01fb\u01fc"+
		"\7\u0187\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fe\3\2\2"+
		"\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\u0183\2\2\u0200+\3\2\2\2\u0201\u0207"+
		"\7\u00ee\2\2\u0202\u0208\5\u00fc\177\2\u0203\u0204\7\u017d\2\2\u0204\u0205"+
		"\5\u0100\u0081\2\u0205\u0206\7\u017e\2\2\u0206\u0208\3\2\2\2\u0207\u0202"+
		"\3\2\2\2\u0207\u0203\3\2\2\2\u0208-\3\2\2\2\u0209\u020b\7\t\2\2\u020a"+
		"\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020f\3\2\2\2\u020c\u0210\5\u0110"+
		"\u0089\2\u020d\u0210\5\u0096L\2\u020e\u0210\7Q\2\2\u020f\u020c\3\2\2\2"+
		"\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210/\3\2\2\2\u0211\u0213\7"+
		";\2\2\u0212\u0214\t\4\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0216\3\2\2\2\u0215\u0217\7v\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5\u00f6|\2\u0219\61\3\2\2\2\u021a"+
		"\u021c\7\u0089\2\2\u021b\u021d\7\u00fd\2\2\u021c\u021b\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0223\5\66\34\2\u021f\u0220\7\u0176"+
		"\2\2\u0220\u0222\5\66\34\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\63\3\2\2\2\u0225\u0223\3\2\2"+
		"\2\u0226\u0227\5\u0112\u008a\2\u0227\65\3\2\2\2\u0228\u022d\5\64\33\2"+
		"\u0229\u022a\7\u017d\2\2\u022a\u022b\5\u0108\u0085\2\u022b\u022c\7\u017e"+
		"\2\2\u022c\u022e\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0230\7\t\2\2\u0230\u0236\7\u017d\2\2\u0231\u0237"+
		"\5\b\5\2\u0232\u0237\5~@\2\u0233\u0237\5\16\b\2\u0234\u0237\5\n\6\2\u0235"+
		"\u0237\5\f\7\2\u0236\u0231\3\2\2\2\u0236\u0232\3\2\2\2\u0236\u0233\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\7\u017e\2\2\u0239\67\3\2\2\2\u023a\u023c\7v\2\2\u023b\u023d\7\u00ed"+
		"\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u0240\5\u00f4{\2\u023f\u0241\7\u0183\2\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u02419\3\2\2\2\u0242\u0243\7\u017d\2\2\u0243\u0244\5\b\5\2\u0244"+
		"\u0245\7\u017e\2\2\u0245;\3\2\2\2\u0246\u0247\7+\2\2\u0247\u024c\5b\62"+
		"\2\u0248\u0249\7\u0176\2\2\u0249\u024b\5b\62\2\u024a\u0248\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d=\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024f\u0250\7\u0088\2\2\u0250\u0251\5\u0080A\2\u0251"+
		"?\3\2\2\2\u0252\u0253\7.\2\2\u0253\u0254\7\20\2\2\u0254\u0255\5\u00d8"+
		"m\2\u0255A\3\2\2\2\u0256\u0257\7/\2\2\u0257\u0258\5\u00d8m\2\u0258C\3"+
		"\2\2\2\u0259\u025a\7\u012d\2\2\u025a\u025b\5F$\2\u025bE\3\2\2\2\u025c"+
		"\u0261\5H%\2\u025d\u025e\7\u0176\2\2\u025e\u0260\5H%\2\u025f\u025d\3\2"+
		"\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"G\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\5\u00fc\177\2\u0265\u0266\7"+
		"\t\2\2\u0266\u0267\5\u0100\u0081\2\u0267I\3\2\2\2\u0268\u0269\7[\2\2\u0269"+
		"\u026a\7\20\2\2\u026a\u026b\5L\'\2\u026bK\3\2\2\2\u026c\u0271\5N(\2\u026d"+
		"\u026e\7\u0176\2\2\u026e\u0270\5N(\2\u026f\u026d\3\2\2\2\u0270\u0273\3"+
		"\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272M\3\2\2\2\u0273\u0271"+
		"\3\2\2\2\u0274\u0276\5\u0082B\2\u0275\u0277\5P)\2\u0276\u0275\3\2\2\2"+
		"\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u027a\5T+\2\u0279\u0278"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027aO\3\2\2\2\u027b\u0280\7\n\2\2\u027c"+
		"\u0280\7\37\2\2\u027d\u027e\7\u0081\2\2\u027e\u0280\5R*\2\u027f\u027b"+
		"\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u027d\3\2\2\2\u0280Q\3\2\2\2\u0281"+
		"\u0282\t\5\2\2\u0282S\3\2\2\2\u0283\u0284\7\u00eb\2\2\u0284\u0285\t\6"+
		"\2\2\u0285U\3\2\2\2\u0286\u0289\7C\2\2\u0287\u028a\5^\60\2\u0288\u028a"+
		"\7\5\2\2\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028aW\3\2\2\2\u028b"+
		"\u028c\7V\2\2\u028c\u028e\5`\61\2\u028d\u028f\t\7\2\2\u028e\u028d\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028fY\3\2\2\2\u0290\u0291\7(\2\2\u0291\u0293"+
		"\t\b\2\2\u0292\u0294\5^\60\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0296\t\7\2\2\u0296\u0297\7\u00ed\2\2\u0297[\3\2"+
		"\2\2\u0298\u02a0\7*\2\2\u0299\u02a1\7\177\2\2\u029a\u029b\7\u00e7\2\2"+
		"\u029b\u029c\7\u00d1\2\2\u029c\u02a1\7\177\2\2\u029d\u02a1\7n\2\2\u029e"+
		"\u029f\7\u00d1\2\2\u029f\u02a1\7n\2\2\u02a0\u0299\3\2\2\2\u02a0\u029a"+
		"\3\2\2\2\u02a0\u029d\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a3\7S\2\2\u02a3\u02a5\5\u0106\u0084\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5"+
		"\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\7P\2\2\u02a7]\3\2\2\2\u02a8\u02a9"+
		"\5\u0082B\2\u02a9_\3\2\2\2\u02aa\u02ab\5\u0082B\2\u02aba\3\2\2\2\u02ac"+
		"\u02af\5d\63\2\u02ad\u02af\5f\64\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02afc\3\2\2\2\u02b0\u02b2\7\u00ed\2\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\5\u00f6|\2\u02b4\u02b6"+
		"\7\u0183\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2"+
		"\2\u02b7\u02b9\5l\67\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bf"+
		"\3\2\2\2\u02ba\u02bc\5p9\2\u02bb\u02bd\5l\67\2\u02bc\u02bb\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b1\3\2\2\2\u02be\u02ba\3\2"+
		"\2\2\u02bfe\3\2\2\2\u02c0\u02c1\b\64\1\2\u02c1\u02c2\7\u017d\2\2\u02c2"+
		"\u02c3\5f\64\2\u02c3\u02c4\7\u017e\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c7"+
		"\5d\63\2\u02c6\u02c0\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02de\3\2\2\2\u02c8"+
		"\u02c9\f\7\2\2\u02c9\u02ca\7\33\2\2\u02ca\u02cb\7>\2\2\u02cb\u02dd\5f"+
		"\64\b\u02cc\u02cd\f\5\2\2\u02cd\u02ce\7}\2\2\u02ce\u02cf\7>\2\2\u02cf"+
		"\u02dd\5f\64\6\u02d0\u02d2\f\6\2\2\u02d1\u02d3\7K\2\2\u02d2\u02d1\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d6\5h\65\2\u02d5"+
		"\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\7>"+
		"\2\2\u02d8\u02da\5f\64\2\u02d9\u02db\5v<\2\u02da\u02d9\3\2\2\2\u02da\u02db"+
		"\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02c8\3\2\2\2\u02dc\u02cc\3\2\2\2\u02dc"+
		"\u02d0\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02dfg\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e7\78\2\2\u02e2\u02e4"+
		"\5j\66\2\u02e3\u02e5\7\\\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7i\3\2\2\2"+
		"\u02e8\u02e9\t\t\2\2\u02e9k\3\2\2\2\u02ea\u02ec\7\t\2\2\u02eb\u02ea\3"+
		"\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f2\5\u010e\u0088"+
		"\2\u02ee\u02ef\7\u017d\2\2\u02ef\u02f0\5n8\2\u02f0\u02f1\7\u017e\2\2\u02f1"+
		"\u02f3\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3m\3\2\2\2"+
		"\u02f4\u02f5\5\u0108\u0085\2\u02f5o\3\2\2\2\u02f6\u02f8\7\u00d3\2\2\u02f7"+
		"\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02fc\5r"+
		":\2\u02fa\u02fc\5t;\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fcq\3"+
		"\2\2\2\u02fd\u0303\5:\36\2\u02fe\u02ff\7\u017d\2\2\u02ff\u0300\5~@\2\u0300"+
		"\u0301\7\u017e\2\2\u0301\u0303\3\2\2\2\u0302\u02fd\3\2\2\2\u0302\u02fe"+
		"\3\2\2\2\u0303s\3\2\2\2\u0304\u0305\5\u00e6t\2\u0305\u0307\7\u017d\2\2"+
		"\u0306\u0308\5\"\22\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a"+
		"\3\2\2\2\u0309\u030b\5\u00eav\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2"+
		"\2\u030b\u030d\3\2\2\2\u030c\u030e\5J&\2\u030d\u030c\3\2\2\2\u030d\u030e"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\7\u017e\2\2\u0310u\3\2\2\2\u0311"+
		"\u0314\5x=\2\u0312\u0314\5z>\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2"+
		"\u0314w\3\2\2\2\u0315\u0316\7W\2\2\u0316\u0317\5\u0080A\2\u0317y\3\2\2"+
		"\2\u0318\u0319\7\u0081\2\2\u0319\u031a\7\u017d\2\2\u031a\u031b\5|?\2\u031b"+
		"\u031c\7\u017e\2\2\u031c{\3\2\2\2\u031d\u031e\5\u0108\u0085\2\u031e}\3"+
		"\2\2\2\u031f\u0320\7\u0083\2\2\u0320\u0321\7\u017d\2\2\u0321\u0322\5\u00d8"+
		"m\2\u0322\u032a\7\u017e\2\2\u0323\u0324\7\u0176\2\2\u0324\u0325\7\u017d"+
		"\2\2\u0325\u0326\5\u00d8m\2\u0326\u0327\7\u017e\2\2\u0327\u0329\3\2\2"+
		"\2\u0328\u0323\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032f\5J&\2\u032e"+
		"\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u0332\5V"+
		",\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\177\3\2\2\2\u0333\u0334"+
		"\5\u0082B\2\u0334\u0081\3\2\2\2\u0335\u0336\bB\1\2\u0336\u0337\5\u00a6"+
		"T\2\u0337\u0338\5\u0082B$\u0338\u035d\3\2\2\2\u0339\u033a\5\u00a8U\2\u033a"+
		"\u033b\5\u0082B\36\u033b\u035d\3\2\2\2\u033c\u033d\7O\2\2\u033d\u035d"+
		"\5\u0082B\23\u033e\u033f\7^\2\2\u033f\u035d\5\u0082B\3\u0340\u035d\5\u0084"+
		"C\2\u0341\u035d\5\u0086D\2\u0342\u035d\5\u00fa~\2\u0343\u0344\5\u00da"+
		"n\2\u0344\u0345\t\n\2\2\u0345\u035d\3\2\2\2\u0346\u0348\7O\2\2\u0347\u0346"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\7&\2\2\u034a"+
		"\u035d\5\u00aeX\2\u034b\u035d\5\u00b4[\2\u034c\u035d\5\u00c8e\2\u034d"+
		"\u035d\5\u00caf\2\u034e\u035d\5\u00b6\\\2\u034f\u0351\5t;\2\u0350\u0352"+
		"\5,\27\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u035d\3\2\2\2\u0353"+
		"\u035d\5\u00b2Z\2\u0354\u0355\7\u017d\2\2\u0355\u0356\5\u0082B\2\u0356"+
		"\u0357\7\u017e\2\2\u0357\u035d\3\2\2\2\u0358\u035d\5\u00aeX\2\u0359\u035d"+
		"\5\u00b0Y\2\u035a\u035d\5\u00d2j\2\u035b\u035d\5\u00d4k\2\u035c\u0335"+
		"\3\2\2\2\u035c\u0339\3\2\2\2\u035c\u033c\3\2\2\2\u035c\u033e\3\2\2\2\u035c"+
		"\u0340\3\2\2\2\u035c\u0341\3\2\2\2\u035c\u0342\3\2\2\2\u035c\u0343\3\2"+
		"\2\2\u035c\u0347\3\2\2\2\u035c\u034b\3\2\2\2\u035c\u034c\3\2\2\2\u035c"+
		"\u034d\3\2\2\2\u035c\u034e\3\2\2\2\u035c\u034f\3\2\2\2\u035c\u0353\3\2"+
		"\2\2\u035c\u0354\3\2\2\2\u035c\u0358\3\2\2\2\u035c\u0359\3\2\2\2\u035c"+
		"\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u03c7\3\2\2\2\u035e\u035f\f#"+
		"\2\2\u035f\u0360\7\u0186\2\2\u0360\u03c6\5\u0082B#\u0361\u0362\f\"\2\2"+
		"\u0362\u0363\t\13\2\2\u0363\u03c6\5\u0082B#\u0364\u0365\f!\2\2\u0365\u0366"+
		"\t\f\2\2\u0366\u03c6\5\u0082B\"\u0367\u0368\f \2\2\u0368\u036a\7<\2\2"+
		"\u0369\u036b\7O\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u03c6\5\u0082B!\u036d\u036e\f\35\2\2\u036e\u036f\5\u00a8"+
		"U\2\u036f\u0370\5\u0082B\36\u0370\u03c6\3\2\2\2\u0371\u0372\f\33\2\2\u0372"+
		"\u0374\7<\2\2\u0373\u0375\7O\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376\u0377\7 \2\2\u0377\u0378\7+\2\2\u0378\u03c6"+
		"\5\u0082B\34\u0379\u037b\f\30\2\2\u037a\u037c\7O\2\2\u037b\u037a\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\7\16\2\2\u037e"+
		"\u037f\5\u0082B\2\u037f\u0380\7\7\2\2\u0380\u0381\5\u0082B\31\u0381\u03c6"+
		"\3\2\2\2\u0382\u0383\f\27\2\2\u0383\u0384\7\u00ef\2\2\u0384\u03c6\5\u0082"+
		"B\30\u0385\u0386\f\25\2\2\u0386\u0387\t\r\2\2\u0387\u03c6\5\u0082B\26"+
		"\u0388\u0389\f\24\2\2\u0389\u038a\t\16\2\2\u038a\u03c6\5\u0082B\24\u038b"+
		"\u038c\f\22\2\2\u038c\u038d\7\7\2\2\u038d\u03c6\5\u0082B\23\u038e\u038f"+
		"\f\21\2\2\u038f\u0390\7Z\2\2\u0390\u03c6\5\u0082B\22\u0391\u0392\f&\2"+
		"\2\u0392\u0393\7\u0171\2\2\u0393\u03c6\5\u00dan\2\u0394\u039d\f%\2\2\u0395"+
		"\u0396\7\u017f\2\2\u0396\u0399\5\u0082B\2\u0397\u0398\7\u0174\2\2\u0398"+
		"\u039a\5\u0082B\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b"+
		"\3\2\2\2\u039b\u039c\7\u0180\2\2\u039c\u039e\3\2\2\2\u039d\u0395\3\2\2"+
		"\2\u039e\u039f\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03c6"+
		"\3\2\2\2\u03a1\u03a2\f\37\2\2\u03a2\u03c6\t\17\2\2\u03a3\u03a4\f\34\2"+
		"\2\u03a4\u03a5\7<\2\2\u03a5\u03a6\7S\2\2\u03a6\u03a7\7\u017d\2\2\u03a7"+
		"\u03a8\5\u00e4s\2\u03a8\u03a9\7\u017e\2\2\u03a9\u03c6\3\2\2\2\u03aa\u03ac"+
		"\f\32\2\2\u03ab\u03ad\7O\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03b2\7\64\2\2\u03af\u03b3\5:\36\2\u03b0\u03b3\5"+
		"~@\2\u03b1\u03b3\5\u00b0Y\2\u03b2\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b1\3\2\2\2\u03b3\u03c6\3\2\2\2\u03b4\u03b5\f\26\2\2\u03b5\u03b6\5"+
		"\u00ccg\2\u03b6\u03b9\5\u0082B\2\u03b7\u03b8\7\u00b3\2\2\u03b8\u03ba\7"+
		"\u01a6\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c6\3\2\2\2"+
		"\u03bb\u03bc\f\7\2\2\u03bc\u03c6\5\u009cO\2\u03bd\u03c0\f\6\2\2\u03be"+
		"\u03c1\5\u00a4S\2\u03bf\u03c1\5\u00aaV\2\u03c0\u03be\3\2\2\2\u03c0\u03bf"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\5\u009eP\2\u03c3\u03c4\5\u00ae"+
		"X\2\u03c4\u03c6\3\2\2\2\u03c5\u035e\3\2\2\2\u03c5\u0361\3\2\2\2\u03c5"+
		"\u0364\3\2\2\2\u03c5\u0367\3\2\2\2\u03c5\u036d\3\2\2\2\u03c5\u0371\3\2"+
		"\2\2\u03c5\u0379\3\2\2\2\u03c5\u0382\3\2\2\2\u03c5\u0385\3\2\2\2\u03c5"+
		"\u0388\3\2\2\2\u03c5\u038b\3\2\2\2\u03c5\u038e\3\2\2\2\u03c5\u0391\3\2"+
		"\2\2\u03c5\u0394\3\2\2\2\u03c5\u03a1\3\2\2\2\u03c5\u03a3\3\2\2\2\u03c5"+
		"\u03aa\3\2\2\2\u03c5\u03b4\3\2\2\2\u03c5\u03bb\3\2\2\2\u03c5\u03bd\3\2"+
		"\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u0083\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03cb\t\20\2\2\u03cb\u0085\3"+
		"\2\2\2\u03cc\u03d4\7\u01a6\2\2\u03cd\u03d4\7\u01a5\2\2\u03ce\u03d4\7Q"+
		"\2\2\u03cf\u03d4\7\35\2\2\u03d0\u03d4\7\u019d\2\2\u03d1\u03d4\5\u0088"+
		"E\2\u03d2\u03d4\5\u0096L\2\u03d3\u03cc\3\2\2\2\u03d3\u03cd\3\2\2\2\u03d3"+
		"\u03ce\3\2\2\2\u03d3\u03cf\3\2\2\2\u03d3\u03d0\3\2\2\2\u03d3\u03d1\3\2"+
		"\2\2\u03d3\u03d2\3\2\2\2\u03d4\u0087\3\2\2\2\u03d5\u03da\5\u0092J\2\u03d6"+
		"\u03da\5\u0090I\2\u03d7\u03da\5\u0094K\2\u03d8\u03da\5\u008aF\2\u03d9"+
		"\u03d5\3\2\2\2\u03d9\u03d6\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2"+
		"\2\2\u03da\u0089\3\2\2\2\u03db\u03dd\7\u014d\2\2\u03dc\u03de\5\u008eH"+
		"\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1"+
		"\7\u01a6\2\2\u03e0\u03e2\5\u008cG\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3"+
		"\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e5\5\u008eH\2\u03e4\u03e3\3\2\2\2"+
		"\u03e4\u03e5\3\2\2\2\u03e5\u008b\3\2\2\2\u03e6\u03e9\5\u0098M\2\u03e7"+
		"\u03e8\7x\2\2\u03e8\u03ea\5\u0098M\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3"+
		"\2\2\2\u03ea\u008d\3\2\2\2\u03eb\u03ec\7\u017d\2\2\u03ec\u03ed\5\u0084"+
		"C\2\u03ed\u03ee\7\u017e\2\2\u03ee\u008f\3\2\2\2\u03ef\u03f0\7\u014e\2"+
		"\2\u03f0\u03f1\7\u01a6\2\2\u03f1\u0091\3\2\2\2\u03f2\u03f3\7\u0150\2\2"+
		"\u03f3\u03f4\7\u01a6\2\2\u03f4\u0093\3\2\2\2\u03f5\u03f6\7\u014c\2\2\u03f6"+
		"\u03f7\7\u01a6\2\2\u03f7\u0095\3\2\2\2\u03f8\u03f9\t\21\2\2\u03f9\u0097"+
		"\3\2\2\2\u03fa\u03fb\t\22\2\2\u03fb\u0099\3\2\2\2\u03fc\u03fd\t\23\2\2"+
		"\u03fd\u009b\3\2\2\2\u03fe\u03ff\7\u0099\2\2\u03ff\u0400\5\u00f8}\2\u0400"+
		"\u009d\3\2\2\2\u0401\u0404\5\u00a0Q\2\u0402\u0404\5\u00a2R\2\u0403\u0401"+
		"\3\2\2\2\u0403\u0402\3\2\2\2\u0404\u009f\3\2\2\2\u0405\u0406\7\5\2\2\u0406"+
		"\u00a1\3\2\2\2\u0407\u0408\t\24\2\2\u0408\u00a3\3\2\2\2\u0409\u040a\t"+
		"\25\2\2\u040a\u00a5\3\2\2\2\u040b\u040c\t\f\2\2\u040c\u00a7\3\2\2\2\u040d"+
		"\u0419\7\u017a\2\2\u040e\u0419\7\u017c\2\2\u040f\u0419\7\u0177\2\2\u0410"+
		"\u0419\7\u0196\2\2\u0411\u0419\7\u0197\2\2\u0412\u0419\7\u0198\2\2\u0413"+
		"\u0419\7\u0199\2\2\u0414\u0419\7\u019a\2\2\u0415\u0419\7\u019b\2\2\u0416"+
		"\u0419\7\u019c\2\2\u0417\u0419\5\u00aaV\2\u0418\u040d\3\2\2\2\u0418\u040e"+
		"\3\2\2\2\u0418\u040f\3\2\2\2\u0418\u0410\3\2\2\2\u0418\u0411\3\2\2\2\u0418"+
		"\u0412\3\2\2\2\u0418\u0413\3\2\2\2\u0418\u0414\3\2\2\2\u0418\u0415\3\2"+
		"\2\2\u0418\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419\u00a9\3\2\2\2\u041a"+
		"\u041d\7\u01a2\2\2\u041b\u041d\5\u00acW\2\u041c\u041a\3\2\2\2\u041c\u041b"+
		"\3\2\2\2\u041d\u00ab\3\2\2\2\u041e\u041f\t\26\2\2\u041f\u00ad\3\2\2\2"+
		"\u0420\u0421\5:\36\2\u0421\u00af\3\2\2\2\u0422\u0423\7\u017d\2\2\u0423"+
		"\u0424\5\u00d8m\2\u0424\u0425\7\u017e\2\2\u0425\u00b1\3\2\2\2\u0426\u0427"+
		"\7\21\2\2\u0427\u042d\5\u0082B\2\u0428\u0429\7\u0086\2\2\u0429\u042a\5"+
		"\u0082B\2\u042a\u042b\7w\2\2\u042b\u042c\5\u0082B\2\u042c\u042e\3\2\2"+
		"\2\u042d\u0428\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430"+
		"\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u0432\7\"\2\2\u0432\u0434\5\u0082B"+
		"\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436"+
		"\7#\2\2\u0436\u0448\3\2\2\2\u0437\u043d\7\21\2\2\u0438\u0439\7\u0086\2"+
		"\2\u0439\u043a\5\u0082B\2\u043a\u043b\7w\2\2\u043b\u043c\5\u0082B\2\u043c"+
		"\u043e\3\2\2\2\u043d\u0438\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u043d\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u0442\7\"\2\2\u0442"+
		"\u0444\5\u0082B\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0446\7#\2\2\u0446\u0448\3\2\2\2\u0447\u0426\3\2\2\2\u0447"+
		"\u0437\3\2\2\2\u0448\u00b3\3\2\2\2\u0449\u044a\7\22\2\2\u044a\u044b\7"+
		"\u017d\2\2\u044b\u044c\5\u0082B\2\u044c\u044d\7\t\2\2\u044d\u044e\5\u00da"+
		"n\2\u044e\u044f\7\u017e\2\2\u044f\u00b5\3\2\2\2\u0450\u0455\5\u00b8]\2"+
		"\u0451\u0455\5\u00ba^\2\u0452\u0455\5\u00c0a\2\u0453\u0455\5\u00c2b\2"+
		"\u0454\u0450\3\2\2\2\u0454\u0451\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0453"+
		"\3\2\2\2\u0455\u00b7\3\2\2\2\u0456\u0457\7\u00f6\2\2\u0457\u0458\7\u017d"+
		"\2\2\u0458\u0459\5\u0082B\2\u0459\u045a\7\64\2\2\u045a\u045b\5\u0082B"+
		"\2\u045b\u045c\7\u017e\2\2\u045c\u00b9\3\2\2\2\u045d\u045e\7\u00b9\2\2"+
		"\u045e\u045f\7\u017d\2\2\u045f\u0460\5\u00bc_\2\u0460\u0461\7+\2\2\u0461"+
		"\u0462\5\u0082B\2\u0462\u0463\7\u017e\2\2\u0463\u00bb\3\2\2\2\u0464\u0468"+
		"\5\u0098M\2\u0465\u0468\5\u00be`\2\u0466\u0468\5\u009aN\2\u0467\u0464"+
		"\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0466\3\2\2\2\u0468\u00bd\3\2\2\2\u0469"+
		"\u046a\t\27\2\2\u046a\u00bf\3\2\2\2\u046b\u046c\7\u0114\2\2\u046c\u046d"+
		"\7\u017d\2\2\u046d\u0470\5\u0082B\2\u046e\u046f\7+\2\2\u046f\u0471\5\u0082"+
		"B\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0474\3\2\2\2\u0472"+
		"\u0473\7*\2\2\u0473\u0475\5\u0082B\2\u0474\u0472\3\2\2\2\u0474\u0475\3"+
		"\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7\u017e\2\2\u0477\u00c1\3\2\2\2"+
		"\u0478\u0479\7\u011f\2\2\u0479\u047a\7\u017d\2\2\u047a\u047b\5\u00c4c"+
		"\2\u047b\u047c\7\u017e\2\2\u047c\u00c3\3\2\2\2\u047d\u047f\5\u00c6d\2"+
		"\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u0482"+
		"\5\u0082B\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2"+
		"\2\u0483\u0485\7+\2\2\u0484\u047e\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486"+
		"\3\2\2\2\u0486\u0489\5\u0082B\2\u0487\u0488\7\u0176\2\2\u0488\u048a\5"+
		"\u0082B\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u00c5\3\2\2\2"+
		"\u048b\u048c\t\30\2\2\u048c\u00c7\3\2\2\2\u048d\u0494\7\u0090\2\2\u048e"+
		"\u0495\5\u00aeX\2\u048f\u0491\7\u017f\2\2\u0490\u0492\5\u00d8m\2\u0491"+
		"\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495\7\u0180"+
		"\2\2\u0494\u048e\3\2\2\2\u0494\u048f\3\2\2\2\u0495\u00c9\3\2\2\2\u0496"+
		"\u0497\7h\2\2\u0497\u0499\7\u017d\2\2\u0498\u049a\5\u00d8m\2\u0499\u0498"+
		"\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7\u017e\2"+
		"\2\u049c\u00cb\3\2\2\2\u049d\u049f\7O\2\2\u049e\u049d\3\2\2\2\u049e\u049f"+
		"\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a3\5\u00ceh\2\u04a1\u04a3\5\u00d0"+
		"i\2\u04a2\u049e\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3\u00cd\3\2\2\2\u04a4"+
		"\u04ab\7B\2\2\u04a5\u04ab\7\62\2\2\u04a6\u04ab\7\u0100\2\2\u04a7\u04ab"+
		"\7\u0107\2\2\u04a8\u04a9\7\u010e\2\2\u04a9\u04ab\7x\2\2\u04aa\u04a4\3"+
		"\2\2\2\u04aa\u04a5\3\2\2\2\u04aa\u04a6\3\2\2\2\u04aa\u04a7\3\2\2\2\u04aa"+
		"\u04a8\3\2\2\2\u04ab\u00cf\3\2\2\2\u04ac\u04ad\t\31\2\2\u04ad\u00d1\3"+
		"\2\2\2\u04ae\u04af\7\u0130\2\2\u04af\u04b0\7\u017d\2\2\u04b0\u04b1\t\32"+
		"\2\2\u04b1\u04b2\5\u00d6l\2\u04b2\u04b3\7\u017e\2\2\u04b3\u00d3\3\2\2"+
		"\2\u04b4\u04b5\7\u0131\2\2\u04b5\u04b6\7\u017d\2\2\u04b6\u04b7\t\32\2"+
		"\2\u04b7\u04b8\5\u00d6l\2\u04b8\u04b9\7\t\2\2\u04b9\u04ba\5\u00dan\2\u04ba"+
		"\u04bb\7\u017e\2\2\u04bb\u00d5\3\2\2\2\u04bc\u04bd\t\n\2\2\u04bd\u00d7"+
		"\3\2\2\2\u04be\u04c3\5\u0082B\2\u04bf\u04c0\7\u0176\2\2\u04c0\u04c2\5"+
		"\u0082B\2\u04c1\u04bf\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2"+
		"\u04c3\u04c4\3\2\2\2\u04c4\u00d9\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6\u04c8"+
		"\5\u0112\u008a\2\u04c7\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04c7\3"+
		"\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04dc\3\2\2\2\u04cb\u04cc\7\u017d\2\2"+
		"\u04cc\u04cf\5\u00dco\2\u04cd\u04ce\7\u0176\2\2\u04ce\u04d0\5\u00dep\2"+
		"\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2"+
		"\7\u017e\2\2\u04d2\u04dd\3\2\2\2\u04d3\u04d5\7\u017f\2\2\u04d4\u04d6\5"+
		"\u00e0q\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2"+
		"\u04d7\u04d9\7\u0180\2\2\u04d8\u04d3\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc\u04cb\3\2"+
		"\2\2\u04dc\u04d8\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e1\3\2\2\2\u04de"+
		"\u04df\t\33\2\2\u04df\u04e0\7\u014e\2\2\u04e0\u04e2\7\u0133\2\2\u04e1"+
		"\u04de\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04f1\3\2\2\2\u04e3\u04e8\7\u014d"+
		"\2\2\u04e4\u04e5\7\u017f\2\2\u04e5\u04e6\5\u00e2r\2\u04e6\u04e7\7\u0180"+
		"\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e4\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ee\3\2\2\2\u04ea\u04eb\7\u017d\2\2\u04eb\u04ec\5\u00dco\2\u04ec\u04ed"+
		"\7\u017e\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04ea\3\2\2\2\u04ee\u04ef\3\2\2"+
		"\2\u04ef\u04f1\3\2\2\2\u04f0\u04c7\3\2\2\2\u04f0\u04e3\3\2\2\2\u04f1\u00db"+
		"\3\2\2\2\u04f2\u04f3\7\u019e\2\2\u04f3\u00dd\3\2\2\2\u04f4\u04f5\7\u019e"+
		"\2\2\u04f5\u00df\3\2\2\2\u04f6\u04f7\7\u019e\2\2\u04f7\u00e1\3\2\2\2\u04f8"+
		"\u0514\7\u0132\2\2\u04f9\u0514\7\u00e3\2\2\u04fa\u0514\7\u00a7\2\2\u04fb"+
		"\u0514\7\u00c6\2\2\u04fc\u0514\7\u00e2\2\2\u04fd\u0514\7\u010b\2\2\u04fe"+
		"\u04ff\7\u0132\2\2\u04ff\u0500\7x\2\2\u0500\u0514\7\u00e3\2\2\u0501\u0502"+
		"\7\u00a7\2\2\u0502\u0503\7x\2\2\u0503\u0514\7\u00c6\2\2\u0504\u0505\7"+
		"\u00a7\2\2\u0505\u0506\7x\2\2\u0506\u0514\7\u00e2\2\2\u0507\u0508\7\u00a7"+
		"\2\2\u0508\u0509\7x\2\2\u0509\u0514\7\u010b\2\2\u050a\u050b\7\u00c6\2"+
		"\2\u050b\u050c\7x\2\2\u050c\u0514\7\u00e2\2\2\u050d\u050e\7\u00c6\2\2"+
		"\u050e\u050f\7x\2\2\u050f\u0514\7\u010b\2\2\u0510\u0511\7\u00e2\2\2\u0511"+
		"\u0512\7x\2\2\u0512\u0514\7\u010b\2\2\u0513\u04f8\3\2\2\2\u0513\u04f9"+
		"\3\2\2\2\u0513\u04fa\3\2\2\2\u0513\u04fb\3\2\2\2\u0513\u04fc\3\2\2\2\u0513"+
		"\u04fd\3\2\2\2\u0513\u04fe\3\2\2\2\u0513\u0501\3\2\2\2\u0513\u0504\3\2"+
		"\2\2\u0513\u0507\3\2\2\2\u0513\u050a\3\2\2\2\u0513\u050d\3\2\2\2\u0513"+
		"\u0510\3\2\2\2\u0514\u00e3\3\2\2\2\u0515\u051a\5\u00dan\2\u0516\u0517"+
		"\7\u0176\2\2\u0517\u0519\5\u00dan\2\u0518\u0516\3\2\2\2\u0519\u051c\3"+
		"\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u00e5\3\2\2\2\u051c"+
		"\u051a\3\2\2\2\u051d\u0520\5\u00e8u\2\u051e\u0520\5\u0112\u008a\2\u051f"+
		"\u051d\3\2\2\2\u051f\u051e\3\2\2\2\u0520\u00e7\3\2\2\2\u0521\u0522\t\34"+
		"\2\2\u0522\u00e9\3\2\2\2\u0523\u0528\5\u00ecw\2\u0524\u0525\7\u0176\2"+
		"\2\u0525\u0527\5\u00ecw\2\u0526\u0524\3\2\2\2\u0527\u052a\3\2\2\2\u0528"+
		"\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052d\3\2\2\2\u052a\u0528\3\2"+
		"\2\2\u052b\u052d\7\u0183\2\2\u052c\u0523\3\2\2\2\u052c\u052b\3\2\2\2\u052d"+
		"\u00eb\3\2\2\2\u052e\u0530\7\u0127\2\2\u052f\u052e\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0537\5\u0082B\2\u0532\u0533\5\u0114"+
		"\u008b\2\u0533\u0534\7\u0172\2\2\u0534\u0535\5\u0082B\2\u0535\u0537\3"+
		"\2\2\2\u0536\u052f\3\2\2\2\u0536\u0532\3\2\2\2\u0537\u00ed\3\2\2\2\u0538"+
		"\u0539\5\u0112\u008a\2\u0539\u00ef\3\2\2\2\u053a\u053b\5\u0112\u008a\2"+
		"\u053b\u00f1\3\2\2\2\u053c\u053d\5\u00eex\2\u053d\u053e\7\u0187\2\2\u053e"+
		"\u0540\3\2\2\2\u053f\u053c\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2"+
		"\2\2\u0541\u0542\5\u00f0y\2\u0542\u00f3\3\2\2\2\u0543\u0544\5\u0112\u008a"+
		"\2\u0544\u00f5\3\2\2\2\u0545\u0546\5\u00eex\2\u0546\u0547\7\u0187\2\2"+
		"\u0547\u0549\3\2\2\2\u0548\u0545\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a"+
		"\3\2\2\2\u054a\u054b\5\u00f0y\2\u054b\u054c\7\u0187\2\2\u054c\u054e\3"+
		"\2\2\2\u054d\u0548\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0550\5\u00f4{\2\u0550\u00f7\3\2\2\2\u0551\u0552\5\u0112\u008a\2\u0552"+
		"\u00f9\3\2\2\2\u0553\u0554\5\u00eex\2\u0554\u0555\7\u0187\2\2\u0555\u0557"+
		"\3\2\2\2\u0556\u0553\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u0559\5\u00f0y\2\u0559\u055a\7\u0187\2\2\u055a\u055b\5\u00f4{\2\u055b"+
		"\u055c\7\u0187\2\2\u055c\u0569\3\2\2\2\u055d\u055e\5\u00f0y\2\u055e\u055f"+
		"\7\u0187\2\2\u055f\u0561\3\2\2\2\u0560\u055d\3\2\2\2\u0560\u0561\3\2\2"+
		"\2\u0561\u0562\3\2\2\2\u0562\u0563\5\u00f4{\2\u0563\u0564\7\u0187\2\2"+
		"\u0564\u0569\3\2\2\2\u0565\u0566\5\u00f4{\2\u0566\u0567\7\u0187\2\2\u0567"+
		"\u0569\3\2\2\2\u0568\u0556\3\2\2\2\u0568\u0560\3\2\2\2\u0568\u0565\3\2"+
		"\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\5\u00f8}\2\u056b"+
		"\u00fb\3\2\2\2\u056c\u056d\5\u0112\u008a\2\u056d\u00fd\3\2\2\2\u056e\u056f"+
		"\5\u0112\u008a\2\u056f\u00ff\3\2\2\2\u0570\u0572\5\u00fe\u0080\2\u0571"+
		"\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0576\3\2\2\2\u0573\u0574\7\u00f3"+
		"\2\2\u0574\u0575\7\20\2\2\u0575\u0577\5\u00d8m\2\u0576\u0573\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u057a\5J&\2\u0579\u0578\3\2\2"+
		"\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u057d\5\u0102\u0082\2"+
		"\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u0101\3\2\2\2\u057e\u0580"+
		"\t\35\2\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0587\3\2\2\2"+
		"\u0581\u0588\5\u0104\u0083\2\u0582\u0583\7\16\2\2\u0583\u0584\5\u0104"+
		"\u0083\2\u0584\u0585\7#\2\2\u0585\u0586\5\u0104\u0083\2\u0586\u0588\3"+
		"\2\2\2\u0587\u0581\3\2\2\2\u0587\u0582\3\2\2\2\u0588\u0103\3\2\2\2\u0589"+
		"\u058a\7\u0121\2\2\u058a\u0596\7\u00f7\2\2\u058b\u058c\7\34\2\2\u058c"+
		"\u0596\7h\2\2\u058d\u058e\7\u0121\2\2\u058e\u0596\7\u00bc\2\2\u058f\u0590"+
		"\5\u0082B\2\u0590\u0591\7\u00f7\2\2\u0591\u0596\3\2\2\2\u0592\u0593\5"+
		"\u0082B\2\u0593\u0594\7\u00bc\2\2\u0594\u0596\3\2\2\2\u0595\u0589\3\2"+
		"\2\2\u0595\u058b\3\2\2\2\u0595\u058d\3\2\2\2\u0595\u058f\3\2\2\2\u0595"+
		"\u0592\3\2\2\2\u0596\u0105\3\2\2\2\u0597\u059c\5\u00f4{\2\u0598\u0599"+
		"\7\u0176\2\2\u0599\u059b\5\u00f4{\2\u059a\u0598\3\2\2\2\u059b\u059e\3"+
		"\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u0107\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059f\u05a4\5\u00f8}\2\u05a0\u05a1\7\u0176\2\2\u05a1\u05a3"+
		"\5\u00f8}\2\u05a2\u05a0\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2\3\2\2"+
		"\2\u05a4\u05a5\3\2\2\2\u05a5\u0109\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05a8"+
		"\5\u00f8}\2\u05a8\u05a9\5\u00dan\2\u05a9\u010b\3\2\2\2\u05aa\u05af\5\u010a"+
		"\u0086\2\u05ab\u05ac\7\u0176\2\2\u05ac\u05ae\5\u010a\u0086\2\u05ad\u05ab"+
		"\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
		"\u010d\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u05b3\5\u0112\u008a\2\u05b3\u010f"+
		"\3\2\2\2\u05b4\u05b5\5\u0112\u008a\2\u05b5\u0111\3\2\2\2\u05b6\u05b7\5"+
		"\u0114\u008b\2\u05b7\u0113\3\2\2\2\u05b8\u05bb\t\36\2\2\u05b9\u05bb\5"+
		"\u0116\u008c\2\u05ba\u05b8\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u0115\3\2"+
		"\2\2\u05bc\u05bd\t\37\2\2\u05bd\u0117\3\2\2\2\u00a7\u011d\u0122\u012c"+
		"\u0130\u0133\u0136\u0139\u013c\u0143\u0146\u0149\u014f\u0152\u0155\u015d"+
		"\u0168\u016b\u0173\u0180\u0188\u0195\u01a1\u01ab\u01af\u01ba\u01bf\u01c2"+
		"\u01c6\u01ca\u01cd\u01d0\u01d3\u01d6\u01d9\u01dd\u01e6\u01e8\u01ef\u01f4"+
		"\u01f8\u01fd\u0207\u020a\u020f\u0213\u0216\u021c\u0223\u022d\u0236\u023c"+
		"\u0240\u024c\u0261\u0271\u0276\u0279\u027f\u0289\u028e\u0293\u02a0\u02a4"+
		"\u02ae\u02b1\u02b5\u02b8\u02bc\u02be\u02c6\u02d2\u02d5\u02da\u02dc\u02de"+
		"\u02e4\u02e6\u02eb\u02f2\u02f7\u02fb\u0302\u0307\u030a\u030d\u0313\u032a"+
		"\u032e\u0331\u0347\u0351\u035c\u036a\u0374\u037b\u0399\u039f\u03ac\u03b2"+
		"\u03b9\u03c0\u03c5\u03c7\u03d3\u03d9\u03dd\u03e1\u03e4\u03e9\u0403\u0418"+
		"\u041c\u042f\u0433\u043f\u0443\u0447\u0454\u0467\u0470\u0474\u047e\u0481"+
		"\u0484\u0489\u0491\u0494\u0499\u049e\u04a2\u04aa\u04c3\u04c9\u04cf\u04d5"+
		"\u04da\u04dc\u04e1\u04e8\u04ee\u04f0\u0513\u051a\u051f\u0528\u052c\u052f"+
		"\u0536\u053f\u0548\u054d\u0556\u0560\u0568\u0571\u0576\u0579\u057c\u057f"+
		"\u0587\u0595\u059c\u05a4\u05af\u05ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}