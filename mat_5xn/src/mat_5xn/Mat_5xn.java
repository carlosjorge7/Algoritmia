/*
2) Crear una matriz de 5 filas y n columnas 
(se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
 */
package mat_5xn;

import java.util.Random;
import java.util.Scanner;

public class Mat_5xn {

    public static void main(String[] args) {
        
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        final int FIL = 5;
        System.out.println("Columnas(n)");
        int COL = sc.nextInt();
        int[][] mat = new int[FIL][COL];
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[0].length; j++) {
                
                mat[i][j] = rd.nextInt(10) + 0;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
