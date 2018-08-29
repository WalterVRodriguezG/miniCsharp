package minic_compis;
import static minic_compis.Token.*;
%%
%class AnalizadorFlex
%type Token
Letra = [a-zA-ZÑñ]
Digito = [0-9]
NumeroEntero = {Digito}{Digito}*
Palabra = {Letra}{Letra}*
Cadena = ({Letra} | {Digito}| " " | "!" | "@" | "#" | "$" | "%" | "&" | [\/] | "(" | ")" | "=" | "?" | "¿" | "¡" | "*" | "+" | "[" | "]" | "," | ";" | "." | ":" | "-" | "_" | "<" | ">" | "°" | "¬" | [//] | [\|])*

/* Estructura Lexicográfica */

/* Espacios en blanco */
white = [ \n\t\r\f]+

/* Palabras reservadas */
P_Reservada = void | int | double | bool | string | class | interface | null | this  | extends | implements | for | while | if | else | return | break | New | NewArray

/* Identificadores */
Identificador = {Letra}("_" | {Palabra} | {NumeroEntero} | {Letra})*

/* Comentarios */
ComentarioLineal = "//" {Cadena}
/*ComentarioExtendido = ["/*"](({Letra}|{Digito}|{white}|{Cadena})*)["*/"]  | " " | "!" | "@" | "#" | "$" | "%" | "&" | [\/] | "(" | ")" | "=" | "?" | "¿" | "¡" | "*" | "+" | "[" | "]" | "," | ";" | "." | ":" | "-" | "_" | "<" | ">" | "°" | "¬" | [//] | [\|]  */
ComentarioExtendido = ["/*"](({Letra} | {Digito})*)["*/"]

/* Constantes */
ConstBooleana =  true | false
ConstEnteraDecimal = {NumeroEntero}
ConstEnteraHexa = ("0X" | "0x")({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])(({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])*)
ConstDouble = {NumeroEntero} "." ({NumeroEntero} | ([eE][-+]{NumeroEntero}))  
ConstString = (\"){Cadena}(\")

 /* Operadores */
Operador = "+" | "-" | "*" | "/" | [\/] | "<" | "<=" | ">" | ">=" | "=" | "==" | "!=" | "&&" | [\||] | "!" | ";" | "," | "." | "[" | "]" | "(" | ")" | "{" | "}" | "[]" | "()" | "{}"

%{
    public String retornoToken;
%}
%%
{white} {/* Ignore */}
{P_Reservada} {retornoToken = yytext();             return P_Reservada;}
{Identificador} {retornoToken = yytext();           return Identificador;}
{ComentarioLineal} {retornoToken = yytext();        return ComentarioLineal;}
{ComentarioExtendido}  {retornoToken = yytext();    return ComentarioExtendido;}
{ConstBooleana} {retornoToken = yytext();           return ConstBooleana;}
{ConstEnteraDecimal} {retornoToken = yytext();      return ConstEnteraDecimal;}
{ConstEnteraHexa} {retornoToken = yytext();         return ConstEnteraHexa;}
{ConstDouble} {retornoToken = yytext();             return ConstDouble;}
{ConstString} {retornoToken = yytext();             return ConstString;}
{Operador} {retornoToken = yytext();                return Operador;}
.   {return ERROR;}

