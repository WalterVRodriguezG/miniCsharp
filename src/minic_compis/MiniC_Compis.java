/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minic_compis;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import minic_compis.Index;

/**
 *
 * @author Walter Rodriguez
 */
public class MiniC_Compis {

    public final static int GENERAR = 1;
    public final static int EJECUTAR = 2;
    public final static int SALIR = 3;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Hello World!! \n");
       
//        String path = "C:/Users/Walter Rodriguez/Documents/NetBeansProjects/miniC_Compis/src/minic_compis/AnalizadorFlex.flex";
//        
//        createLexer(path);
//        JOptionPane.showMessageDialog(null, "Archivo creado en: " + path);
//Cargar archivo .flex
        GenerarLexico();
        GenerarSintactico();
        
        
    }
    
    
    public static void GenerarLexico(){
        String [] rutaLex = {"/home/labhw02/NetBeansProjects/miniCsharp/src/minic_compis/AnalizadorFlex.flex"};
        jflex.Main.main(rutaLex);
    }
    
    public static void GenerarSintactico() throws IOException, Exception{
        String rutaSintac = "/home/labhw02/NetBeansProjects/miniCsharp/src/minic_compis/AnalizadorCup.cup";
        String [] Sintactico = {"-parser","Sintaxis",rutaSintac};
        java_cup.Main.main(Sintactico);
        moverArchivo("Sintaxis.java");
        moverArchivo("sym.java");
        
    }

    private static void moverArchivo(String sintaxisjava) {
        File archivo = new File(sintaxisjava);
        
        if (archivo.exists()) {
            System.out.println("Archivo encontrados, ahora se trasladará: " + archivo+ " \n");
            Path rutaRelativa = Paths.get("");
            String nuevaRuta = rutaRelativa.toAbsolutePath().toString() + File.separator + "src" + File.separator + "minic_compis" + File.separator + archivo.getName();
            File archivoAnterior = new File(nuevaRuta);
            archivoAnterior.delete();
            
            if (archivo.renameTo(new File(nuevaRuta))) {
                System.out.println(" Archivo trasladado con éxito " + sintaxisjava + ". \n");
                
            }else{
                System.out.println(" El archivo no pudo ser trasladado... \n Intente más tarde. \n");
            }
            
        } else {
            System.out.println(" Archivo no encontrado. \n");
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }
        
    }
    
}
