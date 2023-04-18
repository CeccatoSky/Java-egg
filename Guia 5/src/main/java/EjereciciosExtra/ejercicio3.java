
package EjereciciosExtra;

import java.util.Random;
import java.util.Scanner;

/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector
*/
public class ejercicio3 {
    private static Random random = new Random();
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n,m,fila, columna;
        
        System.out.println("vamos a cargar una matriz con numeros aleatorios");
        
        System.out.println("ingrese la cantidad de filas de la matriz");
        n=leer.nextInt();
        System.out.println("ingrese la cantidad de columnas");
        m=leer.nextInt();
        
        int[][] matriz = new int[n][m];
       
        carga(matriz);
        imprimir(matriz);        
    }
    
    public static void carga(int matriz[][]){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                //matriz[i][j]=(int)(Math.random()*10-10);
                matriz[i][j]= random.nextInt(-10,10);
                
                
            }
        }
    }
    public static void imprimir(int matriz[][]){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println(" ");
        }
    }
}
