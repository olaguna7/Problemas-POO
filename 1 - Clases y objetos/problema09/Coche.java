package tema1.problema09;

public class Coche {
    private String matricula;
    private String marca;
    private Conductor conductor;
    private Averia[] averias;

    public Coche(String matricula, String marca, Conductor conductor, Averia[] averias) {
        this.matricula = matricula;
        this.marca = marca;
        this.conductor = conductor;
        this.averias = averias;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombreConductor() {
        return conductor.getNombre();
    }

    public double getPrecioAveria(int n) {
        return averias[n].getPrecio();
    }

    public int getIdenticiadorAveria(int n) {
        return averias[n].getIdentificador();
    }
}
