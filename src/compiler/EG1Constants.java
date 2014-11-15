/* Generated By:JavaCC: Do not edit this line. EG1Constants.java */
package compiler;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface EG1Constants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int UnicodeLetter = 5;
  /** RegularExpression Id. */
  int UnicodeDigit = 6;
  /** RegularExpression Id. */
  int DecimalDigit = 7;
  /** RegularExpression Id. */
  int NonZeroDigit = 8;
  /** RegularExpression Id. */
  int DecimalDigits = 9;
  /** RegularExpression Id. */
  int ExponentIndicator = 10;
  /** RegularExpression Id. */
  int SignedInteger = 11;
  /** RegularExpression Id. */
  int ExponentPart = 12;
  /** RegularExpression Id. */
  int DecimalIntegerLiteral = 13;
  /** RegularExpression Id. */
  int DecimalLiteral = 14;
  /** RegularExpression Id. */
  int HexDigit = 15;
  /** RegularExpression Id. */
  int HexIntegerLiteral = 16;
  /** RegularExpression Id. */
  int IdentifierStart = 17;
  /** RegularExpression Id. */
  int IdentifierPart = 18;
  /** RegularExpression Id. */
  int SingleStringCharacter = 19;
  /** RegularExpression Id. */
  int DoubleStringCharacter = 20;
  /** RegularExpression Id. */
  int SingleStringCharacters = 21;
  /** RegularExpression Id. */
  int DoubleStringCharacters = 22;
  /** RegularExpression Id. */
  int PLUS = 23;
  /** RegularExpression Id. */
  int MIN = 24;
  /** RegularExpression Id. */
  int MULT = 25;
  /** RegularExpression Id. */
  int DIV = 26;
  /** RegularExpression Id. */
  int MOD = 27;
  /** RegularExpression Id. */
  int INCREMENT = 28;
  /** RegularExpression Id. */
  int DECREMENT = 29;
  /** RegularExpression Id. */
  int ABSTRACT = 30;
  /** RegularExpression Id. */
  int ARGUMENTS = 31;
  /** RegularExpression Id. */
  int BOOLEAN = 32;
  /** RegularExpression Id. */
  int BREAK = 33;
  /** RegularExpression Id. */
  int BYTE = 34;
  /** RegularExpression Id. */
  int CASE = 35;
  /** RegularExpression Id. */
  int CATCH = 36;
  /** RegularExpression Id. */
  int CHAR = 37;
  /** RegularExpression Id. */
  int CLASS = 38;
  /** RegularExpression Id. */
  int CONST = 39;
  /** RegularExpression Id. */
  int CONTINUE = 40;
  /** RegularExpression Id. */
  int DEBUGGER = 41;
  /** RegularExpression Id. */
  int DELETE = 42;
  /** RegularExpression Id. */
  int DO = 43;
  /** RegularExpression Id. */
  int DOUBLE = 44;
  /** RegularExpression Id. */
  int ELSE = 45;
  /** RegularExpression Id. */
  int ENUM = 46;
  /** RegularExpression Id. */
  int EVAL = 47;
  /** RegularExpression Id. */
  int EXPORT = 48;
  /** RegularExpression Id. */
  int EXTENDS = 49;
  /** RegularExpression Id. */
  int FALSE = 50;
  /** RegularExpression Id. */
  int FINAL = 51;
  /** RegularExpression Id. */
  int FINALLY = 52;
  /** RegularExpression Id. */
  int FLOAT = 53;
  /** RegularExpression Id. */
  int FOR = 54;
  /** RegularExpression Id. */
  int FUNCTION = 55;
  /** RegularExpression Id. */
  int GOTO = 56;
  /** RegularExpression Id. */
  int IF = 57;
  /** RegularExpression Id. */
  int IMPLEMENTS = 58;
  /** RegularExpression Id. */
  int IMPORT = 59;
  /** RegularExpression Id. */
  int IN = 60;
  /** RegularExpression Id. */
  int INSTANCEOF = 61;
  /** RegularExpression Id. */
  int INT = 62;
  /** RegularExpression Id. */
  int INTERFACE = 63;
  /** RegularExpression Id. */
  int LET = 64;
  /** RegularExpression Id. */
  int LONG = 65;
  /** RegularExpression Id. */
  int NATIVE = 66;
  /** RegularExpression Id. */
  int NEW = 67;
  /** RegularExpression Id. */
  int NULL = 68;
  /** RegularExpression Id. */
  int PACKAGE = 69;
  /** RegularExpression Id. */
  int PRIVATE = 70;
  /** RegularExpression Id. */
  int PROTECTED = 71;
  /** RegularExpression Id. */
  int PUBLIC = 72;
  /** RegularExpression Id. */
  int RETURN = 73;
  /** RegularExpression Id. */
  int SHORT = 74;
  /** RegularExpression Id. */
  int STATIC = 75;
  /** RegularExpression Id. */
  int SUPER = 76;
  /** RegularExpression Id. */
  int SWITCH = 77;
  /** RegularExpression Id. */
  int SYNCHRONIZED = 78;
  /** RegularExpression Id. */
  int THIS = 79;
  /** RegularExpression Id. */
  int THROW = 80;
  /** RegularExpression Id. */
  int THROWS = 81;
  /** RegularExpression Id. */
  int TRANSIENT = 82;
  /** RegularExpression Id. */
  int TRUE = 83;
  /** RegularExpression Id. */
  int TRY = 84;
  /** RegularExpression Id. */
  int TYPEOF = 85;
  /** RegularExpression Id. */
  int VAR = 86;
  /** RegularExpression Id. */
  int VOID = 87;
  /** RegularExpression Id. */
  int VOLATILE = 88;
  /** RegularExpression Id. */
  int WHILE = 89;
  /** RegularExpression Id. */
  int WITH = 90;
  /** RegularExpression Id. */
  int YIELD = 91;
  /** RegularExpression Id. */
  int NumericLiteral = 92;
  /** RegularExpression Id. */
  int IdentifierName = 93;
  /** RegularExpression Id. */
  int StringLiteral = 94;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<UnicodeLetter>",
    "<UnicodeDigit>",
    "<DecimalDigit>",
    "<NonZeroDigit>",
    "<DecimalDigits>",
    "<ExponentIndicator>",
    "<SignedInteger>",
    "<ExponentPart>",
    "<DecimalIntegerLiteral>",
    "<DecimalLiteral>",
    "<HexDigit>",
    "<HexIntegerLiteral>",
    "<IdentifierStart>",
    "<IdentifierPart>",
    "<SingleStringCharacter>",
    "<DoubleStringCharacter>",
    "<SingleStringCharacters>",
    "<DoubleStringCharacters>",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"abstract\"",
    "\"arguments\"",
    "\"boolean\"",
    "\"break\"",
    "\"byte\"",
    "\"case\"",
    "\"catch\"",
    "\"char\"",
    "\"class\"",
    "\"const\"",
    "\"continue\"",
    "\"debugger\"",
    "\"delete\"",
    "\"do\"",
    "\"double\"",
    "\"else\"",
    "\"enum\"",
    "\"eval\"",
    "\"export\"",
    "\"extends \"",
    "\"false\"",
    "\"final\"",
    "\"finally\"",
    "\"float\"",
    "\"for\"",
    "\"function\"",
    "\"goto\"",
    "\"if\"",
    "\"implements\"",
    "\"import\"",
    "\"in\"",
    "\"instanceof\"",
    "\"int\"",
    "\"interface\"",
    "\"let\"",
    "\"long\"",
    "\"native\"",
    "\"new\"",
    "\"null\"",
    "\"package\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"return\"",
    "\"short\"",
    "\"static\"",
    "\"super\"",
    "\"switch\"",
    "\"synchronized\"",
    "\"this\"",
    "\"throw\"",
    "\"throws\"",
    "\"transient\"",
    "\"true\"",
    "\"try\"",
    "\"typeof\"",
    "\"var\"",
    "\"void\"",
    "\"volatile\"",
    "\"while\"",
    "\"with\"",
    "\"yield\"",
    "<NumericLiteral>",
    "<IdentifierName>",
    "<StringLiteral>",
  };

}
