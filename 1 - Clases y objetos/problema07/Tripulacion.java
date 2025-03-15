package tema1.problema07;

public class Tripulacion {
    private String puesto;
    private int diasLibres;

    public Tripulacion(String puesto, int diasLibres) {
        this.puesto = puesto;
        this.diasLibres = diasLibres;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getDiasLibres() {
        return diasLibres;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDiasLibres(int diasLibres) {
        this.diasLibres = diasLibres;
    }
}
