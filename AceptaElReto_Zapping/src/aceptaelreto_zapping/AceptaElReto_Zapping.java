/*
166
La entrada consta de una serie de casos de prueba consistentes en dos valores 
entre 1 y 99, el primero correspondiente al canal en el que me encuentro y el segundo 
al canal al que quiero llegar. La entrada termina cuando los dos números son 0. 

 Para cada caso de prueba se escribirá una línea en la que aparecerá el número 
de veces que tengo que saltar de canal para conseguir mi objetivo de forma óptima.
 */
package aceptaelreto_zapping;


import java.util.Scanner;

public class AceptaElReto_Zapping {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        final int LIM_INF = 1;
        final int LIM_SUP = 99;
        //int contInicio = 0, contFin = 0;
        //int pulsaciones;
        int canalInicio = sc.nextInt();
        int canalFin = sc.nextInt();
        
        if(canalInicio >= LIM_INF && canalFin <= LIM_SUP){
            
            while(canalInicio != 0 && canalFin != 0){
             
                if(canalInicio >= LIM_INF && canalFin <= LIM_SUP){
                    
                    if(canalInicio <= 50 && canalFin >= 50){  //Conviene mas recorrerlo por atras
                        
                        // 2 99   --- pulsaciones 2  . 2 al 1 (1)   1 al 99 (1) del 
                        //4 87 --- pulsaciones.    4 al 1 (3) y del 99 al 87 (12) .. 15 saltos        
             
                        System.out.println((canalInicio - LIM_INF) + (LIM_SUP - canalFin) + 1);
                           
                    }
                    else if(canalInicio >= 50 && canalFin < 50){ //Conviene mas recorrerlo por alante
                        // 63  5  
                        
                          
                    }
                    
                    canalInicio = sc.nextInt();
                    canalFin = sc.nextInt();
                    
                }
                
            
            }
              
        }
       
   
           
        
    }
}
