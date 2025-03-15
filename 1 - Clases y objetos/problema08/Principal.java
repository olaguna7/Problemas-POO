package tema1.problema08;

public class Principal {
    public static void main(String[] args) {
        Pareja[] parejas = new Pareja[2];

        /* Datos personas de la pareja 1: */
        Persona persona1pareja1 = new Persona("María", 26);
        Persona persona2pareja1 = new Persona("Juan", 22);
        parejas[0] = new Pareja(1231, "Sevilla", persona1pareja1, persona2pareja1);

        /* Datos personas de la pareja 2: */
        Persona persona1pareja2 = new Persona("Pedro", 22);
        Persona persona2pareja2 = new Persona("Clara", 19);
        parejas[1] = new Pareja(2, "Alicante", persona1pareja2, persona2pareja2);

        /* Creamos el objeto del campeonato */
        Campeonato campeonato = new Campeonato(parejas, "Madrid", "Calle falsa, 123");


        /* Imprimimos la información ed cada miembro de las parejas del campeonato: */
        for (int i = 0; i < parejas.length; i++) {
            System.out.println("Información de la pareja " + (i + 1) + " del campeonato: ");
            System.out.println("Nombre persona 1: " + campeonato.getNombreParejaP1(i));
            System.out.println("Nombre persona 2: " + campeonato.getNombreParejaP2(i));

            if (parejas[i].esParejaValida()) {
                System.out.println("Pareja válida para jugar el campeonato :)");
            } else {
                System.out.println("Pareja no válida para jugar el campeonato :(");
            }
            System.out.println("----------------------------------------");
        }

    }
}
