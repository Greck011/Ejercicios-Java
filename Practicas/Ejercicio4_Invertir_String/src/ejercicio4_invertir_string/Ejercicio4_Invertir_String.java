package ejercicio4_invertir_string;

import java.util.Scanner;

/**
 *
 * @author greivin
 */
public class Ejercicio4_Invertir_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra;
        String invertida = "";

        System.out.print("Digita la palabra a invertir: ");
        palabra = sc.nextLine();

        System.out.println("----------------------------");

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        System.out.println("Palabra Invertida: " + invertida);
        System.out.println("----------------------------");

        if (palabra.equals(invertida)) {
            System.out.println("Es un Palíndromo ✅");
        } else {
            System.out.println("No es un Palíndromo ❌");
        }
        
         System.out.println("----------------------------");
    }
}
