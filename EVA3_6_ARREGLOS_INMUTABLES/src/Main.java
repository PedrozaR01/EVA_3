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
        String[] asDias = {"Lunes", "Martes", "Miércoles", "Jueves",
            "Viernes", "Sábado", "Domingo"};//Se declara todas las posiciones junto con el arreglo
        
        for (String asDia : asDias) {
            System.out.println(asDia);//Imprime cada posición del arreglo
        }
    }
    
}
