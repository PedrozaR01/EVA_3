
import java.util.ArrayList;
import java.util.List;

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
        //Lista: Siempre se puede modificar su tamaño
            List <Integer>lsMiLista = new ArrayList();
            lsMiLista.add(100);
            lsMiLista.add(500);
            lsMiLista.add(600);
            lsMiLista.add(700);
            lsMiLista.add(90);
            for (int i = 0; i < lsMiLista.size(); i++) {//El for es similar a los arreglos, pero usa .size pra viajar por sus posiciones
            System.out.println(lsMiLista.get(i));
        }
            
    }
    
}
