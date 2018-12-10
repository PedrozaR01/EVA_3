
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStream isAbrir = null;//Objeto para abrir un documento
        InputStreamReader isLeer = null; //Objeto para leer un documento
        BufferedReader brTexto = null;//Objeto para mostrar el texto
        //Los pasados objetos funcionan en cadena
        
        try {
            isAbrir = Files.newInputStream(Paths.get("C:/Users/rober/OneDrive/Documentos/Texto.txt"));
            isLeer = new InputStreamReader(isAbrir);
            brTexto = new BufferedReader(isLeer);
            String sLinea = brTexto.readLine();//Variable que almacena el texto 
            while(sLinea != null){
                System.out.println(sLinea);
                sLinea = brTexto.readLine();
            }
        } catch (IOException ex) {
        ex.printStackTrace();        }
    }
    
}
