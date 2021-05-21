package b;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int LIMITE_INF = 3;
        final int LIMITE_SUP = 37;
        int[] arr = new int[LIMITE_SUP-LIMITE_INF + 1];
        boolean salir = false;
        int num;
        
        while(!salir){
            
            System.out.println("Numero");
            num = sc.nextInt();
            
            if(num >= LIMITE_INF && num <= LIMITE_SUP){
                
                arr[num - 3]++;
                if(arr[num - 3] == 3){
                    
                    salir = true;
                }
                
            }
            else{
                System.out.println("Fuera de rango");
            }
        }
        
    }
    
}
