lexer grammar IdbLexer;

@header {
    package com.intple.dbone.parser.v4.idb;
}

@members {
}


/*
===============================================================================
  Tokens for Case Insensitive Keywords
===============================================================================
*/
fragment A
    :	'A' | 'a';

fragment B
    :	'B' | 'b';

fragment C
    :	'C' | 'c';

fragment D
    :	'D' | 'd';

fragment E
    :	'E' | 'e';

fragment F
    :	'F' | 'f';

fragment G
    :	'G' | 'g';

fragment H
    :	'H' | 'h';

fragment I
    :	'I' | 'i';

fragment J
    :	'J' | 'j';

fragment K
    :	'K' | 'k';

fragment L
    :	'L' | 'l';

fragment M
    :	'M' | 'm';

fragment N
    :	'N' | 'n';

fragment O
    :	'O' | 'o';

fragment P
    :	'P' | 'p';

fragment Q
    :	'Q' | 'q';

fragment R
    :	'R' | 'r';

fragment S
    :	'S' | 's';

fragment T
    :	'T' | 't';

fragment U
    :	'U' | 'u';

fragment V
    :	'V' | 'v';

fragment W
    :	'W' | 'w';

fragment X
    :	'X' | 'x';

fragment Y
    :	'Y' | 'y';

fragment Z
    :	'Z' | 'z';

/*
===============================================================================
  Reserved Keywords
===============================================================================
*/
ACCESS : A C C E S S;
ADD : A D D;
ALL : A L L;
ALTER : A L T E R;
AND : A N D;
ANY : A N Y;
AS : A S;
ASC : A S C;
ASYMMETRIC : A S Y M M E T R I C;
AUDIT : A U D I T;
BEGIN : B E G I N;
BETWEEN : B E T W E E N;
BOTH : B O T H;
BY : B Y;
CASE : C A S E;
CAST : C A S T;
CHECK : C H E C K;
CLUSTER : C L U S T E R;
COLUMN : C O L U M N;
COMMENT : C O M M E N T;
COMMIT : C O M M I T;
COMPRESS : C O M P R E S S;
CONNECT : C O N N E C T;
CREATE : C R E A T E;
CROSS : C R O S S;
CURRENT : C U R R E N T;
DEFAULT : D E F A U L T;
DELETE : D E L E T E;
DESC : D E S C;
DISTINCT : D I S T I N C T;
DROP : D R O P;
ELSE : E L S E;
END : E N D;
EXCEPT : E X C E P T;
EXCLUSIVE : E X C L U S I V E;
EXISTS : E X I S T S;
EXPLAIN : E X P L A I N;
FETCH : F E T C H;
FILE : F I L E;
FOR : F O R;
FROM : F R O M;
FULL : F U L L;
GRANT : G R A N T;
GROUP : G R O U P;
HAVING : H A V I N G;
IDENTIFIED : I D E N T I F I E D;
IF : I F;
ILIKE : I L I K E;
IMMEDIATE : I M M E D I A T E;
IN : I N;
INCREMENT : I N C R E M E N T;
INDEX : I N D E X;
INITIAL : I N I T I A L;
INNER : I N N E R;
INSERT : I N S E R T;
INTERSECT : I N T E R S E C T;
INTO : I N T O;
IS : I S;
ISNULL : I S N U L L;
JOIN : J O I N;
LEADING : L E A D I N G;
LEFT : L E F T;
LEVEL : L E V E L;
LIKE : L I K E;
LIMIT : L I M I T;
LOCK : L O C K;
LONG : L O N G;
MAXEXTENTS : M A X E X T E N T S;
MINUS : M I N U S;
MLSLABEL : M L S L A B E L;
MODE : M O D E;
MODIFY : M O D I F Y;
NATURAL : N A T U R A L;
NOAUDIT : N O A U D I T;
NOCOMPRESS : N O C O M P R E S S;
NOTNULL : N O T N U L L;
NOT : N O T;
NOWAIT : N O W A I T;
NULL : N U L L;
NUMBER : N U M B E R;
OF : O F;
OFF : O F F;
OFFLINE : O F F L I N E;
OFFSET : O F F S E T;
ON : O N;
ONLINE : O N L I N E;
OPTION : O P T I O N;
OR : O R;
ORDER : O R D E R;
OUTER : O U T E R;
PCTFREE : P C T F R E E;
PRIOR : P R I O R;
PRIVILEGES : P R I V I L E G E S;
PUBLIC : P U B L I C;
RAW : R A W;
REINDEX : R E I N D E X;
RENAME : R E N A M E;
RESOURCE : R E S O U R C E;
REVOKE : R E V O K E;
RIGHT : R I G H T;
ROLLBACK : R O L L B A C K;
ROW : R O W;
ROWS : R O W S;
SAVEPOINT : S A V E P O I N T;
SELECT : S E L E C T;
SESSION : S E S S I O N;
SET : S E T;
SHARE : S H A R E;
SIZE : S I Z E;
SOME : S O M E;
START : S T A R T;
SUCCESSFUL : S U C C E S S F U L;
SYMMETRIC : S Y M M E T R I C;
SYNONYM : S Y N O N Y M;
SYSDATE : S Y S D A T E;
TABLE : T A B L E;
THEN : T H E N;
TO : T O;
TRAILING : T R A I L I N G;
TRIGGER : T R I G G E R;
TRUNCATE : T R U N C A T E;
UID : U I D;
UNION : U N I O N;
UNIQUE : U N I Q U E;
UPDATE : U P D A T E;
USER : U S E R;
USING : U S I N G;
VALIDATE : V A L I D A T E;
VALUES : V A L U E S;
VARCHAR2 : V A R C H A R '2';
VIEW : V I E W;
WHEN : W H E N;
WHENEVER : W H E N E V E R;
WHERE : W H E R E;
WITH : W I T H;
FALSE : F A L S E;
TRUE : T R U E;

