package Array;

import Estudiantes.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author greivin
 */
public class Lista {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    //Guarda en memoria el objeto estudiante
    public void capturarDatos(Estudiante es) {
        listaEstudiantes.add(es);
    }

    //Los enlista y imprime en pantalla
    public void listado() {
        for (Estudiante listaEstudiante : listaEstudiantes) {
            System.out.println(listaEstudiante);
        }
    }

    //Edita el objeto estudiante
    public void editarEstudiante(String buscar, String n, int ed, float no) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getNombre().equalsIgnoreCase(buscar)) {
                e.setNombre(n);
                e.setEdad(ed);
                e.setNota(no);

                System.out.println("Estudiante actualizado ✅");
                break;
            }
        }
    }

    //Elimina uno por uno el objeto.
    public void eliminarEstudiante(String b) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getNombre().equalsIgnoreCase(b)) {
                listaEstudiantes.remove(i);
                
                System.out.println("Estudiante eliminado ✅");
                break; // 👈 para el for apenas elimina uno   
            }
        }
    }
}
