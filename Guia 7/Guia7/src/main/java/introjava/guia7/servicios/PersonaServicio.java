
package introjava.guia7.servicios;

import introjava.guia7.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author pichu
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Persona persona) {
        return (persona.getEdad() >= 18);
    }

    public Persona crearPersona() {

        Persona persona = new Persona();
        System.out.println("ingrese nombre de la persona:");
        persona.setNombre(leer.nextLine());
        System.out.println("ingrese edad:");
        persona.setEdad(leer.nextInt());
        do {
            System.out.println("ingrese sexo ");
            System.out.println("H para hombre");
            System.out.println("M para mujer");
            System.out.println("O para otro");
            persona.setSexo(leer.next().charAt(0));
            if (persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'M') {
                System.out.println("ingrese opcion correcta");
            }
        } while (!(persona.getSexo() == 'M' || persona.getSexo() == 'H' || persona.getSexo() == 'O'));

        System.out.println("ingrese peso:");
        persona.setPeso(leer.nextDouble());
        System.out.println("ingrese altura:");
        persona.setAltura(leer.nextDouble());

        return persona;
    }

    public int calcularIMC(Persona persona) {
        double imc;
        imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

}
