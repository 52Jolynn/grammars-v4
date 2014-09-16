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
		ROW=102, PRECISION=244, ILIKE=48, EXCEPT=34, BYTEA=338, VARBIT=305, DISTANCE=399, 
		CREATE=24, STRING_LITERAL=412, UNLOGGED=287, TIMEZONE_MINUTE=281, OFF=82, 
		VARIADIC=291, PRECEDING=243, TIMESTAMPTZ=331, REGEXP=252, ANALYZE=141, 
		GEQ=374, NOCOMPRESS=75, XMLDATA=362, DIVIDE=382, GROUPING=191, ASC=8, 
		PRESERVE=245, TRANSACTION=282, REFRESH=251, TEMP=277, MATERIALIZED=214, 
		INTERSECT2D=390, INT=312, SEMI_COLON=367, RLIKE=259, FILE=39, LEADING=61, 
		RESTRICT=257, MILLISECONDS=219, GROUP=44, INTERSECT=56, FETCH=38, USER=126, 
		INTERSECT3D=391, CONSTRAINT=155, TIMEZONE_HOUR=280, MODIFY=72, ALTER=4, 
		FORCE=185, NCHAR=324, TABLE=116, VARCHAR=323, SUB=380, MICROSECONDS=217, 
		FLOAT=318, NOTNULL=76, SUM=273, WHITE_SPACE=414, NOWAIT=78, AT=143, STORAGE=270, 
		AS=7, RIGHT_PAREN=376, GEOMETRY=342, MAXVALUE=216, COMPRESS=22, AVG=144, 
		LEFT=62, TRUNCATE=121, ZONE=301, BOX3D=341, PLUS=379, MODE=71, LIKE=64, 
		COLLATE=151, OUTER=90, BY=14, DEFERRABLE=170, WHENEVER=133, BOX2D=340, 
		VARCHAR2=130, INHERIT=198, RIGHT=100, HAVING=45, SESSION=106, MINUS=69, 
		CONCATENATION_OPERATOR=369, COLON=366, ROWS=103, FORMAT=187, NATURAL=73, 
		LONG=67, PUBLIC=94, UNSECURED=288, WEEK=296, OBJECT_ID=351, INT8=309, 
		CHAR=322, DAY=164, COUNT=159, RELEASE=254, INT2=307, INT1=306, INT4=308, 
		EXPLAIN=37, EXTENDED=179, QUOTE=387, MODULAR=383, QUARTER=247, THAN=278, 
		ESCAPE=175, CONNECT=23, INHERITS=199, INTERSECTION=202, RETURNING=258, 
		LESS=208, DOUBLE=319, ROWNUM=355, COMMENT=20, SELECT=105, INTO=57, ARRAY=142, 
		DUAL=349, NO_INHERIT=228, COALESCE=153, SECOND=263, EPOCH=174, NULL=79, 
		WITHOUT=299, NO=227, EVERY=176, ON=85, MATCH=213, DELETE=28, NUMERIC=320, 
		INET4=339, OF=81, TABLES=274, UNDERLINE=386, VERSIONS_OPERATION=358, DISCARD=171, 
		CUBE=160, NATIONAL=225, OR=88, FILTER=182, CURRVAL=348, COLLECT=152, FALSE=136, 
		UNBOUNDED=285, CURSOR=161, PCTFREE=91, TIMESTAMP=330, RIGHT_SQUARE=378, 
		DEC=165, CONSTRAINTS=156, WHERE=134, NULLIF=230, VAR_SAMP=292, FORWARD=188, 
		YEAR=300, LIMIT=65, MAX=215, DEFERRED=169, FLOAT4=315, CUSTOME_OPERATOR=408, 
		FLOAT8=316, SPACE=413, RESOURCE=98, CROSS=25, USAGE=289, IF=47, RAW=95, 
		GEOMETRY_DUMP=343, BOOLEAN=302, IN=50, MULTIPLY=381, REFERENCES=250, COMMA=368, 
		IS=58, PARTITION=239, SOME=110, EQUAL=365, NEXT=226, CENTURY=148, EXCLUDE=177, 
		WITH=135, INITIALLY=200, REINDEX=96, FUSION=189, GRANT=43, VARBINARY=336, 
		DEFAULT=27, BACKWARD=145, MILLENNIUM=218, SUBSTRING=272, INCREMENT=51, 
		LEFT_OF=393, ASSIGN=364, IMMEDIATE=49, CLUSTER=18, WINDOW=297, GLOBAL=190, 
		MINUTE=222, LEFT_SQUARE=377, INCLUDING=196, LEQ=372, ISODOW=203, OVERWRITE=236, 
		ONLINE=86, VERSIONS_ENDTIME=357, REGEX=411, NOT=77, FOREIGN=186, CACHE=146, 
		PRIVILEGES=93, CHARACTER=149, ACTION=140, MONTH=223, TYPE=284, STDDEV_POP=268, 
		USING=127, NOT_EQUAL=370, BEGIN=11, VALID=290, CAST_OPERATOR=363, UID=122, 
		TSQUERY=334, STDDEV_SAMP=269, BLOB=337, VERSIONS_XID=361, SUBPARTITION=271, 
		KEY=205, INITIAL=53, ELSE=32, NUMBER=80, BOOL=303, TRAILING=119, RECURSIVE=249, 
		ROLLBACK=101, TABLESPACE=275, REAL=317, MAXEXTENTS=68, SEQUENCES=265, 
		LEVEL=63, INSENSITIVE=201, NONE=229, TRIM=283, NOT_SIMILAR_INSENSITIVE=402, 
		WITHIN=298, LOCATION=211, LEFT_PAREN=375, CONNECT_BY_ISLEAF=347, GEOGRAPHY=344, 
		END=33, SIZE=109, RENAME=97, OPTION=87, IDENTITY=195, ISOYEAR=204, AUDIT=10, 
		PLAIN=241, ONLY=233, ISNULL=59, ASYMMETRIC=9, OWNED=237, POSITION=242, 
		TIME=328, BIND_PARAMETER=403, THEN=117, TSVECTOR=333, OFFSET=84, REPLACE=255, 
		COLUMN=19, ACCESS=1, OBJECT_VALUE=352, EXISTS=36, NVARCHAR=325, ADD=2, 
		INTEGER=313, BOX_EQUAL=398, TO=118, OVERLAPS=235, SUCCESSFUL=112, SET=107, 
		RELATIVE=253, MIN=220, TEXT=332, HOUR=194, UNION=123, CURRENT=26, NULLS=231, 
		COMMIT=21, SCHEMA=261, CLOSE=150, DECIMAL=321, DROP=31, VERSIONS_STARTSCN=359, 
		BIGINT=314, WHEN=132, MOVE=224, VALIDATE=128, CONCURRENTLY=154, DECLARE=167, 
		START=111, QUOTED_IDENTIFIER=410, BIT=304, REVOKE=99, BETWEEN=12, FIRST=183, 
		PRIOR=92, CAST=16, EXTERNAL=180, ORA_ROWSCN=353, DOUBLE_QUOTE=388, VARYING=294, 
		TRIGGER=120, CASE=15, CASCADE=147, VERBOSE=295, FULL=42, INSERT=55, CARET=384, 
		SAVEPOINT=104, ROWID=354, BOTH=13, TINYINT=310, BLOCK_COMMENT=406, REAL_NUM=405, 
		SYMMETRIC=113, SHARE=108, OFFLINE=83, LAST=206, ABORT=138, SYNONYM=114, 
		UNIQUE=124, VIEW=131, LINE_COMMENT=407, OVERLAPS_ABOVE=396, ROLLUP=260, 
		RESTART=256, ABOVE=395, PRIMARY=246, RIGHT_OF=394, LOCAL=210, EXCLUDING=178, 
		LIST=209, SEQUENCE=264, COSTS=158, VAR_POP=293, NOT_SIMILAR=400, CHECK=17, 
		FROM=41, DISTINCT=30, TEMPORARY=276, SIMPLE=267, OVER=234, MAIN=212, TIMETZ=329, 
		INNER=54, ORDER=89, TIMEZONE=279, DECADE=166, CYCLE=162, GTH=373, UPDATE=125, 
		FOR=40, COLUMN_VALUE=345, HOLD=193, EXCLUSIVE=35, FOLLOWING=184, AND=5, 
		IDENTIFIED=46, SCROLL=262, INTERVAL=327, LOCK=66, OVERLAP=392, INDEX=52, 
		OIDS=232, MLSLABEL=70, MINVALUE=221, UNKNOWN=286, CONTINUE=157, SYSDATE=115, 
		IDENTIFIER=409, PARTITIONS=240, ALL=3, TILDE=389, DOT=385, EXTRACT=181, 
		DOW=172, PARTIAL=238, NOAUDIT=74, DOY=173, LATERAL=207, VERSIONS_STARTTIME=360, 
		VALUES=129, HASH=192, INDEXES=197, RANGE=248, BELOW=397, TRUE=137, JOIN=60, 
		SIMILAR=266, NUM=404, DEFAULTS=168, LTH=371, ANY=6, NEXTVAL=350, CONNECT_BY_ISCYCLE=346, 
		SIMILAR_INSENSITIVE=401, DESC=29, BINARY=335, DATE=326, VERSIONS_ENDSCN=356, 
		ABSOLUTE=139, DATA=163, SMALLINT=311;
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
		"CONSTRAINT", "CONSTRAINTS", "CONTINUE", "COSTS", "COUNT", "CUBE", "CURSOR", 
		"CYCLE", "DATA", "DAY", "DEC", "DECADE", "DECLARE", "DEFAULTS", "DEFERRED", 
		"DEFERRABLE", "DISCARD", "DOW", "DOY", "EPOCH", "ESCAPE", "EVERY", "EXCLUDE", 
		"EXCLUDING", "EXTENDED", "EXTERNAL", "EXTRACT", "FILTER", "FIRST", "FOLLOWING", 
		"FORCE", "FOREIGN", "FORMAT", "FORWARD", "FUSION", "GLOBAL", "GROUPING", 
		"HASH", "HOLD", "HOUR", "IDENTITY", "INCLUDING", "INDEXES", "INHERIT", 
		"INHERITS", "INITIALLY", "INSENSITIVE", "INTERSECTION", "ISODOW", "ISOYEAR", 
		"KEY", "LAST", "LATERAL", "LESS", "LIST", "LOCAL", "LOCATION", "MAIN", 
		"MATCH", "MATERIALIZED", "MAX", "MAXVALUE", "MICROSECONDS", "MILLENNIUM", 
		"MILLISECONDS", "MIN", "MINVALUE", "MINUTE", "MONTH", "MOVE", "NATIONAL", 
		"NEXT", "NO", "NO_INHERIT", "NONE", "NULLIF", "NULLS", "OIDS", "ONLY", 
		"OVER", "OVERLAPS", "OVERWRITE", "OWNED", "PARTIAL", "PARTITION", "PARTITIONS", 
		"PLAIN", "POSITION", "PRECEDING", "PRECISION", "PRESERVE", "PRIMARY", 
		"QUARTER", "RANGE", "RECURSIVE", "REFERENCES", "REFRESH", "REGEXP", "RELATIVE", 
		"RELEASE", "REPLACE", "RESTART", "RESTRICT", "RETURNING", "RLIKE", "ROLLUP", 
		"SCHEMA", "SCROLL", "SECOND", "SEQUENCE", "SEQUENCES", "SIMILAR", "SIMPLE", 
		"STDDEV_POP", "STDDEV_SAMP", "STORAGE", "SUBPARTITION", "SUBSTRING", "SUM", 
		"TABLES", "TABLESPACE", "TEMPORARY", "TEMP", "THAN", "TIMEZONE", "TIMEZONE_HOUR", 
		"TIMEZONE_MINUTE", "TRANSACTION", "TRIM", "TYPE", "UNBOUNDED", "UNKNOWN", 
		"UNLOGGED", "UNSECURED", "USAGE", "VALID", "VARIADIC", "VAR_SAMP", "VAR_POP", 
		"VARYING", "VERBOSE", "WEEK", "WINDOW", "WITHIN", "WITHOUT", "YEAR", "ZONE", 
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
		"'|&>'", "'<<|'", "'~='", "DISTANCE", "'!~'", "'~*'", "'!~*'", "BIND_PARAMETER", 
		"NUM", "REAL_NUM", "BLOCK_COMMENT", "LINE_COMMENT", "CUSTOME_OPERATOR", 
		"IDENTIFIER", "QUOTED_IDENTIFIER", "REGEX", "STRING_LITERAL", "' '", "WHITE_SPACE"
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
		RULE_table_stmt = 26, RULE_subquery = 27, RULE_from_clause = 28, RULE_where_clause = 29, 
		RULE_group_clause = 30, RULE_having_clause = 31, RULE_window_clause = 32, 
		RULE_window_specifier_list = 33, RULE_window_specifier = 34, RULE_order_clause = 35, 
		RULE_sort_specifier_list = 36, RULE_sort_specifier = 37, RULE_order_specification = 38, 
		RULE_operators = 39, RULE_null_ordering = 40, RULE_limit_clause = 41, 
		RULE_offset_clause = 42, RULE_fetch_clause = 43, RULE_for_clause = 44, 
		RULE_count = 45, RULE_start = 46, RULE_table_reference = 47, RULE_simple_table = 48, 
		RULE_joined_table = 49, RULE_join_type = 50, RULE_outer_join_type = 51, 
		RULE_correlation_specification = 52, RULE_derived_column_list = 53, RULE_derived_table = 54, 
		RULE_table_subquery = 55, RULE_function = 56, RULE_join_specification = 57, 
		RULE_join_condition = 58, RULE_named_columns_join = 59, RULE_join_column_list = 60, 
		RULE_values_stmt = 61, RULE_search_condition = 62, RULE_expr = 63, RULE_unsigned_numeric_literal = 64, 
		RULE_string_literal = 65, RULE_datetime_literal = 66, RULE_interval_literal = 67, 
		RULE_interval_qualifier = 68, RULE_interval_precision = 69, RULE_time_literal = 70, 
		RULE_timestamp_literal = 71, RULE_date_literal = 72, RULE_boolean_literal = 73, 
		RULE_primary_datetime_field = 74, RULE_extended_datetime_field = 75, RULE_collate_expression = 76, 
		RULE_unary_operator = 77, RULE_any_other_operator = 78, RULE_postgis_operator = 79, 
		RULE_scalar_subquery = 80, RULE_tuple_value = 81, RULE_case_when = 82, 
		RULE_cast_expr = 83, RULE_value_function = 84, RULE_bit_position_function = 85, 
		RULE_extract_function = 86, RULE_extract_field = 87, RULE_time_zone_field = 88, 
		RULE_substring_function = 89, RULE_trim_function = 90, RULE_trim_operands = 91, 
		RULE_trim_specification = 92, RULE_array_constructor = 93, RULE_row_constructor = 94, 
		RULE_exists_predicate = 95, RULE_pattern_matcher = 96, RULE_negativable_matcher = 97, 
		RULE_regex_matcher = 98, RULE_expr_list = 99, RULE_data_type = 100, RULE_data_type_list = 101, 
		RULE_function_name = 102, RULE_function_reserved_name = 103, RULE_function_args = 104, 
		RULE_function_arg = 105, RULE_database_name = 106, RULE_schema_name = 107, 
		RULE_table_name = 108, RULE_column_name = 109, RULE_window_name = 110, 
		RULE_exists_window_name = 111, RULE_window_definition = 112, RULE_frame_clause = 113, 
		RULE_frame = 114, RULE_table_name_list = 115, RULE_column_name_list = 116, 
		RULE_column_definition = 117, RULE_column_definition_list = 118, RULE_correlation_name = 119, 
		RULE_column_alias = 120, RULE_any_name = 121, RULE_identifier = 122, RULE_nonreserved_keywords = 123;
	public static final String[] ruleNames = {
		"sql", "statement", "dml", "select_stmt", "update_stmt", "delete_stmt", 
		"insert_stmt", "using_clause", "insert_value", "update_list", "update_content", 
		"update_value", "returning_clause", "query_expression", "query_specification", 
		"query_rel", "set_qualifier", "select_list", "select_sublist", "derived_column", 
		"qualified_asterisk", "over_clause", "as_clause", "into_expression", "with_query", 
		"with_query_name", "table_stmt", "subquery", "from_clause", "where_clause", 
		"group_clause", "having_clause", "window_clause", "window_specifier_list", 
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
		"collate_expression", "unary_operator", "any_other_operator", "postgis_operator", 
		"scalar_subquery", "tuple_value", "case_when", "cast_expr", "value_function", 
		"bit_position_function", "extract_function", "extract_field", "time_zone_field", 
		"substring_function", "trim_function", "trim_operands", "trim_specification", 
		"array_constructor", "row_constructor", "exists_predicate", "pattern_matcher", 
		"negativable_matcher", "regex_matcher", "expr_list", "data_type", "data_type_list", 
		"function_name", "function_reserved_name", "function_args", "function_arg", 
		"database_name", "schema_name", "table_name", "column_name", "window_name", 
		"exists_window_name", "window_definition", "frame_clause", "frame", "table_name_list", 
		"column_name_list", "column_definition", "column_definition_list", "correlation_name", 
		"column_alias", "any_name", "identifier", "nonreserved_keywords"
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
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248); statement();
					setState(249); match(SEMI_COLON);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(256); statement();
			setState(258);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(257); match(SEMI_COLON);
				}
			}

			setState(260); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(262); dml();
			}
		}
		catch (RecognitionException re) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(264); select_stmt();
			}
		}
		catch (RecognitionException re) {
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
			setState(266); query_expression();
			setState(268);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(267); order_clause();
				}
			}

			setState(271);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(270); limit_clause();
				}
			}

			setState(274);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(273); offset_clause();
				}
			}

			setState(277);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(276); fetch_clause();
				}
			}

			setState(280);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(279); for_clause();
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
		public Update_listContext update_list() {
			return getRuleContext(Update_listContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(IdbParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
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
			setState(282); match(UPDATE);
			setState(283); table_name();
			setState(284); match(SET);
			setState(285); update_list();
			setState(287);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(286); from_clause();
				}
			}

			setState(290);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(289); where_clause();
				}
			}

			setState(293);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(292); returning_clause();
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
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(IdbParser.DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
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
			setState(295); match(DELETE);
			setState(296); match(FROM);
			setState(297); table_name();
			setState(299);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(298); using_clause();
				}
			}

			setState(302);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(301); where_clause();
				}
			}

			setState(305);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(304); returning_clause();
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
			setState(307); match(INSERT);
			setState(308); into_expression();
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(309); match(LEFT_PAREN);
				setState(310); column_name_list();
				setState(311); match(RIGHT_PAREN);
				}
				break;
			}
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(315); match(VALUES);
				setState(316); insert_value();
				}
				break;
			case 2:
				{
				setState(317); select_stmt();
				}
				break;
			case 3:
				{
				setState(318); match(LEFT_PAREN);
				setState(319); select_stmt();
				setState(320); match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				setState(322); match(DEFAULT);
				setState(323); match(VALUES);
				}
				break;
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
			setState(329); match(USING);
			setState(330); table_reference();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(331); match(COMMA);
				setState(332); table_reference();
				}
				}
				setState(337);
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
			setState(338); match(LEFT_PAREN);
			setState(339); expr_list();
			setState(340); match(RIGHT_PAREN);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341); match(COMMA);
				setState(342); match(LEFT_PAREN);
				setState(343); expr_list();
				setState(344); match(RIGHT_PAREN);
				}
				}
				setState(350);
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
			setState(351); update_content();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352); match(COMMA);
				setState(353); update_content();
				}
				}
				setState(358);
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
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
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
			setState(369);
			switch (_input.LA(1)) {
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
				setState(359); column_name();
				setState(360); match(EQUAL);
				setState(361); expr(0);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); match(LEFT_PAREN);
				setState(364); column_name_list();
				setState(365); match(RIGHT_PAREN);
				setState(366); match(EQUAL);
				setState(367); update_value();
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
			setState(371); match(LEFT_PAREN);
			setState(372); expr_list();
			setState(373); match(RIGHT_PAREN);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374); match(COMMA);
					setState(375); match(LEFT_PAREN);
					setState(376); expr_list();
					setState(377); match(RIGHT_PAREN);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(384); match(RETURNING);
			setState(385); select_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(411);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(387); query_specification();
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388); query_rel();
						setState(391);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(389); query_specification();
							}
							break;
						case 2:
							{
							setState(390); query_expression();
							}
							break;
						}
						}
						} 
					}
					setState(397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); match(LEFT_PAREN);
				setState(399); select_stmt();
				setState(400); match(RIGHT_PAREN);
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(401); query_rel();
						setState(402); query_expression();
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(409); table_stmt();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 4);
				{
				setState(410); values_stmt();
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
			setState(414);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(413); with_query();
				}
			}

			setState(416); match(SELECT);
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(417); set_qualifier();
				}
				break;
			}
			setState(420); select_list();
			setState(422);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(421); into_expression();
				}
			}

			setState(425);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(424); from_clause();
				}
			}

			setState(428);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(427); where_clause();
				}
			}

			setState(431);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(430); group_clause();
				}
			}

			setState(434);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(433); having_clause();
				}
			}

			setState(437);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(436); window_clause();
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
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(441);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(440);
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
			setState(452);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); match(DISTINCT);
				setState(450);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(445); match(ON);
					setState(446); match(LEFT_PAREN);
					setState(447); expr_list();
					setState(448); match(RIGHT_PAREN);
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
			setState(454); select_sublist();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(455); match(COMMA);
				setState(456); select_sublist();
				}
				}
				setState(461);
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
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463); qualified_asterisk();
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
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); expr(0);
			setState(468);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(467); over_clause();
				}
			}

			setState(471);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(470); as_clause();
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
			setState(476);
			_la = _input.LA(1);
			if (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ABORT - 138)) | (1L << (ABSOLUTE - 138)) | (1L << (ACTION - 138)) | (1L << (ANALYZE - 138)) | (1L << (ARRAY - 138)) | (1L << (AT - 138)) | (1L << (AVG - 138)) | (1L << (BACKWARD - 138)) | (1L << (CACHE - 138)) | (1L << (CASCADE - 138)) | (1L << (CENTURY - 138)) | (1L << (CHARACTER - 138)) | (1L << (CLOSE - 138)) | (1L << (COLLATE - 138)) | (1L << (COLLECT - 138)) | (1L << (COALESCE - 138)) | (1L << (CONCURRENTLY - 138)) | (1L << (CONSTRAINT - 138)) | (1L << (CONSTRAINTS - 138)) | (1L << (CONTINUE - 138)) | (1L << (COSTS - 138)) | (1L << (COUNT - 138)) | (1L << (CUBE - 138)) | (1L << (CURSOR - 138)) | (1L << (CYCLE - 138)) | (1L << (DATA - 138)) | (1L << (DAY - 138)) | (1L << (DEC - 138)) | (1L << (DECADE - 138)) | (1L << (DECLARE - 138)) | (1L << (DEFAULTS - 138)) | (1L << (DEFERRED - 138)) | (1L << (DEFERRABLE - 138)) | (1L << (DISCARD - 138)) | (1L << (DOW - 138)) | (1L << (DOY - 138)) | (1L << (EPOCH - 138)) | (1L << (ESCAPE - 138)) | (1L << (EVERY - 138)) | (1L << (EXCLUDE - 138)) | (1L << (EXCLUDING - 138)) | (1L << (EXTENDED - 138)) | (1L << (EXTERNAL - 138)) | (1L << (EXTRACT - 138)) | (1L << (FILTER - 138)) | (1L << (FIRST - 138)) | (1L << (FOLLOWING - 138)) | (1L << (FORCE - 138)) | (1L << (FOREIGN - 138)) | (1L << (FORMAT - 138)) | (1L << (FORWARD - 138)) | (1L << (FUSION - 138)) | (1L << (GLOBAL - 138)) | (1L << (GROUPING - 138)) | (1L << (HASH - 138)) | (1L << (HOLD - 138)) | (1L << (HOUR - 138)) | (1L << (IDENTITY - 138)) | (1L << (INCLUDING - 138)) | (1L << (INDEXES - 138)) | (1L << (INHERIT - 138)) | (1L << (INHERITS - 138)) | (1L << (INITIALLY - 138)) | (1L << (INSENSITIVE - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (INTERSECTION - 202)) | (1L << (ISODOW - 202)) | (1L << (ISOYEAR - 202)) | (1L << (KEY - 202)) | (1L << (LAST - 202)) | (1L << (LATERAL - 202)) | (1L << (LESS - 202)) | (1L << (LIST - 202)) | (1L << (LOCAL - 202)) | (1L << (LOCATION - 202)) | (1L << (MAIN - 202)) | (1L << (MATCH - 202)) | (1L << (MATERIALIZED - 202)) | (1L << (MAX - 202)) | (1L << (MAXVALUE - 202)) | (1L << (MICROSECONDS - 202)) | (1L << (MILLENNIUM - 202)) | (1L << (MILLISECONDS - 202)) | (1L << (MIN - 202)) | (1L << (MINVALUE - 202)) | (1L << (MINUTE - 202)) | (1L << (MONTH - 202)) | (1L << (MOVE - 202)) | (1L << (NATIONAL - 202)) | (1L << (NEXT - 202)) | (1L << (NO - 202)) | (1L << (NO_INHERIT - 202)) | (1L << (NONE - 202)) | (1L << (NULLIF - 202)) | (1L << (NULLS - 202)) | (1L << (OIDS - 202)) | (1L << (ONLY - 202)) | (1L << (OVERWRITE - 202)) | (1L << (OWNED - 202)) | (1L << (PARTIAL - 202)) | (1L << (PARTITION - 202)) | (1L << (PARTITIONS - 202)) | (1L << (PLAIN - 202)) | (1L << (POSITION - 202)) | (1L << (PRECEDING - 202)) | (1L << (PRECISION - 202)) | (1L << (PRESERVE - 202)) | (1L << (PRIMARY - 202)) | (1L << (QUARTER - 202)) | (1L << (RANGE - 202)) | (1L << (RECURSIVE - 202)) | (1L << (REFERENCES - 202)) | (1L << (REFRESH - 202)) | (1L << (REGEXP - 202)) | (1L << (RELATIVE - 202)) | (1L << (RELEASE - 202)) | (1L << (REPLACE - 202)) | (1L << (RESTART - 202)) | (1L << (RESTRICT - 202)) | (1L << (RETURNING - 202)) | (1L << (RLIKE - 202)) | (1L << (ROLLUP - 202)) | (1L << (SCHEMA - 202)) | (1L << (SCROLL - 202)) | (1L << (SECOND - 202)) | (1L << (SEQUENCE - 202)) | (1L << (SEQUENCES - 202)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (SIMILAR - 266)) | (1L << (SIMPLE - 266)) | (1L << (STDDEV_POP - 266)) | (1L << (STDDEV_SAMP - 266)) | (1L << (STORAGE - 266)) | (1L << (SUBPARTITION - 266)) | (1L << (SUBSTRING - 266)) | (1L << (SUM - 266)) | (1L << (TABLES - 266)) | (1L << (TABLESPACE - 266)) | (1L << (TEMPORARY - 266)) | (1L << (TEMP - 266)) | (1L << (THAN - 266)) | (1L << (TIMEZONE - 266)) | (1L << (TIMEZONE_HOUR - 266)) | (1L << (TIMEZONE_MINUTE - 266)) | (1L << (TRANSACTION - 266)) | (1L << (TRIM - 266)) | (1L << (TYPE - 266)) | (1L << (UNBOUNDED - 266)) | (1L << (UNKNOWN - 266)) | (1L << (UNLOGGED - 266)) | (1L << (UNSECURED - 266)) | (1L << (USAGE - 266)) | (1L << (VALID - 266)) | (1L << (VARIADIC - 266)) | (1L << (VAR_SAMP - 266)) | (1L << (VAR_POP - 266)) | (1L << (VARYING - 266)) | (1L << (VERBOSE - 266)) | (1L << (WEEK - 266)) | (1L << (WINDOW - 266)) | (1L << (WITHIN - 266)) | (1L << (WITHOUT - 266)) | (1L << (YEAR - 266)) | (1L << (ZONE - 266)) | (1L << (BOOLEAN - 266)) | (1L << (BOOL - 266)) | (1L << (BIT - 266)) | (1L << (VARBIT - 266)) | (1L << (INT1 - 266)) | (1L << (INT2 - 266)) | (1L << (INT4 - 266)) | (1L << (INT8 - 266)) | (1L << (TINYINT - 266)) | (1L << (SMALLINT - 266)) | (1L << (INT - 266)) | (1L << (INTEGER - 266)) | (1L << (BIGINT - 266)) | (1L << (FLOAT4 - 266)) | (1L << (FLOAT8 - 266)) | (1L << (REAL - 266)) | (1L << (FLOAT - 266)) | (1L << (DOUBLE - 266)) | (1L << (NUMERIC - 266)) | (1L << (DECIMAL - 266)) | (1L << (CHAR - 266)) | (1L << (VARCHAR - 266)) | (1L << (NCHAR - 266)) | (1L << (NVARCHAR - 266)) | (1L << (DATE - 266)) | (1L << (INTERVAL - 266)) | (1L << (TIME - 266)) | (1L << (TIMETZ - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (TIMESTAMP - 330)) | (1L << (TIMESTAMPTZ - 330)) | (1L << (TEXT - 330)) | (1L << (TSVECTOR - 330)) | (1L << (TSQUERY - 330)) | (1L << (BINARY - 330)) | (1L << (VARBINARY - 330)) | (1L << (BLOB - 330)) | (1L << (BYTEA - 330)) | (1L << (INET4 - 330)) | (1L << (BOX2D - 330)) | (1L << (BOX3D - 330)) | (1L << (GEOMETRY - 330)) | (1L << (GEOMETRY_DUMP - 330)) | (1L << (GEOGRAPHY - 330)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(473); table_name();
				setState(474); match(DOT);
				}
			}

			setState(478); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(480); match(OVER);
			setState(486);
			switch (_input.LA(1)) {
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
				setState(481); window_name();
				}
				break;
			case LEFT_PAREN:
				{
				setState(482); match(LEFT_PAREN);
				setState(483); window_definition();
				setState(484); match(RIGHT_PAREN);
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
			setState(489);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(488); match(AS);
				}
			}

			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(491); column_alias();
				}
				break;
			case 2:
				{
				setState(492); boolean_literal();
				}
				break;
			case 3:
				{
				setState(493); match(NULL);
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
		public TerminalNode TEMPORARY() { return getToken(IdbParser.TEMPORARY, 0); }
		public TerminalNode INTO() { return getToken(IdbParser.INTO, 0); }
		public TerminalNode TEMP() { return getToken(IdbParser.TEMP, 0); }
		public TerminalNode TABLE() { return getToken(IdbParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
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
			setState(496); match(INTO);
			setState(498);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(497);
				_la = _input.LA(1);
				if ( !(((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (TEMPORARY - 276)) | (1L << (TEMP - 276)) | (1L << (UNLOGGED - 276)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(501);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(500); match(TABLE);
				}
			}

			setState(503); table_name();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AS() { return getToken(IdbParser.AS, 0); }
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public TerminalNode WITH() { return getToken(IdbParser.WITH, 0); }
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public With_query_nameContext with_query_name() {
			return getRuleContext(With_query_nameContext.class,0);
		}
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(IdbParser.RIGHT_PAREN, i);
		}
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
		public TerminalNode RECURSIVE() { return getToken(IdbParser.RECURSIVE, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(IdbParser.RIGHT_PAREN); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(IdbParser.LEFT_PAREN); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
			setState(505); match(WITH);
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(506); match(RECURSIVE);
				}
				break;
			}
			setState(509); with_query_name();
			setState(514);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(510); match(LEFT_PAREN);
				setState(511); column_name_list();
				setState(512); match(RIGHT_PAREN);
				}
			}

			setState(516); match(AS);
			setState(517); match(LEFT_PAREN);
			setState(523);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(518); select_stmt();
				}
				break;
			case 2:
				{
				setState(519); values_stmt();
				}
				break;
			case 3:
				{
				setState(520); insert_stmt();
				}
				break;
			case 4:
				{
				setState(521); update_stmt();
				}
				break;
			case 5:
				{
				setState(522); delete_stmt();
				}
				break;
			}
			setState(525); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(527); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_table_stmt);
		int _la;
		try {
			_localctx = new TableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(TABLE);
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(530); match(ONLY);
				}
				break;
			}
			setState(533); table_name();
			setState(535);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(534); match(MULTIPLY);
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
		enterRule(_localctx, 54, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); match(LEFT_PAREN);
			setState(538); select_stmt();
			setState(539); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_from_clause);
		int _la;
		try {
			_localctx = new FromClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(FROM);
			setState(542); table_reference();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543); match(COMMA);
				setState(544); table_reference();
				}
				}
				setState(549);
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
		enterRule(_localctx, 58, RULE_where_clause);
		try {
			_localctx = new WhereClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(550); match(WHERE);
			setState(551); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_group_clause);
		try {
			_localctx = new GroupClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(553); match(GROUP);
			setState(554); match(BY);
			setState(555); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_having_clause);
		try {
			_localctx = new HavingClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(HAVING);
			setState(558); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_window_clause);
		try {
			_localctx = new WindowClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(WINDOW);
			setState(561); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_window_specifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); window_specifier();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564); match(COMMA);
				setState(565); window_specifier();
				}
				}
				setState(570);
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
		enterRule(_localctx, 68, RULE_window_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); window_name();
			setState(572); match(AS);
			setState(573); window_definition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_order_clause);
		try {
			_localctx = new OrderClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(ORDER);
			setState(576); match(BY);
			setState(577); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_sort_specifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579); sort_specifier();
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(580); match(COMMA);
					setState(581); sort_specifier();
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 74, RULE_sort_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); expr(0);
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(588); order_specification();
				}
				break;
			}
			setState(592);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(591); null_ordering();
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
		enterRule(_localctx, 76, RULE_order_specification);
		try {
			setState(598);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(594); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(595); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(596); match(USING);
				setState(597); operators();
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
		enterRule(_localctx, 78, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (LTH - 371)) | (1L << (GTH - 371)) | (1L << (PLUS - 371)) | (1L << (SUB - 371)) | (1L << (MULTIPLY - 371)) | (1L << (DIVIDE - 371)) | (1L << (MODULAR - 371)) | (1L << (CUSTOME_OPERATOR - 371)))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_null_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); match(NULLS);
			setState(603);
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
		enterRule(_localctx, 82, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); match(LIMIT);
			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(606); count();
				}
				break;
			case 2:
				{
				setState(607); match(ALL);
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
		enterRule(_localctx, 84, RULE_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); match(OFFSET);
			setState(611); start();
			setState(613);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(612);
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
		enterRule(_localctx, 86, RULE_fetch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); match(FETCH);
			setState(616);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(617); count();
				}
				break;
			}
			setState(620);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(621); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_for_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(FOR);
			setState(631);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(624); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(625); match(NO);
				setState(626); match(KEY);
				setState(627); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(628); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(629); match(KEY);
				setState(630); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(635);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(633); match(OF);
				setState(634); table_name_list();
				}
			}

			setState(637); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_table_reference);
		try {
			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644); joined_table(0);
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
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(IdbParser.DOT); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(IdbParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_simple_table);
		try {
			setState(670);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(647); match(ONLY);
					}
					break;
				}
				setState(658);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(653);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(650); database_name();
						setState(651); match(DOT);
						}
						break;
					}
					setState(655); schema_name();
					setState(656); match(DOT);
					}
					break;
				}
				setState(660); table_name();
				setState(662);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(661); match(MULTIPLY);
					}
					break;
				}
				setState(665);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(664); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); derived_table();
				setState(668); correlation_specification();
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_joined_table, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(673); match(LEFT_PAREN);
				setState(674); joined_table(0);
				setState(675); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(677); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(700);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(680);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(681); match(CROSS);
						setState(682); match(JOIN);
						setState(683); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(684);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(685); match(UNION);
						setState(686); match(JOIN);
						setState(687); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(688);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(690);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(689); match(NATURAL);
							}
						}

						setState(693);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(692); join_type();
							}
						}

						setState(695); match(JOIN);
						setState(696); joined_table(0);
						setState(698);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(697); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(704);
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
		enterRule(_localctx, 100, RULE_join_type);
		int _la;
		try {
			setState(710);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(705); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(706); outer_join_type();
				setState(708);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(707); match(OUTER);
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
		enterRule(_localctx, 102, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		enterRule(_localctx, 104, RULE_correlation_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(714); match(AS);
				}
			}

			setState(717); correlation_name();
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(718); match(LEFT_PAREN);
				setState(719); derived_column_list();
				setState(720); match(RIGHT_PAREN);
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
		enterRule(_localctx, 106, RULE_derived_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_derived_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(726); match(LATERAL);
				}
				break;
			}
			setState(731);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(729); table_subquery();
				}
				break;
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
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
				setState(730); function();
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
		enterRule(_localctx, 110, RULE_table_subquery);
		try {
			setState(738);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733); subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734); match(LEFT_PAREN);
				setState(735); values_stmt();
				setState(736); match(RIGHT_PAREN);
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
		enterRule(_localctx, 112, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); function_name();
			setState(741); match(LEFT_PAREN);
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(742); set_qualifier();
				}
				break;
			}
			setState(746);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(745); function_args();
				}
			}

			setState(749);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(748); order_clause();
				}
			}

			setState(751); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_join_specification);
		try {
			setState(755);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(754); named_columns_join();
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
		enterRule(_localctx, 116, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); match(ON);
			setState(758); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); match(USING);
			setState(761); match(LEFT_PAREN);
			setState(762); join_column_list();
			setState(763); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_join_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_values_stmt);
		try {
			int _alt;
			_localctx = new ValuesStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(767); match(VALUES);
			setState(768); match(LEFT_PAREN);
			setState(769); expr_list();
			setState(770); match(RIGHT_PAREN);
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771); match(COMMA);
					setState(772); match(LEFT_PAREN);
					setState(773); expr_list();
					setState(774); match(RIGHT_PAREN);
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(782);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(781); order_clause();
				}
				break;
			}
			setState(785);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(784); limit_clause();
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
		enterRule(_localctx, 124, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); expr(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class FunctionExprContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFunctionExpr(this);
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
	public static class ColumnExprContext extends ExprContext {
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(790); unary_operator();
				setState(791); expr(29);
				}
				break;
			case 2:
				{
				_localctx = new UnaryOtherOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(793); any_other_operator();
				setState(794); expr(23);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(796); match(NOT);
				setState(797); expr(13);
				}
				break;
			case 4:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(798); unsigned_numeric_literal();
				}
				break;
			case 5:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(799); string_literal();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(821);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(803);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(800); database_name();
						setState(801); match(DOT);
						}
						break;
					}
					setState(805); schema_name();
					setState(806); match(DOT);
					setState(807); table_name();
					setState(808); match(DOT);
					}
					break;
				case 2:
					{
					setState(813);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(810); schema_name();
						setState(811); match(DOT);
						}
						break;
					}
					setState(815); table_name();
					setState(816); match(DOT);
					}
					break;
				case 3:
					{
					setState(818); table_name();
					setState(819); match(DOT);
					}
					break;
				}
				setState(823); column_name();
				}
				break;
			case 7:
				{
				_localctx = new ConstantValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(824); data_type();
				setState(825); match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(827); cast_expr();
				}
				break;
			case 9:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(828); array_constructor();
				}
				break;
			case 10:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(829); row_constructor();
				}
				break;
			case 11:
				{
				_localctx = new ValueFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(830); value_function();
				}
				break;
			case 12:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(831); function();
				}
				break;
			case 13:
				{
				_localctx = new CaseWhenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(832); case_when();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(833); match(LEFT_PAREN);
				setState(834); expr(0);
				setState(835); match(RIGHT_PAREN);
				}
				break;
			case 15:
				{
				_localctx = new ScalarSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(837); scalar_subquery();
				}
				break;
			case 16:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(838); tuple_value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(923);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new CaretExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(841);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(842); match(CARET);
						setState(843); expr(28);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(844);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(845);
						_la = _input.LA(1);
						if ( !(((((_la - 381)) & ~0x3f) == 0 && ((1L << (_la - 381)) & ((1L << (MULTIPLY - 381)) | (1L << (DIVIDE - 381)) | (1L << (MODULAR - 381)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(846); expr(28);
						}
						break;
					case 3:
						{
						_localctx = new PlusSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(847);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(848);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(849); expr(27);
						}
						break;
					case 4:
						{
						_localctx = new IsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(850);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(851); match(IS);
						setState(853);
						switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
						case 1:
							{
							setState(852); match(NOT);
							}
							break;
						}
						setState(855); expr(26);
						}
						break;
					case 5:
						{
						_localctx = new OtherOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(856);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(857); any_other_operator();
						setState(858); expr(23);
						}
						break;
					case 6:
						{
						_localctx = new IsDistinctExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(860);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(861); match(IS);
						setState(863);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(862); match(NOT);
							}
						}

						setState(865); match(DISTINCT);
						setState(866); match(FROM);
						setState(867); expr(21);
						}
						break;
					case 7:
						{
						_localctx = new BetweenPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(868);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(870);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(869); match(NOT);
							}
						}

						setState(872); match(BETWEEN);
						setState(873); expr(0);
						setState(874); match(AND);
						setState(875); expr(19);
						}
						break;
					case 8:
						{
						_localctx = new OverlapsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(877);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(878); match(OVERLAPS);
						setState(879); expr(18);
						}
						break;
					case 9:
						{
						_localctx = new LessOrGreatThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(880);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(881);
						_la = _input.LA(1);
						if ( !(_la==LTH || _la==GTH) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(882); expr(16);
						}
						break;
					case 10:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(883);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(884);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(885); expr(14);
						}
						break;
					case 11:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(886);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(887); match(AND);
						setState(888); expr(13);
						}
						break;
					case 12:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(889);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(890); match(OR);
						setState(891); expr(12);
						}
						break;
					case 13:
						{
						_localctx = new CastOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(892);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(893); match(CAST_OPERATOR);
						setState(894); data_type();
						}
						break;
					case 14:
						{
						_localctx = new NullOrNotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(895);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(896);
						_la = _input.LA(1);
						if ( !(_la==ISNULL || _la==NOTNULL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 15:
						{
						_localctx = new TypeComparePredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(897);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(898); match(IS);
						setState(899); match(OF);
						setState(900); match(LEFT_PAREN);
						setState(901); data_type_list();
						setState(902); match(RIGHT_PAREN);
						}
						break;
					case 16:
						{
						_localctx = new InPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(904);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(906);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(905); match(NOT);
							}
						}

						setState(908); match(IN);
						setState(912);
						switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
						case 1:
							{
							setState(909); subquery();
							}
							break;
						case 2:
							{
							setState(910); values_stmt();
							}
							break;
						case 3:
							{
							setState(911); tuple_value();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new LikePredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(914);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(915); pattern_matcher();
						setState(916); expr(0);
						setState(919);
						switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
						case 1:
							{
							setState(917); match(ESCAPE);
							setState(918); match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new ExprCollateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(921);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(922); collate_expression();
						}
						break;
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		enterRule(_localctx, 128, RULE_unsigned_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
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
		enterRule(_localctx, 130, RULE_string_literal);
		try {
			setState(937);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(930); match(STRING_LITERAL);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(931); match(REGEX);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(932); match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(933); match(DEFAULT);
				}
				break;
			case BIND_PARAMETER:
				enterOuterAlt(_localctx, 5);
				{
				setState(934); match(BIND_PARAMETER);
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(935); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 7);
				{
				setState(936); boolean_literal();
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
		enterRule(_localctx, 132, RULE_datetime_literal);
		try {
			setState(943);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(939); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(940); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(941); date_literal();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(942); interval_literal();
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
		enterRule(_localctx, 134, RULE_interval_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); match(INTERVAL);
			setState(947);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(946); interval_precision();
				}
			}

			setState(949); ((Interval_literalContext)_localctx).interval_string = match(STRING_LITERAL);
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(950); interval_qualifier();
				}
				break;
			}
			setState(954);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(953); interval_precision();
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
		enterRule(_localctx, 136, RULE_interval_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956); primary_datetime_field();
			setState(959);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(957); match(TO);
				setState(958); primary_datetime_field();
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
		enterRule(_localctx, 138, RULE_interval_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961); match(LEFT_PAREN);
			setState(962); unsigned_numeric_literal();
			setState(963); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965); match(TIME);
			setState(966); ((Time_literalContext)_localctx).time_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); match(TIMESTAMP);
			setState(969); ((Timestamp_literalContext)_localctx).timestamp_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971); match(DATE);
			setState(972); ((Date_literalContext)_localctx).date_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
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
		enterRule(_localctx, 148, RULE_primary_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_la = _input.LA(1);
			if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (DAY - 164)) | (1L << (HOUR - 164)) | (1L << (MINUTE - 164)) | (1L << (MONTH - 164)))) != 0) || _la==SECOND || _la==YEAR) ) {
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
		enterRule(_localctx, 150, RULE_extended_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (CENTURY - 148)) | (1L << (DECADE - 148)) | (1L << (DOW - 148)) | (1L << (DOY - 148)) | (1L << (EPOCH - 148)) | (1L << (ISODOW - 148)) | (1L << (ISOYEAR - 148)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (MICROSECONDS - 217)) | (1L << (MILLENNIUM - 217)) | (1L << (MILLISECONDS - 217)) | (1L << (QUARTER - 217)))) != 0) || _la==WEEK) ) {
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
		enterRule(_localctx, 152, RULE_collate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980); match(COLLATE);
			setState(981); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
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
		public TerminalNode CUSTOME_OPERATOR() { return getToken(IdbParser.CUSTOME_OPERATOR, 0); }
		public Postgis_operatorContext postgis_operator() {
			return getRuleContext(Postgis_operatorContext.class,0);
		}
		public TerminalNode NOT_SIMILAR_INSENSITIVE() { return getToken(IdbParser.NOT_SIMILAR_INSENSITIVE, 0); }
		public TerminalNode LEQ() { return getToken(IdbParser.LEQ, 0); }
		public TerminalNode SIMILAR_INSENSITIVE() { return getToken(IdbParser.SIMILAR_INSENSITIVE, 0); }
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
		enterRule(_localctx, 156, RULE_any_other_operator);
		try {
			setState(993);
			switch (_input.LA(1)) {
			case LEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(985); match(LEQ);
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(986); match(GEQ);
				}
				break;
			case CONCATENATION_OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(987); match(CONCATENATION_OPERATOR);
				}
				break;
			case NOT_SIMILAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(988); match(NOT_SIMILAR);
				}
				break;
			case SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(989); match(SIMILAR_INSENSITIVE);
				}
				break;
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(990); match(NOT_SIMILAR_INSENSITIVE);
				}
				break;
			case CUSTOME_OPERATOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(991); match(CUSTOME_OPERATOR);
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
				enterOuterAlt(_localctx, 8);
				{
				setState(992); postgis_operator();
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
		enterRule(_localctx, 158, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_la = _input.LA(1);
			if ( !(((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (INTERSECT2D - 390)) | (1L << (INTERSECT3D - 390)) | (1L << (OVERLAP - 390)) | (1L << (LEFT_OF - 390)) | (1L << (RIGHT_OF - 390)) | (1L << (ABOVE - 390)) | (1L << (OVERLAPS_ABOVE - 390)) | (1L << (BELOW - 390)) | (1L << (BOX_EQUAL - 390)) | (1L << (DISTANCE - 390)))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); subquery();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_tuple_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999); match(LEFT_PAREN);
			setState(1000); expr_list();
			setState(1001); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_case_when);
		int _la;
		try {
			setState(1036);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003); match(CASE);
				setState(1004); expr(0);
				setState(1010); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1005); match(WHEN);
					setState(1006); expr(0);
					setState(1007); match(THEN);
					setState(1008); expr(0);
					}
					}
					setState(1012); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1016);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1014); match(ELSE);
					setState(1015); expr(0);
					}
				}

				setState(1018); match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020); match(CASE);
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1021); match(WHEN);
					setState(1022); expr(0);
					setState(1023); match(THEN);
					setState(1024); expr(0);
					}
					}
					setState(1028); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1032);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1030); match(ELSE);
					setState(1031); expr(0);
					}
				}

				setState(1034); match(END);
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
		enterRule(_localctx, 166, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038); match(CAST);
			setState(1039); match(LEFT_PAREN);
			setState(1040); expr(0);
			setState(1041); match(AS);
			setState(1042); data_type();
			setState(1043); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_value_function);
		try {
			setState(1049);
			switch (_input.LA(1)) {
			case POSITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045); bit_position_function();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046); extract_function();
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047); substring_function();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1048); trim_function();
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
		enterRule(_localctx, 170, RULE_bit_position_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(POSITION);
			setState(1052); match(LEFT_PAREN);
			setState(1053); expr(0);
			setState(1054); match(IN);
			setState(1055); expr(0);
			setState(1056); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 172, RULE_extract_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); match(EXTRACT);
			setState(1059); match(LEFT_PAREN);
			setState(1060); ((Extract_functionContext)_localctx).extract_field_string = extract_field();
			setState(1061); match(FROM);
			setState(1062); expr(0);
			setState(1063); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_extract_field);
		try {
			setState(1068);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065); primary_datetime_field();
				}
				break;
			case TIMEZONE:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066); time_zone_field();
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
				setState(1067); extended_datetime_field();
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
		enterRule(_localctx, 176, RULE_time_zone_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			_la = _input.LA(1);
			if ( !(((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (TIMEZONE - 279)) | (1L << (TIMEZONE_HOUR - 279)) | (1L << (TIMEZONE_MINUTE - 279)))) != 0)) ) {
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
		enterRule(_localctx, 178, RULE_substring_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); match(SUBSTRING);
			setState(1073); match(LEFT_PAREN);
			setState(1074); expr(0);
			setState(1077);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1075); match(FROM);
				setState(1076); expr(0);
				}
			}

			setState(1081);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1079); match(FOR);
				setState(1080); expr(0);
				}
			}

			setState(1083); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_trim_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); match(TRIM);
			setState(1086); match(LEFT_PAREN);
			setState(1087); trim_operands();
			setState(1088); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 182, RULE_trim_operands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1091);
				_la = _input.LA(1);
				if (_la==BOTH || _la==LEADING || _la==TRAILING) {
					{
					setState(1090); trim_specification();
					}
				}

				setState(1094);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
					{
					setState(1093); ((Trim_operandsContext)_localctx).trim_character = expr(0);
					}
				}

				setState(1096); match(FROM);
				}
				break;
			}
			setState(1099); ((Trim_operandsContext)_localctx).trim_source = expr(0);
			setState(1102);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1100); match(COMMA);
				setState(1101); ((Trim_operandsContext)_localctx).trim_character = expr(0);
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
		enterRule(_localctx, 184, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
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
		enterRule(_localctx, 186, RULE_array_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); match(ARRAY);
			setState(1113);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(1107); scalar_subquery();
				}
				break;
			case LEFT_SQUARE:
				{
				setState(1108); match(LEFT_SQUARE);
				setState(1110);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
					{
					setState(1109); expr_list();
					}
				}

				setState(1112); match(RIGHT_SQUARE);
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
		enterRule(_localctx, 188, RULE_row_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115); match(ROW);
			setState(1116); match(LEFT_PAREN);
			setState(1118);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STDDEV_SAMP - 269)) | (1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSVECTOR - 333)) | (1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BELOW - 397)) | (1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(1117); expr_list();
				}
			}

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

	public static class Exists_predicateContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(IdbParser.EXISTS, 0); }
		public Scalar_subqueryContext scalar_subquery() {
			return getRuleContext(Scalar_subqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public Exists_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExists_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exists_predicateContext exists_predicate() throws RecognitionException {
		Exists_predicateContext _localctx = new Exists_predicateContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_exists_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1122); match(NOT);
				}
			}

			setState(1125); match(EXISTS);
			setState(1126); scalar_subquery();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_pattern_matcher);
		int _la;
		try {
			setState(1133);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1128); match(NOT);
					}
				}

				setState(1131); negativable_matcher();
				}
				break;
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132); regex_matcher();
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
		enterRule(_localctx, 194, RULE_negativable_matcher);
		try {
			setState(1141);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135); match(LIKE);
				}
				break;
			case ILIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136); match(ILIKE);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137); match(REGEXP);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1138); match(RLIKE);
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1139); match(SIMILAR);
				setState(1140); match(TO);
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
		enterRule(_localctx, 196, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_la = _input.LA(1);
			if ( !(((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TILDE - 389)) | (1L << (NOT_SIMILAR - 389)) | (1L << (SIMILAR_INSENSITIVE - 389)) | (1L << (NOT_SIMILAR_INSENSITIVE - 389)))) != 0)) ) {
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
		enterRule(_localctx, 198, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1145); expr(0);
			setState(1150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1146); match(COMMA);
					setState(1147); expr(0);
					}
					} 
				}
				setState(1152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
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
		enterRule(_localctx, 200, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 202, RULE_data_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155); data_type();
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1156); match(COMMA);
				setState(1157); data_type();
				}
				}
				setState(1162);
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
		enterRule(_localctx, 204, RULE_function_name);
		try {
			setState(1165);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163); function_reserved_name();
				}
				break;
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
				setState(1164); any_name();
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
		enterRule(_localctx, 206, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
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
		enterRule(_localctx, 208, RULE_function_args);
		int _la;
		try {
			setState(1178);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CASE:
			case CAST:
			case DEFAULT:
			case LEFT:
			case NOT:
			case NULL:
			case RIGHT:
			case ROW:
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
				setState(1169); function_arg();
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1170); match(COMMA);
					setState(1171); function_arg();
					}
					}
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177); match(MULTIPLY);
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
		enterRule(_localctx, 210, RULE_function_arg);
		try {
			setState(1188);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1180); match(VARIADIC);
					}
					break;
				}
				setState(1183); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184); identifier();
				setState(1185); match(ASSIGN);
				setState(1186); expr(0);
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
		enterRule(_localctx, 212, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 214, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 216, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 218, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 220, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 222, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 224, RULE_window_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1202); exists_window_name();
				}
				break;
			}
			setState(1208);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1205); match(PARTITION);
				setState(1206); match(BY);
				setState(1207); expr_list();
				}
				break;
			}
			setState(1211);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1210); order_clause();
				}
				break;
			}
			setState(1214);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1213); frame_clause();
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
		enterRule(_localctx, 226, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1216);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(1225);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CASE:
			case CAST:
			case CURRENT:
			case DEFAULT:
			case LEFT:
			case NOT:
			case NULL:
			case RIGHT:
			case ROW:
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
			case BIND_PARAMETER:
			case NUM:
			case REAL_NUM:
			case CUSTOME_OPERATOR:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case REGEX:
			case STRING_LITERAL:
				{
				setState(1219); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(1220); match(BETWEEN);
				setState(1221); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(1222); match(END);
				setState(1223); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 228, RULE_frame);
		try {
			setState(1239);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227); match(UNBOUNDED);
				setState(1228); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229); match(CURRENT);
				setState(1230); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231); match(UNBOUNDED);
				setState(1232); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1233); expr(0);
				setState(1234); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1236); expr(0);
				setState(1237); match(FOLLOWING);
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
		enterRule(_localctx, 230, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241); table_name();
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1242); match(COMMA);
				setState(1243); table_name();
				}
				}
				setState(1248);
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
		enterRule(_localctx, 232, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249); column_name();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1250); match(COMMA);
				setState(1251); column_name();
				}
				}
				setState(1256);
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
		enterRule(_localctx, 234, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257); column_name();
			setState(1258); data_type();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 236, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260); column_definition();
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1261); match(COMMA);
				setState(1262); column_definition();
				}
				}
				setState(1267);
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
		enterRule(_localctx, 238, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 240, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 244, RULE_identifier);
		int _la;
		try {
			setState(1276);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==QUOTED_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
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
				setState(1275); nonreserved_keywords();
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
		enterRule(_localctx, 246, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ABORT - 138)) | (1L << (ABSOLUTE - 138)) | (1L << (ACTION - 138)) | (1L << (ANALYZE - 138)) | (1L << (ARRAY - 138)) | (1L << (AT - 138)) | (1L << (AVG - 138)) | (1L << (BACKWARD - 138)) | (1L << (CACHE - 138)) | (1L << (CASCADE - 138)) | (1L << (CENTURY - 138)) | (1L << (CHARACTER - 138)) | (1L << (CLOSE - 138)) | (1L << (COLLATE - 138)) | (1L << (COLLECT - 138)) | (1L << (COALESCE - 138)) | (1L << (CONCURRENTLY - 138)) | (1L << (CONSTRAINT - 138)) | (1L << (CONSTRAINTS - 138)) | (1L << (CONTINUE - 138)) | (1L << (COSTS - 138)) | (1L << (COUNT - 138)) | (1L << (CUBE - 138)) | (1L << (CURSOR - 138)) | (1L << (CYCLE - 138)) | (1L << (DATA - 138)) | (1L << (DAY - 138)) | (1L << (DEC - 138)) | (1L << (DECADE - 138)) | (1L << (DECLARE - 138)) | (1L << (DEFAULTS - 138)) | (1L << (DEFERRED - 138)) | (1L << (DEFERRABLE - 138)) | (1L << (DISCARD - 138)) | (1L << (DOW - 138)) | (1L << (DOY - 138)) | (1L << (EPOCH - 138)) | (1L << (ESCAPE - 138)) | (1L << (EVERY - 138)) | (1L << (EXCLUDE - 138)) | (1L << (EXCLUDING - 138)) | (1L << (EXTENDED - 138)) | (1L << (EXTERNAL - 138)) | (1L << (EXTRACT - 138)) | (1L << (FILTER - 138)) | (1L << (FIRST - 138)) | (1L << (FOLLOWING - 138)) | (1L << (FORCE - 138)) | (1L << (FOREIGN - 138)) | (1L << (FORMAT - 138)) | (1L << (FORWARD - 138)) | (1L << (FUSION - 138)) | (1L << (GLOBAL - 138)) | (1L << (GROUPING - 138)) | (1L << (HASH - 138)) | (1L << (HOLD - 138)) | (1L << (HOUR - 138)) | (1L << (IDENTITY - 138)) | (1L << (INCLUDING - 138)) | (1L << (INDEXES - 138)) | (1L << (INHERIT - 138)) | (1L << (INHERITS - 138)) | (1L << (INITIALLY - 138)) | (1L << (INSENSITIVE - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (INTERSECTION - 202)) | (1L << (ISODOW - 202)) | (1L << (ISOYEAR - 202)) | (1L << (KEY - 202)) | (1L << (LAST - 202)) | (1L << (LATERAL - 202)) | (1L << (LESS - 202)) | (1L << (LIST - 202)) | (1L << (LOCAL - 202)) | (1L << (LOCATION - 202)) | (1L << (MAIN - 202)) | (1L << (MATCH - 202)) | (1L << (MATERIALIZED - 202)) | (1L << (MAX - 202)) | (1L << (MAXVALUE - 202)) | (1L << (MICROSECONDS - 202)) | (1L << (MILLENNIUM - 202)) | (1L << (MILLISECONDS - 202)) | (1L << (MIN - 202)) | (1L << (MINVALUE - 202)) | (1L << (MINUTE - 202)) | (1L << (MONTH - 202)) | (1L << (MOVE - 202)) | (1L << (NATIONAL - 202)) | (1L << (NEXT - 202)) | (1L << (NO - 202)) | (1L << (NO_INHERIT - 202)) | (1L << (NONE - 202)) | (1L << (NULLIF - 202)) | (1L << (NULLS - 202)) | (1L << (OIDS - 202)) | (1L << (ONLY - 202)) | (1L << (OVERWRITE - 202)) | (1L << (OWNED - 202)) | (1L << (PARTIAL - 202)) | (1L << (PARTITION - 202)) | (1L << (PARTITIONS - 202)) | (1L << (PLAIN - 202)) | (1L << (POSITION - 202)) | (1L << (PRECEDING - 202)) | (1L << (PRECISION - 202)) | (1L << (PRESERVE - 202)) | (1L << (PRIMARY - 202)) | (1L << (QUARTER - 202)) | (1L << (RANGE - 202)) | (1L << (RECURSIVE - 202)) | (1L << (REFERENCES - 202)) | (1L << (REFRESH - 202)) | (1L << (REGEXP - 202)) | (1L << (RELATIVE - 202)) | (1L << (RELEASE - 202)) | (1L << (REPLACE - 202)) | (1L << (RESTART - 202)) | (1L << (RESTRICT - 202)) | (1L << (RETURNING - 202)) | (1L << (RLIKE - 202)) | (1L << (ROLLUP - 202)) | (1L << (SCHEMA - 202)) | (1L << (SCROLL - 202)) | (1L << (SECOND - 202)) | (1L << (SEQUENCE - 202)) | (1L << (SEQUENCES - 202)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (SIMILAR - 266)) | (1L << (SIMPLE - 266)) | (1L << (STDDEV_POP - 266)) | (1L << (STDDEV_SAMP - 266)) | (1L << (STORAGE - 266)) | (1L << (SUBPARTITION - 266)) | (1L << (SUBSTRING - 266)) | (1L << (SUM - 266)) | (1L << (TABLES - 266)) | (1L << (TABLESPACE - 266)) | (1L << (TEMPORARY - 266)) | (1L << (TEMP - 266)) | (1L << (THAN - 266)) | (1L << (TIMEZONE - 266)) | (1L << (TIMEZONE_HOUR - 266)) | (1L << (TIMEZONE_MINUTE - 266)) | (1L << (TRANSACTION - 266)) | (1L << (TRIM - 266)) | (1L << (TYPE - 266)) | (1L << (UNBOUNDED - 266)) | (1L << (UNKNOWN - 266)) | (1L << (UNLOGGED - 266)) | (1L << (UNSECURED - 266)) | (1L << (USAGE - 266)) | (1L << (VALID - 266)) | (1L << (VARIADIC - 266)) | (1L << (VAR_SAMP - 266)) | (1L << (VAR_POP - 266)) | (1L << (VARYING - 266)) | (1L << (VERBOSE - 266)) | (1L << (WEEK - 266)) | (1L << (WINDOW - 266)) | (1L << (WITHIN - 266)) | (1L << (WITHOUT - 266)) | (1L << (YEAR - 266)) | (1L << (ZONE - 266)) | (1L << (BOOLEAN - 266)) | (1L << (BOOL - 266)) | (1L << (BIT - 266)) | (1L << (VARBIT - 266)) | (1L << (INT1 - 266)) | (1L << (INT2 - 266)) | (1L << (INT4 - 266)) | (1L << (INT8 - 266)) | (1L << (TINYINT - 266)) | (1L << (SMALLINT - 266)) | (1L << (INT - 266)) | (1L << (INTEGER - 266)) | (1L << (BIGINT - 266)) | (1L << (FLOAT4 - 266)) | (1L << (FLOAT8 - 266)) | (1L << (REAL - 266)) | (1L << (FLOAT - 266)) | (1L << (DOUBLE - 266)) | (1L << (NUMERIC - 266)) | (1L << (DECIMAL - 266)) | (1L << (CHAR - 266)) | (1L << (VARCHAR - 266)) | (1L << (NCHAR - 266)) | (1L << (NVARCHAR - 266)) | (1L << (DATE - 266)) | (1L << (INTERVAL - 266)) | (1L << (TIME - 266)) | (1L << (TIMETZ - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (TIMESTAMP - 330)) | (1L << (TIMESTAMPTZ - 330)) | (1L << (TEXT - 330)) | (1L << (TSVECTOR - 330)) | (1L << (TSQUERY - 330)) | (1L << (BINARY - 330)) | (1L << (VARBINARY - 330)) | (1L << (BLOB - 330)) | (1L << (BYTEA - 330)) | (1L << (INET4 - 330)) | (1L << (BOX2D - 330)) | (1L << (BOX3D - 330)) | (1L << (GEOMETRY - 330)) | (1L << (GEOMETRY_DUMP - 330)) | (1L << (GEOGRAPHY - 330)))) != 0)) ) {
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
		case 49: return joined_table_sempred((Joined_tableContext)_localctx, predIndex);
		case 63: return expr_sempred((ExprContext)_localctx, predIndex);
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
		case 3: return precpred(_ctx, 28);
		case 4: return precpred(_ctx, 27);
		case 5: return precpred(_ctx, 26);
		case 6: return precpred(_ctx, 25);
		case 7: return precpred(_ctx, 22);
		case 8: return precpred(_ctx, 20);
		case 9: return precpred(_ctx, 18);
		case 10: return precpred(_ctx, 17);
		case 11: return precpred(_ctx, 15);
		case 12: return precpred(_ctx, 14);
		case 13: return precpred(_ctx, 12);
		case 14: return precpred(_ctx, 11);
		case 15: return precpred(_ctx, 30);
		case 17: return precpred(_ctx, 21);
		case 16: return precpred(_ctx, 24);
		case 19: return precpred(_ctx, 16);
		case 18: return precpred(_ctx, 19);
		case 20: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01a0\u0503\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\3\2\3\2\3\2\7\2\u00fe\n\2\f\2"+
		"\16\2\u0101\13\2\3\2\3\2\5\2\u0105\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\5\5\u010f\n\5\3\5\5\5\u0112\n\5\3\5\5\5\u0115\n\5\3\5\5\5\u0118\n\5\3"+
		"\5\5\5\u011b\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0122\n\6\3\6\5\6\u0125\n\6\3"+
		"\6\5\6\u0128\n\6\3\7\3\7\3\7\3\7\5\7\u012e\n\7\3\7\5\7\u0131\n\7\3\7\5"+
		"\7\u0134\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u013c\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0147\n\b\3\b\5\b\u014a\n\b\3\t\3\t\3\t\3\t\7\t\u0150"+
		"\n\t\f\t\16\t\u0153\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u015d\n\n"+
		"\f\n\16\n\u0160\13\n\3\13\3\13\3\13\7\13\u0165\n\13\f\13\16\13\u0168\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0174\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u017e\n\r\f\r\16\r\u0181\13\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\5\17\u018a\n\17\7\17\u018c\n\17\f\17\16\17\u018f"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0197\n\17\f\17\16\17\u019a"+
		"\13\17\3\17\3\17\5\17\u019e\n\17\3\20\5\20\u01a1\n\20\3\20\3\20\5\20\u01a5"+
		"\n\20\3\20\3\20\5\20\u01a9\n\20\3\20\5\20\u01ac\n\20\3\20\5\20\u01af\n"+
		"\20\3\20\5\20\u01b2\n\20\3\20\5\20\u01b5\n\20\3\20\5\20\u01b8\n\20\3\21"+
		"\3\21\5\21\u01bc\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01c5\n"+
		"\22\5\22\u01c7\n\22\3\23\3\23\3\23\7\23\u01cc\n\23\f\23\16\23\u01cf\13"+
		"\23\3\24\3\24\5\24\u01d3\n\24\3\25\3\25\5\25\u01d7\n\25\3\25\5\25\u01da"+
		"\n\25\3\26\3\26\3\26\5\26\u01df\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01e9\n\27\3\30\5\30\u01ec\n\30\3\30\3\30\3\30\5\30\u01f1\n"+
		"\30\3\31\3\31\5\31\u01f5\n\31\3\31\5\31\u01f8\n\31\3\31\3\31\3\32\3\32"+
		"\5\32\u01fe\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u0205\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u020e\n\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\5\34\u0216\n\34\3\34\3\34\5\34\u021a\n\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\7\36\u0224\n\36\f\36\16\36\u0227\13\36\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\7#\u0239\n#\f#\16#\u023c\13#"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\7&\u0249\n&\f&\16&\u024c\13&\3\'\3\'"+
		"\5\'\u0250\n\'\3\'\5\'\u0253\n\'\3(\3(\3(\3(\5(\u0259\n(\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\5+\u0263\n+\3,\3,\3,\5,\u0268\n,\3-\3-\3-\5-\u026d\n-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u027a\n.\3.\3.\5.\u027e\n.\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\5\61\u0288\n\61\3\62\5\62\u028b\n\62\3\62\3\62\3"+
		"\62\5\62\u0290\n\62\3\62\3\62\3\62\5\62\u0295\n\62\3\62\3\62\5\62\u0299"+
		"\n\62\3\62\5\62\u029c\n\62\3\62\3\62\3\62\5\62\u02a1\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u02a9\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u02b5\n\63\3\63\5\63\u02b8\n\63\3\63\3\63\3\63\5"+
		"\63\u02bd\n\63\7\63\u02bf\n\63\f\63\16\63\u02c2\13\63\3\64\3\64\3\64\5"+
		"\64\u02c7\n\64\5\64\u02c9\n\64\3\65\3\65\3\66\5\66\u02ce\n\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u02d5\n\66\3\67\3\67\38\58\u02da\n8\38\38\58\u02de"+
		"\n8\39\39\39\39\39\59\u02e5\n9\3:\3:\3:\5:\u02ea\n:\3:\5:\u02ed\n:\3:"+
		"\5:\u02f0\n:\3:\3:\3;\3;\5;\u02f6\n;\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\7?\u030b\n?\f?\16?\u030e\13?\3?\5?\u0311\n?\3"+
		"?\5?\u0314\n?\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0326"+
		"\nA\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0330\nA\3A\3A\3A\3A\3A\3A\5A\u0338\nA"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u034a\nA\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0358\nA\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0362"+
		"\nA\3A\3A\3A\3A\3A\5A\u0369\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u038d"+
		"\nA\3A\3A\3A\3A\5A\u0393\nA\3A\3A\3A\3A\3A\5A\u039a\nA\3A\3A\7A\u039e"+
		"\nA\fA\16A\u03a1\13A\3B\3B\3C\3C\3C\3C\3C\3C\3C\5C\u03ac\nC\3D\3D\3D\3"+
		"D\5D\u03b2\nD\3E\3E\5E\u03b6\nE\3E\3E\5E\u03ba\nE\3E\5E\u03bd\nE\3F\3"+
		"F\3F\5F\u03c2\nF\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3"+
		"M\3M\3N\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\5P\u03e4\nP\3Q\3Q\3R\3R\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\6T\u03f5\nT\rT\16T\u03f6\3T\3T\5T\u03fb"+
		"\nT\3T\3T\3T\3T\3T\3T\3T\3T\6T\u0405\nT\rT\16T\u0406\3T\3T\5T\u040b\n"+
		"T\3T\3T\5T\u040f\nT\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\5V\u041c\nV\3W\3"+
		"W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\5Y\u042f\nY\3Z\3Z\3[\3"+
		"[\3[\3[\3[\5[\u0438\n[\3[\3[\5[\u043c\n[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]"+
		"\5]\u0446\n]\3]\5]\u0449\n]\3]\5]\u044c\n]\3]\3]\3]\5]\u0451\n]\3^\3^"+
		"\3_\3_\3_\3_\5_\u0459\n_\3_\5_\u045c\n_\3`\3`\3`\5`\u0461\n`\3`\3`\3a"+
		"\5a\u0466\na\3a\3a\3a\3b\5b\u046c\nb\3b\3b\5b\u0470\nb\3c\3c\3c\3c\3c"+
		"\3c\5c\u0478\nc\3d\3d\3e\3e\3e\7e\u047f\ne\fe\16e\u0482\13e\3f\3f\3g\3"+
		"g\3g\7g\u0489\ng\fg\16g\u048c\13g\3h\3h\5h\u0490\nh\3i\3i\3j\3j\3j\7j"+
		"\u0497\nj\fj\16j\u049a\13j\3j\5j\u049d\nj\3k\5k\u04a0\nk\3k\3k\3k\3k\3"+
		"k\5k\u04a7\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\5r\u04b6\nr\3r\3"+
		"r\3r\5r\u04bb\nr\3r\5r\u04be\nr\3r\5r\u04c1\nr\3s\5s\u04c4\ns\3s\3s\3"+
		"s\3s\3s\3s\5s\u04cc\ns\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u04da\n"+
		"t\3u\3u\3u\7u\u04df\nu\fu\16u\u04e2\13u\3v\3v\3v\7v\u04e7\nv\fv\16v\u04ea"+
		"\13v\3w\3w\3w\3x\3x\3x\7x\u04f2\nx\fx\16x\u04f5\13x\3y\3y\3z\3z\3{\3{"+
		"\3|\3|\5|\u04ff\n|\3}\3}\3}\2\4d\u0080~\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\2\33\5\2$$::}}\4\2\5\5  \4\2\u0116\u0117\u0121\u0121\6\2\u0175\u0175"+
		"\u0177\u0177\u017d\u0181\u019a\u019a\4\2\u00b9\u00b9\u00d0\u00d0\3\2h"+
		"i\4\2\u00b9\u00b9\u00e4\u00e4\5\2,,@@ff\3\2\u017f\u0181\3\2\u017d\u017e"+
		"\4\2\u0175\u0175\u0177\u0177\4\2\u016f\u016f\u0174\u0174\4\2==NN\3\2\u0196"+
		"\u0197\4\2\u008a\u008b\u0120\u0120\7\2\u00a6\u00a6\u00c4\u00c4\u00e0\u00e1"+
		"\u0109\u0109\u012e\u012e\t\2\u0096\u0096\u00a8\u00a8\u00ae\u00b0\u00cd"+
		"\u00ce\u00db\u00dd\u00f9\u00f9\u012a\u012a\3\2\u0188\u0191\3\2\u0119\u011b"+
		"\5\2\17\17??yy\4\2\u0187\u0187\u0192\u0194\6\2\5\5\b\b@@ff\4\2ii\u00fa"+
		"\u00fa\3\2\u019b\u019c\4\2\u008c\u00eb\u00ee\u015a\u055b\2\u00ff\3\2\2"+
		"\2\4\u0108\3\2\2\2\6\u010a\3\2\2\2\b\u010c\3\2\2\2\n\u011c\3\2\2\2\f\u0129"+
		"\3\2\2\2\16\u0135\3\2\2\2\20\u014b\3\2\2\2\22\u0154\3\2\2\2\24\u0161\3"+
		"\2\2\2\26\u0173\3\2\2\2\30\u0175\3\2\2\2\32\u0182\3\2\2\2\34\u019d\3\2"+
		"\2\2\36\u01a0\3\2\2\2 \u01b9\3\2\2\2\"\u01c6\3\2\2\2$\u01c8\3\2\2\2&\u01d2"+
		"\3\2\2\2(\u01d4\3\2\2\2*\u01de\3\2\2\2,\u01e2\3\2\2\2.\u01eb\3\2\2\2\60"+
		"\u01f2\3\2\2\2\62\u01fb\3\2\2\2\64\u0211\3\2\2\2\66\u0213\3\2\2\28\u021b"+
		"\3\2\2\2:\u021f\3\2\2\2<\u0228\3\2\2\2>\u022b\3\2\2\2@\u022f\3\2\2\2B"+
		"\u0232\3\2\2\2D\u0235\3\2\2\2F\u023d\3\2\2\2H\u0241\3\2\2\2J\u0245\3\2"+
		"\2\2L\u024d\3\2\2\2N\u0258\3\2\2\2P\u025a\3\2\2\2R\u025c\3\2\2\2T\u025f"+
		"\3\2\2\2V\u0264\3\2\2\2X\u0269\3\2\2\2Z\u0271\3\2\2\2\\\u0281\3\2\2\2"+
		"^\u0283\3\2\2\2`\u0287\3\2\2\2b\u02a0\3\2\2\2d\u02a8\3\2\2\2f\u02c8\3"+
		"\2\2\2h\u02ca\3\2\2\2j\u02cd\3\2\2\2l\u02d6\3\2\2\2n\u02d9\3\2\2\2p\u02e4"+
		"\3\2\2\2r\u02e6\3\2\2\2t\u02f5\3\2\2\2v\u02f7\3\2\2\2x\u02fa\3\2\2\2z"+
		"\u02ff\3\2\2\2|\u0301\3\2\2\2~\u0315\3\2\2\2\u0080\u0349\3\2\2\2\u0082"+
		"\u03a2\3\2\2\2\u0084\u03ab\3\2\2\2\u0086\u03b1\3\2\2\2\u0088\u03b3\3\2"+
		"\2\2\u008a\u03be\3\2\2\2\u008c\u03c3\3\2\2\2\u008e\u03c7\3\2\2\2\u0090"+
		"\u03ca\3\2\2\2\u0092\u03cd\3\2\2\2\u0094\u03d0\3\2\2\2\u0096\u03d2\3\2"+
		"\2\2\u0098\u03d4\3\2\2\2\u009a\u03d6\3\2\2\2\u009c\u03d9\3\2\2\2\u009e"+
		"\u03e3\3\2\2\2\u00a0\u03e5\3\2\2\2\u00a2\u03e7\3\2\2\2\u00a4\u03e9\3\2"+
		"\2\2\u00a6\u040e\3\2\2\2\u00a8\u0410\3\2\2\2\u00aa\u041b\3\2\2\2\u00ac"+
		"\u041d\3\2\2\2\u00ae\u0424\3\2\2\2\u00b0\u042e\3\2\2\2\u00b2\u0430\3\2"+
		"\2\2\u00b4\u0432\3\2\2\2\u00b6\u043f\3\2\2\2\u00b8\u044b\3\2\2\2\u00ba"+
		"\u0452\3\2\2\2\u00bc\u0454\3\2\2\2\u00be\u045d\3\2\2\2\u00c0\u0465\3\2"+
		"\2\2\u00c2\u046f\3\2\2\2\u00c4\u0477\3\2\2\2\u00c6\u0479\3\2\2\2\u00c8"+
		"\u047b\3\2\2\2\u00ca\u0483\3\2\2\2\u00cc\u0485\3\2\2\2\u00ce\u048f\3\2"+
		"\2\2\u00d0\u0491\3\2\2\2\u00d2\u049c\3\2\2\2\u00d4\u04a6\3\2\2\2\u00d6"+
		"\u04a8\3\2\2\2\u00d8\u04aa\3\2\2\2\u00da\u04ac\3\2\2\2\u00dc\u04ae\3\2"+
		"\2\2\u00de\u04b0\3\2\2\2\u00e0\u04b2\3\2\2\2\u00e2\u04b5\3\2\2\2\u00e4"+
		"\u04c3\3\2\2\2\u00e6\u04d9\3\2\2\2\u00e8\u04db\3\2\2\2\u00ea\u04e3\3\2"+
		"\2\2\u00ec\u04eb\3\2\2\2\u00ee\u04ee\3\2\2\2\u00f0\u04f6\3\2\2\2\u00f2"+
		"\u04f8\3\2\2\2\u00f4\u04fa\3\2\2\2\u00f6\u04fe\3\2\2\2\u00f8\u0500\3\2"+
		"\2\2\u00fa\u00fb\5\4\3\2\u00fb\u00fc\7\u0171\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5\4\3\2\u0103"+
		"\u0105\7\u0171\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\7\2\2\3\u0107\3\3\2\2\2\u0108\u0109\5\6\4\2\u0109"+
		"\5\3\2\2\2\u010a\u010b\5\b\5\2\u010b\7\3\2\2\2\u010c\u010e\5\34\17\2\u010d"+
		"\u010f\5H%\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2"+
		"\2\u0110\u0112\5T+\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114"+
		"\3\2\2\2\u0113\u0115\5V,\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0118\5X-\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2"+
		"\2\u0118\u011a\3\2\2\2\u0119\u011b\5Z.\2\u011a\u0119\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\t\3\2\2\2\u011c\u011d\7\177\2\2\u011d\u011e\5\u00dan\2"+
		"\u011e\u011f\7m\2\2\u011f\u0121\5\24\13\2\u0120\u0122\5:\36\2\u0121\u0120"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0125\5<\37\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0128\5\32"+
		"\16\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\13\3\2\2\2\u0129\u012a"+
		"\7\36\2\2\u012a\u012b\7+\2\2\u012b\u012d\5\u00dan\2\u012c\u012e\5\20\t"+
		"\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131"+
		"\5<\37\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0134\5\32\16\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\r\3\2\2"+
		"\2\u0135\u0136\79\2\2\u0136\u013b\5\60\31\2\u0137\u0138\7\u0179\2\2\u0138"+
		"\u0139\5\u00eav\2\u0139\u013a\7\u017a\2\2\u013a\u013c\3\2\2\2\u013b\u0137"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0146\3\2\2\2\u013d\u013e\7\u0083\2"+
		"\2\u013e\u0147\5\22\n\2\u013f\u0147\5\b\5\2\u0140\u0141\7\u0179\2\2\u0141"+
		"\u0142\5\b\5\2\u0142\u0143\7\u017a\2\2\u0143\u0147\3\2\2\2\u0144\u0145"+
		"\7\35\2\2\u0145\u0147\7\u0083\2\2\u0146\u013d\3\2\2\2\u0146\u013f\3\2"+
		"\2\2\u0146\u0140\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u014a\5\32\16\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\17\3\2"+
		"\2\2\u014b\u014c\7\u0081\2\2\u014c\u0151\5`\61\2\u014d\u014e\7\u0172\2"+
		"\2\u014e\u0150\5`\61\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\21\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\7\u0179\2\2\u0155\u0156\5\u00c8e\2\u0156\u015e\7\u017a\2\2\u0157"+
		"\u0158\7\u0172\2\2\u0158\u0159\7\u0179\2\2\u0159\u015a\5\u00c8e\2\u015a"+
		"\u015b\7\u017a\2\2\u015b\u015d\3\2\2\2\u015c\u0157\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\23\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0166\5\26\f\2\u0162\u0163\7\u0172\2\2\u0163\u0165"+
		"\5\26\f\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\25\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a"+
		"\5\u00dco\2\u016a\u016b\7\u016f\2\2\u016b\u016c\5\u0080A\2\u016c\u0174"+
		"\3\2\2\2\u016d\u016e\7\u0179\2\2\u016e\u016f\5\u00eav\2\u016f\u0170\7"+
		"\u017a\2\2\u0170\u0171\7\u016f\2\2\u0171\u0172\5\30\r\2\u0172\u0174\3"+
		"\2\2\2\u0173\u0169\3\2\2\2\u0173\u016d\3\2\2\2\u0174\27\3\2\2\2\u0175"+
		"\u0176\7\u0179\2\2\u0176\u0177\5\u00c8e\2\u0177\u017f\7\u017a\2\2\u0178"+
		"\u0179\7\u0172\2\2\u0179\u017a\7\u0179\2\2\u017a\u017b\5\u00c8e\2\u017b"+
		"\u017c\7\u017a\2\2\u017c\u017e\3\2\2\2\u017d\u0178\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\31\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0183\7\u0104\2\2\u0183\u0184\5$\23\2\u0184\33\3"+
		"\2\2\2\u0185\u018d\5\36\20\2\u0186\u0189\5 \21\2\u0187\u018a\5\36\20\2"+
		"\u0188\u018a\5\34\17\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0186\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u019e\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\u0179"+
		"\2\2\u0191\u0192\5\b\5\2\u0192\u0198\7\u017a\2\2\u0193\u0194\5 \21\2\u0194"+
		"\u0195\5\34\17\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019e\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019e\5\66\34\2\u019c\u019e\5|?\2\u019d\u0185\3\2"+
		"\2\2\u019d\u0190\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\35\3\2\2\2\u019f\u01a1\5\62\32\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\7k\2\2\u01a3\u01a5\5\"\22\2\u01a4"+
		"\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\5$"+
		"\23\2\u01a7\u01a9\5\60\31\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01ac\5:\36\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5<\37\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\5> \2\u01b1\u01b0\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5@!\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b8\5B\"\2\u01b7"+
		"\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\37\3\2\2\2\u01b9\u01bb\t\2\2"+
		"\2\u01ba\u01bc\t\3\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc!"+
		"\3\2\2\2\u01bd\u01c7\7\5\2\2\u01be\u01c4\7 \2\2\u01bf\u01c0\7W\2\2\u01c0"+
		"\u01c1\7\u0179\2\2\u01c1\u01c2\5\u00c8e\2\u01c2\u01c3\7\u017a\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2"+
		"\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3\2\2\2\u01c7#\3\2\2\2\u01c8\u01cd"+
		"\5&\24\2\u01c9\u01ca\7\u0172\2\2\u01ca\u01cc\5&\24\2\u01cb\u01c9\3\2\2"+
		"\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce%"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\5(\25\2\u01d1\u01d3\5*\26\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\'\3\2\2\2\u01d4\u01d6\5\u0080"+
		"A\2\u01d5\u01d7\5,\27\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01da\5.\30\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da)\3\2\2\2\u01db\u01dc\5\u00dan\2\u01dc\u01dd\7\u0183\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e1\7\u017f\2\2\u01e1+\3\2\2\2\u01e2\u01e8\7\u00ec\2\2\u01e3"+
		"\u01e9\5\u00dep\2\u01e4\u01e5\7\u0179\2\2\u01e5\u01e6\5\u00e2r\2\u01e6"+
		"\u01e7\7\u017a\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4"+
		"\3\2\2\2\u01e9-\3\2\2\2\u01ea\u01ec\7\t\2\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01f1\5\u00f2z\2\u01ee\u01f1"+
		"\5\u0094K\2\u01ef\u01f1\7Q\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2"+
		"\u01f0\u01ef\3\2\2\2\u01f1/\3\2\2\2\u01f2\u01f4\7;\2\2\u01f3\u01f5\t\4"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01f8\7v\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fa\5\u00dan\2\u01fa\61\3\2\2\2\u01fb\u01fd\7\u0089\2\2\u01fc"+
		"\u01fe\7\u00fb\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0204\5\64\33\2\u0200\u0201\7\u0179\2\2\u0201\u0202\5\u00ea"+
		"v\2\u0202\u0203\7\u017a\2\2\u0203\u0205\3\2\2\2\u0204\u0200\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7\t\2\2\u0207\u020d\7\u0179"+
		"\2\2\u0208\u020e\5\b\5\2\u0209\u020e\5|?\2\u020a\u020e\5\16\b\2\u020b"+
		"\u020e\5\n\6\2\u020c\u020e\5\f\7\2\u020d\u0208\3\2\2\2\u020d\u0209\3\2"+
		"\2\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\7\u017a\2\2\u0210\63\3\2\2\2\u0211\u0212\5"+
		"\u00f4{\2\u0212\65\3\2\2\2\u0213\u0215\7v\2\2\u0214\u0216\7\u00eb\2\2"+
		"\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219"+
		"\5\u00dan\2\u0218\u021a\7\u017f\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3"+
		"\2\2\2\u021a\67\3\2\2\2\u021b\u021c\7\u0179\2\2\u021c\u021d\5\b\5\2\u021d"+
		"\u021e\7\u017a\2\2\u021e9\3\2\2\2\u021f\u0220\7+\2\2\u0220\u0225\5`\61"+
		"\2\u0221\u0222\7\u0172\2\2\u0222\u0224\5`\61\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226;\3\2\2\2"+
		"\u0227\u0225\3\2\2\2\u0228\u0229\7\u0088\2\2\u0229\u022a\5~@\2\u022a="+
		"\3\2\2\2\u022b\u022c\7.\2\2\u022c\u022d\7\20\2\2\u022d\u022e\5\u00c8e"+
		"\2\u022e?\3\2\2\2\u022f\u0230\7/\2\2\u0230\u0231\5\u00c8e\2\u0231A\3\2"+
		"\2\2\u0232\u0233\7\u012b\2\2\u0233\u0234\5D#\2\u0234C\3\2\2\2\u0235\u023a"+
		"\5F$\2\u0236\u0237\7\u0172\2\2\u0237\u0239\5F$\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023bE\3\2\2\2"+
		"\u023c\u023a\3\2\2\2\u023d\u023e\5\u00dep\2\u023e\u023f\7\t\2\2\u023f"+
		"\u0240\5\u00e2r\2\u0240G\3\2\2\2\u0241\u0242\7[\2\2\u0242\u0243\7\20\2"+
		"\2\u0243\u0244\5J&\2\u0244I\3\2\2\2\u0245\u024a\5L\'\2\u0246\u0247\7\u0172"+
		"\2\2\u0247\u0249\5L\'\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024bK\3\2\2\2\u024c\u024a\3\2\2\2"+
		"\u024d\u024f\5\u0080A\2\u024e\u0250\5N(\2\u024f\u024e\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0253\5R*\2\u0252\u0251\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253M\3\2\2\2\u0254\u0259\7\n\2\2\u0255\u0259\7\37\2\2"+
		"\u0256\u0257\7\u0081\2\2\u0257\u0259\5P)\2\u0258\u0254\3\2\2\2\u0258\u0255"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0259O\3\2\2\2\u025a\u025b\t\5\2\2\u025b"+
		"Q\3\2\2\2\u025c\u025d\7\u00e9\2\2\u025d\u025e\t\6\2\2\u025eS\3\2\2\2\u025f"+
		"\u0262\7C\2\2\u0260\u0263\5\\/\2\u0261\u0263\7\5\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0261\3\2\2\2\u0263U\3\2\2\2\u0264\u0265\7V\2\2\u0265\u0267\5"+
		"^\60\2\u0266\u0268\t\7\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"W\3\2\2\2\u0269\u026a\7(\2\2\u026a\u026c\t\b\2\2\u026b\u026d\5\\/\2\u026c"+
		"\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\t\7"+
		"\2\2\u026f\u0270\7\u00eb\2\2\u0270Y\3\2\2\2\u0271\u0279\7*\2\2\u0272\u027a"+
		"\7\177\2\2\u0273\u0274\7\u00e5\2\2\u0274\u0275\7\u00cf\2\2\u0275\u027a"+
		"\7\177\2\2\u0276\u027a\7n\2\2\u0277\u0278\7\u00cf\2\2\u0278\u027a\7n\2"+
		"\2\u0279\u0272\3\2\2\2\u0279\u0273\3\2\2\2\u0279\u0276\3\2\2\2\u0279\u0277"+
		"\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u027c\7S\2\2\u027c\u027e\5\u00e8u\2"+
		"\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280"+
		"\7P\2\2\u0280[\3\2\2\2\u0281\u0282\5\u0080A\2\u0282]\3\2\2\2\u0283\u0284"+
		"\5\u0080A\2\u0284_\3\2\2\2\u0285\u0288\5b\62\2\u0286\u0288\5d\63\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288a\3\2\2\2\u0289\u028b\7\u00eb"+
		"\2\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0294\3\2\2\2\u028c"+
		"\u028d\5\u00d6l\2\u028d\u028e\7\u0183\2\2\u028e\u0290\3\2\2\2\u028f\u028c"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\5\u00d8m"+
		"\2\u0292\u0293\7\u0183\2\2\u0293\u0295\3\2\2\2\u0294\u028f\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\5\u00dan\2\u0297\u0299"+
		"\7\u017f\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2"+
		"\2\u029a\u029c\5j\66\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a1"+
		"\3\2\2\2\u029d\u029e\5n8\2\u029e\u029f\5j\66\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u028a\3\2\2\2\u02a0\u029d\3\2\2\2\u02a1c\3\2\2\2\u02a2\u02a3\b\63\1\2"+
		"\u02a3\u02a4\7\u0179\2\2\u02a4\u02a5\5d\63\2\u02a5\u02a6\7\u017a\2\2\u02a6"+
		"\u02a9\3\2\2\2\u02a7\u02a9\5b\62\2\u02a8\u02a2\3\2\2\2\u02a8\u02a7\3\2"+
		"\2\2\u02a9\u02c0\3\2\2\2\u02aa\u02ab\f\7\2\2\u02ab\u02ac\7\33\2\2\u02ac"+
		"\u02ad\7>\2\2\u02ad\u02bf\5d\63\b\u02ae\u02af\f\5\2\2\u02af\u02b0\7}\2"+
		"\2\u02b0\u02b1\7>\2\2\u02b1\u02bf\5d\63\6\u02b2\u02b4\f\6\2\2\u02b3\u02b5"+
		"\7K\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6"+
		"\u02b8\5f\64\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02ba\7>\2\2\u02ba\u02bc\5d\63\2\u02bb\u02bd\5t;\2\u02bc\u02bb"+
		"\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02aa\3\2\2\2\u02be"+
		"\u02ae\3\2\2\2\u02be\u02b2\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1e\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c9"+
		"\78\2\2\u02c4\u02c6\5h\65\2\u02c5\u02c7\7\\\2\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c4\3\2"+
		"\2\2\u02c9g\3\2\2\2\u02ca\u02cb\t\t\2\2\u02cbi\3\2\2\2\u02cc\u02ce\7\t"+
		"\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d4\5\u00f0y\2\u02d0\u02d1\7\u0179\2\2\u02d1\u02d2\5l\67\2\u02d2\u02d3"+
		"\7\u017a\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d5\3\2\2"+
		"\2\u02d5k\3\2\2\2\u02d6\u02d7\5\u00eav\2\u02d7m\3\2\2\2\u02d8\u02da\7"+
		"\u00d1\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2\2"+
		"\u02db\u02de\5p9\2\u02dc\u02de\5r:\2\u02dd\u02db\3\2\2\2\u02dd\u02dc\3"+
		"\2\2\2\u02deo\3\2\2\2\u02df\u02e5\58\35\2\u02e0\u02e1\7\u0179\2\2\u02e1"+
		"\u02e2\5|?\2\u02e2\u02e3\7\u017a\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02df\3"+
		"\2\2\2\u02e4\u02e0\3\2\2\2\u02e5q\3\2\2\2\u02e6\u02e7\5\u00ceh\2\u02e7"+
		"\u02e9\7\u0179\2\2\u02e8\u02ea\5\"\22\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02ed\5\u00d2j\2\u02ec\u02eb\3\2\2"+
		"\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02f0\5H%\2\u02ef\u02ee"+
		"\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\7\u017a\2"+
		"\2\u02f2s\3\2\2\2\u02f3\u02f6\5v<\2\u02f4\u02f6\5x=\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f4\3\2\2\2\u02f6u\3\2\2\2\u02f7\u02f8\7W\2\2\u02f8\u02f9"+
		"\5~@\2\u02f9w\3\2\2\2\u02fa\u02fb\7\u0081\2\2\u02fb\u02fc\7\u0179\2\2"+
		"\u02fc\u02fd\5z>\2\u02fd\u02fe\7\u017a\2\2\u02fey\3\2\2\2\u02ff\u0300"+
		"\5\u00eav\2\u0300{\3\2\2\2\u0301\u0302\7\u0083\2\2\u0302\u0303\7\u0179"+
		"\2\2\u0303\u0304\5\u00c8e\2\u0304\u030c\7\u017a\2\2\u0305\u0306\7\u0172"+
		"\2\2\u0306\u0307\7\u0179\2\2\u0307\u0308\5\u00c8e\2\u0308\u0309\7\u017a"+
		"\2\2\u0309\u030b\3\2\2\2\u030a\u0305\3\2\2\2\u030b\u030e\3\2\2\2\u030c"+
		"\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2"+
		"\2\2\u030f\u0311\5H%\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313"+
		"\3\2\2\2\u0312\u0314\5T+\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"}\3\2\2\2\u0315\u0316\5\u0080A\2\u0316\177\3\2\2\2\u0317\u0318\bA\1\2"+
		"\u0318\u0319\5\u009cO\2\u0319\u031a\5\u0080A\37\u031a\u034a\3\2\2\2\u031b"+
		"\u031c\5\u009eP\2\u031c\u031d\5\u0080A\31\u031d\u034a\3\2\2\2\u031e\u031f"+
		"\7O\2\2\u031f\u034a\5\u0080A\17\u0320\u034a\5\u0082B\2\u0321\u034a\5\u0084"+
		"C\2\u0322\u0323\5\u00d6l\2\u0323\u0324\7\u0183\2\2\u0324\u0326\3\2\2\2"+
		"\u0325\u0322\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328"+
		"\5\u00d8m\2\u0328\u0329\7\u0183\2\2\u0329\u032a\5\u00dan\2\u032a\u032b"+
		"\7\u0183\2\2\u032b\u0338\3\2\2\2\u032c\u032d\5\u00d8m\2\u032d\u032e\7"+
		"\u0183\2\2\u032e\u0330\3\2\2\2\u032f\u032c\3\2\2\2\u032f\u0330\3\2\2\2"+
		"\u0330\u0331\3\2\2\2\u0331\u0332\5\u00dan\2\u0332\u0333\7\u0183\2\2\u0333"+
		"\u0338\3\2\2\2\u0334\u0335\5\u00dan\2\u0335\u0336\7\u0183\2\2\u0336\u0338"+
		"\3\2\2\2\u0337\u0325\3\2\2\2\u0337\u032f\3\2\2\2\u0337\u0334\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u034a\5\u00dco\2\u033a\u033b"+
		"\5\u00caf\2\u033b\u033c\7\u019e\2\2\u033c\u034a\3\2\2\2\u033d\u034a\5"+
		"\u00a8U\2\u033e\u034a\5\u00bc_\2\u033f\u034a\5\u00be`\2\u0340\u034a\5"+
		"\u00aaV\2\u0341\u034a\5r:\2\u0342\u034a\5\u00a6T\2\u0343\u0344\7\u0179"+
		"\2\2\u0344\u0345\5\u0080A\2\u0345\u0346\7\u017a\2\2\u0346\u034a\3\2\2"+
		"\2\u0347\u034a\5\u00a2R\2\u0348\u034a\5\u00a4S\2\u0349\u0317\3\2\2\2\u0349"+
		"\u031b\3\2\2\2\u0349\u031e\3\2\2\2\u0349\u0320\3\2\2\2\u0349\u0321\3\2"+
		"\2\2\u0349\u0337\3\2\2\2\u0349\u033a\3\2\2\2\u0349\u033d\3\2\2\2\u0349"+
		"\u033e\3\2\2\2\u0349\u033f\3\2\2\2\u0349\u0340\3\2\2\2\u0349\u0341\3\2"+
		"\2\2\u0349\u0342\3\2\2\2\u0349\u0343\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u0348\3\2\2\2\u034a\u039f\3\2\2\2\u034b\u034c\f\36\2\2\u034c\u034d\7"+
		"\u0182\2\2\u034d\u039e\5\u0080A\36\u034e\u034f\f\35\2\2\u034f\u0350\t"+
		"\n\2\2\u0350\u039e\5\u0080A\36\u0351\u0352\f\34\2\2\u0352\u0353\t\13\2"+
		"\2\u0353\u039e\5\u0080A\35\u0354\u0355\f\33\2\2\u0355\u0357\7<\2\2\u0356"+
		"\u0358\7O\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u039e\5\u0080A\34\u035a\u035b\f\30\2\2\u035b\u035c\5\u009e"+
		"P\2\u035c\u035d\5\u0080A\31\u035d\u039e\3\2\2\2\u035e\u035f\f\26\2\2\u035f"+
		"\u0361\7<\2\2\u0360\u0362\7O\2\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0364\7 \2\2\u0364\u0365\7+\2\2\u0365\u039e"+
		"\5\u0080A\27\u0366\u0368\f\24\2\2\u0367\u0369\7O\2\2\u0368\u0367\3\2\2"+
		"\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\7\16\2\2\u036b"+
		"\u036c\5\u0080A\2\u036c\u036d\7\7\2\2\u036d\u036e\5\u0080A\25\u036e\u039e"+
		"\3\2\2\2\u036f\u0370\f\23\2\2\u0370\u0371\7\u00ed\2\2\u0371\u039e\5\u0080"+
		"A\24\u0372\u0373\f\21\2\2\u0373\u0374\t\f\2\2\u0374\u039e\5\u0080A\22"+
		"\u0375\u0376\f\20\2\2\u0376\u0377\t\r\2\2\u0377\u039e\5\u0080A\20\u0378"+
		"\u0379\f\16\2\2\u0379\u037a\7\7\2\2\u037a\u039e\5\u0080A\17\u037b\u037c"+
		"\f\r\2\2\u037c\u037d\7Z\2\2\u037d\u039e\5\u0080A\16\u037e\u037f\f \2\2"+
		"\u037f\u0380\7\u016d\2\2\u0380\u039e\5\u00caf\2\u0381\u0382\f\32\2\2\u0382"+
		"\u039e\t\16\2\2\u0383\u0384\f\27\2\2\u0384\u0385\7<\2\2\u0385\u0386\7"+
		"S\2\2\u0386\u0387\7\u0179\2\2\u0387\u0388\5\u00ccg\2\u0388\u0389\7\u017a"+
		"\2\2\u0389\u039e\3\2\2\2\u038a\u038c\f\25\2\2\u038b\u038d\7O\2\2\u038c"+
		"\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0392\7\64"+
		"\2\2\u038f\u0393\58\35\2\u0390\u0393\5|?\2\u0391\u0393\5\u00a4S\2\u0392"+
		"\u038f\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u039e\3\2"+
		"\2\2\u0394\u0395\f\22\2\2\u0395\u0396\5\u00c2b\2\u0396\u0399\5\u0080A"+
		"\2\u0397\u0398\7\u00b1\2\2\u0398\u039a\7\u019e\2\2\u0399\u0397\3\2\2\2"+
		"\u0399\u039a\3\2\2\2\u039a\u039e\3\2\2\2\u039b\u039c\f\3\2\2\u039c\u039e"+
		"\5\u009aN\2\u039d\u034b\3\2\2\2\u039d\u034e\3\2\2\2\u039d\u0351\3\2\2"+
		"\2\u039d\u0354\3\2\2\2\u039d\u035a\3\2\2\2\u039d\u035e\3\2\2\2\u039d\u0366"+
		"\3\2\2\2\u039d\u036f\3\2\2\2\u039d\u0372\3\2\2\2\u039d\u0375\3\2\2\2\u039d"+
		"\u0378\3\2\2\2\u039d\u037b\3\2\2\2\u039d\u037e\3\2\2\2\u039d\u0381\3\2"+
		"\2\2\u039d\u0383\3\2\2\2\u039d\u038a\3\2\2\2\u039d\u0394\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u0081\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\t\17\2\2\u03a3"+
		"\u0083\3\2\2\2\u03a4\u03ac\7\u019e\2\2\u03a5\u03ac\7\u019d\2\2\u03a6\u03ac"+
		"\7Q\2\2\u03a7\u03ac\7\35\2\2\u03a8\u03ac\7\u0195\2\2\u03a9\u03ac\5\u0086"+
		"D\2\u03aa\u03ac\5\u0094K\2\u03ab\u03a4\3\2\2\2\u03ab\u03a5\3\2\2\2\u03ab"+
		"\u03a6\3\2\2\2\u03ab\u03a7\3\2\2\2\u03ab\u03a8\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ab\u03aa\3\2\2\2\u03ac\u0085\3\2\2\2\u03ad\u03b2\5\u0090I\2\u03ae"+
		"\u03b2\5\u008eH\2\u03af\u03b2\5\u0092J\2\u03b0\u03b2\5\u0088E\2\u03b1"+
		"\u03ad\3\2\2\2\u03b1\u03ae\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3\2"+
		"\2\2\u03b2\u0087\3\2\2\2\u03b3\u03b5\7\u0149\2\2\u03b4\u03b6\5\u008cG"+
		"\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9"+
		"\7\u019e\2\2\u03b8\u03ba\5\u008aF\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3"+
		"\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\5\u008cG\2\u03bc\u03bb\3\2\2\2"+
		"\u03bc\u03bd\3\2\2\2\u03bd\u0089\3\2\2\2\u03be\u03c1\5\u0096L\2\u03bf"+
		"\u03c0\7x\2\2\u03c0\u03c2\5\u0096L\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3"+
		"\2\2\2\u03c2\u008b\3\2\2\2\u03c3\u03c4\7\u0179\2\2\u03c4\u03c5\5\u0082"+
		"B\2\u03c5\u03c6\7\u017a\2\2\u03c6\u008d\3\2\2\2\u03c7\u03c8\7\u014a\2"+
		"\2\u03c8\u03c9\7\u019e\2\2\u03c9\u008f\3\2\2\2\u03ca\u03cb\7\u014c\2\2"+
		"\u03cb\u03cc\7\u019e\2\2\u03cc\u0091\3\2\2\2\u03cd\u03ce\7\u0148\2\2\u03ce"+
		"\u03cf\7\u019e\2\2\u03cf\u0093\3\2\2\2\u03d0\u03d1\t\20\2\2\u03d1\u0095"+
		"\3\2\2\2\u03d2\u03d3\t\21\2\2\u03d3\u0097\3\2\2\2\u03d4\u03d5\t\22\2\2"+
		"\u03d5\u0099\3\2\2\2\u03d6\u03d7\7\u0099\2\2\u03d7\u03d8\5\u00dco\2\u03d8"+
		"\u009b\3\2\2\2\u03d9\u03da\t\13\2\2\u03da\u009d\3\2\2\2\u03db\u03e4\7"+
		"\u0176\2\2\u03dc\u03e4\7\u0178\2\2\u03dd\u03e4\7\u0173\2\2\u03de\u03e4"+
		"\7\u0192\2\2\u03df\u03e4\7\u0193\2\2\u03e0\u03e4\7\u0194\2\2\u03e1\u03e4"+
		"\7\u019a\2\2\u03e2\u03e4\5\u00a0Q\2\u03e3\u03db\3\2\2\2\u03e3\u03dc\3"+
		"\2\2\2\u03e3\u03dd\3\2\2\2\u03e3\u03de\3\2\2\2\u03e3\u03df\3\2\2\2\u03e3"+
		"\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u009f\3\2"+
		"\2\2\u03e5\u03e6\t\23\2\2\u03e6\u00a1\3\2\2\2\u03e7\u03e8\58\35\2\u03e8"+
		"\u00a3\3\2\2\2\u03e9\u03ea\7\u0179\2\2\u03ea\u03eb\5\u00c8e\2\u03eb\u03ec"+
		"\7\u017a\2\2\u03ec\u00a5\3\2\2\2\u03ed\u03ee\7\21\2\2\u03ee\u03f4\5\u0080"+
		"A\2\u03ef\u03f0\7\u0086\2\2\u03f0\u03f1\5\u0080A\2\u03f1\u03f2\7w\2\2"+
		"\u03f2\u03f3\5\u0080A\2\u03f3\u03f5\3\2\2\2\u03f4\u03ef\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03fa\3\2"+
		"\2\2\u03f8\u03f9\7\"\2\2\u03f9\u03fb\5\u0080A\2\u03fa\u03f8\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\7#\2\2\u03fd\u040f\3\2"+
		"\2\2\u03fe\u0404\7\21\2\2\u03ff\u0400\7\u0086\2\2\u0400\u0401\5\u0080"+
		"A\2\u0401\u0402\7w\2\2\u0402\u0403\5\u0080A\2\u0403\u0405\3\2\2\2\u0404"+
		"\u03ff\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u040a\3\2\2\2\u0408\u0409\7\"\2\2\u0409\u040b\5\u0080A\2\u040a"+
		"\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7#"+
		"\2\2\u040d\u040f\3\2\2\2\u040e\u03ed\3\2\2\2\u040e\u03fe\3\2\2\2\u040f"+
		"\u00a7\3\2\2\2\u0410\u0411\7\22\2\2\u0411\u0412\7\u0179\2\2\u0412\u0413"+
		"\5\u0080A\2\u0413\u0414\7\t\2\2\u0414\u0415\5\u00caf\2\u0415\u0416\7\u017a"+
		"\2\2\u0416\u00a9\3\2\2\2\u0417\u041c\5\u00acW\2\u0418\u041c\5\u00aeX\2"+
		"\u0419\u041c\5\u00b4[\2\u041a\u041c\5\u00b6\\\2\u041b\u0417\3\2\2\2\u041b"+
		"\u0418\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u00ab\3\2"+
		"\2\2\u041d\u041e\7\u00f4\2\2\u041e\u041f\7\u0179\2\2\u041f\u0420\5\u0080"+
		"A\2\u0420\u0421\7\64\2\2\u0421\u0422\5\u0080A\2\u0422\u0423\7\u017a\2"+
		"\2\u0423\u00ad\3\2\2\2\u0424\u0425\7\u00b7\2\2\u0425\u0426\7\u0179\2\2"+
		"\u0426\u0427\5\u00b0Y\2\u0427\u0428\7+\2\2\u0428\u0429\5\u0080A\2\u0429"+
		"\u042a\7\u017a\2\2\u042a\u00af\3\2\2\2\u042b\u042f\5\u0096L\2\u042c\u042f"+
		"\5\u00b2Z\2\u042d\u042f\5\u0098M\2\u042e\u042b\3\2\2\2\u042e\u042c\3\2"+
		"\2\2\u042e\u042d\3\2\2\2\u042f\u00b1\3\2\2\2\u0430\u0431\t\24\2\2\u0431"+
		"\u00b3\3\2\2\2\u0432\u0433\7\u0112\2\2\u0433\u0434\7\u0179\2\2\u0434\u0437"+
		"\5\u0080A\2\u0435\u0436\7+\2\2\u0436\u0438\5\u0080A\2\u0437\u0435\3\2"+
		"\2\2\u0437\u0438\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u043a\7*\2\2\u043a"+
		"\u043c\5\u0080A\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d"+
		"\3\2\2\2\u043d\u043e\7\u017a\2\2\u043e\u00b5\3\2\2\2\u043f\u0440\7\u011d"+
		"\2\2\u0440\u0441\7\u0179\2\2\u0441\u0442\5\u00b8]\2\u0442\u0443\7\u017a"+
		"\2\2\u0443\u00b7\3\2\2\2\u0444\u0446\5\u00ba^\2\u0445\u0444\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0449\5\u0080A\2\u0448\u0447"+
		"\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\7+\2\2\u044b"+
		"\u0445\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0450\5\u0080"+
		"A\2\u044e\u044f\7\u0172\2\2\u044f\u0451\5\u0080A\2\u0450\u044e\3\2\2\2"+
		"\u0450\u0451\3\2\2\2\u0451\u00b9\3\2\2\2\u0452\u0453\t\25\2\2\u0453\u00bb"+
		"\3\2\2\2\u0454\u045b\7\u0090\2\2\u0455\u045c\5\u00a2R\2\u0456\u0458\7"+
		"\u017b\2\2\u0457\u0459\5\u00c8e\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2"+
		"\2\2\u0459\u045a\3\2\2\2\u045a\u045c\7\u017c\2\2\u045b\u0455\3\2\2\2\u045b"+
		"\u0456\3\2\2\2\u045c\u00bd\3\2\2\2\u045d\u045e\7h\2\2\u045e\u0460\7\u0179"+
		"\2\2\u045f\u0461\5\u00c8e\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u0463\7\u017a\2\2\u0463\u00bf\3\2\2\2\u0464\u0466"+
		"\7O\2\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0468\7&\2\2\u0468\u0469\5\u00a2R\2\u0469\u00c1\3\2\2\2\u046a\u046c\7"+
		"O\2\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d"+
		"\u0470\5\u00c4c\2\u046e\u0470\5\u00c6d\2\u046f\u046b\3\2\2\2\u046f\u046e"+
		"\3\2\2\2\u0470\u00c3\3\2\2\2\u0471\u0478\7B\2\2\u0472\u0478\7\62\2\2\u0473"+
		"\u0478\7\u00fe\2\2\u0474\u0478\7\u0105\2\2\u0475\u0476\7\u010c\2\2\u0476"+
		"\u0478\7x\2\2\u0477\u0471\3\2\2\2\u0477\u0472\3\2\2\2\u0477\u0473\3\2"+
		"\2\2\u0477\u0474\3\2\2\2\u0477\u0475\3\2\2\2\u0478\u00c5\3\2\2\2\u0479"+
		"\u047a\t\26\2\2\u047a\u00c7\3\2\2\2\u047b\u0480\5\u0080A\2\u047c\u047d"+
		"\7\u0172\2\2\u047d\u047f\5\u0080A\2\u047e\u047c\3\2\2\2\u047f\u0482\3"+
		"\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u00c9\3\2\2\2\u0482"+
		"\u0480\3\2\2\2\u0483\u0484\5\u00f4{\2\u0484\u00cb\3\2\2\2\u0485\u048a"+
		"\5\u00caf\2\u0486\u0487\7\u0172\2\2\u0487\u0489\5\u00caf\2\u0488\u0486"+
		"\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u00cd\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u0490\5\u00d0i\2\u048e\u0490"+
		"\5\u00f4{\2\u048f\u048d\3\2\2\2\u048f\u048e\3\2\2\2\u0490\u00cf\3\2\2"+
		"\2\u0491\u0492\t\27\2\2\u0492\u00d1\3\2\2\2\u0493\u0498\5\u00d4k\2\u0494"+
		"\u0495\7\u0172\2\2\u0495\u0497\5\u00d4k\2\u0496\u0494\3\2\2\2\u0497\u049a"+
		"\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049d\3\2\2\2\u049a"+
		"\u0498\3\2\2\2\u049b\u049d\7\u017f\2\2\u049c\u0493\3\2\2\2\u049c\u049b"+
		"\3\2\2\2\u049d\u00d3\3\2\2\2\u049e\u04a0\7\u0125\2\2\u049f\u049e\3\2\2"+
		"\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a7\5\u0080A\2\u04a2"+
		"\u04a3\5\u00f6|\2\u04a3\u04a4\7\u016e\2\2\u04a4\u04a5\5\u0080A\2\u04a5"+
		"\u04a7\3\2\2\2\u04a6\u049f\3\2\2\2\u04a6\u04a2\3\2\2\2\u04a7\u00d5\3\2"+
		"\2\2\u04a8\u04a9\5\u00f4{\2\u04a9\u00d7\3\2\2\2\u04aa\u04ab\5\u00f4{\2"+
		"\u04ab\u00d9\3\2\2\2\u04ac\u04ad\5\u00f4{\2\u04ad\u00db\3\2\2\2\u04ae"+
		"\u04af\5\u00f4{\2\u04af\u00dd\3\2\2\2\u04b0\u04b1\5\u00f4{\2\u04b1\u00df"+
		"\3\2\2\2\u04b2\u04b3\5\u00f4{\2\u04b3\u00e1\3\2\2\2\u04b4\u04b6\5\u00e0"+
		"q\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04ba\3\2\2\2\u04b7"+
		"\u04b8\7\u00f1\2\2\u04b8\u04b9\7\20\2\2\u04b9\u04bb\5\u00c8e\2\u04ba\u04b7"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04be\5H%\2\u04bd"+
		"\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04c1\5\u00e4"+
		"s\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u00e3\3\2\2\2\u04c2"+
		"\u04c4\t\30\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04cb\3"+
		"\2\2\2\u04c5\u04cc\5\u00e6t\2\u04c6\u04c7\7\16\2\2\u04c7\u04c8\5\u00e6"+
		"t\2\u04c8\u04c9\7#\2\2\u04c9\u04ca\5\u00e6t\2\u04ca\u04cc\3\2\2\2\u04cb"+
		"\u04c5\3\2\2\2\u04cb\u04c6\3\2\2\2\u04cc\u00e5\3\2\2\2\u04cd\u04ce\7\u011f"+
		"\2\2\u04ce\u04da\7\u00f5\2\2\u04cf\u04d0\7\34\2\2\u04d0\u04da\7h\2\2\u04d1"+
		"\u04d2\7\u011f\2\2\u04d2\u04da\7\u00ba\2\2\u04d3\u04d4\5\u0080A\2\u04d4"+
		"\u04d5\7\u00f5\2\2\u04d5\u04da\3\2\2\2\u04d6\u04d7\5\u0080A\2\u04d7\u04d8"+
		"\7\u00ba\2\2\u04d8\u04da\3\2\2\2\u04d9\u04cd\3\2\2\2\u04d9\u04cf\3\2\2"+
		"\2\u04d9\u04d1\3\2\2\2\u04d9\u04d3\3\2\2\2\u04d9\u04d6\3\2\2\2\u04da\u00e7"+
		"\3\2\2\2\u04db\u04e0\5\u00dan\2\u04dc\u04dd\7\u0172\2\2\u04dd\u04df\5"+
		"\u00dan\2\u04de\u04dc\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2"+
		"\u04e0\u04e1\3\2\2\2\u04e1\u00e9\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e8"+
		"\5\u00dco\2\u04e4\u04e5\7\u0172\2\2\u04e5\u04e7\5\u00dco\2\u04e6\u04e4"+
		"\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u00eb\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04ec\5\u00dco\2\u04ec\u04ed"+
		"\5\u00caf\2\u04ed\u00ed\3\2\2\2\u04ee\u04f3\5\u00ecw\2\u04ef\u04f0\7\u0172"+
		"\2\2\u04f0\u04f2\5\u00ecw\2\u04f1\u04ef\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3"+
		"\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u00ef\3\2\2\2\u04f5\u04f3\3\2"+
		"\2\2\u04f6\u04f7\5\u00f4{\2\u04f7\u00f1\3\2\2\2\u04f8\u04f9\5\u00f4{\2"+
		"\u04f9\u00f3\3\2\2\2\u04fa\u04fb\5\u00f6|\2\u04fb\u00f5\3\2\2\2\u04fc"+
		"\u04ff\t\31\2\2\u04fd\u04ff\5\u00f8}\2\u04fe\u04fc\3\2\2\2\u04fe\u04fd"+
		"\3\2\2\2\u04ff\u00f7\3\2\2\2\u0500\u0501\t\32\2\2\u0501\u00f9\3\2\2\2"+
		"\u0094\u00ff\u0104\u010e\u0111\u0114\u0117\u011a\u0121\u0124\u0127\u012d"+
		"\u0130\u0133\u013b\u0146\u0149\u0151\u015e\u0166\u0173\u017f\u0189\u018d"+
		"\u0198\u019d\u01a0\u01a4\u01a8\u01ab\u01ae\u01b1\u01b4\u01b7\u01bb\u01c4"+
		"\u01c6\u01cd\u01d2\u01d6\u01d9\u01de\u01e8\u01eb\u01f0\u01f4\u01f7\u01fd"+
		"\u0204\u020d\u0215\u0219\u0225\u023a\u024a\u024f\u0252\u0258\u0262\u0267"+
		"\u026c\u0279\u027d\u0287\u028a\u028f\u0294\u0298\u029b\u02a0\u02a8\u02b4"+
		"\u02b7\u02bc\u02be\u02c0\u02c6\u02c8\u02cd\u02d4\u02d9\u02dd\u02e4\u02e9"+
		"\u02ec\u02ef\u02f5\u030c\u0310\u0313\u0325\u032f\u0337\u0349\u0357\u0361"+
		"\u0368\u038c\u0392\u0399\u039d\u039f\u03ab\u03b1\u03b5\u03b9\u03bc\u03c1"+
		"\u03e3\u03f6\u03fa\u0406\u040a\u040e\u041b\u042e\u0437\u043b\u0445\u0448"+
		"\u044b\u0450\u0458\u045b\u0460\u0465\u046b\u046f\u0477\u0480\u048a\u048f"+
		"\u0498\u049c\u049f\u04a6\u04b5\u04ba\u04bd\u04c0\u04c3\u04cb\u04d9\u04e0"+
		"\u04e8\u04f3\u04fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}