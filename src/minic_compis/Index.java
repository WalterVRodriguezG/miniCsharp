/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minic_compis;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Walter Rodriguez
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListaToken = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArchivoC = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblRutaC = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuImportar = new javax.swing.JMenuItem();
        jMenuCUP = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuArchivoC = new javax.swing.JMenuItem();
        jMenuAnalizarC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(12, 57, 244)));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel1.setText("Archivo de C#:");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel2.setText("Tokens generados:");

        txtListaToken.setEditable(false);
        txtListaToken.setColumns(20);
        txtListaToken.setRows(5);
        jScrollPane1.setViewportView(txtListaToken);

        txtArchivoC.setEditable(false);
        txtArchivoC.setColumns(20);
        txtArchivoC.setRows(5);
        jScrollPane2.setViewportView(txtArchivoC);

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jLayeredPane1.setEnabled(false);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblRutaC.setName("lblRutaC"); // NOI18N
        lblRutaC.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(276, 276, 276)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRutaC, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(5, 5, 5)
                .addComponent(lblRutaC)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        lblRutaC.getAccessibleContext().setAccessibleName("lblRutaC");

        btnLimpiar.setText("Limpiar texto");

        jMenu1.setText("Archivo");

        jMenuImportar.setText("Importar JFlex");
        jMenuImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuImportarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuImportar);

        jMenuCUP.setText("Importar CUP");
        jMenuCUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCUPActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCUP);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Análisis");

        jMenuArchivoC.setText("Cargar archivo C#");
        jMenuArchivoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArchivoCActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuArchivoC);

        jMenuAnalizarC.setText("Analizar");
        jMenuAnalizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnalizarCActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAnalizarC);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuImportarActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Cargando...");
        try {
            ImportarJFlex();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuImportarActionPerformed

    private void jMenuAnalizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnalizarCActionPerformed
        try {
            // TODO add your handling code here:
            AnalizarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jMenuAnalizarCActionPerformed

    private void jMenuArchivoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArchivoCActionPerformed
        lblRutaC.setText("");
        try {
            // Invocar al método para Cargar Archivo de C#
            txtArchivoC.setText("");
            CargarC();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
     txtListaToken.setText("");
    }//GEN-LAST:event_jMenuArchivoCActionPerformed

    private void jMenuCUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCUPActionPerformed
        // TODO add your handling code here:
        ImportarCUP();
    }//GEN-LAST:event_jMenuCUPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    
    //Métodos para importar Archivo .JFLEX
    public void ImportarJFlex() throws IOException{
       //Variables para tomar la ruta del Archivo:
        String ruta = "";
        JFileChooser abrirArchivo = new JFileChooser();
       //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.FLEX","flex");
        abrirArchivo.setFileFilter(filtro);
       
        int seleccion = abrirArchivo.showOpenDialog(jMenu1);
       
        //Tomando la ruta al dar aceptar al cuadro de dialogo.
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = abrirArchivo.getSelectedFile();
            
            ruta = archivo.getAbsolutePath();
            System.out.println(ruta);
            createLexer(ruta);
        }else{
            JOptionPane.showMessageDialog(null, "Archivo No válido.");
        }
    }
    
    //Método para Generar Archivo compilado de Jflex --> REPARAR CREAR CUP
    public static void createLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
        JOptionPane.showMessageDialog(null, "Archivo generado con Éxito! \n A continuación cargue un archivo de C# en el Menú Analizar.");
    }
    
    public void ImportarCUP(){
        String ruta = "";
        JFileChooser abrirArchivo = new JFileChooser();
       //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CUP","cup");
        abrirArchivo.setFileFilter(filtro);
       
        int seleccion = abrirArchivo.showOpenDialog(jMenu1);
       
        //Tomando la ruta al dar aceptar al cuadro de dialogo.
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = abrirArchivo.getSelectedFile();
            
            ruta = archivo.getAbsolutePath();
            System.out.println(ruta);
            createLexer(ruta);
        }else{
            JOptionPane.showMessageDialog(null, "Archivo No válido.");
        }
    }    

