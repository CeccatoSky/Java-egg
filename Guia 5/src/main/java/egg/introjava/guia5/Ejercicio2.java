
package egg.introjava.guia5;

import java.util.Random;
import java.util.Scanner;

/*Realizar un algoritmo que llene un vector de tamaño N 
con valores aleatorios y le pida al usuario un número a 
buscar en el vector. El programa mostrará dónde se encuentra
el numero y si se encuentra repetido

*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        int n,i, num;
        int contador = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for(i=0; i<vector.length; i++){
            vector[i] = random.nextInt(10);
        }
        
        System.out.println("Ingrese ahora un numero a buscar");
        num = leer.nextInt();
        
        for(i=0; i<vector.length; i++){
            if(vector[i]==num){
                System.out.println("numero encontrado en la posicion "+i);
                contador++;
            }
        }
        if(contador==0){
            System.out.println("el numero no fue encontrado");
        }
        if (contador>0){
            System.out.println("el numero "+num+" fue encontrado "+contador+" veces");
        }
    }
    
}
