
package egg.introjava.guia4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int num;
        boolean primo;
        boolean primo2;
        System.out.println("Ingrese un numero entero");
        num=leer.nextInt();
        primo=numprimo(num); 
        System.out.println("Es primo: " +primo);
        primo2=numprimo2(num);
        System.out.println("Es primo2: " +primo2);
        
    }
    public static boolean numprimo2(int num){
        //agregar excepciones if num==1
        for(int i=1; i<num; i++){
            if ((num % i)==0){
                               
            return false;
            }            
        }
        return true;
    }
    
    public static boolean numprimo(int num){
         int i;
         int cont=0;
        
         for(i=1; i<=num; i++){
             if ((num % i)==0){
                 cont = cont+1;
                }
         }
         return !(cont>2);
    }        
}
