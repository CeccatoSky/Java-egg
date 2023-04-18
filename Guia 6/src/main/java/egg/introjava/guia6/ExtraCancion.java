
package egg.introjava.guia6;
public class ExtraCancion {
    
    private String titulo;
    private String autor;

    public ExtraCancion() {
        this.titulo = "";
        this.autor = "";
    }

    public ExtraCancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }            
}
