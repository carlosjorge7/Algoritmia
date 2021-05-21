/*
Programa que pida numeros hasta que  metamos el  3 o el 7
 */
package ejemplo1_;

import java.util.Scanner;

public class Ejemplo1_ {

 
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            
            System.out.println("Numero");
            num = sc.nextInt();
   
        }
        while(num != 3 && num != 7);
    }
    
}
