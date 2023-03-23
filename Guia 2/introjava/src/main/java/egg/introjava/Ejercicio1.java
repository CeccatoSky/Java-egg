package egg.introjava;

import java.util.Scanner;


public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Ingrese un numero");        
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        numero2 = leer.nextInt();
        
               
        System.out.println("La suma es: " + (numero1 + numero2));       
        
    }
    
}
