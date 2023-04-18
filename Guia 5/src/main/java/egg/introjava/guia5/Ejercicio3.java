
package egg.introjava.guia5;

import java.util.Random;
import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        int n,i,digito;
        int numero=152;//prueba digitos
        
        System.out.println("ingrese el tamño del vector");
        n = leer.nextInt();
        
        int[] vector = new int [n];        
        for(i=0; i<n; i++){
            vector[i] = random.nextInt(99999);
            
        }
        //se puede hacer dentro del primer for
        for (i=0; i<n; i++){
            System.out.println("el numero "+vector[i]+" tiene "+digitos(vector[i])+" digitos");
        }
        //prueba digitos
        //System.out.println(digitos(numero));
        
    }
    
    public static int digitos(int num){
        int div=10;
        int digito=0;
        int resultado;
        do{
            resultado = num/div;
            digito= digito+1;
            div = div*10;
        }while(resultado>=1);
        
        return digito;
    }
    
}
