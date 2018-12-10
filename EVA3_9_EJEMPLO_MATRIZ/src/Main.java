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
        int aiMatriz [][] = new int [5][5];
        llenarMatriz(aiMatriz);//Llama al método que llena a la matriz
        imprimirMatriz(aiMatriz);//Llama al método que imprime a la matriz
        
        int aiCopy [][] = new int [5][5]; //Se declara una matriz copia de la matriz anterior
        
       
        System.out.println("");
        System.out.println("Copia: ");
        
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiCopy[i][j] = aiMatriz[i][j]; //Para poder hacer una copia del arreglo anterior
            }   //Se igualan cada una de las posiciones de los arreglos
            
    }
    imprimirMatriz(aiCopy);
        System.out.println("");
        System.out.println("10x10:");
    int aiBigMat [][] = new int[500][500];
    llenarMatriz(aiBigMat);
    imprimirMatriz(aiBigMat);
}
    public static void llenarMatriz(int Matriz[][]){
        for (int i = 0; i < Matriz.length; i++) {//Se utiliza un for por cada dimensión de la matriz
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = (int)(Math.random()*100) + 1; //Línea que asigna un valor aleatoreo a cada posición
            }
        }
    }
    public static void imprimirMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");//Esta línea hace que las dimensiones de la matriz se puestren en diferentes renglones
    }
}
}
