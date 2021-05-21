/*
Introducir un array de tamaño N 
y posteriormente evaluar si hay algun elemento repetido o no
 */
package arr_repe;

import java.util.Scanner;

public class Arr_repe {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] arr = new int[N];
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Elementos del array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        //Nice
        boolean repetido = false;
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                
                if(arr[i] == arr[j]){
                    repetido = true;
                }
                
            }
        }
        
        if(!repetido){
            System.out.println("Todos elementos del array son distintos");
        }
        else{
            System.out.println("Existe algun elemento que se repite");
        }
    }
    
}
