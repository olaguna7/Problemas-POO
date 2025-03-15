package tema1.problema10;

public class Factura {
    private int numeroFactura;
    private Producto[] productos;

    public Factura(int numeroFactura, Producto[] productos) {
        this.numeroFactura = numeroFactura;
        this.productos = productos;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    /* Devuelve el código del n-ésimo producto de la factura */
    public String getCodigoProducto(int n) {
        return productos[n].getCodigo();
    }

    public double getPrecioProducto(int n) {
        return productos[n].getPrecio();
    }

    /* Cambia el valor del código del n-ésimo producto de la factura*/
    public void setCodigoProducto(int n, String codigo) {
        productos[n].setCodigo(codigo);
    }

    public void setPrecioProducto(int n, double precio) {
        productos[n].setPrecio(precio);
    }

    public int getNumeroProductos() {
        return productos.length;
    }

    public Producto[] getProductos() {
        return productos;
    }
}
