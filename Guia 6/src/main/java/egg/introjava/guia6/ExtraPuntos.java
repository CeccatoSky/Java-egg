
package egg.introjava.guia6;

import java.util.Scanner;

public class ExtraPuntos {
    Scanner leer = new Scanner(System.in);
    
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public ExtraPuntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }    
    
    public void crearPuntos(){
        System.out.println("creamos un punto?");
        System.out.println("ingrese la coordenada x:");
        this.x1 = leer.nextInt();
        System.out.println("ingrese la coordenada y:");
        this.y1 = leer.nextInt();
        System.out.println("creamos otro punto?");
        System.out.println("ingrese la coordenada x:");
        this.x2 = leer.nextInt();
        System.out.println("ingrese la coordenada y:");
        this.y2 = leer.nextInt();
    }
    public double calcula(){
        return Math.sqrt((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
    }
    
}
