
package egg.introjava.mascotapp;

import egg.introjava.mascotapp.entidades.Mascota;
import java.util.Scanner;

public class MascotAPP {

    public static void main(String[] args) {
        System.out.println("Inicio MascotAPP");
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");
        m1.setNombre("Pepe chiquito");
                
        System.out.println(m1.getApodo()+" "+ m1.getEdad()+" "+m1.getTipo()+" "+m1.getColor());
        System.out.println(m1.getNombre());
        m1.pasear(100);
        System.out.println(m1);
        

        
    }
}