/*
===============================================================================
  Non Reserved Keywords
===============================================================================
*/
ABORT : A B O R T;
ABSOLUTE : A B S O L U T E;
ACTION : A C T I O N;
ANALYZE : A N A L Y Z E;
ARRAY : A R R A Y;
AT : A T;
AVG : A V G;
BACKWARD : B A C K W A R D;

CACHE : C A C H E;
CASCADE : C A S C A D E;
CENTURY : C E N T U R Y;
CHARACTER : C H A R A C T E R;
CLOSE : C L O S E;
COLLATE : C O L L A T E;
COLLECT : C O L L E C T;
COALESCE : C O A L E S C E;
CONCURRENTLY : C O N C U R R E N T L Y;
CONSTRAINT : C O N S T R A I N T;
CONSTRAINTS : C O N S T R A I N T S;
CONTENT : C O N T E N T;
CONTINUE : C O N T I N U E;
COSTS : C O S T S;
COUNT : C O U N T;
CUBE : C U B E;
CURSOR : C U R S O R;
CYCLE : C Y C L E;

DATA : D A T A;
DAY : D A Y;
DEC : D E C;
DECADE : D E C A D E;
DECLARE : D E C L A R E;
DEFAULTS : D E F A U L T S;
DEFERRED : D E F E R R E D;
DEFERRABLE : D E F E R R A B L E;
DISCARD : D I S C A R D;
DOCUMENT : D O C U M E N T;
DOW : D O W;
DOY : D O Y;

EPOCH : E P O C H;
ESCAPE : E S C A P E;
EVERY : E V E R Y;
EXCLUDE : E X C L U D E;
EXCLUDING : E X C L U D I N G;
EXTENDED : E X T E N D E D;
EXTERNAL : E X T E R N A L;
EXTRACT : E X T R A C T;

FILTER : F I L T E R;
FIRST : F I R S T;
FOLLOWING : F O L L O W I N G;
FORCE : F O R C E;
FOREIGN : F O R E I G N;
FORMAT : F O R M A T;
FORWARD : F O R W A R D;
FUSION : F U S I O N;

