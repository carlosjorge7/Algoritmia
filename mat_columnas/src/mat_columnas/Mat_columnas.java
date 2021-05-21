/*
Rellenar un array por columnas
 */
package mat_columnas;

import java.util.Random;

public class Mat_columnas {

    public static void main(String[] args) {
        
        final int FIL = 4;
        final int COL = 4;
        Random rd = new Random();
        int[][] mat = new int[FIL][COL];
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[0].length; j++) {
                
                mat[i][j] = rd.nextInt();
            } 
        }
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[0].length; j++) {
                
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        int cont=0;
        System.out.println("Por columna:");
        for (int j = 0; j < mat[0].length; j++) {
            
            for (int i = 0; i < mat.length; i++) {
                
                mat[j][i] = cont;
                cont++;
                System.out.print(cont + " ");
                
            }
            System.out.println();
            
        }
        
        
    }
    
}
