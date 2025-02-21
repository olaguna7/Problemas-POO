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

    public void mostrarCaracteristicas() {
        System.out.println("Precio por día: " + precioDia);
        System.out.println("Marca del modelo: " + marcaModelo);
        System.out.println("Numero de llantas: " + numLlantas);
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
