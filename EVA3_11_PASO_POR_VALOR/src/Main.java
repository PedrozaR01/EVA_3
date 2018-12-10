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
        int iVal = 0;//Variable
        llenar(iVal);//Este método le asigna otro valor a la variable y la imprime
        System.out.println(iVal);//Sin embargo esta línea muestra el valor original de la variable antes del método
    }
    
    public static void llenar(int i){
        i = (int)(Math.random() * 100) + 1;
        System.out.println("Llenar " + i); //Se llena la variable dentro del método y se emprime
    }
}
