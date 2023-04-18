
package egg.introjava.guia6;
public class ExtraCuenta {
    
    public String titular;
    public int saldo;
    
    public void retirarDinero(int monto){
        if(this.saldo<monto){
            System.out.println("No se puede retirar");
        }else{
            this.saldo -=monto;
        }
    }
    
}
