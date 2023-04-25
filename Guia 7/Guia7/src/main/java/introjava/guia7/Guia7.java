
package introjava.guia7;

import introjava.guia7.entidades.CuentaBancaria;
import introjava.guia7.servicios.CuentaBancariaServicios;
import java.util.Scanner;


/**
 *
 * @author pichu
 */
public class Guia7{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");                
        int opcion;
        char respuesta='A';
        System.out.println("Ejercicio 1");
        
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        
        CuentaBancaria cuenta1 = cbs.crearCuenta();
        
        do{
            //System.out.println("2- CREAR CUENTA");
            System.out.println("1- INGRESAR DINERO");
            System.out.println("4- RETIRAR DINERO");
            System.out.println("3- EXTRACCION RAPIDA");
            System.out.println("4- CONSULTAR SALDO");
            System.out.println("5- MOSTRAR DATOS");
            System.out.println("6- SALIR");
            opcion = leer.nextInt();
            switch(opcion){
                case 1: cbs.ingresar(cuenta1);
                    break;
                case 2: cbs.retirar(cuenta1);
                    break;
                case 3: cbs.retiroRapido(cuenta1);
                    break;
                case 4: cbs.consultarSaldo(cuenta1);
                    break;
                case 5: cbs.consultarDatos(cuenta1);
                    break;
                case 6: System.out.println("S para confirmar");
                        respuesta=leer.next().charAt(0);
                    break;
                default: System.out.println("no se reconoce la opcion");
            }
            
        }while((respuesta!='S'));
            
        
    }
}
