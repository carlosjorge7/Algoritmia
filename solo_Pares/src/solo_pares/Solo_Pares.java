

/**
     * Programa que cargue un array de 10 numeros, posteriormente mostrar solo los pares
     */
package solo_pares;

import java.util.Scanner;


public class Solo_Pares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean esPar;
        
        
        //Cargamos los numeros
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print("Numeros");
            numeros[i] = sc.nextInt();
        }
        
        //Procesamos
        
        for (int i = 0; i < numeros.length; i++) {
            
            if(numeros[i] % 2 == 0){
                
                System.out.print(numeros[i] + " ");
            }else{
                
               esPar = false;
            }
            
        }
    }
    
}
