
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Inpt = new Scanner(System.in);
        System.out.println("Divisor:");
        int divi = Inpt.nextInt();
        
        System.out.println("Dividendo:");
        int dividendo = Inpt.nextInt();
        
        int iResu = 0;
        try{  //Instrucciones que pueden generar excepción
            iResu = dividendo / divi;
        }catch(ArithmeticException e)/*Excepciones a atrapar*/ { //Instrucciones a ejecutar en caso de error
            System.out.println("El divisor es cero, no se puede realizar la división");
            
        }catch(InputMismatchException e){
            System.out.println("El valor capturado no es un número válido");   
        }
        System.out.println("Resultado = " + iResu);
    }
    
}
