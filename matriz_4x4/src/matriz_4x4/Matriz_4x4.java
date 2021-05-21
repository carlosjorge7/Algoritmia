/*
4) Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, 
nos piden hacer un menú con estas opciones:

    1)Rellenar TODA la matriz de números, debes pedírselo al usuario.
    2) Mostrar matriz
    3)Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
    4)Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
    5)Sumar la diagonal principal (ver ejemplo)
    6)Sumar la diagonal inversa (ver ejemplo)
    7)La media de todos los valores de la matriz
    8) Salir

IMPORTANTE: hasta que no se haga la primera opción, 
el resto de opciones no se deberán de ejecutar,
simplemente mostrar un mensaje donde diga que debes rellenar la matriz.
 */
package matriz_4x4;

import java.util.Scanner;

public class Matriz_4x4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        String opcion = "";
        System.out.println("1)Rellenar TODA la matriz de números, debes pedírselo al usuario.\n" +
            "2) Mostrar matriz\n" +
            "3)Suma de una fila que se pedirá al usuario (controlar que elija una correcta)\n" +
            "4)Suma de una columna que se pedirá al usuario (controlar que elija una correcta)\n" +
            "5)Sumar la diagonal principal (ver ejemplo)\n" +
            "6)Sumar la diagonal inversa (ver ejemplo)\n" +
            "7)La media de todos los valores de la matriz\n" +
            "8) Salir");
        int suma;
        
        while(!opcion.equals("8")){
     
            System.out.println("Opcion:");
            opcion = sc.nextLine();
            
            switch(opcion){
                
                case "1": //Cargamos la matriz
                    for (int i = 0; i < matriz.length; i++) {
            
                        for (int j = 0; j < matriz[0].length; j++) {
                
                            System.out.println("Coordenada:");
                            matriz[i][j] = sc.nextInt();
                        }
                    }
                    break;
                    
                case "2": //Mostrar matriz
                    for (int i = 0; i < matriz.length; i++) {
                        
                        for (int j = 0; j < matriz[0].length; j++) {
                            
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                case "3": //Sumar fila que se pedira al usuario
                    System.out.println("Fila quieres sumar:");
                    int fila = sc.nextInt();
                    suma = 0;
                    
                    for (int j = 0; j < matriz[0].length; j++) {
                        suma += matriz[fila][j];
                    }
                    System.out.println("La suma de la fila" + fila + "es" + suma);
                    break;
                    
                case "4": //Suma columna que se pida al usuario
                    System.out.println("Columna que quieres sumar:");
                    int columna = sc.nextInt();
                    suma = 0;
                    
                    for (int i = 0; i < matriz.length; i++) {
                        suma += matriz[i][columna];
                    }
                    System.out.println("La suma de la culumna" + columna + "es" + suma);
                    break;
                    
                case "5": //Suma de los elementos de la diagonal ppal
                    suma = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        
                        for (int j = 0; j < matriz[0].length; j++) {
                            
                            if(i == j){
                                suma += matriz[i][j];
                            }
                        }
                    }
                    System.out.println("La suma de la diagonal ppal es" + suma);
                    break;
                    
                case "6": //Suma de los elementos de la diagonal inversa
                    suma = 0;
                    for (int i = 0, j = matriz[0].length - 1; i < matriz.length && j >= 0; i++, j--) {
                        
                        suma += matriz[i][j];
                        
                    }
                    System.out.println("La suma de la diagonal inversa es" + suma);
                    break;
                    
                case "7": //Media de todos los elementos de la matriz
                    suma = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        
                        for (int j = 0; j < matriz[0].length; j++) {
                            suma += matriz[i][j];
                        }
                    }
                    System.out.println("La media es" + suma / (matriz.length * matriz[0].length));
                    break;
                    
                case "8": //Salir
                    break;
                            
                default:
                    System.out.println("Ninguna de las anteriores");
                    break;
                
            }
           
        }
        
    }
    
}
