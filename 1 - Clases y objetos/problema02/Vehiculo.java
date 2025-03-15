package tema1.problema02;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Solo vamos a usar el getter del precio
    public double getPrecio() {
        return precio;
    }

    public void imprimirInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }

}
