package ejemplo3;

public class Vehiculo {
    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marcaModelo='" + marcaModelo + '\'' +
                ", precioDia=" + precioDia +
                ", numLlantas=" + numLlantas +
                '}';
    }

    public void mostrarCaracteristicas() {
        System.out.println(toString());
    }

    public void encenderMotor() {
        System.out.println("Encender motor");
    }

    public void apagarMotor() {
        System.out.println("Apagar motor");
    }

    public void funciona() {
        System.out.println("Funciona");
    }

}
