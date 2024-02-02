/*
An IntelliJ IDEA language support plugin for Nasal.
Copyright (C) 2024  BobDotCom

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package com.bobdotcom.nasal;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.bobdotcom.nasal.psi.NasalTypes;
import com.intellij.psi.TokenType;

%%

%class NasalLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

/* main character classes */
LINE_TERMINATOR = \r|\n|\r\n
INPUT_CHARACTER = [^\r\n]

WHITE_SPACE = {LINE_TERMINATOR} | [ \t\f]+

/* comments */
COMMENT = {EOL_COMMENT}

EOL_COMMENT = "#" {INPUT_CHARACTER}* {LINE_TERMINATOR}?

/* identifiers */
IDENT_START = [\w_--\d]
IDENT_CONTINUE = [\w_]
IDENTIFIER = {IDENT_START}{IDENT_CONTINUE}*

/* integer literals */
DEC_INTEGER_LITERAL = 0 | [1-9][0-9]*

HEX_INTEGER_LITERAL = 0 [xX] 0* {HEX_DIGIT} {1,8}
HEX_DIGIT          = [0-9a-fA-F]

OCT_INTEGER_LITERAL = 0+ [1-3]? {OCT_DIGIT} {1,15}
OCT_DIGIT          = [0-7]

/* floating point literals */        
FLOAT_LITERAL  = ({F_LIT1}|{F_LIT2}|{F_LIT3}) {EXPONENT}? [fF]
DOUBLE_LITERAL = ({F_LIT1}|{F_LIT2}|{F_LIT3}) {EXPONENT}?

F_LIT1    = [0-9]+ \. [0-9]* 
F_LIT2    = \. [0-9]+ 
F_LIT3    = [0-9]+ 
EXPONENT = [eE] [+-]? [0-9]+

