package Estudiantes;

/**
 *
 * @author greivin
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private float nota;

    public Estudiante(String nombre, int edad, float nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante {");
        sb.append("nombre = ").append(nombre);
        sb.append(", edad = ").append(edad);
        sb.append(", nota = ").append(nota);
        sb.append('}');
        return sb.toString();
    }
}
