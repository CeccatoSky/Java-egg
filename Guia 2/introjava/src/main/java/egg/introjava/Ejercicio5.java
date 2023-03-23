
package egg.introjava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int doble;
        int triple;
        double raiz;
        
        System.out.println("ingrese un numero");
        numero = leer.nextInt();
        
        doble = numero * 2;
        triple = numero * 3;
        raiz = Math.sqrt(numero);
        
        System.out.println(doble);
        System.out.println(triple);
        System.out.println(raiz);   
        
        
    }
    
}