GLOBAL : G L O B A L;
GROUPING : G R O U P I N G;

HASH : H A S H;
HOLD : H O L D;
HOUR : H O U R;

IDENTITY : I D E N T I T Y;
INCLUDING : I N C L U D I N G;
INDEXES : I N D E X E S;
INHERIT : I N H E R I T;
INHERITS : I N H E R I T S;
INITIALLY : I N I T I A L L Y;
INSENSITIVE : I N S E N S I T I V E;
INTERSECTION : I N T E R S E C T I O N;
ISODOW : I S O D O W;
ISOYEAR : I S O Y E A R;

KEY : K E Y;

LAST : L A S T;
LATERAL : L A T E R A L;
LESS : L E S S;
LIST : L I S T;
LOCAL : L O C A L;
LOCATION : L O C A T I O N;

MAIN : M A I N;
MATCH : M A T C H;
MATERIALIZED : M A T E R I A L I Z E D;
MAX : M A X;
MAXVALUE : M A X V A L U E;
MICROSECONDS : M I C R O S E C O N D S;
MILLENNIUM : M I L L E N N I U M;
MILLISECONDS : M I L L I S E C O N D S;
MIN : M I N;
MINVALUE : M I N V A L U E;
MINUTE : M I N U T E;
MONTH : M O N T H;
MOVE : M O V E;

NATIONAL : N A T I O N A L;
NEXT : N E X T;
NO : N O;
NO_INHERIT : N O UNDERLINE I N H E R I T;
NONE: N O N E;
NULLIF : N U L L I F;
NULLS : N U L L S;

OIDS : O I D S;
ONLY : O N L Y;
OVER : O V E R;
OVERLAPS : O V E R L A P S;
OVERWRITE : O V E R W R I T E;
OWNED : O W N E D;

PARTIAL : P A R T I A L;
PARTITION : P A R T I T I O N;
PARTITIONS : P A R T I T I O N S;
PLAIN : P L A I N;
POSITION : P O S I T I O N;
PRECEDING : P R E C E D I N G;
PRECISION : P R E C I S I O N;
PRESERVE : P R E S E R V E;
PRIMARY : P R I M A R Y;

QUARTER : Q U A R T E R;

RANGE : R A N G E;
RECURSIVE : R E C U R S I V E;
REFERENCES : R E F E R E N C E S;
REFRESH : R E F R E S H;
REGEXP : R E G E X P;
RELATIVE : R E L A T I V E;
RELEASE : R E L E A S E;
REPLACE : R E P L A C E;
RESTART : R E S T A R T;
RESTRICT : R E S T R I C T;
RETURNING : R E T U R N I N G;
RLIKE : R L I K E;
ROLLUP : R O L L U P;

SCHEMA : S C H E M A;
SCROLL : S C R O L L;
SECOND : S E C O N D;
SEQUENCE : S E Q U E N C E;
SEQUENCES : S E Q U E N C E S;
SIMILAR : S I M I L A R;
SIMPLE : S I M P L E;
STDDEV_POP : S T D D E V UNDERLINE P O P;
STDDEV_SAMP : S T D D E V UNDERLINE S A M P;
STORAGE : S T O R A G E;
SUBPARTITION : S U B P A R T I T I O N;
SUBSTRING : S U B S T R I N G;
SUM : S U M;

TABLES : T A B L E S;
TABLESPACE : T A B L E S P A C E;
TEMPORARY : T E M P O R A R Y;
TEMP : T E M P;
THAN : T H A N;
TIMEZONE: T I M E Z O N E;
TIMEZONE_HOUR: T I M E Z O N E UNDERLINE H O U R;
TIMEZONE_MINUTE: T I M E Z O N E UNDERLINE M I N U T E;
TRANSACTION: T R A N S A C T I O N;
TRIM : T R I M;
TYPE : T Y P E;

