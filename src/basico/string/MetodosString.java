package basico.string;

public class MetodosString {
    public static void main(String[] args) {
        String nombre  = "Edgar Jiménez Galicia";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Edgar Jimenez Galicia\") = " + nombre.equals("Edgar Jimenez Galicia"));
        System.out.println("nombre.equalsIgnoreCase(\"EdgaR JiméneZ GaliciA\") = " + nombre.equalsIgnoreCase("EdgaR JiméneZ GaliciA"));
        System.out.println("nombre.compareTo(\"Edgar Jiménez Galicia\") = " + nombre.compareTo("Edgar Jiménez Galicia"));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(4,5) = " + nombre.substring(4,5));
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace('a', 'i'));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"lengua\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"lengua\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"lengua\") = " + trabalenguas.contains("lengua"));
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("          trabalenguas           ");
        System.out.println("          trabalenguas           ".trim());


    }
}
