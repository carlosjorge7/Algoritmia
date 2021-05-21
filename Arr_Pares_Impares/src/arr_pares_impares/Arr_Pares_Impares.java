/*
1) Programa que lee 20 numeros enteros, 
para mostrar por un lado los pares y por otro lado os impares
*/
package arr_pares_impares;

import java.util.Scanner;

public class Arr_Pares_Impares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 10;
        int[] nums = new int[NUM];
        
        System.out.println("Input de valores:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Numero");
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Output pares:");
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }
        System.out.println("Output impares:");
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] % 2 != 0){
                System.out.println(nums[i]);
            }  
        }
    }
}
