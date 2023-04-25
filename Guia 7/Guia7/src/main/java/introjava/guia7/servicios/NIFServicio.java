package introjava.guia7.servicios;

import introjava.guia7.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author pichu
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    char[] letranif = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                   
    
    public NIF crearnif(){
        NIF n = new NIF();
        System.out.println("ingrese numero de Dni:");
        n.setDni(leer.nextLong());
               
        return n;
    }
    
    public void mostrar(NIF n){
        int pos;
        pos = (int) (n.getDni() % 23);
        n.setLetra(letranif[pos-1]);
         System.out.println("el NIF es: "+n.getDni()+"-"+ n.getLetra());
    }
}
