
package egg.introjava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int grados;
        double fahr;
        System.out.println("ingrese la cantidad de grados Celsius y lo pasaremos a Fahrenheit");
        
        grados = leer.nextInt();
        
        fahr = 32 + (9 * grados / 5);
        
        System.out.println("grados centigrados: " + grados);
        
        System.out.println("grados fahrenheit: " + fahr);
        
        
    }
    
}
