/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egg.introjava.guia3;

import java.util.Scanner;

/**
 *
 * @author pichu
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        String letra = "A";
        String primera;
        boolean resultado;
        
        System.out.println("Ingrese una palabra o frase");        
        frase = leer.nextLine();
        
        primera = frase.substring(0, 1);
        
        System.out.println(primera);
        
        resultado = primera.equals(letra);
        
        if (resultado) {
            System.out.println("CORRECTO - la primer letra es igual a: A");
        }
        else{
            System.out.println("INCORRECTO - la primer letra no es igual a: A");
        }              
        
    }
}
