
package egg.introjava.guia3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        
        do{
            
            System.out.println("ingrese una palabra de 8 carcateres");
            palabra = leer.next();
            
        }while (palabra.length()!=8);        
        
        System.out.println("muy bien!");
    }
    
}
