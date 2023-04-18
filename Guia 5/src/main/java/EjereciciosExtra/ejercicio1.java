
package EjereciciosExtra;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.

*/

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,suma=0;
        
        System.out.println("ingrese la cantidad de elementos del vector");
        n = leer.nextInt();
        int[] vector = new int [n];
        
        for(int i=0; i<n; i++){
            System.out.println("ingrese un numero para la posicion: ["+i+("]"));
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("la suma de los "+n+" elementos es: "+suma);        
    }    
}
