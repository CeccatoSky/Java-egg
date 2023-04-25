
package introjava.guia7;

import introjava.guia7.entidades.NIF;
import introjava.guia7.servicios.NIFServicio;

/**
 *
 * @author pichu
 */
public class MainNif {
    public static void main(String[] args) {
       
        
        NIFServicio ns = new NIFServicio();
        NIF n = ns.crearnif();
        
        ns.mostrar(n);
        
    }
    
}
