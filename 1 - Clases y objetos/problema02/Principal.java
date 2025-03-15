package tema1.problema02;

public class Principal {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("Toyota", "Yaris", 14000.95);
        vehiculos[1] = new Vehiculo("Honda", "Civic", 20000.99);
        vehiculos[2] = new Vehiculo("Dacia", "Sandero", 23000.65);

        Vehiculo vehiculoMasCaro = vehiculos[0];
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecio() > vehiculoMasCaro.getPrecio()) {
                vehiculoMasCaro = vehiculo;
            }
        }

        System.out.println("El vehículo más caro es el siguiente: ");
        vehiculoMasCaro.imprimirInformacion();
    }
}
