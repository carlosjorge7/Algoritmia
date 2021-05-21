/*
La entrada consta de una única línea que contiene un número n, 0 ≤ n ≤ 5,
que indica cuántos mensajes hay que emitir. 

Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo.".
*/

package HolaMundo_116;

import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero entre el 0 y 5 (incluidos)");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Hola mundo.");
        }
        
    }
    
}
