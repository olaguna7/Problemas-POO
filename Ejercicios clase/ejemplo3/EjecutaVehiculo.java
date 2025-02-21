package ejemplo3;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Autobus autobus = new Autobus(25, "Toyota", 4, 25, 2, 7);

        autobus.mostrarDatos();

        Motocicleta motocicleta = new Motocicleta(15, "Yamaha", 2, 1);

        motocicleta.pruebaDelMotor();
    }
}
