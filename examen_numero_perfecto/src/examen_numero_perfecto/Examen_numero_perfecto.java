/*
Porgrama que pida numeros hasta que se inctruduce un numero perfecto
Un numero perfecto es aquel que el propio numero coincide con la suma de los divisores,
sin incluir el pripio numero.
6 es perfecto ya que 1 + 2 + 3 = 6
 */
package examen_numero_perfecto;

import java.util.Scanner;

public class Examen_numero_perfecto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumDiv = 0;
        int num = 0;
        
        do{
            System.out.println("Numero:");
            num = sc.nextInt();
            sumDiv = 0;
            for (int d = 1; d < num; d++) {
                if(num % d == 0){
                    sumDiv += d;
                }
            }
        }
        while(num != sumDiv);
        System.out.print(num + " es un numero perfecto");
    }
    
}
