
package egg.introjava.guia4;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int seleccion;
        double resultado;
        double num1, num2;
        
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1-SUMA");
        System.out.println("2-RESTA");
        System.out.println("3-MULTIPLICACION");
        System.out.println("4-DIVISION");
        System.out.println("5-NOSE");
        System.out.println("Elija una operacion");
        
        seleccion = leer.nextInt();
        
        do {
            
            
            switch(seleccion){
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("el resultado es: "+resultado);                    
                    break;
                    
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("el resultado es: "+resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("el resultado es: "+resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println("el resultado es: "+resultado);
                    break;
                default:
                    System.out.println("mete bien el dedo");              
            
            }
        
        }while(seleccion==0);
    }

    public static int sumar(double num1, double num2){
        double suma;
        suma = num1 + num2;
    return (int) suma;
    }
    
    public static int restar(double num1, double num2){
        double resta;
        resta = num1 - num2;
    return (int)resta;
    }
    
    public static int multiplicar(double num1, double num2){
        double multiplica;
        multiplica = num1 * num2;
        return (int) multiplica;
    }
    
    public static double dividir(double num1, double num2){
        double divide;
        divide = num1 / num2;
        return divide;        
        
    }
        
        
}


    
