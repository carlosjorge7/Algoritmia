/*
3) Programa que pida numeros hata llenar un array
con 11Numeros pares, si es impar no se guardara
 */
package arr_solo_pares;

import java.util.Scanner;

public class Arr_solo_pares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] pares = new int[11];
        int cont = 0;
        
        while(cont < 11){
            
            System.out.println("Numero:");
            int aux = sc.nextInt();
            
            if(aux % 2 != 0){
               System.out.println("Impar");
            }
            else{
                pares[cont] = aux;
                cont++;
            }
        }
        
        System.out.println("Pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ,");
        }
        
    }
    
}
