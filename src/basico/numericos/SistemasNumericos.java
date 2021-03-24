package basico.numericos;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericos {
    public static void main(String[] args) {

        //test01();
        //test02(args);
        test03(args);

    }

    public static void test01() {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numéro binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }

    public static void test02(String[] args) {
        String numeroDecimalString = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroDecimalString);
        }
        catch (NumberFormatException se) {
            JOptionPane.showMessageDialog(null, "Error! Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "numéro binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario + "\n" + mensajeOctal + "\n" + mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void test03(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");

        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Error! Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "Numéro binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario + "\n" + mensajeOctal + "\n" + mensajeHexadecimal;

        System.out.println(mensaje);
    }
}
