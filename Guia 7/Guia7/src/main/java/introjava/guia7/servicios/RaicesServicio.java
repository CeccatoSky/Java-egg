package introjava.guia7.servicios;

import introjava.guia7.entidades.Raices;

/**
 *
 * @author pichu
 */
public class RaicesServicio {

    Raices r = new Raices();

    public double getDiscriminante(Raices r) {
        return (Math.pow(r.getCoeficienteb(), 2) - 4 * r.getCoeficienteA() * r.getCoeficienteC());
    }

    public boolean tieneRaices() {
        return (getDiscriminante(r) >= 0);
    }

    public boolean tieneRaiz() {
        return (getDiscriminante(r) == 0);
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("imprime las dos soluciones: ");
        }
    }
    
    public void obtenerRaiz(){
        if (tieneRaiz()){
            System.out.println("imprime una sola raiz");
        }
    }
    
    public void calcular(){
        if (tieneRaices()){
            
        }
       
    }
}
/*
public void obtenerRaices(){
        if(this.tieneRaices()){
            double x1 = (-raices.getB() + Math.sqrt(raices.getDeterminante())) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(raices.getDeterminante())) / (2 * raices.getA());
            System.out.println("La primera x es: " + x1);
            System.out.println("La segunda x es: " + x2);
        }
    }
    
    public void obtenerRaiz(){
        if (this.tieneRaiz()) {
            double x3 = (-raices.getB()) / (2 * raices.getA());
            System.out.println("La unica x posible es: " + x3);
        }
    }
    
    public void calcular(int a, int b, int c){
        this.getDiscriminante(a, b, c);
        if (this.tieneRaices()) {
            this.obtenerRaices();
        } else if (this.tieneRaiz()){
            this.obtenerRaiz();
        } else {
            System.out.println("No existe solucion entre los reales");
        }
    }
}
*/