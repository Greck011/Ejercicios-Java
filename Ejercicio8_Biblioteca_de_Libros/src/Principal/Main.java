package Principal;

import Bibliotecas.Biblioteca;
import Libros.Libro;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author greiv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String tituloLibro = "";
        String autorLibro = "";
        int anioLibro = 0;
        float precioLibro = 0;
        byte op = 0;
        char salir = 'N';
        Scanner sc = new Scanner(System.in);
        Libro libro = null;
        Biblioteca biblioteca = new Biblioteca();

        do {
            try {

                System.out.println("*********MENU*********");
                System.out.println("1. Ingresar Libro");
                System.out.println("2. Lista de Libro");
                System.out.println("3. Buscar Libro");
                System.out.println("4. Editar Libro");
                System.out.println("5. Eliminar Libro ");
                System.out.println("6. Salir");
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
                    
                    System.out.println("--------------");
                    System.out.println("INGRSAR LIBROS");
                    System.out.println("--------------");

                    System.out.print("Digite el titulo del libro: ");
                    tituloLibro = sc.nextLine();

                    while (tituloLibro == null || tituloLibro.trim().isEmpty()) {
                        System.out.println("Titulo no asignado");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite el titulo del libro: ");
                        tituloLibro = sc.nextLine();
                    }

                    System.out.println("--------------------------------------------");

                    System.out.print("Digite el autor del libro: ");
                    autorLibro = sc.nextLine();

                    while (autorLibro == null || autorLibro.trim().isEmpty()) {
                        System.out.println("Autor no asignado");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite el autor del libro: ");
                        autorLibro = sc.nextLine();
                    }

                    System.out.println("--------------------------------------------");

                    System.out.print("Digite el año del libro: ");
                    anioLibro = sc.nextInt();

                    while (anioLibro < 1800) {
                        System.out.println("El año del libro no está permitido. Debe ser mayor a 1800 años");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite el año del libro: ");
                        anioLibro = sc.nextInt();
                    }

                    sc.nextLine();
                    System.out.println("--------------------------------------------");

                    System.out.print("Digite el precio del libro: ");
                    precioLibro = sc.nextFloat();

                    while (precioLibro < 0) {
                        System.out.println("El precio debe ser mayor a 0.");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite el precio del libro: ");
                        precioLibro = sc.nextFloat();
                    }

                    sc.nextLine();
                    System.out.println("--------------------------------------------");

                    libro = new Libro(tituloLibro, autorLibro, anioLibro, precioLibro);
                    biblioteca.datos(libro);
                }

                case 2 -> {
                    
                    System.out.println("-----------------");
                    System.out.println("*LISTA DE LIBROS*");
                    
                    System.out.println("------------------------------------------------------");
                    biblioteca.listarLibros();
                    System.out.println("------------------------------------------------------");
                }

                case 3 -> {
                    
                    System.out.println("--------------");
                    System.out.println("*BUSCAR LIBRO*");


                    System.out.print("Digite el titulo a buscar: ");
                    String buscarLibro = sc.nextLine();

                    System.out.println("------------------------------------------------------");
                    biblioteca.buscarLibro(buscarLibro);
                    System.out.println("------------------------------------------------------");
                }

                case 4 -> {

                    System.out.println("--------------");
                    System.out.println("*EDITAR LIBRO*");

                    System.out.print("Digite el titulo del libro a editar: ");
                    String editarLibro = sc.nextLine();
                    System.out.println("-------------------------------");

                    System.out.print("Digite nuevo titulo del libro: ");
                    String nuevoTitulo = sc.nextLine();
                    
                     while (nuevoTitulo == null || nuevoTitulo
                             .trim().isEmpty()) {
                        System.out.println("Titulo no asignado");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite nuevo titulo del libro: ");
                        nuevoTitulo = sc.nextLine();
                    }

                    System.out.println("-------------------------------");
                    System.out.print("Digite nuevo autor del libro: ");
                    String nuevoAutor = sc.nextLine();
                    
                     while (nuevoAutor == null || nuevoAutor.trim().isEmpty()) {
                        System.out.println("Autor no asignado");

                        System.out.println("--------------------------------------------");

                        System.out.print("Digite el nuevo autor del libro: ");
                        nuevoAutor = sc.nextLine();
                    }

                    System.out.println("-------------------------------");
                    System.out.print("Digite nuevo año (si amerita): ");
                    int nuevoAnio = sc.nextInt();

                    while (nuevoAnio < 1800) {
                        System.out.println("El año del libro no está permitido. Debe ser mayor a 1800 años");

                        System.out.println("-------------------------------");

                        System.out.print("Digite nuevo año: ");
                        nuevoAnio = sc.nextInt();
                    }

                    sc.nextLine(); // limpiar buffer
                    System.out.println("-------------------------------");

                    System.out.print("Digite nuevo precio (si amerita): ");
                    float nuevoPrecio = sc.nextFloat();

                    while (nuevoPrecio < 0) {
                        System.out.println("El precio debe ser mayor a 0.");

                        System.out.println("-------------------------------");

                        System.out.print("Digite nuevo precio: ");
                        nuevoPrecio = sc.nextFloat();
                    }
                    sc.nextLine(); // limpiar buffer
                    System.out.println("-------------------------------");

                    biblioteca.editarLibro(editarLibro, nuevoTitulo, nuevoAutor, nuevoAnio, nuevoPrecio);

                    System.out.println("------------------------------------------------------");
                            
                }

                case 5 -> {
                    System.out.println("----------------");
                    System.out.println("*ELIMINAR LIBRO*");
                    System.out.println("----------------");


                    System.out.print("Digite el titulo del libro a eliminar: ");
                    String buscarLibro = sc.nextLine();
                    System.out.println("------------------------------------------------------");

                    biblioteca.eliminarLibro(buscarLibro);

                }

                case 6 -> {

                    System.out.println("---------------------");
                    System.out.println("|*SALIR DEL SISTEMA*|");
                    System.out.println("---------------------");

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
                    System.out.println("------------------------------");
                    System.out.println("|Digite un numero entre 1 y 6|");
                    System.out.println("------------------------------");
                }
            }
        } while (salir == 'N');
        sc.close();

    }
}
