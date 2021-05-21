/*
6) Generar una matriz de 3×3 con números aleatorios del 1 al 100 sin repetirse.

Idea: Generar un array de tamaño 9 con numeros aleatorios  sin repetir, y pasarselos a la matriz
 */
package mat_3x3_aleatorios_sin_repetir;

import java.util.Random;

public class Mat_3x3_aleatorios_sin_repetir {

    public static void main(String[] args) {
        
        Random rd = new Random();
        final int n = 3;
        int[][] matriz = new int[n][n];
        int[] vector = new int[n*n];
        int cont = 0;
        boolean repetido;
        
        while(cont < vector.length){
            
            int aux = rd.nextInt(100) + 1;
            repetido = false;
              
            for (int i = 0; i < cont && !repetido; i++) {
                
                if(vector[i] == aux){
                    repetido = true;
                }
            }
            
            if(!repetido){
               vector[cont] = aux;
               cont++;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                
                matriz[i][j] = vector[(matriz.length*i) + j];
               
            }
            
        }
       
        
        System.out.println("Matrix 3x3 con aleatorios sin repetir del 1 al 100");
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
        }
        
    }
    
}
