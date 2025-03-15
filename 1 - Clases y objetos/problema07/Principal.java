package tema1.problema07;

public class Principal {
    public static void main(String[] args) {

        /* Creamos la tripulación que nos han pedido */
        Tripulacion[] tripulacion = new Tripulacion[4];

        tripulacion[0] = new Tripulacion("Piloto", 4);
        tripulacion[1] = new Tripulacion("Copiloto", 3);
        tripulacion[2] = new Tripulacion("Sobrecargo", 2);
        tripulacion[3] = new Tripulacion("Azafato", 2);

        /* Creamos el objeto del avión con la id y la tripulación requerida */
        Avion avion = new Avion(234, tripulacion);

        /*
         * Vamos a imprimir la información de la tripulación
         * (se puede hacer de muchas otras maneras totalmente válidas)
         */
        for (int i = 0; i < tripulacion.length; i++) {
            System.out.println("Miembro nº " + (i + 1) + " de la tripulación: ");
            System.out.println("Puesto: " + avion.getPuestoTripulacion(i));
            System.out.println("Días libres: " + avion.getDiasLibres(i));
            System.out.println("-------------------------------------------");
        }

        /* Ahora nos pide cambiar el número de días libres del piloto a 2 e imprimir de nuevo la informacion */
        /* El piloto está el primero de la lista (n = 0) */
        avion.setDiasLibres(0, 2);

        /* Volvemos a imprimir la info de la tripulación */
        System.out.println("\n\nDespués de la modificación: ");
        for (int i = 0; i < tripulacion.length; i++) {
            System.out.println("Miembro nº " + (i + 1) + " de la tripulación: ");
            System.out.println("Puesto: " + avion.getPuestoTripulacion(i));
            System.out.println("Días libres: " + avion.getDiasLibres(i));
            System.out.println("-------------------------------------------");
        }
    }
}
