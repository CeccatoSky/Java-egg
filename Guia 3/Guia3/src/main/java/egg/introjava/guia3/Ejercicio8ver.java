
package egg.introjava.guia3;

import java.util.Scanner;

public class Ejercicio8ver {public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int x, i;
    System.out.println("Ingrese el numero de elementos del cuadrado");
    int num = leer.nextInt();
    for( x = 1; x<= num; x++){
        if(x==1 || x== num ){
            for(i=1; i<=num; i++){
                System.out.print(" * ");
                
            }
          System.out.println(" ");  
        }else{
             System.out.print(" * ");
             for(i=num+3; i>=0; i-- ){
                System.out.print(" ");
                
            }
             System.out.println(" * ");
        }
        
    }
    
     }
}
