/*
39.- Realiza un programa que lea un array de enteros de tamaño 10.
Se deberá invertir la ubicación de los
elementos y posteriormente mostrarlo:
 */
package arr_volteado;

import java.util.Scanner;

public class Arr_volteado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 10;
        int[] arr = new int[NUM];
        
        System.out.println("Entrada:");
        for (int i = 0; i < arr.length; i++){
            
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Volteando...");
        int aux;
        for (int i = 0; i < arr.length / 2; i++) {
            
            aux = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = aux;
        }
        
        System.out.println("Salida:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    
}
