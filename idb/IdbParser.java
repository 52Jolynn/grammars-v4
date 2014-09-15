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
		ROW=102, PRECISION=242, ILIKE=48, EXCEPT=34, BYTEA=336, VARBIT=303, DISTANCE=397, 
		CREATE=24, STRING_LITERAL=410, UNLOGGED=285, TIMEZONE_MINUTE=279, OFF=82, 
		VARIADIC=289, PRECEDING=241, TIMESTAMPTZ=329, REGEXP=250, ANALYZE=141, 
		GEQ=372, NOCOMPRESS=75, XMLDATA=360, DIVIDE=380, GROUPING=191, ASC=8, 
		PRESERVE=243, TRANSACTION=280, REFRESH=249, TEMP=275, MATERIALIZED=214, 
		INTERSECT2D=388, INT=310, SEMI_COLON=365, RLIKE=257, FILE=39, LEADING=61, 
		RESTRICT=255, MILLISECONDS=219, GROUP=44, INTERSECT=56, FETCH=38, USER=126, 
		INTERSECT3D=389, CONSTRAINT=155, TIMEZONE_HOUR=278, MODIFY=72, ALTER=4, 
		FORCE=185, NCHAR=322, TABLE=116, VARCHAR=321, SUB=378, MICROSECONDS=217, 
		FLOAT=316, NOTNULL=76, SUM=271, WHITE_SPACE=412, NOWAIT=78, AT=143, STORAGE=268, 
		AS=7, RIGHT_PAREN=374, GEOMETRY=340, MAXVALUE=216, COMPRESS=22, AVG=144, 
		LEFT=62, TRUNCATE=121, ZONE=299, BOX3D=339, PLUS=377, MODE=71, LIKE=64, 
		COLLATE=151, OUTER=90, BY=14, DEFERRABLE=170, WHENEVER=133, BOX2D=338, 
		VARCHAR2=130, INHERIT=198, RIGHT=100, HAVING=45, SESSION=106, MINUS=69, 
		CONCATENATION_OPERATOR=367, COLON=364, ROWS=103, FORMAT=187, NATURAL=73, 
		LONG=67, PUBLIC=94, UNSECURED=286, WEEK=294, OBJECT_ID=349, INT8=307, 
		CHAR=320, DAY=164, COUNT=159, RELEASE=252, INT2=305, INT1=304, INT4=306, 
		EXPLAIN=37, EXTENDED=179, QUOTE=385, MODULAR=381, QUARTER=245, THAN=276, 
		ESCAPE=175, CONNECT=23, INHERITS=199, INTERSECTION=202, RETURNING=256, 
		LESS=208, DOUBLE=317, ROWNUM=353, COMMENT=20, SELECT=105, INTO=57, ARRAY=142, 
		DUAL=347, NO_INHERIT=228, COALESCE=153, SECOND=261, EPOCH=174, NULL=79, 
		WITHOUT=297, NO=227, EVERY=176, ON=85, MATCH=213, DELETE=28, NUMERIC=318, 
		INET4=337, OF=81, TABLES=272, UNDERLINE=384, VERSIONS_OPERATION=356, DISCARD=171, 
		CUBE=160, NATIONAL=225, OR=88, FILTER=182, CURRVAL=346, COLLECT=152, FALSE=136, 
		UNBOUNDED=283, CURSOR=161, PCTFREE=91, TIMESTAMP=328, RIGHT_SQUARE=376, 
		DEC=165, CONSTRAINTS=156, WHERE=134, NULLIF=230, VAR_SAMP=290, FORWARD=188, 
		YEAR=298, LIMIT=65, MAX=215, DEFERRED=169, FLOAT4=313, CUSTOME_OPERATOR=406, 
		FLOAT8=314, SPACE=411, RESOURCE=98, CROSS=25, USAGE=287, IF=47, RAW=95, 
		GEOMETRY_DUMP=341, BOOLEAN=300, IN=50, MULTIPLY=379, REFERENCES=248, COMMA=366, 
		IS=58, PARTITION=237, SOME=110, EQUAL=363, NEXT=226, CENTURY=148, EXCLUDE=177, 
		WITH=135, INITIALLY=200, REINDEX=96, FUSION=189, GRANT=43, VARBINARY=334, 
		DEFAULT=27, BACKWARD=145, MILLENNIUM=218, SUBSTRING=270, INCREMENT=51, 
		LEFT_OF=391, ASSIGN=362, IMMEDIATE=49, CLUSTER=18, WINDOW=295, GLOBAL=190, 
		MINUTE=222, LEFT_SQUARE=375, INCLUDING=196, LEQ=370, ISODOW=203, OVERWRITE=234, 
		ONLINE=86, VERSIONS_ENDTIME=355, REGEX=409, NOT=77, FOREIGN=186, CACHE=146, 
		PRIVILEGES=93, CHARACTER=149, ACTION=140, MONTH=223, TYPE=282, STDDEV_POP=266, 
		USING=127, NOT_EQUAL=368, BEGIN=11, VALID=288, CAST_OPERATOR=361, UID=122, 
		TSQUERY=332, STDDEV_SAMP=267, BLOB=335, VERSIONS_XID=359, SUBPARTITION=269, 
		KEY=205, INITIAL=53, ELSE=32, NUMBER=80, BOOL=301, TRAILING=119, RECURSIVE=247, 
		ROLLBACK=101, TABLESPACE=273, REAL=315, MAXEXTENTS=68, SEQUENCES=263, 
		LEVEL=63, INSENSITIVE=201, NONE=229, TRIM=281, NOT_SIMILAR_INSENSITIVE=400, 
		WITHIN=296, LOCATION=211, LEFT_PAREN=373, CONNECT_BY_ISLEAF=345, GEOGRAPHY=342, 
		END=33, SIZE=109, RENAME=97, OPTION=87, IDENTITY=195, ISOYEAR=204, AUDIT=10, 
		PLAIN=239, ONLY=233, ISNULL=59, ASYMMETRIC=9, OWNED=235, POSITION=240, 
		TIME=326, BIND_PARAMETER=401, THEN=117, TSVECTOR=331, OFFSET=84, REPLACE=253, 
		COLUMN=19, ACCESS=1, OBJECT_VALUE=350, EXISTS=36, NVARCHAR=323, ADD=2, 
		INTEGER=311, BOX_EQUAL=396, TO=118, SUCCESSFUL=112, SET=107, RELATIVE=251, 
		MIN=220, TEXT=330, HOUR=194, UNION=123, CURRENT=26, NULLS=231, COMMIT=21, 
		SCHEMA=259, CLOSE=150, DECIMAL=319, DROP=31, VERSIONS_STARTSCN=357, BIGINT=312, 
		WHEN=132, MOVE=224, VALIDATE=128, CONCURRENTLY=154, DECLARE=167, START=111, 
		QUOTED_IDENTIFIER=408, BIT=302, REVOKE=99, BETWEEN=12, FIRST=183, PRIOR=92, 
		CAST=16, EXTERNAL=180, ORA_ROWSCN=351, DOUBLE_QUOTE=386, VARYING=292, 
		TRIGGER=120, CASE=15, CASCADE=147, VERBOSE=293, FULL=42, INSERT=55, CARET=382, 
		SAVEPOINT=104, ROWID=352, BOTH=13, TINYINT=308, BLOCK_COMMENT=404, REAL_NUM=403, 
		SYMMETRIC=113, SHARE=108, OFFLINE=83, LAST=206, ABORT=138, SYNONYM=114, 
		UNIQUE=124, VIEW=131, LINE_COMMENT=405, OVERLAPS_ABOVE=394, ROLLUP=258, 
		RESTART=254, ABOVE=393, PRIMARY=244, RIGHT_OF=392, LOCAL=210, EXCLUDING=178, 
		LIST=209, SEQUENCE=262, COSTS=158, VAR_POP=291, NOT_SIMILAR=398, CHECK=17, 
		FROM=41, DISTINCT=30, TEMPORARY=274, SIMPLE=265, MAIN=212, TIMETZ=327, 
		INNER=54, ORDER=89, TIMEZONE=277, DECADE=166, CYCLE=162, GTH=371, UPDATE=125, 
		FOR=40, COLUMN_VALUE=343, HOLD=193, EXCLUSIVE=35, FOLLOWING=184, AND=5, 
		IDENTIFIED=46, SCROLL=260, INTERVAL=325, LOCK=66, OVERLAP=390, INDEX=52, 
		OIDS=232, MLSLABEL=70, MINVALUE=221, UNKNOWN=284, CONTINUE=157, SYSDATE=115, 
		IDENTIFIER=407, PARTITIONS=238, ALL=3, TILDE=387, EXTRACT=181, DOT=383, 
		DOW=172, PARTIAL=236, NOAUDIT=74, DOY=173, LATERAL=207, VERSIONS_STARTTIME=358, 
		VALUES=129, HASH=192, INDEXES=197, RANGE=246, BELOW=395, TRUE=137, JOIN=60, 
		SIMILAR=264, NUM=402, DEFAULTS=168, LTH=369, ANY=6, NEXTVAL=348, CONNECT_BY_ISCYCLE=344, 
		SIMILAR_INSENSITIVE=399, DESC=29, BINARY=333, DATE=324, VERSIONS_ENDSCN=354, 
		ABSOLUTE=139, DATA=163, SMALLINT=309;
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
		"OVERWRITE", "OWNED", "PARTIAL", "PARTITION", "PARTITIONS", "PLAIN", "POSITION", 
		"PRECEDING", "PRECISION", "PRESERVE", "PRIMARY", "QUARTER", "RANGE", "RECURSIVE", 
		"REFERENCES", "REFRESH", "REGEXP", "RELATIVE", "RELEASE", "REPLACE", "RESTART", 
		"RESTRICT", "RETURNING", "RLIKE", "ROLLUP", "SCHEMA", "SCROLL", "SECOND", 
		"SEQUENCE", "SEQUENCES", "SIMILAR", "SIMPLE", "STDDEV_POP", "STDDEV_SAMP", 
		"STORAGE", "SUBPARTITION", "SUBSTRING", "SUM", "TABLES", "TABLESPACE", 
		"TEMPORARY", "TEMP", "THAN", "TIMEZONE", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", 
		"TRANSACTION", "TRIM", "TYPE", "UNBOUNDED", "UNKNOWN", "UNLOGGED", "UNSECURED", 
		"USAGE", "VALID", "VARIADIC", "VAR_SAMP", "VAR_POP", "VARYING", "VERBOSE", 
		"WEEK", "WINDOW", "WITHIN", "WITHOUT", "YEAR", "ZONE", "BOOLEAN", "BOOL", 
		"BIT", "VARBIT", "INT1", "INT2", "INT4", "INT8", "TINYINT", "SMALLINT", 
		"INT", "INTEGER", "BIGINT", "FLOAT4", "FLOAT8", "REAL", "FLOAT", "DOUBLE", 
		"NUMERIC", "DECIMAL", "CHAR", "VARCHAR", "NCHAR", "NVARCHAR", "DATE", 
		"INTERVAL", "TIME", "TIMETZ", "TIMESTAMP", "TIMESTAMPTZ", "TEXT", "TSVECTOR", 
		"TSQUERY", "BINARY", "VARBINARY", "BLOB", "BYTEA", "INET4", "BOX2D", "BOX3D", 
		"GEOMETRY", "GEOMETRY_DUMP", "GEOGRAPHY", "COLUMN_VALUE", "CONNECT_BY_ISCYCLE", 
		"CONNECT_BY_ISLEAF", "CURRVAL", "DUAL", "NEXTVAL", "OBJECT_ID", "OBJECT_VALUE", 
		"ORA_ROWSCN", "ROWID", "ROWNUM", "VERSIONS_ENDSCN", "VERSIONS_ENDTIME", 
		"VERSIONS_OPERATION", "VERSIONS_STARTSCN", "VERSIONS_STARTTIME", "VERSIONS_XID", 
		"XMLDATA", "CAST_OPERATOR", "':='", "'='", "':'", "';'", "','", "'||'", 
		"NOT_EQUAL", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'['", "']'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'", "'_'", "'''", "'\"'", 
		"'~'", "'&&'", "'&&&'", "OVERLAP", "'<<'", "'>>'", "'|>>'", "'|&>'", "'<<|'", 
		"'~='", "DISTANCE", "'!~'", "'~*'", "'!~*'", "BIND_PARAMETER", "NUM", 
		"REAL_NUM", "BLOCK_COMMENT", "LINE_COMMENT", "CUSTOME_OPERATOR", "IDENTIFIER", 
		"QUOTED_IDENTIFIER", "REGEX", "STRING_LITERAL", "' '", "WHITE_SPACE"
	};
	public static final int
		RULE_sql = 0, RULE_statement = 1, RULE_dml = 2, RULE_select_stmt = 3, 
		RULE_update_stmt = 4, RULE_delete_stmt = 5, RULE_insert_stmt = 6, RULE_query_expression = 7, 
		RULE_query_specification = 8, RULE_query_rel = 9, RULE_set_qualifier = 10, 
		RULE_select_list = 11, RULE_select_sublist = 12, RULE_derived_column = 13, 
		RULE_qualified_asterisk = 14, RULE_as_clause = 15, RULE_truth_value = 16, 
		RULE_into_expression = 17, RULE_with_query = 18, RULE_with_query_name = 19, 
		RULE_table_stmt = 20, RULE_subquery = 21, RULE_from_clause = 22, RULE_where_clause = 23, 
		RULE_group_clause = 24, RULE_having_clause = 25, RULE_window_clause = 26, 
		RULE_window_specifier_list = 27, RULE_window_specifier = 28, RULE_order_clause = 29, 
		RULE_sort_specifier_list = 30, RULE_sort_specifier = 31, RULE_order_specification = 32, 
		RULE_operators = 33, RULE_null_ordering = 34, RULE_limit_clause = 35, 
		RULE_offset_clause = 36, RULE_fetch_clause = 37, RULE_for_clause = 38, 
		RULE_count = 39, RULE_start = 40, RULE_table_reference = 41, RULE_simple_table = 42, 
		RULE_joined_table = 43, RULE_join_type = 44, RULE_outer_join_type = 45, 
		RULE_correlation_specification = 46, RULE_derived_column_list = 47, RULE_derived_table = 48, 
		RULE_table_subquery = 49, RULE_function = 50, RULE_join_specification = 51, 
		RULE_join_condition = 52, RULE_named_columns_join = 53, RULE_join_column_list = 54, 
		RULE_values_stmt = 55, RULE_search_condition = 56, RULE_expr = 57, RULE_numeric_literal = 58, 
		RULE_string_literal = 59, RULE_collate_expression = 60, RULE_unary_operator = 61, 
		RULE_custom_operator = 62, RULE_postgis_operator = 63, RULE_expr_list = 64, 
		RULE_datatype = 65, RULE_function_name = 66, RULE_function_reserved_name = 67, 
		RULE_function_args = 68, RULE_function_arg = 69, RULE_database_name = 70, 
		RULE_schema_name = 71, RULE_table_name = 72, RULE_column_name = 73, RULE_window_name = 74, 
		RULE_exists_window_name = 75, RULE_window_definition = 76, RULE_frame_clause = 77, 
		RULE_frame = 78, RULE_table_name_list = 79, RULE_column_name_list = 80, 
		RULE_column_definition = 81, RULE_column_definition_list = 82, RULE_correlation_name = 83, 
		RULE_column_alias = 84, RULE_any_name = 85, RULE_identifier = 86, RULE_nonreserved_keywords = 87;
	public static final String[] ruleNames = {
		"sql", "statement", "dml", "select_stmt", "update_stmt", "delete_stmt", 
		"insert_stmt", "query_expression", "query_specification", "query_rel", 
		"set_qualifier", "select_list", "select_sublist", "derived_column", "qualified_asterisk", 
		"as_clause", "truth_value", "into_expression", "with_query", "with_query_name", 
		"table_stmt", "subquery", "from_clause", "where_clause", "group_clause", 
		"having_clause", "window_clause", "window_specifier_list", "window_specifier", 
		"order_clause", "sort_specifier_list", "sort_specifier", "order_specification", 
		"operators", "null_ordering", "limit_clause", "offset_clause", "fetch_clause", 
		"for_clause", "count", "start", "table_reference", "simple_table", "joined_table", 
		"join_type", "outer_join_type", "correlation_specification", "derived_column_list", 
		"derived_table", "table_subquery", "function", "join_specification", "join_condition", 
		"named_columns_join", "join_column_list", "values_stmt", "search_condition", 
		"expr", "numeric_literal", "string_literal", "collate_expression", "unary_operator", 
		"custom_operator", "postgis_operator", "expr_list", "datatype", "function_name", 
		"function_reserved_name", "function_args", "function_arg", "database_name", 
		"schema_name", "table_name", "column_name", "window_name", "exists_window_name", 
		"window_definition", "frame_clause", "frame", "table_name_list", "column_name_list", 
		"column_definition", "column_definition_list", "correlation_name", "column_alias", 
		"any_name", "identifier", "nonreserved_keywords"
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
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176); statement();
					setState(177); match(SEMI_COLON);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(184); statement();
			setState(186);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(185); match(SEMI_COLON);
				}
			}

			setState(188); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(190); dml();
			}
		}
		catch (RecognitionException re) {
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
			setState(192); select_stmt();
			}
		}
		catch (RecognitionException re) {
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
			setState(194); query_expression();
			setState(196);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(195); order_clause();
				}
			}

			setState(199);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(198); limit_clause();
				}
			}

			setState(202);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(201); offset_clause();
				}
			}

			setState(205);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(204); fetch_clause();
				}
			}

			setState(208);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(207); for_clause();
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
			setState(210); match(UPDATE);
			}
		}
		catch (RecognitionException re) {
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
			setState(212); match(DELETE);
			}
		}
		catch (RecognitionException re) {
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
			setState(214); match(INSERT);
			setState(215); match(INTO);
			}
		}
		catch (RecognitionException re) {
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
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); query_specification();
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218); query_rel();
						setState(219); query_specification();
						}
						} 
					}
					setState(225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); query_specification();
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227); query_rel();
						setState(228); query_expression();
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); match(LEFT_PAREN);
				setState(236); select_stmt();
				setState(237); match(RIGHT_PAREN);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238); query_rel();
						setState(239); query_expression();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); table_stmt();
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
			setState(250);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(249); with_query();
				}
			}

			setState(252); match(SELECT);
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(253); set_qualifier();
				}
				break;
			}
			setState(256); select_list();
			setState(258);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(257); into_expression();
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(260); from_clause();
				}
			}

			setState(264);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(263); where_clause();
				}
			}

			setState(267);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(266); group_clause();
				}
			}

			setState(270);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(269); having_clause();
				}
			}

			setState(273);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(272); window_clause();
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
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(277);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(276);
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
			setState(288);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(DISTINCT);
				setState(286);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(281); match(ON);
					setState(282); match(LEFT_PAREN);
					setState(283); expr_list();
					setState(284); match(RIGHT_PAREN);
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
			setState(290); select_sublist();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(291); match(COMMA);
				setState(292); select_sublist();
				}
				}
				setState(297);
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
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); qualified_asterisk();
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
			setState(302); expr(0);
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(303); as_clause();
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
			setState(309);
			_la = _input.LA(1);
			if (((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ABORT - 138)) | (1L << (ABSOLUTE - 138)) | (1L << (ACTION - 138)) | (1L << (ANALYZE - 138)) | (1L << (ARRAY - 138)) | (1L << (AT - 138)) | (1L << (AVG - 138)) | (1L << (BACKWARD - 138)) | (1L << (CACHE - 138)) | (1L << (CASCADE - 138)) | (1L << (CENTURY - 138)) | (1L << (CHARACTER - 138)) | (1L << (CLOSE - 138)) | (1L << (COLLATE - 138)) | (1L << (COLLECT - 138)) | (1L << (COALESCE - 138)) | (1L << (CONCURRENTLY - 138)) | (1L << (CONSTRAINT - 138)) | (1L << (CONSTRAINTS - 138)) | (1L << (CONTINUE - 138)) | (1L << (COSTS - 138)) | (1L << (COUNT - 138)) | (1L << (CUBE - 138)) | (1L << (CURSOR - 138)) | (1L << (CYCLE - 138)) | (1L << (DATA - 138)) | (1L << (DAY - 138)) | (1L << (DEC - 138)) | (1L << (DECADE - 138)) | (1L << (DECLARE - 138)) | (1L << (DEFAULTS - 138)) | (1L << (DEFERRED - 138)) | (1L << (DEFERRABLE - 138)) | (1L << (DISCARD - 138)) | (1L << (DOW - 138)) | (1L << (DOY - 138)) | (1L << (EPOCH - 138)) | (1L << (ESCAPE - 138)) | (1L << (EVERY - 138)) | (1L << (EXCLUDE - 138)) | (1L << (EXCLUDING - 138)) | (1L << (EXTENDED - 138)) | (1L << (EXTERNAL - 138)) | (1L << (EXTRACT - 138)) | (1L << (FILTER - 138)) | (1L << (FIRST - 138)) | (1L << (FOLLOWING - 138)) | (1L << (FORCE - 138)) | (1L << (FOREIGN - 138)) | (1L << (FORMAT - 138)) | (1L << (FORWARD - 138)) | (1L << (FUSION - 138)) | (1L << (GLOBAL - 138)) | (1L << (GROUPING - 138)) | (1L << (HASH - 138)) | (1L << (HOLD - 138)) | (1L << (HOUR - 138)) | (1L << (IDENTITY - 138)) | (1L << (INCLUDING - 138)) | (1L << (INDEXES - 138)) | (1L << (INHERIT - 138)) | (1L << (INHERITS - 138)) | (1L << (INITIALLY - 138)) | (1L << (INSENSITIVE - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (INTERSECTION - 202)) | (1L << (ISODOW - 202)) | (1L << (ISOYEAR - 202)) | (1L << (KEY - 202)) | (1L << (LAST - 202)) | (1L << (LATERAL - 202)) | (1L << (LESS - 202)) | (1L << (LIST - 202)) | (1L << (LOCAL - 202)) | (1L << (LOCATION - 202)) | (1L << (MAIN - 202)) | (1L << (MATCH - 202)) | (1L << (MATERIALIZED - 202)) | (1L << (MAX - 202)) | (1L << (MAXVALUE - 202)) | (1L << (MICROSECONDS - 202)) | (1L << (MILLENNIUM - 202)) | (1L << (MILLISECONDS - 202)) | (1L << (MIN - 202)) | (1L << (MINVALUE - 202)) | (1L << (MINUTE - 202)) | (1L << (MONTH - 202)) | (1L << (MOVE - 202)) | (1L << (NATIONAL - 202)) | (1L << (NEXT - 202)) | (1L << (NO - 202)) | (1L << (NO_INHERIT - 202)) | (1L << (NONE - 202)) | (1L << (NULLIF - 202)) | (1L << (NULLS - 202)) | (1L << (OIDS - 202)) | (1L << (ONLY - 202)) | (1L << (OVERWRITE - 202)) | (1L << (OWNED - 202)) | (1L << (PARTIAL - 202)) | (1L << (PARTITION - 202)) | (1L << (PARTITIONS - 202)) | (1L << (PLAIN - 202)) | (1L << (POSITION - 202)) | (1L << (PRECEDING - 202)) | (1L << (PRECISION - 202)) | (1L << (PRESERVE - 202)) | (1L << (PRIMARY - 202)) | (1L << (QUARTER - 202)) | (1L << (RANGE - 202)) | (1L << (RECURSIVE - 202)) | (1L << (REFERENCES - 202)) | (1L << (REFRESH - 202)) | (1L << (REGEXP - 202)) | (1L << (RELATIVE - 202)) | (1L << (RELEASE - 202)) | (1L << (REPLACE - 202)) | (1L << (RESTART - 202)) | (1L << (RESTRICT - 202)) | (1L << (RETURNING - 202)) | (1L << (RLIKE - 202)) | (1L << (ROLLUP - 202)) | (1L << (SCHEMA - 202)) | (1L << (SCROLL - 202)) | (1L << (SECOND - 202)) | (1L << (SEQUENCE - 202)) | (1L << (SEQUENCES - 202)) | (1L << (SIMILAR - 202)) | (1L << (SIMPLE - 202)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (STDDEV_POP - 266)) | (1L << (STDDEV_SAMP - 266)) | (1L << (STORAGE - 266)) | (1L << (SUBPARTITION - 266)) | (1L << (SUBSTRING - 266)) | (1L << (SUM - 266)) | (1L << (TABLES - 266)) | (1L << (TABLESPACE - 266)) | (1L << (TEMPORARY - 266)) | (1L << (TEMP - 266)) | (1L << (THAN - 266)) | (1L << (TIMEZONE - 266)) | (1L << (TIMEZONE_HOUR - 266)) | (1L << (TIMEZONE_MINUTE - 266)) | (1L << (TRANSACTION - 266)) | (1L << (TRIM - 266)) | (1L << (TYPE - 266)) | (1L << (UNBOUNDED - 266)) | (1L << (UNKNOWN - 266)) | (1L << (UNLOGGED - 266)) | (1L << (UNSECURED - 266)) | (1L << (USAGE - 266)) | (1L << (VALID - 266)) | (1L << (VARIADIC - 266)) | (1L << (VAR_SAMP - 266)) | (1L << (VAR_POP - 266)) | (1L << (VARYING - 266)) | (1L << (VERBOSE - 266)) | (1L << (WEEK - 266)) | (1L << (WINDOW - 266)) | (1L << (WITHIN - 266)) | (1L << (WITHOUT - 266)) | (1L << (YEAR - 266)) | (1L << (ZONE - 266)) | (1L << (BOOLEAN - 266)) | (1L << (BOOL - 266)) | (1L << (BIT - 266)) | (1L << (VARBIT - 266)) | (1L << (INT1 - 266)) | (1L << (INT2 - 266)) | (1L << (INT4 - 266)) | (1L << (INT8 - 266)) | (1L << (TINYINT - 266)) | (1L << (SMALLINT - 266)) | (1L << (INT - 266)) | (1L << (INTEGER - 266)) | (1L << (BIGINT - 266)) | (1L << (FLOAT4 - 266)) | (1L << (FLOAT8 - 266)) | (1L << (REAL - 266)) | (1L << (FLOAT - 266)) | (1L << (DOUBLE - 266)) | (1L << (NUMERIC - 266)) | (1L << (DECIMAL - 266)) | (1L << (CHAR - 266)) | (1L << (VARCHAR - 266)) | (1L << (NCHAR - 266)) | (1L << (NVARCHAR - 266)) | (1L << (DATE - 266)) | (1L << (INTERVAL - 266)) | (1L << (TIME - 266)) | (1L << (TIMETZ - 266)) | (1L << (TIMESTAMP - 266)) | (1L << (TIMESTAMPTZ - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (TEXT - 330)) | (1L << (TSVECTOR - 330)) | (1L << (TSQUERY - 330)) | (1L << (BINARY - 330)) | (1L << (VARBINARY - 330)) | (1L << (BLOB - 330)) | (1L << (BYTEA - 330)) | (1L << (INET4 - 330)) | (1L << (BOX2D - 330)) | (1L << (BOX3D - 330)) | (1L << (GEOMETRY - 330)) | (1L << (GEOMETRY_DUMP - 330)) | (1L << (GEOGRAPHY - 330)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(306); table_name();
				setState(307); match(DOT);
				}
			}

			setState(311); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
		public Truth_valueContext truth_value() {
			return getRuleContext(Truth_valueContext.class,0);
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
			setState(314);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(313); match(AS);
				}
			}

			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(316); column_alias();
				}
				break;
			case 2:
				{
				setState(317); truth_value();
				}
				break;
			case 3:
				{
				setState(318); match(NULL);
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

	public static class Truth_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(IdbParser.TRUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(IdbParser.UNKNOWN, 0); }
		public TerminalNode FALSE() { return getToken(IdbParser.FALSE, 0); }
		public Truth_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truth_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitTruth_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truth_valueContext truth_value() throws RecognitionException {
		Truth_valueContext _localctx = new Truth_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_truth_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 34, RULE_into_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(INTO);
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (TEMPORARY - 274)) | (1L << (TEMP - 274)) | (1L << (UNLOGGED - 274)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(328);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(327); match(TABLE);
				}
			}

			setState(330); table_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_with_query);
		int _la;
		try {
			_localctx = new WithQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(WITH);
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(333); match(RECURSIVE);
				}
				break;
			}
			setState(336); with_query_name();
			setState(341);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(337); match(LEFT_PAREN);
				setState(338); column_name_list();
				setState(339); match(RIGHT_PAREN);
				}
			}

			setState(343); match(AS);
			setState(344); match(LEFT_PAREN);
			setState(350);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case WITH:
			case LEFT_PAREN:
				{
				setState(345); select_stmt();
				}
				break;
			case VALUES:
				{
				setState(346); values_stmt();
				}
				break;
			case INSERT:
				{
				setState(347); insert_stmt();
				}
				break;
			case UPDATE:
				{
				setState(348); update_stmt();
				}
				break;
			case DELETE:
				{
				setState(349); delete_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(352); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_with_query_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_table_stmt);
		try {
			int _alt;
			_localctx = new TableStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(TABLE);
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(357); match(ONLY);
				}
				break;
			}
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(360); table_name();
					}
					} 
				}
				setState(365);
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
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_subquery);
		try {
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); match(LEFT_PAREN);
				setState(367); select_stmt();
				setState(368); match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370); match(LEFT_PAREN);
				setState(371); values_stmt();
				setState(372); match(RIGHT_PAREN);
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
		enterRule(_localctx, 44, RULE_from_clause);
		int _la;
		try {
			_localctx = new FromClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(FROM);
			setState(377); table_reference();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(378); match(COMMA);
				setState(379); table_reference();
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
		enterRule(_localctx, 46, RULE_where_clause);
		try {
			_localctx = new WhereClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(WHERE);
			setState(386); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_group_clause);
		try {
			_localctx = new GroupClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(GROUP);
			setState(389); match(BY);
			setState(390); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_having_clause);
		try {
			_localctx = new HavingClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(HAVING);
			setState(393); expr_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_window_clause);
		try {
			_localctx = new WindowClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(395); match(WINDOW);
			setState(396); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_window_specifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); window_specifier();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399); match(COMMA);
				setState(400); window_specifier();
				}
				}
				setState(405);
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
		enterRule(_localctx, 56, RULE_window_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); window_name();
			setState(407); match(AS);
			setState(408); window_definition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_order_clause);
		try {
			_localctx = new OrderClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(410); match(ORDER);
			setState(411); match(BY);
			setState(412); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_sort_specifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414); sort_specifier();
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415); match(COMMA);
					setState(416); sort_specifier();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 62, RULE_sort_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); expr(0);
			setState(424);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC || _la==USING) {
				{
				setState(423); order_specification();
				}
			}

			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(426); null_ordering();
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
		enterRule(_localctx, 64, RULE_order_specification);
		try {
			setState(433);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(429); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(430); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(431); match(USING);
				setState(432); operators();
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
		enterRule(_localctx, 66, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & ((1L << (LTH - 369)) | (1L << (GTH - 369)) | (1L << (PLUS - 369)) | (1L << (SUB - 369)) | (1L << (MULTIPLY - 369)) | (1L << (DIVIDE - 369)) | (1L << (MODULAR - 369)) | (1L << (CUSTOME_OPERATOR - 369)))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_null_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(NULLS);
			setState(438);
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
		enterRule(_localctx, 70, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440); match(LIMIT);
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(441); count();
				}
				break;
			case 2:
				{
				setState(442); match(ALL);
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
		enterRule(_localctx, 72, RULE_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(OFFSET);
			setState(446); start();
			setState(448);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(447);
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
		enterRule(_localctx, 74, RULE_fetch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(FETCH);
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(453);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)) | (1L << (STORAGE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)) | (1L << (TSQUERY - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)) | (1L << (BOX_EQUAL - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (DISTANCE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(452); count();
				}
			}

			setState(455);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(456); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_for_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(FOR);
			setState(466);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(459); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(460); match(NO);
				setState(461); match(KEY);
				setState(462); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(463); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(464); match(KEY);
				setState(465); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(470);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(468); match(OF);
				setState(469); table_name_list();
				}
			}

			setState(472); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_table_reference);
		try {
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479); joined_table(0);
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
		enterRule(_localctx, 84, RULE_simple_table);
		try {
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(482); match(ONLY);
					}
					break;
				}
				setState(493);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(488);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(485); database_name();
						setState(486); match(DOT);
						}
						break;
					}
					setState(490); schema_name();
					setState(491); match(DOT);
					}
					break;
				}
				setState(495); table_name();
				setState(497);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(496); match(MULTIPLY);
					}
					break;
				}
				setState(500);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(499); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502); derived_table();
				setState(503); correlation_specification();
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_joined_table, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(508); match(LEFT_PAREN);
				setState(509); joined_table(0);
				setState(510); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(512); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(535);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(515);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(516); match(CROSS);
						setState(517); match(JOIN);
						setState(518); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(519);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(520); match(UNION);
						setState(521); match(JOIN);
						setState(522); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(523);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(525);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(524); match(NATURAL);
							}
						}

						setState(528);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(527); join_type();
							}
						}

						setState(530); match(JOIN);
						setState(531); joined_table(0);
						setState(533);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(532); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 88, RULE_join_type);
		int _la;
		try {
			setState(545);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(540); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(541); outer_join_type();
				setState(543);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(542); match(OUTER);
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
		enterRule(_localctx, 90, RULE_outer_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		enterRule(_localctx, 92, RULE_correlation_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(549); match(AS);
				}
			}

			setState(552); correlation_name();
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(553); match(LEFT_PAREN);
				setState(554); derived_column_list();
				setState(555); match(RIGHT_PAREN);
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
		enterRule(_localctx, 94, RULE_derived_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_derived_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(561); match(LATERAL);
				}
				break;
			}
			setState(566);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(564); table_subquery();
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
				setState(565); function();
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
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_table_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); subquery();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); function_name();
			setState(571); match(LEFT_PAREN);
			setState(573);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(572); set_qualifier();
				}
				break;
			}
			setState(576);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)) | (1L << (STORAGE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)) | (1L << (TSQUERY - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (MULTIPLY - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)) | (1L << (BOX_EQUAL - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (DISTANCE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(575); function_args();
				}
			}

			setState(579);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(578); order_clause();
				}
			}

			setState(581); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_join_specification);
		try {
			setState(585);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(583); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(584); named_columns_join();
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
		enterRule(_localctx, 104, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); match(ON);
			setState(588); search_condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_named_columns_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); match(USING);
			setState(591); match(LEFT_PAREN);
			setState(592); join_column_list();
			setState(593); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_join_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_values_stmt);
		int _la;
		try {
			_localctx = new ValuesStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(VALUES);
			setState(598); match(LEFT_PAREN);
			setState(599); expr_list();
			setState(600); match(RIGHT_PAREN);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_PAREN) {
				{
				{
				setState(601); match(LEFT_PAREN);
				setState(602); expr_list();
				setState(603); match(RIGHT_PAREN);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(610); order_clause();
				}
			}

			setState(614);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(613); limit_clause();
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
		enterRule(_localctx, 112, RULE_search_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(IdbParser.AND, 0); }
		public TerminalNode IS() { return getToken(IdbParser.IS, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(IdbParser.NOT_EQUAL, 0); }
		public TerminalNode DIVIDE() { return getToken(IdbParser.DIVIDE, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(IdbParser.IN, 0); }
		public TerminalNode CONCATENATION_OPERATOR() { return getToken(IdbParser.CONCATENATION_OPERATOR, 0); }
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode GTH() { return getToken(IdbParser.GTH, 0); }
		public TerminalNode NOTNULL() { return getToken(IdbParser.NOTNULL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CARET() { return getToken(IdbParser.CARET, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public TerminalNode LTH() { return getToken(IdbParser.LTH, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode MODULAR() { return getToken(IdbParser.MODULAR, 0); }
		public TerminalNode GEQ() { return getToken(IdbParser.GEQ, 0); }
		public Custom_operatorContext custom_operator() {
			return getRuleContext(Custom_operatorContext.class,0);
		}
		public TerminalNode ISNULL() { return getToken(IdbParser.ISNULL, 0); }
		public TerminalNode CAST_OPERATOR() { return getToken(IdbParser.CAST_OPERATOR, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(IdbParser.OR, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode EQUAL() { return getToken(IdbParser.EQUAL, 0); }
		public TerminalNode DOT(int i) {
			return getToken(IdbParser.DOT, i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(IdbParser.DOT); }
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public TerminalNode LEQ() { return getToken(IdbParser.LEQ, 0); }
		public TerminalNode SUB() { return getToken(IdbParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(619); unary_operator();
				setState(620); expr(18);
				}
				break;
			case 2:
				{
				setState(622); custom_operator();
				setState(623); expr(11);
				}
				break;
			case 3:
				{
				setState(625); match(NOT);
				setState(626); expr(7);
				}
				break;
			case 4:
				{
				setState(627); numeric_literal();
				}
				break;
			case 5:
				{
				setState(628); string_literal();
				}
				break;
			case 6:
				{
				setState(650);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(632);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(629); database_name();
						setState(630); match(DOT);
						}
						break;
					}
					setState(634); schema_name();
					setState(635); match(DOT);
					setState(636); table_name();
					setState(637); match(DOT);
					}
					break;
				case 2:
					{
					setState(642);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(639); schema_name();
						setState(640); match(DOT);
						}
						break;
					}
					setState(644); table_name();
					setState(645); match(DOT);
					}
					break;
				case 3:
					{
					setState(647); table_name();
					setState(648); match(DOT);
					}
					break;
				}
				setState(652); column_name();
				}
				break;
			case 7:
				{
				setState(653); function();
				}
				break;
			case 8:
				{
				setState(654); match(LEFT_PAREN);
				setState(655); expr(0);
				setState(656); match(RIGHT_PAREN);
				}
				break;
			case 9:
				{
				setState(658); subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(704);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(661);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(662); match(CARET);
						setState(663); expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(664);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(665);
						_la = _input.LA(1);
						if ( !(((((_la - 379)) & ~0x3f) == 0 && ((1L << (_la - 379)) & ((1L << (MULTIPLY - 379)) | (1L << (DIVIDE - 379)) | (1L << (MODULAR - 379)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(666); expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(667);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(668);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(669); expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(670);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(671); match(IS);
						setState(672); expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(673);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(674); match(CONCATENATION_OPERATOR);
						setState(675); expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(676);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(677);
						_la = _input.LA(1);
						if ( !(((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & ((1L << (LTH - 369)) | (1L << (LEQ - 369)) | (1L << (GTH - 369)) | (1L << (GEQ - 369)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(678); expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(679);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(680);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(681); expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(682);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(683); match(AND);
						setState(684); expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(685);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(686); match(OR);
						setState(687); expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(688);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(689); match(CAST_OPERATOR);
						setState(690); datatype();
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(691);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(692);
						_la = _input.LA(1);
						if ( !(_la==ISNULL || _la==NOTNULL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(693);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(694); match(IN);
						setState(700);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(695); subquery();
							}
							break;
						case 2:
							{
							setState(696); match(LEFT_PAREN);
							setState(697); expr_list();
							setState(698); match(RIGHT_PAREN);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(702);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(703); collate_expression();
						}
						break;
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode REAL_NUM() { return getToken(IdbParser.REAL_NUM, 0); }
		public TerminalNode NUM() { return getToken(IdbParser.NUM, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
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
		public TerminalNode NULL() { return getToken(IdbParser.NULL, 0); }
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
		enterRule(_localctx, 118, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==NULL || _la==BIND_PARAMETER || _la==STRING_LITERAL) ) {
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
		enterRule(_localctx, 120, RULE_collate_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713); match(COLLATE);
			setState(714); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
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

	public static class Custom_operatorContext extends ParserRuleContext {
		public TerminalNode CUSTOME_OPERATOR() { return getToken(IdbParser.CUSTOME_OPERATOR, 0); }
		public Postgis_operatorContext postgis_operator() {
			return getRuleContext(Postgis_operatorContext.class,0);
		}
		public Custom_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitCustom_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Custom_operatorContext custom_operator() throws RecognitionException {
		Custom_operatorContext _localctx = new Custom_operatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_custom_operator);
		try {
			setState(720);
			switch (_input.LA(1)) {
			case CUSTOME_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); match(CUSTOME_OPERATOR);
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
				setState(719); postgis_operator();
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
		enterRule(_localctx, 126, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if ( !(((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (INTERSECT2D - 388)) | (1L << (INTERSECT3D - 388)) | (1L << (OVERLAP - 388)) | (1L << (LEFT_OF - 388)) | (1L << (RIGHT_OF - 388)) | (1L << (ABOVE - 388)) | (1L << (OVERLAPS_ABOVE - 388)) | (1L << (BELOW - 388)) | (1L << (BOX_EQUAL - 388)) | (1L << (DISTANCE - 388)))) != 0)) ) {
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
		enterRule(_localctx, 128, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724); expr(0);
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725); match(COMMA);
					setState(726); expr(0);
					}
					} 
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 130, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_function_name);
		try {
			setState(736);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(734); function_reserved_name();
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
				setState(735); any_name();
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
		enterRule(_localctx, 134, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
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
		enterRule(_localctx, 136, RULE_function_args);
		int _la;
		try {
			setState(749);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case DEFAULT:
			case LEFT:
			case NOT:
			case NULL:
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
			case BIND_PARAMETER:
			case NUM:
			case REAL_NUM:
			case CUSTOME_OPERATOR:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(740); function_arg();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(741); match(COMMA);
					setState(742); function_arg();
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(748); match(MULTIPLY);
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
		enterRule(_localctx, 138, RULE_function_arg);
		try {
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(751); match(VARIADIC);
					}
					break;
				}
				setState(754); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755); identifier();
				setState(756); match(ASSIGN);
				setState(757); expr(0);
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
		enterRule(_localctx, 140, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773); exists_window_name();
			setState(777);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(774); match(PARTITION);
				setState(775); match(BY);
				setState(776); expr_list();
				}
				break;
			}
			setState(780);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(779); order_clause();
				}
				break;
			}
			setState(783);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << BETWEEN) | (1L << CURRENT) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NOT - 77)) | (1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROWS - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ANALYZE - 141)) | (1L << (ARRAY - 141)) | (1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (KEY - 205)) | (1L << (LAST - 205)) | (1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)) | (1L << (STORAGE - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SUBPARTITION - 269)) | (1L << (SUBSTRING - 269)) | (1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)) | (1L << (TSQUERY - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (BINARY - 333)) | (1L << (VARBINARY - 333)) | (1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (PLUS - 333)) | (1L << (SUB - 333)) | (1L << (INTERSECT2D - 333)) | (1L << (INTERSECT3D - 333)) | (1L << (OVERLAP - 333)) | (1L << (LEFT_OF - 333)) | (1L << (RIGHT_OF - 333)) | (1L << (ABOVE - 333)) | (1L << (OVERLAPS_ABOVE - 333)) | (1L << (BELOW - 333)) | (1L << (BOX_EQUAL - 333)))) != 0) || ((((_la - 397)) & ~0x3f) == 0 && ((1L << (_la - 397)) & ((1L << (DISTANCE - 397)) | (1L << (BIND_PARAMETER - 397)) | (1L << (NUM - 397)) | (1L << (REAL_NUM - 397)) | (1L << (CUSTOME_OPERATOR - 397)) | (1L << (IDENTIFIER - 397)) | (1L << (QUOTED_IDENTIFIER - 397)) | (1L << (STRING_LITERAL - 397)))) != 0)) {
				{
				setState(782); frame_clause();
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
		enterRule(_localctx, 154, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(785);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(794);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CURRENT:
			case DEFAULT:
			case LEFT:
			case NOT:
			case NULL:
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
			case BIND_PARAMETER:
			case NUM:
			case REAL_NUM:
			case CUSTOME_OPERATOR:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(788); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(789); match(BETWEEN);
				setState(790); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(791); match(END);
				setState(792); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 156, RULE_frame);
		try {
			setState(808);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796); match(UNBOUNDED);
				setState(797); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798); match(CURRENT);
				setState(799); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(800); match(UNBOUNDED);
				setState(801); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(802); expr(0);
				setState(803); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(805); expr(0);
				setState(806); match(FOLLOWING);
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
		enterRule(_localctx, 158, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810); table_name();
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(811); match(COMMA);
				setState(812); table_name();
				}
				}
				setState(817);
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
		enterRule(_localctx, 160, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); column_name();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(819); match(COMMA);
				setState(820); column_name();
				}
				}
				setState(825);
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
		enterRule(_localctx, 162, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); column_name();
			setState(827); datatype();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); column_definition();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(830); match(COMMA);
				setState(831); column_definition();
				}
				}
				setState(836);
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
		enterRule(_localctx, 166, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 170, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 172, RULE_identifier);
		int _la;
		try {
			setState(845);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
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
				setState(844); nonreserved_keywords();
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
		enterRule(_localctx, 174, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (ABORT - 138)) | (1L << (ABSOLUTE - 138)) | (1L << (ACTION - 138)) | (1L << (ANALYZE - 138)) | (1L << (ARRAY - 138)) | (1L << (AT - 138)) | (1L << (AVG - 138)) | (1L << (BACKWARD - 138)) | (1L << (CACHE - 138)) | (1L << (CASCADE - 138)) | (1L << (CENTURY - 138)) | (1L << (CHARACTER - 138)) | (1L << (CLOSE - 138)) | (1L << (COLLATE - 138)) | (1L << (COLLECT - 138)) | (1L << (COALESCE - 138)) | (1L << (CONCURRENTLY - 138)) | (1L << (CONSTRAINT - 138)) | (1L << (CONSTRAINTS - 138)) | (1L << (CONTINUE - 138)) | (1L << (COSTS - 138)) | (1L << (COUNT - 138)) | (1L << (CUBE - 138)) | (1L << (CURSOR - 138)) | (1L << (CYCLE - 138)) | (1L << (DATA - 138)) | (1L << (DAY - 138)) | (1L << (DEC - 138)) | (1L << (DECADE - 138)) | (1L << (DECLARE - 138)) | (1L << (DEFAULTS - 138)) | (1L << (DEFERRED - 138)) | (1L << (DEFERRABLE - 138)) | (1L << (DISCARD - 138)) | (1L << (DOW - 138)) | (1L << (DOY - 138)) | (1L << (EPOCH - 138)) | (1L << (ESCAPE - 138)) | (1L << (EVERY - 138)) | (1L << (EXCLUDE - 138)) | (1L << (EXCLUDING - 138)) | (1L << (EXTENDED - 138)) | (1L << (EXTERNAL - 138)) | (1L << (EXTRACT - 138)) | (1L << (FILTER - 138)) | (1L << (FIRST - 138)) | (1L << (FOLLOWING - 138)) | (1L << (FORCE - 138)) | (1L << (FOREIGN - 138)) | (1L << (FORMAT - 138)) | (1L << (FORWARD - 138)) | (1L << (FUSION - 138)) | (1L << (GLOBAL - 138)) | (1L << (GROUPING - 138)) | (1L << (HASH - 138)) | (1L << (HOLD - 138)) | (1L << (HOUR - 138)) | (1L << (IDENTITY - 138)) | (1L << (INCLUDING - 138)) | (1L << (INDEXES - 138)) | (1L << (INHERIT - 138)) | (1L << (INHERITS - 138)) | (1L << (INITIALLY - 138)) | (1L << (INSENSITIVE - 138)))) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (INTERSECTION - 202)) | (1L << (ISODOW - 202)) | (1L << (ISOYEAR - 202)) | (1L << (KEY - 202)) | (1L << (LAST - 202)) | (1L << (LATERAL - 202)) | (1L << (LESS - 202)) | (1L << (LIST - 202)) | (1L << (LOCAL - 202)) | (1L << (LOCATION - 202)) | (1L << (MAIN - 202)) | (1L << (MATCH - 202)) | (1L << (MATERIALIZED - 202)) | (1L << (MAX - 202)) | (1L << (MAXVALUE - 202)) | (1L << (MICROSECONDS - 202)) | (1L << (MILLENNIUM - 202)) | (1L << (MILLISECONDS - 202)) | (1L << (MIN - 202)) | (1L << (MINVALUE - 202)) | (1L << (MINUTE - 202)) | (1L << (MONTH - 202)) | (1L << (MOVE - 202)) | (1L << (NATIONAL - 202)) | (1L << (NEXT - 202)) | (1L << (NO - 202)) | (1L << (NO_INHERIT - 202)) | (1L << (NONE - 202)) | (1L << (NULLIF - 202)) | (1L << (NULLS - 202)) | (1L << (OIDS - 202)) | (1L << (ONLY - 202)) | (1L << (OVERWRITE - 202)) | (1L << (OWNED - 202)) | (1L << (PARTIAL - 202)) | (1L << (PARTITION - 202)) | (1L << (PARTITIONS - 202)) | (1L << (PLAIN - 202)) | (1L << (POSITION - 202)) | (1L << (PRECEDING - 202)) | (1L << (PRECISION - 202)) | (1L << (PRESERVE - 202)) | (1L << (PRIMARY - 202)) | (1L << (QUARTER - 202)) | (1L << (RANGE - 202)) | (1L << (RECURSIVE - 202)) | (1L << (REFERENCES - 202)) | (1L << (REFRESH - 202)) | (1L << (REGEXP - 202)) | (1L << (RELATIVE - 202)) | (1L << (RELEASE - 202)) | (1L << (REPLACE - 202)) | (1L << (RESTART - 202)) | (1L << (RESTRICT - 202)) | (1L << (RETURNING - 202)) | (1L << (RLIKE - 202)) | (1L << (ROLLUP - 202)) | (1L << (SCHEMA - 202)) | (1L << (SCROLL - 202)) | (1L << (SECOND - 202)) | (1L << (SEQUENCE - 202)) | (1L << (SEQUENCES - 202)) | (1L << (SIMILAR - 202)) | (1L << (SIMPLE - 202)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (STDDEV_POP - 266)) | (1L << (STDDEV_SAMP - 266)) | (1L << (STORAGE - 266)) | (1L << (SUBPARTITION - 266)) | (1L << (SUBSTRING - 266)) | (1L << (SUM - 266)) | (1L << (TABLES - 266)) | (1L << (TABLESPACE - 266)) | (1L << (TEMPORARY - 266)) | (1L << (TEMP - 266)) | (1L << (THAN - 266)) | (1L << (TIMEZONE - 266)) | (1L << (TIMEZONE_HOUR - 266)) | (1L << (TIMEZONE_MINUTE - 266)) | (1L << (TRANSACTION - 266)) | (1L << (TRIM - 266)) | (1L << (TYPE - 266)) | (1L << (UNBOUNDED - 266)) | (1L << (UNKNOWN - 266)) | (1L << (UNLOGGED - 266)) | (1L << (UNSECURED - 266)) | (1L << (USAGE - 266)) | (1L << (VALID - 266)) | (1L << (VARIADIC - 266)) | (1L << (VAR_SAMP - 266)) | (1L << (VAR_POP - 266)) | (1L << (VARYING - 266)) | (1L << (VERBOSE - 266)) | (1L << (WEEK - 266)) | (1L << (WINDOW - 266)) | (1L << (WITHIN - 266)) | (1L << (WITHOUT - 266)) | (1L << (YEAR - 266)) | (1L << (ZONE - 266)) | (1L << (BOOLEAN - 266)) | (1L << (BOOL - 266)) | (1L << (BIT - 266)) | (1L << (VARBIT - 266)) | (1L << (INT1 - 266)) | (1L << (INT2 - 266)) | (1L << (INT4 - 266)) | (1L << (INT8 - 266)) | (1L << (TINYINT - 266)) | (1L << (SMALLINT - 266)) | (1L << (INT - 266)) | (1L << (INTEGER - 266)) | (1L << (BIGINT - 266)) | (1L << (FLOAT4 - 266)) | (1L << (FLOAT8 - 266)) | (1L << (REAL - 266)) | (1L << (FLOAT - 266)) | (1L << (DOUBLE - 266)) | (1L << (NUMERIC - 266)) | (1L << (DECIMAL - 266)) | (1L << (CHAR - 266)) | (1L << (VARCHAR - 266)) | (1L << (NCHAR - 266)) | (1L << (NVARCHAR - 266)) | (1L << (DATE - 266)) | (1L << (INTERVAL - 266)) | (1L << (TIME - 266)) | (1L << (TIMETZ - 266)) | (1L << (TIMESTAMP - 266)) | (1L << (TIMESTAMPTZ - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (TEXT - 330)) | (1L << (TSVECTOR - 330)) | (1L << (TSQUERY - 330)) | (1L << (BINARY - 330)) | (1L << (VARBINARY - 330)) | (1L << (BLOB - 330)) | (1L << (BYTEA - 330)) | (1L << (INET4 - 330)) | (1L << (BOX2D - 330)) | (1L << (BOX3D - 330)) | (1L << (GEOMETRY - 330)) | (1L << (GEOMETRY_DUMP - 330)) | (1L << (GEOGRAPHY - 330)))) != 0)) ) {
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
		case 43: return joined_table_sempred((Joined_tableContext)_localctx, predIndex);
		case 57: return expr_sempred((ExprContext)_localctx, predIndex);
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
		case 3: return precpred(_ctx, 17);
		case 4: return precpred(_ctx, 16);
		case 5: return precpred(_ctx, 15);
		case 6: return precpred(_ctx, 14);
		case 7: return precpred(_ctx, 12);
		case 8: return precpred(_ctx, 9);
		case 9: return precpred(_ctx, 8);
		case 10: return precpred(_ctx, 6);
		case 11: return precpred(_ctx, 5);
		case 12: return precpred(_ctx, 19);
		case 13: return precpred(_ctx, 13);
		case 14: return precpred(_ctx, 10);
		case 15: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019e\u0354\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\7\2\u00b6\n\2\f\2\16\2\u00b9"+
		"\13\2\3\2\3\2\5\2\u00bd\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00c7"+
		"\n\5\3\5\5\5\u00ca\n\5\3\5\5\5\u00cd\n\5\3\5\5\5\u00d0\n\5\3\5\5\5\u00d3"+
		"\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00e0\n\t\f\t\16"+
		"\t\u00e3\13\t\3\t\3\t\3\t\3\t\7\t\u00e9\n\t\f\t\16\t\u00ec\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00f4\n\t\f\t\16\t\u00f7\13\t\3\t\5\t\u00fa\n\t"+
		"\3\n\5\n\u00fd\n\n\3\n\3\n\5\n\u0101\n\n\3\n\3\n\5\n\u0105\n\n\3\n\5\n"+
		"\u0108\n\n\3\n\5\n\u010b\n\n\3\n\5\n\u010e\n\n\3\n\5\n\u0111\n\n\3\n\5"+
		"\n\u0114\n\n\3\13\3\13\5\13\u0118\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0121\n\f\5\f\u0123\n\f\3\r\3\r\3\r\7\r\u0128\n\r\f\r\16\r\u012b\13\r"+
		"\3\16\3\16\5\16\u012f\n\16\3\17\3\17\5\17\u0133\n\17\3\20\3\20\3\20\5"+
		"\20\u0138\n\20\3\20\3\20\3\21\5\21\u013d\n\21\3\21\3\21\3\21\5\21\u0142"+
		"\n\21\3\22\3\22\3\23\3\23\5\23\u0148\n\23\3\23\5\23\u014b\n\23\3\23\3"+
		"\23\3\24\3\24\5\24\u0151\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0158\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0161\n\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\5\26\u0169\n\26\3\26\7\26\u016c\n\26\f\26\16\26\u016f\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0179\n\27\3\30\3\30\3\30"+
		"\3\30\7\30\u017f\n\30\f\30\16\30\u0182\13\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0194\n\35"+
		"\f\35\16\35\u0197\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \7 \u01a4\n \f \16 \u01a7\13 \3!\3!\5!\u01ab\n!\3!\5!\u01ae\n!\3\""+
		"\3\"\3\"\3\"\5\"\u01b4\n\"\3#\3#\3$\3$\3$\3%\3%\3%\5%\u01be\n%\3&\3&\3"+
		"&\5&\u01c3\n&\3\'\3\'\3\'\5\'\u01c8\n\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\5(\u01d5\n(\3(\3(\5(\u01d9\n(\3(\3(\3)\3)\3*\3*\3+\3+\5+\u01e3"+
		"\n+\3,\5,\u01e6\n,\3,\3,\3,\5,\u01eb\n,\3,\3,\3,\5,\u01f0\n,\3,\3,\5,"+
		"\u01f4\n,\3,\5,\u01f7\n,\3,\3,\3,\5,\u01fc\n,\3-\3-\3-\3-\3-\3-\5-\u0204"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0210\n-\3-\5-\u0213\n-\3-\3-\3-"+
		"\5-\u0218\n-\7-\u021a\n-\f-\16-\u021d\13-\3.\3.\3.\5.\u0222\n.\5.\u0224"+
		"\n.\3/\3/\3\60\5\60\u0229\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u0230\n\60"+
		"\3\61\3\61\3\62\5\62\u0235\n\62\3\62\3\62\5\62\u0239\n\62\3\63\3\63\3"+
		"\64\3\64\3\64\5\64\u0240\n\64\3\64\5\64\u0243\n\64\3\64\5\64\u0246\n\64"+
		"\3\64\3\64\3\65\3\65\5\65\u024c\n\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\39\39\39\39\39\39\39\39\79\u0260\n9\f9\169\u0263\139\39\5"+
		"9\u0266\n9\39\59\u0269\n9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\5;\u027b\n;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0285\n;\3;\3;\3;\3;\3;\3"+
		";\5;\u028d\n;\3;\3;\3;\3;\3;\3;\3;\5;\u0296\n;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02bf\n;\3;\3;\7;\u02c3\n;\f;\16;\u02c6\13"+
		";\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\5@\u02d3\n@\3A\3A\3B\3B\3B\7B\u02da"+
		"\nB\fB\16B\u02dd\13B\3C\3C\3D\3D\5D\u02e3\nD\3E\3E\3F\3F\3F\7F\u02ea\n"+
		"F\fF\16F\u02ed\13F\3F\5F\u02f0\nF\3G\5G\u02f3\nG\3G\3G\3G\3G\3G\5G\u02fa"+
		"\nG\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3N\3N\5N\u030c\nN\3N\5N"+
		"\u030f\nN\3N\5N\u0312\nN\3O\5O\u0315\nO\3O\3O\3O\3O\3O\3O\5O\u031d\nO"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u032b\nP\3Q\3Q\3Q\7Q\u0330\nQ"+
		"\fQ\16Q\u0333\13Q\3R\3R\3R\7R\u0338\nR\fR\16R\u033b\13R\3S\3S\3S\3T\3"+
		"T\3T\7T\u0343\nT\fT\16T\u0346\13T\3U\3U\3V\3V\3W\3W\3X\3X\5X\u0350\nX"+
		"\3Y\3Y\3Y\3\u016d\4XtZ\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\27\5\2$$::}}"+
		"\4\2\5\5  \4\2\u008a\u008b\u011e\u011e\4\2\u0114\u0115\u011f\u011f\6\2"+
		"\u0173\u0173\u0175\u0175\u017b\u017f\u0198\u0198\4\2\u00b9\u00b9\u00d0"+
		"\u00d0\3\2hi\4\2\u00b9\u00b9\u00e4\u00e4\5\2,,@@ff\3\2\u017d\u017f\3\2"+
		"\u017b\u017c\3\2\u0173\u0176\4\2\u016d\u016d\u0172\u0172\4\2==NN\3\2\u0194"+
		"\u0195\6\2\35\35QQ\u0193\u0193\u019c\u019c\3\2\u0186\u018f\6\2\5\5\b\b"+
		"@@ff\4\2ii\u00f8\u00f8\3\2\u0199\u019a\3\2\u008c\u0158\u037d\2\u00b7\3"+
		"\2\2\2\4\u00c0\3\2\2\2\6\u00c2\3\2\2\2\b\u00c4\3\2\2\2\n\u00d4\3\2\2\2"+
		"\f\u00d6\3\2\2\2\16\u00d8\3\2\2\2\20\u00f9\3\2\2\2\22\u00fc\3\2\2\2\24"+
		"\u0115\3\2\2\2\26\u0122\3\2\2\2\30\u0124\3\2\2\2\32\u012e\3\2\2\2\34\u0130"+
		"\3\2\2\2\36\u0137\3\2\2\2 \u013c\3\2\2\2\"\u0143\3\2\2\2$\u0145\3\2\2"+
		"\2&\u014e\3\2\2\2(\u0164\3\2\2\2*\u0166\3\2\2\2,\u0178\3\2\2\2.\u017a"+
		"\3\2\2\2\60\u0183\3\2\2\2\62\u0186\3\2\2\2\64\u018a\3\2\2\2\66\u018d\3"+
		"\2\2\28\u0190\3\2\2\2:\u0198\3\2\2\2<\u019c\3\2\2\2>\u01a0\3\2\2\2@\u01a8"+
		"\3\2\2\2B\u01b3\3\2\2\2D\u01b5\3\2\2\2F\u01b7\3\2\2\2H\u01ba\3\2\2\2J"+
		"\u01bf\3\2\2\2L\u01c4\3\2\2\2N\u01cc\3\2\2\2P\u01dc\3\2\2\2R\u01de\3\2"+
		"\2\2T\u01e2\3\2\2\2V\u01fb\3\2\2\2X\u0203\3\2\2\2Z\u0223\3\2\2\2\\\u0225"+
		"\3\2\2\2^\u0228\3\2\2\2`\u0231\3\2\2\2b\u0234\3\2\2\2d\u023a\3\2\2\2f"+
		"\u023c\3\2\2\2h\u024b\3\2\2\2j\u024d\3\2\2\2l\u0250\3\2\2\2n\u0255\3\2"+
		"\2\2p\u0257\3\2\2\2r\u026a\3\2\2\2t\u0295\3\2\2\2v\u02c7\3\2\2\2x\u02c9"+
		"\3\2\2\2z\u02cb\3\2\2\2|\u02ce\3\2\2\2~\u02d2\3\2\2\2\u0080\u02d4\3\2"+
		"\2\2\u0082\u02d6\3\2\2\2\u0084\u02de\3\2\2\2\u0086\u02e2\3\2\2\2\u0088"+
		"\u02e4\3\2\2\2\u008a\u02ef\3\2\2\2\u008c\u02f9\3\2\2\2\u008e\u02fb\3\2"+
		"\2\2\u0090\u02fd\3\2\2\2\u0092\u02ff\3\2\2\2\u0094\u0301\3\2\2\2\u0096"+
		"\u0303\3\2\2\2\u0098\u0305\3\2\2\2\u009a\u0307\3\2\2\2\u009c\u0314\3\2"+
		"\2\2\u009e\u032a\3\2\2\2\u00a0\u032c\3\2\2\2\u00a2\u0334\3\2\2\2\u00a4"+
		"\u033c\3\2\2\2\u00a6\u033f\3\2\2\2\u00a8\u0347\3\2\2\2\u00aa\u0349\3\2"+
		"\2\2\u00ac\u034b\3\2\2\2\u00ae\u034f\3\2\2\2\u00b0\u0351\3\2\2\2\u00b2"+
		"\u00b3\5\4\3\2\u00b3\u00b4\7\u016f\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5\4\3\2\u00bb\u00bd\7\u016f"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7\2\2\3\u00bf\3\3\2\2\2\u00c0\u00c1\5\6\4\2\u00c1\5\3\2\2\2\u00c2"+
		"\u00c3\5\b\5\2\u00c3\7\3\2\2\2\u00c4\u00c6\5\20\t\2\u00c5\u00c7\5<\37"+
		"\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca"+
		"\5H%\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\5J&\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u00d0\5L\'\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00d3\5N(\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\t\3\2\2\2\u00d4\u00d5\7\177\2\2\u00d5\13\3\2\2\2\u00d6\u00d7\7\36\2\2"+
		"\u00d7\r\3\2\2\2\u00d8\u00d9\79\2\2\u00d9\u00da\7;\2\2\u00da\17\3\2\2"+
		"\2\u00db\u00e1\5\22\n\2\u00dc\u00dd\5\24\13\2\u00dd\u00de\5\22\n\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00fa\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00ea\5\22\n\2\u00e5\u00e6\5\24\13\2\u00e6\u00e7\5\20\t\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00fa\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\u0177"+
		"\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f5\7\u0178\2\2\u00f0\u00f1\5\24\13\2"+
		"\u00f1\u00f2\5\20\t\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\5*\26\2\u00f9\u00db\3\2\2\2\u00f9\u00e4\3\2"+
		"\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\21\3\2\2\2\u00fb\u00fd"+
		"\5&\24\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\7k\2\2\u00ff\u0101\5\26\f\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\5\30\r\2\u0103\u0105\5$\23\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5."+
		"\30\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u010b\5\60\31\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3"+
		"\2\2\2\u010c\u010e\5\62\32\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0111\5\64\33\2\u0110\u010f\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\5\66\34\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\23\3\2\2\2\u0115\u0117\t\2\2\2\u0116\u0118\t\3\2"+
		"\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\25\3\2\2\2\u0119\u0123"+
		"\7\5\2\2\u011a\u0120\7 \2\2\u011b\u011c\7W\2\2\u011c\u011d\7\u0177\2\2"+
		"\u011d\u011e\5\u0082B\2\u011e\u011f\7\u0178\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011b\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0119\3\2"+
		"\2\2\u0122\u011a\3\2\2\2\u0123\27\3\2\2\2\u0124\u0129\5\32\16\2\u0125"+
		"\u0126\7\u0170\2\2\u0126\u0128\5\32\16\2\u0127\u0125\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\31\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012f\5\34\17\2\u012d\u012f\5\36\20\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f\33\3\2\2\2\u0130\u0132\5t;\2\u0131"+
		"\u0133\5 \21\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\35\3\2\2"+
		"\2\u0134\u0135\5\u0092J\2\u0135\u0136\7\u0181\2\2\u0136\u0138\3\2\2\2"+
		"\u0137\u0134\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\7\u017d\2\2\u013a\37\3\2\2\2\u013b\u013d\7\t\2\2\u013c\u013b\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u0142\5\u00aaV\2\u013f"+
		"\u0142\5\"\22\2\u0140\u0142\7Q\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0140\3\2\2\2\u0142!\3\2\2\2\u0143\u0144\t\4\2\2\u0144#\3\2"+
		"\2\2\u0145\u0147\7;\2\2\u0146\u0148\t\5\2\2\u0147\u0146\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\7v\2\2\u014a\u0149\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\5\u0092J\2\u014d"+
		"%\3\2\2\2\u014e\u0150\7\u0089\2\2\u014f\u0151\7\u00f9\2\2\u0150\u014f"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0157\5(\25\2\u0153"+
		"\u0154\7\u0177\2\2\u0154\u0155\5\u00a2R\2\u0155\u0156\7\u0178\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\7\t\2\2\u015a\u0160\7\u0177\2\2\u015b\u0161\5\b\5\2\u015c"+
		"\u0161\5p9\2\u015d\u0161\5\16\b\2\u015e\u0161\5\n\6\2\u015f\u0161\5\f"+
		"\7\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\u0178"+
		"\2\2\u0163\'\3\2\2\2\u0164\u0165\5\u00acW\2\u0165)\3\2\2\2\u0166\u0168"+
		"\7v\2\2\u0167\u0169\7\u00eb\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2"+
		"\2\u0169\u016d\3\2\2\2\u016a\u016c\5\u0092J\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e+\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u0170\u0171\7\u0177\2\2\u0171\u0172\5\b\5\2\u0172"+
		"\u0173\7\u0178\2\2\u0173\u0179\3\2\2\2\u0174\u0175\7\u0177\2\2\u0175\u0176"+
		"\5p9\2\u0176\u0177\7\u0178\2\2\u0177\u0179\3\2\2\2\u0178\u0170\3\2\2\2"+
		"\u0178\u0174\3\2\2\2\u0179-\3\2\2\2\u017a\u017b\7+\2\2\u017b\u0180\5T"+
		"+\2\u017c\u017d\7\u0170\2\2\u017d\u017f\5T+\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181/\3\2\2\2"+
		"\u0182\u0180\3\2\2\2\u0183\u0184\7\u0088\2\2\u0184\u0185\5r:\2\u0185\61"+
		"\3\2\2\2\u0186\u0187\7.\2\2\u0187\u0188\7\20\2\2\u0188\u0189\5\u0082B"+
		"\2\u0189\63\3\2\2\2\u018a\u018b\7/\2\2\u018b\u018c\5\u0082B\2\u018c\65"+
		"\3\2\2\2\u018d\u018e\7\u0129\2\2\u018e\u018f\58\35\2\u018f\67\3\2\2\2"+
		"\u0190\u0195\5:\36\2\u0191\u0192\7\u0170\2\2\u0192\u0194\5:\36\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u01969\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\5\u0096L\2\u0199\u019a"+
		"\7\t\2\2\u019a\u019b\5\u009aN\2\u019b;\3\2\2\2\u019c\u019d\7[\2\2\u019d"+
		"\u019e\7\20\2\2\u019e\u019f\5> \2\u019f=\3\2\2\2\u01a0\u01a5\5@!\2\u01a1"+
		"\u01a2\7\u0170\2\2\u01a2\u01a4\5@!\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6?\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01aa\5t;\2\u01a9\u01ab\5B\"\2\u01aa\u01a9\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\5F$\2\u01ad\u01ac\3\2\2"+
		"\2\u01ad\u01ae\3\2\2\2\u01aeA\3\2\2\2\u01af\u01b4\7\n\2\2\u01b0\u01b4"+
		"\7\37\2\2\u01b1\u01b2\7\u0081\2\2\u01b2\u01b4\5D#\2\u01b3\u01af\3\2\2"+
		"\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4C\3\2\2\2\u01b5\u01b6"+
		"\t\6\2\2\u01b6E\3\2\2\2\u01b7\u01b8\7\u00e9\2\2\u01b8\u01b9\t\7\2\2\u01b9"+
		"G\3\2\2\2\u01ba\u01bd\7C\2\2\u01bb\u01be\5P)\2\u01bc\u01be\7\5\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01beI\3\2\2\2\u01bf\u01c0\7V\2\2\u01c0"+
		"\u01c2\5R*\2\u01c1\u01c3\t\b\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3K\3\2\2\2\u01c4\u01c5\7(\2\2\u01c5\u01c7\t\t\2\2\u01c6\u01c8\5"+
		"P)\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\t\b\2\2\u01ca\u01cb\7\u00eb\2\2\u01cbM\3\2\2\2\u01cc\u01d4\7*\2"+
		"\2\u01cd\u01d5\7\177\2\2\u01ce\u01cf\7\u00e5\2\2\u01cf\u01d0\7\u00cf\2"+
		"\2\u01d0\u01d5\7\177\2\2\u01d1\u01d5\7n\2\2\u01d2\u01d3\7\u00cf\2\2\u01d3"+
		"\u01d5\7n\2\2\u01d4\u01cd\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01d1\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d7\7S\2\2\u01d7"+
		"\u01d9\5\u00a0Q\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01db\7P\2\2\u01dbO\3\2\2\2\u01dc\u01dd\5t;\2\u01ddQ\3"+
		"\2\2\2\u01de\u01df\5t;\2\u01dfS\3\2\2\2\u01e0\u01e3\5V,\2\u01e1\u01e3"+
		"\5X-\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3U\3\2\2\2\u01e4\u01e6"+
		"\7\u00eb\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ef\3\2\2"+
		"\2\u01e7\u01e8\5\u008eH\2\u01e8\u01e9\7\u0181\2\2\u01e9\u01eb\3\2\2\2"+
		"\u01ea\u01e7\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\5\u0090I\2\u01ed\u01ee\7\u0181\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ea\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\5\u0092J\2"+
		"\u01f2\u01f4\7\u017d\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01f7\5^\60\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01fc\3\2\2\2\u01f8\u01f9\5b\62\2\u01f9\u01fa\5^\60\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01e5\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fcW\3\2\2\2"+
		"\u01fd\u01fe\b-\1\2\u01fe\u01ff\7\u0177\2\2\u01ff\u0200\5X-\2\u0200\u0201"+
		"\7\u0178\2\2\u0201\u0204\3\2\2\2\u0202\u0204\5V,\2\u0203\u01fd\3\2\2\2"+
		"\u0203\u0202\3\2\2\2\u0204\u021b\3\2\2\2\u0205\u0206\f\7\2\2\u0206\u0207"+
		"\7\33\2\2\u0207\u0208\7>\2\2\u0208\u021a\5X-\b\u0209\u020a\f\5\2\2\u020a"+
		"\u020b\7}\2\2\u020b\u020c\7>\2\2\u020c\u021a\5X-\6\u020d\u020f\f\6\2\2"+
		"\u020e\u0210\7K\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212"+
		"\3\2\2\2\u0211\u0213\5Z.\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\7>\2\2\u0215\u0217\5X-\2\u0216\u0218\5h\65"+
		"\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0205"+
		"\3\2\2\2\u0219\u0209\3\2\2\2\u0219\u020d\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cY\3\2\2\2\u021d\u021b\3\2\2\2"+
		"\u021e\u0224\78\2\2\u021f\u0221\5\\/\2\u0220\u0222\7\\\2\2\u0221\u0220"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u021e\3\2\2\2\u0223"+
		"\u021f\3\2\2\2\u0224[\3\2\2\2\u0225\u0226\t\n\2\2\u0226]\3\2\2\2\u0227"+
		"\u0229\7\t\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022f\5\u00a8U\2\u022b\u022c\7\u0177\2\2\u022c\u022d\5`\61"+
		"\2\u022d\u022e\7\u0178\2\2\u022e\u0230\3\2\2\2\u022f\u022b\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230_\3\2\2\2\u0231\u0232\5\u00a2R\2\u0232a\3\2\2\2\u0233"+
		"\u0235\7\u00d1\2\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238"+
		"\3\2\2\2\u0236\u0239\5d\63\2\u0237\u0239\5f\64\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0237\3\2\2\2\u0239c\3\2\2\2\u023a\u023b\5,\27\2\u023be\3\2\2\2\u023c"+
		"\u023d\5\u0086D\2\u023d\u023f\7\u0177\2\2\u023e\u0240\5\26\f\2\u023f\u023e"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u0243\5\u008aF"+
		"\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0246"+
		"\5<\37\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\7\u0178\2\2\u0248g\3\2\2\2\u0249\u024c\5j\66\2\u024a\u024c\5l\67"+
		"\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024ci\3\2\2\2\u024d\u024e"+
		"\7W\2\2\u024e\u024f\5r:\2\u024fk\3\2\2\2\u0250\u0251\7\u0081\2\2\u0251"+
		"\u0252\7\u0177\2\2\u0252\u0253\5n8\2\u0253\u0254\7\u0178\2\2\u0254m\3"+
		"\2\2\2\u0255\u0256\5\u00a2R\2\u0256o\3\2\2\2\u0257\u0258\7\u0083\2\2\u0258"+
		"\u0259\7\u0177\2\2\u0259\u025a\5\u0082B\2\u025a\u0261\7\u0178\2\2\u025b"+
		"\u025c\7\u0177\2\2\u025c\u025d\5\u0082B\2\u025d\u025e\7\u0178\2\2\u025e"+
		"\u0260\3\2\2\2\u025f\u025b\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0266\5<\37\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2"+
		"\2\2\u0267\u0269\5H%\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269q"+
		"\3\2\2\2\u026a\u026b\5t;\2\u026bs\3\2\2\2\u026c\u026d\b;\1\2\u026d\u026e"+
		"\5|?\2\u026e\u026f\5t;\24\u026f\u0296\3\2\2\2\u0270\u0271\5~@\2\u0271"+
		"\u0272\5t;\r\u0272\u0296\3\2\2\2\u0273\u0274\7O\2\2\u0274\u0296\5t;\t"+
		"\u0275\u0296\5v<\2\u0276\u0296\5x=\2\u0277\u0278\5\u008eH\2\u0278\u0279"+
		"\7\u0181\2\2\u0279\u027b\3\2\2\2\u027a\u0277\3\2\2\2\u027a\u027b\3\2\2"+
		"\2\u027b\u027c\3\2\2\2\u027c\u027d\5\u0090I\2\u027d\u027e\7\u0181\2\2"+
		"\u027e\u027f\5\u0092J\2\u027f\u0280\7\u0181\2\2\u0280\u028d\3\2\2\2\u0281"+
		"\u0282\5\u0090I\2\u0282\u0283\7\u0181\2\2\u0283\u0285\3\2\2\2\u0284\u0281"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5\u0092J"+
		"\2\u0287\u0288\7\u0181\2\2\u0288\u028d\3\2\2\2\u0289\u028a\5\u0092J\2"+
		"\u028a\u028b\7\u0181\2\2\u028b\u028d\3\2\2\2\u028c\u027a\3\2\2\2\u028c"+
		"\u0284\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0296\5\u0094K\2\u028f\u0296\5f\64\2\u0290\u0291\7\u0177\2"+
		"\2\u0291\u0292\5t;\2\u0292\u0293\7\u0178\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0296\5,\27\2\u0295\u026c\3\2\2\2\u0295\u0270\3\2\2\2\u0295\u0273\3\2"+
		"\2\2\u0295\u0275\3\2\2\2\u0295\u0276\3\2\2\2\u0295\u028c\3\2\2\2\u0295"+
		"\u028f\3\2\2\2\u0295\u0290\3\2\2\2\u0295\u0294\3\2\2\2\u0296\u02c4\3\2"+
		"\2\2\u0297\u0298\f\23\2\2\u0298\u0299\7\u0180\2\2\u0299\u02c3\5t;\23\u029a"+
		"\u029b\f\22\2\2\u029b\u029c\t\13\2\2\u029c\u02c3\5t;\23\u029d\u029e\f"+
		"\21\2\2\u029e\u029f\t\f\2\2\u029f\u02c3\5t;\22\u02a0\u02a1\f\20\2\2\u02a1"+
		"\u02a2\7<\2\2\u02a2\u02c3\5t;\21\u02a3\u02a4\f\16\2\2\u02a4\u02a5\7\u0171"+
		"\2\2\u02a5\u02c3\5t;\17\u02a6\u02a7\f\13\2\2\u02a7\u02a8\t\r\2\2\u02a8"+
		"\u02c3\5t;\f\u02a9\u02aa\f\n\2\2\u02aa\u02ab\t\16\2\2\u02ab\u02c3\5t;"+
		"\n\u02ac\u02ad\f\b\2\2\u02ad\u02ae\7\7\2\2\u02ae\u02c3\5t;\t\u02af\u02b0"+
		"\f\7\2\2\u02b0\u02b1\7Z\2\2\u02b1\u02c3\5t;\b\u02b2\u02b3\f\25\2\2\u02b3"+
		"\u02b4\7\u016b\2\2\u02b4\u02c3\5\u0084C\2\u02b5\u02b6\f\17\2\2\u02b6\u02c3"+
		"\t\17\2\2\u02b7\u02b8\f\f\2\2\u02b8\u02be\7\64\2\2\u02b9\u02bf\5,\27\2"+
		"\u02ba\u02bb\7\u0177\2\2\u02bb\u02bc\5\u0082B\2\u02bc\u02bd\7\u0178\2"+
		"\2\u02bd\u02bf\3\2\2\2\u02be\u02b9\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf\u02c3"+
		"\3\2\2\2\u02c0\u02c1\f\3\2\2\u02c1\u02c3\5z>\2\u02c2\u0297\3\2\2\2\u02c2"+
		"\u029a\3\2\2\2\u02c2\u029d\3\2\2\2\u02c2\u02a0\3\2\2\2\u02c2\u02a3\3\2"+
		"\2\2\u02c2\u02a6\3\2\2\2\u02c2\u02a9\3\2\2\2\u02c2\u02ac\3\2\2\2\u02c2"+
		"\u02af\3\2\2\2\u02c2\u02b2\3\2\2\2\u02c2\u02b5\3\2\2\2\u02c2\u02b7\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5u\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\t\20\2\2"+
		"\u02c8w\3\2\2\2\u02c9\u02ca\t\21\2\2\u02cay\3\2\2\2\u02cb\u02cc\7\u0099"+
		"\2\2\u02cc\u02cd\5\u0094K\2\u02cd{\3\2\2\2\u02ce\u02cf\t\f\2\2\u02cf}"+
		"\3\2\2\2\u02d0\u02d3\7\u0198\2\2\u02d1\u02d3\5\u0080A\2\u02d2\u02d0\3"+
		"\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\177\3\2\2\2\u02d4\u02d5\t\22\2\2\u02d5"+
		"\u0081\3\2\2\2\u02d6\u02db\5t;\2\u02d7\u02d8\7\u0170\2\2\u02d8\u02da\5"+
		"t;\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u0083\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\5\u00ac"+
		"W\2\u02df\u0085\3\2\2\2\u02e0\u02e3\5\u0088E\2\u02e1\u02e3\5\u00acW\2"+
		"\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u0087\3\2\2\2\u02e4\u02e5"+
		"\t\23\2\2\u02e5\u0089\3\2\2\2\u02e6\u02eb\5\u008cG\2\u02e7\u02e8\7\u0170"+
		"\2\2\u02e8\u02ea\5\u008cG\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f0\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02f0\7\u017d\2\2\u02ef\u02e6\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0"+
		"\u008b\3\2\2\2\u02f1\u02f3\7\u0123\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fa\5t;\2\u02f5\u02f6\5\u00aeX\2"+
		"\u02f6\u02f7\7\u016c\2\2\u02f7\u02f8\5t;\2\u02f8\u02fa\3\2\2\2\u02f9\u02f2"+
		"\3\2\2\2\u02f9\u02f5\3\2\2\2\u02fa\u008d\3\2\2\2\u02fb\u02fc\5\u00acW"+
		"\2\u02fc\u008f\3\2\2\2\u02fd\u02fe\5\u00acW\2\u02fe\u0091\3\2\2\2\u02ff"+
		"\u0300\5\u00acW\2\u0300\u0093\3\2\2\2\u0301\u0302\5\u00acW\2\u0302\u0095"+
		"\3\2\2\2\u0303\u0304\5\u00acW\2\u0304\u0097\3\2\2\2\u0305\u0306\5\u00ac"+
		"W\2\u0306\u0099\3\2\2\2\u0307\u030b\5\u0098M\2\u0308\u0309\7\u00ef\2\2"+
		"\u0309\u030a\7\20\2\2\u030a\u030c\5\u0082B\2\u030b\u0308\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030f\5<\37\2\u030e\u030d\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0312\5\u009cO\2\u0311"+
		"\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u009b\3\2\2\2\u0313\u0315\t\24"+
		"\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031c\3\2\2\2\u0316"+
		"\u031d\5\u009eP\2\u0317\u0318\7\16\2\2\u0318\u0319\5\u009eP\2\u0319\u031a"+
		"\7#\2\2\u031a\u031b\5\u009eP\2\u031b\u031d\3\2\2\2\u031c\u0316\3\2\2\2"+
		"\u031c\u0317\3\2\2\2\u031d\u009d\3\2\2\2\u031e\u031f\7\u011d\2\2\u031f"+
		"\u032b\7\u00f3\2\2\u0320\u0321\7\34\2\2\u0321\u032b\7h\2\2\u0322\u0323"+
		"\7\u011d\2\2\u0323\u032b\7\u00ba\2\2\u0324\u0325\5t;\2\u0325\u0326\7\u00f3"+
		"\2\2\u0326\u032b\3\2\2\2\u0327\u0328\5t;\2\u0328\u0329\7\u00ba\2\2\u0329"+
		"\u032b\3\2\2\2\u032a\u031e\3\2\2\2\u032a\u0320\3\2\2\2\u032a\u0322\3\2"+
		"\2\2\u032a\u0324\3\2\2\2\u032a\u0327\3\2\2\2\u032b\u009f\3\2\2\2\u032c"+
		"\u0331\5\u0092J\2\u032d\u032e\7\u0170\2\2\u032e\u0330\5\u0092J\2\u032f"+
		"\u032d\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u00a1\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0339\5\u0094K\2\u0335"+
		"\u0336\7\u0170\2\2\u0336\u0338\5\u0094K\2\u0337\u0335\3\2\2\2\u0338\u033b"+
		"\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u00a3\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u033d\5\u0094K\2\u033d\u033e\5\u0084C\2\u033e\u00a5"+
		"\3\2\2\2\u033f\u0344\5\u00a4S\2\u0340\u0341\7\u0170\2\2\u0341\u0343\5"+
		"\u00a4S\2\u0342\u0340\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2"+
		"\u0344\u0345\3\2\2\2\u0345\u00a7\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348"+
		"\5\u00acW\2\u0348\u00a9\3\2\2\2\u0349\u034a\5\u00acW\2\u034a\u00ab\3\2"+
		"\2\2\u034b\u034c\5\u00aeX\2\u034c\u00ad\3\2\2\2\u034d\u0350\t\25\2\2\u034e"+
		"\u0350\5\u00b0Y\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350\u00af"+
		"\3\2\2\2\u0351\u0352\t\26\2\2\u0352\u00b1\3\2\2\2c\u00b7\u00bc\u00c6\u00c9"+
		"\u00cc\u00cf\u00d2\u00e1\u00ea\u00f5\u00f9\u00fc\u0100\u0104\u0107\u010a"+
		"\u010d\u0110\u0113\u0117\u0120\u0122\u0129\u012e\u0132\u0137\u013c\u0141"+
		"\u0147\u014a\u0150\u0157\u0160\u0168\u016d\u0178\u0180\u0195\u01a5\u01aa"+
		"\u01ad\u01b3\u01bd\u01c2\u01c7\u01d4\u01d8\u01e2\u01e5\u01ea\u01ef\u01f3"+
		"\u01f6\u01fb\u0203\u020f\u0212\u0217\u0219\u021b\u0221\u0223\u0228\u022f"+
		"\u0234\u0238\u023f\u0242\u0245\u024b\u0261\u0265\u0268\u027a\u0284\u028c"+
		"\u0295\u02be\u02c2\u02c4\u02d2\u02db\u02e2\u02eb\u02ef\u02f2\u02f9\u030b"+
		"\u030e\u0311\u0314\u031c\u032a\u0331\u0339\u0344\u034f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}