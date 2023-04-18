
package egg.introjava.guia5;
/*
revisar para hacer mas generico
-carga aleatoria
-funcion para calcular elementos de matriz
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i,j,k=0;
        int cantidadElem =0;
        int [][] matriz = {{1,2,4},{2,0,2},{-4,-2,0}};//carga manual
        int [][] matrizTras = new int [3][3];
        
        // traspuesta
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                matrizTras[j][i] = matriz[i][j];
                cantidadElem = cantidadElem+1;
            }            
        }
        
        //para ver
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            } 
            System.out.println("");
        }
        System.out.println("----------");
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(matrizTras[i][j]+" ");
            } 
            System.out.println("");
        }
        
        //antisimetrica
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(-(matriz[i][j])==(matrizTras[i][j])){
                    k=k+1;
                }            
            }
        }
        if(cantidadElem==k){
            System.out.println("matriz antisimetrica");
        }else{
            System.out.println("no es matriz antisimetrica");
        }        
    }    
}