UNBOUNDED : U N B O U N D E D;
UNKNOWN : U N K N O W N;
UNLOGGED : U N L O G G E D;
UNSECURED : U N S E C U R E D;
USAGE : U S A G E;

VALID : V A L I D;
VARIADIC : V A R I A D I C;
VAR_SAMP : V A R UNDERLINE S A M P;
VAR_POP : V A R UNDERLINE P O P;
VARYING : V A R Y I N G;
VERBOSE : V E R B O S E;

WEEK : W E E K;
WINDOW : W I N D O W;
WITHIN : W I T H I N;
WITHOUT : W I T H O U T;

XMLPARSE : X M L P A R S E;
XMLSERIALIZE : X M L S E R I A L I Z E;

YEAR : Y E A R;

ZONE : Z O N E;


/*
===============================================================================
 Data Type Tokens
===============================================================================
*/
BOOLEAN : B O O L E A N;
BOOL : B O O L;
BIT : B I T;
VARBIT : V A R B I T;

INT1 : I N T '1';
INT2 : I N T '2';
INT4 : I N T '4';
INT8 : I N T '8';

TINYINT : T I N Y I N T; // alias for INT1
SMALLINT : S M A L L I N T; // alias for INT2
INT : I N T; // alias for INT4
INTEGER : I N T E G E R; // alias - INT4
BIGINT : B I G I N T; // alias for INT8

FLOAT4 : F L O A T '4';
FLOAT8 : F L O A T '8';

REAL : R E A L; // alias for FLOAT4
FLOAT : F L O A T; // alias for FLOAT8
DOUBLE : D O U B L E; // alias for FLOAT8

NUMERIC : N U M E R I C;
DECIMAL : D E C I M A L; // alias for number

CHAR : C H A R;
VARCHAR : V A R C H A R;
NCHAR : N C H A R;
NVARCHAR : N V A R C H A R;

DATE : D A T E;
INTERVAL : I N T E R V A L;
TIME : T I M E;
TIMETZ : T I M E T Z;
TIMESTAMP : T I M E S T A M P;
TIMESTAMPTZ : T I M E S T A M P T Z;

TEXT : T E X T;
TSVECTOR : T S V E C T O R;
TSQUERY : T S Q U E R Y;

BINARY : B I N A R Y;
VARBINARY : V A R B I N A R Y;
BLOB : B L O B;
BYTEA : B Y T E A; // alias for BLOB

INET4 : I N E T '4';

BOX2D : B O X '2' D;
BOX3D : B O X '3' D;
GEOMETRY : G E O M E T R Y;
GEOMETRY_DUMP : G E O M E T R Y UNDERLINE D U M P;
GEOGRAPHY : G E O G R A P H Y;

//Oracle Pseudo table or column
COLUMN_VALUE : C O L U M N UNDERLINE V A L U E;
CONNECT_BY_ISCYCLE : C O N N E C T UNDERLINE B Y UNDERLINE I S C Y C L E;
CONNECT_BY_ISLEAF : C O N N E C T UNDERLINE B Y UNDERLINE I S L E A F;
CURRVAL : C U R R V A L;
DUAL : D U A L;
NEXTVAL : N E X T V A L;
OBJECT_ID : O B J E C T UNDERLINE I D;
OBJECT_VALUE : O B J E C T UNDERLINE V A L U E;
ORA_ROWSCN : O R A UNDERLINE R O W S C N;
ROWID : R O W I D;
ROWNUM : R O W N U M;
VERSIONS_ENDSCN : V E R S I O N S UNDERLINE E N D S C N;
VERSIONS_ENDTIME : V E R S I O N S UNDERLINE E N D T I M E;
VERSIONS_OPERATION : V E R S I O N S UNDERLINE O P E R A T I O N;
VERSIONS_STARTSCN : V E R S I O N S UNDERLINE S T A R T S C N;
VERSIONS_STARTTIME : V E R S I O N S UNDERLINE S T A R T T I M E;
VERSIONS_XID : V E R S I O N S UNDERLINE X I D;
XMLDATA : X M L D A T A;

