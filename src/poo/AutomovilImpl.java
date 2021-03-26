package poo;

public class AutomovilImpl {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        auto1.setFabricante("MAZDA");
        auto1.setModelo("2000");
        auto1.setColor("Blanco");
        auto1.setCilindrada(4);
        auto1.setCapacidadTanque(80);

        System.out.println(auto1.toString());
    }
}
