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
		ROW=100, PRECISION=240, ILIKE=48, EXCEPT=34, BYTEA=334, VARBIT=301, DISTANCE=395, 
		CREATE=24, STRING_LITERAL=408, UNLOGGED=283, TIMEZONE_MINUTE=277, OFF=80, 
		VARIADIC=287, PRECEDING=239, TIMESTAMPTZ=327, REGEXP=248, ANALYZE=139, 
		GEQ=370, NOCOMPRESS=74, XMLDATA=358, DIVIDE=378, GROUPING=189, ASC=8, 
		PRESERVE=241, TRANSACTION=278, REFRESH=247, TEMP=273, MATERIALIZED=212, 
		INTERSECT2D=386, INT=308, SEMI_COLON=363, RLIKE=255, FILE=39, LEADING=60, 
		RESTRICT=253, MILLISECONDS=217, GROUP=44, INTERSECT=56, FETCH=38, USER=124, 
		INTERSECT3D=387, CONSTRAINT=153, TIMEZONE_HOUR=276, MODIFY=71, CAST_EXPRESSION=359, 
		ALTER=4, FORCE=183, NCHAR=320, TABLE=114, VARCHAR=319, SUB=376, MICROSECONDS=215, 
		FLOAT=314, SUM=269, WHITE_SPACE=410, NOWAIT=76, AT=141, STORAGE=266, AS=7, 
		RIGHT_PAREN=372, GEOMETRY=338, MAXVALUE=214, COMPRESS=22, AVG=142, LEFT=61, 
		TRUNCATE=119, ZONE=297, BOX3D=337, PLUS=375, MODE=70, LIKE=63, COLLATE=149, 
		OUTER=88, BY=14, DEFERRABLE=168, WHENEVER=131, BOX2D=336, VARCHAR2=128, 
		INHERIT=196, RIGHT=98, HAVING=45, SESSION=104, MINUS=68, CONCATENATION_OPERATOR=365, 
		COLON=362, ROWS=101, FORMAT=185, NATURAL=72, LONG=66, PUBLIC=92, UNSECURED=284, 
		WEEK=292, OBJECT_ID=347, INT8=305, CHAR=318, DAY=162, COUNT=157, RELEASE=250, 
		INT2=303, INT1=302, INT4=304, EXPLAIN=37, EXTENDED=177, MODULAR=379, QUOTE=383, 
		QUARTER=243, THAN=274, ESCAPE=173, CONNECT=23, INHERITS=197, INTERSECTION=200, 
		RETURNING=254, LESS=206, DOUBLE=315, ROWNUM=351, COMMENT=20, SELECT=103, 
		INTO=57, ARRAY=140, DUAL=345, NO_INHERIT=226, COALESCE=151, SECOND=259, 
		EPOCH=172, NULL=77, WITHOUT=295, NO=225, EVERY=174, ON=83, MATCH=211, 
		DELETE=28, NUMERIC=316, INET4=335, OF=79, TABLES=270, UNDERLINE=382, VERSIONS_OPERATION=354, 
		DISCARD=169, CUBE=158, NATIONAL=223, OR=86, FILTER=180, CURRVAL=344, COLLECT=150, 
		FALSE=134, UNBOUNDED=281, CURSOR=159, PCTFREE=89, TIMESTAMP=326, RIGHT_SQUARE=374, 
		DEC=163, CONSTRAINTS=154, WHERE=132, NULLIF=228, VAR_SAMP=288, FORWARD=186, 
		YEAR=296, LIMIT=64, MAX=213, DEFERRED=167, FLOAT4=311, FLOAT8=312, SPACE=409, 
		CROSS=25, RESOURCE=96, USAGE=285, IF=47, RAW=93, GEOMETRY_DUMP=339, BOOLEAN=298, 
		IN=50, MULTIPLY=377, REFERENCES=246, COMMA=364, IS=58, PARTITION=235, 
		SOME=108, EQUAL=361, NEXT=224, CENTURY=146, EXCLUDE=175, WITH=133, INITIALLY=198, 
		REINDEX=94, FUSION=187, GRANT=43, VARBINARY=332, DEFAULT=27, BACKWARD=143, 
		MILLENNIUM=216, SUBSTRING=268, INCREMENT=51, LEFT_OF=389, ASSIGN=360, 
		IMMEDIATE=49, CLUSTER=18, WINDOW=293, GLOBAL=188, MINUTE=220, LEFT_SQUARE=373, 
		INCLUDING=194, LEQ=368, ISODOW=201, OVERWRITE=232, ONLINE=84, VERSIONS_ENDTIME=353, 
		REGEX=407, NOT=75, FOREIGN=184, CACHE=144, PRIVILEGES=91, CHARACTER=147, 
		ACTION=138, MONTH=221, TYPE=280, STDDEV_POP=264, USING=125, NOT_EQUAL=366, 
		BEGIN=11, VALID=286, UID=120, TSQUERY=330, STDDEV_SAMP=265, BLOB=333, 
		VERSIONS_XID=357, SUBPARTITION=267, KEY=203, INITIAL=53, ELSE=32, NUMBER=78, 
		BOOL=299, TRAILING=117, RECURSIVE=245, ROLLBACK=99, TABLESPACE=271, REAL=313, 
		MAXEXTENTS=67, SEQUENCES=261, LEVEL=62, INSENSITIVE=199, NONE=227, TRIM=279, 
		NOT_SIMILAR_INSENSITIVE=398, WITHIN=294, LOCATION=209, LEFT_PAREN=371, 
		CONNECT_BY_ISLEAF=343, GEOGRAPHY=340, END=33, SIZE=107, RENAME=95, OPTION=85, 
		IDENTITY=193, ISOYEAR=202, AUDIT=10, PLAIN=237, ONLY=231, ASYMMETRIC=9, 
		OWNED=233, POSITION=238, TIME=324, BIND_PARAMETER=399, THEN=115, TSVECTOR=329, 
		OFFSET=82, REPLACE=251, COLUMN=19, ACCESS=1, OBJECT_VALUE=348, EXISTS=36, 
		NVARCHAR=321, ADD=2, INTEGER=309, BOX_EQUAL=394, TO=116, SUCCESSFUL=110, 
		SET=105, RELATIVE=249, MIN=218, TEXT=328, HOUR=192, UNION=121, CURRENT=26, 
		NULLS=229, COMMIT=21, SCHEMA=257, CLOSE=148, DECIMAL=317, DROP=31, VERSIONS_STARTSCN=355, 
		BIGINT=310, WHEN=130, MOVE=222, VALIDATE=126, CONCURRENTLY=152, DECLARE=165, 
		START=109, QUOTED_IDENTIFIER=406, BIT=300, REVOKE=97, BETWEEN=12, FIRST=181, 
		PRIOR=90, CAST=16, EXTERNAL=178, ORA_ROWSCN=349, DOUBLE_QUOTE=384, VARYING=290, 
		TRIGGER=118, CASE=15, CASCADE=145, VERBOSE=291, FULL=42, INSERT=55, CARET=380, 
		SAVEPOINT=102, ROWID=350, BOTH=13, TINYINT=306, BLOCK_COMMENT=402, REAL_NUM=401, 
		SYMMETRIC=111, SHARE=106, OFFLINE=81, LAST=204, ABORT=136, SYNONYM=112, 
		UNIQUE=122, VIEW=129, LINE_COMMENT=403, OVERLAPS_ABOVE=392, ROLLUP=256, 
		RESTART=252, ABOVE=391, PRIMARY=242, RIGHT_OF=390, LOCAL=208, EXCLUDING=176, 
		LIST=207, SEQUENCE=260, COSTS=156, VAR_POP=289, NOT_SIMILAR=396, CHECK=17, 
		FROM=41, DISTINCT=30, TEMPORARY=272, SIMPLE=263, MAIN=210, TIMETZ=325, 
		INNER=54, ORDER=87, TIMEZONE=275, DECADE=164, CYCLE=160, GTH=369, UPDATE=123, 
		FOR=40, COLUMN_VALUE=341, HOLD=191, EXCLUSIVE=35, FOLLOWING=182, AND=5, 
		IDENTIFIED=46, SCROLL=258, INTERVAL=323, LOCK=65, OVERLAP=388, INDEX=52, 
		OIDS=230, MLSLABEL=69, MINVALUE=219, UNKNOWN=282, CONTINUE=155, SYSDATE=113, 
		IDENTIFIER=405, PARTITIONS=236, ALL=3, TILDE=385, EXTRACT=179, DOT=381, 
		DOW=170, PARTIAL=234, NOAUDIT=73, DOY=171, LATERAL=205, VERSIONS_STARTTIME=356, 
		CUSTOME_OPERAND=404, VALUES=127, HASH=190, INDEXES=195, RANGE=244, BELOW=393, 
		TRUE=135, JOIN=59, SIMILAR=262, NUM=400, DEFAULTS=166, LTH=367, ANY=6, 
		NEXTVAL=346, CONNECT_BY_ISCYCLE=342, SIMILAR_INSENSITIVE=397, DESC=29, 
		BINARY=331, DATE=322, VERSIONS_ENDSCN=352, ABSOLUTE=137, DATA=161, SMALLINT=307;
	public static final String[] tokenNames = {
		"<INVALID>", "ACCESS", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", 
		"ASYMMETRIC", "AUDIT", "BEGIN", "BETWEEN", "BOTH", "BY", "CASE", "CAST", 
		"CHECK", "CLUSTER", "COLUMN", "COMMENT", "COMMIT", "COMPRESS", "CONNECT", 
		"CREATE", "CROSS", "CURRENT", "DEFAULT", "DELETE", "DESC", "DISTINCT", 
		"DROP", "ELSE", "END", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FETCH", 
		"FILE", "FOR", "FROM", "FULL", "GRANT", "GROUP", "HAVING", "IDENTIFIED", 
		"IF", "ILIKE", "IMMEDIATE", "IN", "INCREMENT", "INDEX", "INITIAL", "INNER", 
		"INSERT", "INTERSECT", "INTO", "IS", "JOIN", "LEADING", "LEFT", "LEVEL", 
		"LIKE", "LIMIT", "LOCK", "LONG", "MAXEXTENTS", "MINUS", "MLSLABEL", "MODE", 
		"MODIFY", "NATURAL", "NOAUDIT", "NOCOMPRESS", "NOT", "NOWAIT", "NULL", 
		"NUMBER", "OF", "OFF", "OFFLINE", "OFFSET", "ON", "ONLINE", "OPTION", 
		"OR", "ORDER", "OUTER", "PCTFREE", "PRIOR", "PRIVILEGES", "PUBLIC", "RAW", 
		"REINDEX", "RENAME", "RESOURCE", "REVOKE", "RIGHT", "ROLLBACK", "ROW", 
		"ROWS", "SAVEPOINT", "SELECT", "SESSION", "SET", "SHARE", "SIZE", "SOME", 
		"START", "SUCCESSFUL", "SYMMETRIC", "SYNONYM", "SYSDATE", "TABLE", "THEN", 
		"TO", "TRAILING", "TRIGGER", "TRUNCATE", "UID", "UNION", "UNIQUE", "UPDATE", 
		"USER", "USING", "VALIDATE", "VALUES", "VARCHAR2", "VIEW", "WHEN", "WHENEVER", 
		"WHERE", "WITH", "FALSE", "TRUE", "ABORT", "ABSOLUTE", "ACTION", "ANALYZE", 
		"ARRAY", "AT", "AVG", "BACKWARD", "CACHE", "CASCADE", "CENTURY", "CHARACTER", 
		"CLOSE", "COLLATE", "COLLECT", "COALESCE", "CONCURRENTLY", "CONSTRAINT", 
		"CONSTRAINTS", "CONTINUE", "COSTS", "COUNT", "CUBE", "CURSOR", "CYCLE", 
		"DATA", "DAY", "DEC", "DECADE", "DECLARE", "DEFAULTS", "DEFERRED", "DEFERRABLE", 
		"DISCARD", "DOW", "DOY", "EPOCH", "ESCAPE", "EVERY", "EXCLUDE", "EXCLUDING", 
		"EXTENDED", "EXTERNAL", "EXTRACT", "FILTER", "FIRST", "FOLLOWING", "FORCE", 
		"FOREIGN", "FORMAT", "FORWARD", "FUSION", "GLOBAL", "GROUPING", "HASH", 
		"HOLD", "HOUR", "IDENTITY", "INCLUDING", "INDEXES", "INHERIT", "INHERITS", 
		"INITIALLY", "INSENSITIVE", "INTERSECTION", "ISODOW", "ISOYEAR", "KEY", 
		"LAST", "LATERAL", "LESS", "LIST", "LOCAL", "LOCATION", "MAIN", "MATCH", 
		"MATERIALIZED", "MAX", "MAXVALUE", "MICROSECONDS", "MILLENNIUM", "MILLISECONDS", 
		"MIN", "MINVALUE", "MINUTE", "MONTH", "MOVE", "NATIONAL", "NEXT", "NO", 
		"NO_INHERIT", "NONE", "NULLIF", "NULLS", "OIDS", "ONLY", "OVERWRITE", 
		"OWNED", "PARTIAL", "PARTITION", "PARTITIONS", "PLAIN", "POSITION", "PRECEDING", 
		"PRECISION", "PRESERVE", "PRIMARY", "QUARTER", "RANGE", "RECURSIVE", "REFERENCES", 
		"REFRESH", "REGEXP", "RELATIVE", "RELEASE", "REPLACE", "RESTART", "RESTRICT", 
		"RETURNING", "RLIKE", "ROLLUP", "SCHEMA", "SCROLL", "SECOND", "SEQUENCE", 
		"SEQUENCES", "SIMILAR", "SIMPLE", "STDDEV_POP", "STDDEV_SAMP", "STORAGE", 
		"SUBPARTITION", "SUBSTRING", "SUM", "TABLES", "TABLESPACE", "TEMPORARY", 
		"TEMP", "THAN", "TIMEZONE", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TRANSACTION", 
		"TRIM", "TYPE", "UNBOUNDED", "UNKNOWN", "UNLOGGED", "UNSECURED", "USAGE", 
		"VALID", "VARIADIC", "VAR_SAMP", "VAR_POP", "VARYING", "VERBOSE", "WEEK", 
		"WINDOW", "WITHIN", "WITHOUT", "YEAR", "ZONE", "BOOLEAN", "BOOL", "BIT", 
		"VARBIT", "INT1", "INT2", "INT4", "INT8", "TINYINT", "SMALLINT", "INT", 
		"INTEGER", "BIGINT", "FLOAT4", "FLOAT8", "REAL", "FLOAT", "DOUBLE", "NUMERIC", 
		"DECIMAL", "CHAR", "VARCHAR", "NCHAR", "NVARCHAR", "DATE", "INTERVAL", 
		"TIME", "TIMETZ", "TIMESTAMP", "TIMESTAMPTZ", "TEXT", "TSVECTOR", "TSQUERY", 
		"BINARY", "VARBINARY", "BLOB", "BYTEA", "INET4", "BOX2D", "BOX3D", "GEOMETRY", 
		"GEOMETRY_DUMP", "GEOGRAPHY", "COLUMN_VALUE", "CONNECT_BY_ISCYCLE", "CONNECT_BY_ISLEAF", 
		"CURRVAL", "DUAL", "NEXTVAL", "OBJECT_ID", "OBJECT_VALUE", "ORA_ROWSCN", 
		"ROWID", "ROWNUM", "VERSIONS_ENDSCN", "VERSIONS_ENDTIME", "VERSIONS_OPERATION", 
		"VERSIONS_STARTSCN", "VERSIONS_STARTTIME", "VERSIONS_XID", "XMLDATA", 
		"CAST_EXPRESSION", "':='", "'='", "':'", "';'", "','", "'||'", "NOT_EQUAL", 
		"'<'", "'<='", "'>'", "'>='", "'('", "')'", "'['", "']'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'^'", "'.'", "'_'", "'''", "'\"'", "'~'", "'&&'", 
		"'&&&'", "OVERLAP", "'<<'", "'>>'", "'|>>'", "'|&>'", "'<<|'", "'~='", 
		"DISTANCE", "'!~'", "'~*'", "'!~*'", "BIND_PARAMETER", "NUM", "REAL_NUM", 
		"BLOCK_COMMENT", "LINE_COMMENT", "CUSTOME_OPERAND", "IDENTIFIER", "QUOTED_IDENTIFIER", 
		"REGEX", "STRING_LITERAL", "' '", "WHITE_SPACE"
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
		RULE_postgis_operator = 62, RULE_expr_list = 63, RULE_datatype = 64, RULE_function_name = 65, 
		RULE_function_reserved_name = 66, RULE_function_args = 67, RULE_function_arg = 68, 
		RULE_database_name = 69, RULE_schema_name = 70, RULE_table_name = 71, 
		RULE_column_name = 72, RULE_window_name = 73, RULE_exists_window_name = 74, 
		RULE_window_definition = 75, RULE_frame_clause = 76, RULE_frame = 77, 
		RULE_table_name_list = 78, RULE_column_name_list = 79, RULE_column_definition = 80, 
		RULE_column_definition_list = 81, RULE_correlation_name = 82, RULE_column_alias = 83, 
		RULE_any_name = 84, RULE_identifier = 85, RULE_nonreserved_keywords = 86;
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
		"postgis_operator", "expr_list", "datatype", "function_name", "function_reserved_name", 
		"function_args", "function_arg", "database_name", "schema_name", "table_name", 
		"column_name", "window_name", "exists_window_name", "window_definition", 
		"frame_clause", "frame", "table_name_list", "column_name_list", "column_definition", 
		"column_definition_list", "correlation_name", "column_alias", "any_name", 
		"identifier", "nonreserved_keywords"
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
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174); statement();
					setState(175); match(SEMI_COLON);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(182); statement();
			setState(184);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(183); match(SEMI_COLON);
				}
			}

			setState(186); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(188); dml();
			}
		}
		catch (RecognitionException re) {
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
			setState(190); select_stmt();
			}
		}
		catch (RecognitionException re) {
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
			setState(192); query_expression();
			setState(194);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(193); order_clause();
				}
			}

			setState(197);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(196); limit_clause();
				}
			}

			setState(200);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(199); offset_clause();
				}
			}

			setState(203);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(202); fetch_clause();
				}
			}

			setState(206);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(205); for_clause();
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
			setState(208); match(UPDATE);
			}
		}
		catch (RecognitionException re) {
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
			setState(210); match(DELETE);
			}
		}
		catch (RecognitionException re) {
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
			setState(212); match(INSERT);
			setState(213); match(INTO);
			}
		}
		catch (RecognitionException re) {
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
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); query_specification();
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216); query_rel();
						setState(217); query_specification();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); query_specification();
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225); query_rel();
						setState(226); query_expression();
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); match(LEFT_PAREN);
				setState(234); select_stmt();
				setState(235); match(RIGHT_PAREN);
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(236); query_rel();
						setState(237); query_expression();
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244); table_stmt();
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
			setState(248);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(247); with_query();
				}
			}

			setState(250); match(SELECT);
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(251); set_qualifier();
				}
				break;
			}
			setState(254); select_list();
			setState(256);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(255); into_expression();
				}
			}

			setState(259);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(258); from_clause();
				}
			}

			setState(262);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(261); where_clause();
				}
			}

			setState(265);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(264); group_clause();
				}
			}

			setState(268);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(267); having_clause();
				}
			}

			setState(271);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(270); window_clause();
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
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(275);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(274);
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
			setState(286);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); match(DISTINCT);
				setState(284);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(279); match(ON);
					setState(280); match(LEFT_PAREN);
					setState(281); expr_list();
					setState(282); match(RIGHT_PAREN);
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
			setState(288); select_sublist();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289); match(COMMA);
				setState(290); select_sublist();
				}
				}
				setState(295);
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
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); qualified_asterisk();
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
			setState(300); expr(0);
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(301); as_clause();
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
			setState(307);
			_la = _input.LA(1);
			if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(304); table_name();
				setState(305); match(DOT);
				}
			}

			setState(309); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(312);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(311); match(AS);
				}
			}

			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(314); column_alias();
				}
				break;
			case 2:
				{
				setState(315); truth_value();
				}
				break;
			case 3:
				{
				setState(316); match(NULL);
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
			setState(319);
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
			setState(321); match(INTO);
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (TEMPORARY - 272)) | (1L << (TEMP - 272)) | (1L << (UNLOGGED - 272)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(326);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(325); match(TABLE);
				}
			}

			setState(328); table_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(330); match(WITH);
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(331); match(RECURSIVE);
				}
				break;
			}
			setState(334); with_query_name();
			setState(339);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(335); match(LEFT_PAREN);
				setState(336); column_name_list();
				setState(337); match(RIGHT_PAREN);
				}
			}

			setState(341); match(AS);
			setState(342); match(LEFT_PAREN);
			setState(348);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case WITH:
			case LEFT_PAREN:
				{
				setState(343); select_stmt();
				}
				break;
			case VALUES:
				{
				setState(344); values_stmt();
				}
				break;
			case INSERT:
				{
				setState(345); insert_stmt();
				}
				break;
			case UPDATE:
				{
				setState(346); update_stmt();
				}
				break;
			case DELETE:
				{
				setState(347); delete_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(352); any_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(354); match(TABLE);
			setState(356);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(355); match(ONLY);
				}
				break;
			}
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(358); table_name();
					}
					} 
				}
				setState(363);
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
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(LEFT_PAREN);
				setState(365); select_stmt();
				setState(366); match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); match(LEFT_PAREN);
				setState(369); values_stmt();
				setState(370); match(RIGHT_PAREN);
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
			setState(374); match(FROM);
			setState(375); table_reference();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376); match(COMMA);
				setState(377); table_reference();
				}
				}
				setState(382);
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
			setState(383); match(WHERE);
			setState(384); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(386); match(GROUP);
			setState(387); match(BY);
			setState(388); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(390); match(HAVING);
			setState(391); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(393); match(WINDOW);
			setState(394); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(396); window_specifier();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397); match(COMMA);
				setState(398); window_specifier();
				}
				}
				setState(403);
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
			setState(404); window_name();
			setState(405); match(AS);
			setState(406); window_definition();
			}
		}
		catch (RecognitionException re) {
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
			setState(408); match(ORDER);
			setState(409); match(BY);
			setState(410); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(412); sort_specifier();
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413); match(COMMA);
					setState(414); sort_specifier();
					}
					} 
				}
				setState(419);
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
			setState(420); expr(0);
			setState(422);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC || _la==USING) {
				{
				setState(421); order_specification();
				}
			}

			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(424); null_ordering();
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
			setState(431);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(427); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(428); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(429); match(USING);
				setState(430); operators();
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
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode CUSTOME_OPERAND() { return getToken(IdbParser.CUSTOME_OPERAND, 0); }
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
			setState(433);
			_la = _input.LA(1);
			if ( !(((((_la - 367)) & ~0x3f) == 0 && ((1L << (_la - 367)) & ((1L << (LTH - 367)) | (1L << (GTH - 367)) | (1L << (PLUS - 367)) | (1L << (SUB - 367)) | (1L << (MULTIPLY - 367)) | (1L << (DIVIDE - 367)) | (1L << (MODULAR - 367)) | (1L << (CUSTOME_OPERAND - 367)))) != 0)) ) {
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
			setState(435); match(NULLS);
			setState(436);
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
			setState(438); match(LIMIT);
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(439); count();
				}
				break;
			case 2:
				{
				setState(440); match(ALL);
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
			setState(443); match(OFFSET);
			setState(444); start();
			setState(446);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(445);
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
			setState(448); match(FETCH);
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(451);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (NULL - 68)) | (1L << (RIGHT - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)) | (1L << (LEFT_PAREN - 328)) | (1L << (PLUS - 328)) | (1L << (MULTIPLY - 328)) | (1L << (DIVIDE - 328)) | (1L << (TILDE - 328)) | (1L << (INTERSECT2D - 328)) | (1L << (INTERSECT3D - 328)) | (1L << (OVERLAP - 328)) | (1L << (LEFT_OF - 328)) | (1L << (RIGHT_OF - 328)) | (1L << (ABOVE - 328)))) != 0) || ((((_la - 392)) & ~0x3f) == 0 && ((1L << (_la - 392)) & ((1L << (OVERLAPS_ABOVE - 392)) | (1L << (BELOW - 392)) | (1L << (BOX_EQUAL - 392)) | (1L << (DISTANCE - 392)) | (1L << (NOT_SIMILAR - 392)) | (1L << (SIMILAR_INSENSITIVE - 392)) | (1L << (NOT_SIMILAR_INSENSITIVE - 392)) | (1L << (BIND_PARAMETER - 392)) | (1L << (NUM - 392)) | (1L << (REAL_NUM - 392)) | (1L << (CUSTOME_OPERAND - 392)) | (1L << (IDENTIFIER - 392)) | (1L << (QUOTED_IDENTIFIER - 392)) | (1L << (STRING_LITERAL - 392)))) != 0)) {
				{
				setState(450); count();
				}
			}

			setState(453);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(454); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(456); match(FOR);
			setState(464);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(457); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(458); match(NO);
				setState(459); match(KEY);
				setState(460); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(461); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(462); match(KEY);
				setState(463); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(468);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(466); match(OF);
				setState(467); table_name_list();
				}
			}

			setState(470); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
			setState(472); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477); joined_table(0);
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
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(480); match(ONLY);
					}
					break;
				}
				setState(491);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(486);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(483); database_name();
						setState(484); match(DOT);
						}
						break;
					}
					setState(488); schema_name();
					setState(489); match(DOT);
					}
					break;
				}
				setState(493); table_name();
				setState(495);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(494); match(MULTIPLY);
					}
					break;
				}
				setState(498);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(497); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500); derived_table();
				setState(501); correlation_specification();
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
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(506); match(LEFT_PAREN);
				setState(507); joined_table(0);
				setState(508); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(510); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(533);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(513);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(514); match(CROSS);
						setState(515); match(JOIN);
						setState(516); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(517);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(518); match(UNION);
						setState(519); match(JOIN);
						setState(520); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(521);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(523);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(522); match(NATURAL);
							}
						}

						setState(526);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(525); join_type();
							}
						}

						setState(528); match(JOIN);
						setState(529); joined_table(0);
						setState(531);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(530); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(537);
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
			setState(543);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(538); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(539); outer_join_type();
				setState(541);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(540); match(OUTER);
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
			setState(545);
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
			setState(548);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(547); match(AS);
				}
			}

			setState(550); correlation_name();
			setState(555);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(551); match(LEFT_PAREN);
				setState(552); derived_column_list();
				setState(553); match(RIGHT_PAREN);
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
			setState(557); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(559); match(LATERAL);
				}
				break;
			}
			setState(564);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(562); table_subquery();
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
				setState(563); function();
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
			setState(566); subquery();
			}
		}
		catch (RecognitionException re) {
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
			setState(568); function_name();
			setState(569); match(LEFT_PAREN);
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(570); set_qualifier();
				}
				break;
			}
			setState(574);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (NULL - 68)) | (1L << (RIGHT - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)) | (1L << (LEFT_PAREN - 328)) | (1L << (PLUS - 328)) | (1L << (MULTIPLY - 328)) | (1L << (DIVIDE - 328)) | (1L << (TILDE - 328)) | (1L << (INTERSECT2D - 328)) | (1L << (INTERSECT3D - 328)) | (1L << (OVERLAP - 328)) | (1L << (LEFT_OF - 328)) | (1L << (RIGHT_OF - 328)) | (1L << (ABOVE - 328)))) != 0) || ((((_la - 392)) & ~0x3f) == 0 && ((1L << (_la - 392)) & ((1L << (OVERLAPS_ABOVE - 392)) | (1L << (BELOW - 392)) | (1L << (BOX_EQUAL - 392)) | (1L << (DISTANCE - 392)) | (1L << (NOT_SIMILAR - 392)) | (1L << (SIMILAR_INSENSITIVE - 392)) | (1L << (NOT_SIMILAR_INSENSITIVE - 392)) | (1L << (BIND_PARAMETER - 392)) | (1L << (NUM - 392)) | (1L << (REAL_NUM - 392)) | (1L << (CUSTOME_OPERAND - 392)) | (1L << (IDENTIFIER - 392)) | (1L << (QUOTED_IDENTIFIER - 392)) | (1L << (STRING_LITERAL - 392)))) != 0)) {
				{
				setState(573); function_args();
				}
			}

			setState(577);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(576); order_clause();
				}
			}

			setState(579); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(583);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(581); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(582); named_columns_join();
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
			setState(585); match(ON);
			setState(586); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(588); match(USING);
			setState(589); match(LEFT_PAREN);
			setState(590); join_column_list();
			setState(591); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(593); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(595); match(VALUES);
			setState(596); match(LEFT_PAREN);
			setState(597); expr_list();
			setState(598); match(RIGHT_PAREN);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_PAREN) {
				{
				{
				setState(599); match(LEFT_PAREN);
				setState(600); expr_list();
				setState(601); match(RIGHT_PAREN);
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(608); order_clause();
				}
			}

			setState(612);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(611); limit_clause();
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
			setState(614); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode MODULAR() { return getToken(IdbParser.MODULAR, 0); }
		public TerminalNode GEQ() { return getToken(IdbParser.GEQ, 0); }
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode EQUAL() { return getToken(IdbParser.EQUAL, 0); }
		public TerminalNode DIVIDE() { return getToken(IdbParser.DIVIDE, 0); }
		public TerminalNode DOT(int i) {
			return getToken(IdbParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Collate_expressionContext collate_expression() {
			return getRuleContext(Collate_expressionContext.class,0);
		}
		public TerminalNode GTH() { return getToken(IdbParser.GTH, 0); }
		public List<TerminalNode> DOT() { return getTokens(IdbParser.DOT); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(IdbParser.LEQ, 0); }
		public TerminalNode CARET() { return getToken(IdbParser.CARET, 0); }
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(IdbParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(IdbParser.LEFT_PAREN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LTH() { return getToken(IdbParser.LTH, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
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
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(617); unary_operator();
				setState(618); expr(10);
				}
				break;
			case 2:
				{
				setState(620); numeric_literal();
				}
				break;
			case 3:
				{
				setState(621); string_literal();
				}
				break;
			case 4:
				{
				setState(643);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(625);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(622); database_name();
						setState(623); match(DOT);
						}
						break;
					}
					setState(627); schema_name();
					setState(628); match(DOT);
					setState(629); table_name();
					setState(630); match(DOT);
					}
					break;
				case 2:
					{
					setState(635);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(632); schema_name();
						setState(633); match(DOT);
						}
						break;
					}
					setState(637); table_name();
					setState(638); match(DOT);
					}
					break;
				case 3:
					{
					setState(640); table_name();
					setState(641); match(DOT);
					}
					break;
				}
				setState(645); column_name();
				}
				break;
			case 5:
				{
				setState(646); function();
				}
				break;
			case 6:
				{
				setState(647); match(LEFT_PAREN);
				setState(648); expr(0);
				setState(649); match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				setState(651); subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(671);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(654);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(655); match(CARET);
						setState(656); expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(657);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(658);
						_la = _input.LA(1);
						if ( !(((((_la - 377)) & ~0x3f) == 0 && ((1L << (_la - 377)) & ((1L << (MULTIPLY - 377)) | (1L << (DIVIDE - 377)) | (1L << (MODULAR - 377)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(659); expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(660);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(661);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(662); expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(663);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(664);
						_la = _input.LA(1);
						if ( !(((((_la - 367)) & ~0x3f) == 0 && ((1L << (_la - 367)) & ((1L << (LTH - 367)) | (1L << (LEQ - 367)) | (1L << (GTH - 367)) | (1L << (GEQ - 367)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(665); expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(666);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(667); match(EQUAL);
						setState(668); expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(669);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(670); collate_expression();
						}
						break;
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
			setState(676);
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
			setState(678);
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
			setState(680); match(COLLATE);
			setState(681); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NOT_SIMILAR() { return getToken(IdbParser.NOT_SIMILAR, 0); }
		public TerminalNode TILDE() { return getToken(IdbParser.TILDE, 0); }
		public Postgis_operatorContext postgis_operator() {
			return getRuleContext(Postgis_operatorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(IdbParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(IdbParser.NOT, 0); }
		public TerminalNode NOT_SIMILAR_INSENSITIVE() { return getToken(IdbParser.NOT_SIMILAR_INSENSITIVE, 0); }
		public TerminalNode MULTIPLY() { return getToken(IdbParser.MULTIPLY, 0); }
		public TerminalNode CUSTOME_OPERAND() { return getToken(IdbParser.CUSTOME_OPERAND, 0); }
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public TerminalNode SIMILAR_INSENSITIVE() { return getToken(IdbParser.SIMILAR_INSENSITIVE, 0); }
		public TerminalNode DIVIDE() { return getToken(IdbParser.DIVIDE, 0); }
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
			setState(686);
			switch (_input.LA(1)) {
			case MINUS:
			case PLUS:
			case MULTIPLY:
			case DIVIDE:
			case TILDE:
			case NOT_SIMILAR:
			case SIMILAR_INSENSITIVE:
			case NOT_SIMILAR_INSENSITIVE:
			case CUSTOME_OPERAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				_la = _input.LA(1);
				if ( !(_la==MINUS || ((((_la - 375)) & ~0x3f) == 0 && ((1L << (_la - 375)) & ((1L << (PLUS - 375)) | (1L << (MULTIPLY - 375)) | (1L << (DIVIDE - 375)) | (1L << (TILDE - 375)) | (1L << (NOT_SIMILAR - 375)) | (1L << (SIMILAR_INSENSITIVE - 375)) | (1L << (NOT_SIMILAR_INSENSITIVE - 375)) | (1L << (CUSTOME_OPERAND - 375)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(684); match(NOT);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(685); postgis_operator();
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
		enterRule(_localctx, 124, RULE_postgis_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_la = _input.LA(1);
			if ( !(((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (INTERSECT2D - 386)) | (1L << (INTERSECT3D - 386)) | (1L << (OVERLAP - 386)) | (1L << (LEFT_OF - 386)) | (1L << (RIGHT_OF - 386)) | (1L << (ABOVE - 386)) | (1L << (OVERLAPS_ABOVE - 386)) | (1L << (BELOW - 386)) | (1L << (BOX_EQUAL - 386)) | (1L << (DISTANCE - 386)))) != 0)) ) {
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
		enterRule(_localctx, 126, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690); expr(0);
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691); match(COMMA);
					setState(692); expr(0);
					}
					} 
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		enterRule(_localctx, 128, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_function_name);
		try {
			setState(702);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(700); function_reserved_name();
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
				setState(701); any_name();
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
		enterRule(_localctx, 132, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
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
		enterRule(_localctx, 134, RULE_function_args);
		int _la;
		try {
			setState(715);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706); function_arg();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707); match(COMMA);
					setState(708); function_arg();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714); match(MULTIPLY);
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
		enterRule(_localctx, 136, RULE_function_arg);
		try {
			setState(725);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(717); match(VARIADIC);
					}
					break;
				}
				setState(720); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721); identifier();
				setState(722); match(ASSIGN);
				setState(723); expr(0);
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
		enterRule(_localctx, 138, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); exists_window_name();
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(740); match(PARTITION);
				setState(741); match(BY);
				setState(742); expr_list();
				}
				break;
			}
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(745); order_clause();
				}
				break;
			}
			setState(749);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << BETWEEN) | (1L << CURRENT) | (1L << DEFAULT) | (1L << LEFT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (NULL - 68)) | (1L << (RIGHT - 68)) | (1L << (ROWS - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)) | (1L << (LEFT_PAREN - 328)) | (1L << (PLUS - 328)) | (1L << (MULTIPLY - 328)) | (1L << (DIVIDE - 328)) | (1L << (TILDE - 328)) | (1L << (INTERSECT2D - 328)) | (1L << (INTERSECT3D - 328)) | (1L << (OVERLAP - 328)) | (1L << (LEFT_OF - 328)) | (1L << (RIGHT_OF - 328)) | (1L << (ABOVE - 328)))) != 0) || ((((_la - 392)) & ~0x3f) == 0 && ((1L << (_la - 392)) & ((1L << (OVERLAPS_ABOVE - 392)) | (1L << (BELOW - 392)) | (1L << (BOX_EQUAL - 392)) | (1L << (DISTANCE - 392)) | (1L << (NOT_SIMILAR - 392)) | (1L << (SIMILAR_INSENSITIVE - 392)) | (1L << (NOT_SIMILAR_INSENSITIVE - 392)) | (1L << (BIND_PARAMETER - 392)) | (1L << (NUM - 392)) | (1L << (REAL_NUM - 392)) | (1L << (CUSTOME_OPERAND - 392)) | (1L << (IDENTIFIER - 392)) | (1L << (QUOTED_IDENTIFIER - 392)) | (1L << (STRING_LITERAL - 392)))) != 0)) {
				{
				setState(748); frame_clause();
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
		enterRule(_localctx, 152, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(751);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(760);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CURRENT:
			case DEFAULT:
			case LEFT:
			case MINUS:
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
			case BIND_PARAMETER:
			case NUM:
			case REAL_NUM:
			case CUSTOME_OPERAND:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(754); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(755); match(BETWEEN);
				setState(756); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(757); match(END);
				setState(758); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 154, RULE_frame);
		try {
			setState(774);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762); match(UNBOUNDED);
				setState(763); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764); match(CURRENT);
				setState(765); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766); match(UNBOUNDED);
				setState(767); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(768); expr(0);
				setState(769); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(771); expr(0);
				setState(772); match(FOLLOWING);
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
		enterRule(_localctx, 156, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776); table_name();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(777); match(COMMA);
				setState(778); table_name();
				}
				}
				setState(783);
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
		enterRule(_localctx, 158, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784); column_name();
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(785); match(COMMA);
				setState(786); column_name();
				}
				}
				setState(791);
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
		enterRule(_localctx, 160, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792); column_name();
			setState(793); datatype();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); column_definition();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(796); match(COMMA);
				setState(797); column_definition();
				}
				}
				setState(802);
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
		enterRule(_localctx, 164, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 170, RULE_identifier);
		int _la;
		try {
			setState(811);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
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
				setState(810); nonreserved_keywords();
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
		enterRule(_localctx, 172, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)))) != 0)) ) {
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
		case 3: return precpred(_ctx, 9);
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 7);
		case 6: return precpred(_ctx, 6);
		case 7: return precpred(_ctx, 5);
		case 8: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019c\u0332\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\7\2\u00b4\n\2\f\2\16\2\u00b7\13\2"+
		"\3\2\3\2\5\2\u00bb\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00c5\n\5\3"+
		"\5\5\5\u00c8\n\5\3\5\5\5\u00cb\n\5\3\5\5\5\u00ce\n\5\3\5\5\5\u00d1\n\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00de\n\t\f\t\16\t\u00e1"+
		"\13\t\3\t\3\t\3\t\3\t\7\t\u00e7\n\t\f\t\16\t\u00ea\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00f2\n\t\f\t\16\t\u00f5\13\t\3\t\5\t\u00f8\n\t\3\n\5\n"+
		"\u00fb\n\n\3\n\3\n\5\n\u00ff\n\n\3\n\3\n\5\n\u0103\n\n\3\n\5\n\u0106\n"+
		"\n\3\n\5\n\u0109\n\n\3\n\5\n\u010c\n\n\3\n\5\n\u010f\n\n\3\n\5\n\u0112"+
		"\n\n\3\13\3\13\5\13\u0116\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011f\n"+
		"\f\5\f\u0121\n\f\3\r\3\r\3\r\7\r\u0126\n\r\f\r\16\r\u0129\13\r\3\16\3"+
		"\16\5\16\u012d\n\16\3\17\3\17\5\17\u0131\n\17\3\20\3\20\3\20\5\20\u0136"+
		"\n\20\3\20\3\20\3\21\5\21\u013b\n\21\3\21\3\21\3\21\5\21\u0140\n\21\3"+
		"\22\3\22\3\23\3\23\5\23\u0146\n\23\3\23\5\23\u0149\n\23\3\23\3\23\3\24"+
		"\3\24\5\24\u014f\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0156\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u015f\n\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\5\26\u0167\n\26\3\26\7\26\u016a\n\26\f\26\16\26\u016d\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0177\n\27\3\30\3\30\3\30\3\30"+
		"\7\30\u017d\n\30\f\30\16\30\u0180\13\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0192\n\35\f\35"+
		"\16\35\u0195\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \7"+
		" \u01a2\n \f \16 \u01a5\13 \3!\3!\5!\u01a9\n!\3!\5!\u01ac\n!\3\"\3\"\3"+
		"\"\3\"\5\"\u01b2\n\"\3#\3#\3$\3$\3$\3%\3%\3%\5%\u01bc\n%\3&\3&\3&\5&\u01c1"+
		"\n&\3\'\3\'\3\'\5\'\u01c6\n\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01d3"+
		"\n(\3(\3(\5(\u01d7\n(\3(\3(\3)\3)\3*\3*\3+\3+\5+\u01e1\n+\3,\5,\u01e4"+
		"\n,\3,\3,\3,\5,\u01e9\n,\3,\3,\3,\5,\u01ee\n,\3,\3,\5,\u01f2\n,\3,\5,"+
		"\u01f5\n,\3,\3,\3,\5,\u01fa\n,\3-\3-\3-\3-\3-\3-\5-\u0202\n-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\5-\u020e\n-\3-\5-\u0211\n-\3-\3-\3-\5-\u0216\n-"+
		"\7-\u0218\n-\f-\16-\u021b\13-\3.\3.\3.\5.\u0220\n.\5.\u0222\n.\3/\3/\3"+
		"\60\5\60\u0227\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u022e\n\60\3\61\3\61"+
		"\3\62\5\62\u0233\n\62\3\62\3\62\5\62\u0237\n\62\3\63\3\63\3\64\3\64\3"+
		"\64\5\64\u023e\n\64\3\64\5\64\u0241\n\64\3\64\5\64\u0244\n\64\3\64\3\64"+
		"\3\65\3\65\5\65\u024a\n\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38"+
		"\38\39\39\39\39\39\39\39\39\79\u025e\n9\f9\169\u0261\139\39\59\u0264\n"+
		"9\39\59\u0267\n9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0274\n;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\5;\u027e\n;\3;\3;\3;\3;\3;\3;\5;\u0286\n;\3;\3;\3;\3"+
		";\3;\3;\3;\5;\u028f\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\7;\u02a2\n;\f;\16;\u02a5\13;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\5?\u02b1"+
		"\n?\3@\3@\3A\3A\3A\7A\u02b8\nA\fA\16A\u02bb\13A\3B\3B\3C\3C\5C\u02c1\n"+
		"C\3D\3D\3E\3E\3E\7E\u02c8\nE\fE\16E\u02cb\13E\3E\5E\u02ce\nE\3F\5F\u02d1"+
		"\nF\3F\3F\3F\3F\3F\5F\u02d8\nF\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M"+
		"\3M\3M\3M\5M\u02ea\nM\3M\5M\u02ed\nM\3M\5M\u02f0\nM\3N\5N\u02f3\nN\3N"+
		"\3N\3N\3N\3N\3N\5N\u02fb\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0309"+
		"\nO\3P\3P\3P\7P\u030e\nP\fP\16P\u0311\13P\3Q\3Q\3Q\7Q\u0316\nQ\fQ\16Q"+
		"\u0319\13Q\3R\3R\3R\3S\3S\3S\7S\u0321\nS\fS\16S\u0324\13S\3T\3T\3U\3U"+
		"\3V\3V\3W\3W\5W\u032e\nW\3X\3X\3X\3\u016b\4XtY\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\2\26\5\2$$::{{\4\2\5\5  \4\2\u0088\u0089\u011c\u011c\4\2\u0112"+
		"\u0113\u011d\u011d\6\2\u0171\u0171\u0173\u0173\u0179\u017d\u0196\u0196"+
		"\4\2\u00b7\u00b7\u00ce\u00ce\3\2fg\4\2\u00b7\u00b7\u00e2\u00e2\5\2,,?"+
		"?dd\3\2\u017b\u017d\3\2\u0179\u017a\3\2\u0171\u0174\3\2\u0192\u0193\6"+
		"\2\35\35OO\u0191\u0191\u019a\u019a\b\2FF\u0179\u0179\u017b\u017c\u0183"+
		"\u0183\u018e\u0190\u0196\u0196\3\2\u0184\u018d\6\2\5\5\b\b??dd\4\2gg\u00f6"+
		"\u00f6\3\2\u0197\u0198\3\2\u008a\u0156\u0353\2\u00b5\3\2\2\2\4\u00be\3"+
		"\2\2\2\6\u00c0\3\2\2\2\b\u00c2\3\2\2\2\n\u00d2\3\2\2\2\f\u00d4\3\2\2\2"+
		"\16\u00d6\3\2\2\2\20\u00f7\3\2\2\2\22\u00fa\3\2\2\2\24\u0113\3\2\2\2\26"+
		"\u0120\3\2\2\2\30\u0122\3\2\2\2\32\u012c\3\2\2\2\34\u012e\3\2\2\2\36\u0135"+
		"\3\2\2\2 \u013a\3\2\2\2\"\u0141\3\2\2\2$\u0143\3\2\2\2&\u014c\3\2\2\2"+
		"(\u0162\3\2\2\2*\u0164\3\2\2\2,\u0176\3\2\2\2.\u0178\3\2\2\2\60\u0181"+
		"\3\2\2\2\62\u0184\3\2\2\2\64\u0188\3\2\2\2\66\u018b\3\2\2\28\u018e\3\2"+
		"\2\2:\u0196\3\2\2\2<\u019a\3\2\2\2>\u019e\3\2\2\2@\u01a6\3\2\2\2B\u01b1"+
		"\3\2\2\2D\u01b3\3\2\2\2F\u01b5\3\2\2\2H\u01b8\3\2\2\2J\u01bd\3\2\2\2L"+
		"\u01c2\3\2\2\2N\u01ca\3\2\2\2P\u01da\3\2\2\2R\u01dc\3\2\2\2T\u01e0\3\2"+
		"\2\2V\u01f9\3\2\2\2X\u0201\3\2\2\2Z\u0221\3\2\2\2\\\u0223\3\2\2\2^\u0226"+
		"\3\2\2\2`\u022f\3\2\2\2b\u0232\3\2\2\2d\u0238\3\2\2\2f\u023a\3\2\2\2h"+
		"\u0249\3\2\2\2j\u024b\3\2\2\2l\u024e\3\2\2\2n\u0253\3\2\2\2p\u0255\3\2"+
		"\2\2r\u0268\3\2\2\2t\u028e\3\2\2\2v\u02a6\3\2\2\2x\u02a8\3\2\2\2z\u02aa"+
		"\3\2\2\2|\u02b0\3\2\2\2~\u02b2\3\2\2\2\u0080\u02b4\3\2\2\2\u0082\u02bc"+
		"\3\2\2\2\u0084\u02c0\3\2\2\2\u0086\u02c2\3\2\2\2\u0088\u02cd\3\2\2\2\u008a"+
		"\u02d7\3\2\2\2\u008c\u02d9\3\2\2\2\u008e\u02db\3\2\2\2\u0090\u02dd\3\2"+
		"\2\2\u0092\u02df\3\2\2\2\u0094\u02e1\3\2\2\2\u0096\u02e3\3\2\2\2\u0098"+
		"\u02e5\3\2\2\2\u009a\u02f2\3\2\2\2\u009c\u0308\3\2\2\2\u009e\u030a\3\2"+
		"\2\2\u00a0\u0312\3\2\2\2\u00a2\u031a\3\2\2\2\u00a4\u031d\3\2\2\2\u00a6"+
		"\u0325\3\2\2\2\u00a8\u0327\3\2\2\2\u00aa\u0329\3\2\2\2\u00ac\u032d\3\2"+
		"\2\2\u00ae\u032f\3\2\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\7\u016d\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00ba\5\4\3\2\u00b9\u00bb\7\u016d\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\2\2\3\u00bd\3\3\2\2\2\u00be"+
		"\u00bf\5\6\4\2\u00bf\5\3\2\2\2\u00c0\u00c1\5\b\5\2\u00c1\7\3\2\2\2\u00c2"+
		"\u00c4\5\20\t\2\u00c3\u00c5\5<\37\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5H%\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\5J&\2\u00ca\u00c9\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5L\'\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\5N(\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\t\3\2\2\2\u00d2\u00d3\7}\2\2"+
		"\u00d3\13\3\2\2\2\u00d4\u00d5\7\36\2\2\u00d5\r\3\2\2\2\u00d6\u00d7\79"+
		"\2\2\u00d7\u00d8\7;\2\2\u00d8\17\3\2\2\2\u00d9\u00df\5\22\n\2\u00da\u00db"+
		"\5\24\13\2\u00db\u00dc\5\22\n\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f8"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e8\5\22\n\2\u00e3\u00e4\5\24\13"+
		"\2\u00e4\u00e5\5\20\t\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f8\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\u0175\2\2\u00ec\u00ed\5\b\5\2\u00ed"+
		"\u00f3\7\u0176\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00f0\5\20\t\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\5*"+
		"\26\2\u00f7\u00d9\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\21\3\2\2\2\u00f9\u00fb\5&\24\2\u00fa\u00f9\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\7i\2\2\u00fd\u00ff"+
		"\5\26\f\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0102\5\30\r\2\u0101\u0103\5$\23\2\u0102\u0101\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5.\30\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\5\60\31\2\u0108\u0107\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c\5\62\32\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5\64"+
		"\33\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0112\5\66\34\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\23\3\2"+
		"\2\2\u0113\u0115\t\2\2\2\u0114\u0116\t\3\2\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\25\3\2\2\2\u0117\u0121\7\5\2\2\u0118\u011e\7 \2\2"+
		"\u0119\u011a\7U\2\2\u011a\u011b\7\u0175\2\2\u011b\u011c\5\u0080A\2\u011c"+
		"\u011d\7\u0176\2\2\u011d\u011f\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u0118\3\2\2\2\u0121"+
		"\27\3\2\2\2\u0122\u0127\5\32\16\2\u0123\u0124\7\u016e\2\2\u0124\u0126"+
		"\5\32\16\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\31\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012d"+
		"\5\34\17\2\u012b\u012d\5\36\20\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2"+
		"\2\u012d\33\3\2\2\2\u012e\u0130\5t;\2\u012f\u0131\5 \21\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\35\3\2\2\2\u0132\u0133\5\u0090I\2\u0133"+
		"\u0134\7\u017f\2\2\u0134\u0136\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\u017b\2\2\u0138\37\3\2\2\2"+
		"\u0139\u013b\7\t\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f"+
		"\3\2\2\2\u013c\u0140\5\u00a8U\2\u013d\u0140\5\"\22\2\u013e\u0140\7O\2"+
		"\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140!"+
		"\3\2\2\2\u0141\u0142\t\4\2\2\u0142#\3\2\2\2\u0143\u0145\7;\2\2\u0144\u0146"+
		"\t\5\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0149\7t\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\5\u0090I\2\u014b%\3\2\2\2\u014c\u014e\7\u0087\2\2\u014d"+
		"\u014f\7\u00f7\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0155\5(\25\2\u0151\u0152\7\u0175\2\2\u0152\u0153\5\u00a0"+
		"Q\2\u0153\u0154\7\u0176\2\2\u0154\u0156\3\2\2\2\u0155\u0151\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\t\2\2\u0158\u015e\7\u0175"+
		"\2\2\u0159\u015f\5\b\5\2\u015a\u015f\5p9\2\u015b\u015f\5\16\b\2\u015c"+
		"\u015f\5\n\6\2\u015d\u015f\5\f\7\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2"+
		"\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\7\u0176\2\2\u0161\'\3\2\2\2\u0162\u0163\5\u00aa"+
		"V\2\u0163)\3\2\2\2\u0164\u0166\7t\2\2\u0165\u0167\7\u00e9\2\2\u0166\u0165"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u016a\5\u0090I"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016c+\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\u0175\2\2\u016f"+
		"\u0170\5\b\5\2\u0170\u0171\7\u0176\2\2\u0171\u0177\3\2\2\2\u0172\u0173"+
		"\7\u0175\2\2\u0173\u0174\5p9\2\u0174\u0175\7\u0176\2\2\u0175\u0177\3\2"+
		"\2\2\u0176\u016e\3\2\2\2\u0176\u0172\3\2\2\2\u0177-\3\2\2\2\u0178\u0179"+
		"\7+\2\2\u0179\u017e\5T+\2\u017a\u017b\7\u016e\2\2\u017b\u017d\5T+\2\u017c"+
		"\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f/\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\u0086\2\2\u0182"+
		"\u0183\5r:\2\u0183\61\3\2\2\2\u0184\u0185\7.\2\2\u0185\u0186\7\20\2\2"+
		"\u0186\u0187\5\u0080A\2\u0187\63\3\2\2\2\u0188\u0189\7/\2\2\u0189\u018a"+
		"\5\u0080A\2\u018a\65\3\2\2\2\u018b\u018c\7\u0127\2\2\u018c\u018d\58\35"+
		"\2\u018d\67\3\2\2\2\u018e\u0193\5:\36\2\u018f\u0190\7\u016e\2\2\u0190"+
		"\u0192\5:\36\2\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u01949\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197"+
		"\5\u0094K\2\u0197\u0198\7\t\2\2\u0198\u0199\5\u0098M\2\u0199;\3\2\2\2"+
		"\u019a\u019b\7Y\2\2\u019b\u019c\7\20\2\2\u019c\u019d\5> \2\u019d=\3\2"+
		"\2\2\u019e\u01a3\5@!\2\u019f\u01a0\7\u016e\2\2\u01a0\u01a2\5@!\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4?\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\5t;\2\u01a7\u01a9"+
		"\5B\"\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01ac\5F$\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acA\3\2\2\2\u01ad"+
		"\u01b2\7\n\2\2\u01ae\u01b2\7\37\2\2\u01af\u01b0\7\177\2\2\u01b0\u01b2"+
		"\5D#\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"C\3\2\2\2\u01b3\u01b4\t\6\2\2\u01b4E\3\2\2\2\u01b5\u01b6\7\u00e7\2\2\u01b6"+
		"\u01b7\t\7\2\2\u01b7G\3\2\2\2\u01b8\u01bb\7B\2\2\u01b9\u01bc\5P)\2\u01ba"+
		"\u01bc\7\5\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcI\3\2\2\2"+
		"\u01bd\u01be\7T\2\2\u01be\u01c0\5R*\2\u01bf\u01c1\t\b\2\2\u01c0\u01bf"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1K\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3\u01c5"+
		"\t\t\2\2\u01c4\u01c6\5P)\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\t\b\2\2\u01c8\u01c9\7\u00e9\2\2\u01c9M\3\2"+
		"\2\2\u01ca\u01d2\7*\2\2\u01cb\u01d3\7}\2\2\u01cc\u01cd\7\u00e3\2\2\u01cd"+
		"\u01ce\7\u00cd\2\2\u01ce\u01d3\7}\2\2\u01cf\u01d3\7l\2\2\u01d0\u01d1\7"+
		"\u00cd\2\2\u01d1\u01d3\7l\2\2\u01d2\u01cb\3\2\2\2\u01d2\u01cc\3\2\2\2"+
		"\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d5"+
		"\7Q\2\2\u01d5\u01d7\5\u009eP\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7N\2\2\u01d9O\3\2\2\2\u01da\u01db\5t"+
		";\2\u01dbQ\3\2\2\2\u01dc\u01dd\5t;\2\u01ddS\3\2\2\2\u01de\u01e1\5V,\2"+
		"\u01df\u01e1\5X-\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1U\3\2"+
		"\2\2\u01e2\u01e4\7\u00e9\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01ed\3\2\2\2\u01e5\u01e6\5\u008cG\2\u01e6\u01e7\7\u017f\2\2\u01e7\u01e9"+
		"\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\5\u008eH\2\u01eb\u01ec\7\u017f\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01e8"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\5\u0090I"+
		"\2\u01f0\u01f2\7\u017b\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01f5\5^\60\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01fa\3\2\2\2\u01f6\u01f7\5b\62\2\u01f7\u01f8\5^\60\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01e3\3\2\2\2\u01f9\u01f6\3\2\2\2\u01faW\3\2\2\2"+
		"\u01fb\u01fc\b-\1\2\u01fc\u01fd\7\u0175\2\2\u01fd\u01fe\5X-\2\u01fe\u01ff"+
		"\7\u0176\2\2\u01ff\u0202\3\2\2\2\u0200\u0202\5V,\2\u0201\u01fb\3\2\2\2"+
		"\u0201\u0200\3\2\2\2\u0202\u0219\3\2\2\2\u0203\u0204\f\7\2\2\u0204\u0205"+
		"\7\33\2\2\u0205\u0206\7=\2\2\u0206\u0218\5X-\b\u0207\u0208\f\5\2\2\u0208"+
		"\u0209\7{\2\2\u0209\u020a\7=\2\2\u020a\u0218\5X-\6\u020b\u020d\f\6\2\2"+
		"\u020c\u020e\7J\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210"+
		"\3\2\2\2\u020f\u0211\5Z.\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\7=\2\2\u0213\u0215\5X-\2\u0214\u0216\5h\65"+
		"\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0203"+
		"\3\2\2\2\u0217\u0207\3\2\2\2\u0217\u020b\3\2\2\2\u0218\u021b\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021aY\3\2\2\2\u021b\u0219\3\2\2\2"+
		"\u021c\u0222\78\2\2\u021d\u021f\5\\/\2\u021e\u0220\7Z\2\2\u021f\u021e"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021c\3\2\2\2\u0221"+
		"\u021d\3\2\2\2\u0222[\3\2\2\2\u0223\u0224\t\n\2\2\u0224]\3\2\2\2\u0225"+
		"\u0227\7\t\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u022d\5\u00a6T\2\u0229\u022a\7\u0175\2\2\u022a\u022b\5`\61"+
		"\2\u022b\u022c\7\u0176\2\2\u022c\u022e\3\2\2\2\u022d\u0229\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e_\3\2\2\2\u022f\u0230\5\u00a0Q\2\u0230a\3\2\2\2\u0231"+
		"\u0233\7\u00cf\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0236"+
		"\3\2\2\2\u0234\u0237\5d\63\2\u0235\u0237\5f\64\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237c\3\2\2\2\u0238\u0239\5,\27\2\u0239e\3\2\2\2\u023a"+
		"\u023b\5\u0084C\2\u023b\u023d\7\u0175\2\2\u023c\u023e\5\26\f\2\u023d\u023c"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\5\u0088E"+
		"\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0244"+
		"\5<\37\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\7\u0176\2\2\u0246g\3\2\2\2\u0247\u024a\5j\66\2\u0248\u024a\5l\67"+
		"\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024ai\3\2\2\2\u024b\u024c"+
		"\7U\2\2\u024c\u024d\5r:\2\u024dk\3\2\2\2\u024e\u024f\7\177\2\2\u024f\u0250"+
		"\7\u0175\2\2\u0250\u0251\5n8\2\u0251\u0252\7\u0176\2\2\u0252m\3\2\2\2"+
		"\u0253\u0254\5\u00a0Q\2\u0254o\3\2\2\2\u0255\u0256\7\u0081\2\2\u0256\u0257"+
		"\7\u0175\2\2\u0257\u0258\5\u0080A\2\u0258\u025f\7\u0176\2\2\u0259\u025a"+
		"\7\u0175\2\2\u025a\u025b\5\u0080A\2\u025b\u025c\7\u0176\2\2\u025c\u025e"+
		"\3\2\2\2\u025d\u0259\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0264\5<"+
		"\37\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265"+
		"\u0267\5H%\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267q\3\2\2\2\u0268"+
		"\u0269\5t;\2\u0269s\3\2\2\2\u026a\u026b\b;\1\2\u026b\u026c\5|?\2\u026c"+
		"\u026d\5t;\f\u026d\u028f\3\2\2\2\u026e\u028f\5v<\2\u026f\u028f\5x=\2\u0270"+
		"\u0271\5\u008cG\2\u0271\u0272\7\u017f\2\2\u0272\u0274\3\2\2\2\u0273\u0270"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5\u008eH"+
		"\2\u0276\u0277\7\u017f\2\2\u0277\u0278\5\u0090I\2\u0278\u0279\7\u017f"+
		"\2\2\u0279\u0286\3\2\2\2\u027a\u027b\5\u008eH\2\u027b\u027c\7\u017f\2"+
		"\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u0280\5\u0090I\2\u0280\u0281\7\u017f\2\2\u0281\u0286\3"+
		"\2\2\2\u0282\u0283\5\u0090I\2\u0283\u0284\7\u017f\2\2\u0284\u0286\3\2"+
		"\2\2\u0285\u0273\3\2\2\2\u0285\u027d\3\2\2\2\u0285\u0282\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028f\5\u0092J\2\u0288\u028f"+
		"\5f\64\2\u0289\u028a\7\u0175\2\2\u028a\u028b\5t;\2\u028b\u028c\7\u0176"+
		"\2\2\u028c\u028f\3\2\2\2\u028d\u028f\5,\27\2\u028e\u026a\3\2\2\2\u028e"+
		"\u026e\3\2\2\2\u028e\u026f\3\2\2\2\u028e\u0285\3\2\2\2\u028e\u0288\3\2"+
		"\2\2\u028e\u0289\3\2\2\2\u028e\u028d\3\2\2\2\u028f\u02a3\3\2\2\2\u0290"+
		"\u0291\f\13\2\2\u0291\u0292\7\u017e\2\2\u0292\u02a2\5t;\13\u0293\u0294"+
		"\f\n\2\2\u0294\u0295\t\13\2\2\u0295\u02a2\5t;\13\u0296\u0297\f\t\2\2\u0297"+
		"\u0298\t\f\2\2\u0298\u02a2\5t;\n\u0299\u029a\f\b\2\2\u029a\u029b\t\r\2"+
		"\2\u029b\u02a2\5t;\t\u029c\u029d\f\7\2\2\u029d\u029e\7\u016b\2\2\u029e"+
		"\u02a2\5t;\7\u029f\u02a0\f\3\2\2\u02a0\u02a2\5z>\2\u02a1\u0290\3\2\2\2"+
		"\u02a1\u0293\3\2\2\2\u02a1\u0296\3\2\2\2\u02a1\u0299\3\2\2\2\u02a1\u029c"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4u\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\t\16\2\2"+
		"\u02a7w\3\2\2\2\u02a8\u02a9\t\17\2\2\u02a9y\3\2\2\2\u02aa\u02ab\7\u0097"+
		"\2\2\u02ab\u02ac\5\u0092J\2\u02ac{\3\2\2\2\u02ad\u02b1\t\20\2\2\u02ae"+
		"\u02b1\7M\2\2\u02af\u02b1\5~@\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae\3\2\2"+
		"\2\u02b0\u02af\3\2\2\2\u02b1}\3\2\2\2\u02b2\u02b3\t\21\2\2\u02b3\177\3"+
		"\2\2\2\u02b4\u02b9\5t;\2\u02b5\u02b6\7\u016e\2\2\u02b6\u02b8\5t;\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u0081\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\5\u00aaV\2\u02bd"+
		"\u0083\3\2\2\2\u02be\u02c1\5\u0086D\2\u02bf\u02c1\5\u00aaV\2\u02c0\u02be"+
		"\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u0085\3\2\2\2\u02c2\u02c3\t\22\2\2"+
		"\u02c3\u0087\3\2\2\2\u02c4\u02c9\5\u008aF\2\u02c5\u02c6\7\u016e\2\2\u02c6"+
		"\u02c8\5\u008aF\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02ce\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc"+
		"\u02ce\7\u017b\2\2\u02cd\u02c4\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u0089"+
		"\3\2\2\2\u02cf\u02d1\7\u0121\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2"+
		"\2\u02d1\u02d2\3\2\2\2\u02d2\u02d8\5t;\2\u02d3\u02d4\5\u00acW\2\u02d4"+
		"\u02d5\7\u016a\2\2\u02d5\u02d6\5t;\2\u02d6\u02d8\3\2\2\2\u02d7\u02d0\3"+
		"\2\2\2\u02d7\u02d3\3\2\2\2\u02d8\u008b\3\2\2\2\u02d9\u02da\5\u00aaV\2"+
		"\u02da\u008d\3\2\2\2\u02db\u02dc\5\u00aaV\2\u02dc\u008f\3\2\2\2\u02dd"+
		"\u02de\5\u00aaV\2\u02de\u0091\3\2\2\2\u02df\u02e0\5\u00aaV\2\u02e0\u0093"+
		"\3\2\2\2\u02e1\u02e2\5\u00aaV\2\u02e2\u0095\3\2\2\2\u02e3\u02e4\5\u00aa"+
		"V\2\u02e4\u0097\3\2\2\2\u02e5\u02e9\5\u0096L\2\u02e6\u02e7\7\u00ed\2\2"+
		"\u02e7\u02e8\7\20\2\2\u02e8\u02ea\5\u0080A\2\u02e9\u02e6\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02ed\5<\37\2\u02ec\u02eb\3\2"+
		"\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02f0\5\u009aN\2\u02ef"+
		"\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u0099\3\2\2\2\u02f1\u02f3\t\23"+
		"\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fa\3\2\2\2\u02f4"+
		"\u02fb\5\u009cO\2\u02f5\u02f6\7\16\2\2\u02f6\u02f7\5\u009cO\2\u02f7\u02f8"+
		"\7#\2\2\u02f8\u02f9\5\u009cO\2\u02f9\u02fb\3\2\2\2\u02fa\u02f4\3\2\2\2"+
		"\u02fa\u02f5\3\2\2\2\u02fb\u009b\3\2\2\2\u02fc\u02fd\7\u011b\2\2\u02fd"+
		"\u0309\7\u00f1\2\2\u02fe\u02ff\7\34\2\2\u02ff\u0309\7f\2\2\u0300\u0301"+
		"\7\u011b\2\2\u0301\u0309\7\u00b8\2\2\u0302\u0303\5t;\2\u0303\u0304\7\u00f1"+
		"\2\2\u0304\u0309\3\2\2\2\u0305\u0306\5t;\2\u0306\u0307\7\u00b8\2\2\u0307"+
		"\u0309\3\2\2\2\u0308\u02fc\3\2\2\2\u0308\u02fe\3\2\2\2\u0308\u0300\3\2"+
		"\2\2\u0308\u0302\3\2\2\2\u0308\u0305\3\2\2\2\u0309\u009d\3\2\2\2\u030a"+
		"\u030f\5\u0090I\2\u030b\u030c\7\u016e\2\2\u030c\u030e\5\u0090I\2\u030d"+
		"\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\u009f\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0317\5\u0092J\2\u0313"+
		"\u0314\7\u016e\2\2\u0314\u0316\5\u0092J\2\u0315\u0313\3\2\2\2\u0316\u0319"+
		"\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u00a1\3\2\2\2\u0319"+
		"\u0317\3\2\2\2\u031a\u031b\5\u0092J\2\u031b\u031c\5\u0082B\2\u031c\u00a3"+
		"\3\2\2\2\u031d\u0322\5\u00a2R\2\u031e\u031f\7\u016e\2\2\u031f\u0321\5"+
		"\u00a2R\2\u0320\u031e\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2"+
		"\u0322\u0323\3\2\2\2\u0323\u00a5\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0326"+
		"\5\u00aaV\2\u0326\u00a7\3\2\2\2\u0327\u0328\5\u00aaV\2\u0328\u00a9\3\2"+
		"\2\2\u0329\u032a\5\u00acW\2\u032a\u00ab\3\2\2\2\u032b\u032e\t\24\2\2\u032c"+
		"\u032e\5\u00aeX\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032e\u00ad"+
		"\3\2\2\2\u032f\u0330\t\25\2\2\u0330\u00af\3\2\2\2b\u00b5\u00ba\u00c4\u00c7"+
		"\u00ca\u00cd\u00d0\u00df\u00e8\u00f3\u00f7\u00fa\u00fe\u0102\u0105\u0108"+
		"\u010b\u010e\u0111\u0115\u011e\u0120\u0127\u012c\u0130\u0135\u013a\u013f"+
		"\u0145\u0148\u014e\u0155\u015e\u0166\u016b\u0176\u017e\u0193\u01a3\u01a8"+
		"\u01ab\u01b1\u01bb\u01c0\u01c5\u01d2\u01d6\u01e0\u01e3\u01e8\u01ed\u01f1"+
		"\u01f4\u01f9\u0201\u020d\u0210\u0215\u0217\u0219\u021f\u0221\u0226\u022d"+
		"\u0232\u0236\u023d\u0240\u0243\u0249\u025f\u0263\u0266\u0273\u027d\u0285"+
		"\u028e\u02a1\u02a3\u02b0\u02b9\u02c0\u02c9\u02cd\u02d0\u02d7\u02e9\u02ec"+
		"\u02ef\u02f2\u02fa\u0308\u030f\u0317\u0322\u032d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}