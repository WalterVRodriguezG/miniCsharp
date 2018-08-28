package minic_compis;
import static minic_compis.Token.*;
%%
%class AnalizadorFlex
%type Token
Letra = [a-zA-ZÑñ]
Digito = [0-9]
Numero = {Digito}{Digito}*
Palabra = {Letra}{Letra}*
white = [ \n\t\r\f]

%{
    public String retornoToken;
%}
%%
{white} {/*Ignore*/}
{Numero} {retornoToken = yytext();       return Numero;}
{Palabra} {retornoToken = yytext();      return Palabra;}
.   {return ERROR;}

