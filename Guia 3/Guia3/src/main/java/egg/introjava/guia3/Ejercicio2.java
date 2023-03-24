
package egg.introjava.guia3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        String compara = "eureka";
        boolean resultado;
        
        System.out.println("ingrese una palabra");
        frase = leer.next();
        
        resultado = compara.equals(frase);
        
        if(resultado){
            System.out.println("Las palabras son iguales");        
        }
        else{
            System.out.println("Las palabras no son iguales");
        }
        
        
        
}
    
}
