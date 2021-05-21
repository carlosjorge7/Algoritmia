
package prueba_split;

import java.util.Scanner;

public class Prueba_Split 
{

   
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de caracteres");
        String cadena = sc.nextLine();
        
        String[] arr = cadena.split(" ");
        
        /*for(String p : arr){
            
            System.out.println(p);
        }*/
        
        System.out.print(arr.length);
        
        
        
    }
    
}
