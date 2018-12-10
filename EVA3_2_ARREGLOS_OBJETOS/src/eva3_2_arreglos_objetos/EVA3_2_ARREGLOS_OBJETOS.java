/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_objetos;

/**
 *
 * @author Roberto Pedroza
 */
public class EVA3_2_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] apAlumnos = new Persona[5];//Arreglo que contendrá los atributos de una clase
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i] = new Persona("Juan Pérez");//Esta línea asigna valor de tipo String a las posiciones del arreglo
        }
        for (int i = 0; i < apAlumnos.length; i++) {
          apAlumnos[i].imprimir();//Esto imprime los valores
        }
        //System.out.println("Nombre: " + apAlumnos[2].nombre);
    }
    
}
class Persona{
    public String nombre;
    public void imprimir(){
        System.out.println(nombre);
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
}