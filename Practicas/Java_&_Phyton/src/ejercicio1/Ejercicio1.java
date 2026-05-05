package ejercicio1;

import java.util.*;

/**
 *
 * @author greiv
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Object> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(5);

        array.add(lista);

        System.out.println(array);
        System.out.println(array.size());

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Procesador");
        arrayList.add("RAM");
        arrayList.add("SSD");
        arrayList.add("Tarjeta Madre");
        arrayList.add("Tarjeta Grafica");
        arrayList.add("Fuente de Poder");
        arrayList.add("Case");
        arrayList.add("Monitor");

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        System.out.println("********************************************************************************************");

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

// Agregar una sublista como un solo elemento (igual que append en Python)
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(4);
        sub.add(5);
        arr.add(sub); // Aqui agrega [4,5] como UN elemento

        System.out.println(arr.size()); // imprime 4

    }
}
