

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.
*/

public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<String> raza = new ArrayList<>();
        String resp="si";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        while(resp.equalsIgnoreCase("si")){
            System.out.println("ingrese una raza de perro");
            raza.add(leer.next());
            System.out.println("desea agregar otra raza de perro?");
            resp=leer.next();
        }
        
        System.out.println(raza);
        /*
    Continuando el ejercicio anterior, después de mostrar los perros, 
    al usuario se le pedirá un perro y se recorrerá la lista con un Iterator,
    se buscará el perro en la lista. Si el perro está en la lista, se eliminará
    el perro que ingresó el usuario y se mostrará la lista ordenada.
    Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada
    */
        System.out.println("");
        System.out.println("-------ejercicio 2---------");
        System.out.println("");
        System.out.println("ingrese una raza de perro a buscar en la lista");
        String busca=leer.next();
        
        Iterator iterator = raza.iterator();
        
        while(iterator.hasNext()){
            if(iterator.next().equals(busca)){
                iterator.remove();                
            }
        }
        System.out.println(raza);
        
    }   
}


