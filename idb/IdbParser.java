// Generated from D:/Work/Code/Intelij IDEA/grammars-v4/idb\IdbParser.g4 by ANTLR 4.4.1-dev

    package com.intple.dbone.parser.idb;

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
		OWNED=233, POSITION=238, TIME=324, BIND_PARAMETER=406, THEN=115, TSVECTOR=329, 
		OFFSET=82, REPLACE=251, COLUMN=19, ACCESS=1, OBJECT_VALUE=348, EXISTS=36, 
		NVARCHAR=321, ADD=2, INTEGER=309, BOX_EQUAL=394, TO=116, SUCCESSFUL=110, 
		SET=105, RELATIVE=249, MIN=218, TEXT=328, HOUR=192, UNION=121, CURRENT=26, 
		NULLS=229, COMMIT=21, SCHEMA=257, CLOSE=148, DECIMAL=317, DROP=31, VERSIONS_STARTSCN=355, 
		BIGINT=310, WHEN=130, MOVE=222, VALIDATE=126, CONCURRENTLY=152, DECLARE=165, 
		START=109, QUOTED_IDENTIFIER=405, BIT=300, REVOKE=97, BETWEEN=12, FIRST=181, 
		PRIOR=90, CAST=16, EXTERNAL=178, ORA_ROWSCN=349, DOUBLE_QUOTE=384, VARYING=290, 
		TRIGGER=118, CASE=15, CASCADE=145, VERBOSE=291, FULL=42, INSERT=55, CARET=380, 
		SAVEPOINT=102, ROWID=350, BOTH=13, TINYINT=306, BLOCK_COMMENT=401, REAL_NUM=400, 
		SYMMETRIC=111, SHARE=106, OFFLINE=81, LAST=204, ABORT=136, SYNONYM=112, 
		UNIQUE=122, VIEW=129, LINE_COMMENT=402, OVERLAPS_ABOVE=392, ROLLUP=256, 
		RESTART=252, ABOVE=391, PRIMARY=242, RIGHT_OF=390, LOCAL=208, EXCLUDING=176, 
		LIST=207, SEQUENCE=260, COSTS=156, VAR_POP=289, NOT_SIMILAR=396, CHECK=17, 
		FROM=41, DISTINCT=30, TEMPORARY=272, SIMPLE=263, MAIN=210, TIMETZ=325, 
		INNER=54, ORDER=87, TIMEZONE=275, DECADE=164, CYCLE=160, GTH=369, UPDATE=123, 
		FOR=40, COLUMN_VALUE=341, HOLD=191, EXCLUSIVE=35, FOLLOWING=182, AND=5, 
		IDENTIFIED=46, SCROLL=258, INTERVAL=323, LOCK=65, OVERLAP=388, INDEX=52, 
		OIDS=230, MLSLABEL=69, MINVALUE=219, UNKNOWN=282, CONTINUE=155, SYSDATE=113, 
		IDENTIFIER=404, PARTITIONS=236, ALL=3, TILDE=385, EXTRACT=179, DOT=381, 
		DOW=170, PARTIAL=234, NOAUDIT=73, DOY=171, LATERAL=205, VERSIONS_STARTTIME=356, 
		CUSTOME_OPERAND=403, VALUES=127, HASH=190, INDEXES=195, RANGE=244, BELOW=393, 
		TRUE=135, JOIN=59, SIMILAR=262, NUM=399, DEFAULTS=166, LTH=367, ANY=6, 
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
		"DISTANCE", "'!~'", "'~*'", "'!~*'", "NUM", "REAL_NUM", "BLOCK_COMMENT", 
		"LINE_COMMENT", "CUSTOME_OPERAND", "IDENTIFIER", "QUOTED_IDENTIFIER", 
		"BIND_PARAMETER", "REGEX", "STRING_LITERAL", "' '", "WHITE_SPACE"
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
		RULE_values_stmt = 55, RULE_search_condition = 56, RULE_expr = 57, RULE_expr_list = 58, 
		RULE_datatype = 59, RULE_function_name = 60, RULE_function_reserved_name = 61, 
		RULE_function_args = 62, RULE_function_arg = 63, RULE_number = 64, RULE_unsigned_numeric_literal = 65, 
		RULE_signed_numerical_literal = 66, RULE_sign = 67, RULE_database_name = 68, 
		RULE_schema_name = 69, RULE_table_name = 70, RULE_column_name = 71, RULE_window_name = 72, 
		RULE_exists_window_name = 73, RULE_window_definition = 74, RULE_frame_clause = 75, 
		RULE_frame = 76, RULE_table_name_list = 77, RULE_column_name_list = 78, 
		RULE_column_definition = 79, RULE_column_definition_list = 80, RULE_correlation_name = 81, 
		RULE_column_alias = 82, RULE_any_name = 83, RULE_identifier = 84, RULE_nonreserved_keywords = 85;
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
		"expr", "expr_list", "datatype", "function_name", "function_reserved_name", 
		"function_args", "function_arg", "number", "unsigned_numeric_literal", 
		"signed_numerical_literal", "sign", "database_name", "schema_name", "table_name", 
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
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172); statement();
					setState(173); match(SEMI_COLON);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(180); statement();
			setState(182);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(181); match(SEMI_COLON);
				}
			}

			setState(184); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(186); dml();
			}
		}
		catch (RecognitionException re) {
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
			setState(188); select_stmt();
			}
		}
		catch (RecognitionException re) {
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
			setState(190); query_expression();
			setState(192);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(191); order_clause();
				}
			}

			setState(195);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(194); limit_clause();
				}
			}

			setState(198);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(197); offset_clause();
				}
			}

			setState(201);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(200); fetch_clause();
				}
			}

			setState(204);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(203); for_clause();
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
			setState(206); match(UPDATE);
			}
		}
		catch (RecognitionException re) {
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
			setState(208); match(DELETE);
			}
		}
		catch (RecognitionException re) {
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
			setState(210); match(INSERT);
			setState(211); match(INTO);
			}
		}
		catch (RecognitionException re) {
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
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); query_specification();
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214); query_rel();
						setState(215); query_specification();
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); query_specification();
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223); query_rel();
						setState(224); query_expression();
						}
						} 
					}
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231); match(LEFT_PAREN);
				setState(232); select_stmt();
				setState(233); match(RIGHT_PAREN);
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234); query_rel();
						setState(235); query_expression();
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); table_stmt();
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
			setState(246);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(245); with_query();
				}
			}

			setState(248); match(SELECT);
			setState(250);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(249); set_qualifier();
				}
			}

			setState(252); select_list();
			setState(254);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(253); into_expression();
				}
			}

			setState(257);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(256); from_clause();
				}
			}

			setState(260);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(259); where_clause();
				}
			}

			setState(263);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(262); group_clause();
				}
			}

			setState(266);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(265); having_clause();
				}
			}

			setState(269);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(268); window_clause();
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
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(273);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(272);
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
			setState(284);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); match(DISTINCT);
				setState(282);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(277); match(ON);
					setState(278); match(LEFT_PAREN);
					setState(279); expr_list();
					setState(280); match(RIGHT_PAREN);
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
			setState(286); select_sublist();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287); match(COMMA);
				setState(288); select_sublist();
				}
				}
				setState(293);
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
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); qualified_asterisk();
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
			setState(298); expr();
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(299); as_clause();
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
			setState(305);
			_la = _input.LA(1);
			if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(302); table_name();
				setState(303); match(DOT);
				}
			}

			setState(307); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(310);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(309); match(AS);
				}
			}

			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(312); column_alias();
				}
				break;
			case 2:
				{
				setState(313); truth_value();
				}
				break;
			case 3:
				{
				setState(314); match(NULL);
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
			setState(317);
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
			setState(319); match(INTO);
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (TEMPORARY - 272)) | (1L << (TEMP - 272)) | (1L << (UNLOGGED - 272)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(324);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(323); match(TABLE);
				}
			}

			setState(326); table_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(328); match(WITH);
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(329); match(RECURSIVE);
				}
				break;
			}
			setState(332); with_query_name();
			setState(337);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(333); match(LEFT_PAREN);
				setState(334); column_name_list();
				setState(335); match(RIGHT_PAREN);
				}
			}

			setState(339); match(AS);
			setState(340); match(LEFT_PAREN);
			setState(346);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case WITH:
			case LEFT_PAREN:
				{
				setState(341); select_stmt();
				}
				break;
			case VALUES:
				{
				setState(342); values_stmt();
				}
				break;
			case INSERT:
				{
				setState(343); insert_stmt();
				}
				break;
			case UPDATE:
				{
				setState(344); update_stmt();
				}
				break;
			case DELETE:
				{
				setState(345); delete_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(348); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(350); any_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(352); match(TABLE);
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(353); match(ONLY);
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(356); table_name();
					}
					} 
				}
				setState(361);
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
		enterRule(_localctx, 42, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); match(LEFT_PAREN);
			setState(363); select_stmt();
			setState(364); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(366); match(FROM);
			setState(367); table_reference();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368); match(COMMA);
				setState(369); table_reference();
				}
				}
				setState(374);
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
			setState(375); match(WHERE);
			setState(376); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(378); match(GROUP);
			setState(379); match(BY);
			setState(380); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(382); match(HAVING);
			setState(383); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(385); match(WINDOW);
			setState(386); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(388); window_specifier();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389); match(COMMA);
				setState(390); window_specifier();
				}
				}
				setState(395);
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
			setState(396); window_name();
			setState(397); match(AS);
			setState(398); window_definition();
			}
		}
		catch (RecognitionException re) {
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
			setState(400); match(ORDER);
			setState(401); match(BY);
			setState(402); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(404); sort_specifier();
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405); match(COMMA);
					setState(406); sort_specifier();
					}
					} 
				}
				setState(411);
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
		enterRule(_localctx, 62, RULE_sort_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); expr();
			setState(414);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC || _la==USING) {
				{
				setState(413); order_specification();
				}
			}

			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(416); null_ordering();
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
			setState(423);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(419); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(420); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(421); match(USING);
				setState(422); operators();
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
			setState(425);
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
			setState(427); match(NULLS);
			setState(428);
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
			setState(430); match(LIMIT);
			setState(433);
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
			case BIND_PARAMETER:
				{
				setState(431); count();
				}
				break;
			case ALL:
				{
				setState(432); match(ALL);
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
			setState(435); match(OFFSET);
			setState(436); start();
			setState(438);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(437);
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
			setState(440); match(FETCH);
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(443);
			_la = _input.LA(1);
			if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)))) != 0) || ((((_la - 404)) & ~0x3f) == 0 && ((1L << (_la - 404)) & ((1L << (IDENTIFIER - 404)) | (1L << (QUOTED_IDENTIFIER - 404)) | (1L << (BIND_PARAMETER - 404)))) != 0)) {
				{
				setState(442); count();
				}
			}

			setState(445);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(446); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(448); match(FOR);
			setState(456);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(449); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(450); match(NO);
				setState(451); match(KEY);
				setState(452); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(453); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(454); match(KEY);
				setState(455); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(460);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(458); match(OF);
				setState(459); table_name_list();
				}
			}

			setState(462); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
			setState(464); expr();
			}
		}
		catch (RecognitionException re) {
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
			setState(466); expr();
			}
		}
		catch (RecognitionException re) {
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
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469); joined_table(0);
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
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(472); match(ONLY);
					}
					break;
				}
				setState(483);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(478);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(475); database_name();
						setState(476); match(DOT);
						}
						break;
					}
					setState(480); schema_name();
					setState(481); match(DOT);
					}
					break;
				}
				setState(485); table_name();
				setState(487);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(486); match(MULTIPLY);
					}
					break;
				}
				setState(490);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(489); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492); derived_table();
				setState(493); correlation_specification();
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
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(498); match(LEFT_PAREN);
				setState(499); joined_table(0);
				setState(500); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(502); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(525);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(505);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(506); match(CROSS);
						setState(507); match(JOIN);
						setState(508); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(509);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(510); match(UNION);
						setState(511); match(JOIN);
						setState(512); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(513);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(515);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(514); match(NATURAL);
							}
						}

						setState(518);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(517); join_type();
							}
						}

						setState(520); match(JOIN);
						setState(521); joined_table(0);
						setState(523);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(522); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(529);
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
		enterRule(_localctx, 88, RULE_join_type);
		int _la;
		try {
			setState(535);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); outer_join_type();
				setState(533);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(532); match(OUTER);
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
			setState(537);
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
			setState(540);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(539); match(AS);
				}
			}

			setState(542); correlation_name();
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(543); match(LEFT_PAREN);
				setState(544); derived_column_list();
				setState(545); match(RIGHT_PAREN);
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
			setState(549); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(551); match(LATERAL);
				}
				break;
			}
			setState(556);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(554); table_subquery();
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
				setState(555); function();
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
			setState(558); subquery();
			}
		}
		catch (RecognitionException re) {
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
			setState(560); function_name();
			setState(561); match(LEFT_PAREN);
			setState(563);
			_la = _input.LA(1);
			if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)))) != 0) || ((((_la - 404)) & ~0x3f) == 0 && ((1L << (_la - 404)) & ((1L << (IDENTIFIER - 404)) | (1L << (QUOTED_IDENTIFIER - 404)) | (1L << (BIND_PARAMETER - 404)))) != 0)) {
				{
				setState(562); function_args();
				}
			}

			setState(565); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(569);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(567); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(568); named_columns_join();
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
			setState(571); match(ON);
			setState(572); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(574); match(USING);
			setState(575); match(LEFT_PAREN);
			setState(576); join_column_list();
			setState(577); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(579); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(581); match(VALUES);
			setState(582); match(LEFT_PAREN);
			setState(583); expr_list();
			setState(584); match(RIGHT_PAREN);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_PAREN) {
				{
				{
				setState(585); match(LEFT_PAREN);
				setState(586); expr_list();
				setState(587); match(RIGHT_PAREN);
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(594); order_clause();
				}
			}

			setState(598);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(597); limit_clause();
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
			setState(600); expr();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode BIND_PARAMETER() { return getToken(IdbParser.BIND_PARAMETER, 0); }
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expr);
		try {
			setState(627);
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
				setState(623);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(605);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(602); database_name();
						setState(603); match(DOT);
						}
						break;
					}
					setState(607); schema_name();
					setState(608); match(DOT);
					setState(609); table_name();
					setState(610); match(DOT);
					}
					break;
				case 2:
					{
					setState(615);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(612); schema_name();
						setState(613); match(DOT);
						}
						break;
					}
					setState(617); table_name();
					setState(618); match(DOT);
					}
					break;
				case 3:
					{
					setState(620); table_name();
					setState(621); match(DOT);
					}
					break;
				}
				setState(625); column_name();
				}
				break;
			case BIND_PARAMETER:
				enterOuterAlt(_localctx, 2);
				{
				setState(626); match(BIND_PARAMETER);
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
		enterRule(_localctx, 116, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629); expr();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630); match(COMMA);
					setState(631); expr();
					}
					} 
				}
				setState(636);
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
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IdbParser.INT, 0); }
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
		enterRule(_localctx, 118, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_function_name);
		try {
			setState(641);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(639); function_reserved_name();
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
				setState(640); any_name();
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
		enterRule(_localctx, 122, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
		enterRule(_localctx, 124, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); function_arg();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646); match(COMMA);
				setState(647); function_arg();
				}
				}
				setState(652);
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
		enterRule(_localctx, 126, RULE_function_arg);
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(653); match(VARIADIC);
					}
					break;
				}
				setState(656); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657); identifier();
				setState(658); match(ASSIGN);
				setState(659); expr();
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

	public static class NumberContext extends ParserRuleContext {
		public Signed_numerical_literalContext signed_numerical_literal() {
			return getRuleContext(Signed_numerical_literalContext.class,0);
		}
		public Unsigned_numeric_literalContext unsigned_numeric_literal() {
			return getRuleContext(Unsigned_numeric_literalContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_number);
		try {
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663); unsigned_numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664); signed_numerical_literal();
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
			setState(667);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSigned_numerical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numerical_literalContext signed_numerical_literal() throws RecognitionException {
		Signed_numerical_literalContext _localctx = new Signed_numerical_literalContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_signed_numerical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if (_la==PLUS || _la==SUB) {
				{
				setState(669); sign();
				}
			}

			setState(672); unsigned_numeric_literal();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode PLUS() { return getToken(IdbParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(IdbParser.SUB, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
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
		enterRule(_localctx, 136, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 138, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); exists_window_name();
			setState(692);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(689); match(PARTITION);
				setState(690); match(BY);
				setState(691); expr_list();
				}
				break;
			}
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(694); order_clause();
				}
				break;
			}
			setState(698);
			_la = _input.LA(1);
			if (_la==BETWEEN || _la==CURRENT || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (ROWS - 101)) | (1L << (ABORT - 101)) | (1L << (ABSOLUTE - 101)) | (1L << (ACTION - 101)) | (1L << (ANALYZE - 101)) | (1L << (ARRAY - 101)) | (1L << (AT - 101)) | (1L << (AVG - 101)) | (1L << (BACKWARD - 101)) | (1L << (CACHE - 101)) | (1L << (CASCADE - 101)) | (1L << (CENTURY - 101)) | (1L << (CHARACTER - 101)) | (1L << (CLOSE - 101)) | (1L << (COLLATE - 101)) | (1L << (COLLECT - 101)) | (1L << (COALESCE - 101)) | (1L << (CONCURRENTLY - 101)) | (1L << (CONSTRAINT - 101)) | (1L << (CONSTRAINTS - 101)) | (1L << (CONTINUE - 101)) | (1L << (COSTS - 101)) | (1L << (COUNT - 101)) | (1L << (CUBE - 101)) | (1L << (CURSOR - 101)) | (1L << (CYCLE - 101)) | (1L << (DATA - 101)) | (1L << (DAY - 101)) | (1L << (DEC - 101)) | (1L << (DECADE - 101)))) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (DECLARE - 165)) | (1L << (DEFAULTS - 165)) | (1L << (DEFERRED - 165)) | (1L << (DEFERRABLE - 165)) | (1L << (DISCARD - 165)) | (1L << (DOW - 165)) | (1L << (DOY - 165)) | (1L << (EPOCH - 165)) | (1L << (ESCAPE - 165)) | (1L << (EVERY - 165)) | (1L << (EXCLUDE - 165)) | (1L << (EXCLUDING - 165)) | (1L << (EXTENDED - 165)) | (1L << (EXTERNAL - 165)) | (1L << (EXTRACT - 165)) | (1L << (FILTER - 165)) | (1L << (FIRST - 165)) | (1L << (FOLLOWING - 165)) | (1L << (FORCE - 165)) | (1L << (FOREIGN - 165)) | (1L << (FORMAT - 165)) | (1L << (FORWARD - 165)) | (1L << (FUSION - 165)) | (1L << (GLOBAL - 165)) | (1L << (GROUPING - 165)) | (1L << (HASH - 165)) | (1L << (HOLD - 165)) | (1L << (HOUR - 165)) | (1L << (IDENTITY - 165)) | (1L << (INCLUDING - 165)) | (1L << (INDEXES - 165)) | (1L << (INHERIT - 165)) | (1L << (INHERITS - 165)) | (1L << (INITIALLY - 165)) | (1L << (INSENSITIVE - 165)) | (1L << (INTERSECTION - 165)) | (1L << (ISODOW - 165)) | (1L << (ISOYEAR - 165)) | (1L << (KEY - 165)) | (1L << (LAST - 165)) | (1L << (LATERAL - 165)) | (1L << (LESS - 165)) | (1L << (LIST - 165)) | (1L << (LOCAL - 165)) | (1L << (LOCATION - 165)) | (1L << (MAIN - 165)) | (1L << (MATCH - 165)) | (1L << (MATERIALIZED - 165)) | (1L << (MAX - 165)) | (1L << (MAXVALUE - 165)) | (1L << (MICROSECONDS - 165)) | (1L << (MILLENNIUM - 165)) | (1L << (MILLISECONDS - 165)) | (1L << (MIN - 165)) | (1L << (MINVALUE - 165)) | (1L << (MINUTE - 165)) | (1L << (MONTH - 165)) | (1L << (MOVE - 165)) | (1L << (NATIONAL - 165)) | (1L << (NEXT - 165)) | (1L << (NO - 165)) | (1L << (NO_INHERIT - 165)) | (1L << (NONE - 165)) | (1L << (NULLIF - 165)))) != 0) || ((((_la - 229)) & ~0x3f) == 0 && ((1L << (_la - 229)) & ((1L << (NULLS - 229)) | (1L << (OIDS - 229)) | (1L << (ONLY - 229)) | (1L << (OVERWRITE - 229)) | (1L << (OWNED - 229)) | (1L << (PARTIAL - 229)) | (1L << (PARTITION - 229)) | (1L << (PARTITIONS - 229)) | (1L << (PLAIN - 229)) | (1L << (POSITION - 229)) | (1L << (PRECEDING - 229)) | (1L << (PRECISION - 229)) | (1L << (PRESERVE - 229)) | (1L << (PRIMARY - 229)) | (1L << (QUARTER - 229)) | (1L << (RANGE - 229)) | (1L << (RECURSIVE - 229)) | (1L << (REFERENCES - 229)) | (1L << (REFRESH - 229)) | (1L << (REGEXP - 229)) | (1L << (RELATIVE - 229)) | (1L << (RELEASE - 229)) | (1L << (REPLACE - 229)) | (1L << (RESTART - 229)) | (1L << (RESTRICT - 229)) | (1L << (RETURNING - 229)) | (1L << (RLIKE - 229)) | (1L << (ROLLUP - 229)) | (1L << (SCHEMA - 229)) | (1L << (SCROLL - 229)) | (1L << (SECOND - 229)) | (1L << (SEQUENCE - 229)) | (1L << (SEQUENCES - 229)) | (1L << (SIMILAR - 229)) | (1L << (SIMPLE - 229)) | (1L << (STDDEV_POP - 229)) | (1L << (STDDEV_SAMP - 229)) | (1L << (STORAGE - 229)) | (1L << (SUBPARTITION - 229)) | (1L << (SUBSTRING - 229)) | (1L << (SUM - 229)) | (1L << (TABLES - 229)) | (1L << (TABLESPACE - 229)) | (1L << (TEMPORARY - 229)) | (1L << (TEMP - 229)) | (1L << (THAN - 229)) | (1L << (TIMEZONE - 229)) | (1L << (TIMEZONE_HOUR - 229)) | (1L << (TIMEZONE_MINUTE - 229)) | (1L << (TRANSACTION - 229)) | (1L << (TRIM - 229)) | (1L << (TYPE - 229)) | (1L << (UNBOUNDED - 229)) | (1L << (UNKNOWN - 229)) | (1L << (UNLOGGED - 229)) | (1L << (UNSECURED - 229)) | (1L << (USAGE - 229)) | (1L << (VALID - 229)) | (1L << (VARIADIC - 229)) | (1L << (VAR_SAMP - 229)) | (1L << (VAR_POP - 229)) | (1L << (VARYING - 229)) | (1L << (VERBOSE - 229)) | (1L << (WEEK - 229)))) != 0) || ((((_la - 293)) & ~0x3f) == 0 && ((1L << (_la - 293)) & ((1L << (WINDOW - 293)) | (1L << (WITHIN - 293)) | (1L << (WITHOUT - 293)) | (1L << (YEAR - 293)) | (1L << (ZONE - 293)) | (1L << (BOOLEAN - 293)) | (1L << (BOOL - 293)) | (1L << (BIT - 293)) | (1L << (VARBIT - 293)) | (1L << (INT1 - 293)) | (1L << (INT2 - 293)) | (1L << (INT4 - 293)) | (1L << (INT8 - 293)) | (1L << (TINYINT - 293)) | (1L << (SMALLINT - 293)) | (1L << (INT - 293)) | (1L << (INTEGER - 293)) | (1L << (BIGINT - 293)) | (1L << (FLOAT4 - 293)) | (1L << (FLOAT8 - 293)) | (1L << (REAL - 293)) | (1L << (FLOAT - 293)) | (1L << (DOUBLE - 293)) | (1L << (NUMERIC - 293)) | (1L << (DECIMAL - 293)) | (1L << (CHAR - 293)) | (1L << (VARCHAR - 293)) | (1L << (NCHAR - 293)) | (1L << (NVARCHAR - 293)) | (1L << (DATE - 293)) | (1L << (INTERVAL - 293)) | (1L << (TIME - 293)) | (1L << (TIMETZ - 293)) | (1L << (TIMESTAMP - 293)) | (1L << (TIMESTAMPTZ - 293)) | (1L << (TEXT - 293)) | (1L << (TSVECTOR - 293)) | (1L << (TSQUERY - 293)) | (1L << (BINARY - 293)) | (1L << (VARBINARY - 293)) | (1L << (BLOB - 293)) | (1L << (BYTEA - 293)) | (1L << (INET4 - 293)) | (1L << (BOX2D - 293)) | (1L << (BOX3D - 293)) | (1L << (GEOMETRY - 293)) | (1L << (GEOMETRY_DUMP - 293)) | (1L << (GEOGRAPHY - 293)))) != 0) || ((((_la - 404)) & ~0x3f) == 0 && ((1L << (_la - 404)) & ((1L << (IDENTIFIER - 404)) | (1L << (QUOTED_IDENTIFIER - 404)) | (1L << (BIND_PARAMETER - 404)))) != 0)) {
				{
				setState(697); frame_clause();
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
		enterRule(_localctx, 150, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(700);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(709);
			switch (_input.LA(1)) {
			case CURRENT:
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
			case BIND_PARAMETER:
				{
				setState(703); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(704); match(BETWEEN);
				setState(705); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(706); match(END);
				setState(707); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 152, RULE_frame);
		try {
			setState(723);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711); match(UNBOUNDED);
				setState(712); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713); match(CURRENT);
				setState(714); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715); match(UNBOUNDED);
				setState(716); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717); expr();
				setState(718); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(720); expr();
				setState(721); match(FOLLOWING);
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
		enterRule(_localctx, 154, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725); table_name();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(726); match(COMMA);
				setState(727); table_name();
				}
				}
				setState(732);
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
		enterRule(_localctx, 156, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); column_name();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(734); match(COMMA);
				setState(735); column_name();
				}
				}
				setState(740);
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
		enterRule(_localctx, 158, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741); column_name();
			setState(742); datatype();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); column_definition();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745); match(COMMA);
				setState(746); column_definition();
				}
				}
				setState(751);
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
		enterRule(_localctx, 162, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_identifier);
		int _la;
		try {
			setState(760);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
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
				setState(759); nonreserved_keywords();
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
		enterRule(_localctx, 170, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019c\u02ff\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\7\2\u00b2\n\2\f\2\16\2\u00b5\13\2\3\2\3"+
		"\2\5\2\u00b9\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00c3\n\5\3\5\5\5"+
		"\u00c6\n\5\3\5\5\5\u00c9\n\5\3\5\5\5\u00cc\n\5\3\5\5\5\u00cf\n\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00dc\n\t\f\t\16\t\u00df\13"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00e5\n\t\f\t\16\t\u00e8\13\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00f0\n\t\f\t\16\t\u00f3\13\t\3\t\5\t\u00f6\n\t\3\n\5\n\u00f9"+
		"\n\n\3\n\3\n\5\n\u00fd\n\n\3\n\3\n\5\n\u0101\n\n\3\n\5\n\u0104\n\n\3\n"+
		"\5\n\u0107\n\n\3\n\5\n\u010a\n\n\3\n\5\n\u010d\n\n\3\n\5\n\u0110\n\n\3"+
		"\13\3\13\5\13\u0114\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011d\n\f\5\f"+
		"\u011f\n\f\3\r\3\r\3\r\7\r\u0124\n\r\f\r\16\r\u0127\13\r\3\16\3\16\5\16"+
		"\u012b\n\16\3\17\3\17\5\17\u012f\n\17\3\20\3\20\3\20\5\20\u0134\n\20\3"+
		"\20\3\20\3\21\5\21\u0139\n\21\3\21\3\21\3\21\5\21\u013e\n\21\3\22\3\22"+
		"\3\23\3\23\5\23\u0144\n\23\3\23\5\23\u0147\n\23\3\23\3\23\3\24\3\24\5"+
		"\24\u014d\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0154\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u015d\n\24\3\24\3\24\3\25\3\25\3\26\3\26\5\26"+
		"\u0165\n\26\3\26\7\26\u0168\n\26\f\26\16\26\u016b\13\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\7\30\u0175\n\30\f\30\16\30\u0178\13\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\7\35\u018a\n\35\f\35\16\35\u018d\13\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \7 \u019a\n \f \16 \u019d\13 \3!\3!\5!\u01a1\n"+
		"!\3!\5!\u01a4\n!\3\"\3\"\3\"\3\"\5\"\u01aa\n\"\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\5%\u01b4\n%\3&\3&\3&\5&\u01b9\n&\3\'\3\'\3\'\5\'\u01be\n\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01cb\n(\3(\3(\5(\u01cf\n(\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\5+\u01d9\n+\3,\5,\u01dc\n,\3,\3,\3,\5,\u01e1\n,\3,\3,\3,\5"+
		",\u01e6\n,\3,\3,\5,\u01ea\n,\3,\5,\u01ed\n,\3,\3,\3,\5,\u01f2\n,\3-\3"+
		"-\3-\3-\3-\3-\5-\u01fa\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0206\n-\3"+
		"-\5-\u0209\n-\3-\3-\3-\5-\u020e\n-\7-\u0210\n-\f-\16-\u0213\13-\3.\3."+
		"\3.\5.\u0218\n.\5.\u021a\n.\3/\3/\3\60\5\60\u021f\n\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u0226\n\60\3\61\3\61\3\62\5\62\u022b\n\62\3\62\3\62\5"+
		"\62\u022f\n\62\3\63\3\63\3\64\3\64\3\64\5\64\u0236\n\64\3\64\3\64\3\65"+
		"\3\65\5\65\u023c\n\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\3"+
		"9\39\39\39\39\39\39\39\79\u0250\n9\f9\169\u0253\139\39\59\u0256\n9\39"+
		"\59\u0259\n9\3:\3:\3;\3;\3;\5;\u0260\n;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u026a"+
		"\n;\3;\3;\3;\3;\3;\3;\5;\u0272\n;\3;\3;\5;\u0276\n;\3<\3<\3<\7<\u027b"+
		"\n<\f<\16<\u027e\13<\3=\3=\3>\3>\5>\u0284\n>\3?\3?\3@\3@\3@\7@\u028b\n"+
		"@\f@\16@\u028e\13@\3A\5A\u0291\nA\3A\3A\3A\3A\3A\5A\u0298\nA\3B\3B\5B"+
		"\u029c\nB\3C\3C\3D\5D\u02a1\nD\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J"+
		"\3J\3K\3K\3L\3L\3L\3L\5L\u02b7\nL\3L\5L\u02ba\nL\3L\5L\u02bd\nL\3M\5M"+
		"\u02c0\nM\3M\3M\3M\3M\3M\3M\5M\u02c8\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\5N\u02d6\nN\3O\3O\3O\7O\u02db\nO\fO\16O\u02de\13O\3P\3P\3P\7P\u02e3"+
		"\nP\fP\16P\u02e6\13P\3Q\3Q\3Q\3R\3R\3R\7R\u02ee\nR\fR\16R\u02f1\13R\3"+
		"S\3S\3T\3T\3U\3U\3V\3V\5V\u02fb\nV\3W\3W\3W\3\u0169\3XX\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\2\21\5\2$$::{{\4\2\5\5  \4\2\u0088\u0089\u011c\u011c\4\2\u0112"+
		"\u0113\u011d\u011d\6\2\u0171\u0171\u0173\u0173\u0179\u017d\u0195\u0195"+
		"\4\2\u00b7\u00b7\u00ce\u00ce\3\2fg\4\2\u00b7\u00b7\u00e2\u00e2\5\2,,?"+
		"?dd\6\2\5\5\b\b??dd\3\2\u0191\u0192\3\2\u0179\u017a\4\2gg\u00f6\u00f6"+
		"\3\2\u0196\u0197\3\2\u008a\u0156\u0312\2\u00b3\3\2\2\2\4\u00bc\3\2\2\2"+
		"\6\u00be\3\2\2\2\b\u00c0\3\2\2\2\n\u00d0\3\2\2\2\f\u00d2\3\2\2\2\16\u00d4"+
		"\3\2\2\2\20\u00f5\3\2\2\2\22\u00f8\3\2\2\2\24\u0111\3\2\2\2\26\u011e\3"+
		"\2\2\2\30\u0120\3\2\2\2\32\u012a\3\2\2\2\34\u012c\3\2\2\2\36\u0133\3\2"+
		"\2\2 \u0138\3\2\2\2\"\u013f\3\2\2\2$\u0141\3\2\2\2&\u014a\3\2\2\2(\u0160"+
		"\3\2\2\2*\u0162\3\2\2\2,\u016c\3\2\2\2.\u0170\3\2\2\2\60\u0179\3\2\2\2"+
		"\62\u017c\3\2\2\2\64\u0180\3\2\2\2\66\u0183\3\2\2\28\u0186\3\2\2\2:\u018e"+
		"\3\2\2\2<\u0192\3\2\2\2>\u0196\3\2\2\2@\u019e\3\2\2\2B\u01a9\3\2\2\2D"+
		"\u01ab\3\2\2\2F\u01ad\3\2\2\2H\u01b0\3\2\2\2J\u01b5\3\2\2\2L\u01ba\3\2"+
		"\2\2N\u01c2\3\2\2\2P\u01d2\3\2\2\2R\u01d4\3\2\2\2T\u01d8\3\2\2\2V\u01f1"+
		"\3\2\2\2X\u01f9\3\2\2\2Z\u0219\3\2\2\2\\\u021b\3\2\2\2^\u021e\3\2\2\2"+
		"`\u0227\3\2\2\2b\u022a\3\2\2\2d\u0230\3\2\2\2f\u0232\3\2\2\2h\u023b\3"+
		"\2\2\2j\u023d\3\2\2\2l\u0240\3\2\2\2n\u0245\3\2\2\2p\u0247\3\2\2\2r\u025a"+
		"\3\2\2\2t\u0275\3\2\2\2v\u0277\3\2\2\2x\u027f\3\2\2\2z\u0283\3\2\2\2|"+
		"\u0285\3\2\2\2~\u0287\3\2\2\2\u0080\u0297\3\2\2\2\u0082\u029b\3\2\2\2"+
		"\u0084\u029d\3\2\2\2\u0086\u02a0\3\2\2\2\u0088\u02a4\3\2\2\2\u008a\u02a6"+
		"\3\2\2\2\u008c\u02a8\3\2\2\2\u008e\u02aa\3\2\2\2\u0090\u02ac\3\2\2\2\u0092"+
		"\u02ae\3\2\2\2\u0094\u02b0\3\2\2\2\u0096\u02b2\3\2\2\2\u0098\u02bf\3\2"+
		"\2\2\u009a\u02d5\3\2\2\2\u009c\u02d7\3\2\2\2\u009e\u02df\3\2\2\2\u00a0"+
		"\u02e7\3\2\2\2\u00a2\u02ea\3\2\2\2\u00a4\u02f2\3\2\2\2\u00a6\u02f4\3\2"+
		"\2\2\u00a8\u02f6\3\2\2\2\u00aa\u02fa\3\2\2\2\u00ac\u02fc\3\2\2\2\u00ae"+
		"\u00af\5\4\3\2\u00af\u00b0\7\u016d\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5\4\3\2\u00b7\u00b9\7\u016d"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\7\2\2\3\u00bb\3\3\2\2\2\u00bc\u00bd\5\6\4\2\u00bd\5\3\2\2\2\u00be"+
		"\u00bf\5\b\5\2\u00bf\7\3\2\2\2\u00c0\u00c2\5\20\t\2\u00c1\u00c3\5<\37"+
		"\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6"+
		"\5H%\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c9\5J&\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2"+
		"\2\u00ca\u00cc\5L\'\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00cf\5N(\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\t\3\2\2\2\u00d0\u00d1\7}\2\2\u00d1\13\3\2\2\2\u00d2\u00d3\7\36\2\2\u00d3"+
		"\r\3\2\2\2\u00d4\u00d5\79\2\2\u00d5\u00d6\7;\2\2\u00d6\17\3\2\2\2\u00d7"+
		"\u00dd\5\22\n\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\5\22\n\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00f6\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e6\5\22"+
		"\n\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\5\20\t\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00f6\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\u0175\2\2\u00ea"+
		"\u00eb\5\b\5\2\u00eb\u00f1\7\u0176\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee"+
		"\5\20\t\2\u00ee\u00f0\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f6\5*\26\2\u00f5\u00d7\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\21\3\2\2\2\u00f7\u00f9\5&\24"+
		"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\7i\2\2\u00fb\u00fd\5\26\f\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\5\30\r\2\u00ff\u0101\5$\23\2\u0100\u00ff\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5.\30\2\u0103"+
		"\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5\60"+
		"\31\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u010a\5\62\32\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3"+
		"\2\2\2\u010b\u010d\5\64\33\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0110\5\66\34\2\u010f\u010e\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\23\3\2\2\2\u0111\u0113\t\2\2\2\u0112\u0114\t\3\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\25\3\2\2\2\u0115\u011f\7\5\2"+
		"\2\u0116\u011c\7 \2\2\u0117\u0118\7U\2\2\u0118\u0119\7\u0175\2\2\u0119"+
		"\u011a\5v<\2\u011a\u011b\7\u0176\2\2\u011b\u011d\3\2\2\2\u011c\u0117\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0115\3\2\2\2\u011e"+
		"\u0116\3\2\2\2\u011f\27\3\2\2\2\u0120\u0125\5\32\16\2\u0121\u0122\7\u016e"+
		"\2\2\u0122\u0124\5\32\16\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\31\3\2\2\2\u0127\u0125\3\2\2"+
		"\2\u0128\u012b\5\34\17\2\u0129\u012b\5\36\20\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\33\3\2\2\2\u012c\u012e\5t;\2\u012d\u012f\5 \21\2"+
		"\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\35\3\2\2\2\u0130\u0131"+
		"\5\u008eH\2\u0131\u0132\7\u017f\2\2\u0132\u0134\3\2\2\2\u0133\u0130\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\u017b\2\2"+
		"\u0136\37\3\2\2\2\u0137\u0139\7\t\2\2\u0138\u0137\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u013e\5\u00a6T\2\u013b\u013e\5\"\22"+
		"\2\u013c\u013e\7O\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c"+
		"\3\2\2\2\u013e!\3\2\2\2\u013f\u0140\t\4\2\2\u0140#\3\2\2\2\u0141\u0143"+
		"\7;\2\2\u0142\u0144\t\5\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0147\7t\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5\u008eH\2\u0149%\3\2\2\2\u014a\u014c"+
		"\7\u0087\2\2\u014b\u014d\7\u00f7\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e\u0153\5(\25\2\u014f\u0150\7\u0175\2\2"+
		"\u0150\u0151\5\u009eP\2\u0151\u0152\7\u0176\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u014f\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\t"+
		"\2\2\u0156\u015c\7\u0175\2\2\u0157\u015d\5\b\5\2\u0158\u015d\5p9\2\u0159"+
		"\u015d\5\16\b\2\u015a\u015d\5\n\6\2\u015b\u015d\5\f\7\2\u015c\u0157\3"+
		"\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\u0176\2\2\u015f\'\3\2"+
		"\2\2\u0160\u0161\5\u00a8U\2\u0161)\3\2\2\2\u0162\u0164\7t\2\2\u0163\u0165"+
		"\7\u00e9\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\3\2\2"+
		"\2\u0166\u0168\5\u008eH\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a+\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016c\u016d\7\u0175\2\2\u016d\u016e\5\b\5\2\u016e\u016f\7\u0176\2\2\u016f"+
		"-\3\2\2\2\u0170\u0171\7+\2\2\u0171\u0176\5T+\2\u0172\u0173\7\u016e\2\2"+
		"\u0173\u0175\5T+\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177/\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017a\7\u0086\2\2\u017a\u017b\5r:\2\u017b\61\3\2\2\2\u017c\u017d\7.\2"+
		"\2\u017d\u017e\7\20\2\2\u017e\u017f\5v<\2\u017f\63\3\2\2\2\u0180\u0181"+
		"\7/\2\2\u0181\u0182\5v<\2\u0182\65\3\2\2\2\u0183\u0184\7\u0127\2\2\u0184"+
		"\u0185\58\35\2\u0185\67\3\2\2\2\u0186\u018b\5:\36\2\u0187\u0188\7\u016e"+
		"\2\2\u0188\u018a\5:\36\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c9\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018e\u018f\5\u0092J\2\u018f\u0190\7\t\2\2\u0190\u0191\5\u0096L\2\u0191"+
		";\3\2\2\2\u0192\u0193\7Y\2\2\u0193\u0194\7\20\2\2\u0194\u0195\5> \2\u0195"+
		"=\3\2\2\2\u0196\u019b\5@!\2\u0197\u0198\7\u016e\2\2\u0198\u019a\5@!\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c?\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\5t;\2\u019f\u01a1"+
		"\5B\"\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a4\5F$\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4A\3\2\2\2\u01a5"+
		"\u01aa\7\n\2\2\u01a6\u01aa\7\37\2\2\u01a7\u01a8\7\177\2\2\u01a8\u01aa"+
		"\5D#\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"C\3\2\2\2\u01ab\u01ac\t\6\2\2\u01acE\3\2\2\2\u01ad\u01ae\7\u00e7\2\2\u01ae"+
		"\u01af\t\7\2\2\u01afG\3\2\2\2\u01b0\u01b3\7B\2\2\u01b1\u01b4\5P)\2\u01b2"+
		"\u01b4\7\5\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4I\3\2\2\2"+
		"\u01b5\u01b6\7T\2\2\u01b6\u01b8\5R*\2\u01b7\u01b9\t\b\2\2\u01b8\u01b7"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9K\3\2\2\2\u01ba\u01bb\7(\2\2\u01bb\u01bd"+
		"\t\t\2\2\u01bc\u01be\5P)\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\t\b\2\2\u01c0\u01c1\7\u00e9\2\2\u01c1M\3\2"+
		"\2\2\u01c2\u01ca\7*\2\2\u01c3\u01cb\7}\2\2\u01c4\u01c5\7\u00e3\2\2\u01c5"+
		"\u01c6\7\u00cd\2\2\u01c6\u01cb\7}\2\2\u01c7\u01cb\7l\2\2\u01c8\u01c9\7"+
		"\u00cd\2\2\u01c9\u01cb\7l\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2\2"+
		"\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd"+
		"\7Q\2\2\u01cd\u01cf\5\u009cO\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7N\2\2\u01d1O\3\2\2\2\u01d2\u01d3\5t"+
		";\2\u01d3Q\3\2\2\2\u01d4\u01d5\5t;\2\u01d5S\3\2\2\2\u01d6\u01d9\5V,\2"+
		"\u01d7\u01d9\5X-\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9U\3\2"+
		"\2\2\u01da\u01dc\7\u00e9\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01e5\3\2\2\2\u01dd\u01de\5\u008aF\2\u01de\u01df\7\u017f\2\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\5\u008cG\2\u01e3\u01e4\7\u017f\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\5\u008eH"+
		"\2\u01e8\u01ea\7\u017b\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01ed\5^\60\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01f2\3\2\2\2\u01ee\u01ef\5b\62\2\u01ef\u01f0\5^\60\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01db\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f2W\3\2\2\2"+
		"\u01f3\u01f4\b-\1\2\u01f4\u01f5\7\u0175\2\2\u01f5\u01f6\5X-\2\u01f6\u01f7"+
		"\7\u0176\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01fa\5V,\2\u01f9\u01f3\3\2\2\2"+
		"\u01f9\u01f8\3\2\2\2\u01fa\u0211\3\2\2\2\u01fb\u01fc\f\7\2\2\u01fc\u01fd"+
		"\7\33\2\2\u01fd\u01fe\7=\2\2\u01fe\u0210\5X-\b\u01ff\u0200\f\5\2\2\u0200"+
		"\u0201\7{\2\2\u0201\u0202\7=\2\2\u0202\u0210\5X-\6\u0203\u0205\f\6\2\2"+
		"\u0204\u0206\7J\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208"+
		"\3\2\2\2\u0207\u0209\5Z.\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\7=\2\2\u020b\u020d\5X-\2\u020c\u020e\5h\65"+
		"\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u01fb"+
		"\3\2\2\2\u020f\u01ff\3\2\2\2\u020f\u0203\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212Y\3\2\2\2\u0213\u0211\3\2\2\2"+
		"\u0214\u021a\78\2\2\u0215\u0217\5\\/\2\u0216\u0218\7Z\2\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2\2\2\u0219"+
		"\u0215\3\2\2\2\u021a[\3\2\2\2\u021b\u021c\t\n\2\2\u021c]\3\2\2\2\u021d"+
		"\u021f\7\t\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0225\5\u00a4S\2\u0221\u0222\7\u0175\2\2\u0222\u0223\5`\61"+
		"\2\u0223\u0224\7\u0176\2\2\u0224\u0226\3\2\2\2\u0225\u0221\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226_\3\2\2\2\u0227\u0228\5\u009eP\2\u0228a\3\2\2\2\u0229"+
		"\u022b\7\u00cf\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022e"+
		"\3\2\2\2\u022c\u022f\5d\63\2\u022d\u022f\5f\64\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022d\3\2\2\2\u022fc\3\2\2\2\u0230\u0231\5,\27\2\u0231e\3\2\2\2\u0232"+
		"\u0233\5z>\2\u0233\u0235\7\u0175\2\2\u0234\u0236\5~@\2\u0235\u0234\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7\u0176\2\2\u0238"+
		"g\3\2\2\2\u0239\u023c\5j\66\2\u023a\u023c\5l\67\2\u023b\u0239\3\2\2\2"+
		"\u023b\u023a\3\2\2\2\u023ci\3\2\2\2\u023d\u023e\7U\2\2\u023e\u023f\5r"+
		":\2\u023fk\3\2\2\2\u0240\u0241\7\177\2\2\u0241\u0242\7\u0175\2\2\u0242"+
		"\u0243\5n8\2\u0243\u0244\7\u0176\2\2\u0244m\3\2\2\2\u0245\u0246\5\u009e"+
		"P\2\u0246o\3\2\2\2\u0247\u0248\7\u0081\2\2\u0248\u0249\7\u0175\2\2\u0249"+
		"\u024a\5v<\2\u024a\u0251\7\u0176\2\2\u024b\u024c\7\u0175\2\2\u024c\u024d"+
		"\5v<\2\u024d\u024e\7\u0176\2\2\u024e\u0250\3\2\2\2\u024f\u024b\3\2\2\2"+
		"\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\5<\37\2\u0255\u0254\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\5H%\2\u0258\u0257\3\2\2"+
		"\2\u0258\u0259\3\2\2\2\u0259q\3\2\2\2\u025a\u025b\5t;\2\u025bs\3\2\2\2"+
		"\u025c\u025d\5\u008aF\2\u025d\u025e\7\u017f\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u025c\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5\u008c"+
		"G\2\u0262\u0263\7\u017f\2\2\u0263\u0264\5\u008eH\2\u0264\u0265\7\u017f"+
		"\2\2\u0265\u0272\3\2\2\2\u0266\u0267\5\u008cG\2\u0267\u0268\7\u017f\2"+
		"\2\u0268\u026a\3\2\2\2\u0269\u0266\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\5\u008eH\2\u026c\u026d\7\u017f\2\2\u026d\u0272\3"+
		"\2\2\2\u026e\u026f\5\u008eH\2\u026f\u0270\7\u017f\2\2\u0270\u0272\3\2"+
		"\2\2\u0271\u025f\3\2\2\2\u0271\u0269\3\2\2\2\u0271\u026e\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\5\u0090I\2\u0274\u0276"+
		"\7\u0198\2\2\u0275\u0271\3\2\2\2\u0275\u0274\3\2\2\2\u0276u\3\2\2\2\u0277"+
		"\u027c\5t;\2\u0278\u0279\7\u016e\2\2\u0279\u027b\5t;\2\u027a\u0278\3\2"+
		"\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"w\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7\u0136\2\2\u0280y\3\2\2\2\u0281"+
		"\u0284\5|?\2\u0282\u0284\5\u00a8U\2\u0283\u0281\3\2\2\2\u0283\u0282\3"+
		"\2\2\2\u0284{\3\2\2\2\u0285\u0286\t\13\2\2\u0286}\3\2\2\2\u0287\u028c"+
		"\5\u0080A\2\u0288\u0289\7\u016e\2\2\u0289\u028b\5\u0080A\2\u028a\u0288"+
		"\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\177\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\7\u0121\2\2\u0290\u028f\3"+
		"\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0298\5t;\2\u0293"+
		"\u0294\5\u00aaV\2\u0294\u0295\7\u016a\2\2\u0295\u0296\5t;\2\u0296\u0298"+
		"\3\2\2\2\u0297\u0290\3\2\2\2\u0297\u0293\3\2\2\2\u0298\u0081\3\2\2\2\u0299"+
		"\u029c\5\u0084C\2\u029a\u029c\5\u0086D\2\u029b\u0299\3\2\2\2\u029b\u029a"+
		"\3\2\2\2\u029c\u0083\3\2\2\2\u029d\u029e\t\f\2\2\u029e\u0085\3\2\2\2\u029f"+
		"\u02a1\5\u0088E\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a3\5\u0084C\2\u02a3\u0087\3\2\2\2\u02a4\u02a5\t\r\2"+
		"\2\u02a5\u0089\3\2\2\2\u02a6\u02a7\5\u00a8U\2\u02a7\u008b\3\2\2\2\u02a8"+
		"\u02a9\5\u00a8U\2\u02a9\u008d\3\2\2\2\u02aa\u02ab\5\u00a8U\2\u02ab\u008f"+
		"\3\2\2\2\u02ac\u02ad\5\u00a8U\2\u02ad\u0091\3\2\2\2\u02ae\u02af\5\u00a8"+
		"U\2\u02af\u0093\3\2\2\2\u02b0\u02b1\5\u00a8U\2\u02b1\u0095\3\2\2\2\u02b2"+
		"\u02b6\5\u0094K\2\u02b3\u02b4\7\u00ed\2\2\u02b4\u02b5\7\20\2\2\u02b5\u02b7"+
		"\5v<\2\u02b6\u02b3\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8"+
		"\u02ba\5<\37\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2"+
		"\2\2\u02bb\u02bd\5\u0098M\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u0097\3\2\2\2\u02be\u02c0\t\16\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3"+
		"\2\2\2\u02c0\u02c7\3\2\2\2\u02c1\u02c8\5\u009aN\2\u02c2\u02c3\7\16\2\2"+
		"\u02c3\u02c4\5\u009aN\2\u02c4\u02c5\7#\2\2\u02c5\u02c6\5\u009aN\2\u02c6"+
		"\u02c8\3\2\2\2\u02c7\u02c1\3\2\2\2\u02c7\u02c2\3\2\2\2\u02c8\u0099\3\2"+
		"\2\2\u02c9\u02ca\7\u011b\2\2\u02ca\u02d6\7\u00f1\2\2\u02cb\u02cc\7\34"+
		"\2\2\u02cc\u02d6\7f\2\2\u02cd\u02ce\7\u011b\2\2\u02ce\u02d6\7\u00b8\2"+
		"\2\u02cf\u02d0\5t;\2\u02d0\u02d1\7\u00f1\2\2\u02d1\u02d6\3\2\2\2\u02d2"+
		"\u02d3\5t;\2\u02d3\u02d4\7\u00b8\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02c9\3"+
		"\2\2\2\u02d5\u02cb\3\2\2\2\u02d5\u02cd\3\2\2\2\u02d5\u02cf\3\2\2\2\u02d5"+
		"\u02d2\3\2\2\2\u02d6\u009b\3\2\2\2\u02d7\u02dc\5\u008eH\2\u02d8\u02d9"+
		"\7\u016e\2\2\u02d9\u02db\5\u008eH\2\u02da\u02d8\3\2\2\2\u02db\u02de\3"+
		"\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u009d\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02df\u02e4\5\u0090I\2\u02e0\u02e1\7\u016e\2\2\u02e1\u02e3"+
		"\5\u0090I\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5\u009f\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8"+
		"\5\u0090I\2\u02e8\u02e9\5x=\2\u02e9\u00a1\3\2\2\2\u02ea\u02ef\5\u00a0"+
		"Q\2\u02eb\u02ec\7\u016e\2\2\u02ec\u02ee\5\u00a0Q\2\u02ed\u02eb\3\2\2\2"+
		"\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u00a3"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\5\u00a8U\2\u02f3\u00a5\3\2\2"+
		"\2\u02f4\u02f5\5\u00a8U\2\u02f5\u00a7\3\2\2\2\u02f6\u02f7\5\u00aaV\2\u02f7"+
		"\u00a9\3\2\2\2\u02f8\u02fb\t\17\2\2\u02f9\u02fb\5\u00acW\2\u02fa\u02f8"+
		"\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fb\u00ab\3\2\2\2\u02fc\u02fd\t\20\2\2"+
		"\u02fd\u00ad\3\2\2\2]\u00b3\u00b8\u00c2\u00c5\u00c8\u00cb\u00ce\u00dd"+
		"\u00e6\u00f1\u00f5\u00f8\u00fc\u0100\u0103\u0106\u0109\u010c\u010f\u0113"+
		"\u011c\u011e\u0125\u012a\u012e\u0133\u0138\u013d\u0143\u0146\u014c\u0153"+
		"\u015c\u0164\u0169\u0176\u018b\u019b\u01a0\u01a3\u01a9\u01b3\u01b8\u01bd"+
		"\u01ca\u01ce\u01d8\u01db\u01e0\u01e5\u01e9\u01ec\u01f1\u01f9\u0205\u0208"+
		"\u020d\u020f\u0211\u0217\u0219\u021e\u0225\u022a\u022e\u0235\u023b\u0251"+
		"\u0255\u0258\u025f\u0269\u0271\u0275\u027c\u0283\u028c\u0290\u0297\u029b"+
		"\u02a0\u02b6\u02b9\u02bc\u02bf\u02c7\u02d5\u02dc\u02e4\u02ef\u02fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}