/*

******  
*    *
*    *
******
base = 6
altura = 4

*/
package rectangulo_vacio;

import java.util.Scanner;

public class Rectangulo_vacio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Base:");
        int base = sc.nextInt();
        System.out.println("Altura:");
        int altura = sc.nextInt();
        /* El numero de espacios en blanco sera la base - 2*/
        int espaciosBlanco = base - 2;
        
        
        for (int i = 0; i < base; i++) {
           System.out.print("*");     
        }
        System.out.println();
        
        /*OTRA IDEA: si j == 0 or j == base, entonces print *
                     si no, entonces print " "        */
        
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
            
            for (int j = 0; j < espaciosBlanco; j++) {
                System.out.print(" ");   
            }
            System.out.print("*");
            System.out.println();
        }
        
       
        for (int i = 0; i < base; i++) { 
            System.out.print("*");
        }   
        
    }
    
}
