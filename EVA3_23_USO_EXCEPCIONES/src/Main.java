
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Empleado eEmp = new Empleado();
        eEmp.setNombre("Juan");
        eEmp.setApellido("Perez");
        try {
            eEmp.setSalario(-500.0);//Se rodea esta línea con el try catch porque es donde nos interesa atrapar un error
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Nombre: " + eEmp.getNombre());
        System.out.println("Apellido: " + eEmp.getApellido());
        System.out.println("Salario: " + eEmp.getSalario());
    }
    
}

class Empleado{
    private String nombre;
    private String apellido;
    private double Salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) throws Exception {
        if(Salario < 0)//Salarios negativpos
            throw new Exception("No se permiten salarios negativos");//Creamos una excepción con un if
        // en caso de que el if sea correcto, se creará la excepción
        this.Salario = Salario;
    }
    
    
}
