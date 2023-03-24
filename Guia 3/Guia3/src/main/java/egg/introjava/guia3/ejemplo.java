
package egg.introjava.guia3;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca un numero entero");
        int num1 = leer.nextInt();
        System.out.println("Introduzca otro numero entero");
        int num2 = leer.nextInt();
        
        if ((num1 > 25) && (num2 > 25)){
         System.out.println("Ambos numeros ingresados son mayores a 25");
        }
        else if (num1 > 25){
            System.out.println("El primer numero es mayor a 25");
        }
        else if (num2 > 25) {
            System.out.println("El segundo numero es mayor a 25");
        }
         else{
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
   
}
