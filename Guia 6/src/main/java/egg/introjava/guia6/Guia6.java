package egg.introjava.guia6;//del ejercicio 3 extra

import java.util.Random;
import java.util.Scanner;

public class Guia6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Random random = new Random();
        ExtraJuego juego1 = new ExtraJuego();
        String seguir;

        // int seleccion;
        do {
            System.out.println("JUEGO ADIVINA NUMERO");
            System.out.println("empieza el juego");
            juego1.comienzaJuego();// comienza ingresa el numero y la canty de intentos

            //comienza a adivinar
            while (!juego1.jugar()){         

            }
            juego1.incrementaPartida();
            System.out.println("quiere seguir jugando? S/N");
            seguir=leer.next();

            if(seguir.toUpperCase().equals("N")){
               break;                
            } 
        } while (true);
        System.out.println("Partidas Jugadas: "+juego1.cantidadJuegos);
        System.out.println("Partidas Ganadas: "+juego1.cantGanados);
        System.out.println("Partidas Perdidas: "+juego1.cantPerdidos);

    }
}
