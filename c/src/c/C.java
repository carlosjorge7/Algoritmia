//1
// 3 fallos, Te sobra la variable cero, la asignacion de variables al reves
package c;

public class C {

    public static void main(String[] args) {
        
        final int NUM_IMPAR = 7;
        int[][] res = new int[NUM_IMPAR][NUM_IMPAR];
        int[][] identidad = new int[NUM_IMPAR][NUM_IMPAR];
        int[][] inversa = new int[NUM_IMPAR][NUM_IMPAR];
        
        
        /*for (int i = 0; i < res.length; i++) {
            
            for (int j = 0; j < res[0].length; j++) {
                
                if(i == j){
                    res[i][j] = 1;
                }
            }
        }
        
        for (int i = 0, j = res[0].length - 1;  j >= 0; i++, j--) {
                          
            res[i][j] = 1;            
        }*/
            
        
        for (int i = 0; i < identidad.length; i++) {
            
            for (int j = 0; j < identidad[0].length; j++) {
                
                if(i == j){
                    identidad[i][j] = 1;
                }
            }
        }
        
        for (int i = 0, j = inversa[0].length - 1;  j >= 0; i++, j--) {
                        
            inversa[i][j] = 1;            
        }
        
        for (int i = 0; i < res.length; i++) {
            
            
            for (int j = 0; j < res[0].length; j++) {
                
                res[i][j] = identidad[i][j] + inversa[i][j];
            }
            
        }
        
        for (int i = 0; i < res.length; i++) {
            
            for (int j = 0; j < res[0].length; j++) {
                
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
