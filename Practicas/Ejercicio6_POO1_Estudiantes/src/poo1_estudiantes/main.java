package poo1_estudiantes;

import Array.Lista;
import Estudiantes.Estudiante;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author greivin
 */
public class main {

    public static void main(String[] args) {

        String nombreEst = "";
        int edadEst = 0;
        float notaEst = 0;
        byte op = 0;
        char salir = 'N';
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = null;
        Lista lista = new Lista();

        do {
            try {

                System.out.println("*********MENU*********");
                System.out.println("1. Ingresar Estudiante");
                System.out.println("2. Lista Estudiantes");
                System.out.println("3. Editar Estudiante");
                System.out.println("4. Eliminar Estudiante ");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                op = sc.nextByte();
                sc.nextLine();
                System.out.println("*********************");

            } catch (InputMismatchException i) {
                System.out.println("\n❌ Solo se permiten numeros enteros");
                sc.nextLine();
                op = 0;
            }

            switch (op) {
                case 1 -> {
                    System.out.println("\n");
                    System.out.println("INGRSAR ESTUDIANTES");
                    System.out.println("--------------------------------------------");

                    System.out.print("Digite el nombre del Estudiante: ");
                    nombreEst = sc.nextLine();

                    while (nombreEst == null || nombreEst.trim().isEmpty()) {
                        System.out.println("Nombre no asignado");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite el nombre del Estudiante: ");
                        nombreEst = sc.nextLine();
                    }

                    System.out.println("--------------------------------------------");

                    System.out.print("Digite la edad del Estudiante: ");
                    edadEst = sc.nextInt();

                    while (edadEst < 12) {
                        System.out.println("Edad no permitida. Debe ser mayor a 12 anos");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite la edad del Estudiante: ");
                        edadEst = sc.nextInt();
                    }

                    sc.nextLine();
                    System.out.println("--------------------------------------------");

                    System.out.print("Digite la nota del Estudiante: ");
                    notaEst = sc.nextFloat();

                    while (notaEst < 0 || notaEst > 10) {
                        System.out.println("La nota debe de comprender entre 0 y 10.");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite la nota del Estudiante: ");
                        notaEst = sc.nextFloat();
                    }

                    sc.nextLine();
                    System.out.println("--------------------------------------------");

                    estudiante = new Estudiante(nombreEst, edadEst, notaEst);
                    lista.capturarDatos(estudiante);
                }

                case 2 -> {
                    System.out.println("*LISTA DE ESTUDIANTES*");
                    System.out.println("------------------------------------------------------");
                    lista.listado();
                    System.out.println("------------------------------------------------------");
                }

                case 3 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*EDITAR ESTUDIANTE*");

                    System.out.println("------------------------------------------------------");
                    lista.listado();
                    System.out.println("------------------------------------------------------");

                    System.out.print("Digite el nombre del estudiante a editar: ");
                    String buscar = sc.nextLine();
                    System.out.println("-------------------------------");

                    System.out.print("Digite nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();

                    while (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                        System.out.println("Nombre no asignado");

                        System.out.println("-------------------------------");

                        System.out.print("Digite nuevo nombre: ");
                        nuevoNombre = sc.nextLine();
                    }

                    System.out.println("-------------------------------");
                    System.out.print("Digite nueva edad: ");
                    int nuevaEdad = sc.nextInt();

                    while (nuevaEdad < 12) {
                        System.out.println("Edad no permitida. Debe ser mayor a 12 anos");

                        System.out.println("-------------------------------");

                        System.out.print("Digite nueva edad: ");
                        nuevaEdad = sc.nextInt();
                    }

                    sc.nextLine(); // limpiar buffer
                    System.out.println("-------------------------------");

                    System.out.print("Digite nueva nota: ");
                    float nuevaNota = sc.nextFloat();

                    while (nuevaNota < 0 || nuevaNota > 10) {
                        System.out.println("La nota debe de comprender entre 0 y 10.");

                        System.out.println("-------------------------------");

                        System.out.print("Digite nueva nota: ");
                        nuevaNota = sc.nextFloat();
                    }
                    sc.nextLine(); // limpiar buffer
                    System.out.println("-------------------------------");

                    lista.editarEstudiante(buscar, nuevoNombre, nuevaEdad, nuevaNota);

                    System.out.println("------------------------------------------------------");
                    lista.listado();
                    System.out.println("------------------------------------------------------");
                }

                case 4 -> {
                    System.out.println("-------------------------------");
                    System.out.println("*ELIMINAR ESTUDIANTE*");

                    System.out.println("------------------------------------------------------");
                    lista.listado();
                    System.out.println("------------------------------------------------------");

                    System.out.print("Digite el nombre del estudiante a eliminar: ");
                    String buscar = sc.nextLine();
                    System.out.println("------------------------------------------------------");

                    lista.eliminarEstudiante(buscar);

                    System.out.println("------------------------------------------------------");
                    lista.listado();
                    System.out.println("------------------------------------------------------");

                }

                case 5 -> {

                    System.out.println("-------------------------------");
                    System.out.println("*SALIR DEL SISTEMA*");

                    System.out.println("¿Desea Salir? (S/N)");
                    salir = sc.next().charAt(0);

                    if (salir == 'S') {
                        System.out.println("Ejecucion Finalizada...");
                        break;

                    } else if (salir == 'N') {
                        System.out.println("Regresando al Menu...");

                    } else {

                        while (salir != 'S' && salir != 'N') {
                            System.out.println("❌ Opcion Invalida. Use (S/N)");
                            System.out.println("-------------------------------");
                            System.out.println("¿Desea Salir? (S/N)");
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
