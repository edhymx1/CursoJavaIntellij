package system;

import java.io.IOException;

public class EjecutarProgramaSO {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            String osName = System.getProperty("os.name").toLowerCase();
            if(osName.contains("windows")) {
                proceso = rt.exec("notepad");
            }
            else if(osName.contains("mac")) {
                proceso = rt.exec("textedit");
            }
            else if(osName.contains("nix") || osName.contains("nux")) {
                proceso = rt.exec("gedit");
            }
            else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }
        catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }

}
