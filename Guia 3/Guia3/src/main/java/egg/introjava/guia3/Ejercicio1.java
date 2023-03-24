
package egg.introjava.guia3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        System.out.println("ingrese un numero");
        
        numero = leer.nextInt();
        
        if(numero%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("el numero no es par");
        }
        
    }
    
}
