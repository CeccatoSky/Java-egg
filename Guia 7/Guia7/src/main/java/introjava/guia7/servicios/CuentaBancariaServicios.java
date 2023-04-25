
package introjava.guia7.servicios;

import introjava.guia7.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:

b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
public class CuentaBancariaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
 //a) Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("ingrese un numero de cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese un numero de DNI:");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("ingrese un saldo para la cuenta:");
        cuenta.setSaldoActual(leer.nextDouble());
        
        return cuenta;
        
    }
    
    public void ingresar(CuentaBancaria cuenta){
        System.out.println("ingrese cantidad de dinera a ingresar:");
        cuenta.setSaldoActual(cuenta.getSaldoActual()+leer.nextDouble());       
        
    }
    
    public void retirar(CuentaBancaria cuenta){
        System.out.println("ingrese el monto a retirar");
        double monto = leer.nextDouble();
        if(cuenta.getSaldoActual()>monto){
            cuenta.setSaldoActual(cuenta.getSaldoActual()- monto);
        }else{
            cuenta.setSaldoActual(0);
        }       
    }
    
    public void retiroRapido(CuentaBancaria cuenta){
        System.out.println("saca el 20%" + cuenta.getSaldoActual()*0.2);
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("el saldo es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("el numero de cuenta es: "+ cuenta.getNumeroCuenta());
        System.out.println("el numero de Dni es: "+ cuenta.getDniCliente());
        System.out.println("el saldo de la cuenta es: "+ cuenta.getSaldoActual());
    }
}
