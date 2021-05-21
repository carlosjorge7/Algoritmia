//1
// 2 fallos, el <= por < y la asignacion de variables al reves     1 2 3 4 5 6 5 4 3 2 1
package d;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        sc.close();
        
        int cont =  1;
        
        for (int i = 0; i < numeros.length/2; i++) {
            
            numeros[i] = cont;
            numeros[numeros.length - 1 - i] = numeros[i];
            cont++;
        }
        
        if(numeros.length % 2 != 0){
            
            numeros[numeros.length/2] = cont;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
        
    }
    
}
