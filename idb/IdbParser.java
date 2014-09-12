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
		RULE_sql = 0, RULE_statement = 1, RULE_dml = 2, RULE_ddl = 3, RULE_dcl = 4, 
		RULE_identifier = 5, RULE_nonreserved_keywords = 6;
	public static final String[] ruleNames = {
		"sql", "statement", "dml", "ddl", "dcl", "identifier", "nonreserved_keywords"
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
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14); statement();
					setState(15); match(SEMI_COLON);
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22); statement();
			setState(24);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(23); match(SEMI_COLON);
				}
			}

			setState(26); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DdlContext ddl() {
			return getRuleContext(DdlContext.class,0);
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
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); dml();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); ddl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30); dcl();
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

	public static class DmlContext extends ParserRuleContext {
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
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdlContext extends ParserRuleContext {
		public DdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlContext ddl() throws RecognitionException {
		DdlContext _localctx = new DdlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ddl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IdbParserVisitor ) return ((IdbParserVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_identifier);
		int _la;
		try {
			setState(41);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
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
				setState(40); nonreserved_keywords();
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
		public TerminalNode TIMESTAMP() { return getToken(IdbParser.TIMESTAMP, 0); }
		public TerminalNode BIT() { return getToken(IdbParser.BIT, 0); }
		public TerminalNode COALESCE() { return getToken(IdbParser.COALESCE, 0); }
		public TerminalNode STDDEV_POP() { return getToken(IdbParser.STDDEV_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(IdbParser.VAR_SAMP, 0); }
		public TerminalNode SUM() { return getToken(IdbParser.SUM, 0); }
		public TerminalNode INT() { return getToken(IdbParser.INT, 0); }
		public TerminalNode QUARTER() { return getToken(IdbParser.QUARTER, 0); }
		public TerminalNode EVERY() { return getToken(IdbParser.EVERY, 0); }
		public TerminalNode NVARCHAR() { return getToken(IdbParser.NVARCHAR, 0); }
		public TerminalNode INT1() { return getToken(IdbParser.INT1, 0); }
		public TerminalNode MAX() { return getToken(IdbParser.MAX, 0); }
		public TerminalNode ROLLUP() { return getToken(IdbParser.ROLLUP, 0); }
		public TerminalNode SECOND() { return getToken(IdbParser.SECOND, 0); }
		public TerminalNode COUNT() { return getToken(IdbParser.COUNT, 0); }
		public TerminalNode YEAR() { return getToken(IdbParser.YEAR, 0); }
		public TerminalNode VARYING() { return getToken(IdbParser.VARYING, 0); }
		public TerminalNode SIMILAR() { return getToken(IdbParser.SIMILAR, 0); }
		public TerminalNode RLIKE() { return getToken(IdbParser.RLIKE, 0); }
		public TerminalNode BYTEA() { return getToken(IdbParser.BYTEA, 0); }
		public TerminalNode PARTITION() { return getToken(IdbParser.PARTITION, 0); }
		public TerminalNode INTERVAL() { return getToken(IdbParser.INTERVAL, 0); }
		public TerminalNode CHAR() { return getToken(IdbParser.CHAR, 0); }
		public TerminalNode VARBINARY() { return getToken(IdbParser.VARBINARY, 0); }
		public TerminalNode ANALYZE() { return getToken(IdbParser.ANALYZE, 0); }
		public TerminalNode VARCHAR() { return getToken(IdbParser.VARCHAR, 0); }
		public TerminalNode AVG() { return getToken(IdbParser.AVG, 0); }
		public TerminalNode INET4() { return getToken(IdbParser.INET4, 0); }
		public TerminalNode FLOAT8() { return getToken(IdbParser.FLOAT8, 0); }
		public TerminalNode DROP() { return getToken(IdbParser.DROP, 0); }
		public TerminalNode USAGE() { return getToken(IdbParser.USAGE, 0); }
		public TerminalNode VAR_POP() { return getToken(IdbParser.VAR_POP, 0); }
		public TerminalNode ISOYEAR() { return getToken(IdbParser.ISOYEAR, 0); }
		public TerminalNode MINUTE() { return getToken(IdbParser.MINUTE, 0); }
		public TerminalNode LAST() { return getToken(IdbParser.LAST, 0); }
		public TerminalNode COLUMN() { return getToken(IdbParser.COLUMN, 0); }
		public TerminalNode CASCADE() { return getToken(IdbParser.CASCADE, 0); }
		public TerminalNode DATA() { return getToken(IdbParser.DATA, 0); }
		public TerminalNode OVERWRITE() { return getToken(IdbParser.OVERWRITE, 0); }
		public TerminalNode NCHAR() { return getToken(IdbParser.NCHAR, 0); }
		public TerminalNode ONLY() { return getToken(IdbParser.ONLY, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(IdbParser.TIMEZONE_HOUR, 0); }
		public TerminalNode TIMETZ() { return getToken(IdbParser.TIMETZ, 0); }
		public TerminalNode FOLLOWING() { return getToken(IdbParser.FOLLOWING, 0); }
		public TerminalNode TABLESPACE() { return getToken(IdbParser.TABLESPACE, 0); }
		public TerminalNode VERBOSE() { return getToken(IdbParser.VERBOSE, 0); }
		public TerminalNode TEXT() { return getToken(IdbParser.TEXT, 0); }
		public TerminalNode MONTH() { return getToken(IdbParser.MONTH, 0); }
		public TerminalNode BLOB() { return getToken(IdbParser.BLOB, 0); }
		public TerminalNode DEC() { return getToken(IdbParser.DEC, 0); }
		public TerminalNode PRECEDING() { return getToken(IdbParser.PRECEDING, 0); }
		public TerminalNode INTERSECTION() { return getToken(IdbParser.INTERSECTION, 0); }
		public TerminalNode CURSOR() { return getToken(IdbParser.CURSOR, 0); }
		public TerminalNode LESS() { return getToken(IdbParser.LESS, 0); }
		public TerminalNode MILLENNIUM() { return getToken(IdbParser.MILLENNIUM, 0); }
		public TerminalNode TINYINT() { return getToken(IdbParser.TINYINT, 0); }
		public TerminalNode GROUPING() { return getToken(IdbParser.GROUPING, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(IdbParser.TIMESTAMPTZ, 0); }
		public TerminalNode NATIONAL() { return getToken(IdbParser.NATIONAL, 0); }
		public TerminalNode BETWEEN() { return getToken(IdbParser.BETWEEN, 0); }
		public TerminalNode DATE() { return getToken(IdbParser.DATE, 0); }
		public TerminalNode FUSION() { return getToken(IdbParser.FUSION, 0); }
		public TerminalNode ROWS() { return getToken(IdbParser.ROWS, 0); }
		public TerminalNode INT2() { return getToken(IdbParser.INT2, 0); }
		public TerminalNode VARBIT() { return getToken(IdbParser.VARBIT, 0); }
		public TerminalNode ZONE() { return getToken(IdbParser.ZONE, 0); }
		public TerminalNode WEEK() { return getToken(IdbParser.WEEK, 0); }
		public TerminalNode SEQUENCES() { return getToken(IdbParser.SEQUENCES, 0); }
		public TerminalNode FIRST() { return getToken(IdbParser.FIRST, 0); }
		public TerminalNode NULLIF() { return getToken(IdbParser.NULLIF, 0); }
		public TerminalNode TIME() { return getToken(IdbParser.TIME, 0); }
		public TerminalNode TRIM() { return getToken(IdbParser.TRIM, 0); }
		public TerminalNode KEY() { return getToken(IdbParser.KEY, 0); }
		public TerminalNode DOUBLE() { return getToken(IdbParser.DOUBLE, 0); }
		public TerminalNode INSERT() { return getToken(IdbParser.INSERT, 0); }
		public TerminalNode LOCATION() { return getToken(IdbParser.LOCATION, 0); }
		public TerminalNode CENTURY() { return getToken(IdbParser.CENTURY, 0); }
		public TerminalNode LIST() { return getToken(IdbParser.LIST, 0); }
		public TerminalNode RETURNING() { return getToken(IdbParser.RETURNING, 0); }
		public TerminalNode BY() { return getToken(IdbParser.BY, 0); }
		public TerminalNode RECURSIVE() { return getToken(IdbParser.RECURSIVE, 0); }
		public TerminalNode CYCLE() { return getToken(IdbParser.CYCLE, 0); }
		public TerminalNode TO() { return getToken(IdbParser.TO, 0); }
		public TerminalNode TYPE() { return getToken(IdbParser.TYPE, 0); }
		public TerminalNode SMALLINT() { return getToken(IdbParser.SMALLINT, 0); }
		public TerminalNode ISODOW() { return getToken(IdbParser.ISODOW, 0); }
		public TerminalNode FORMAT() { return getToken(IdbParser.FORMAT, 0); }
		public TerminalNode WINDOW() { return getToken(IdbParser.WINDOW, 0); }
		public TerminalNode DOY() { return getToken(IdbParser.DOY, 0); }
		public TerminalNode MIN() { return getToken(IdbParser.MIN, 0); }
		public TerminalNode FILTER() { return getToken(IdbParser.FILTER, 0); }
		public TerminalNode PRECISION() { return getToken(IdbParser.PRECISION, 0); }
		public TerminalNode RESTRICT() { return getToken(IdbParser.RESTRICT, 0); }
		public TerminalNode SUBPARTITION() { return getToken(IdbParser.SUBPARTITION, 0); }
		public TerminalNode DOW() { return getToken(IdbParser.DOW, 0); }
		public TerminalNode EXTERNAL() { return getToken(IdbParser.EXTERNAL, 0); }
		public TerminalNode MICROSECONDS() { return getToken(IdbParser.MICROSECONDS, 0); }
		public TerminalNode HASH() { return getToken(IdbParser.HASH, 0); }
		public TerminalNode DECIMAL() { return getToken(IdbParser.DECIMAL, 0); }
		public TerminalNode SET() { return getToken(IdbParser.SET, 0); }
		public TerminalNode THAN() { return getToken(IdbParser.THAN, 0); }
		public TerminalNode EPOCH() { return getToken(IdbParser.EPOCH, 0); }
		public TerminalNode REGEXP() { return getToken(IdbParser.REGEXP, 0); }
		public TerminalNode SCHEMA() { return getToken(IdbParser.SCHEMA, 0); }
		public TerminalNode TIMEZONE() { return getToken(IdbParser.TIMEZONE, 0); }
		public TerminalNode FLOAT4() { return getToken(IdbParser.FLOAT4, 0); }
		public TerminalNode TABLES() { return getToken(IdbParser.TABLES, 0); }
		public TerminalNode CUBE() { return getToken(IdbParser.CUBE, 0); }
		public TerminalNode UNKNOWN() { return getToken(IdbParser.UNKNOWN, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(IdbParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode BOOLEAN() { return getToken(IdbParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(IdbParser.CHARACTER, 0); }
		public TerminalNode REAL() { return getToken(IdbParser.REAL, 0); }
		public TerminalNode DAY() { return getToken(IdbParser.DAY, 0); }
		public TerminalNode COLLECT() { return getToken(IdbParser.COLLECT, 0); }
		public TerminalNode BIGINT() { return getToken(IdbParser.BIGINT, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(IdbParser.STDDEV_SAMP, 0); }
		public TerminalNode RANGE() { return getToken(IdbParser.RANGE, 0); }
		public TerminalNode FLOAT() { return getToken(IdbParser.FLOAT, 0); }
		public TerminalNode EXTRACT() { return getToken(IdbParser.EXTRACT, 0); }
		public TerminalNode INT4() { return getToken(IdbParser.INT4, 0); }
		public TerminalNode MAXVALUE() { return getToken(IdbParser.MAXVALUE, 0); }
		public TerminalNode MILLISECONDS() { return getToken(IdbParser.MILLISECONDS, 0); }
		public TerminalNode NUMERIC() { return getToken(IdbParser.NUMERIC, 0); }
		public TerminalNode BOOL() { return getToken(IdbParser.BOOL, 0); }
		public TerminalNode SEQUENCE() { return getToken(IdbParser.SEQUENCE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(IdbParser.UNBOUNDED, 0); }
		public TerminalNode INT8() { return getToken(IdbParser.INT8, 0); }
		public TerminalNode HOUR() { return getToken(IdbParser.HOUR, 0); }
		public TerminalNode REPLACE() { return getToken(IdbParser.REPLACE, 0); }
		public TerminalNode DECADE() { return getToken(IdbParser.DECADE, 0); }
		public TerminalNode INTEGER() { return getToken(IdbParser.INTEGER, 0); }
		public TerminalNode INDEX() { return getToken(IdbParser.INDEX, 0); }
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
		enterRule(_localctx, 12, RULE_nonreserved_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0164\60\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\3\2\5\2\33\n\2\3\2\3\2\3\3\3\3\3\3\5\3\"\n\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7,\n\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f"+
		"\16\2\4\3\2\u015e\u015f+\2RRUUWXZ\\`bhouxzz\177\u0083\u0087\u0087\u0089"+
		"\u0089\u008b\u008c\u008e\u008e\u0092\u0092\u0098\u0099\u009b\u009e\u00a0"+
		"\u00a1\u00a3\u00a3\u00a7\u00ac\u00ae\u00af\u00b1\u00b1\u00b6\u00b6\u00ba"+
		"\u00bb\u00be\u00bf\u00c2\u00c3\u00c7\u00c9\u00cc\u00cc\u00d0\u00d0\u00d2"+
		"\u00d3\u00d5\u00d8\u00da\u00dd\u00df\u00df\u00e2\u00e3\u00e5\u00e5\u00e7"+
		"\u00e9\u00ec\u00ef\u00f1\u00f5\u00f8\u00f8\u00fc\u0101\u0104\u0124\u0128"+
		"\u012b-\2\25\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2\f+\3"+
		"\2\2\2\16-\3\2\2\2\20\21\5\4\3\2\21\22\7\u0135\2\2\22\24\3\2\2\2\23\20"+
		"\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25"+
		"\3\2\2\2\30\32\5\4\3\2\31\33\7\u0135\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33"+
		"\34\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\"\5\6\4\2\37\"\5\b\5\2 \"\5"+
		"\n\6\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\3\2\2\2$\7\3\2"+
		"\2\2%&\3\2\2\2&\t\3\2\2\2\'(\3\2\2\2(\13\3\2\2\2),\t\2\2\2*,\5\16\b\2"+
		"+)\3\2\2\2+*\3\2\2\2,\r\3\2\2\2-.\t\3\2\2.\17\3\2\2\2\6\25\32!+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}