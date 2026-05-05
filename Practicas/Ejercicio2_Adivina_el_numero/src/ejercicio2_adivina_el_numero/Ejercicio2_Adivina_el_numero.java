package ejercicio2_adivina_el_numero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author greiv
 */
public class Ejercicio2_Adivina_el_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        byte MIN = 1;
        byte MAX = 100;
        int numeroAdivinar = 0;
        byte numeroJugador = 0;
        byte intentos = 0;
        boolean adivinado = false;
        Random random = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("*****BIENVENIDO AL JUEGO ADIVINA EL NUMERO*****");
            System.out.println("Hay que adivinar un numero entre el " + MIN + " y el " + MAX);

            numeroAdivinar = random.nextInt(MAX - MIN + 1) + MIN;

            while (!adivinado) {
                System.out.print("Adivina el numero: ");
                try {
                    numeroJugador = sc.nextByte();
                    intentos++;

                    if (numeroJugador < numeroAdivinar) {
                        System.out.println("------------------------");
                        System.out.println("❌ El número es Mayor...");
                        System.out.println("------------------------");
                    } else if (numeroJugador > numeroAdivinar) {
                        System.out.println("------------------------");
                        System.out.println("❌ El número es Menor...");
                        System.out.println("------------------------");
                    } else {
                        adivinado = true;
                        System.out.println();
                        System.out.println("----------------------------");
                        System.out.println("✅ Numero Adivinado: " + numeroAdivinar);
                        System.out.println("----------------------------");
                        System.out.println(intentos + " Intentos...");
                        System.out.println("----------------------------");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Entrada inválida. Por favor, introduce un número entero.");
                    sc.next(); // Limpiar entrada inválida
                }
            }
        }
    }
}
