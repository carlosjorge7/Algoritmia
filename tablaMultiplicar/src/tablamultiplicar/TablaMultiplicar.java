/*Introducir un numero, y posteriormente mostrar la tabla de multiplicar*/

package tablamultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que tabla de mutiplicar quieres?");
        int N = sc.nextInt();
        sc.close();
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(N + "x" + i + "=" + N*i);
            
        }
        
    }
    
}
