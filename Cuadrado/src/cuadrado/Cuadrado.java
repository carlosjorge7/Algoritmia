/*
Introduciendo la base y la altura del rectangulo, Hacer un bicho como el anterios
*/

package cuadrado;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Base:");
        int base = sc.nextInt();
        System.out.println("Altura:");
        int altura = sc.nextInt();
        
        for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < base; j++) {
                
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
