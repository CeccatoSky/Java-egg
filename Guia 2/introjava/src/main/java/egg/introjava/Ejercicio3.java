
package egg.introjava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        String mayusculas;
        String minusculas;
        
        System.out.println("Ingrese una frase");
        
        frase = leer.nextLine();
        System.out.println(frase);
        
        mayusculas = frase.toUpperCase();
        minusculas = frase.toLowerCase();
        
        System.out.println(mayusculas);
        
        System.out.println(minusculas);
        
        
        
        
        
                
    }
    
}
