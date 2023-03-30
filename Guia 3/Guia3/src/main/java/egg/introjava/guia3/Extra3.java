package egg.introjava.guia3;

import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String letra, letra1;
        
        System.out.println("ingrese una letra");
        letra = leer.next();
        
        letra = letra.toLowerCase();
        
        if ((letra.equals("a"))||(letra.equals("e"))||(letra.equals("i"))||(letra.equals("o"))||(letra.equals("u"))){
            
            System.out.println("es una vocal");
        }
            else{
                    System.out.println("no es vocal");
            }        
    }
}
