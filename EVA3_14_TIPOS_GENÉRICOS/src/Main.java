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
        Persona <String, Double, Integer>pObj = new Persona();//Al crear objeto de la clase se le asignan los tipos de datos a los tipos genéricos
        pObj.setNombre("Juan");
        pObj.setApellido("Peres");
        pObj.setClave("11223344");
        
        Persona <Integer, Boolean, String>pEnt = new Persona();
        pEnt.setNombre(1);
        pEnt.setApellido(1);
        pEnt.setClave(100);
        pEnt.setOtroDato(true);
    }
    
}
class Persona <T,S, B>{//Clase que contendrá tipos de datos genéricos, marcados con <>
    private T Nombre;
    private T Apellido;
    private T clave;
    private S otroDato; 

    public S getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(S otroDato) {
        this.otroDato = otroDato;
    }

    public T getNombre() {
        return Nombre;
    }

    public void setNombre(T Nombre) {
        this.Nombre = Nombre;
    }

    public T getApellido() {
        return Apellido;
    }

    public void setApellido(T Apellido) {
        this.Apellido = Apellido;
    }

    public T getClave() {
        return clave;
    }

    public void setClave(T clave) {
        this.clave = clave;
    }

    
}