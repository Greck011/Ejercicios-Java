package Libros;

/**
 *
 * @author greiv
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anio;
    private float precio;

    public Libro(String titulo, String autor, int anio, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("Titulo = ").append(titulo);
        sb.append(", autor = ").append(autor);
        sb.append(", año = ").append(anio);
        sb.append(", precio = ₡").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
