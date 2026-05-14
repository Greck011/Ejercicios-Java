package Bibliotecas;

import Libros.Libro;
import java.util.ArrayList;

/**
 *
 * @author greiv
 */
public class Biblioteca {

    private final ArrayList<Libro> listaLibros = new ArrayList<>();

    public void datos(Libro libro) {
        listaLibros.add(libro);
    }

    public void listarLibros() {
        for (Libro l : listaLibros) {
            System.out.println(l);
        }
    }

    public void buscarLibro(String ti) {
        for (Libro l : listaLibros) {
            if (l.getTitulo().equalsIgnoreCase(ti)) {
                System.out.println(l);
                return; // para cuando lo encuentra
            }
        }
        
        System.out.println("----------------------");
        System.out.println("❌ Libro no encontrado");
        System.out.println("----------------------");
    }

    public void editarLibro(String editar, String ti, String au, int an, float pr) {
        for (Libro l : listaLibros) {
            if (l.getTitulo().equalsIgnoreCase(editar)) {
                l.setTitulo(ti);
                l.setAutor(au);
                l.setAnio(an);
                l.setPrecio(pr);

                System.out.println("--------------------");
                System.out.println("Libro actualizado ✅");
                System.out.println("--------------------");
                break;
            }
        }
    }

    public void eliminarLibro(String b) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(b)) {
                listaLibros.remove(i);

                System.out.println("------------------");
                System.out.println("Libro eliminado ✅");
                System.out.println("------------------");
                return;
            }
        }
        System.out.println("-------------------");
        System.out.println("Libro no encontrado");
        System.out.println("-------------------");
    }
    
//    public void eliminarLibro(String b) {
//    for (int i = 0; i < listaLibros.size(); i++) {
//        if (listaLibros.get(i).getTitulo().equalsIgnoreCase(b)) {
//            listaLibros.remove(i);
//            System.out.println("------------------");
//            System.out.println("Libro eliminado ✅");
//            System.out.println("------------------");
//            return; // 👈 para todo el método apenas elimina
//        }
//    }
//    // 👈 Si llegó aquí es porque recorrió toda la lista y no lo encontró
//    System.out.println("-------------------");
//    System.out.println("❌ Libro no encontrado");
//    System.out.println("-------------------");
//}
    
}