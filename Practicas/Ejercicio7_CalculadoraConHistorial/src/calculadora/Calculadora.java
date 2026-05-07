package calculadora;

import Datos.Dato;
import Historiales.Historial;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author greiv
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char salir = 'N';
        byte op = 0;
        float dato1 = 0;
        float dato2 = 0;
        float total = 0;
        Scanner sc = new Scanner(System.in);
        Dato datos = null;
        Historial historial = new Historial();

        do {
            try {
                System.out.println("*******MENU******");
                System.out.println("1. SUMA");
                System.out.println("2. RESTA");
                System.out.println("3. DIVISION");
                System.out.println("4. MULTIPLICACION");
                System.out.println("5. HISTORIAL");
                System.out.println("6. SALIR");
                System.out.println("*****************");
                System.out.print("Digite una opcion: ");
                op = sc.nextByte();
                sc.nextLine();
            } catch (InputMismatchException i) {
                System.out.println("\n❌ Solo se permiten numeros enteros");
                sc.nextLine();
                op = 0;
            }

            switch (op) {
                case 1 -> {

                    System.out.println("-------------------------------");
                    System.out.println("*SUMA*");
                    System.out.print("Digite el primer numero: ");
                    dato1 = sc.nextFloat();

                    System.out.print("Digite el sedundo numero: ");
                    dato2 = sc.nextFloat();

                    total = (dato1 + dato2);
                    System.out.println(dato1 + " + " + dato2 + " = " + total);

                    datos = new Dato(dato1, dato2, total,'+');
                    historial.capturarDatos(datos);

                    System.out.println("-------------------------");
                }

                case 2 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*RESTA*");
                    System.out.print("Digite el primer numero: ");
                    dato1 = sc.nextFloat();;

                    System.out.print("Digite el sedundo numero: ");
                    dato2 = sc.nextFloat();

                    total = (dato1 - dato2);
                    System.out.println(dato1 + " - " + dato2 + " = " + total);

                    datos = new Dato(dato1, dato2, total,'-');
                    historial.capturarDatos(datos);

                    System.out.println("-------------------------");
                }

                case 3 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*DIVISION*");
                    System.out.print("Digite el primer numero: ");
                    dato1 = sc.nextFloat();

                    System.out.print("Digite el sedundo numero: ");
                    dato2 = sc.nextFloat();

                    if (dato1 == 0 || dato2 == 0) {
                        System.out.println("❌ Error al intentar dividir entre cero");
                    } else {
                        total = (dato1 / dato2);
                        System.out.println(dato1 + " / " + dato2 + " = " + total);
                    }

                    datos = new Dato(dato1, dato2, total,'/');
                    historial.capturarDatos(datos);

                    System.out.println("-------------------------");
                }

                case 4 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*MULTIPLICACION*");
                    System.out.print("Digite el primer numero: ");
                    dato1 = sc.nextFloat();

                    System.out.print("Digite el sedundo numero: ");
                    dato2 = sc.nextFloat();

                    total = (dato1 * dato2);
                    System.out.println(dato1 + " * " + dato2 + " = " + total);

                    datos = new Dato(dato1, dato2, total, '*');
                    historial.capturarDatos(datos);

                    System.out.println("-------------------------");
                }

                case 5 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*HISTORIAL*");

                    System.out.println("-------------------------------");
                    historial.historialOperaciones();
                    System.out.println("-------------------------------");
                }

                case 6 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*SALIR DEL SISTEMA*");

                    System.out.println("¿Desea Salir? (S/N)");
                    salir = sc.next().charAt(0);

                    if (salir == 'S') {
                        System.out.println("Ejecucion Finalizada...");
                        System.out.println("-----------------------");
                        break;

                    } else if (salir == 'N') {
                        System.out.println("Regresando al Menu...");
                        System.out.println("---------------------");

                    } else {
                        while (salir != 'S' && salir != 'N') {
                            System.out.println("❌ Opcion Invalida. Use (S/N)");
                            System.out.println("-------------------------------");
                            System.out.println("¿Desea Salir o Regresar al menu? (S/N)");
                            salir = sc.next().charAt(0);
                        }
                    }
                }
                
                default -> {
                    System.out.println("----------------------------");
                    System.out.println("Digite un numero entre 1 y 5");
                    System.out.println("----------------------------");
                }
            }
        } while (salir == 'N');
        sc.close();
    }
}
