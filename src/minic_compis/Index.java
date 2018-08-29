/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minic_compis;

import java.io.*;
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

        txtListaToken.setColumns(20);
        txtListaToken.setRows(5);
        jScrollPane1.setViewportView(txtListaToken);

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
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(0, 276, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addComponent(lblRutaC)
                .addContainerGap(24, Short.MAX_VALUE))
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

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Analizar");

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
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuImportarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Cargando...");
        try {
            ImportarJFlex();
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuImportarActionPerformed

    private void jMenuAnalizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnalizarCActionPerformed
        // TODO add your handling code here:
        //Se invoca la conversión del archivo tomando poco referencia la ruta del archivo que se encuentra en el Label.
        txtListaToken.setText(" ");
        if (lblRutaC.getText()!= "") {
            try {
                GenerarListaTokens(lblRutaC.getText());
            } catch (IOException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Analizando... \n Archivo creado ubicado en:\n "+lblRutaC.getText());
        }else{
            JOptionPane.showMessageDialog(null,"Dirección de Archivo no válida. \nIngrese un archivo correcto.");
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
    
    //Método para Generar Archivo compilado de Jflex
    public static void createLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
        JOptionPane.showMessageDialog(null, "Archivo generado con Éxito! \n A continuación cargue un archivo de C# en el Menú Analizar.");
    }
    
    //Métodos para Cargar Archivo de C# (.cs)
    public void CargarC() throws FileNotFoundException{
               //Variables para tomar la ruta del Archivo:
        String ruta = "";
        JFileChooser abrirArchivo = new JFileChooser();
       //Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CS","cs");
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
                
                if (contadorErrores >0) {
                    escritor = new PrintWriter(archivoGenerado);
                    escritor.print(txtListaToken.getText());
                    escritor.close();
                     fila++;
                }else{
                    escritor = new PrintWriter(archivoGenerado);
                    escritor.print(txtListaToken.getText().toLowerCase());
                    escritor.close();
                     fila++;
                }
                return;
            }
              
            switch(token){
                case ERROR:
                    resultados = resultados + "*** Error 1200, línea "+fila+ ".***   Caracter  no reconocido:" + lexer.retornoToken +" \n";
                    contadorErrores = contadorErrores++;
                    break;
                default:
                    resultados = resultados + lexer.retornoToken + "      linea " +fila +  " is " + token + "    (valor = " +lexer.retornoToken+") \n";
                    break;
            }
           
        }
        
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
    private javax.swing.JMenuItem jMenuImportar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRutaC;
    private javax.swing.JTextArea txtArchivoC;
    private javax.swing.JTextArea txtListaToken;
    // End of variables declaration//GEN-END:variables


}
