package tema1.problema10;

public class Principal {
    public static void main(String[] args) {
        /* Definimos primero los productos */
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("C1", 24);
        productos[1] = new Producto("H23", 234);
        productos[2] = new Producto("M30", 109);

        /* Creamos el objeto factura */
        Factura factura = new Factura(2123, productos);

        System.out.println("Datos de la factura nº " + factura.getNumeroFactura() + " antes de los cambios");
        for (int i = 0; i < factura.getNumeroProductos(); i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.println("Código alfanumérico: " + factura.getProductos()[i].getCodigo());
            System.out.println("Precio: " + factura.getProductos()[i].getPrecio() + "€");
            System.out.println("--------------------------------");
        }
    }
}
