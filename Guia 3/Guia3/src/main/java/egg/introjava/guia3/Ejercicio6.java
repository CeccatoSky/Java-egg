
package egg.introjava.guia3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, opcion;
        boolean salir;
        salir = false;
        String rest;
        double division;
        
        System.out.println("Ingrese un numero entero positivo");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        num2 = sc.nextInt();
       
        do{
            System.out.println("MENU\n1- SUMAR\n2- RESTAR\n3- MULTIPLICAR\n4- DIVIDIR\n5- SALIR");  
            System.out.println("ELIJA UNA OPCION");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    
                    break;
                case 2:                     
                    System.out.println("La resta es: " + (num1 - num2));

                    break;
                case 3:   
                    System.out.println("La multiplicacion es: " + (num1 * num2));

                    break;
                case 4:                        
                    division = (double) num1/num2; //SI NO FUERA POR MIGUEL NO LO SACABAMOS.
                    System.out.println("La division es: " + division);

                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)?");
                   
                    rest = sc.next();
                  
                    if(rest.equalsIgnoreCase("S")){
                        salir = true;
                    }
                    break;
                            
                default:
                    System.out.println("ELIJA UN NUMERO DE 1 A 5");
                    break;
            }
            
           
        }while(salir == false);
            
        System.out.println("CHAU");
        
    }
    
}
