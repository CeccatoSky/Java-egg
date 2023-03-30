
package egg.introjava.guia3;

import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numero;
        
        System.out.println("ingrese un numero entre 1 y 10");
        numero = leer.nextInt();
        
        if ((numero>=1)&&(numero<=3)){
            for(int i=0; i<numero; i++){
                System.out.print("I");
            }
           // System.out.println(" ");
            
        }else if(numero==4){
            System.out.println("IV");
            
              } else if(numero==5){
                       System.out.println("V");
                       
                     }else if ((numero>=6)&&(numero<=8)){
                               System.out.print("V");
                               
                               for(int i=5; i<numero; i++){
                                   System.out.print("I");
                               }
                            }else if(numero==9){
                                    System.out.println("IX");
                                    
                                    }else if(numero==10){
                                           System.out.println("X");
                                           }
       
    }
    
}
