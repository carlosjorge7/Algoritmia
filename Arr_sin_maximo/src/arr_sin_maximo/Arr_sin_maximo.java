/*
2) Programa que lee 9 numeros enteros.
Al finalizar me muestra todos los numeros menos el maximo
 */
package arr_sin_maximo;

import java.util.Scanner;

public class Arr_sin_maximo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 9;
        int[] arr = new int[NUM];
        int max = Integer.MIN_VALUE;
        int indice_m = -1;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
            
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        System.out.println("Array sin el maximo:");
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] != max){
                System.out.println(arr[i]);
            }            
        }
        
        
    }
    
}
