package egg.introjava.guia3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("DISPOSITIVO RS232");
        
        Scanner sc = new Scanner(System.in);
        String secuencia, pri, ult, FDE;
        int largo, correcto = 0, incorrecto =0;
        FDE = "&&&&&";
       
        do{
            
        System.out.println("Ingrese una secuencia de 5 caracteres");
        //SECUENCIA IDEA DE GABY
        secuencia = sc.next();
        largo = secuencia.length();
        
        pri = secuencia.substring(0, 1);
        ult = secuencia.substring(largo-1, largo);

        if(largo == 5 && pri.equals("X") && ult.equals("O")){
            System.out.println("Correcto");
            correcto++;
            
        }else if(secuencia.equals(FDE)){
             System.out.println("Imprimiendo informe...");
                
        }else {
            System.out.println("Incorrecto");
            incorrecto++;
         }
        
        }while(!secuencia.equals(FDE));
        
        System.out.println("INFORME\nSecuencias correctas: " + correcto + "\nSecuencias incorrectas: " + incorrecto);
        
        
    }
    
}
