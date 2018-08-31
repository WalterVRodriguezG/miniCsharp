package minic_compis;
import static minic_compis.Token.*;
%%
%class AnalizadorFlex
%type Token
%column
%line
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

/* Constantes */
ConstBooleana =  false | true
ConstEnteraDecimal = {NumeroEntero}
ConstEnteraHexa = ("0X" | "0x")({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])(({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])*)
ConstDouble = {NumeroEntero} "." ({NumeroEntero} | ([eE][-+]{NumeroEntero}))  
ConstString = (\"){Cadena}(\")

/* Identificadores */
Identificador = {Letra}("_" | {Palabra} | {NumeroEntero} | {Letra})*

/* Comentarios */
ComentarioLineal = [//] {Cadena}
/*ComentarioExtendido = ["/*"](({Letra}|{Digito}|{white}|{Cadena})*)["*/"]  | " " | "!" | "@" | "#" | "$" | "%" | "&" | [\/] | "(" | ")" | "=" | "?" | "¿" | "¡" | "*" | "+" | "[" | "]" | "," | ";" | "." | ":" | "-" | "_" | "<" | ">" | "°" | "¬" | [//] | [\|]  */
ComentarioExtendido = [/*] ({Cadena} | {white})* [*/]

 /* Operadores */
Operador = "+" | "-" | "*" | "/" | [\/] | "<" | "<=" | ">" | ">=" | "=" | "==" | "!=" | "&&" | [\||] | "!" | ";" | "," | "." | "[" | "]" | "(" | ")" | "{" | "}" | "[]" | "()" | "{}"

/* Posibles Errores */
CadenaIncompleta = (\"){Cadena}

%{
    public String retornoToken;
    public int fila;
    public int columna;
    public int tamanio;
%}
%%
{white} {/* Ignore */}
{P_Reservada} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return P_Reservada;}
{ComentarioExtendido}  {retornoToken = yytext();    fila = yyline+1; columna = yycolumn+1;  return ComentarioExtendido;}
{ComentarioLineal} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;         return ComentarioLineal;}

{ConstBooleana} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;            return ConstBooleana;}
{ConstEnteraDecimal} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;       return ConstEnteraDecimal;}
{ConstEnteraHexa} {retornoToken = yytext();   fila = yyline+1; columna = yycolumn+1;        return ConstEnteraHexa;}
{ConstDouble} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return ConstDouble;}
{ConstString} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return ConstString;}
{Operador} {retornoToken = yytext();  fila = yyline+1; columna = yycolumn+1;                return Operador;}
{Identificador} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;            return Identificador;}
{CadenaIncompleta} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;         return CadenaIncompleta;}
.   {return ERROR;}

