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
        System.out.println("Inicia Main");
        A();//Llama al método A
        System.out.println("Termina Main");
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B();//Llama a B
        System.out.println("Termina A");
    }
    
        public static void B(){
        System.out.println("Inicia B");
        C();//Llama a C
        System.out.println("Termina B");
    }
        
            public static void C(){
        System.out.println("Inicia C");
        try{
        int div = 1/0;//C genera un error que se va a propagar por todo el programa
        }catch(ArithmeticException e){//Pero con try catch el programa no se detiene  pesar del error
            e.printStackTrace();
        }
        System.out.println("Termina C");
    }
}
