/* this is miranda scanner */


import java_cup.runtime.*;

%% 

%column
%line
%char
%state COMMENT
%unicode


%cup

%{
  StringBuilder string = new StringBuilder();
  
  private Symbol symbol(int type) {
    return new MirandaSymbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new MirandaSymbol(type, yyline+1, yycolumn+1, value);
  }
%}

NONNEWLINE_WHITE_SPACE_CHAR=[ \t\b\012]
NEWLINE=\r|\n|\r\n|\u000D\u000A
WHITE_SPACE_CHAR=[\n\r \t\b\012]
STRING_TEXT=(\\\"|[^\n\r\"]|{WHITE_SPACE_CHAR}+)*
COMMENT_TEXT= ([a-z]|[A-Z]|[0-9]|{vertical_bar}|[_]|{NONNEWLINE_WHITE_SPACE_CHAR}|"\""|{delimiter} )*
vertical_bar= "|"

identifier= ([a-z] [a-zA-Z0-9_']* )
IDENTIFIER= [A-Z] [a-zA-Z0-9_']*
delimiter= "-"|{operator2}|{operator1}|{other}
operator1= "++" |"--"|":"|"\/"|"&"|"~"|">"|">="|"="|"~="|"<="|"<"|"+"|"*"|"/"|"div"|"mod"|"^"|"."|"!"| id
id= {identifier} | {IDENTIFIER}
infix= {operator1} | "-"
operator2= "~"|"#"
prefix= {operator2} | "-"
other= {keywords} |{operator3} | "(" | ")" | "[" | "]" | "{" | "}" | ".." | ";" | "," | "//" | "=>" | "->" | "<-"
keywords= "abstype" | "if" | "otherwise" | "readvals" | "show" | "type" | "where" | "with"
operator3= "=" | "==" | "::=" | "::" | {vertical_bar} 
numeral= {nat} | {float}
nat= [0-9] [0-9]*
float= [0-9]* [.] {nat} {epart}? | {nat} {epart}
epart= [e] [+|-]? {nat}
%% 

<YYINITIAL> {
 
  "(" 			{ return symbol(sym.LPAREN); }
  ")" 			{ return symbol(sym.RPAREN); }
  "," 			{ return symbol(sym.COMMA); }
  "->" 			{ return symbol(sym.ARROWS); }
  "::" 			{ return symbol(sym.ASSIGN_BODY_METHOD); }
  "-" 			{ return symbol(sym.MINUS); }
  "=" 			{ return symbol(sym.EQ); }
  "<" 			{ return symbol(sym.LT); } 
  "<=" 			{ return symbol(sym.LTEQ); }
  ">"  			{ return symbol(sym.GT); }
  ">=" 			{ return symbol(sym.GTEQ); }
  "nat" 		{ return symbol(sym.NAT_KEYWORD); }
  "float" 		{ return symbol(sym.FLOAT_KEYWORD); }
  "string" 		{ return symbol(sym.STRING_KEYWORD); }
  "if" 			{ return symbol(sym.IF); }
  "otherwise" 		{ return symbol(sym.OTHERWISE); }
 
  {NONNEWLINE_WHITE_SPACE_CHAR}+ {}

  "||" { yybegin(COMMENT);}

  \"{STRING_TEXT}\" 
			{return symbol(sym.STRING, string.toString()); }
  
  {float} 		{ return symbol(sym.FLOAT, new Double(yytext())); }
  {nat} 		{ return symbol(sym.NAT, new Integer(yytext())); }

  {identifier} { return symbol(sym.identifier, yytext()); }  
  {IDENTIFIER} { return symbol(sym.IDENTIFIER, yytext()); }  
  
  
}

<COMMENT> {
   {NEWLINE} { yybegin(YYINITIAL); }
  {COMMENT_TEXT} { }
  
}


{NEWLINE} { }

. {
  System.out.println("Illegal character: <" + yytext() + ">");
	Utility.error(Utility.E_UNMATCHED);
}

