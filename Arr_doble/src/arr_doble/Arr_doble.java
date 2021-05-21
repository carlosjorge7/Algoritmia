/*
Programa que mete 7 numeros decimales, 
posteriormente los  volvemos a mostrar con el doble de su valor
 */
package arr_doble;

import java.util.Scanner;

public class Arr_doble {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float[] arr = new float[7];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numero:");
            arr[i] = sc.nextFloat();
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(2 * arr[i]);
            
        }
    }
    
}
