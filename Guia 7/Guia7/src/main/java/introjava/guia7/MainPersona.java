/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava.guia7;

import introjava.guia7.entidades.Persona;
import introjava.guia7.servicios.PersonaServicio;

/**
 *
 * @author pichu
 */
public class MainPersona {
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
                 
        Persona[] persona = new Persona[4];
        boolean[] mayor = new boolean[4];
        int [] imc = new int[4];
        
        for(int i=0; i<4; i++){
            persona[i] = ps.crearPersona();
            mayor[i] = ps.esMayorDeEdad(persona[i]);
            imc[i] = ps.calcularIMC(persona[i]);
        }
        
        int pIdeal=0;
        int pSobre=0;
        int pDebajo=0;
        int mayores=0;
        
        for(int i=0; i<4; i++){
            if(imc[i]==0){
                pIdeal++;                
            }
            if(imc[i]==1){
                pSobre++;
            }
            if(imc[i]==-1){
                pDebajo++;
            }
            if(mayor[i]==true){
                mayores++;
            }
        }
        
        System.out.println("el porcentaje de personas que tienen su peso ideal es:"+ pIdeal* 100 /persona.length);
        System.out.println("el porcentaje de personas que tienen su peso por debajo del peso ideal es:"+ pDebajo* 100 /persona.length);
        System.out.println("el porcentaje de personas que tienen su peso ideal es:"+ pSobre* 100 /persona.length);
        System.out.println("el porcentaje de personas mayores de edad es: "+ persona.length*100/mayores);
        System.out.println(100+ "el porcentaje de personas menores de edad es: "+ (100-(persona.length*100/mayores)));       
    }
    
}
