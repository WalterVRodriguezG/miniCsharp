# miniCsharp
Proyecto #1 - Compiladores
Funcionamiento del Proyecto:
El siguiente proyecto es un analizador lexico, utilizando la herramienta JFLEX,  que funciona de la siguiente manera:
1. Al ejecutar el programa inicialmente se debe cargar un archivo cuya extensión debe ser .FLEX.
2. en este archivo van definidos todos los Tokens para que analice el lenguaje de C#.
3. Esto se realiza desde el menú ARchivo. Al finalizar se debe dirigir al menú Analisis Lexico y acontiuación seleccione la opción Cargar ARchivo C#.
4. Se debe proceder a buscar el archivo de C# cuya extensión es .FRAG.
5. al finalizarlo de cargar en caja de texto llamada Archivo C# mostrará el archivo tal cual se encuentra.
6. Luego se debe dirigir a la opción Analizar .
7. Al finalizar el analisis en el cuadro de texto llamado Tokens generados muestra el reconocimiento de los tokens definidos así como los errores encontrados.
8. Paralelo a esto genera un archivo llamado  ListadoTokens.out.
9. Si desea cargar más archivos de C# no es necesario cargar nuevamente el archivo .FLEX.

¿Por QUE FUNCIONA CORRECTAMENTE?
Realiza la mayoria de validaciones. Ademas los errores los detecta indicando la fila y columna donde se encuentró el error.
