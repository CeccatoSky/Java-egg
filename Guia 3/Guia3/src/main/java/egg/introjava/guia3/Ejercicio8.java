
package egg.introjava.guia3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //int lado = leer.nextInt();
        //lado=4;
        int i,j;
        
        for (i=1; i<4; i++){
            for(j=1; i<4; j++){
                
                if ((i>1) && (i<4) && (j>1)&& (j<4)){
                    System.out.println("imprimiendo");
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
                
            }
            System.out.println(" ");
        }
        
        System.out.println("fin");
        
    }
    
}