/* string and character literals */
STRING_CHARACTER  = [^\r\n\"\\]
S_STRING_CHARACTER = [^\r\n\'\\]

%state STRING SSTRING

%%

<YYINITIAL> {

  /* keywords */
  "if"                           { return NasalTypes.IF; }
  "else"                         { return NasalTypes.ELSE; }
  "elsif"                        { return NasalTypes.ELSIF; }
  "func"                         { return NasalTypes.FUNC; }
  "return"                       { return NasalTypes.RETURN; }
  "for"                          { return NasalTypes.FOR; }
  "var"                          { return NasalTypes.VAR; }
  "while"                        { return NasalTypes.WHILE; }
  "foreach"                      { return NasalTypes.FOREACH; }
  "forindex"                     { return NasalTypes.FORINDEX; }
  "break"                        { return NasalTypes.BREAK; }
  "continue"                     { return NasalTypes.CONTINUE; }
//  "while"                        |
//  "this"                         |
//  "try"                          |
//  "var"                          |
//  "function"                     |
//  "with"                         |
//  "in"                           |

  /* boolean literals */
//  "true"                         |
//  "false"                        |

  /* nil literal */
  "nil"                         { return NasalTypes.NIL; }

  /* standard / builtin functions */
  "me"                             |
  "arg"                            |
  "parents"                        |
  "obj"                            { return NasalTypes.SPECIAL; }

//  "Infinity"                     |
//  "NaN"                          |
//  "undefined"                    |
//  "decodeURI"                    |
//  "encodeURIComponent"           |
//  "escape"                       |
//  "eval"                         |
//  "isFinite"                     |
//  "isNaN"                        |
//  "parseFloat"                   |
//  "parseInt"                     |
//  "unescape"                     { return NasalTypes.KEYWORD2; }

  /* Built-in Types*/
  "Array"                        |
  "Boolean"                      |
  "Date"                         |
  "Math"                         |
  "Number"                       |
  "Object"                       |
  "RegExp"                       |
  "String"                       { return NasalTypes.TYPE; }
//  {IDENTIFIER} ":"               { return NasalTypes.TYPE; }


  /* operators */

  "("                            { return NasalTypes.LPAR; }
  ")"                            { return NasalTypes.RPAR; }
  "{"                            { return NasalTypes.LBRACE; }
  "}"                            { return NasalTypes.RBRACE; }
  "["                            { return NasalTypes.LBRA; }
  "]"                            { return NasalTypes.RBRA; }
  ";"                            { return NasalTypes.SEMI; }
  ","                            { return NasalTypes.COMMA; }
  "="                            { return NasalTypes.ASSIGN; }
  ":"                            { return NasalTypes.COLON; }
  "..."                          { return NasalTypes.ELLIPSIS; }
  "~"                            { return NasalTypes.CAT; }
  "-"                            { return NasalTypes.MINUS; }
  "?"                            { return NasalTypes.QUESTION; }
  "!"                            { return NasalTypes.NOT; }
  "."                            { return NasalTypes.DOT; }
  "?."                           { return NasalTypes.NULL_ACCESS; }
  "+="                           { return NasalTypes.PLUSEQ; }
  "-="                           { return NasalTypes.MINUSEQ; }
  "*="                           { return NasalTypes.MULEQ; }
  "/="                           { return NasalTypes.DIVEQ; }
  "~="                           { return NasalTypes.CATEQ; }
  "&="                           { return NasalTypes.BIT_ANDEQ; }
  "|="                           { return NasalTypes.BIT_OREQ; }
  "^="                           { return NasalTypes.BIT_XOREQ; }
  "and"                          { return NasalTypes.AND; }
  "or"                           { return NasalTypes.OR; }
  "=="                           { return NasalTypes.EQ; }
  "!="                           { return NasalTypes.NEQ; }
  "<"                            { return NasalTypes.LT; }
  "<="                           { return NasalTypes.LTE; }
  ">"                            { return NasalTypes.GT; }
  ">="                           { return NasalTypes.GTE; }
  "+"                            { return NasalTypes.PLUS; }
  "|"                            { return NasalTypes.BIT_OR; }
  "^"                            { return NasalTypes.BIT_XOR; }
  "&"                            { return NasalTypes.BIT_AND; }
  "*"                            { return NasalTypes.MUL; }
  "/"                            { return NasalTypes.DIV; }
  "??"                           { return NasalTypes.NULL_CHAIN; }
//  "&&"                           |
//  "||"                           |
//  "++"                           |
//  "--"                           |
//  "%"                            |
//  "<<"                           |
//  ">>"                           |
//  ">>>"                          |
//  "%="                           |
//  "<<="                          |
//  ">>="                          |
//  ">>>="                         { return NasalTypes.OPERATOR; }

  /* char constant */
  \`.\`                          { return NasalTypes.CHAR_CONST; }

  /* string literal */
  \"                             {
                                    yybegin(STRING);
//                                    tokenStart = yychar;
//                                    tokenLength = 1;
                                 }

  \'                             {
                                    yybegin(SSTRING);
//                                    tokenStart = yychar;
//                                    tokenLength = 1;
                                 }

  /* numeric literals */

  {DEC_INTEGER_LITERAL}          |

  {HEX_INTEGER_LITERAL}          |

  {OCT_INTEGER_LITERAL}          |

  {FLOAT_LITERAL}                |
  {DOUBLE_LITERAL}               |
  {DOUBLE_LITERAL}[dD]           { return NasalTypes.NUMBER; }

  /* comments */
  {COMMENT}                      { return NasalTypes.COMMENT; }

  /* whitespace */
  {WHITE_SPACE}                  { return TokenType.WHITE_SPACE; }

  /* identifiers */
  {IDENTIFIER}                   { return NasalTypes.IDENTIFIER; }
}

<STRING> {
  \"                             {
                                     yybegin(YYINITIAL);
                                     // length also includes the trailing quote
                                     return NasalTypes.STRING;
                                 }

  {STRING_CHARACTER}+            { /*tokenLength += yylength();*/ }

  \\[0-3]?{OCT_DIGIT}?{OCT_DIGIT}  { /*tokenLength += yylength();*/ }

  /* escape sequences */

  \\.                            { /*tokenLength += 2;*/ }
  {LINE_TERMINATOR}              { yybegin(YYINITIAL);  }
}

<SSTRING> {
  \'                             {
                                     yybegin(YYINITIAL);
                                     // length also includes the trailing quote
                                     return NasalTypes.STRING;
                                 }

  {S_STRING_CHARACTER}+          { /*tokenLength += yylength();*/ }

  \\[0-3]?{OCT_DIGIT}?{OCT_DIGIT}  { /*tokenLength += yylength();*/ }

  /* escape sequences */

  \\.                            { /*tokenLength += 2;*/ }
  {LINE_TERMINATOR}              { yybegin(YYINITIAL);  }
}

/* error fallback */
//.|\n                             {  }
[^]                              { return TokenType.BAD_CHARACTER; }
<<EOF>>                          { return null; }
