
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
        //USANDO EXCEPCIONES Y CICLOS, PREGUNTAR HASTA
        //QUE SE CAPTUREN VALORES VALIDOS Y EL DIVISOR
        //NO SEA CERO
        while(true){
            System.out.println("Divisor");
            int iDivi = Inpt.nextInt();
        
            System.out.println("Dividendo: ");
            int iDividen = Inpt.nextInt();
            
            int iRes = 0;
            
            try{
                iRes = iDividen / iDivi;
            }catch(ArithmeticException e){
                System.out.println("Introduce un divisor diferente de cero");
            }
            System.out.println("Resultado de la división " + iRes);
            
        }
        //Mostrar el resultado de la división
    }
    
}
