
package EjereciciosExtra;

import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en etenerse encuanto se detecte alguna
diferencia entre los elementos).
*/
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m;
        
        System.out.println("ingrese la cantidad de elementos del primer vector");
        n = leer.nextInt();
        System.out.println("ingrese la cantidad de elementos del segundo vector");
        m = leer.nextInt();
        
        //carga de vectores
        
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[m];
        //vectores de prueba
        int[]vector = {1,2,3};
        int[]vector3 = {1,2,3};
        
        //carga de vectores
        for(int i=0; i<n; i++){
            vector1[i]=(int)(Math.random()*10);
        }
        for(int i=0; i<m; i++){
            vector2[i]=(int)(Math.random()*10);
        }
        
        //imprimir vectores
        for(int i=0; i<n; i++){
                System.out.print(vector1[i]+" ");
        } 
        
        System.out.println("");
        
        for(int i=0; i<m; i++){
            System.out.print(vector2[i]+" ");
        } 
            System.out.println("");
        //------------------------
        
        if(n!=m){
            System.out.println("los vectores no son iguales");
        }else{
            verificaElemento(vector1, vector2, n);
        }
    }
    
    public static void verificaElemento(int vector[], int vector3[], int n){
        boolean iguales= true;
        for(int i=0; i<n; i++ ){
            if(vector[i]!=vector3[i]){
                System.out.println("los vectores no son iguales");
                iguales = false;
                break;
            }                        
        }if(iguales){
            System.out.println("los vectores son iguales");
        }
    }
}
