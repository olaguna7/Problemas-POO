package tema1.problema09;

public class Principal {
    public static void main(String[] args) {
        /* Información del conductor */
        String nifConductor = "04213421P";
        String nombreConductor = "Pedro";
        Conductor conductor = new Conductor(nifConductor, nombreConductor);

        /* Averías */
        Averia[] averias = new Averia[3];
        averias[0] = new Averia(12, 235.98, "Cambio de aceite y filtros");
        averias[1] = new Averia(27, 12.50, "Revisar faros delanteros");
        averias[2] = new Averia(1, 9231.70, "Siniestro total");

        Coche coche = new Coche("5343 DRW", "Renault", conductor, averias);

        /* Imprimimos la info del coche */
        System.out.println("Matrícula del coche: " + coche.getMatricula());
        System.out.println("Nombre del conductor: " + coche.getNombreConductor());
        System.out.println("Averías del coche: ");
        for (int i = 0; i < averias.length; i++) {
            System.out.println("Avería " + (i + 1) + ": ");
            System.out.println();
        }


    }
}
