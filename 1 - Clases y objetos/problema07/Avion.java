package tema1.problema07;

public class Avion {
    private int id;
    private Tripulacion[] tripulacion;

    public Avion(int id, Tripulacion[] tripulacion) {
        this.id = id;
        this.tripulacion = tripulacion;
    }

    public int getId() {
        return id;
    }

    /*
     * El parámetro n es para indicar el miembro de la tripulación del que queremos obtener el puesto
     * si n = 0 se elegirá el primero de la lista, si n = 1 se elige al segundo, y así sucesivamente
     */
    public String getPuestoTripulacion(int n) {
        return tripulacion[n].getPuesto();
    }

    /*
     * Lo mismo para actualizar los datos de uno de los miembros de la tripulación
     */
    public void setPuestoTripulacion(int n, String puestoTripulacion) {
        tripulacion[n].setPuesto(puestoTripulacion);
    }

    /* Ahora repetimos el proceso de los dos métodos anteriores, pero para los días de descanso */
    public int getDiasLibres(int n) {
        return tripulacion[n].getDiasLibres();
    }

    public void setDiasLibres(int n, int diasLibres) {
        tripulacion[n].setDiasLibres(diasLibres);
    }
}
