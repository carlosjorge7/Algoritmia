/*
3) Crear dos matrices de nxn y sumar sus valores, los resultados se deben 
almacenar en otra matriz. Los valores y la longitud, 
seran insertados por el usuario. Mostrar las matrices originales y el resultado.
 */
package mat_suma;

import java.util.Scanner;

public class Mat_suma {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanio:");
        int n = sc.nextInt();
        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];
        int[][] res = new int[n][n];
        
        
        System.out.println("Carga de la mat1, mat2 y calculo de res:");
        for (int i = 0; i < mat1.length; i++) {
            
            for (int j = 0; j < mat1[0].length; j++) {
                
                System.out.println("Coordenada mat1:");
                mat1[i][j] = sc.nextInt();
                System.out.println("Coordenada mat2:");
                mat2[i][j] = sc.nextInt();
                
                res[i][j] = mat1[i][j] + mat2[i][j]; 
            }
        }
        
        System.out.println("Salida mat1:");
        muestraMatriz(mat1);
        
        System.out.println("Salida mat2:");
        muestraMatriz(mat2);
        
        System.out.println("Salida res:");
        muestraMatriz(res);
    }
    
    public static void muestraMatriz(int[][] matriz){
            
        for (int i = 0; i < matriz.length; i++) {
                
            for (int j = 0; j < matriz[0].length; j++) {
                    
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
                
        }
    }
    
}
