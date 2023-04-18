
package egg.introjava.guia5;

import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

*/

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        int i,j,num;
        double d;
        int[][] vector = new int[4][4];
        int[][] vectorAux = new int[4][4];
        d=(int) (Math.random()*10);
        System.out.println(d);
        
        for (i=0; i<4; i++){
            for(j=0; j<4; j++){
                vector[i][j] = random.nextInt(-5,9);
            }                
        }
        
        for (i=0; i<4; i++){
            for(j=0; j<4; j++){
                vectorAux[j][i] = vector[i][j];
            }            
        }
        
        for (i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(vectorAux[i][j]+" ");
            } 
            System.out.println("");
        }
        System.out.println("----------");
        for (i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(vector[i][j]+" ");
            } 
            System.out.println("");
        }
                
    }
}
