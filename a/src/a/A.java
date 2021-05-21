// El examen estara entre 5 - 6
//2.25
// 1 fallo (El && por || )
package a;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumaImpares = 0;
        boolean mayor27;
        System.out.println("Numero:");
        int num = sc.nextInt();
        
        if(num != -1){
            
            do{
                System.out.println("Numero");
                num = sc.nextInt();
            
                if(num % 2 != 0){
                    sumaImpares += num;
                }
                mayor27 = false;
            
                if(sumaImpares >= 27){
                
                    mayor27 = true;
                }
       
            }
            while(num != -1  && !mayor27);
            System.out.println("Suma de impares" + sumaImpares);
            
        }
        else{
            
            System.out.println("Fin del programa");
          
        }
        
    }
    
}
