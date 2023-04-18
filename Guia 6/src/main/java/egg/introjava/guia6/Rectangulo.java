
package egg.introjava.guia6;

/*VER
La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario 
*/
public class Rectangulo {
    
    private double base;
    private double altura;
    
    //Operacion o1 = new Operacion();

    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = Circunferencia.radio;//prueba con clase circunferencia
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public double superficie(){
        return this.base * this.altura;
    }
    
    public double perimetro(){
        return(superficie()*2);
    }
    
    
}
