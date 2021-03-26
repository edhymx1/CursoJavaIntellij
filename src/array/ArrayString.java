package array;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64G";
        productos[1] = "Samsung Galaxy J5";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Laptop";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta G";
        productos[6] = "SmartWatch";

        System.out.println();

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        System.out.println();

        int total = productos.length;
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

        System.out.println();

        System.out.println("----- Usando for inverso -----");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) + " valor " + productos[total - 1 - i]);
        }

        System.out.println();

        System.out.println("----- Usando for inverso 2-----");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

        System.out.println();

        System.out.println("----- Usando foreach -----");
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }


    }
}
