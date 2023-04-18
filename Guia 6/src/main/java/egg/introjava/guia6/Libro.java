
/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
*/
package egg.introjava.guia6;

import java.util.Scanner;

public class Libro {
    
    Scanner leer = new Scanner(System.in);
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas; 

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }   

    public Libro() {
    }    
    
    public void carga(){
        System.out.println("ingrese isbn");
        this.ISBN = leer.nextInt();
        System.out.println("ingrese titulo");
        this.titulo = leer.nextLine();
        this.titulo = leer.nextLine();
        System.out.println("ingrese autor");
        this.autor = leer.nextLine();
        System.out.println("ingrese numero");
        this.numeroPaginas = leer.nextInt();        
    }

    public void muestra(){
        System.out.println("numero de ISBN: "+this.ISBN);
        System.out.println("titulo: "+this.titulo);
        System.out.println("autor: "+this.autor);
        System.out.println("cantidad de paginas: "+this.numeroPaginas);
    }   
}