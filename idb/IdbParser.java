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
		RULE_values_stmt = 55, RULE_search_condition = 56, RULE_expr = 57, RULE_numeric_literal = 58, 
		RULE_string_literal = 59, RULE_collate_expression = 60, RULE_expr_list = 61, 
		RULE_datatype = 62, RULE_function_name = 63, RULE_function_reserved_name = 64, 
		RULE_function_args = 65, RULE_function_arg = 66, RULE_database_name = 67, 
		RULE_schema_name = 68, RULE_table_name = 69, RULE_column_name = 70, RULE_window_name = 71, 
		RULE_exists_window_name = 72, RULE_window_definition = 73, RULE_frame_clause = 74, 
		RULE_frame = 75, RULE_table_name_list = 76, RULE_column_name_list = 77, 
		RULE_column_definition = 78, RULE_column_definition_list = 79, RULE_correlation_name = 80, 
		RULE_column_alias = 81, RULE_any_name = 82, RULE_identifier = 83, RULE_nonreserved_keywords = 84;
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
		"expr", "numeric_literal", "string_literal", "collate_expression", "expr_list", 
		"datatype", "function_name", "function_reserved_name", "function_args", 
		"function_arg", "database_name", "schema_name", "table_name", "column_name", 
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
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170); statement();
					setState(171); match(SEMI_COLON);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(178); statement();
			setState(180);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(179); match(SEMI_COLON);
				}
			}

			setState(182); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(184); dml();
			}
		}
		catch (RecognitionException re) {
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
			setState(186); select_stmt();
			}
		}
		catch (RecognitionException re) {
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
			setState(188); query_expression();
			setState(190);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(189); order_clause();
				}
			}

			setState(193);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(192); limit_clause();
				}
			}

			setState(196);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(195); offset_clause();
				}
			}

			setState(199);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(198); fetch_clause();
				}
			}

			setState(202);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(201); for_clause();
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
			setState(204); match(UPDATE);
			}
		}
		catch (RecognitionException re) {
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
			setState(206); match(DELETE);
			}
		}
		catch (RecognitionException re) {
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
			setState(208); match(INSERT);
			setState(209); match(INTO);
			}
		}
		catch (RecognitionException re) {
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
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); query_specification();
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212); query_rel();
						setState(213); query_specification();
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); query_specification();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(221); query_rel();
						setState(222); query_expression();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229); match(LEFT_PAREN);
				setState(230); select_stmt();
				setState(231); match(RIGHT_PAREN);
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232); query_rel();
						setState(233); query_expression();
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240); table_stmt();
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
			setState(244);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(243); with_query();
				}
			}

			setState(246); match(SELECT);
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(247); set_qualifier();
				}
				break;
			}
			setState(250); select_list();
			setState(252);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(251); into_expression();
				}
			}

			setState(255);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(254); from_clause();
				}
			}

			setState(258);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(257); where_clause();
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(260); group_clause();
				}
			}

			setState(264);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(263); having_clause();
				}
			}

			setState(267);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(266); window_clause();
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
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(271);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(270);
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
			setState(282);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); match(ALL);
				}
				break;
			case DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(DISTINCT);
				setState(280);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(275); match(ON);
					setState(276); match(LEFT_PAREN);
					setState(277); expr_list();
					setState(278); match(RIGHT_PAREN);
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
			setState(284); select_sublist();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285); match(COMMA);
				setState(286); select_sublist();
				}
				}
				setState(291);
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
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292); derived_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293); qualified_asterisk();
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
			setState(296); expr(0);
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(297); as_clause();
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
			setState(303);
			_la = _input.LA(1);
			if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ABORT - 136)) | (1L << (ABSOLUTE - 136)) | (1L << (ACTION - 136)) | (1L << (ANALYZE - 136)) | (1L << (ARRAY - 136)) | (1L << (AT - 136)) | (1L << (AVG - 136)) | (1L << (BACKWARD - 136)) | (1L << (CACHE - 136)) | (1L << (CASCADE - 136)) | (1L << (CENTURY - 136)) | (1L << (CHARACTER - 136)) | (1L << (CLOSE - 136)) | (1L << (COLLATE - 136)) | (1L << (COLLECT - 136)) | (1L << (COALESCE - 136)) | (1L << (CONCURRENTLY - 136)) | (1L << (CONSTRAINT - 136)) | (1L << (CONSTRAINTS - 136)) | (1L << (CONTINUE - 136)) | (1L << (COSTS - 136)) | (1L << (COUNT - 136)) | (1L << (CUBE - 136)) | (1L << (CURSOR - 136)) | (1L << (CYCLE - 136)) | (1L << (DATA - 136)) | (1L << (DAY - 136)) | (1L << (DEC - 136)) | (1L << (DECADE - 136)) | (1L << (DECLARE - 136)) | (1L << (DEFAULTS - 136)) | (1L << (DEFERRED - 136)) | (1L << (DEFERRABLE - 136)) | (1L << (DISCARD - 136)) | (1L << (DOW - 136)) | (1L << (DOY - 136)) | (1L << (EPOCH - 136)) | (1L << (ESCAPE - 136)) | (1L << (EVERY - 136)) | (1L << (EXCLUDE - 136)) | (1L << (EXCLUDING - 136)) | (1L << (EXTENDED - 136)) | (1L << (EXTERNAL - 136)) | (1L << (EXTRACT - 136)) | (1L << (FILTER - 136)) | (1L << (FIRST - 136)) | (1L << (FOLLOWING - 136)) | (1L << (FORCE - 136)) | (1L << (FOREIGN - 136)) | (1L << (FORMAT - 136)) | (1L << (FORWARD - 136)) | (1L << (FUSION - 136)) | (1L << (GLOBAL - 136)) | (1L << (GROUPING - 136)) | (1L << (HASH - 136)) | (1L << (HOLD - 136)) | (1L << (HOUR - 136)) | (1L << (IDENTITY - 136)) | (1L << (INCLUDING - 136)) | (1L << (INDEXES - 136)) | (1L << (INHERIT - 136)) | (1L << (INHERITS - 136)) | (1L << (INITIALLY - 136)) | (1L << (INSENSITIVE - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INTERSECTION - 200)) | (1L << (ISODOW - 200)) | (1L << (ISOYEAR - 200)) | (1L << (KEY - 200)) | (1L << (LAST - 200)) | (1L << (LATERAL - 200)) | (1L << (LESS - 200)) | (1L << (LIST - 200)) | (1L << (LOCAL - 200)) | (1L << (LOCATION - 200)) | (1L << (MAIN - 200)) | (1L << (MATCH - 200)) | (1L << (MATERIALIZED - 200)) | (1L << (MAX - 200)) | (1L << (MAXVALUE - 200)) | (1L << (MICROSECONDS - 200)) | (1L << (MILLENNIUM - 200)) | (1L << (MILLISECONDS - 200)) | (1L << (MIN - 200)) | (1L << (MINVALUE - 200)) | (1L << (MINUTE - 200)) | (1L << (MONTH - 200)) | (1L << (MOVE - 200)) | (1L << (NATIONAL - 200)) | (1L << (NEXT - 200)) | (1L << (NO - 200)) | (1L << (NO_INHERIT - 200)) | (1L << (NONE - 200)) | (1L << (NULLIF - 200)) | (1L << (NULLS - 200)) | (1L << (OIDS - 200)) | (1L << (ONLY - 200)) | (1L << (OVERWRITE - 200)) | (1L << (OWNED - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITION - 200)) | (1L << (PARTITIONS - 200)) | (1L << (PLAIN - 200)) | (1L << (POSITION - 200)) | (1L << (PRECEDING - 200)) | (1L << (PRECISION - 200)) | (1L << (PRESERVE - 200)) | (1L << (PRIMARY - 200)) | (1L << (QUARTER - 200)) | (1L << (RANGE - 200)) | (1L << (RECURSIVE - 200)) | (1L << (REFERENCES - 200)) | (1L << (REFRESH - 200)) | (1L << (REGEXP - 200)) | (1L << (RELATIVE - 200)) | (1L << (RELEASE - 200)) | (1L << (REPLACE - 200)) | (1L << (RESTART - 200)) | (1L << (RESTRICT - 200)) | (1L << (RETURNING - 200)) | (1L << (RLIKE - 200)) | (1L << (ROLLUP - 200)) | (1L << (SCHEMA - 200)) | (1L << (SCROLL - 200)) | (1L << (SECOND - 200)) | (1L << (SEQUENCE - 200)) | (1L << (SEQUENCES - 200)) | (1L << (SIMILAR - 200)) | (1L << (SIMPLE - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (STDDEV_POP - 264)) | (1L << (STDDEV_SAMP - 264)) | (1L << (STORAGE - 264)) | (1L << (SUBPARTITION - 264)) | (1L << (SUBSTRING - 264)) | (1L << (SUM - 264)) | (1L << (TABLES - 264)) | (1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (TEMP - 264)) | (1L << (THAN - 264)) | (1L << (TIMEZONE - 264)) | (1L << (TIMEZONE_HOUR - 264)) | (1L << (TIMEZONE_MINUTE - 264)) | (1L << (TRANSACTION - 264)) | (1L << (TRIM - 264)) | (1L << (TYPE - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UNKNOWN - 264)) | (1L << (UNLOGGED - 264)) | (1L << (UNSECURED - 264)) | (1L << (USAGE - 264)) | (1L << (VALID - 264)) | (1L << (VARIADIC - 264)) | (1L << (VAR_SAMP - 264)) | (1L << (VAR_POP - 264)) | (1L << (VARYING - 264)) | (1L << (VERBOSE - 264)) | (1L << (WEEK - 264)) | (1L << (WINDOW - 264)) | (1L << (WITHIN - 264)) | (1L << (WITHOUT - 264)) | (1L << (YEAR - 264)) | (1L << (ZONE - 264)) | (1L << (BOOLEAN - 264)) | (1L << (BOOL - 264)) | (1L << (BIT - 264)) | (1L << (VARBIT - 264)) | (1L << (INT1 - 264)) | (1L << (INT2 - 264)) | (1L << (INT4 - 264)) | (1L << (INT8 - 264)) | (1L << (TINYINT - 264)) | (1L << (SMALLINT - 264)) | (1L << (INT - 264)) | (1L << (INTEGER - 264)) | (1L << (BIGINT - 264)) | (1L << (FLOAT4 - 264)) | (1L << (FLOAT8 - 264)) | (1L << (REAL - 264)) | (1L << (FLOAT - 264)) | (1L << (DOUBLE - 264)) | (1L << (NUMERIC - 264)) | (1L << (DECIMAL - 264)) | (1L << (CHAR - 264)) | (1L << (VARCHAR - 264)) | (1L << (NCHAR - 264)) | (1L << (NVARCHAR - 264)) | (1L << (DATE - 264)) | (1L << (INTERVAL - 264)) | (1L << (TIME - 264)) | (1L << (TIMETZ - 264)) | (1L << (TIMESTAMP - 264)) | (1L << (TIMESTAMPTZ - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (TEXT - 328)) | (1L << (TSVECTOR - 328)) | (1L << (TSQUERY - 328)) | (1L << (BINARY - 328)) | (1L << (VARBINARY - 328)) | (1L << (BLOB - 328)) | (1L << (BYTEA - 328)) | (1L << (INET4 - 328)) | (1L << (BOX2D - 328)) | (1L << (BOX3D - 328)) | (1L << (GEOMETRY - 328)) | (1L << (GEOMETRY_DUMP - 328)) | (1L << (GEOGRAPHY - 328)))) != 0) || _la==IDENTIFIER || _la==QUOTED_IDENTIFIER) {
				{
				setState(300); table_name();
				setState(301); match(DOT);
				}
			}

			setState(305); match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(308);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(307); match(AS);
				}
			}

			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(310); column_alias();
				}
				break;
			case 2:
				{
				setState(311); truth_value();
				}
				break;
			case 3:
				{
				setState(312); match(NULL);
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
			setState(315);
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
			setState(317); match(INTO);
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(318);
				_la = _input.LA(1);
				if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (TEMPORARY - 272)) | (1L << (TEMP - 272)) | (1L << (UNLOGGED - 272)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(322);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(321); match(TABLE);
				}
			}

			setState(324); table_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(326); match(WITH);
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(327); match(RECURSIVE);
				}
				break;
			}
			setState(330); with_query_name();
			setState(335);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(331); match(LEFT_PAREN);
				setState(332); column_name_list();
				setState(333); match(RIGHT_PAREN);
				}
			}

			setState(337); match(AS);
			setState(338); match(LEFT_PAREN);
			setState(344);
			switch (_input.LA(1)) {
			case SELECT:
			case TABLE:
			case WITH:
			case LEFT_PAREN:
				{
				setState(339); select_stmt();
				}
				break;
			case VALUES:
				{
				setState(340); values_stmt();
				}
				break;
			case INSERT:
				{
				setState(341); insert_stmt();
				}
				break;
			case UPDATE:
				{
				setState(342); update_stmt();
				}
				break;
			case DELETE:
				{
				setState(343); delete_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(348); any_name();
			}
		}
		catch (RecognitionException re) {
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
			setState(350); match(TABLE);
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(351); match(ONLY);
				}
				break;
			}
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(354); table_name();
					}
					} 
				}
				setState(359);
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
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); match(LEFT_PAREN);
				setState(361); select_stmt();
				setState(362); match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364); match(LEFT_PAREN);
				setState(365); values_stmt();
				setState(366); match(RIGHT_PAREN);
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
			setState(370); match(FROM);
			setState(371); table_reference();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372); match(COMMA);
				setState(373); table_reference();
				}
				}
				setState(378);
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
			setState(379); match(WHERE);
			setState(380); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(382); match(GROUP);
			setState(383); match(BY);
			setState(384); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(386); match(HAVING);
			setState(387); expr_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(389); match(WINDOW);
			setState(390); window_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(392); window_specifier();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393); match(COMMA);
				setState(394); window_specifier();
				}
				}
				setState(399);
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
			setState(400); window_name();
			setState(401); match(AS);
			setState(402); window_definition();
			}
		}
		catch (RecognitionException re) {
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
			setState(404); match(ORDER);
			setState(405); match(BY);
			setState(406); sort_specifier_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(408); sort_specifier();
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409); match(COMMA);
					setState(410); sort_specifier();
					}
					} 
				}
				setState(415);
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
			setState(416); expr(0);
			setState(418);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC || _la==USING) {
				{
				setState(417); order_specification();
				}
			}

			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(420); null_ordering();
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
			setState(427);
			switch (_input.LA(1)) {
			case ASC:
				enterOuterAlt(_localctx, 1);
				{
				setState(423); match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(424); match(DESC);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 3);
				{
				setState(425); match(USING);
				setState(426); operators();
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
			setState(429);
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
			setState(431); match(NULLS);
			setState(432);
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
			setState(434); match(LIMIT);
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(435); count();
				}
				break;
			case 2:
				{
				setState(436); match(ALL);
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
			setState(439); match(OFFSET);
			setState(440); start();
			setState(442);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(441);
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
			setState(444); match(FETCH);
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(447);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)) | (1L << (ANALYZE - 77)) | (1L << (ARRAY - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)) | (1L << (KEY - 141)) | (1L << (LAST - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)) | (1L << (STORAGE - 205)) | (1L << (SUBPARTITION - 205)) | (1L << (SUBSTRING - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)) | (1L << (TSQUERY - 269)) | (1L << (BINARY - 269)) | (1L << (VARBINARY - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (LEFT_PAREN - 333)))) != 0) || ((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (NUM - 399)) | (1L << (REAL_NUM - 399)) | (1L << (IDENTIFIER - 399)) | (1L << (QUOTED_IDENTIFIER - 399)) | (1L << (BIND_PARAMETER - 399)) | (1L << (STRING_LITERAL - 399)))) != 0)) {
				{
				setState(446); count();
				}
			}

			setState(449);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(450); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
			setState(452); match(FOR);
			setState(460);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(453); match(UPDATE);
				}
				break;
			case NO:
				{
				setState(454); match(NO);
				setState(455); match(KEY);
				setState(456); match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(457); match(SHARE);
				}
				break;
			case KEY:
				{
				setState(458); match(KEY);
				setState(459); match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(464);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(462); match(OF);
				setState(463); table_name_list();
				}
			}

			setState(466); match(NOWAIT);
			}
		}
		catch (RecognitionException re) {
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
			setState(468); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(470); expr(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472); simple_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473); joined_table(0);
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
			setState(499);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(476); match(ONLY);
					}
					break;
				}
				setState(487);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(482);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(479); database_name();
						setState(480); match(DOT);
						}
						break;
					}
					setState(484); schema_name();
					setState(485); match(DOT);
					}
					break;
				}
				setState(489); table_name();
				setState(491);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(490); match(MULTIPLY);
					}
					break;
				}
				setState(494);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(493); correlation_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496); derived_table();
				setState(497); correlation_specification();
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
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(502); match(LEFT_PAREN);
				setState(503); joined_table(0);
				setState(504); match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(506); simple_table();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(529);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(509);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(510); match(CROSS);
						setState(511); match(JOIN);
						setState(512); joined_table(6);
						}
						break;
					case 2:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(513);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(514); match(UNION);
						setState(515); match(JOIN);
						setState(516); joined_table(4);
						}
						break;
					case 3:
						{
						_localctx = new Joined_tableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_joined_table);
						setState(517);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(519);
						_la = _input.LA(1);
						if (_la==NATURAL) {
							{
							setState(518); match(NATURAL);
							}
						}

						setState(522);
						_la = _input.LA(1);
						if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (FULL - 42)) | (1L << (INNER - 42)) | (1L << (LEFT - 42)) | (1L << (RIGHT - 42)))) != 0)) {
							{
							setState(521); join_type();
							}
						}

						setState(524); match(JOIN);
						setState(525); joined_table(0);
						setState(527);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(526); join_specification();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(533);
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
			setState(539);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(534); match(INNER);
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(535); outer_join_type();
				setState(537);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(536); match(OUTER);
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
			setState(541);
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
			setState(544);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(543); match(AS);
				}
			}

			setState(546); correlation_name();
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(547); match(LEFT_PAREN);
				setState(548); derived_column_list();
				setState(549); match(RIGHT_PAREN);
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
			setState(553); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(556);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(555); match(LATERAL);
				}
				break;
			}
			setState(560);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(558); table_subquery();
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
				setState(559); function();
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
			setState(562); subquery();
			}
		}
		catch (RecognitionException re) {
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
			setState(564); function_name();
			setState(565); match(LEFT_PAREN);
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(566); set_qualifier();
				}
				break;
			}
			setState(570);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)) | (1L << (ANALYZE - 77)) | (1L << (ARRAY - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)) | (1L << (KEY - 141)) | (1L << (LAST - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)) | (1L << (STORAGE - 205)) | (1L << (SUBPARTITION - 205)) | (1L << (SUBSTRING - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)) | (1L << (TSQUERY - 269)) | (1L << (BINARY - 269)) | (1L << (VARBINARY - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (LEFT_PAREN - 333)) | (1L << (MULTIPLY - 333)))) != 0) || ((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (NUM - 399)) | (1L << (REAL_NUM - 399)) | (1L << (IDENTIFIER - 399)) | (1L << (QUOTED_IDENTIFIER - 399)) | (1L << (BIND_PARAMETER - 399)) | (1L << (STRING_LITERAL - 399)))) != 0)) {
				{
				setState(569); function_args();
				}
			}

			setState(573);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(572); order_clause();
				}
			}

			setState(575); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(579);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); join_condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); named_columns_join();
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
			setState(581); match(ON);
			setState(582); search_condition();
			}
		}
		catch (RecognitionException re) {
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
			setState(584); match(USING);
			setState(585); match(LEFT_PAREN);
			setState(586); join_column_list();
			setState(587); match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(589); column_name_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(591); match(VALUES);
			setState(592); match(LEFT_PAREN);
			setState(593); expr_list();
			setState(594); match(RIGHT_PAREN);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_PAREN) {
				{
				{
				setState(595); match(LEFT_PAREN);
				setState(596); expr_list();
				setState(597); match(RIGHT_PAREN);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(604); order_clause();
				}
			}

			setState(608);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(607); limit_clause();
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
			setState(610); expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
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
		public TerminalNode BIND_PARAMETER() { return getToken(IdbParser.BIND_PARAMETER, 0); }
		public List<TerminalNode> DOT() { return getTokens(IdbParser.DOT); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(IdbParser.NULL, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(613); numeric_literal();
				}
				break;
			case 2:
				{
				setState(614); string_literal();
				}
				break;
			case 3:
				{
				setState(636);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(618);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(615); database_name();
						setState(616); match(DOT);
						}
						break;
					}
					setState(620); schema_name();
					setState(621); match(DOT);
					setState(622); table_name();
					setState(623); match(DOT);
					}
					break;
				case 2:
					{
					setState(628);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(625); schema_name();
						setState(626); match(DOT);
						}
						break;
					}
					setState(630); table_name();
					setState(631); match(DOT);
					}
					break;
				case 3:
					{
					setState(633); table_name();
					setState(634); match(DOT);
					}
					break;
				}
				setState(638); column_name();
				}
				break;
			case 4:
				{
				setState(639); match(BIND_PARAMETER);
				}
				break;
			case 5:
				{
				setState(640); match(NULL);
				}
				break;
			case 6:
				{
				setState(641); function();
				}
				break;
			case 7:
				{
				setState(642); subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(645);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(646); collate_expression();
					}
					} 
				}
				setState(651);
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
			setState(652);
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
		public TerminalNode STRING_LITERAL() { return getToken(IdbParser.STRING_LITERAL, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
			setState(656); match(COLLATE);
			setState(657); ((Collate_expressionContext)_localctx).collate_id = column_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_expr_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(659); expr(0);
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660); match(COMMA);
					setState(661); expr(0);
					}
					} 
				}
				setState(666);
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
		enterRule(_localctx, 124, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(INT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_function_name);
		try {
			setState(671);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(669); function_reserved_name();
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
				setState(670); any_name();
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
		enterRule(_localctx, 128, RULE_function_reserved_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
		enterRule(_localctx, 130, RULE_function_args);
		int _la;
		try {
			setState(684);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case LEFT:
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
			case NUM:
			case REAL_NUM:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BIND_PARAMETER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(675); function_arg();
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(676); match(COMMA);
					setState(677); function_arg();
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(683); match(MULTIPLY);
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
		enterRule(_localctx, 132, RULE_function_arg);
		try {
			setState(694);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(686); match(VARIADIC);
					}
					break;
				}
				setState(689); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690); identifier();
				setState(691); match(ASSIGN);
				setState(692); expr(0);
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
		enterRule(_localctx, 134, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 136, RULE_schema_name);
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
		enterRule(_localctx, 138, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_exists_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_window_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708); exists_window_name();
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(709); match(PARTITION);
				setState(710); match(BY);
				setState(711); expr_list();
				}
				break;
			}
			setState(715);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(714); order_clause();
				}
				break;
			}
			setState(718);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << BETWEEN) | (1L << CURRENT) | (1L << LEFT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (NULL - 77)) | (1L << (RIGHT - 77)) | (1L << (ROWS - 77)) | (1L << (ABORT - 77)) | (1L << (ABSOLUTE - 77)) | (1L << (ACTION - 77)) | (1L << (ANALYZE - 77)) | (1L << (ARRAY - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (AT - 141)) | (1L << (AVG - 141)) | (1L << (BACKWARD - 141)) | (1L << (CACHE - 141)) | (1L << (CASCADE - 141)) | (1L << (CENTURY - 141)) | (1L << (CHARACTER - 141)) | (1L << (CLOSE - 141)) | (1L << (COLLATE - 141)) | (1L << (COLLECT - 141)) | (1L << (COALESCE - 141)) | (1L << (CONCURRENTLY - 141)) | (1L << (CONSTRAINT - 141)) | (1L << (CONSTRAINTS - 141)) | (1L << (CONTINUE - 141)) | (1L << (COSTS - 141)) | (1L << (COUNT - 141)) | (1L << (CUBE - 141)) | (1L << (CURSOR - 141)) | (1L << (CYCLE - 141)) | (1L << (DATA - 141)) | (1L << (DAY - 141)) | (1L << (DEC - 141)) | (1L << (DECADE - 141)) | (1L << (DECLARE - 141)) | (1L << (DEFAULTS - 141)) | (1L << (DEFERRED - 141)) | (1L << (DEFERRABLE - 141)) | (1L << (DISCARD - 141)) | (1L << (DOW - 141)) | (1L << (DOY - 141)) | (1L << (EPOCH - 141)) | (1L << (ESCAPE - 141)) | (1L << (EVERY - 141)) | (1L << (EXCLUDE - 141)) | (1L << (EXCLUDING - 141)) | (1L << (EXTENDED - 141)) | (1L << (EXTERNAL - 141)) | (1L << (EXTRACT - 141)) | (1L << (FILTER - 141)) | (1L << (FIRST - 141)) | (1L << (FOLLOWING - 141)) | (1L << (FORCE - 141)) | (1L << (FOREIGN - 141)) | (1L << (FORMAT - 141)) | (1L << (FORWARD - 141)) | (1L << (FUSION - 141)) | (1L << (GLOBAL - 141)) | (1L << (GROUPING - 141)) | (1L << (HASH - 141)) | (1L << (HOLD - 141)) | (1L << (HOUR - 141)) | (1L << (IDENTITY - 141)) | (1L << (INCLUDING - 141)) | (1L << (INDEXES - 141)) | (1L << (INHERIT - 141)) | (1L << (INHERITS - 141)) | (1L << (INITIALLY - 141)) | (1L << (INSENSITIVE - 141)) | (1L << (INTERSECTION - 141)) | (1L << (ISODOW - 141)) | (1L << (ISOYEAR - 141)) | (1L << (KEY - 141)) | (1L << (LAST - 141)))) != 0) || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (LATERAL - 205)) | (1L << (LESS - 205)) | (1L << (LIST - 205)) | (1L << (LOCAL - 205)) | (1L << (LOCATION - 205)) | (1L << (MAIN - 205)) | (1L << (MATCH - 205)) | (1L << (MATERIALIZED - 205)) | (1L << (MAX - 205)) | (1L << (MAXVALUE - 205)) | (1L << (MICROSECONDS - 205)) | (1L << (MILLENNIUM - 205)) | (1L << (MILLISECONDS - 205)) | (1L << (MIN - 205)) | (1L << (MINVALUE - 205)) | (1L << (MINUTE - 205)) | (1L << (MONTH - 205)) | (1L << (MOVE - 205)) | (1L << (NATIONAL - 205)) | (1L << (NEXT - 205)) | (1L << (NO - 205)) | (1L << (NO_INHERIT - 205)) | (1L << (NONE - 205)) | (1L << (NULLIF - 205)) | (1L << (NULLS - 205)) | (1L << (OIDS - 205)) | (1L << (ONLY - 205)) | (1L << (OVERWRITE - 205)) | (1L << (OWNED - 205)) | (1L << (PARTIAL - 205)) | (1L << (PARTITION - 205)) | (1L << (PARTITIONS - 205)) | (1L << (PLAIN - 205)) | (1L << (POSITION - 205)) | (1L << (PRECEDING - 205)) | (1L << (PRECISION - 205)) | (1L << (PRESERVE - 205)) | (1L << (PRIMARY - 205)) | (1L << (QUARTER - 205)) | (1L << (RANGE - 205)) | (1L << (RECURSIVE - 205)) | (1L << (REFERENCES - 205)) | (1L << (REFRESH - 205)) | (1L << (REGEXP - 205)) | (1L << (RELATIVE - 205)) | (1L << (RELEASE - 205)) | (1L << (REPLACE - 205)) | (1L << (RESTART - 205)) | (1L << (RESTRICT - 205)) | (1L << (RETURNING - 205)) | (1L << (RLIKE - 205)) | (1L << (ROLLUP - 205)) | (1L << (SCHEMA - 205)) | (1L << (SCROLL - 205)) | (1L << (SECOND - 205)) | (1L << (SEQUENCE - 205)) | (1L << (SEQUENCES - 205)) | (1L << (SIMILAR - 205)) | (1L << (SIMPLE - 205)) | (1L << (STDDEV_POP - 205)) | (1L << (STDDEV_SAMP - 205)) | (1L << (STORAGE - 205)) | (1L << (SUBPARTITION - 205)) | (1L << (SUBSTRING - 205)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (SUM - 269)) | (1L << (TABLES - 269)) | (1L << (TABLESPACE - 269)) | (1L << (TEMPORARY - 269)) | (1L << (TEMP - 269)) | (1L << (THAN - 269)) | (1L << (TIMEZONE - 269)) | (1L << (TIMEZONE_HOUR - 269)) | (1L << (TIMEZONE_MINUTE - 269)) | (1L << (TRANSACTION - 269)) | (1L << (TRIM - 269)) | (1L << (TYPE - 269)) | (1L << (UNBOUNDED - 269)) | (1L << (UNKNOWN - 269)) | (1L << (UNLOGGED - 269)) | (1L << (UNSECURED - 269)) | (1L << (USAGE - 269)) | (1L << (VALID - 269)) | (1L << (VARIADIC - 269)) | (1L << (VAR_SAMP - 269)) | (1L << (VAR_POP - 269)) | (1L << (VARYING - 269)) | (1L << (VERBOSE - 269)) | (1L << (WEEK - 269)) | (1L << (WINDOW - 269)) | (1L << (WITHIN - 269)) | (1L << (WITHOUT - 269)) | (1L << (YEAR - 269)) | (1L << (ZONE - 269)) | (1L << (BOOLEAN - 269)) | (1L << (BOOL - 269)) | (1L << (BIT - 269)) | (1L << (VARBIT - 269)) | (1L << (INT1 - 269)) | (1L << (INT2 - 269)) | (1L << (INT4 - 269)) | (1L << (INT8 - 269)) | (1L << (TINYINT - 269)) | (1L << (SMALLINT - 269)) | (1L << (INT - 269)) | (1L << (INTEGER - 269)) | (1L << (BIGINT - 269)) | (1L << (FLOAT4 - 269)) | (1L << (FLOAT8 - 269)) | (1L << (REAL - 269)) | (1L << (FLOAT - 269)) | (1L << (DOUBLE - 269)) | (1L << (NUMERIC - 269)) | (1L << (DECIMAL - 269)) | (1L << (CHAR - 269)) | (1L << (VARCHAR - 269)) | (1L << (NCHAR - 269)) | (1L << (NVARCHAR - 269)) | (1L << (DATE - 269)) | (1L << (INTERVAL - 269)) | (1L << (TIME - 269)) | (1L << (TIMETZ - 269)) | (1L << (TIMESTAMP - 269)) | (1L << (TIMESTAMPTZ - 269)) | (1L << (TEXT - 269)) | (1L << (TSVECTOR - 269)) | (1L << (TSQUERY - 269)) | (1L << (BINARY - 269)) | (1L << (VARBINARY - 269)))) != 0) || ((((_la - 333)) & ~0x3f) == 0 && ((1L << (_la - 333)) & ((1L << (BLOB - 333)) | (1L << (BYTEA - 333)) | (1L << (INET4 - 333)) | (1L << (BOX2D - 333)) | (1L << (BOX3D - 333)) | (1L << (GEOMETRY - 333)) | (1L << (GEOMETRY_DUMP - 333)) | (1L << (GEOGRAPHY - 333)) | (1L << (LEFT_PAREN - 333)))) != 0) || ((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & ((1L << (NUM - 399)) | (1L << (REAL_NUM - 399)) | (1L << (IDENTIFIER - 399)) | (1L << (QUOTED_IDENTIFIER - 399)) | (1L << (BIND_PARAMETER - 399)) | (1L << (STRING_LITERAL - 399)))) != 0)) {
				{
				setState(717); frame_clause();
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
		enterRule(_localctx, 148, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(720);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(729);
			switch (_input.LA(1)) {
			case ALL:
			case ANY:
			case CURRENT:
			case LEFT:
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
			case NUM:
			case REAL_NUM:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BIND_PARAMETER:
			case STRING_LITERAL:
				{
				setState(723); ((Frame_clauseContext)_localctx).frame_start = frame();
				}
				break;
			case BETWEEN:
				{
				setState(724); match(BETWEEN);
				setState(725); ((Frame_clauseContext)_localctx).frame_start = frame();
				setState(726); match(END);
				setState(727); ((Frame_clauseContext)_localctx).frame_end = frame();
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
		enterRule(_localctx, 150, RULE_frame);
		try {
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731); match(UNBOUNDED);
				setState(732); match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733); match(CURRENT);
				setState(734); match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735); match(UNBOUNDED);
				setState(736); match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(737); expr(0);
				setState(738); match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(740); expr(0);
				setState(741); match(FOLLOWING);
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
		enterRule(_localctx, 152, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); table_name();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(746); match(COMMA);
				setState(747); table_name();
				}
				}
				setState(752);
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
		enterRule(_localctx, 154, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); column_name();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(754); match(COMMA);
				setState(755); column_name();
				}
				}
				setState(760);
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
		enterRule(_localctx, 156, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); column_name();
			setState(762); datatype();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_column_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764); column_definition();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(765); match(COMMA);
				setState(766); column_definition();
				}
				}
				setState(771);
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
		enterRule(_localctx, 160, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); any_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_any_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_identifier);
		int _la;
		try {
			setState(780);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
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
				setState(779); nonreserved_keywords();
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
		enterRule(_localctx, 168, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
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
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019c\u0313\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\7\2\u00b0\n\2\f\2\16\2\u00b3\13\2\3\2\3\2\5\2"+
		"\u00b7\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00c1\n\5\3\5\5\5\u00c4"+
		"\n\5\3\5\5\5\u00c7\n\5\3\5\5\5\u00ca\n\5\3\5\5\5\u00cd\n\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00da\n\t\f\t\16\t\u00dd\13\t\3\t"+
		"\3\t\3\t\3\t\7\t\u00e3\n\t\f\t\16\t\u00e6\13\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00ee\n\t\f\t\16\t\u00f1\13\t\3\t\5\t\u00f4\n\t\3\n\5\n\u00f7\n\n"+
		"\3\n\3\n\5\n\u00fb\n\n\3\n\3\n\5\n\u00ff\n\n\3\n\5\n\u0102\n\n\3\n\5\n"+
		"\u0105\n\n\3\n\5\n\u0108\n\n\3\n\5\n\u010b\n\n\3\n\5\n\u010e\n\n\3\13"+
		"\3\13\5\13\u0112\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011b\n\f\5\f\u011d"+
		"\n\f\3\r\3\r\3\r\7\r\u0122\n\r\f\r\16\r\u0125\13\r\3\16\3\16\5\16\u0129"+
		"\n\16\3\17\3\17\5\17\u012d\n\17\3\20\3\20\3\20\5\20\u0132\n\20\3\20\3"+
		"\20\3\21\5\21\u0137\n\21\3\21\3\21\3\21\5\21\u013c\n\21\3\22\3\22\3\23"+
		"\3\23\5\23\u0142\n\23\3\23\5\23\u0145\n\23\3\23\3\23\3\24\3\24\5\24\u014b"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0152\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u015b\n\24\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u0163\n"+
		"\26\3\26\7\26\u0166\n\26\f\26\16\26\u0169\13\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0173\n\27\3\30\3\30\3\30\3\30\7\30\u0179\n\30"+
		"\f\30\16\30\u017c\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u018e\n\35\f\35\16\35\u0191\13"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u019e\n \f \16"+
		" \u01a1\13 \3!\3!\5!\u01a5\n!\3!\5!\u01a8\n!\3\"\3\"\3\"\3\"\5\"\u01ae"+
		"\n\"\3#\3#\3$\3$\3$\3%\3%\3%\5%\u01b8\n%\3&\3&\3&\5&\u01bd\n&\3\'\3\'"+
		"\3\'\5\'\u01c2\n\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01cf\n(\3("+
		"\3(\5(\u01d3\n(\3(\3(\3)\3)\3*\3*\3+\3+\5+\u01dd\n+\3,\5,\u01e0\n,\3,"+
		"\3,\3,\5,\u01e5\n,\3,\3,\3,\5,\u01ea\n,\3,\3,\5,\u01ee\n,\3,\5,\u01f1"+
		"\n,\3,\3,\3,\5,\u01f6\n,\3-\3-\3-\3-\3-\3-\5-\u01fe\n-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\5-\u020a\n-\3-\5-\u020d\n-\3-\3-\3-\5-\u0212\n-\7-\u0214"+
		"\n-\f-\16-\u0217\13-\3.\3.\3.\5.\u021c\n.\5.\u021e\n.\3/\3/\3\60\5\60"+
		"\u0223\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u022a\n\60\3\61\3\61\3\62\5"+
		"\62\u022f\n\62\3\62\3\62\5\62\u0233\n\62\3\63\3\63\3\64\3\64\3\64\5\64"+
		"\u023a\n\64\3\64\5\64\u023d\n\64\3\64\5\64\u0240\n\64\3\64\3\64\3\65\3"+
		"\65\5\65\u0246\n\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\3"+
		"9\39\39\39\39\39\39\79\u025a\n9\f9\169\u025d\139\39\59\u0260\n9\39\59"+
		"\u0263\n9\3:\3:\3;\3;\3;\3;\3;\3;\5;\u026d\n;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\5;\u0277\n;\3;\3;\3;\3;\3;\3;\5;\u027f\n;\3;\3;\3;\3;\3;\5;\u0286\n;"+
		"\3;\3;\7;\u028a\n;\f;\16;\u028d\13;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\7?\u0299"+
		"\n?\f?\16?\u029c\13?\3@\3@\3A\3A\5A\u02a2\nA\3B\3B\3C\3C\3C\7C\u02a9\n"+
		"C\fC\16C\u02ac\13C\3C\5C\u02af\nC\3D\5D\u02b2\nD\3D\3D\3D\3D\3D\5D\u02b9"+
		"\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3K\3K\5K\u02cb\nK\3K\5K"+
		"\u02ce\nK\3K\5K\u02d1\nK\3L\5L\u02d4\nL\3L\3L\3L\3L\3L\3L\5L\u02dc\nL"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u02ea\nM\3N\3N\3N\7N\u02ef\nN"+
		"\fN\16N\u02f2\13N\3O\3O\3O\7O\u02f7\nO\fO\16O\u02fa\13O\3P\3P\3P\3Q\3"+
		"Q\3Q\7Q\u0302\nQ\fQ\16Q\u0305\13Q\3R\3R\3S\3S\3T\3T\3U\3U\5U\u030f\nU"+
		"\3V\3V\3V\3\u0167\4XtW\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\2\20\5\2$$::{{\4\2\5\5  \4\2\u0088"+
		"\u0089\u011c\u011c\4\2\u0112\u0113\u011d\u011d\6\2\u0171\u0171\u0173\u0173"+
		"\u0179\u017d\u0195\u0195\4\2\u00b7\u00b7\u00ce\u00ce\3\2fg\4\2\u00b7\u00b7"+
		"\u00e2\u00e2\5\2,,??dd\3\2\u0191\u0192\6\2\5\5\b\b??dd\4\2gg\u00f6\u00f6"+
		"\3\2\u0196\u0197\3\2\u008a\u0156\u032f\2\u00b1\3\2\2\2\4\u00ba\3\2\2\2"+
		"\6\u00bc\3\2\2\2\b\u00be\3\2\2\2\n\u00ce\3\2\2\2\f\u00d0\3\2\2\2\16\u00d2"+
		"\3\2\2\2\20\u00f3\3\2\2\2\22\u00f6\3\2\2\2\24\u010f\3\2\2\2\26\u011c\3"+
		"\2\2\2\30\u011e\3\2\2\2\32\u0128\3\2\2\2\34\u012a\3\2\2\2\36\u0131\3\2"+
		"\2\2 \u0136\3\2\2\2\"\u013d\3\2\2\2$\u013f\3\2\2\2&\u0148\3\2\2\2(\u015e"+
		"\3\2\2\2*\u0160\3\2\2\2,\u0172\3\2\2\2.\u0174\3\2\2\2\60\u017d\3\2\2\2"+
		"\62\u0180\3\2\2\2\64\u0184\3\2\2\2\66\u0187\3\2\2\28\u018a\3\2\2\2:\u0192"+
		"\3\2\2\2<\u0196\3\2\2\2>\u019a\3\2\2\2@\u01a2\3\2\2\2B\u01ad\3\2\2\2D"+
		"\u01af\3\2\2\2F\u01b1\3\2\2\2H\u01b4\3\2\2\2J\u01b9\3\2\2\2L\u01be\3\2"+
		"\2\2N\u01c6\3\2\2\2P\u01d6\3\2\2\2R\u01d8\3\2\2\2T\u01dc\3\2\2\2V\u01f5"+
		"\3\2\2\2X\u01fd\3\2\2\2Z\u021d\3\2\2\2\\\u021f\3\2\2\2^\u0222\3\2\2\2"+
		"`\u022b\3\2\2\2b\u022e\3\2\2\2d\u0234\3\2\2\2f\u0236\3\2\2\2h\u0245\3"+
		"\2\2\2j\u0247\3\2\2\2l\u024a\3\2\2\2n\u024f\3\2\2\2p\u0251\3\2\2\2r\u0264"+
		"\3\2\2\2t\u0285\3\2\2\2v\u028e\3\2\2\2x\u0290\3\2\2\2z\u0292\3\2\2\2|"+
		"\u0295\3\2\2\2~\u029d\3\2\2\2\u0080\u02a1\3\2\2\2\u0082\u02a3\3\2\2\2"+
		"\u0084\u02ae\3\2\2\2\u0086\u02b8\3\2\2\2\u0088\u02ba\3\2\2\2\u008a\u02bc"+
		"\3\2\2\2\u008c\u02be\3\2\2\2\u008e\u02c0\3\2\2\2\u0090\u02c2\3\2\2\2\u0092"+
		"\u02c4\3\2\2\2\u0094\u02c6\3\2\2\2\u0096\u02d3\3\2\2\2\u0098\u02e9\3\2"+
		"\2\2\u009a\u02eb\3\2\2\2\u009c\u02f3\3\2\2\2\u009e\u02fb\3\2\2\2\u00a0"+
		"\u02fe\3\2\2\2\u00a2\u0306\3\2\2\2\u00a4\u0308\3\2\2\2\u00a6\u030a\3\2"+
		"\2\2\u00a8\u030e\3\2\2\2\u00aa\u0310\3\2\2\2\u00ac\u00ad\5\4\3\2\u00ad"+
		"\u00ae\7\u016d\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b7\7\u016d\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\2\2\3\u00b9"+
		"\3\3\2\2\2\u00ba\u00bb\5\6\4\2\u00bb\5\3\2\2\2\u00bc\u00bd\5\b\5\2\u00bd"+
		"\7\3\2\2\2\u00be\u00c0\5\20\t\2\u00bf\u00c1\5<\37\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\5H%\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5J&\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca\5L"+
		"\'\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\5N(\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\t\3\2\2\2\u00ce"+
		"\u00cf\7}\2\2\u00cf\13\3\2\2\2\u00d0\u00d1\7\36\2\2\u00d1\r\3\2\2\2\u00d2"+
		"\u00d3\79\2\2\u00d3\u00d4\7;\2\2\u00d4\17\3\2\2\2\u00d5\u00db\5\22\n\2"+
		"\u00d6\u00d7\5\24\13\2\u00d7\u00d8\5\22\n\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00f4\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e4\5\22\n\2\u00df"+
		"\u00e0\5\24\13\2\u00e0\u00e1\5\20\t\2\u00e1\u00e3\3\2\2\2\u00e2\u00df"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00f4\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\u0175\2\2\u00e8\u00e9"+
		"\5\b\5\2\u00e9\u00ef\7\u0176\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\5\20"+
		"\t\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f4\5*\26\2\u00f3\u00d5\3\2\2\2\u00f3\u00de\3\2\2\2\u00f3"+
		"\u00e7\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\21\3\2\2\2\u00f5\u00f7\5&\24"+
		"\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\7i\2\2\u00f9\u00fb\5\26\f\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\5\30\r\2\u00fd\u00ff\5$\23\2\u00fe\u00fd\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5.\30\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105\5\60"+
		"\31\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0108\5\62\32\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3"+
		"\2\2\2\u0109\u010b\5\64\33\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010e\5\66\34\2\u010d\u010c\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\23\3\2\2\2\u010f\u0111\t\2\2\2\u0110\u0112\t\3\2\2\u0111"+
		"\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\25\3\2\2\2\u0113\u011d\7\5\2"+
		"\2\u0114\u011a\7 \2\2\u0115\u0116\7U\2\2\u0116\u0117\7\u0175\2\2\u0117"+
		"\u0118\5|?\2\u0118\u0119\7\u0176\2\2\u0119\u011b\3\2\2\2\u011a\u0115\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0113\3\2\2\2\u011c"+
		"\u0114\3\2\2\2\u011d\27\3\2\2\2\u011e\u0123\5\32\16\2\u011f\u0120\7\u016e"+
		"\2\2\u0120\u0122\5\32\16\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125\u0123\3\2\2"+
		"\2\u0126\u0129\5\34\17\2\u0127\u0129\5\36\20\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\33\3\2\2\2\u012a\u012c\5t;\2\u012b\u012d\5 \21\2"+
		"\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\35\3\2\2\2\u012e\u012f"+
		"\5\u008cG\2\u012f\u0130\7\u017f\2\2\u0130\u0132\3\2\2\2\u0131\u012e\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\u017b\2\2"+
		"\u0134\37\3\2\2\2\u0135\u0137\7\t\2\2\u0136\u0135\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u013b\3\2\2\2\u0138\u013c\5\u00a4S\2\u0139\u013c\5\"\22"+
		"\2\u013a\u013c\7O\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c!\3\2\2\2\u013d\u013e\t\4\2\2\u013e#\3\2\2\2\u013f\u0141"+
		"\7;\2\2\u0140\u0142\t\5\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0145\7t\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5\u008cG\2\u0147%\3\2\2\2\u0148\u014a"+
		"\7\u0087\2\2\u0149\u014b\7\u00f7\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u0151\5(\25\2\u014d\u014e\7\u0175\2\2"+
		"\u014e\u014f\5\u009cO\2\u014f\u0150\7\u0176\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014d\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\t"+
		"\2\2\u0154\u015a\7\u0175\2\2\u0155\u015b\5\b\5\2\u0156\u015b\5p9\2\u0157"+
		"\u015b\5\16\b\2\u0158\u015b\5\n\6\2\u0159\u015b\5\f\7\2\u015a\u0155\3"+
		"\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7\u0176\2\2\u015d\'\3\2"+
		"\2\2\u015e\u015f\5\u00a6T\2\u015f)\3\2\2\2\u0160\u0162\7t\2\2\u0161\u0163"+
		"\7\u00e9\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0167\3\2\2"+
		"\2\u0164\u0166\5\u008cG\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168+\3\2\2\2\u0169\u0167\3\2\2\2"+
		"\u016a\u016b\7\u0175\2\2\u016b\u016c\5\b\5\2\u016c\u016d\7\u0176\2\2\u016d"+
		"\u0173\3\2\2\2\u016e\u016f\7\u0175\2\2\u016f\u0170\5p9\2\u0170\u0171\7"+
		"\u0176\2\2\u0171\u0173\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016e\3\2\2\2"+
		"\u0173-\3\2\2\2\u0174\u0175\7+\2\2\u0175\u017a\5T+\2\u0176\u0177\7\u016e"+
		"\2\2\u0177\u0179\5T+\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b/\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017e\7\u0086\2\2\u017e\u017f\5r:\2\u017f\61\3\2\2\2\u0180\u0181\7.\2"+
		"\2\u0181\u0182\7\20\2\2\u0182\u0183\5|?\2\u0183\63\3\2\2\2\u0184\u0185"+
		"\7/\2\2\u0185\u0186\5|?\2\u0186\65\3\2\2\2\u0187\u0188\7\u0127\2\2\u0188"+
		"\u0189\58\35\2\u0189\67\3\2\2\2\u018a\u018f\5:\36\2\u018b\u018c\7\u016e"+
		"\2\2\u018c\u018e\5:\36\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u01909\3\2\2\2\u0191\u018f\3\2\2\2"+
		"\u0192\u0193\5\u0090I\2\u0193\u0194\7\t\2\2\u0194\u0195\5\u0094K\2\u0195"+
		";\3\2\2\2\u0196\u0197\7Y\2\2\u0197\u0198\7\20\2\2\u0198\u0199\5> \2\u0199"+
		"=\3\2\2\2\u019a\u019f\5@!\2\u019b\u019c\7\u016e\2\2\u019c\u019e\5@!\2"+
		"\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0?\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\5t;\2\u01a3\u01a5"+
		"\5B\"\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a8\5F$\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8A\3\2\2\2\u01a9"+
		"\u01ae\7\n\2\2\u01aa\u01ae\7\37\2\2\u01ab\u01ac\7\177\2\2\u01ac\u01ae"+
		"\5D#\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"C\3\2\2\2\u01af\u01b0\t\6\2\2\u01b0E\3\2\2\2\u01b1\u01b2\7\u00e7\2\2\u01b2"+
		"\u01b3\t\7\2\2\u01b3G\3\2\2\2\u01b4\u01b7\7B\2\2\u01b5\u01b8\5P)\2\u01b6"+
		"\u01b8\7\5\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8I\3\2\2\2"+
		"\u01b9\u01ba\7T\2\2\u01ba\u01bc\5R*\2\u01bb\u01bd\t\b\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bdK\3\2\2\2\u01be\u01bf\7(\2\2\u01bf\u01c1"+
		"\t\t\2\2\u01c0\u01c2\5P)\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\t\b\2\2\u01c4\u01c5\7\u00e9\2\2\u01c5M\3\2"+
		"\2\2\u01c6\u01ce\7*\2\2\u01c7\u01cf\7}\2\2\u01c8\u01c9\7\u00e3\2\2\u01c9"+
		"\u01ca\7\u00cd\2\2\u01ca\u01cf\7}\2\2\u01cb\u01cf\7l\2\2\u01cc\u01cd\7"+
		"\u00cd\2\2\u01cd\u01cf\7l\2\2\u01ce\u01c7\3\2\2\2\u01ce\u01c8\3\2\2\2"+
		"\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1"+
		"\7Q\2\2\u01d1\u01d3\5\u009aN\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2"+
		"\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7N\2\2\u01d5O\3\2\2\2\u01d6\u01d7\5t"+
		";\2\u01d7Q\3\2\2\2\u01d8\u01d9\5t;\2\u01d9S\3\2\2\2\u01da\u01dd\5V,\2"+
		"\u01db\u01dd\5X-\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddU\3\2"+
		"\2\2\u01de\u01e0\7\u00e9\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e9\3\2\2\2\u01e1\u01e2\5\u0088E\2\u01e2\u01e3\7\u017f\2\2\u01e3\u01e5"+
		"\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\5\u008aF\2\u01e7\u01e8\7\u017f\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e4"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\5\u008cG"+
		"\2\u01ec\u01ee\7\u017b\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f0\3\2\2\2\u01ef\u01f1\5^\60\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f6\3\2\2\2\u01f2\u01f3\5b\62\2\u01f3\u01f4\5^\60\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01df\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6W\3\2\2\2"+
		"\u01f7\u01f8\b-\1\2\u01f8\u01f9\7\u0175\2\2\u01f9\u01fa\5X-\2\u01fa\u01fb"+
		"\7\u0176\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fe\5V,\2\u01fd\u01f7\3\2\2\2"+
		"\u01fd\u01fc\3\2\2\2\u01fe\u0215\3\2\2\2\u01ff\u0200\f\7\2\2\u0200\u0201"+
		"\7\33\2\2\u0201\u0202\7=\2\2\u0202\u0214\5X-\b\u0203\u0204\f\5\2\2\u0204"+
		"\u0205\7{\2\2\u0205\u0206\7=\2\2\u0206\u0214\5X-\6\u0207\u0209\f\6\2\2"+
		"\u0208\u020a\7J\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c"+
		"\3\2\2\2\u020b\u020d\5Z.\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\7=\2\2\u020f\u0211\5X-\2\u0210\u0212\5h\65"+
		"\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u01ff"+
		"\3\2\2\2\u0213\u0203\3\2\2\2\u0213\u0207\3\2\2\2\u0214\u0217\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216Y\3\2\2\2\u0217\u0215\3\2\2\2"+
		"\u0218\u021e\78\2\2\u0219\u021b\5\\/\2\u021a\u021c\7Z\2\2\u021b\u021a"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u0218\3\2\2\2\u021d"+
		"\u0219\3\2\2\2\u021e[\3\2\2\2\u021f\u0220\t\n\2\2\u0220]\3\2\2\2\u0221"+
		"\u0223\7\t\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0229\5\u00a2R\2\u0225\u0226\7\u0175\2\2\u0226\u0227\5`\61"+
		"\2\u0227\u0228\7\u0176\2\2\u0228\u022a\3\2\2\2\u0229\u0225\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a_\3\2\2\2\u022b\u022c\5\u009cO\2\u022ca\3\2\2\2\u022d"+
		"\u022f\7\u00cf\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232"+
		"\3\2\2\2\u0230\u0233\5d\63\2\u0231\u0233\5f\64\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0231\3\2\2\2\u0233c\3\2\2\2\u0234\u0235\5,\27\2\u0235e\3\2\2\2\u0236"+
		"\u0237\5\u0080A\2\u0237\u0239\7\u0175\2\2\u0238\u023a\5\26\f\2\u0239\u0238"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u023d\5\u0084C"+
		"\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u0240"+
		"\5<\37\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\7\u0176\2\2\u0242g\3\2\2\2\u0243\u0246\5j\66\2\u0244\u0246\5l\67"+
		"\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246i\3\2\2\2\u0247\u0248"+
		"\7U\2\2\u0248\u0249\5r:\2\u0249k\3\2\2\2\u024a\u024b\7\177\2\2\u024b\u024c"+
		"\7\u0175\2\2\u024c\u024d\5n8\2\u024d\u024e\7\u0176\2\2\u024em\3\2\2\2"+
		"\u024f\u0250\5\u009cO\2\u0250o\3\2\2\2\u0251\u0252\7\u0081\2\2\u0252\u0253"+
		"\7\u0175\2\2\u0253\u0254\5|?\2\u0254\u025b\7\u0176\2\2\u0255\u0256\7\u0175"+
		"\2\2\u0256\u0257\5|?\2\u0257\u0258\7\u0176\2\2\u0258\u025a\3\2\2\2\u0259"+
		"\u0255\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0260\5<\37\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0263\5H"+
		"%\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263q\3\2\2\2\u0264\u0265"+
		"\5t;\2\u0265s\3\2\2\2\u0266\u0267\b;\1\2\u0267\u0286\5v<\2\u0268\u0286"+
		"\5x=\2\u0269\u026a\5\u0088E\2\u026a\u026b\7\u017f\2\2\u026b\u026d\3\2"+
		"\2\2\u026c\u0269\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\5\u008aF\2\u026f\u0270\7\u017f\2\2\u0270\u0271\5\u008cG\2\u0271"+
		"\u0272\7\u017f\2\2\u0272\u027f\3\2\2\2\u0273\u0274\5\u008aF\2\u0274\u0275"+
		"\7\u017f\2\2\u0275\u0277\3\2\2\2\u0276\u0273\3\2\2\2\u0276\u0277\3\2\2"+
		"\2\u0277\u0278\3\2\2\2\u0278\u0279\5\u008cG\2\u0279\u027a\7\u017f\2\2"+
		"\u027a\u027f\3\2\2\2\u027b\u027c\5\u008cG\2\u027c\u027d\7\u017f\2\2\u027d"+
		"\u027f\3\2\2\2\u027e\u026c\3\2\2\2\u027e\u0276\3\2\2\2\u027e\u027b\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0286\5\u008eH\2\u0281"+
		"\u0286\7\u0198\2\2\u0282\u0286\7O\2\2\u0283\u0286\5f\64\2\u0284\u0286"+
		"\5,\27\2\u0285\u0266\3\2\2\2\u0285\u0268\3\2\2\2\u0285\u027e\3\2\2\2\u0285"+
		"\u0281\3\2\2\2\u0285\u0282\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2"+
		"\2\2\u0286\u028b\3\2\2\2\u0287\u0288\f\3\2\2\u0288\u028a\5z>\2\u0289\u0287"+
		"\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"u\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\t\13\2\2\u028fw\3\2\2\2\u0290"+
		"\u0291\7\u019a\2\2\u0291y\3\2\2\2\u0292\u0293\7\u0097\2\2\u0293\u0294"+
		"\5\u008eH\2\u0294{\3\2\2\2\u0295\u029a\5t;\2\u0296\u0297\7\u016e\2\2\u0297"+
		"\u0299\5t;\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2"+
		"\2\u029a\u029b\3\2\2\2\u029b}\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e"+
		"\7\u0136\2\2\u029e\177\3\2\2\2\u029f\u02a2\5\u0082B\2\u02a0\u02a2\5\u00a6"+
		"T\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u0081\3\2\2\2\u02a3"+
		"\u02a4\t\f\2\2\u02a4\u0083\3\2\2\2\u02a5\u02aa\5\u0086D\2\u02a6\u02a7"+
		"\7\u016e\2\2\u02a7\u02a9\5\u0086D\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3"+
		"\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02af\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ad\u02af\7\u017b\2\2\u02ae\u02a5\3\2\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02af\u0085\3\2\2\2\u02b0\u02b2\7\u0121\2\2\u02b1\u02b0\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b9\5t;\2\u02b4\u02b5"+
		"\5\u00a8U\2\u02b5\u02b6\7\u016a\2\2\u02b6\u02b7\5t;\2\u02b7\u02b9\3\2"+
		"\2\2\u02b8\u02b1\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9\u0087\3\2\2\2\u02ba"+
		"\u02bb\5\u00a6T\2\u02bb\u0089\3\2\2\2\u02bc\u02bd\5\u00a6T\2\u02bd\u008b"+
		"\3\2\2\2\u02be\u02bf\5\u00a6T\2\u02bf\u008d\3\2\2\2\u02c0\u02c1\5\u00a6"+
		"T\2\u02c1\u008f\3\2\2\2\u02c2\u02c3\5\u00a6T\2\u02c3\u0091\3\2\2\2\u02c4"+
		"\u02c5\5\u00a6T\2\u02c5\u0093\3\2\2\2\u02c6\u02ca\5\u0092J\2\u02c7\u02c8"+
		"\7\u00ed\2\2\u02c8\u02c9\7\20\2\2\u02c9\u02cb\5|?\2\u02ca\u02c7\3\2\2"+
		"\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\5<\37\2\u02cd\u02cc"+
		"\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02d1\5\u0096L"+
		"\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u0095\3\2\2\2\u02d2\u02d4"+
		"\t\r\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02db\3\2\2\2\u02d5"+
		"\u02dc\5\u0098M\2\u02d6\u02d7\7\16\2\2\u02d7\u02d8\5\u0098M\2\u02d8\u02d9"+
		"\7#\2\2\u02d9\u02da\5\u0098M\2\u02da\u02dc\3\2\2\2\u02db\u02d5\3\2\2\2"+
		"\u02db\u02d6\3\2\2\2\u02dc\u0097\3\2\2\2\u02dd\u02de\7\u011b\2\2\u02de"+
		"\u02ea\7\u00f1\2\2\u02df\u02e0\7\34\2\2\u02e0\u02ea\7f\2\2\u02e1\u02e2"+
		"\7\u011b\2\2\u02e2\u02ea\7\u00b8\2\2\u02e3\u02e4\5t;\2\u02e4\u02e5\7\u00f1"+
		"\2\2\u02e5\u02ea\3\2\2\2\u02e6\u02e7\5t;\2\u02e7\u02e8\7\u00b8\2\2\u02e8"+
		"\u02ea\3\2\2\2\u02e9\u02dd\3\2\2\2\u02e9\u02df\3\2\2\2\u02e9\u02e1\3\2"+
		"\2\2\u02e9\u02e3\3\2\2\2\u02e9\u02e6\3\2\2\2\u02ea\u0099\3\2\2\2\u02eb"+
		"\u02f0\5\u008cG\2\u02ec\u02ed\7\u016e\2\2\u02ed\u02ef\5\u008cG\2\u02ee"+
		"\u02ec\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2"+
		"\2\2\u02f1\u009b\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f8\5\u008eH\2\u02f4"+
		"\u02f5\7\u016e\2\2\u02f5\u02f7\5\u008eH\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa"+
		"\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u009d\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fb\u02fc\5\u008eH\2\u02fc\u02fd\5~@\2\u02fd\u009f\3"+
		"\2\2\2\u02fe\u0303\5\u009eP\2\u02ff\u0300\7\u016e\2\2\u0300\u0302\5\u009e"+
		"P\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u00a1\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\5\u00a6"+
		"T\2\u0307\u00a3\3\2\2\2\u0308\u0309\5\u00a6T\2\u0309\u00a5\3\2\2\2\u030a"+
		"\u030b\5\u00a8U\2\u030b\u00a7\3\2\2\2\u030c\u030f\t\16\2\2\u030d\u030f"+
		"\5\u00aaV\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030f\u00a9\3\2\2"+
		"\2\u0310\u0311\t\17\2\2\u0311\u00ab\3\2\2\2`\u00b1\u00b6\u00c0\u00c3\u00c6"+
		"\u00c9\u00cc\u00db\u00e4\u00ef\u00f3\u00f6\u00fa\u00fe\u0101\u0104\u0107"+
		"\u010a\u010d\u0111\u011a\u011c\u0123\u0128\u012c\u0131\u0136\u013b\u0141"+
		"\u0144\u014a\u0151\u015a\u0162\u0167\u0172\u017a\u018f\u019f\u01a4\u01a7"+
		"\u01ad\u01b7\u01bc\u01c1\u01ce\u01d2\u01dc\u01df\u01e4\u01e9\u01ed\u01f0"+
		"\u01f5\u01fd\u0209\u020c\u0211\u0213\u0215\u021b\u021d\u0222\u0229\u022e"+
		"\u0232\u0239\u023c\u023f\u0245\u025b\u025f\u0262\u026c\u0276\u027e\u0285"+
		"\u028b\u029a\u02a1\u02aa\u02ae\u02b1\u02b8\u02ca\u02cd\u02d0\u02d3\u02db"+
		"\u02e9\u02f0\u02f8\u0303\u030e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}