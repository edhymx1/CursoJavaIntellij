package system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AgregarPropiedadesDelSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(archivo);
            properties.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            System.setProperties(properties);

            Properties ps = System.getProperties();
            ps.list(System.out);

            System.out.println("\n\n\n");

            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

        } catch (Exception e) {
            System.err.println("no existe el archivo = " + e);
            System.exit(1); // termina la aplicación
        }
    }
}
