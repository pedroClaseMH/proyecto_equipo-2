package es.zabala;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== JUEGO: ADIVINA EL NUMERO ===");
        System.out.println("He pensado un numero entre 1 y 50");
        System.out.println("Puedes adivinarlo?\n");
        
        int numeroSecreto = random.nextInt(50) + 1;
        int intentos = 0;
        int maxIntentos = 7;
        boolean acertado = false;
        
        // Bucle principal del juego
        while (intentos < maxIntentos && !acertado) {
            System.out.print("Intento " + (intentos + 1) + "/" + maxIntentos + " - Tu numero: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;
            
            if (numeroUsuario == numeroSecreto) {
                acertado = true;
                System.out.println("FELICIDADES! Acertaste en " + intentos + " intentos!");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta con un numero mas alto.\n");
            } else {
                System.out.println("Demasiado alto. Intenta con un numero mas bajo.\n");
            }
        }
        
        // Si no acerto, mostrar el numero
        if (!acertado) {
            System.out.println("\nGame Over. El numero era: " + numeroSecreto);
        }
        
        // Mostrar estadisticas
        System.out.println("\n--- Estadisticas ---");
        for (int i = 1; i <= intentos; i++) {
            System.out.print("* ");
        }
        System.out.println("\nUsaste " + intentos + " de " + maxIntentos + " intentos");
        
        scanner.close();
    }
}