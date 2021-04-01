package poo;

import poo.automovil.Automovil;
import poo.automovil.Color;
import poo.automovil.Motor;
import poo.automovil.Tanque;
import poo.automovil.TipoMotor;
import poo.automovil.TipoAutomovil;


public class AutomovilEnumImpl {
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());
        System.out.println("tipo numeroPuertas subaru: " + tipo.getNumeroPuerta());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El auto es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte,de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil nediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil más grande, con meleta grande");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta : tipos) {
            System.out.println(ta);
        }
    }
}
