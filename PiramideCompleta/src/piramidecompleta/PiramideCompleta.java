/*
        *
       ***
      *****
     *******
    *********
 */
package piramidecompleta;

import java.util.Scanner;

public class PiramideCompleta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura de la piramide");
        int altura = sc.nextInt();
        sc.close();
        int numeroAsteriscos = 1;
        int numeroEspacios = altura - 1;
        
        for (int piso = 0; piso < altura; piso++){
            
            for (int i = 0; i < numeroEspacios; i++){
                
                System.out.print(" ");
            }
            for (int i = 0; i < numeroAsteriscos; i++){
                
                System.out.print("*");
            }
            System.out.println();
            numeroAsteriscos += 2;
            numeroEspacios --;
        }
    }    
}
