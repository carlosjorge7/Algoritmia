package main1;

public class Main1 {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        
        //Byte va desde -127 a 128, 8bits de memoria
        byte a = 2;
        byte b = 3;
        byte sum = 0;
        
        sum = (byte)(a + b);
        
        /*Tipo de dato int son 32bits, long mas grande que int
        esta comprendido entre -2**31 y 2**31
        Asi a ojo unos 200millones 
        Tipo de dato long -2**63 a 2**63 */
        
        /*Float tiene 32bits y double tiene 64bits, decimales*/
        
        System.out.println(sum);
        
        boolean pr = true;
        pr = false;
        
        System.out.println(pr);
        
        //char tiene un tamao de 16bits
        
        char caracter = 'a';
        System.out.println(caracter);
        
        String cadena = "Hola que tal"; //String es una clase
                
    }
    
}
