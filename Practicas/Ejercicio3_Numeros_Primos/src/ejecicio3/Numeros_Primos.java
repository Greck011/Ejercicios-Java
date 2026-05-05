package ejecicio3;

import java.util.Scanner;

/**
 *
 * @author greivin
 */
public class Numeros_Primos {

    public static boolean esPrimo(int num) {

        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        byte op = 0;
        char salir = 'N';

        do {
            System.out.println("--------------------------------------------------");
            System.out.print("Digite un numero para averiguar si es Primo o no: ");
            n = sc.nextInt();
            System.out.println("--------------------------------------------------");

            if (n < 2) {
                System.out.println(n + " es menor a 2, no puede ser primo");
            } else if (esPrimo(n)) {
                System.out.println(n + " es primo ✅");
            } else {
                System.out.println(n + " no es primo ❌");
            }

            System.out.println("-------------------------");
            System.out.println("¿Desea salir? (S/N)");
            salir = sc.next().charAt(0);

            if (salir == 'S') {
                System.out.println("Saliendo...");
                System.out.println("-------------------------------\n");
                break;

            } else if (salir == 'N') {
                System.out.println("Seguimos...");
                continue;

            } else {
                while (salir != 'S' && salir != 'N') {
                    System.out.println("❌ Opcion Invalida. Use (S/N)");
                    System.out.println("-------------------------------");
                    System.out.println("¿Desea Salir? (S/N)");
                    salir = sc.next().charAt(0);
                }
            }
            
            sc.close();
        } while (salir == 'N');
    }
}
