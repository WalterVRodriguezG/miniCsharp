package minic_compis;
//import static minic_compis.Token.*;
import java_cup.runtime.*;
import java.io.*;

%%
%public
%class AnalizadorFlex
%column
%line
%cup
%unicode
/*
%{
    public String retornoToken;
    public int fila;
    public int columna;
    public int tamanio;

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

*/

/* Estructura Lexicográfica */

/* Espacios en blanco */
ESPACIO = [ \n\t\r]

BOOLEANAS = true | false;
%{
        //public String analizar;
        //public int linea,columna;
        
        private Symbol symbol(int type)
        {
            return new Symbol(type, yyline, yycolumn);
        }

        private Symbol symbol(int type, Object value)
        {
            return new Symbol(type, yyline, yycolumn, value);
        }
%}

%%
{ESPACIO} {/*Ignore*/}

/* PALABRAS RESERVADAS */
//{RESERVADAS} {analizar=yytext(); linea=yyline; columna=yycolumn; return Palabra_Reservada;}

"void" { return symbol(sym.VOID, yytext()); }
"int" {return symbol(sym.INT, yytext()); }
"double" { return symbol(sym.DOUBLE, yytext()); }
"bool" { return symbol(sym.BOOL, yytext()); }
"string" { return symbol(sym.STRING, yytext()); }
"class" { return symbol(sym.CLASS, yytext()); }
"interface" { return symbol(sym.INTERFACE, yytext()); }
"null" { return symbol(sym.NULL, yytext()); }
"this" { return symbol(sym.THIS, yytext()); }
"extends" { return symbol(sym.EXTENDS, yytext()); }
"implements" { return symbol(sym.IMPLEMENTS, yytext()); }
"for" { return symbol(sym.FOR, yytext()); }
"while" { return symbol(sym.WHILE, yytext()); }
"if" { return symbol(sym.IF, yytext()); }
"else" { return symbol(sym.ELSE, yytext()); }
"return" { return symbol(sym.RETURN, yytext()); }
"break" { return symbol(sym.BREAK, yytext()); }
"New" { return symbol(sym.NEW, yytext()); }
"NewArray" { return symbol(sym.NEWARRAY, yytext()); }
"Print" { return symbol(sym.PRINT, yytext()); }
"ReadInteger" { return symbol(sym.READINTEGER, yytext()); }
"ReadLine" { return symbol(sym.READLINE, yytext()); }
"Malloc" { return symbol(sym.MALLOC, yytext()); }
"GetByte" { return symbol(sym.GETBYTE, yytext()); }
"SetByte" { return symbol(sym.SETBYTE, yytext()); }
"const" {return symbol(sym.CONSTANT, yytext()); }
"#" { /* Ignore */}
"include" [^*] ~ ">" { /* Ignore */}

/* IDENTIFICADORES */

[a-zA-Z][a-zA-Z0-9_]* { return symbol(sym.IDENTIFICADOR, yytext()); }

            /* COMENTARIOS */ 
/* INCOMPLETO */
"/*" [^*]+ {System.out.print("  ERROR en linea: " + (yyline +1)  + " ---> " + "Comentario Incompleto - Falta cierre de comentario multilinea " + "\n"); }

/* VÁLIDOS */ 
"/*" [^*] ~ "*/"  {/*Ignore*/}  /* COMENTARIO MULTILINEA */
"//" [^\r\n]+  {/*Ignore*/}   /* COMENTARIO DE UNA LINEA */

            /* OPERADORES Y CARACTERES */

"+" {return symbol(sym.SUMA, yytext()); }
"-" {return symbol(sym.RESTA, yytext()); }
"*" {return symbol(sym.MULTI, yytext()); }
"/" {return symbol(sym.DIV, yytext()); }
"%" {return symbol(sym.MOD, yytext()); }
"<" {return symbol(sym.MENOR, yytext()); }
"<=" {return symbol(sym.MENORIGUAL, yytext()); }
">" {return symbol(sym.MAYOR, yytext()); }
">=" {return symbol(sym.MAYORIGUAL, yytext()); }
"=" {return symbol(sym.IGUAL, yytext()); }
"==" {return symbol(sym.IGUALCOMPARACION, yytext()); }
"!=" {return symbol(sym.DISTINTO, yytext()); }
"&&" {return symbol(sym.AMPERSONS, yytext()); }
"||" {return symbol(sym.OR, yytext()); }
"!" {return symbol(sym.EXCLAM, yytext()); }
";" {return symbol(sym.PUNTOYCOMA, yytext()); }
"," {return symbol(sym.COMA, yytext()); }
"." {return symbol(sym.PUNTO, yytext()); }
"[" {return symbol(sym.CORABIERTO, yytext()); }
"]" {return symbol(sym.CORCERRADO, yytext()); }
"(" {return symbol(sym.PARABIERTO, yytext()); }
")" {return symbol(sym.PARCERRADO, yytext()); }
"{" {return symbol(sym.LLAVABIERTA, yytext()); }
"}" {return symbol(sym.LLAVCERRADA, yytext()); }
"[]" {return symbol(sym.CORCHETES, yytext()); }
//"()" {return symbol(sym.PARENTESIS, yytext()); }
//"{}" {return symbol(sym.LLAVES, yytext()); }

/* Cadenas */
\" [^\r\n]+  \" { return symbol(sym.stringConstant, yytext()); }

/* VARIABLES BOOLEANAS */
//{BOOLEANAS} {analizar=yytext(); linea=yyline; columna=yycolumn; return Constante_Booleana;}
{BOOLEANAS} {return symbol(sym.boolConstant, yytext()); }

            /* NUMEROS */
/* ENTEROS */
//[0-9]+ {analizar=yytext(); linea=yyline; columna=yycolumn; return Numero_Entero;}

[0-9]+ {return symbol(sym.intConstant, new Integer(yytext())); }

/* CONSTANTE DOUBLE (NUMEROS) */
//[0-9]+ "." ([0-9]+ | [0-9]+(E | e) ("+")? [0-9]+ | (E | e) ("+")? [0-9]+ )? {analizar=yytext(); linea=yyline; columna=yycolumn; return Double;}

[0-9]+ "." ([0-9]+ | [0-9]+(E | e) ("+")? [0-9]+ | (E | e) ("+")? [0-9]+ )? {return symbol(sym.doubleConstant, yytext()); }

/* NUMEROS HEXADECIMALES */
//(0x | 0X )[0-9|A-F|a-f]+ {analizar=yytext(); linea=yyline; columna=yycolumn; return Numero_Hexadecimal;}

(0x | 0X )[0-9|A-F|a-f]+ {return symbol(sym.hexConstant, yytext()); }

/* ERROR */
//. {analizar=yytext(); linea=yyline; columna=yycolumn; return ERROR;}

. {System.out.print(" *** ERROR LINEA " + (yyline +1) + " ***" + "   " + "Caracter no reconocido " + yytext() + "\n"); }
