
package egg.introjava.guia3;

import java.util.Scanner;

public class ejemplo {
        public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numero;
        
        System.out.println("ingrese un numero entre 1 y 10");
        numero = leer.nextInt();
        
        if ((numero>=1)&&(numero<=3)){
            for(int i=0; i<numero; i++){
                System.out.print("I");
            }
        }
    }
   
}