// Operators

// Cast Operator
CAST_OPERATOR
  : COLON COLON
  ;

ASSIGN  : ':=';
EQUAL  : '=';
COLON :  ':';
SEMI_COLON :  ';';
COMMA : ',';
CONCATENATION_OPERATOR : '||';
NOT_EQUAL  : '<>' | '!=' | '~='| '^=' ;
LTH : '<' ;
LEQ : '<=';
GTH   : '>';
GEQ   : '>=';
LEFT_PAREN :  '(';
RIGHT_PAREN : ')';
LEFT_SQUARE : '[';
RIGHT_SQUARE : ']';
PLUS  : '+';
SUB : '-';
MULTIPLY: '*';
DIVIDE  : '/';
MODULAR : '%';
CARET : '^';
DOT : '.';
UNDERLINE : '_';
QUOTE : '\'';
DOUBLE_QUOTE : '"';
TILDE : '~';

// Nonstandard PostGIS operators
INTERSECT2D : '&&';
INTERSECT3D : '&&&';
OVERLAP : '&' ('<' | '<|' | '>');
LEFT_OF : '<<';
RIGHT_OF : '>>';
ABOVE : '|>>';
OVERLAPS_ABOVE : '|&>';
BELOW : '<<|';
BOX_EQUAL : '~=';
DISTANCE : '<->' | '<=>';

NOT_SIMILAR : '!~';
SIMILAR_INSENSITIVE : '~*';
NOT_SIMILAR_INSENSITIVE : '!~*';

//json operator
JSON_ARRAY_ELEMENT_OR_FIELD : '->';
JSON_AS_TEXT : '->>';
JSON_OBJECT_AT_PATH : '#>';
JSON_OBJECT_AT_PATH_AS_TEXT : '#>>';

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

NUM : DIGIT+;

fragment
DIGIT : '0'..'9';

REAL_NUM
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

BLOCK_COMMENT
    : '/*' (BLOCK_COMMENT | ('*' ~'/') | ~'*')* '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '--' ~[\r\n]* -> channel(HIDDEN)
    ;
 
// User defined op -- anything that doesn't parse as another op
CUSTOME_OPERATOR : ('+' | '-' | '*' | '/' | '<' | '>' | '=' | '!' | '@' | '#' | '%' | '^' | '&' | '|' | '`' | '?' | TILDE)*
            ('*' | '/' | '<' | '>' | '=' | '!' | '@' | '#' | '%' | '^' | '&' | '|' | '`' | '?' | TILDE);

/*
===============================================================================
 Identifiers
===============================================================================
*/

IDENTIFIER
  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|DIGIT|'_')*
  ;

QUOTED_IDENTIFIER
  : 'U&'? DOUBLE_QUOTE ( ESC_SEQ | ~'"' | '""' )* DOUBLE_QUOTE
  ;

/*
===============================================================================
 Literal
===============================================================================
*/

// Regex literal
REGEX : '$re$' (ESC_SEQ | .)*? '$re$';

// Some Unicode Character Ranges
fragment
CONTROL_CHARACTERS                  :   '\u0001' .. '\u001F';
fragment
EXTENDED_CONTROL_CHARACTERS         :   '\u0080' .. '\u009F';

fragment
STRING_START : ('E' | 'B' | 'U&')? QUOTE;

fragment
ESC_SEQ
  :   '\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | QUOTE | '\\' )
  |   UNICODE_ESC
  |   OCTAL_ESC
  ;

STRING_LITERAL
  :  STRING_START ( ESC_SEQ | '\'\'' | ~('\'') )* QUOTE
  ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

/*
===============================================================================
 Whitespace Tokens
===============================================================================
*/

SPACE
  : ' ' -> channel(HIDDEN)
  ;

WHITE_SPACE
  :	( CONTROL_CHARACTERS  | EXTENDED_CONTROL_CHARACTERS )+ -> channel(HIDDEN)
  ;
