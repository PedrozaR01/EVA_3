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
    Array list[] = new Array[10];//Objeto de la clase
    list[0] = new <Integer>Array();//Posición de la lista, la cual ya asigna un tipo de dato int
    list[1] = new <Integer>Array();
    list[2] = new <Integer>Array();
    list[3] = new <Integer>Array();
    list[4] = new <Integer>Array();
    list[5] = new <Integer>Array();
    list[6] = new <Integer>Array();
    list[7] = new <Integer>Array();
    list[8] = new <Integer>Array();
    list[9] = new <Integer>Array();
    list[0].setDato(100);//Asigna valor a la posición
    System.out.println(list[0].getDato());//Imprime la posición
    
    }
    
}

class Array <T>{//Clase con un tipo genérico
    private T Dato;

    public T getDato() {
        return Dato;
    }

    public void setDato(T Dato) {
        this.Dato = Dato;
    }
    
}