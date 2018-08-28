/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minic_compis;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Rodriguez
 */
public class MiniC_Compis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!! \n");
        
        String path = "C:/Users/Walter Rodriguez/Documents/NetBeansProjects/miniC_Compis/src/minic_compis/AnalizadorFlex.flex";
        
        createLexer(path);
        JOptionPane.showMessageDialog(null, "Archivo creado en: " + path);
//Cargar archivo .flex
        
        
    }
    
    public static void createLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
    }
}
