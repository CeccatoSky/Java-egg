
package egg.introjava.guia6;

import java.util.Scanner;

public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    
    public void crearOperacion(){
        System.out.println("ingrese el primer numero");
        setNumero1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        setNumero2(leer.nextInt());
    }
    
    public int sumar(){
        return this.numero1 + this.numero2;
        //return getNumero1()+getNumero2();
    }
    
    public int restar(){
        return this.numero1 - this.numero2;
    }    
    
    public int multiplicar(){
        if(this.numero1==0 || this.numero2==0){
            System.out.println("no se puede multiplicar por CERO");
            return 0;
        }else{
            return this.numero1 * this.numero2;
        }
    }
    
    public double dividir(){
        if (this.numero2==0){
            System.out.println("no se puede hacer una division por CERO");
            return 0;
        }else{
            return (double)this.numero1/this.numero2;
        }        
    }
}
