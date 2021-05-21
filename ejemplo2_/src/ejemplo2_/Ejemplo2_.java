/*Programa que pide 10 numeros enteros.
Una vez leidos, Al acabar muestra el numero de pares, numero de impares y
la media de todos ellos*/
package ejemplo2_;
import java.util.Scanner;

public class Ejemplo2_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contPares = 0;
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Numero:");
            int num = sc.nextInt();
            sum += num;
            
            if(num % 2 == 0){
                contPares++;
            }
        }
        sc.close();
        System.out.println("PARES=" + contPares + "IMPARES=" + (10 - contPares)
            +"MEDIA=" + sum / 10f);
        
        
    }
    
}
