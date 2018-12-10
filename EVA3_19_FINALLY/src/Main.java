
import java.util.Scanner;

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
        Scanner Inpt = new Scanner(System.in);
         System.out.println("Introduce un divisor: ");
         int iDivi = Inpt.nextInt();
         
         System.out.println("Introduce un dividendo: ");
         int iDen = Inpt.nextInt();
         
         int iRes = 0;
         try{
         iRes = iDen / iDivi;
         }catch(ArithmeticException e){
             //Se pueden generar excepciones
             e.printStackTrace();
             System.out.println("División entre 0");
         }finally{//Siempre se ejecuta
             //Se pueden generaqr excepciones
             //Cerrar archivos, liberar recursos
             System.out.println("Bloque Finally");
         }
         System.out.println("Resultado = " + iRes);
    }
    
}
