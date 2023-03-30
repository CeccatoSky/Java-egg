
package egg.introjava.guia3;

public class Extra2 {
    public static void main(String[] args) {
        
    int A = 2;   
    int B = 5;
    int C = 7;
    int D = 9;
    int aux = 0;
    System.out.println("El numero A es: " + A);
    System.out.println("El numero B es: " + B);
    System.out.println("El numero C es: " + C);
    System.out.println("El numero D es: " + D);
    System.out.println(" ");
    aux = B;
    B = C;
    C = A;
    A = D;
    D = aux;
    System.out.println("El numero A es: " + A);
    System.out.println("El numero B es: " + B);
    System.out.println("El numero C es: " + C);
    System.out.println("El numero D es: " + D);
    
        
    }
    
}
