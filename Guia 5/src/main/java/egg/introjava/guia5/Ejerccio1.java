
package egg.introjava.guia5;

import java.util.Random;
import java.util.Scanner;

/*Realizar un algoritmo que llene un vector con los 100
primeros números enteros y los muestre por pantalla en 
orden descendente.
*/

public class Ejerccio1 {

    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);
	        Random random = new Random();
	       
	        int[] vector = new int[100];
	        int x,i;
	        i = vector.length;
	        
	        for(x=0; x<i; x++){
	            vector[x] = random.nextInt(100);
	        }
	            
	        for(x=(vector.length)-1; x>=0; x--){
	            System.out.print(" "+"("+x+")"+vector[x]);
	        }
    }
}