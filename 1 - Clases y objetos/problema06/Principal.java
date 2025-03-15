package tema1.problema06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de sucursal: ");
        int numeroSucursal = sc.nextInt();
        System.out.println("Introduzca la dirección de la sucursal: ");

        sc.nextLine();  // Esto se pone para que el scanner funcione correctamente

        String direccion = sc.nextLine();
        System.out.println("Introduzca la ciudad de la sucursal: ");
        String ciudad = sc.nextLine();

        System.out.println("¿Cuántos paquetes desea enviar?");
        int numPaquetes = sc.nextInt();

        Paquete[] paquetes = new Paquete[numPaquetes];

        sc.nextLine();  // Esto se pone para que el scanner funcione correctamente

        System.out.println("Introduzca su DNI: ");
        String dni = sc.nextLine();

        for (int i = 0; i < numPaquetes; i++) {
            System.out.println("Vamos a introducir los datos del paquete nº " + (i + 1));
            System.out.print("\nIntroduzca el número de referencia del paquete: ");
            int referencia = sc.nextInt();
            System.out.print("\nIntroduzca la prioridad del paquete: ");
            int prioridad = sc.nextInt();
            System.out.print("\nIntroduzca el peso del paquete (en kg): ");
            double peso = sc.nextDouble();

            paquetes[i] = new Paquete(dni, prioridad, peso, referencia);
        }

        System.out.println("\nInformación de los paquetes ");
        for (Paquete paquete : paquetes) {
            System.out.println(paquete);
        }
    }


}
