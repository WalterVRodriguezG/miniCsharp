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

/* Cadena = ({Letra} | {Digito}| " " | "!" | "@" | "#" | "$" | "%" | "&" | "(" | ")" | "=" | "?" | "¿" | "¡" | "*" | "+" | "[" | "]" | "," | ";" | "." | ":" | "-" | "_" | "<" | ">" | "°" | "¬" | [\|])* */

/*  Signos  */
ExclamacionAbierto = "¡"
ExclamacionCerrado = "!"
Arroba = "@"
Sharp = "#"
Dollar = "$"
Porcentaje = "%"
Ampersan = "&"
ParentesisAbierto = "("
ParentesisCerrado = ")"
Igual = "="
QuestionAbierto = "¿"
QuestionCerrado = "?"
Suma = "+"
Mult = "*"
CorcheteAbierto = "["
CorcheteCerrado = "]"
LlaveAbierta = "{"
LlaveCerrada = "}"
Coma = ","
PuntoComa = ";"
Punto = "."
DosPuntos = ":"
GuionBajo = "_"
Resta = "-"
Menor = "<"
Mayor = ">"
Espacio = " "
Division = "/"
BarraInvertida = "\"
Or = "|"
MayorIgual = {Mayor}{Igual}
MenorIgual = {Menor}{Igual}
Igual2 = {IgualIgual}
Distinto = {ExclamacionCerrado}{Igual}
Corchetes = "{}"
Llaves = "[]"
Parentesis = "()"

Simbolos = ExclamacionAbierto | ExclamacionCerrado | Arroba | Sharp | Dollar | Porcentaje | Ampersan | ParentesisAbierto | ParentesisCerrado | Igual| QuestionAbierto| QuestionCerrado| Suma | Mult | CorcheteAbierto | CorcheteCerrado | LlaveAbierta | LlaveCerrada | Coma | PuntoComa | Punto | DosPuntos | GuionBajo | Resta | Menor | Mayor | Espacio | Division | BarraInvertida | Or | MayorIgual | MenorIgual | Igual2 | Distinto | Corchetes | Llaves | Parentesis

Cadena = ({Letra} | {Digito}| {Simbolos})*

/* Estructura Lexicográfica */

/* Espacios en blanco */
white = [ \n\t\r\f]+

/* Palabras reservadas */
P_Reservada = void | int | double | bool | string | class | interface | null | this  | extends | implements | for | while | if | else | return | break | New | NewArray | Print | ReadInteger | ReadLine | Malloc | extends | implements | interface

/* Constantes */
ConstBooleana =  false | true
ConstEnteraDecimal = {NumeroEntero}
ConstEnteraHexa = ("0X" | "0x")({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])(({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])*)
ConstDouble = {NumeroEntero} "." ({NumeroEntero} | ([eE][-+]{NumeroEntero}))  
ConstString = (\"){Cadena}(\")

/* Identificadores */
Identificador = {Letra}(GuionBajo | {Palabra} | {NumeroEntero} | {Letra})*

/* Comentarios */

ComentarioLineal = {Division}{Division} {Cadena}
ComentarioExtendido = {Division}{Mult}(({Letra}|{Digito}|{white}|{Cadena})*){Mult}{Division}
/*ComentarioExtendido = [/*] ({Cadena} | {white})* [*/]*/

 /* Operadores */
Operador = Suma | Resta | Mult | Division | Division | Menor | MenorIgual| Mayor | MayorIgual | Igual | Igual2 | Distinto | {Ampersan}{Ampersan} | {Or}{Or} | ExclamacionCerrado | PuntoComa | Coma | Punto | LlaveAbierta | LlaveCerrada | ParentesisAbierto | ParentesisCerrado | LlaveAbierta | LlaveCerrada | {CorcheteAbierto}{CorcheteCerrado} | {ParentesisAbierto}{ParentesisCerrado} | {LlaveAbierta}{LlaveCerrada}

/* Posibles Errores */
CadenaIncompleta = {BarraInvertida}{Cadena}

%{
    public String retornoToken;
    public int fila;
    public int columna;
    public int tamanio;
%}
%%
{white} {/* Ignore */}
{P_Reservada} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return P_Reservada;}

{ComentarioLineal} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;         return ComentarioLineal;}
{ComentarioExtendido}  {retornoToken = yytext();    fila = yyline+1; columna = yycolumn+1;  return ComentarioExtendido;}


{ConstBooleana} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;            return ConstBooleana;}
{ConstEnteraDecimal} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;       return ConstEnteraDecimal;}
{ConstEnteraHexa} {retornoToken = yytext();   fila = yyline+1; columna = yycolumn+1;        return ConstEnteraHexa;}
{ConstDouble} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return ConstDouble;}
{ConstString} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return ConstString;}
{Operador} {retornoToken = yytext();  fila = yyline+1; columna = yycolumn+1;                return Operador;}
{Identificador} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;            return Identificador;}
{CadenaIncompleta} {retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;         return CadenaIncompleta;}
.   {return ERROR;}