//Métodos para Cargar Archivo de C# (.cs)
    public void CargarC() throws FileNotFoundException{
               //Variables para tomar la ruta del Archivo:
        String ruta = "";
        JFileChooser abrirArchivo = new JFileChooser();
       //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt","txt");
        abrirArchivo.setFileFilter(filtro);
       
        int seleccion = abrirArchivo.showOpenDialog(jMenu1);
       
        //Tomando la ruta al dar aceptar al cuadro de dialogo.
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = abrirArchivo.getSelectedFile();
            
            ruta = archivo.getAbsolutePath();
            lblRutaC.setText(ruta);
            
            Scanner scn = new Scanner(archivo);
            while (scn.hasNext()) {
             txtArchivoC.insert(scn.nextLine() + "\n", txtArchivoC.getText().length());
            }
            JOptionPane.showMessageDialog(null, "Ahora seleccione la opción Analizar para mostrar el listado de Tokens");
        }else{
            JOptionPane.showMessageDialog(null, "Archivo No válido.");
        }
    }
    /*
    public void GenerarListaTokens(String rutaArchivo) throws FileNotFoundException, IOException{
        int contadorErrores = 0;
        int fila = 0;
        String resultados = "";
        File archivoGenerado = new File("ListadoTokens.out");
        
        PrintWriter escritor;
        Reader lector;
        
        lector = new BufferedReader(new FileReader(rutaArchivo));
        
        AnalizadorFlex lexer = new AnalizadorFlex(lector);
        
        
        while(true){
            Token token = lexer.yylex();    
          
            if (token ==null) {
                resultados  = resultados + " FIN.";
                txtListaToken.setText(resultados);
                
                //if (contadorErrores >0) {
                    escritor = new PrintWriter(archivoGenerado);
                    escritor.print(txtListaToken.getText());
                    escritor.close();
                    
                //}else{
//                    escritor = new PrintWriter(archivoGenerado);
//                    escritor.print(txtListaToken.getText().toLowerCase());
//                    escritor.close();

                //}
                return;
            }
              
            switch(token){
                case ComentarioLineal:
                    //resultados  = resultados + token + "    linea "+ fila + " is " + token + "\n \n"; 
                     //resultados = resultados + "Comentario Lineal. \n \n";
                    System.out.println("El resultado de comentario lineal es: "+lexer.retornoToken+"\n \n");
                    break;
                case ComentarioExtendido:
                //resultados =resultados + "Comentario Extendido. \n \n";
                    System.out.println("El resultado de comentario extendido es: "+lexer.retornoToken+"\n \n");
                    break;
                    
                case P_Reservada:
                     resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                     
                    break;
                    
                case Identificador:
                     resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    break;
                    
                case ConstBooleana:
                     resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    break;
                    
                case ConstEnteraDecimal:
                    resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    break;
                    
                case ConstEnteraHexa:
                    resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    break;
                    
                case ConstDouble:
                    resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    break;
                    
                case ConstString:
                    int tamanio = lexer.yylength();
                    String nuevaCadena = "";
                    if (tamanio> 32) {
                        nuevaCadena = lexer.retornoToken.substring(1, 32);
                        resultados = resultados + nuevaCadena + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +nuevaCadena+"  ) \n \n";
                    }else{
                        resultados = resultados + lexer.retornoToken + "    linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    }

                    break;
                    
                case Operador:
                    resultados = resultados + lexer.retornoToken + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es  "+ token + "    (valor =  " +lexer.retornoToken+"  ) \n \n";
                    break;
                
                case CadenaIncompleta:
                    resultados = resultados + token + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es un String incompleto.  \n \n";
                    token = null;
                    return;
                    //break;
                                     
//                case SinFinalComentarioExt:
//                    resultados = resultados + token + "      linea   " + lexer.fila +  "  y columna    "+ lexer.columna + " es un comentario multilínea incompleto.  \n \n";
//                    token = null;
//                    break;
                    
                case ERROR:
                    resultados = resultados + "*** Error 100, línea " + lexer.fila +  "  y columna    "+ lexer.columna+ ".***   Caracter  no reconocido:" + lexer.retornoToken +" \n \n";
                    //contadorErrores = contadorErrores++;
                    break;
                    
//                default:
//                    resultados = resultados + lexer.retornoToken + "      linea " + fila +  " is " + token + "    (valor = " +lexer.retornoToken+") \n";
//                    break;
            }

        }
        
    }
    
    */
    
    public static void CreateCup(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
        JOptionPane.showMessageDialog(null, "Archivo generado con Exito! \n  A continuacion cargue un archivo de prueba. ");
    }
     public void GenerarArchivoCUP(String ruta){
         File archivo = new File(ruta);
         String[] sintactico = {"-parser","asintactico",ruta};
         
        try {
            java_cup.Main.main(sintactico);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         moverArchivo("sintactico.java");
         moverArchivo("sym.java");
     }
    
     public static boolean moverArchivo(String fileName)
    {
        boolean fileMoved = false;
        File file =  new File(fileName);
        if (file.exists())
        {
            System.out.println("moving cup generated files to the correct path");
            Path currentRelativePath = Paths.get("");
            String newDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "Lexic" + File.separator + file.getName();
            if (file.renameTo(new File(newDir)))
            {
                System.out.println("the cup generated file has been moved successfully.");
                fileMoved = true;
            }
            else
            {
                System.out.println("ERROR, the file could not be moved.");                
            }
        }
        else
        {
            System.out.println("File could not be found!");
        }
        
        return fileMoved;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAnalizarC;
    private javax.swing.JMenuItem jMenuArchivoC;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCUP;
    private javax.swing.JMenuItem jMenuImportar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRutaC;
    private javax.swing.JTextArea txtArchivoC;
    private javax.swing.JTextArea txtListaToken;
    // End of variables declaration//GEN-END:variables

    private void AnalizarArchivo() throws IOException {
        String[] ArchivoPrueba = {lblRutaC.getText()};
            String Valor;
            Sintaxis.main(ArchivoPrueba);
            FileWriter ef = new FileWriter("C:/Users/Walter Rodriguez/Documents/GitHub/Compis/miniCsharp/src/minic_compis/TablaSimbolOut.txt");
            BufferedWriter e = new BufferedWriter(ef);
            //e.write("ID-----------------TIPO_VALOR-----------------VALOR-----------------VARIABLE-----------------DATOS DEL AMBITO");
            e.newLine();
            for (int i = 0; i < Manejador.output.size(); i++) 
            {
               Resultado aux = Manejador.output.get(i);
               String Tipo = aux.simbolo.type;
               String Descripcion = aux.simbolo.elementType;
               if(aux.simbolo.value != null)
               {
                    Valor = aux.simbolo.value.toString();
               }
               else
               {
                   Valor = " _ ";
               }
               String Current = aux.simbolo.ambito;
               e.write("ID: "+aux.nombre +"\n"+ " ** TIPO_VALOR: "+ Tipo +"\n"+ " ** Valor: "+ Descripcion+"\n"+" ** Variable: "+Valor+"\n"+" ** Ambito: "+Current);
               e.newLine();
            }
            e.close();
            ef.close();        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    


}
