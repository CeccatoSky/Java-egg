
package egg.introjava.guia6;
public class ExtraRectangulo {
    
    public int lado1;
    public int lado2;

    public ExtraRectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }   
    
    public int calcularArea(){
        return this.lado1 * this.lado2;
    }
    
}
