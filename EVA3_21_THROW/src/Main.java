
import java.util.Scanner;
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner Inpt = new Scanner(System.in);
         System.out.println("Introduce un divisor: ");
         int iDsor = Inpt.nextInt();
         
         System.out.println("Introduce un dividendo: ");
         int iDen = Inpt.nextInt();
        if(iDsor == 0){
                //Lanzamos nuestra propia excepción
                throw new Exception("Hola Mundo Cruel!!!");
            
        }
    }
    
}
