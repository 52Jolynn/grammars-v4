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
		ROW=102, PRECISION=243, ILIKE=48, EXCEPT=34, BYTEA=337, VARBIT=304, DISTANCE=398, 
		CREATE=24, STRING_LITERAL=411, UNLOGGED=286, TIMEZONE_MINUTE=280, OFF=82, 
		VARIADIC=290, PRECEDING=242, TIMESTAMPTZ=330, REGEXP=251, ANALYZE=141, 
		GEQ=373, NOCOMPRESS=75, XMLDATA=361, DIVIDE=381, GROUPING=191, ASC=8, 
		PRESERVE=244, TRANSACTION=281, REFRESH=250, TEMP=276, MATERIALIZED=214, 
		INTERSECT2D=389, INT=311, SEMI_COLON=366, RLIKE=258, FILE=39, LEADING=61, 
		RESTRICT=256, MILLISECONDS=219, GROUP=44, INTERSECT=56, FETCH=38, USER=126, 
		INTERSECT3D=390, CONSTRAINT=155, TIMEZONE_HOUR=279, MODIFY=72, ALTER=4, 
		FORCE=185, NCHAR=323, TABLE=116, VARCHAR=322, SUB=379, MICROSECONDS=217, 
		FLOAT=317, NOTNULL=76, SUM=272, WHITE_SPACE=413, NOWAIT=78, AT=143, STORAGE=269, 
		AS=7, RIGHT_PAREN=375, GEOMETRY=341, MAXVALUE=216, COMPRESS=22, AVG=144, 
		LEFT=62, TRUNCATE=121, ZONE=300, BOX3D=340, PLUS=378, MODE=71, LIKE=64, 
		COLLATE=151, OUTER=90, BY=14, DEFERRABLE=170, WHENEVER=133, BOX2D=339, 
		VARCHAR2=130, INHERIT=198, RIGHT=100, HAVING=45, SESSION=106, MINUS=69, 
		CONCATENATION_OPERATOR=368, COLON=365, ROWS=103, FORMAT=187, NATURAL=73, 
		LONG=67, PUBLIC=94, UNSECURED=287, WEEK=295, OBJECT_ID=350, INT8=308, 
		CHAR=321, DAY=164, COUNT=159, RELEASE=253, INT2=306, INT1=305, INT4=307, 
		EXPLAIN=37, EXTENDED=179, QUOTE=386, MODULAR=382, QUARTER=246, THAN=277, 
		ESCAPE=175, CONNECT=23, INHERITS=199, INTERSECTION=202, RETURNING=257, 
		LESS=208, DOUBLE=318, ROWNUM=354, COMMENT=20, SELECT=105, INTO=57, ARRAY=142, 
		DUAL=348, NO_INHERIT=228, COALESCE=153, SECOND=262, EPOCH=174, NULL=79, 
		WITHOUT=298, NO=227, EVERY=176, ON=85, MATCH=213, DELETE=28, NUMERIC=319, 
		INET4=338, OF=81, TABLES=273, UNDERLINE=385, VERSIONS_OPERATION=357, DISCARD=171, 
		CUBE=160, NATIONAL=225, OR=88, FILTER=182, CURRVAL=347, COLLECT=152, FALSE=136, 
		UNBOUNDED=284, CURSOR=161, PCTFREE=91, TIMESTAMP=329, RIGHT_SQUARE=377, 
		DEC=165, CONSTRAINTS=156, WHERE=134, NULLIF=230, VAR_SAMP=291, FORWARD=188, 
		YEAR=299, LIMIT=65, MAX=215, DEFERRED=169, FLOAT4=314, CUSTOME_OPERATOR=407, 
		FLOAT8=315, SPACE=412, RESOURCE=98, CROSS=25, USAGE=288, IF=47, RAW=95, 
		GEOMETRY_DUMP=342, BOOLEAN=301, IN=50, MULTIPLY=380, REFERENCES=249, COMMA=367, 
		IS=58, PARTITION=238, SOME=110, EQUAL=364, NEXT=226, CENTURY=148, EXCLUDE=177, 
		WITH=135, INITIALLY=200, REINDEX=96, FUSION=189, GRANT=43, VARBINARY=335, 
		DEFAULT=27, BACKWARD=145, MILLENNIUM=218, SUBSTRING=271, INCREMENT=51, 
		LEFT_OF=392, ASSIGN=363, IMMEDIATE=49, CLUSTER=18, WINDOW=296, GLOBAL=190, 
		MINUTE=222, LEFT_SQUARE=376, INCLUDING=196, LEQ=371, ISODOW=203, OVERWRITE=235, 
		ONLINE=86, VERSIONS_ENDTIME=356, REGEX=410, NOT=77, FOREIGN=186, CACHE=146, 
		PRIVILEGES=93, CHARACTER=149, ACTION=140, MONTH=223, TYPE=283, STDDEV_POP=267, 
		USING=127, NOT_EQUAL=369, BEGIN=11, VALID=289, CAST_OPERATOR=362, UID=122, 
		TSQUERY=333, STDDEV_SAMP=268, BLOB=336, VERSIONS_XID=360, SUBPARTITION=270, 
		KEY=205, INITIAL=53, ELSE=32, NUMBER=80, BOOL=302, TRAILING=119, RECURSIVE=248, 
		ROLLBACK=101, TABLESPACE=274, REAL=316, MAXEXTENTS=68, SEQUENCES=264, 
		LEVEL=63, INSENSITIVE=201, NONE=229, TRIM=282, NOT_SIMILAR_INSENSITIVE=401, 
		WITHIN=297, LOCATION=211, LEFT_PAREN=374, CONNECT_BY_ISLEAF=346, GEOGRAPHY=343, 
		END=33, SIZE=109, RENAME=97, OPTION=87, IDENTITY=195, ISOYEAR=204, AUDIT=10, 
		PLAIN=240, ONLY=233, ISNULL=59, ASYMMETRIC=9, OWNED=236, POSITION=241, 
		TIME=327, BIND_PARAMETER=402, THEN=117, TSVECTOR=332, OFFSET=84, REPLACE=254, 
		COLUMN=19, ACCESS=1, OBJECT_VALUE=351, EXISTS=36, NVARCHAR=324, ADD=2, 
		INTEGER=312, BOX_EQUAL=397, TO=118, OVERLAPS=234, SUCCESSFUL=112, SET=107, 
		RELATIVE=252, MIN=220, TEXT=331, HOUR=194, UNION=123, CURRENT=26, NULLS=231, 
		COMMIT=21, SCHEMA=260, CLOSE=150, DECIMAL=320, DROP=31, VERSIONS_STARTSCN=358, 
		BIGINT=313, WHEN=132, MOVE=224, VALIDATE=128, CONCURRENTLY=154, DECLARE=167, 
		START=111, QUOTED_IDENTIFIER=409, BIT=303, REVOKE=99, BETWEEN=12, FIRST=183, 
		PRIOR=92, CAST=16, EXTERNAL=180, ORA_ROWSCN=352, DOUBLE_QUOTE=387, VARYING=293, 
		TRIGGER=120, CASE=15, CASCADE=147, VERBOSE=294, FULL=42, INSERT=55, CARET=383, 
		SAVEPOINT=104, ROWID=353, BOTH=13, TINYINT=309, BLOCK_COMMENT=405, REAL_NUM=404, 
		SYMMETRIC=113, SHARE=108, OFFLINE=83, LAST=206, ABORT=138, SYNONYM=114, 
		UNIQUE=124, VIEW=131, LINE_COMMENT=406, OVERLAPS_ABOVE=395, ROLLUP=259, 
		RESTART=255, ABOVE=394, PRIMARY=245, RIGHT_OF=393, LOCAL=210, EXCLUDING=178, 
		LIST=209, SEQUENCE=263, COSTS=158, VAR_POP=292, NOT_SIMILAR=399, CHECK=17, 
		FROM=41, DISTINCT=30, TEMPORARY=275, SIMPLE=266, MAIN=212, TIMETZ=328, 
		INNER=54, ORDER=89, TIMEZONE=278, DECADE=166, CYCLE=162, GTH=372, UPDATE=125, 
		FOR=40, COLUMN_VALUE=344, HOLD=193, EXCLUSIVE=35, FOLLOWING=184, AND=5, 
		IDENTIFIED=46, SCROLL=261, INTERVAL=326, LOCK=66, OVERLAP=391, INDEX=52, 
		OIDS=232, MLSLABEL=70, MINVALUE=221, UNKNOWN=285, CONTINUE=157, SYSDATE=115, 
		IDENTIFIER=408, PARTITIONS=239, ALL=3, TILDE=388, EXTRACT=181, DOT=384, 
		DOW=172, PARTIAL=237, NOAUDIT=74, DOY=173, LATERAL=207, VERSIONS_STARTTIME=359, 
		VALUES=129, HASH=192, INDEXES=197, RANGE=247, BELOW=396, TRUE=137, JOIN=60, 
		SIMILAR=265, NUM=403, DEFAULTS=168, LTH=370, ANY=6, NEXTVAL=349, CONNECT_BY_ISCYCLE=345, 
		SIMILAR_INSENSITIVE=400, DESC=29, BINARY=334, DATE=325, VERSIONS_ENDSCN=355, 
		ABSOLUTE=139, DATA=163, SMALLINT=310;
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
		"OVERLAPS", "OVERWRITE", "OWNED", "PARTIAL", "PARTITION", "PARTITIONS", 
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
		RULE_update_stmt = 4, RULE_delete_stmt = 5, RULE_insert_stmt = 6, RULE_query_expression = 7, 
		RULE_query_specification = 8, RULE_query_rel = 9, RULE_set_qualifier = 10, 
		RULE_select_list = 11, RULE_select_sublist = 12, RULE_derived_column = 13, 
		RULE_qualified_asterisk = 14, RULE_as_clause = 15, RULE_into_expression = 16, 
		RULE_with_query = 17, RULE_with_query_name = 18, RULE_table_stmt = 19, 
		RULE_subquery = 20, RULE_from_clause = 21, RULE_where_clause = 22, RULE_group_clause = 23, 
		RULE_having_clause = 24, RULE_window_clause = 25, RULE_window_specifier_list = 26, 
		RULE_window_specifier = 27, RULE_order_clause = 28, RULE_sort_specifier_list = 29, 
		RULE_sort_specifier = 30, RULE_order_specification = 31, RULE_operators = 32, 
		RULE_null_ordering = 33, RULE_limit_clause = 34, RULE_offset_clause = 35, 
		RULE_fetch_clause = 36, RULE_for_clause = 37, RULE_count = 38, RULE_start = 39, 
		RULE_table_reference = 40, RULE_simple_table = 41, RULE_joined_table = 42, 
		RULE_join_type = 43, RULE_outer_join_type = 44, RULE_correlation_specification = 45, 
		RULE_derived_column_list = 46, RULE_derived_table = 47, RULE_table_subquery = 48, 
		RULE_function = 49, RULE_join_specification = 50, RULE_join_condition = 51, 
		RULE_named_columns_join = 52, RULE_join_column_list = 53, RULE_values_stmt = 54, 
		RULE_search_condition = 55, RULE_expr = 56, RULE_unsigned_numeric_literal = 57, 
		RULE_string_literal = 58, RULE_datetime_literal = 59, RULE_interval_literal = 60, 
		RULE_interval_qualifier = 61, RULE_interval_precision = 62, RULE_time_literal = 63, 
		RULE_timestamp_literal = 64, RULE_date_literal = 65, RULE_boolean_literal = 66, 
		RULE_primary_datetime_field = 67, RULE_extended_datetime_field = 68, RULE_collate_expression = 69, 
		RULE_unary_operator = 70, RULE_any_other_operator = 71, RULE_postgis_operator = 72, 
		RULE_scalar_subquery = 73, RULE_tuple_value = 74, RULE_case_when = 75, 
		RULE_cast_expr = 76, RULE_array_constructor = 77, RULE_row_constructor = 78, 
		RULE_exists_predicate = 79, RULE_pattern_matcher = 80, RULE_negativable_matcher = 81, 
		RULE_regex_matcher = 82, RULE_expr_list = 83, RULE_datatype = 84, RULE_datatype_list = 85, 
		RULE_function_name = 86, RULE_function_reserved_name = 87, RULE_function_args = 88, 
		RULE_function_arg = 89, RULE_database_name = 90, RULE_schema_name = 91, 
		RULE_table_name = 92, RULE_column_name = 93, RULE_window_name = 94, RULE_exists_window_name = 95, 
		RULE_window_definition = 96, RULE_frame_clause = 97, RULE_frame = 98, 
		RULE_table_name_list = 99, RULE_column_name_list = 100, RULE_column_definition = 101, 
		RULE_column_definition_list = 102, RULE_correlation_name = 103, RULE_column_alias = 104, 
		RULE_any_name = 105, RULE_identifier = 106, RULE_nonreserved_keywords = 107;
	public static final String[] ruleNames = {
		"sql", "statement", "dml", "select_stmt", "update_stmt", "delete_stmt", 
		"insert_stmt", "query_expression", "query_specification", "query_rel", 
		"set_qualifier", "select_list", "select_sublist", "derived_column", "qualified_asterisk", 
		"as_clause", "into_expression", "with_query", "with_query_name", "table_stmt", 
		"subquery", "from_clause", "where_clause", "group_clause", "having_clause", 
		"window_clause", "window_specifier_list", "window_specifier", "order_clause", 
		"sort_specifier_list", "sort_specifier", "order_specification", "operators", 
		"null_ordering", "limit_clause", "offset_clause", "fetch_clause", "for_clause", 
		"count", "start", "table_reference", "simple_table", "joined_table", "join_type", 
		"outer_join_type", "correlation_specification", "derived_column_list", 
		"derived_table", "table_subquery", "function", "join_specification", "join_condition", 
		"named_columns_join", "join_column_list", "values_stmt", "search_condition", 
		"expr", "unsigned_numeric_literal", "string_literal", "datetime_literal", 
		"interval_literal", "interval_qualifier", "interval_precision", "time_literal", 
		"timestamp_literal", "date_literal", "boolean_literal", "primary_datetime_field", 
		"extended_datetime_field", "collate_expression", "unary_operator", "any_other_operator", 
		"postgis_operator", "scalar_subquery", "tuple_value", "case_when", "cast_expr", 
		"array_constructor", "row_constructor", "exists_predicate", "pattern_matcher", 
		"negativable_matcher", "regex_matcher", "expr_list", "datatype", "datatype_list", 
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
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216); statement();
					setState(217); match(SEMI_COLON);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(224); statement();
			setState(226);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(225); match(SEMI_COLON);
				}
			}

			setState(228); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(230); dml();
			}
		}
		catch (RecognitionException re) {
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
			setState(232); select_stmt();
			}
		}
		catch (RecognitionException re) {
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
			setState(234); query_expression();
			setState(236);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(235); order_clause();
				}
			}

			setState(239);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(238); limit_clause();
				}
			}

			setState(242);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(241); offset_clause();
				}
			}

			setState(245);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(244); fetch_clause();
				}
			}

			setState(248);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(247); for_clause();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(UPDATE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DELETE() { return getToken(IdbParser.DELETE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(DELETE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INTO() { return getToken(IdbParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(IdbParser.INSERT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(INSERT);
			setState(255); match(INTO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 14, RULE_query_expression);
		try {
			int _alt;
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); query_specification();
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258); query_rel();
						setState(259); query_specification();
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); query_specification();
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267); query_rel();
						setState(268); query_expression();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); match(LEFT_PAREN);
				setState(276); select_stmt();
				setState(277); match(RIGHT_PAREN);
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278); query_rel();
						setState(279); query_expression();
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286); table_stmt();
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
		enterRule(_localctx, 16, RULE_query_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(289); with_query();
				}
			}

			setState(292); match(SELECT);
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(293); set_qualifier();
				}
				break;
			}
			setState(296); select_list();
			setState(298);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(297); into_expression();
				}
			}

			setState(301);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(300); from_clause();
				}
			}

			setState(304);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(303); where_clause();
				}
			}

			setState(307);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(306); group_clause();
				}
			}

			setState(310);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(309); having_clause();
				}
			}

			setState(313);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(312); window_clause();
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
		enterRule(_localctx, 18, RULE_query_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(317);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(316);
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
		enterRule(_localctx, 20, RULE_set_qualifier);
		int _la;
		try {
			setState(328);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(320); match(DISTINCT);
				setState(326);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(321); match(ON);
					setState(322); match(LEFT_PAREN);
					setState(323); expr_list();
					setState(324); match(RIGHT_PAREN);
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
		enterRule(_localctx, 22, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); select_sublist();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(331); match(COMMA);
				setState(332); select_sublist();
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
		enterRule(_localctx, 24, RULE_select_sublist);
		try {
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); qualified_asterisk();
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
		enterRule(_localctx, 26, RULE_derived_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); expr(0);
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(343); as_clause();
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
		enterRule(_localctx, 28, RULE_qualified_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ABORT - 138)) | (1L << (ABSOLUTE - 138)) | (1L << (ACTION - 138)) | (1L << (ANALYZE - 138)) | (1L << (ARRAY - 138)) | (1L << (AT - 138)) | (1L << (AVG - 138)) | (1L << (BACKWARD - 138)) | (1L << (CACHE - 138)) | (1L << (CASCADE - 138)) | (1L << (CENTURY - 138)) | (1L << (CHARACTER - 138)) | (1L << (CLOSE - 138)) | (1L << (COLLATE - 138)) | (1L << (COLLECT - 138)) | (1L << (COALESCE - 138)) | (1L << (CONCURRENTLY - 138)) | (1L << (CONSTRAINT - 138)) | (1L << (CONSTRAINTS - 138)) | (1L << (CONTINUE - 138)) | (1L << (COSTS - 138)) | (1L << (COUNT - 138)) | (1L << (CUBE - 138)) | (1L << (CURSOR - 138)) | (1L << (CYCLE - 138)) | (1L << (DATA - 138)) | (1L << (DAY - 138)) | (1L << (DEC - 138)) | (1L << (DECADE - 138)) | (1L << (DECLARE - 138)) | (1L << (DEFAULTS - 138)) | (1L << (DEFERRED - 138)) | (1L << (DEFERRABLE - 138)) | (1L << (DISCARD - 138)) | (1L << (DOW - 138)) | (1L << (DOY - 138)) | (1L << (EPOCH - 138)) | (1L << (ESCAPE - 138)) | (1L << (EVERY - 138)) | (1L << (EXCLUDE - 138)) | (1L << (EXCLUDING - 138)) | (1L << (EXTENDED - 138)) | (1L << (EXTERNAL - 138)) | (1L << (EXTRACT - 138)) | (1L << (FILTER - 138)) | (1L << (FIRST - 138)) | (1L << (FOLLOWING - 138)) | (1L << (FORCE - 138)) | (1L << (FOREIGN - 138)) | (1L << (FORMAT - 138)) | (1L << (FORWARD - 138)) | (1L << (FUSION - 138)) | (1L << (GLOBAL - 138)) | (1L << (GROUPING - 138)) | (1L << (HASH - 138)) | (1L << (HOLD - 138)) | (1L << (HOUR - 138)) | (1L << (IDENTITY - 138)) | (1L << (INCLUDING - 138)) | (1L << (INDEXES - 138)) | (1L << (INHERIT - 138)) | (1L << (INHERITS - 138)) | (1L << (INITIALLY - 138)) | (1L << (INSENSITIVE - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (INTERSECTION - 202)) | (1L << (ISODOW - 202)) | (1L << (ISOYEAR - 202)) | (1L << (KEY - 202)) | (1L << (LAST - 202)) | (1L << (LATERAL - 202)) | (1L << (LESS - 202)) | (1L << (LIST - 202)) | (1L << (LOCAL - 202)) | (1L << (LOCATION - 202)) | (1L << (MAIN - 202)) | (1L << (MATCH - 202)) | (1L << (MATERIALIZED - 202)) | (1L << (MAX - 202)) | (1L << (MAXVALUE - 202)) | (1L << (MICROSECONDS - 202)) | (1L << (MILLENNIUM - 202)) | (1L << (MILLISECONDS - 202)) | (1L << (MIN - 202)) | (1L << (MINVALUE - 202)) | (1L << (MINUTE - 202)) | (1L << (MONTH - 202)) | (1L << (MOVE - 202)) | (1L << (NATIONAL - 202)) | (1L << (NEXT - 202)) | (1L << (NO - 202)) | (1L << (NO_INHERIT - 202)) | (1L << (NONE - 202)) | (1L << (NULLIF - 202)) | (1L << (NULLS - 202)) | (1L << (OIDS - 202)) | (1L << (ONLY - 202)) | (1L << (OVERWRITE - 202)) | (1L << (OWNED - 202)) | (1L << (PARTIAL - 202)) | (1L << (PARTITION - 202)) | (1L << (PARTITIONS - 202)) | (1L << (PLAIN - 202)) | (1L << (POSITION - 202)) | (1L << (PRECEDING - 202)) | (1L << (PRECISION - 202)) | (1L << (PRESERVE - 202)) | (1L << (PRIMARY - 202)) | (1L << (QUARTER - 202)) | (1L << (RANGE - 202)) | (1L << (RECURSIVE - 202)) | (1L << (REFERENCES - 202)) | (1L << (REFRESH - 202)) | (1L << (REGEXP - 202)) | (1L << (RELATIVE - 202)) | (1L << (RELEASE - 202)) | (1L << (REPLACE - 202)) | (1L << (RESTART - 202)) | (1L << (RESTRICT - 202)) | (1L << (RETURNING - 202)) | (1L << (RLIKE - 202)) | (1L << (ROLLUP - 202)) | (1L << (SCHEMA - 202)) | (1L << (SCROLL - 202)) | (1L << (SECOND - 202)) | (1L << (SEQUENCE - 202)) | (1L << (SEQUENCES - 202)) | (1L << (SIMILAR - 202)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (SIMPLE - 266)) | (1L << (STDDEV_POP - 266)) | (1L << (STDDEV_SAMP - 266)) | (1L << (STORAGE - 266)) | (1L << (SUBPARTITION - 266)) | (1L << (SUBSTRING - 266)) | (1L << (SUM - 266)) | (1L << (TABLES - 266)) | (1L << (TABLESPACE - 266)) | (1L << (TEMPORARY - 266)) | (1L << (TEMP - 266)) | (1L << (THAN - 266)) | (1L << (TIMEZONE - 266)) | (1L << (TIMEZONE_HOUR - 266)) | (1L << (TIMEZONE_MINUTE - 266)) | (1L << (TRANSACTION - 266)) | (1L << (TRIM - 266)) | (1L << (TYPE - 266)) | (1L << (UNBOUNDED - 266)) | (1L << (UNKNOWN - 266)) | (1L << (UNLOGGED - 266)) | (1L << (UNSECURED - 266)) | (1L << (USAGE - 266)) | (1L << (VALID - 266)) | (1L << (VARIADIC - 266)) | (1L << (VAR_SAMP - 266)) | (1L << (VAR_POP - 266)) | (1L << (VARYING - 266)) | (1L << (VERBOSE - 266)) | (1L << (WEEK - 266)) | (1L << (WINDOW - 266)) | (1L << (WITHIN - 266)) | (1L << (WITHOUT - 266)) | (1L << (YEAR - 266)) | (1L << (ZONE - 266)) | (1L << (BOOLEAN - 266)) | (1L << (BOOL - 266)) | (1L << (BIT - 266)) | (1L << (VARBIT - 266)) | (1L << (INT1 - 266)) | (1L << (INT2 - 266)) | (1L << (INT4 - 266)) | (1L << (INT8 - 266)) | (1L << (TINYINT - 266)) | (1L << (SMALLINT - 266)) | (1L << (INT - 266)) | (1L << (INTEGER - 266)) | (1L << (BIGINT - 266)) | (1L << (FLOAT4 - 266)) | (1L << (FLOAT8 - 266)) | (1L << (REAL - 266)) | (1L << (FLOAT - 266)) | (1L << (DOUBLE - 266)) | (1L << (NUMERIC - 266)) | (1L << (DECIMAL - 266)) | (1L << (CHAR - 266)) | (1L << (VARCHAR - 266)) | (1L << (NCHAR - 266)) | (1L << (NVARCHAR - 266)) | (1L << (DATE - 266)) | (1L << (INTERVAL - 266)) | (1L << (TIME - 266)) | (1L << (TIMETZ - 266)) | (1L << (TIMESTAMP - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (TIMESTAMPTZ - 330)) | (1L << (TEXT - 330)) | (1L << (TSVECTOR - 330)) | (1L << (TSQUERY - 330)) | (1L << (BINARY - 330)) | (1L << (VARBINARY - 330)) | (1L << (BLOB - 330)) | (1L << (BYTEA - 330)) | (1L << (INET4 - 330)) | (1L << (BOX2D - 330)) | (1L << (BOX3D - 330)) | (1L << (GEOMETRY - 330)) | (1L << (GEOMETRY_DUMP - 330)) | (1L << (GEOGRAPHY - 330)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(346); table_name();
				setState(347); match(DOT);
				}
			}

			setState(351); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_as_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(353); match(AS);
				}
			}

			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(356); column_alias();
				}
				break;
			case 2:
				{
				setState(357); boolean_literal();
				}
				break;
			case 3:
				{
				setState(358); match(NULL);
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
		enterRule(_localctx, 32, RULE_into_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(INTO);
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(362);
				_la = _input.LA(1);
				if ( !(((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & ((1L << (TEMPORARY - 275)) | (1L << (TEMP - 275)) | (1L << (UNLOGGED - 275)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(366);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(365); match(TABLE);
				}
			}

			setState(368); table_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_with_query);
		int _la;
		try {
			_localctx = new WithQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(WITH);
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(371); match(RECURSIVE);
				}
				break;
			}
			setState(374); with_query_name();
			setState(379);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(375); match(LEFT_PAREN);
				setState(376); column_name_list();
				setState(377); match(RIGHT_PAREN);
				}
			}

			setState(381); match(AS);
			setState(382); match(LEFT_PAREN);
			setState(388);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case WITH:
			case LEFT_PAREN:
				{
				setState(383); select_stmt();
				}
				break;
			case VALUES:
				{
				setState(384); values_stmt();
				}
				break;
			case INSERT:
				{
				setState(385); insert_stmt();
				}
				break;
			case UPDATE:
				{
				setState(386); update_stmt();
				}
				break;
			case DELETE:
				{
				setState(387); delete_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_with_query_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); any_name();
			}
		}
		catch (RecognitionException re) {
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
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public TerminalNode TABLE() { return getToken(IdbParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
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
		enterRule(_localctx, 38, RULE_table_stmt);
		try {
			int _alt;
			_localctx = new TableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(TABLE);
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(395); match(ONLY);
				}
				break;
			}
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(398); table_name();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 40, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); match(LEFT_PAREN);
			setState(405); select_stmt();
			setState(406); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_from_clause);
		int _la;
		try {
			_localctx = new FromClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408); match(FROM);
			setState(409); table_reference();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410); match(COMMA);
				setState(411); table_reference();
				}
				}
				setState(416);
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
		enterRule(_localctx, 44, RULE_where_clause);
		try {
			_localctx = new WhereClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(WHERE);
			setState(418); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_group_clause);
		try {
			_localctx = new GroupClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(GROUP);
			setState(421); match(BY);
			setState(422); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_having_clause);
		try {
			_localctx = new HavingClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(HAVING);
			setState(425); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_window_clause);
		try {
			_localctx = new WindowClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(WINDOW);
			setState(428); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_window_specifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); window_specifier();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431); match(COMMA);
				setState(432); window_specifier();
				}
				}
				setState(437);
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
		enterRule(_localctx, 54, RULE_window_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); window_name();
			setState(439); match(AS);
			setState(440); window_definition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_order_clause);
		try {
			_localctx = new OrderClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(442); match(ORDER);
			setState(443); match(BY);
			setState(444); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_sort_specifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446); sort_specifier();
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447); match(COMMA);
					setState(448); sort_specifier();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 60, RULE_sort_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); expr(0);
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(455); order_specification();
				}
				break;
			}
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(458); null_ordering();
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
		enterRule(_localctx, 62, RULE_order_specification);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(461); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(462); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(463); match(USING);
				setState(464); operators();
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
		enterRule(_localctx, 64, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(((((_la - 370)) & ~0x3f) == 0 && ((1L << (_la - 370)) & ((1L << (LTH - 370)) | (1L << (GTH - 370)) | (1L << (PLUS - 370)) | (1L << (SUB - 370)) | (1L << (MULTIPLY - 370)) | (1L << (DIVIDE - 370)) | (1L << (MODULAR - 370)) | (1L << (CUSTOME_OPERATOR - 370)))) != 0)) ) {
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
		enterRule(_localctx, 66, RULE_null_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(NULLS);
			setState(470);
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
		enterRule(_localctx, 68, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(LIMIT);
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(473); count();
				}
				break;
			case 2:
				{
				setState(474); match(ALL);
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
		enterRule(_localctx, 70, RULE_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(OFFSET);
			setState(478); start();
			setState(480);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(479);
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
		enterRule(_localctx, 72, RULE_fetch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); match(FETCH);
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(484); count();
				}
				break;
			}
			setState(487);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(488); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_for_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(FOR);
			setState(498);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(491); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(492); match(NO);
				setState(493); match(KEY);
				setState(494); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(495); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(496); match(KEY);
				setState(497); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(502);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(500); match(OF);
				setState(501); table_name_list();
				}
			}

			setState(504); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_table_reference);
		try {
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511); joined_table(0);
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
		enterRule(_localctx, 82, RULE_simple_table);
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(514); match(ONLY);
					}
					break;
				}
				setState(525);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(520);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(517); database_name();
						setState(518); match(DOT);
						}
						break;
					}
					setState(522); schema_name();
					setState(523); match(DOT);
					}
					break;
				}
				setState(527); table_name();
				setState(529);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(528); match(MULTIPLY);
					}
					break;
				}
				setState(532);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(531); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); derived_table();
				setState(535); correlation_specification();
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_joined_table, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(540); match(LEFT_PAREN);
				setState(541); joined_table(0);
				setState(542); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(544); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(567);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(547);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(548); match(CROSS);
						setState(549); match(JOIN);
						setState(550); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(551);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(552); match(UNION);
						setState(553); match(JOIN);
						setState(554); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(555);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(557);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(556); match(NATURAL);
							}
						}

						setState(560);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(559); join_type();
							}
						}

						setState(562); match(JOIN);
						setState(563); joined_table(0);
						setState(565);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(564); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 86, RULE_join_type);
		int _la;
		try {
			setState(577);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(572); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(573); outer_join_type();
				setState(575);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(574); match(OUTER);
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
		enterRule(_localctx, 88, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		enterRule(_localctx, 90, RULE_correlation_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(581); match(AS);
				}
			}

			setState(584); correlation_name();
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(585); match(LEFT_PAREN);
				setState(586); derived_column_list();
				setState(587); match(RIGHT_PAREN);
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
		enterRule(_localctx, 92, RULE_derived_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_derived_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(593); match(LATERAL);
				}
				break;
			}
			setState(598);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(596); table_subquery();
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
				setState(597); function();
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
		enterRule(_localctx, 96, RULE_table_subquery);
		try {
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600); subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601); match(LEFT_PAREN);
				setState(602); values_stmt();
				setState(603); match(RIGHT_PAREN);
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
		enterRule(_localctx, 98, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); function_name();
			setState(608); match(LEFT_PAREN);
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(609); set_qualifier();
				}
				break;
			}
			setState(613);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(612); function_args();
				}
			}

			setState(616);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(615); order_clause();
				}
			}

			setState(618); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_join_specification);
		try {
			setState(622);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(620); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(621); named_columns_join();
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
		enterRule(_localctx, 102, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); match(ON);
			setState(625); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); match(USING);
			setState(628); match(LEFT_PAREN);
			setState(629); join_column_list();
			setState(630); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_join_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_values_stmt);
		try {
			int _alt;
			_localctx = new ValuesStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(634); match(VALUES);
			setState(635); match(LEFT_PAREN);
			setState(636); expr_list();
			setState(637); match(RIGHT_PAREN);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(638); match(COMMA);
					setState(639); match(LEFT_PAREN);
					setState(640); expr_list();
					setState(641); match(RIGHT_PAREN);
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(648); order_clause();
				}
				break;
			}
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(651); limit_clause();
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
		enterRule(_localctx, 110, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CAST_OPERATOR() { return getToken(IdbParser.CAST_OPERATOR, 0); }
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
	public static class FuncExprContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitFuncExpr(this);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
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
		public Datatype_listContext datatype_list() {
			return getRuleContext(Datatype_listContext.class,0);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(657); unary_operator();
				setState(658); expr(28);
				}
				break;
			case 2:
				{
				_localctx = new UnaryOtherOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(660); any_other_operator();
				setState(661); expr(22);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(663); match(NOT);
				setState(664); expr(12);
				}
				break;
			case 4:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(665); unsigned_numeric_literal();
				}
				break;
			case 5:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(666); string_literal();
				}
				break;
			case 6:
				{
				_localctx = new ColumnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(670);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(667); database_name();
						setState(668); match(DOT);
						}
						break;
					}
					setState(672); schema_name();
					setState(673); match(DOT);
					setState(674); table_name();
					setState(675); match(DOT);
					}
					break;
				case 2:
					{
					setState(680);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(677); schema_name();
						setState(678); match(DOT);
						}
						break;
					}
					setState(682); table_name();
					setState(683); match(DOT);
					}
					break;
				case 3:
					{
					setState(685); table_name();
					setState(686); match(DOT);
					}
					break;
				}
				setState(690); column_name();
				}
				break;
			case 7:
				{
				_localctx = new ConstantValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(691); datatype();
				setState(692); match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(694); function();
				}
				break;
			case 9:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695); match(LEFT_PAREN);
				setState(696); expr(0);
				setState(697); match(RIGHT_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new ScalarSubqueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699); scalar_subquery();
				}
				break;
			case 11:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(700); tuple_value();
				}
				break;
			case 12:
				{
				_localctx = new CaseWhenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(701); case_when();
				}
				break;
			case 13:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(702); cast_expr();
				}
				break;
			case 14:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(703); array_constructor();
				}
				break;
			case 15:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(704); row_constructor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(789);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new CaretExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(707);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(708); match(CARET);
						setState(709); expr(27);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(710);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(711);
						_la = _input.LA(1);
						if ( !(((((_la - 380)) & ~0x3f) == 0 && ((1L << (_la - 380)) & ((1L << (MULTIPLY - 380)) | (1L << (DIVIDE - 380)) | (1L << (MODULAR - 380)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(712); expr(27);
						}
						break;
					case 3:
						{
						_localctx = new PlusSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(713);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(714);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(715); expr(26);
						}
						break;
					case 4:
						{
						_localctx = new IsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(716);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(717); match(IS);
						setState(719);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(718); match(NOT);
							}
							break;
						}
						setState(721); expr(25);
						}
						break;
					case 5:
						{
						_localctx = new OtherOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(722);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(723); any_other_operator();
						setState(724); expr(22);
						}
						break;
					case 6:
						{
						_localctx = new IsDistinctExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(726);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(727); match(IS);
						setState(729);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(728); match(NOT);
							}
						}

						setState(731); match(DISTINCT);
						setState(732); match(FROM);
						setState(733); expr(20);
						}
						break;
					case 7:
						{
						_localctx = new BetweenPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(734);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(736);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(735); match(NOT);
							}
						}

						setState(738); match(BETWEEN);
						setState(739); expr(0);
						setState(740); match(AND);
						setState(741); expr(18);
						}
						break;
					case 8:
						{
						_localctx = new OverlapsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(743);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(744); match(OVERLAPS);
						setState(745); expr(17);
						}
						break;
					case 9:
						{
						_localctx = new LessOrGreatThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(746);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(747);
						_la = _input.LA(1);
						if ( !(_la==LTH || _la==GTH) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(748); expr(15);
						}
						break;
					case 10:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(749);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(750);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(751); expr(13);
						}
						break;
					case 11:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(752);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(753); match(AND);
						setState(754); expr(12);
						}
						break;
					case 12:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(755);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(756); match(OR);
						setState(757); expr(11);
						}
						break;
					case 13:
						{
						_localctx = new CastOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(758);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(759); match(CAST_OPERATOR);
						setState(760); datatype();
						}
						break;
					case 14:
						{
						_localctx = new NullOrNotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(761);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(762);
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
						setState(763);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(764); match(IS);
						setState(765); match(OF);
						setState(766); match(LEFT_PAREN);
						setState(767); datatype_list();
						setState(768); match(RIGHT_PAREN);
						}
						break;
					case 16:
						{
						_localctx = new InPredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(770);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(772);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(771); match(NOT);
							}
						}

						setState(774); match(IN);
						setState(778);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(775); subquery();
							}
							break;
						case 2:
							{
							setState(776); values_stmt();
							}
							break;
						case 3:
							{
							setState(777); tuple_value();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new LikePredicateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(780);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(781); pattern_matcher();
						setState(782); expr(0);
						setState(785);
						switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
						case 1:
							{
							setState(783); match(ESCAPE);
							setState(784); match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new ExprCollateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(787);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(788); collate_expression();
						}
						break;
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 114, RULE_unsigned_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
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
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
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
		enterRule(_localctx, 116, RULE_string_literal);
		try {
			setState(804);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(796); match(STRING_LITERAL);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(797); match(REGEX);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(798); match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(799); match(DEFAULT);
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(800); match(MULTIPLY);
				}
				break;
			case BIND_PARAMETER:
				enterOuterAlt(_localctx, 6);
				{
				setState(801); match(BIND_PARAMETER);
				}
				break;
			case DATE:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(802); datetime_literal();
				}
				break;
			case FALSE:
			case TRUE:
			case UNKNOWN:
				enterOuterAlt(_localctx, 8);
				{
				setState(803); boolean_literal();
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
		enterRule(_localctx, 118, RULE_datetime_literal);
		try {
			setState(810);
			switch (_input.LA(1)) {
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); timestamp_literal();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(807); time_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(808); date_literal();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(809); interval_literal();
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
		enterRule(_localctx, 120, RULE_interval_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812); match(INTERVAL);
			setState(814);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(813); interval_precision();
				}
			}

			setState(816); ((Interval_literalContext)_localctx).interval_string = match(STRING_LITERAL);
			setState(818);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(817); interval_qualifier();
				}
				break;
			}
			setState(821);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(820); interval_precision();
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
		enterRule(_localctx, 122, RULE_interval_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823); primary_datetime_field();
			setState(826);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(824); match(TO);
				setState(825); primary_datetime_field();
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
		enterRule(_localctx, 124, RULE_interval_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828); match(LEFT_PAREN);
			setState(829); unsigned_numeric_literal();
			setState(830); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_time_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); match(TIME);
			setState(833); ((Time_literalContext)_localctx).time_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835); match(TIMESTAMP);
			setState(836); ((Timestamp_literalContext)_localctx).timestamp_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838); match(DATE);
			setState(839); ((Date_literalContext)_localctx).date_string = match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
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
		enterRule(_localctx, 134, RULE_primary_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
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
		enterRule(_localctx, 136, RULE_extended_datetime_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
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
		enterRule(_localctx, 138, RULE_collate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); match(COLLATE);
			setState(848); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
		enterRule(_localctx, 142, RULE_any_other_operator);
		try {
			setState(860);
			switch (_input.LA(1)) {
			case LEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(852); match(LEQ);
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(853); match(GEQ);
				}
				break;
			case CONCATENATION_OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(854); match(CONCATENATION_OPERATOR);
				}
				break;
			case NOT_SIMILAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(855); match(NOT_SIMILAR);
				}
				break;
			case SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(856); match(SIMILAR_INSENSITIVE);
				}
				break;
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(857); match(NOT_SIMILAR_INSENSITIVE);
				}
				break;
			case CUSTOME_OPERATOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(858); match(CUSTOME_OPERATOR);
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
				setState(859); postgis_operator();
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
		enterRule(_localctx, 144, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if ( !(((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (INTERSECT2D - 389)) | (1L << (INTERSECT3D - 389)) | (1L << (OVERLAP - 389)) | (1L << (LEFT_OF - 389)) | (1L << (RIGHT_OF - 389)) | (1L << (ABOVE - 389)) | (1L << (OVERLAPS_ABOVE - 389)) | (1L << (BELOW - 389)) | (1L << (BOX_EQUAL - 389)) | (1L << (DISTANCE - 389)))) != 0)) ) {
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
		enterRule(_localctx, 146, RULE_scalar_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); subquery();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_tuple_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866); match(LEFT_PAREN);
			setState(867); expr_list();
			setState(868); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_case_when);
		int _la;
		try {
			setState(903);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870); match(CASE);
				setState(871); expr(0);
				setState(877); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(872); match(WHEN);
					setState(873); expr(0);
					setState(874); match(THEN);
					setState(875); expr(0);
					}
					}
					setState(879); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(883);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(881); match(ELSE);
					setState(882); expr(0);
					}
				}

				setState(885); match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887); match(CASE);
				setState(893); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(888); match(WHEN);
					setState(889); expr(0);
					setState(890); match(THEN);
					setState(891); expr(0);
					}
					}
					setState(895); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(899);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(897); match(ELSE);
					setState(898); expr(0);
					}
				}

				setState(901); match(END);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 152, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); match(CAST);
			setState(906); match(LEFT_PAREN);
			setState(907); expr(0);
			setState(908); match(AS);
			setState(909); datatype();
			setState(910); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_array_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912); match(ARRAY);
			setState(919);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(913); scalar_subquery();
				}
				break;
			case LEFT_SQUARE:
				{
				setState(914); match(LEFT_SQUARE);
				setState(916);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
					{
					setState(915); expr_list();
					}
				}

				setState(918); match(RIGHT_SQUARE);
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
		enterRule(_localctx, 156, RULE_row_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921); match(ROW);
			setState(922); match(LEFT_PAREN);
			setState(924);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << CASE) | (1L << CAST) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(923); expr_list();
				}
			}

			setState(926); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_exists_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(928); match(NOT);
				}
			}

			setState(931); match(EXISTS);
			setState(932); scalar_subquery();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_pattern_matcher);
		int _la;
		try {
			setState(939);
			switch (_input.LA(1)) {
			case ILIKE:
			case LIKE:
			case NOT:
			case REGEXP:
			case RLIKE:
			case SIMILAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(934); match(NOT);
					}
				}

				setState(937); negativable_matcher();
				}
				break;
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(938); regex_matcher();
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
		enterRule(_localctx, 162, RULE_negativable_matcher);
		try {
			setState(947);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(941); match(LIKE);
				}
				break;
			case ILIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(942); match(ILIKE);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 3);
				{
				setState(943); match(REGEXP);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 4);
				{
				setState(944); match(RLIKE);
				}
				break;
			case SIMILAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(945); match(SIMILAR);
				setState(946); match(TO);
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
		enterRule(_localctx, 164, RULE_regex_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_la = _input.LA(1);
			if ( !(((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TILDE - 388)) | (1L << (NOT_SIMILAR - 388)) | (1L << (SIMILAR_INSENSITIVE - 388)) | (1L << (NOT_SIMILAR_INSENSITIVE - 388)))) != 0)) ) {
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
		enterRule(_localctx, 166, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(951); expr(0);
			setState(956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(952); match(COMMA);
					setState(953); expr(0);
					}
					} 
				}
				setState(958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class DatatypeContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datatype_listContext extends ParserRuleContext {
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(IdbParser.COMMA); }
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(IdbParser.COMMA, i);
		}
		public Datatype_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDatatype_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datatype_listContext datatype_list() throws RecognitionException {
		Datatype_listContext _localctx = new Datatype_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_datatype_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961); datatype();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(962); match(COMMA);
				setState(963); datatype();
				}
				}
				setState(968);
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
		enterRule(_localctx, 172, RULE_function_name);
		try {
			setState(971);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(969); function_reserved_name();
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
				setState(970); any_name();
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
		enterRule(_localctx, 174, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
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
		enterRule(_localctx, 176, RULE_function_args);
		int _la;
		try {
			setState(984);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975); function_arg();
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(976); match(COMMA);
					setState(977); function_arg();
					}
					}
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983); match(MULTIPLY);
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
		enterRule(_localctx, 178, RULE_function_arg);
		try {
			setState(994);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(986); match(VARIADIC);
					}
					break;
				}
				setState(989); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990); identifier();
				setState(991); match(ASSIGN);
				setState(992); expr(0);
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
		enterRule(_localctx, 180, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 182, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 184, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 186, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 188, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 190, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 192, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008); exists_window_name();
			setState(1012);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1009); match(PARTITION);
				setState(1010); match(BY);
				setState(1011); expr_list();
				}
				break;
			}
			setState(1015);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1014); order_clause();
				}
				break;
			}
			setState(1018);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << BETWEEN) | (1L << CASE) | (1L << CAST) | (1L << CURRENT) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROW - 77)) | (1L << (ROWS - 77)) | (1L << (FALSE - 77)) | (1L << (TRUE - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (STORAGE - 269)) | (1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (TSQUERY - 333)) | (1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (CONCATENATION_OPERATOR - 333)) | (1L << (LEQ - 333)) | (1L << (GEQ - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (BOX_EQUAL - 397)) | (1L << (DISTANCE - 397)) | (1L << (NOT_SIMILAR - 397)) | (1L << (SIMILAR_INSENSITIVE - 397)) | (1L << (NOT_SIMILAR_INSENSITIVE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (REGEX - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(1017); frame_clause();
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
		enterRule(_localctx, 194, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1020);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(1029);
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
			case MULTIPLY:
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
				setState(1023); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(1024); match(BETWEEN);
				setState(1025); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(1026); match(END);
				setState(1027); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 196, RULE_frame);
		try {
			setState(1043);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); match(UNBOUNDED);
				setState(1032); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033); match(CURRENT);
				setState(1034); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035); match(UNBOUNDED);
				setState(1036); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1037); expr(0);
				setState(1038); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1040); expr(0);
				setState(1041); match(FOLLOWING);
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
		enterRule(_localctx, 198, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045); table_name();
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1046); match(COMMA);
				setState(1047); table_name();
				}
				}
				setState(1052);
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
		enterRule(_localctx, 200, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); column_name();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1054); match(COMMA);
				setState(1055); column_name();
				}
				}
				setState(1060);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
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
		enterRule(_localctx, 202, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061); column_name();
			setState(1062); datatype();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 204, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064); column_definition();
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1065); match(COMMA);
				setState(1066); column_definition();
				}
				}
				setState(1071);
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
		enterRule(_localctx, 206, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 208, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 210, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 212, RULE_identifier);
		int _la;
		try {
			setState(1080);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
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
				setState(1079); nonreserved_keywords();
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
		enterRule(_localctx, 214, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ABORT - 138)) | (1L << (ABSOLUTE - 138)) | (1L << (ACTION - 138)) | (1L << (ANALYZE - 138)) | (1L << (ARRAY - 138)) | (1L << (AT - 138)) | (1L << (AVG - 138)) | (1L << (BACKWARD - 138)) | (1L << (CACHE - 138)) | (1L << (CASCADE - 138)) | (1L << (CENTURY - 138)) | (1L << (CHARACTER - 138)) | (1L << (CLOSE - 138)) | (1L << (COLLATE - 138)) | (1L << (COLLECT - 138)) | (1L << (COALESCE - 138)) | (1L << (CONCURRENTLY - 138)) | (1L << (CONSTRAINT - 138)) | (1L << (CONSTRAINTS - 138)) | (1L << (CONTINUE - 138)) | (1L << (COSTS - 138)) | (1L << (COUNT - 138)) | (1L << (CUBE - 138)) | (1L << (CURSOR - 138)) | (1L << (CYCLE - 138)) | (1L << (DATA - 138)) | (1L << (DAY - 138)) | (1L << (DEC - 138)) | (1L << (DECADE - 138)) | (1L << (DECLARE - 138)) | (1L << (DEFAULTS - 138)) | (1L << (DEFERRED - 138)) | (1L << (DEFERRABLE - 138)) | (1L << (DISCARD - 138)) | (1L << (DOW - 138)) | (1L << (DOY - 138)) | (1L << (EPOCH - 138)) | (1L << (ESCAPE - 138)) | (1L << (EVERY - 138)) | (1L << (EXCLUDE - 138)) | (1L << (EXCLUDING - 138)) | (1L << (EXTENDED - 138)) | (1L << (EXTERNAL - 138)) | (1L << (EXTRACT - 138)) | (1L << (FILTER - 138)) | (1L << (FIRST - 138)) | (1L << (FOLLOWING - 138)) | (1L << (FORCE - 138)) | (1L << (FOREIGN - 138)) | (1L << (FORMAT - 138)) | (1L << (FORWARD - 138)) | (1L << (FUSION - 138)) | (1L << (GLOBAL - 138)) | (1L << (GROUPING - 138)) | (1L << (HASH - 138)) | (1L << (HOLD - 138)) | (1L << (HOUR - 138)) | (1L << (IDENTITY - 138)) | (1L << (INCLUDING - 138)) | (1L << (INDEXES - 138)) | (1L << (INHERIT - 138)) | (1L << (INHERITS - 138)) | (1L << (INITIALLY - 138)) | (1L << (INSENSITIVE - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (INTERSECTION - 202)) | (1L << (ISODOW - 202)) | (1L << (ISOYEAR - 202)) | (1L << (KEY - 202)) | (1L << (LAST - 202)) | (1L << (LATERAL - 202)) | (1L << (LESS - 202)) | (1L << (LIST - 202)) | (1L << (LOCAL - 202)) | (1L << (LOCATION - 202)) | (1L << (MAIN - 202)) | (1L << (MATCH - 202)) | (1L << (MATERIALIZED - 202)) | (1L << (MAX - 202)) | (1L << (MAXVALUE - 202)) | (1L << (MICROSECONDS - 202)) | (1L << (MILLENNIUM - 202)) | (1L << (MILLISECONDS - 202)) | (1L << (MIN - 202)) | (1L << (MINVALUE - 202)) | (1L << (MINUTE - 202)) | (1L << (MONTH - 202)) | (1L << (MOVE - 202)) | (1L << (NATIONAL - 202)) | (1L << (NEXT - 202)) | (1L << (NO - 202)) | (1L << (NO_INHERIT - 202)) | (1L << (NONE - 202)) | (1L << (NULLIF - 202)) | (1L << (NULLS - 202)) | (1L << (OIDS - 202)) | (1L << (ONLY - 202)) | (1L << (OVERWRITE - 202)) | (1L << (OWNED - 202)) | (1L << (PARTIAL - 202)) | (1L << (PARTITION - 202)) | (1L << (PARTITIONS - 202)) | (1L << (PLAIN - 202)) | (1L << (POSITION - 202)) | (1L << (PRECEDING - 202)) | (1L << (PRECISION - 202)) | (1L << (PRESERVE - 202)) | (1L << (PRIMARY - 202)) | (1L << (QUARTER - 202)) | (1L << (RANGE - 202)) | (1L << (RECURSIVE - 202)) | (1L << (REFERENCES - 202)) | (1L << (REFRESH - 202)) | (1L << (REGEXP - 202)) | (1L << (RELATIVE - 202)) | (1L << (RELEASE - 202)) | (1L << (REPLACE - 202)) | (1L << (RESTART - 202)) | (1L << (RESTRICT - 202)) | (1L << (RETURNING - 202)) | (1L << (RLIKE - 202)) | (1L << (ROLLUP - 202)) | (1L << (SCHEMA - 202)) | (1L << (SCROLL - 202)) | (1L << (SECOND - 202)) | (1L << (SEQUENCE - 202)) | (1L << (SEQUENCES - 202)) | (1L << (SIMILAR - 202)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (SIMPLE - 266)) | (1L << (STDDEV_POP - 266)) | (1L << (STDDEV_SAMP - 266)) | (1L << (STORAGE - 266)) | (1L << (SUBPARTITION - 266)) | (1L << (SUBSTRING - 266)) | (1L << (SUM - 266)) | (1L << (TABLES - 266)) | (1L << (TABLESPACE - 266)) | (1L << (TEMPORARY - 266)) | (1L << (TEMP - 266)) | (1L << (THAN - 266)) | (1L << (TIMEZONE - 266)) | (1L << (TIMEZONE_HOUR - 266)) | (1L << (TIMEZONE_MINUTE - 266)) | (1L << (TRANSACTION - 266)) | (1L << (TRIM - 266)) | (1L << (TYPE - 266)) | (1L << (UNBOUNDED - 266)) | (1L << (UNKNOWN - 266)) | (1L << (UNLOGGED - 266)) | (1L << (UNSECURED - 266)) | (1L << (USAGE - 266)) | (1L << (VALID - 266)) | (1L << (VARIADIC - 266)) | (1L << (VAR_SAMP - 266)) | (1L << (VAR_POP - 266)) | (1L << (VARYING - 266)) | (1L << (VERBOSE - 266)) | (1L << (WEEK - 266)) | (1L << (WINDOW - 266)) | (1L << (WITHIN - 266)) | (1L << (WITHOUT - 266)) | (1L << (YEAR - 266)) | (1L << (ZONE - 266)) | (1L << (BOOLEAN - 266)) | (1L << (BOOL - 266)) | (1L << (BIT - 266)) | (1L << (VARBIT - 266)) | (1L << (INT1 - 266)) | (1L << (INT2 - 266)) | (1L << (INT4 - 266)) | (1L << (INT8 - 266)) | (1L << (TINYINT - 266)) | (1L << (SMALLINT - 266)) | (1L << (INT - 266)) | (1L << (INTEGER - 266)) | (1L << (BIGINT - 266)) | (1L << (FLOAT4 - 266)) | (1L << (FLOAT8 - 266)) | (1L << (REAL - 266)) | (1L << (FLOAT - 266)) | (1L << (DOUBLE - 266)) | (1L << (NUMERIC - 266)) | (1L << (DECIMAL - 266)) | (1L << (CHAR - 266)) | (1L << (VARCHAR - 266)) | (1L << (NCHAR - 266)) | (1L << (NVARCHAR - 266)) | (1L << (DATE - 266)) | (1L << (INTERVAL - 266)) | (1L << (TIME - 266)) | (1L << (TIMETZ - 266)) | (1L << (TIMESTAMP - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (TIMESTAMPTZ - 330)) | (1L << (TEXT - 330)) | (1L << (TSVECTOR - 330)) | (1L << (TSQUERY - 330)) | (1L << (BINARY - 330)) | (1L << (VARBINARY - 330)) | (1L << (BLOB - 330)) | (1L << (BYTEA - 330)) | (1L << (INET4 - 330)) | (1L << (BOX2D - 330)) | (1L << (BOX3D - 330)) | (1L << (GEOMETRY - 330)) | (1L << (GEOMETRY_DUMP - 330)) | (1L << (GEOGRAPHY - 330)))) != 0)) ) {
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
		case 42: return joined_table_sempred((Joined_tableContext)_localctx, predIndex);
		case 56: return expr_sempred((ExprContext)_localctx, predIndex);
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
		case 3: return precpred(_ctx, 27);
		case 4: return precpred(_ctx, 26);
		case 5: return precpred(_ctx, 25);
		case 6: return precpred(_ctx, 24);
		case 7: return precpred(_ctx, 21);
		case 8: return precpred(_ctx, 19);
		case 9: return precpred(_ctx, 17);
		case 10: return precpred(_ctx, 16);
		case 11: return precpred(_ctx, 14);
		case 12: return precpred(_ctx, 13);
		case 13: return precpred(_ctx, 11);
		case 14: return precpred(_ctx, 10);
		case 15: return precpred(_ctx, 29);
		case 17: return precpred(_ctx, 20);
		case 16: return precpred(_ctx, 23);
		case 19: return precpred(_ctx, 15);
		case 18: return precpred(_ctx, 18);
		case 20: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019f\u043f\4\2\t"+
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
		"k\4l\tl\4m\tm\3\2\3\2\3\2\7\2\u00de\n\2\f\2\16\2\u00e1\13\2\3\2\3\2\5"+
		"\2\u00e5\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00ef\n\5\3\5\5\5\u00f2"+
		"\n\5\3\5\5\5\u00f5\n\5\3\5\5\5\u00f8\n\5\3\5\5\5\u00fb\n\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0108\n\t\f\t\16\t\u010b\13\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0111\n\t\f\t\16\t\u0114\13\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u011c\n\t\f\t\16\t\u011f\13\t\3\t\5\t\u0122\n\t\3\n\5\n\u0125\n\n"+
		"\3\n\3\n\5\n\u0129\n\n\3\n\3\n\5\n\u012d\n\n\3\n\5\n\u0130\n\n\3\n\5\n"+
		"\u0133\n\n\3\n\5\n\u0136\n\n\3\n\5\n\u0139\n\n\3\n\5\n\u013c\n\n\3\13"+
		"\3\13\5\13\u0140\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0149\n\f\5\f\u014b"+
		"\n\f\3\r\3\r\3\r\7\r\u0150\n\r\f\r\16\r\u0153\13\r\3\16\3\16\5\16\u0157"+
		"\n\16\3\17\3\17\5\17\u015b\n\17\3\20\3\20\3\20\5\20\u0160\n\20\3\20\3"+
		"\20\3\21\5\21\u0165\n\21\3\21\3\21\3\21\5\21\u016a\n\21\3\22\3\22\5\22"+
		"\u016e\n\22\3\22\5\22\u0171\n\22\3\22\3\22\3\23\3\23\5\23\u0177\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u017e\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0187\n\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u018f\n\25\3"+
		"\25\7\25\u0192\n\25\f\25\16\25\u0195\13\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u019f\n\27\f\27\16\27\u01a2\13\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u01b4"+
		"\n\34\f\34\16\34\u01b7\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\7\37\u01c4\n\37\f\37\16\37\u01c7\13\37\3 \3 \5 \u01cb\n"+
		" \3 \5 \u01ce\n \3!\3!\3!\3!\5!\u01d4\n!\3\"\3\"\3#\3#\3#\3$\3$\3$\5$"+
		"\u01de\n$\3%\3%\3%\5%\u01e3\n%\3&\3&\3&\5&\u01e8\n&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f5\n\'\3\'\3\'\5\'\u01f9\n\'\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\5*\u0203\n*\3+\5+\u0206\n+\3+\3+\3+\5+\u020b\n+\3+\3+"+
		"\3+\5+\u0210\n+\3+\3+\5+\u0214\n+\3+\5+\u0217\n+\3+\3+\3+\5+\u021c\n+"+
		"\3,\3,\3,\3,\3,\3,\5,\u0224\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0230"+
		"\n,\3,\5,\u0233\n,\3,\3,\3,\5,\u0238\n,\7,\u023a\n,\f,\16,\u023d\13,\3"+
		"-\3-\3-\5-\u0242\n-\5-\u0244\n-\3.\3.\3/\5/\u0249\n/\3/\3/\3/\3/\3/\5"+
		"/\u0250\n/\3\60\3\60\3\61\5\61\u0255\n\61\3\61\3\61\5\61\u0259\n\61\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u0260\n\62\3\63\3\63\3\63\5\63\u0265\n\63"+
		"\3\63\5\63\u0268\n\63\3\63\5\63\u026b\n\63\3\63\3\63\3\64\3\64\5\64\u0271"+
		"\n\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\38\78\u0286\n8\f8\168\u0289\138\38\58\u028c\n8\38\58\u028f"+
		"\n8\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02a1\n:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u02ab\n:\3:\3:\3:\3:\3:\3:\5:\u02b3\n:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02c4\n:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\5:\u02d2\n:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02dc\n:\3:\3:"+
		"\3:\3:\3:\5:\u02e3\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0307\n:\3:"+
		"\3:\3:\3:\5:\u030d\n:\3:\3:\3:\3:\3:\5:\u0314\n:\3:\3:\7:\u0318\n:\f:"+
		"\16:\u031b\13:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0327\n<\3=\3=\3=\3=\5"+
		"=\u032d\n=\3>\3>\5>\u0331\n>\3>\3>\5>\u0335\n>\3>\5>\u0338\n>\3?\3?\3"+
		"?\5?\u033d\n?\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\5I\u035f\nI\3J\3J\3K\3K\3L\3"+
		"L\3L\3L\3M\3M\3M\3M\3M\3M\3M\6M\u0370\nM\rM\16M\u0371\3M\3M\5M\u0376\n"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\6M\u0380\nM\rM\16M\u0381\3M\3M\5M\u0386\nM\3"+
		"M\3M\5M\u038a\nM\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\5O\u0397\nO\3O\5O\u039a"+
		"\nO\3P\3P\3P\5P\u039f\nP\3P\3P\3Q\5Q\u03a4\nQ\3Q\3Q\3Q\3R\5R\u03aa\nR"+
		"\3R\3R\5R\u03ae\nR\3S\3S\3S\3S\3S\3S\5S\u03b6\nS\3T\3T\3U\3U\3U\7U\u03bd"+
		"\nU\fU\16U\u03c0\13U\3V\3V\3W\3W\3W\7W\u03c7\nW\fW\16W\u03ca\13W\3X\3"+
		"X\5X\u03ce\nX\3Y\3Y\3Z\3Z\3Z\7Z\u03d5\nZ\fZ\16Z\u03d8\13Z\3Z\5Z\u03db"+
		"\nZ\3[\5[\u03de\n[\3[\3[\3[\3[\3[\5[\u03e5\n[\3\\\3\\\3]\3]\3^\3^\3_\3"+
		"_\3`\3`\3a\3a\3b\3b\3b\3b\5b\u03f7\nb\3b\5b\u03fa\nb\3b\5b\u03fd\nb\3"+
		"c\5c\u0400\nc\3c\3c\3c\3c\3c\3c\5c\u0408\nc\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\5d\u0416\nd\3e\3e\3e\7e\u041b\ne\fe\16e\u041e\13e\3f\3f\3f"+
		"\7f\u0423\nf\ff\16f\u0426\13f\3g\3g\3g\3h\3h\3h\7h\u042e\nh\fh\16h\u0431"+
		"\13h\3i\3i\3j\3j\3k\3k\3l\3l\5l\u043b\nl\3m\3m\3m\3\u0193\4Vrn\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\2\31\5\2$$::}}\4\2\5\5  \4\2\u0115\u0116\u0120\u0120\6\2\u0174\u0174"+
		"\u0176\u0176\u017c\u0180\u0199\u0199\4\2\u00b9\u00b9\u00d0\u00d0\3\2h"+
		"i\4\2\u00b9\u00b9\u00e4\u00e4\5\2,,@@ff\3\2\u017e\u0180\3\2\u017c\u017d"+
		"\4\2\u0174\u0174\u0176\u0176\4\2\u016e\u016e\u0173\u0173\4\2==NN\3\2\u0195"+
		"\u0196\4\2\u008a\u008b\u011f\u011f\7\2\u00a6\u00a6\u00c4\u00c4\u00e0\u00e1"+
		"\u0108\u0108\u012d\u012d\t\2\u0096\u0096\u00a8\u00a8\u00ae\u00b0\u00cd"+
		"\u00ce\u00db\u00dd\u00f8\u00f8\u0129\u0129\3\2\u0187\u0190\4\2\u0186\u0186"+
		"\u0191\u0193\6\2\5\5\b\b@@ff\4\2ii\u00f9\u00f9\3\2\u019a\u019b\4\2\u008c"+
		"\u00eb\u00ed\u0159\u0489\2\u00df\3\2\2\2\4\u00e8\3\2\2\2\6\u00ea\3\2\2"+
		"\2\b\u00ec\3\2\2\2\n\u00fc\3\2\2\2\f\u00fe\3\2\2\2\16\u0100\3\2\2\2\20"+
		"\u0121\3\2\2\2\22\u0124\3\2\2\2\24\u013d\3\2\2\2\26\u014a\3\2\2\2\30\u014c"+
		"\3\2\2\2\32\u0156\3\2\2\2\34\u0158\3\2\2\2\36\u015f\3\2\2\2 \u0164\3\2"+
		"\2\2\"\u016b\3\2\2\2$\u0174\3\2\2\2&\u018a\3\2\2\2(\u018c\3\2\2\2*\u0196"+
		"\3\2\2\2,\u019a\3\2\2\2.\u01a3\3\2\2\2\60\u01a6\3\2\2\2\62\u01aa\3\2\2"+
		"\2\64\u01ad\3\2\2\2\66\u01b0\3\2\2\28\u01b8\3\2\2\2:\u01bc\3\2\2\2<\u01c0"+
		"\3\2\2\2>\u01c8\3\2\2\2@\u01d3\3\2\2\2B\u01d5\3\2\2\2D\u01d7\3\2\2\2F"+
		"\u01da\3\2\2\2H\u01df\3\2\2\2J\u01e4\3\2\2\2L\u01ec\3\2\2\2N\u01fc\3\2"+
		"\2\2P\u01fe\3\2\2\2R\u0202\3\2\2\2T\u021b\3\2\2\2V\u0223\3\2\2\2X\u0243"+
		"\3\2\2\2Z\u0245\3\2\2\2\\\u0248\3\2\2\2^\u0251\3\2\2\2`\u0254\3\2\2\2"+
		"b\u025f\3\2\2\2d\u0261\3\2\2\2f\u0270\3\2\2\2h\u0272\3\2\2\2j\u0275\3"+
		"\2\2\2l\u027a\3\2\2\2n\u027c\3\2\2\2p\u0290\3\2\2\2r\u02c3\3\2\2\2t\u031c"+
		"\3\2\2\2v\u0326\3\2\2\2x\u032c\3\2\2\2z\u032e\3\2\2\2|\u0339\3\2\2\2~"+
		"\u033e\3\2\2\2\u0080\u0342\3\2\2\2\u0082\u0345\3\2\2\2\u0084\u0348\3\2"+
		"\2\2\u0086\u034b\3\2\2\2\u0088\u034d\3\2\2\2\u008a\u034f\3\2\2\2\u008c"+
		"\u0351\3\2\2\2\u008e\u0354\3\2\2\2\u0090\u035e\3\2\2\2\u0092\u0360\3\2"+
		"\2\2\u0094\u0362\3\2\2\2\u0096\u0364\3\2\2\2\u0098\u0389\3\2\2\2\u009a"+
		"\u038b\3\2\2\2\u009c\u0392\3\2\2\2\u009e\u039b\3\2\2\2\u00a0\u03a3\3\2"+
		"\2\2\u00a2\u03ad\3\2\2\2\u00a4\u03b5\3\2\2\2\u00a6\u03b7\3\2\2\2\u00a8"+
		"\u03b9\3\2\2\2\u00aa\u03c1\3\2\2\2\u00ac\u03c3\3\2\2\2\u00ae\u03cd\3\2"+
		"\2\2\u00b0\u03cf\3\2\2\2\u00b2\u03da\3\2\2\2\u00b4\u03e4\3\2\2\2\u00b6"+
		"\u03e6\3\2\2\2\u00b8\u03e8\3\2\2\2\u00ba\u03ea\3\2\2\2\u00bc\u03ec\3\2"+
		"\2\2\u00be\u03ee\3\2\2\2\u00c0\u03f0\3\2\2\2\u00c2\u03f2\3\2\2\2\u00c4"+
		"\u03ff\3\2\2\2\u00c6\u0415\3\2\2\2\u00c8\u0417\3\2\2\2\u00ca\u041f\3\2"+
		"\2\2\u00cc\u0427\3\2\2\2\u00ce\u042a\3\2\2\2\u00d0\u0432\3\2\2\2\u00d2"+
		"\u0434\3\2\2\2\u00d4\u0436\3\2\2\2\u00d6\u043a\3\2\2\2\u00d8\u043c\3\2"+
		"\2\2\u00da\u00db\5\4\3\2\u00db\u00dc\7\u0170\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\5\4\3\2\u00e3"+
		"\u00e5\7\u0170\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7\2\2\3\u00e7\3\3\2\2\2\u00e8\u00e9\5\6\4\2\u00e9"+
		"\5\3\2\2\2\u00ea\u00eb\5\b\5\2\u00eb\7\3\2\2\2\u00ec\u00ee\5\20\t\2\u00ed"+
		"\u00ef\5:\36\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2"+
		"\2\2\u00f0\u00f2\5F$\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f5\5H%\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f8\5J&\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2"+
		"\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\5L\'\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\t\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fd\13\3\2\2\2\u00fe"+
		"\u00ff\7\36\2\2\u00ff\r\3\2\2\2\u0100\u0101\79\2\2\u0101\u0102\7;\2\2"+
		"\u0102\17\3\2\2\2\u0103\u0109\5\22\n\2\u0104\u0105\5\24\13\2\u0105\u0106"+
		"\5\22\n\2\u0106\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0108\u010b\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0122\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u0112\5\22\n\2\u010d\u010e\5\24\13\2\u010e\u010f\5\20\t"+
		"\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0122\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7\u0178\2\2\u0116\u0117\5\b\5\2\u0117\u011d\7\u0179\2\2\u0118\u0119"+
		"\5\24\13\2\u0119\u011a\5\20\t\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2"+
		"\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0122"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\5(\25\2\u0121\u0103\3\2\2\2\u0121"+
		"\u010c\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u0120\3\2\2\2\u0122\21\3\2\2"+
		"\2\u0123\u0125\5$\23\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\7k\2\2\u0127\u0129\5\26\f\2\u0128\u0127\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\5\30\r\2\u012b\u012d\5"+
		"\"\22\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u0130\5,\27\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u0133\5.\30\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0136\5\60\31\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5\62\32\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\5\64\33\2\u013b\u013a\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\23\3\2\2\2\u013d\u013f\t\2\2\2\u013e"+
		"\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\25\3\2\2"+
		"\2\u0141\u014b\7\5\2\2\u0142\u0148\7 \2\2\u0143\u0144\7W\2\2\u0144\u0145"+
		"\7\u0178\2\2\u0145\u0146\5\u00a8U\2\u0146\u0147\7\u0179\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0141\3\2\2\2\u014a\u0142\3\2\2\2\u014b\27\3\2\2\2\u014c\u0151\5\32\16"+
		"\2\u014d\u014e\7\u0171\2\2\u014e\u0150\5\32\16\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\31\3\2\2"+
		"\2\u0153\u0151\3\2\2\2\u0154\u0157\5\34\17\2\u0155\u0157\5\36\20\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\33\3\2\2\2\u0158\u015a\5r:\2"+
		"\u0159\u015b\5 \21\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\35"+
		"\3\2\2\2\u015c\u015d\5\u00ba^\2\u015d\u015e\7\u0182\2\2\u015e\u0160\3"+
		"\2\2\2\u015f\u015c\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\7\u017e\2\2\u0162\37\3\2\2\2\u0163\u0165\7\t\2\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\3\2\2\2\u0166\u016a\5\u00d2j\2"+
		"\u0167\u016a\5\u0086D\2\u0168\u016a\7Q\2\2\u0169\u0166\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a!\3\2\2\2\u016b\u016d\7;\2\2\u016c\u016e"+
		"\t\4\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0171\7v\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\5\u00ba^\2\u0173#\3\2\2\2\u0174\u0176\7\u0089\2\2\u0175"+
		"\u0177\7\u00fa\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017d\5&\24\2\u0179\u017a\7\u0178\2\2\u017a\u017b\5\u00ca"+
		"f\2\u017b\u017c\7\u0179\2\2\u017c\u017e\3\2\2\2\u017d\u0179\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\t\2\2\u0180\u0186\7\u0178"+
		"\2\2\u0181\u0187\5\b\5\2\u0182\u0187\5n8\2\u0183\u0187\5\16\b\2\u0184"+
		"\u0187\5\n\6\2\u0185\u0187\5\f\7\2\u0186\u0181\3\2\2\2\u0186\u0182\3\2"+
		"\2\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7\u0179\2\2\u0189%\3\2\2\2\u018a\u018b\5\u00d4"+
		"k\2\u018b\'\3\2\2\2\u018c\u018e\7v\2\2\u018d\u018f\7\u00eb\2\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0193\3\2\2\2\u0190\u0192\5\u00ba^"+
		"\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0194\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0194)\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\u0178\2\2\u0197"+
		"\u0198\5\b\5\2\u0198\u0199\7\u0179\2\2\u0199+\3\2\2\2\u019a\u019b\7+\2"+
		"\2\u019b\u01a0\5R*\2\u019c\u019d\7\u0171\2\2\u019d\u019f\5R*\2\u019e\u019c"+
		"\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"-\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7\u0088\2\2\u01a4\u01a5\5p9"+
		"\2\u01a5/\3\2\2\2\u01a6\u01a7\7.\2\2\u01a7\u01a8\7\20\2\2\u01a8\u01a9"+
		"\5\u00a8U\2\u01a9\61\3\2\2\2\u01aa\u01ab\7/\2\2\u01ab\u01ac\5\u00a8U\2"+
		"\u01ac\63\3\2\2\2\u01ad\u01ae\7\u012a\2\2\u01ae\u01af\5\66\34\2\u01af"+
		"\65\3\2\2\2\u01b0\u01b5\58\35\2\u01b1\u01b2\7\u0171\2\2\u01b2\u01b4\5"+
		"8\35\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\67\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\5\u00be"+
		"`\2\u01b9\u01ba\7\t\2\2\u01ba\u01bb\5\u00c2b\2\u01bb9\3\2\2\2\u01bc\u01bd"+
		"\7[\2\2\u01bd\u01be\7\20\2\2\u01be\u01bf\5<\37\2\u01bf;\3\2\2\2\u01c0"+
		"\u01c5\5> \2\u01c1\u01c2\7\u0171\2\2\u01c2\u01c4\5> \2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"=\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\5r:\2\u01c9\u01cb\5@!\2\u01ca"+
		"\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5D"+
		"#\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce?\3\2\2\2\u01cf\u01d4"+
		"\7\n\2\2\u01d0\u01d4\7\37\2\2\u01d1\u01d2\7\u0081\2\2\u01d2\u01d4\5B\""+
		"\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4A"+
		"\3\2\2\2\u01d5\u01d6\t\5\2\2\u01d6C\3\2\2\2\u01d7\u01d8\7\u00e9\2\2\u01d8"+
		"\u01d9\t\6\2\2\u01d9E\3\2\2\2\u01da\u01dd\7C\2\2\u01db\u01de\5N(\2\u01dc"+
		"\u01de\7\5\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deG\3\2\2\2"+
		"\u01df\u01e0\7V\2\2\u01e0\u01e2\5P)\2\u01e1\u01e3\t\7\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3I\3\2\2\2\u01e4\u01e5\7(\2\2\u01e5\u01e7"+
		"\t\b\2\2\u01e6\u01e8\5N(\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\t\7\2\2\u01ea\u01eb\7\u00eb\2\2\u01ebK\3\2"+
		"\2\2\u01ec\u01f4\7*\2\2\u01ed\u01f5\7\177\2\2\u01ee\u01ef\7\u00e5\2\2"+
		"\u01ef\u01f0\7\u00cf\2\2\u01f0\u01f5\7\177\2\2\u01f1\u01f5\7n\2\2\u01f2"+
		"\u01f3\7\u00cf\2\2\u01f3\u01f5\7n\2\2\u01f4\u01ed\3\2\2\2\u01f4\u01ee"+
		"\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f7\7S\2\2\u01f7\u01f9\5\u00c8e\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3"+
		"\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\7P\2\2\u01fbM\3\2\2\2\u01fc\u01fd"+
		"\5r:\2\u01fdO\3\2\2\2\u01fe\u01ff\5r:\2\u01ffQ\3\2\2\2\u0200\u0203\5T"+
		"+\2\u0201\u0203\5V,\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203S\3"+
		"\2\2\2\u0204\u0206\7\u00eb\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2"+
		"\u0206\u020f\3\2\2\2\u0207\u0208\5\u00b6\\\2\u0208\u0209\7\u0182\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\5\u00b8]\2\u020d\u020e\7\u0182\2\2\u020e\u0210\3\2\2"+
		"\2\u020f\u020a\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213"+
		"\5\u00ba^\2\u0212\u0214\7\u017e\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3"+
		"\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\5\\/\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u021c\3\2\2\2\u0218\u0219\5`\61\2\u0219\u021a\5\\"+
		"/\2\u021a\u021c\3\2\2\2\u021b\u0205\3\2\2\2\u021b\u0218\3\2\2\2\u021c"+
		"U\3\2\2\2\u021d\u021e\b,\1\2\u021e\u021f\7\u0178\2\2\u021f\u0220\5V,\2"+
		"\u0220\u0221\7\u0179\2\2\u0221\u0224\3\2\2\2\u0222\u0224\5T+\2\u0223\u021d"+
		"\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u023b\3\2\2\2\u0225\u0226\f\7\2\2\u0226"+
		"\u0227\7\33\2\2\u0227\u0228\7>\2\2\u0228\u023a\5V,\b\u0229\u022a\f\5\2"+
		"\2\u022a\u022b\7}\2\2\u022b\u022c\7>\2\2\u022c\u023a\5V,\6\u022d\u022f"+
		"\f\6\2\2\u022e\u0230\7K\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0232\3\2\2\2\u0231\u0233\5X-\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234\u0235\7>\2\2\u0235\u0237\5V,\2\u0236\u0238"+
		"\5f\64\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239"+
		"\u0225\3\2\2\2\u0239\u0229\3\2\2\2\u0239\u022d\3\2\2\2\u023a\u023d\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023cW\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023e\u0244\78\2\2\u023f\u0241\5Z.\2\u0240\u0242\7\\\2\2\u0241"+
		"\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u023e\3\2"+
		"\2\2\u0243\u023f\3\2\2\2\u0244Y\3\2\2\2\u0245\u0246\t\t\2\2\u0246[\3\2"+
		"\2\2\u0247\u0249\7\t\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024f\5\u00d0i\2\u024b\u024c\7\u0178\2\2\u024c\u024d"+
		"\5^\60\2\u024d\u024e\7\u0179\2\2\u024e\u0250\3\2\2\2\u024f\u024b\3\2\2"+
		"\2\u024f\u0250\3\2\2\2\u0250]\3\2\2\2\u0251\u0252\5\u00caf\2\u0252_\3"+
		"\2\2\2\u0253\u0255\7\u00d1\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2"+
		"\u0255\u0258\3\2\2\2\u0256\u0259\5b\62\2\u0257\u0259\5d\63\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0257\3\2\2\2\u0259a\3\2\2\2\u025a\u0260\5*\26\2\u025b"+
		"\u025c\7\u0178\2\2\u025c\u025d\5n8\2\u025d\u025e\7\u0179\2\2\u025e\u0260"+
		"\3\2\2\2\u025f\u025a\3\2\2\2\u025f\u025b\3\2\2\2\u0260c\3\2\2\2\u0261"+
		"\u0262\5\u00aeX\2\u0262\u0264\7\u0178\2\2\u0263\u0265\5\26\f\2\u0264\u0263"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\5\u00b2Z"+
		"\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b"+
		"\5:\36\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026d\7\u0179\2\2\u026de\3\2\2\2\u026e\u0271\5h\65\2\u026f\u0271\5j\66"+
		"\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271g\3\2\2\2\u0272\u0273"+
		"\7W\2\2\u0273\u0274\5p9\2\u0274i\3\2\2\2\u0275\u0276\7\u0081\2\2\u0276"+
		"\u0277\7\u0178\2\2\u0277\u0278\5l\67\2\u0278\u0279\7\u0179\2\2\u0279k"+
		"\3\2\2\2\u027a\u027b\5\u00caf\2\u027bm\3\2\2\2\u027c\u027d\7\u0083\2\2"+
		"\u027d\u027e\7\u0178\2\2\u027e\u027f\5\u00a8U\2\u027f\u0287\7\u0179\2"+
		"\2\u0280\u0281\7\u0171\2\2\u0281\u0282\7\u0178\2\2\u0282\u0283\5\u00a8"+
		"U\2\u0283\u0284\7\u0179\2\2\u0284\u0286\3\2\2\2\u0285\u0280\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028b\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u028a\u028c\5:\36\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028f\5F$\2\u028e\u028d\3\2\2"+
		"\2\u028e\u028f\3\2\2\2\u028fo\3\2\2\2\u0290\u0291\5r:\2\u0291q\3\2\2\2"+
		"\u0292\u0293\b:\1\2\u0293\u0294\5\u008eH\2\u0294\u0295\5r:\36\u0295\u02c4"+
		"\3\2\2\2\u0296\u0297\5\u0090I\2\u0297\u0298\5r:\30\u0298\u02c4\3\2\2\2"+
		"\u0299\u029a\7O\2\2\u029a\u02c4\5r:\16\u029b\u02c4\5t;\2\u029c\u02c4\5"+
		"v<\2\u029d\u029e\5\u00b6\\\2\u029e\u029f\7\u0182\2\2\u029f\u02a1\3\2\2"+
		"\2\u02a0\u029d\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3"+
		"\5\u00b8]\2\u02a3\u02a4\7\u0182\2\2\u02a4\u02a5\5\u00ba^\2\u02a5\u02a6"+
		"\7\u0182\2\2\u02a6\u02b3\3\2\2\2\u02a7\u02a8\5\u00b8]\2\u02a8\u02a9\7"+
		"\u0182\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2"+
		"\u02ab\u02ac\3\2\2\2\u02ac\u02ad\5\u00ba^\2\u02ad\u02ae\7\u0182\2\2\u02ae"+
		"\u02b3\3\2\2\2\u02af\u02b0\5\u00ba^\2\u02b0\u02b1\7\u0182\2\2\u02b1\u02b3"+
		"\3\2\2\2\u02b2\u02a0\3\2\2\2\u02b2\u02aa\3\2\2\2\u02b2\u02af\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02c4\5\u00bc_\2\u02b5\u02b6"+
		"\5\u00aaV\2\u02b6\u02b7\7\u019d\2\2\u02b7\u02c4\3\2\2\2\u02b8\u02c4\5"+
		"d\63\2\u02b9\u02ba\7\u0178\2\2\u02ba\u02bb\5r:\2\u02bb\u02bc\7\u0179\2"+
		"\2\u02bc\u02c4\3\2\2\2\u02bd\u02c4\5\u0094K\2\u02be\u02c4\5\u0096L\2\u02bf"+
		"\u02c4\5\u0098M\2\u02c0\u02c4\5\u009aN\2\u02c1\u02c4\5\u009cO\2\u02c2"+
		"\u02c4\5\u009eP\2\u02c3\u0292\3\2\2\2\u02c3\u0296\3\2\2\2\u02c3\u0299"+
		"\3\2\2\2\u02c3\u029b\3\2\2\2\u02c3\u029c\3\2\2\2\u02c3\u02b2\3\2\2\2\u02c3"+
		"\u02b5\3\2\2\2\u02c3\u02b8\3\2\2\2\u02c3\u02b9\3\2\2\2\u02c3\u02bd\3\2"+
		"\2\2\u02c3\u02be\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c3\u02c0\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u0319\3\2\2\2\u02c5\u02c6\f\35"+
		"\2\2\u02c6\u02c7\7\u0181\2\2\u02c7\u0318\5r:\35\u02c8\u02c9\f\34\2\2\u02c9"+
		"\u02ca\t\n\2\2\u02ca\u0318\5r:\35\u02cb\u02cc\f\33\2\2\u02cc\u02cd\t\13"+
		"\2\2\u02cd\u0318\5r:\34\u02ce\u02cf\f\32\2\2\u02cf\u02d1\7<\2\2\u02d0"+
		"\u02d2\7O\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u0318\5r:\33\u02d4\u02d5\f\27\2\2\u02d5\u02d6\5\u0090I\2\u02d6"+
		"\u02d7\5r:\30\u02d7\u0318\3\2\2\2\u02d8\u02d9\f\25\2\2\u02d9\u02db\7<"+
		"\2\2\u02da\u02dc\7O\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02de\7 \2\2\u02de\u02df\7+\2\2\u02df\u0318\5r:\26"+
		"\u02e0\u02e2\f\23\2\2\u02e1\u02e3\7O\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\7\16\2\2\u02e5\u02e6\5r:\2\u02e6"+
		"\u02e7\7\7\2\2\u02e7\u02e8\5r:\24\u02e8\u0318\3\2\2\2\u02e9\u02ea\f\22"+
		"\2\2\u02ea\u02eb\7\u00ec\2\2\u02eb\u0318\5r:\23\u02ec\u02ed\f\20\2\2\u02ed"+
		"\u02ee\t\f\2\2\u02ee\u0318\5r:\21\u02ef\u02f0\f\17\2\2\u02f0\u02f1\t\r"+
		"\2\2\u02f1\u0318\5r:\17\u02f2\u02f3\f\r\2\2\u02f3\u02f4\7\7\2\2\u02f4"+
		"\u0318\5r:\16\u02f5\u02f6\f\f\2\2\u02f6\u02f7\7Z\2\2\u02f7\u0318\5r:\r"+
		"\u02f8\u02f9\f\37\2\2\u02f9\u02fa\7\u016c\2\2\u02fa\u0318\5\u00aaV\2\u02fb"+
		"\u02fc\f\31\2\2\u02fc\u0318\t\16\2\2\u02fd\u02fe\f\26\2\2\u02fe\u02ff"+
		"\7<\2\2\u02ff\u0300\7S\2\2\u0300\u0301\7\u0178\2\2\u0301\u0302\5\u00ac"+
		"W\2\u0302\u0303\7\u0179\2\2\u0303\u0318\3\2\2\2\u0304\u0306\f\24\2\2\u0305"+
		"\u0307\7O\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u030c\7\64\2\2\u0309\u030d\5*\26\2\u030a\u030d\5n8\2\u030b"+
		"\u030d\5\u0096L\2\u030c\u0309\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030b"+
		"\3\2\2\2\u030d\u0318\3\2\2\2\u030e\u030f\f\21\2\2\u030f\u0310\5\u00a2"+
		"R\2\u0310\u0313\5r:\2\u0311\u0312\7\u00b1\2\2\u0312\u0314\7\u019d\2\2"+
		"\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0318\3\2\2\2\u0315\u0316"+
		"\f\3\2\2\u0316\u0318\5\u008cG\2\u0317\u02c5\3\2\2\2\u0317\u02c8\3\2\2"+
		"\2\u0317\u02cb\3\2\2\2\u0317\u02ce\3\2\2\2\u0317\u02d4\3\2\2\2\u0317\u02d8"+
		"\3\2\2\2\u0317\u02e0\3\2\2\2\u0317\u02e9\3\2\2\2\u0317\u02ec\3\2\2\2\u0317"+
		"\u02ef\3\2\2\2\u0317\u02f2\3\2\2\2\u0317\u02f5\3\2\2\2\u0317\u02f8\3\2"+
		"\2\2\u0317\u02fb\3\2\2\2\u0317\u02fd\3\2\2\2\u0317\u0304\3\2\2\2\u0317"+
		"\u030e\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031as\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031d"+
		"\t\17\2\2\u031du\3\2\2\2\u031e\u0327\7\u019d\2\2\u031f\u0327\7\u019c\2"+
		"\2\u0320\u0327\7Q\2\2\u0321\u0327\7\35\2\2\u0322\u0327\7\u017e\2\2\u0323"+
		"\u0327\7\u0194\2\2\u0324\u0327\5x=\2\u0325\u0327\5\u0086D\2\u0326\u031e"+
		"\3\2\2\2\u0326\u031f\3\2\2\2\u0326\u0320\3\2\2\2\u0326\u0321\3\2\2\2\u0326"+
		"\u0322\3\2\2\2\u0326\u0323\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0325\3\2"+
		"\2\2\u0327w\3\2\2\2\u0328\u032d\5\u0082B\2\u0329\u032d\5\u0080A\2\u032a"+
		"\u032d\5\u0084C\2\u032b\u032d\5z>\2\u032c\u0328\3\2\2\2\u032c\u0329\3"+
		"\2\2\2\u032c\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032dy\3\2\2\2\u032e\u0330"+
		"\7\u0148\2\2\u032f\u0331\5~@\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2"+
		"\u0331\u0332\3\2\2\2\u0332\u0334\7\u019d\2\2\u0333\u0335\5|?\2\u0334\u0333"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0338\5~@\2\u0337"+
		"\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338{\3\2\2\2\u0339\u033c\5\u0088"+
		"E\2\u033a\u033b\7x\2\2\u033b\u033d\5\u0088E\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d}\3\2\2\2\u033e\u033f\7\u0178\2\2\u033f\u0340\5t;"+
		"\2\u0340\u0341\7\u0179\2\2\u0341\177\3\2\2\2\u0342\u0343\7\u0149\2\2\u0343"+
		"\u0344\7\u019d\2\2\u0344\u0081\3\2\2\2\u0345\u0346\7\u014b\2\2\u0346\u0347"+
		"\7\u019d\2\2\u0347\u0083\3\2\2\2\u0348\u0349\7\u0147\2\2\u0349\u034a\7"+
		"\u019d\2\2\u034a\u0085\3\2\2\2\u034b\u034c\t\20\2\2\u034c\u0087\3\2\2"+
		"\2\u034d\u034e\t\21\2\2\u034e\u0089\3\2\2\2\u034f\u0350\t\22\2\2\u0350"+
		"\u008b\3\2\2\2\u0351\u0352\7\u0099\2\2\u0352\u0353\5\u00bc_\2\u0353\u008d"+
		"\3\2\2\2\u0354\u0355\t\13\2\2\u0355\u008f\3\2\2\2\u0356\u035f\7\u0175"+
		"\2\2\u0357\u035f\7\u0177\2\2\u0358\u035f\7\u0172\2\2\u0359\u035f\7\u0191"+
		"\2\2\u035a\u035f\7\u0192\2\2\u035b\u035f\7\u0193\2\2\u035c\u035f\7\u0199"+
		"\2\2\u035d\u035f\5\u0092J\2\u035e\u0356\3\2\2\2\u035e\u0357\3\2\2\2\u035e"+
		"\u0358\3\2\2\2\u035e\u0359\3\2\2\2\u035e\u035a\3\2\2\2\u035e\u035b\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f\u0091\3\2\2\2\u0360"+
		"\u0361\t\23\2\2\u0361\u0093\3\2\2\2\u0362\u0363\5*\26\2\u0363\u0095\3"+
		"\2\2\2\u0364\u0365\7\u0178\2\2\u0365\u0366\5\u00a8U\2\u0366\u0367\7\u0179"+
		"\2\2\u0367\u0097\3\2\2\2\u0368\u0369\7\21\2\2\u0369\u036f\5r:\2\u036a"+
		"\u036b\7\u0086\2\2\u036b\u036c\5r:\2\u036c\u036d\7w\2\2\u036d\u036e\5"+
		"r:\2\u036e\u0370\3\2\2\2\u036f\u036a\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0374\7\""+
		"\2\2\u0374\u0376\5r:\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u0378\7#\2\2\u0378\u038a\3\2\2\2\u0379\u037f\7\21\2\2\u037a"+
		"\u037b\7\u0086\2\2\u037b\u037c\5r:\2\u037c\u037d\7w\2\2\u037d\u037e\5"+
		"r:\2\u037e\u0380\3\2\2\2\u037f\u037a\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0384\7\""+
		"\2\2\u0384\u0386\5r:\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387"+
		"\3\2\2\2\u0387\u0388\7#\2\2\u0388\u038a\3\2\2\2\u0389\u0368\3\2\2\2\u0389"+
		"\u0379\3\2\2\2\u038a\u0099\3\2\2\2\u038b\u038c\7\22\2\2\u038c\u038d\7"+
		"\u0178\2\2\u038d\u038e\5r:\2\u038e\u038f\7\t\2\2\u038f\u0390\5\u00aaV"+
		"\2\u0390\u0391\7\u0179\2\2\u0391\u009b\3\2\2\2\u0392\u0399\7\u0090\2\2"+
		"\u0393\u039a\5\u0094K\2\u0394\u0396\7\u017a\2\2\u0395\u0397\5\u00a8U\2"+
		"\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a"+
		"\7\u017b\2\2\u0399\u0393\3\2\2\2\u0399\u0394\3\2\2\2\u039a\u009d\3\2\2"+
		"\2\u039b\u039c\7h\2\2\u039c\u039e\7\u0178\2\2\u039d\u039f\5\u00a8U\2\u039e"+
		"\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7\u0179"+
		"\2\2\u03a1\u009f\3\2\2\2\u03a2\u03a4\7O\2\2\u03a3\u03a2\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\7&\2\2\u03a6\u03a7\5\u0094"+
		"K\2\u03a7\u00a1\3\2\2\2\u03a8\u03aa\7O\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ae\5\u00a4S\2\u03ac\u03ae\5\u00a6"+
		"T\2\u03ad\u03a9\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u00a3\3\2\2\2\u03af"+
		"\u03b6\7B\2\2\u03b0\u03b6\7\62\2\2\u03b1\u03b6\7\u00fd\2\2\u03b2\u03b6"+
		"\7\u0104\2\2\u03b3\u03b4\7\u010b\2\2\u03b4\u03b6\7x\2\2\u03b5\u03af\3"+
		"\2\2\2\u03b5\u03b0\3\2\2\2\u03b5\u03b1\3\2\2\2\u03b5\u03b2\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b6\u00a5\3\2\2\2\u03b7\u03b8\t\24\2\2\u03b8\u00a7\3"+
		"\2\2\2\u03b9\u03be\5r:\2\u03ba\u03bb\7\u0171\2\2\u03bb\u03bd\5r:\2\u03bc"+
		"\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u00a9\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\5\u00d4k\2\u03c2"+
		"\u00ab\3\2\2\2\u03c3\u03c8\5\u00aaV\2\u03c4\u03c5\7\u0171\2\2\u03c5\u03c7"+
		"\5\u00aaV\2\u03c6\u03c4\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2"+
		"\2\u03c8\u03c9\3\2\2\2\u03c9\u00ad\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03ce"+
		"\5\u00b0Y\2\u03cc\u03ce\5\u00d4k\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2"+
		"\2\2\u03ce\u00af\3\2\2\2\u03cf\u03d0\t\25\2\2\u03d0\u00b1\3\2\2\2\u03d1"+
		"\u03d6\5\u00b4[\2\u03d2\u03d3\7\u0171\2\2\u03d3\u03d5\5\u00b4[\2\u03d4"+
		"\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2"+
		"\2\2\u03d7\u03db\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03db\7\u017e\2\2\u03da"+
		"\u03d1\3\2\2\2\u03da\u03d9\3\2\2\2\u03db\u00b3\3\2\2\2\u03dc\u03de\7\u0124"+
		"\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03e5\5r:\2\u03e0\u03e1\5\u00d6l\2\u03e1\u03e2\7\u016d\2\2\u03e2\u03e3"+
		"\5r:\2\u03e3\u03e5\3\2\2\2\u03e4\u03dd\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e5"+
		"\u00b5\3\2\2\2\u03e6\u03e7\5\u00d4k\2\u03e7\u00b7\3\2\2\2\u03e8\u03e9"+
		"\5\u00d4k\2\u03e9\u00b9\3\2\2\2\u03ea\u03eb\5\u00d4k\2\u03eb\u00bb\3\2"+
		"\2\2\u03ec\u03ed\5\u00d4k\2\u03ed\u00bd\3\2\2\2\u03ee\u03ef\5\u00d4k\2"+
		"\u03ef\u00bf\3\2\2\2\u03f0\u03f1\5\u00d4k\2\u03f1\u00c1\3\2\2\2\u03f2"+
		"\u03f6\5\u00c0a\2\u03f3\u03f4\7\u00f0\2\2\u03f4\u03f5\7\20\2\2\u03f5\u03f7"+
		"\5\u00a8U\2\u03f6\u03f3\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2"+
		"\2\u03f8\u03fa\5:\36\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc"+
		"\3\2\2\2\u03fb\u03fd\5\u00c4c\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2"+
		"\2\u03fd\u00c3\3\2\2\2\u03fe\u0400\t\26\2\2\u03ff\u03fe\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0407\3\2\2\2\u0401\u0408\5\u00c6d\2\u0402\u0403"+
		"\7\16\2\2\u0403\u0404\5\u00c6d\2\u0404\u0405\7#\2\2\u0405\u0406\5\u00c6"+
		"d\2\u0406\u0408\3\2\2\2\u0407\u0401\3\2\2\2\u0407\u0402\3\2\2\2\u0408"+
		"\u00c5\3\2\2\2\u0409\u040a\7\u011e\2\2\u040a\u0416\7\u00f4\2\2\u040b\u040c"+
		"\7\34\2\2\u040c\u0416\7h\2\2\u040d\u040e\7\u011e\2\2\u040e\u0416\7\u00ba"+
		"\2\2\u040f\u0410\5r:\2\u0410\u0411\7\u00f4\2\2\u0411\u0416\3\2\2\2\u0412"+
		"\u0413\5r:\2\u0413\u0414\7\u00ba\2\2\u0414\u0416\3\2\2\2\u0415\u0409\3"+
		"\2\2\2\u0415\u040b\3\2\2\2\u0415\u040d\3\2\2\2\u0415\u040f\3\2\2\2\u0415"+
		"\u0412\3\2\2\2\u0416\u00c7\3\2\2\2\u0417\u041c\5\u00ba^\2\u0418\u0419"+
		"\7\u0171\2\2\u0419\u041b\5\u00ba^\2\u041a\u0418\3\2\2\2\u041b\u041e\3"+
		"\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u00c9\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041f\u0424\5\u00bc_\2\u0420\u0421\7\u0171\2\2\u0421\u0423"+
		"\5\u00bc_\2\u0422\u0420\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2"+
		"\2\u0424\u0425\3\2\2\2\u0425\u00cb\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0428"+
		"\5\u00bc_\2\u0428\u0429\5\u00aaV\2\u0429\u00cd\3\2\2\2\u042a\u042f\5\u00cc"+
		"g\2\u042b\u042c\7\u0171\2\2\u042c\u042e\5\u00ccg\2\u042d\u042b\3\2\2\2"+
		"\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u00cf"+
		"\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0433\5\u00d4k\2\u0433\u00d1\3\2\2"+
		"\2\u0434\u0435\5\u00d4k\2\u0435\u00d3\3\2\2\2\u0436\u0437\5\u00d6l\2\u0437"+
		"\u00d5\3\2\2\2\u0438\u043b\t\27\2\2\u0439\u043b\5\u00d8m\2\u043a\u0438"+
		"\3\2\2\2\u043a\u0439\3\2\2\2\u043b\u00d7\3\2\2\2\u043c\u043d\t\30\2\2"+
		"\u043d\u00d9\3\2\2\2{\u00df\u00e4\u00ee\u00f1\u00f4\u00f7\u00fa\u0109"+
		"\u0112\u011d\u0121\u0124\u0128\u012c\u012f\u0132\u0135\u0138\u013b\u013f"+
		"\u0148\u014a\u0151\u0156\u015a\u015f\u0164\u0169\u016d\u0170\u0176\u017d"+
		"\u0186\u018e\u0193\u01a0\u01b5\u01c5\u01ca\u01cd\u01d3\u01dd\u01e2\u01e7"+
		"\u01f4\u01f8\u0202\u0205\u020a\u020f\u0213\u0216\u021b\u0223\u022f\u0232"+
		"\u0237\u0239\u023b\u0241\u0243\u0248\u024f\u0254\u0258\u025f\u0264\u0267"+
		"\u026a\u0270\u0287\u028b\u028e\u02a0\u02aa\u02b2\u02c3\u02d1\u02db\u02e2"+
		"\u0306\u030c\u0313\u0317\u0319\u0326\u032c\u0330\u0334\u0337\u033c\u035e"+
		"\u0371\u0375\u0381\u0385\u0389\u0396\u0399\u039e\u03a3\u03a9\u03ad\u03b5"+
		"\u03be\u03c8\u03cd\u03d6\u03da\u03dd\u03e4\u03f6\u03f9\u03fc\u03ff\u0407"+
		"\u0415\u041c\u0424\u042f\u043a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}