package basico.string;

public class ValidarString {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        if(esNulo) {
            curso = "Programación JAVA!";
        }

        boolean esVacio = curso.isEmpty();
        if(!esVacio) {
            System.out.println(curso.toUpperCase());
        }
        System.out.println("Bienvenido al curso ".concat(curso));
    }
}
