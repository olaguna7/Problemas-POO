package ejemplo3;

public class Motocicleta extends Vehiculo{
    private int numAsientos;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas, int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Número de asientos: " + numAsientos);
    }

    public void pruebaDelMotor() {
        System.out.println("Haciendo prueba de motor de motocicleta");
    }
}
