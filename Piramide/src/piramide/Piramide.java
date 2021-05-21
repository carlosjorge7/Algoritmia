/*
            *
            **
            ***
            ****
            *****
            ******
*/

package piramide;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura de la piramide:");
        int altura = sc.nextInt();
        sc.close();
        int numeroAsteriscos = 1;
        
        for (int piso = 0; piso < altura; piso++) {
            
            for (int i = 0; i < numeroAsteriscos; i++) {
                
                System.out.print("*");
                
            }
            System.out.println();
            numeroAsteriscos++;
        }
        
    }
    
}
