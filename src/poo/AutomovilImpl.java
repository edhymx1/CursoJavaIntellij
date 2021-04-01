package poo;

import poo.automovil.Automovil;
import poo.automovil.Color;
import poo.automovil.Motor;
import poo.automovil.Tanque;
import poo.automovil.TipoMotor;

public class AutomovilImpl {
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTanque(new Tanque(45));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS);
        nissan.setMotor(new Motor(4.0, TipoMotor.DIESEL));
        nissan.setTanque(new Tanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS);
        nissan2.setMotor(new Motor(3.5, TipoMotor.BENCINA));
        nissan2.setTanque(new Tanque(50));

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
    }
}
