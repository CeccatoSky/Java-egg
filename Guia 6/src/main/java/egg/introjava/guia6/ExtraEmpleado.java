
package egg.introjava.guia6;
public class ExtraEmpleado {
    
    private String nombre;
    private int edad;
    private double salario;
    
    private double calcularAumento(int edad, double salario){
        double aumento;
        if(this.edad>=30){
            aumento=(double)(this.salario*10)/100;
            return aumento;
        }else{
            aumento=(double)(this.salario*5)/100;
            return aumento;
        }        
    }    
}
