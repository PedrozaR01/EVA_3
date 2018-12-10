/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Valor vOb1 = new Valor();// objeto de la clase
        vOb1.ix = 100; //Se le asigna un valor al objeto usando la variable de la lase
        Valor vOb2 = new Valor(); //Se crea otro objeto de la clase
        vOb2.ix = 500; //Y se le agina otro valor
        intercambiar(vOb1, vOb2);//Se le llama al método que intercambia valores y se envían los dos objetos
        System.out.println("Obj 1 = " + vOb1.ix);//Se imprime el objeto 1
        System.out.println("Obj 2 = " + vOb2.ix);//Objeto 2
        //Como la acción hecha por el método no tiene efecto fuera de éste, los valores de los objetos son los mismos antes de llamar al métod 
        System.out.println("\n Intercambio");
        
        Valor vTemp = vOb1;
        vOb1 = vOb2;
        vOb2 = vTemp;
        //Se efectúa la misma acción del método pero dentro de la clase main
        System.out.println("Obj 1 = " + vOb1.ix);
        System.out.println("Obj 2 = " + vOb2.ix);
        //Ahora si hubo un intercambio
    }
    
    public static void intercambiar(Valor v1, Valor v2){ //Método que intercambia dos valores
        Valor vTemp = v1;//Se le asigna el valor de la primera variable a una variable contenedora
        v1 = v2; //Ahora se le asigna el valor de la segunda variable a la primera
        v2 = vTemp; //La variable contenedora con el valor de la primera se le asigna a la segunda
    }
}

class Valor{ //Clase que contiene una variable
    int ix;
}
