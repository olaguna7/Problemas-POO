package ejemplo3;

public class Automovil extends Vehiculo {
    private int numAsientos;
    private int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Numero de Asientos: " + numAsientos);
        System.out.println("Numero de Puertas: " + numPuertas);
    }

    public void pruebaDelMotor() {
        System.out.println("Haciendo prueba de motor automovil");
    }
}
