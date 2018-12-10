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
        //ARREGLOS ES UNA SECUENCIA CONTIGUA DE VARIABLES
        //DEL MISMO TIPO
        //CAPTURAR MUCHOS DATOS DEL MISMO TIPO
        //CAPTURAR EDADES, IMPRIMIR, CALCULAR LA MEDIA
        // TEC II --> 3000 ESTUDIANTES (4 bytes) = 12 nil bytes --> 12kb
        //USAMOS UN ARREGLO
        //TIPO DE DATO [] NOMBRE DEL IDENTIFICADOR = new tipo de dato [tamaño]
        //Son de acceso aleatorio
        int [] aiEdades = new int [3000];
        //AREGLOS EN JAVA, C, C++ TIENEN DIRECCIONES PARA CADA
        //POSICIÓN --> 0 ES LA PRIMERA --> N-1 LA ÚLTIMA
        //SIENDO N --> TAMAÑO DEL ARREGLO
        System.out.println(aiEdades.length);
        System.out.println("Primer posición = " + aiEdades[0]);
        System.out.println("Última posición = " + aiEdades[2999]);
        //Llenarlo con edades:
        // 17 - 40
        for (int i = 0; i < aiEdades.length; i++) {
            /*System.out.println((int)(Math.random()* 40) + 1);*/
            int iEdad = (int)(Math.random() * 40) + 1;
            aiEdades[i] = iEdad;
        }
        //Imprimir todo el arreglo
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
        }
        //FOR EACH
        for (int aiEdade : aiEdades) {
            System.out.println("For each - " + aiEdade);
        }
        //Sumatoria para calcular la media
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum = iAcum + aiEdades[i];
        }
        System.out.println("La media es: " + (double)(iAcum/3000));
    }
    
}
