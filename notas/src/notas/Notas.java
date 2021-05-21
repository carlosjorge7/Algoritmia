/*
Mientras que la nota no este comprendida entre el 0 y 10, pedir notas. 
En cuanto sea valida, se sale
 */
package notas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        
        do{
            System.out.println("Nota:");
            nota = sc.nextInt();
        }
        while(nota < 0 || nota > 10);
        sc.close();
        System.out.println("Has metido una nota valida");
        
        //El while se usa cuando el numero de iteraciones NO se conoce
        //WHILE tiene dos valores: true or false
    } 
}
