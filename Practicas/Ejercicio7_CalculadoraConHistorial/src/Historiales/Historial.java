package Historiales;

import Datos.Dato;
import java.util.ArrayList;

/**
 *
 * @author greivin
 */
public class Historial {
    
    ArrayList<Dato> historial = new ArrayList<>();
    
    public void capturarDatos(Dato dato){
        historial.add(dato);
    }
    
    public void historialOperaciones(){
        for(Dato d : historial){
            System.out.println(d);
        }
    }
}
