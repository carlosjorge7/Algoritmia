//1.5
//2 fallos, el TAMANIO y el cont=1 mal ubicado
package b;

import java.util.Scanner;

public class B {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // A partir de la pos arr[68], elemento 69, se repite 3 veces seguro
        // 34 * 2 = 68, 
        final int TAMANIO = 69;
        int[] arr = new int[TAMANIO];
        int cont = 1;
        int indice = 0;
        boolean repetido;
        
        while(cont < 3){
            
            System.out.println("Numero");
            int aux = sc.nextInt();
            repetido = false;
            
            if(aux >= 3 && aux <= 37){
                
                for (int i = 0; i < indice; i++) {
                    
                    if(arr[i] == aux){
                        repetido = true;
                    }
                    
                }
                if(!repetido){
                    arr[indice] = aux;
                    indice++;
                }
                else{
                    cont++;
                }
                
            }
            else{
                System.out.println("Fuera de rango");
            }
        }
        
        System.out.println("Fin del programa");
        
    }
    
}
