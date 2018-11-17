package minic_compis;
import static minic_compis.Token.*;
import java_cup.runtime.*;

%%
%class AnalizadorFlex
%column
%line
%cup

%{
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}


%{
    public String retornoToken;
    public int fila;
    public int columna;
    public int tamanio;
%}


/* Estructura Lexicográfica */

/* Espacios en blanco */
white = [ \n\t\r\f]+


P_Reservada = void | int | double | bool | string | class | interface | null | this  | extends | implements | for | while | if | else | return | break | New | NewArray | Print | ReadInteger | ReadLine | Malloc | interface

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

 /* Operadores */8
Operador = Suma | Resta | Mult | Division | Division | Menor | MenorIgual| Mayor | MayorIgual | Igual | Igual2 | Distinto | {Ampersan}{Ampersan} | {Or}{Or} | ExclamacionCerrado | PuntoComa | Coma | Punto | LlaveAbierta | LlaveCerrada | ParentesisAbierto | ParentesisCerrado | LlaveAbierta | LlaveCerrada | {CorcheteAbierto}{CorcheteCerrado} | {ParentesisAbierto}{ParentesisCerrado} | {LlaveAbierta}{LlaveCerrada}

/* Posibles Errores 
CadenaIncompleta = {BarraInvertida}{Cadena}
*/


%%

<YYINITIAL>{

{white} {/* Ignore */}

/*      Simbolos        */

"¡" {return symbol(sym.ExclamacionAbierto, New String(yytext()));}
"!" {return symbol(sym.ExclamacionCerrado, New String(yytext()));}
"@" {return symbol(sym.Arroba, New String(yytext()));}
"#" {return symbol(sym.Sharp, New String(yytext()));}
"$" {return symbol(sym.Dollar, New String(yytext()));}
"%" {return symbol(sym.Porcentaje, New String(yytext()));}
"&" {return symbol(sym.Ampersan, New String(yytext()));}
"/" {return symbol(sym.Division , New String(yytext()));}
"(" {return symbol(sym.ParentesisAbierto, New String(yytext()));}
")" {return symbol(sym.ParentesisCerrado, New String(yytext()));}
"?" {return symbol(sym.QuestionAbierto, New String(yytext()));}
"¿" {return symbol(sym.QuestionCerrado, New String(yytext()));}
"+" {return symbol(sym.Suma, New String(yytext()));}
"*" {return symbol(sym.Mult, New String(yytext()));}
"[" {return symbol(sym.CorcheteAbierto, New String(yytext()));}
"]" {return symbol(sym.CorcheteCerrado, New String(yytext()));}
"{" {return symbol(sym.LlaveAbierta, New String(yytext()));}
"}" {return symbol(sym.LlaveCerrada, New String(yytext()));}
"," {return symbol(sym.Coma, New String(yytext()));}
";" {return symbol(sym.PuntoComa, New String(yytext()));}
"." {return symbol(sym.Punto, New String(yytext()));}
":" {return symbol(sym.DosPuntos, New String(yytext()));}
"_" {return symbol(sym.GuionBajo, New String(yytext()));}
"-" {return symbol(sym.Resta, New String(yytext()));}
"<" {return symbol(sym.Menor, New String(yytext()));}
">" {return symbol(sym.Mayor, New String(yytext()));}


/*      Operadores      */
"||" {return symbol(sym.Or, New String(yytext()));}
"-" {return symbol(sym.Resta, New String(yytext()));}
">=" {return symbol(sym.MayorIgual, New String(yytext()));}
"<=" {return symbol(sym.MenorIgual, New String(yytext()));}
"==" {return symbol(sym.Igual2, New String(yytext()));}
"!=" {return symbol(sym.Distinto, New String(yytext()));}
"[]" {return symbol(sym.Corchetes, New String(yytext()));}
//"{}" {return symbol(sym.Llaves, New String(yytext()));}
//"()" {return symbol(sym.Parentesis, New String(yytext()));}



/* Palabras reservadas */
{P_Reservada} {return symbol(sym.P_Reservada, New String(yytext()));}

{ComentarioLineal} {return symbol(sym.ComentarioLineal, New String(yytext()));}
{ComentarioExtendido}  {return symbol(sym.ComentarioExtendido, New String(yytext()));}
{ConstBooleana} {return symbol(sym.ConstBooleana, New String(yytext()));}
{ConstEnteraDecimal} {return symbol(sym.ConstEnteraDecimal, New String(yytext()));}
{ConstEnteraHexa} {return symbol(sym.ConstEnteraHexa, New String(yytext()));}
{ConstDouble} {return symbol(sym.ConstDouble, New String(yytext()));}
{ConstString} {return symbol(sym.ConstString, New String(yytext()));}
{Operador} {return symbol(sym.Operador, New String(yytext()));}
{Identificador} {return symbol(sym.Identificador, New String(yytext()));}
/*{CadenaIncompleta} {return symbol(sym.CadenaIncompleta, New String(yytext()));} */
.   {system.out.println("Error no registrado en analizador.");}

}
