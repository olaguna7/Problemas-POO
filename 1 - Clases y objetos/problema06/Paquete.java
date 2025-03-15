package tema1.problema06;

public class Paquete {

    /*
    Para simplificarlo, codificaremos la prioridad como:
    1.- Sin prioridad (prioridad normal)
    2.- Prioridad alta
    3.- Prioridad express
     */
    private int numeroReferencia;
    private double peso;
    private int prioridad;
    private String dniEmisor;

    public Paquete(String dniEmisor, int prioridad, double peso, int numeroReferencia) {
        this.dniEmisor = dniEmisor;
        this.prioridad = prioridad;
        this.peso = peso;
        this.numeroReferencia = numeroReferencia;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String toString() {
        return "Número de referencia: " + numeroReferencia + "; Peso: " + peso + "; Prioridad: " + prioridad +
                "; DNI del emisor: " + dniEmisor;
    }
}
