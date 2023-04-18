
package egg.introjava.guia6;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    
    public static double radio; //prueba en clase rectangulo

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(){
        this.setRadio(leer.nextDouble());
    }
    
    public double area(){
        return (3.14*this.radio)*(3.14*this.radio);
    }
    
    public double perimetro(){
        return 2*3.14*this.radio;
    }
}
