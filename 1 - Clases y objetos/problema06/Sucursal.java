package tema1.problema06;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    private Paquete[] paquetes;

    public Sucursal(int numeroSucursal, String direccion, String ciudad, Paquete[] paquetes) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquetes = paquetes;
    }

    public double precioPaquete(int indice) {
        // El precio base de un paquete es un euro por cada kg que pese
        double precioPaquete = paquetes[indice].getPeso() * 1;

        if (paquetes[indice].getPrioridad() == 2) {
            precioPaquete = precioPaquete + 10;
        } else if (paquetes[indice].getPrioridad() == 3) {
            precioPaquete = precioPaquete + 20;
        }

        return precioPaquete;
    }

    public void datosSucursal() {
        System.out.println("Número de Sucursal: " + numeroSucursal);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ciudad: " + ciudad);
    }

}
