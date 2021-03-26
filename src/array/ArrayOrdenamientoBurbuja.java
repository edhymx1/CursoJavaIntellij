package array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOrdenamientoBurbuja {
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

        ordenarBurbujaDesc(productos);

        for (int i = 0; i < total; i++) {
            System.out.println("productos[" + i + "] = " + productos[i]);
            ;
        }

        System.out.println();

        Integer[] numeros = new Integer[5];
        numeros[0] = -78;
        numeros[1] = 3;
        numeros[2] = 99;
        numeros[3] = -1;
        numeros[4] = 8;

        ordenarBurbujaAsc(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" +i + "] = " + numeros[i]);;
        }
    }

    public static void ordenarBurbujaAsc(Object[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0) {
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenarBurbujaDesc(Object[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0) {
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }
}
