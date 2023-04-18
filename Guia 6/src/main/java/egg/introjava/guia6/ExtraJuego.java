/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package egg.introjava.guia6;

import java.util.Scanner;

public class ExtraJuego {

    Scanner leer = new Scanner(System.in);

    private int numero;
    private int numeroAdivina;
    private int maxIntentos;
    public int cantidadJuegos;
    public int cantPerdidos;
    public int cantGanados;
    int intentos;
    
    

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroAdivina() {
        return numeroAdivina;
    }

    public void setNumeroAdivina(int numeroAdivina) {
        this.numeroAdivina = numeroAdivina;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getCantidadJuegos() {
        return cantidadJuegos;
    }

    public void setCantidadJuegos(int cantidadJuegos) {
        this.cantidadJuegos = cantidadJuegos;
    }

    public int getCantPerdidos() {
        return cantPerdidos;
    }

    public void setCantPerdidos(int cantPerdidos) {
        this.cantPerdidos = cantPerdidos;
    }

    public int getCantGanados() {
        return cantGanados;
    }

    public void setCantGanados(int cantGanados) {
        this.cantGanados = cantGanados;
    }

    public ExtraJuego() {
        cantidadJuegos = 0;
        cantPerdidos = 0;
        cantGanados = 0;
    }

    public void comienzaJuego() {
        System.out.println("elija un numeroa ADIVINAR");
        numero = leer.nextInt();
        System.out.println("Intentos?");
        maxIntentos = leer.nextInt();
        intentos = 0;        
    }
    
    public void incrementaPartida(){
        cantidadJuegos++;
    }

    public boolean jugar() {        
        if (intentos < maxIntentos) {
            System.out.println("Adivine el numero");
            numeroAdivina = leer.nextInt();
            descuentaIntentos();            
            if (compara()) {
                return true;
            }
        } else {
            System.out.println("se terminaron los intentos");
            cantPerdidos++;
            return true;
        }        
        return false;
    }

    public void descuentaIntentos() {
        intentos++;
    }

    public boolean compara() {
        if (numero == numeroAdivina) {
            System.out.println("EXITO!");
            cantGanados += 1;
            System.out.println("adivinaste en el intento " + intentos);
            return true;//ver llamado en main
        } else if (numero < numeroAdivina) {
            System.out.println("mas chico...");      
            return false;
        } else {
            System.out.println("mas grande...");
            return false;
        }
    }
}