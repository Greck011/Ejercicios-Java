package Datos;

/**
 *
 * @author greivin
 */
public class Dato {

    private float datoUno;
    private float datoDos;
    private float resultado;
    private char operador;

    public Dato(float datoUno, float datoDos, float resultado, char operador) {
        this.datoUno = datoUno;
        this.datoDos = datoDos;
        this.resultado = resultado;
        this.operador = operador;
    }

    public float getDatoUno() {
        return datoUno;
    }

    public void setDatoUno(float datoUno) {
        this.datoUno = datoUno;
    }

    public float getDatoDos() {
        return datoDos;
    }

    public void setDatoDos(float datoDos) {
        this.datoDos = datoDos;
    }
    
    public float getResultado(){
        return resultado;
    }
    
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return datoUno + " " + operador + " " + datoDos + " = " + resultado;
    }
       
}