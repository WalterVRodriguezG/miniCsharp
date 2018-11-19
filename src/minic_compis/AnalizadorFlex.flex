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
BOOLEAN = true | false

/* Constantes 
        ConstBooleana =  false | true
        ConstEnteraDecimal = {NumeroEntero}
        ConstEnteraHexa = ("0X" | "0x")({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])(({NumeroEntero} | [aA] | [bB] | [cC] | [dD] | [eE] | [fF])*)
        ConstDouble = {NumeroEntero} "." ({NumeroEntero} | ([eE][-+]{NumeroEntero}))  
        ConstString = (\"){Cadena}(\")

        Identificadores 
        Identificador = {Letra}(GuionBajo | {Palabra} | {NumeroEntero} | {Letra})*

        Comentarios 

        ComentarioLineal = {Division}{Division} {Cadena}
        ComentarioExtendido = {Division}{Mult}(({Letra}|{Digito}|{white}|{Cadena})*){Mult}{Division}
        ComentarioExtendido =  ({Cadena} | {white})* 

        Operadores 
        Operador = Suma | Resta | Mult | Division | Division | Menor | MenorIgual| Mayor | MayorIgual | Igual | Igual2 | Distinto | {Ampersan}{Ampersan} | {Or}{Or} | ExclamacionCerrado | PuntoComa | Coma | Punto | LlaveAbierta | LlaveCerrada | ParentesisAbierto | ParentesisCerrado | LlaveAbierta | LlaveCerrada | {CorcheteAbierto}{CorcheteCerrado} | {ParentesisAbierto}{ParentesisCerrado} | {LlaveAbierta}{LlaveCerrada}

        Posibles Errores 
        CadenaIncompleta = {BarraInvertida}{Cadena}
*/


%%

/*  <YYINITIAL>{    */

{white} {/* Ignore */}

/*      Simbolos        */

    "¡" { return symbol(sym.EXCLAOPEN, yytext()); }
    "!" {return symbol(sym.EXCLACLOSE, yytext());}
    "@" {return symbol(sym.ARROBA, yytext());}
    "#" {return symbol(sym.SHARP, yytext());}
    "$" {return symbol(sym.DOLLAR, yytext());}
    "&" {return symbol(sym.AMPERSAN, yytext());}
    "(" {return symbol(sym.POPEN, yytext());}
    ")" {return symbol(sym.PCLOSE, yytext());}
    "?" {return symbol(sym.QUESTIONOPEN, yytext());}
    "¿" {return symbol(sym.QUESTIONCLOSE, yytext());}
    "[" {return symbol(sym.CORCHETEOPEN, yytext());}
    "]" {return symbol(sym.CORCHETECLOSE, yytext());}
    "{" {return symbol(sym.LLAVEOPEN, yytext());}
    "}" {return symbol(sym.LLAVECLOSE, yytext());}
    "," {return symbol(sym.COMA, yytext());}
    ";" {return symbol(sym.PUNTOYCOMA, yytext());}
    "." {return symbol(sym.PUNTO, yytext());}
    ":" {return symbol(sym.DOSPUNTOS, yytext());}
    "_" {return symbol(sym.GUIONBAJO, yytext());}
    


/*      Operadores      */
    "+" {return symbol(sym.SUMA, yytext());}
    "*" {return symbol(sym.MULT, yytext());}
    "/" {return symbol(sym.DIVISION , yytext());}
    "-" {return symbol(sym.RESTA, yytext());}
    "%" {return symbol(sym.MOD, yytext());}
    "=" {return symbol(sym.IGUAL, yytext());}
    "<" {return symbol(sym.MENOR, yytext());}
    ">" {return symbol(sym.MAYOR, yytext());}
    "||" {return symbol(sym.OR,yytext());}
    ">=" {return symbol(sym.MAYORIGUAL, yytext());}
    "<=" {return symbol(sym.MENORIGUAL, yytext());}
    "==" {return symbol(sym.DOBLEIGUAL,yytext());}
    "!=" {return symbol(sym.DISTINTO, yytext());}
    "[]" {return symbol(sym.CORCHETES, yytext());}
    //"{}" {return symbol(sym.LLAVES, yytext());}
    //"()" {return symbol(sym.PARENTESIS, yytext());}



/* Palabras reservadas */
//P_Reservada = void | int | double | bool | string | class | interface | null | this  | extends | implements | for | while | if | else | return | break | New | NewArray | Print | ReadInteger | ReadLine | Malloc | interface

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

/*      Identificadores     */
    [a-zA-Z][a-zA-Z0-9_]* { return symbol(sym.IDENTIFICADOR, yytext()); }

/*      Cadena          */
    \" [^\r\n]+  \" { return symbol(sym.CADENA, yytext()); }

/*      Comentario      */
"/*" [^*] ~ "*/"  {/*Ignore*/}  /* COMENTARIO MULTILINEA */
"//" [^\r\n]+  {/*Ignore*/}   /* COMENTARIO DE UNA LINEA */


/*      Comentario       */ 
"/*" [^*] ~ "*/"  {/*Ignore*/}  /* MULTILINEA */
"//" [^\r\n]+  {/*Ignore*/}   /*    UNA LINEA */
"/*" [^*]+ {System.out.print(" Error en Fila " + (yyline +1) + "   " + "Comentario Incompleto, no finalizado" + "\n"); }  /*   INCOMPLETO  */

/*   Booleanos  */
{BOOLEAN} {return symbol(sym.boolConstant, yytext()); }


    /*      Valores Numéricos    */
[0-9]+ {return symbol(sym.intConstant, new Integer(yytext())); }
   /*       Decimales        */
[0-9]+ "." ([0-9]+ | [0-9]+(E | e) ("+")? [0-9]+ | (E | e) ("+")? [0-9]+ )? {return symbol(sym.doubleConstant, yytext()); }
    /*      Hexadecimales        */
(0x | 0X )[0-9|A-F|a-f]+ {return symbol(sym.hexConstant, yytext()); }
.   {System.out.println("   ¡¡Error!!     ");}

/*  }   */
