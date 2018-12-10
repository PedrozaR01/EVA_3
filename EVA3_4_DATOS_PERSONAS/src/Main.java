
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
        Persona [] Datos = new Persona[10];
        Scanner Inpt = new Scanner(System.in);
        int iSuma = 0;
        
        System.out.println("Introduzacan 10 nombres de personas y después, introducir sus edades respectivamente");
        //Nombre
        for (int i = 0; i < Datos.length; i++) {
            System.out.println("Introduce tu nombre: ");
            Datos[i] = new Persona(Inpt.nextLine());
            
        }
        //Edad
        for (int i = 0; i < Datos.length; i++) {
            System.out.println("Introduce tu edad");
            Datos[i] = new Persona(Inpt.nextInt());
        }
        //Impresión
        for (int i = 0; i < Datos.length; i++) {
            Datos[i].imprimir();
        }
        //Suma
        for (int i = 0; i < Datos.length; i++) {
            
        }
        
    }
    
}

class Persona{
    public String nombre;
    public int edad;
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(int edad){
        this.edad = edad;
    }
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
}
}