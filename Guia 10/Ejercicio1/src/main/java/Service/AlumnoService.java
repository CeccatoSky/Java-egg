
package Service;

import java.util.Scanner;
import java.util.ArrayList;
import Entidades.Alumno;

public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlunmo(int cantidad){
        Alumno a = new Alumno();
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        while(cantidad>0){
            System.out.println("ingrese el nombre del alumno:");
            a.setNombre(leer.nextLine());
            System.out.println("ingrese las 3 notas del alumno");
            for(int i=1;i<=3;i++){
                System.out.println("nota "+i);
                Integer nota=leer.nextInt();
                a.setNotas(nota);
            }
            
            
           
            
        }
        
        
    }
    
}
