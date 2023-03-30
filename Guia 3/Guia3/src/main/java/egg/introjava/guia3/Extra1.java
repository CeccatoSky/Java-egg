package egg.introjava.guia3;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int entrada;
        int dias, horas, minutos;
        
        System.out.println("ingrese una cantidad de minutos");
        entrada = leer.nextInt();
        
        horas = entrada/60;
        
        minutos = horas%24;
        
        dias= horas/24;        
        
        System.out.println("dias " + dias);
        System.out.println("horas " + minutos);                
        
    }    
}
