package tema1.problema09;

public class Averia {
    private int identificador;
    private double precio;
    private String descripcion;

    public Averia(int identificador, double precio, String descripcion) {
        this.identificador = identificador;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getPrecio() {
        return precio;
    }
}
