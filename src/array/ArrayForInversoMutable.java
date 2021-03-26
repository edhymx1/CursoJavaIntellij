package array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayForInversoMutable {
    public static void main(String[] args) {
        String[] productos = {
                "Kingston Pendrive 64G",
                "Samsung Galaxy J5",
                "Disco Duro SSD Samsung Externo",
                "Asus Laptop",
                "Macbook Air",
                "Chromecast 4ta G",
                "SmartWatch"
        };

        int total = productos.length;

        System.out.println("Ordenando...");
        Arrays.sort(productos);

        System.out.println("----- Usando for -----");
        for (int i = 0; i < total; i++) {
            System.out.println("productos[" +i + "] = " + productos[i]);;
        }

        System.out.println();

        System.out.println("----- Array inverso -----");
        arregloInverso(productos);

        for (int i = 0; i < total; i++) {
            System.out.println("productos[" +i + "] = " + productos[i]);;
        }

        /*System.out.println();
        System.out.println("----- inverso con Collections -----");
        Collections.reverse(Arrays.asList(productos));
        for (int i = 0; i < total; i++) {
            System.out.println("productos[" +i + "] = " + productos[i]);;
        }*/
    }

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total/2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 -i] = actual;
        }
    }
}
