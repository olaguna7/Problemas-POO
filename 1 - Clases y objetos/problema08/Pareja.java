package tema1.problema08;

public class Pareja {
    private int id;
    private String ciudad;
    private Persona persona1;
    private Persona persona2;

    public Pareja(int id, String ciudad, Persona persona1, Persona persona2) {
        this.id = id;
        this.ciudad = ciudad;
        this.persona1 = persona1;
        this.persona2 = persona2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdadPersona1() {
        return persona1.getEdad();
    }

    public void setEdadPersona1(int edadPersona1) {
        this.persona1.setEdad(edadPersona1);
    }

    public int getEdadPersona2() {
        return persona2.getEdad();
    }

    public void setEdadPersona2(int edadPersona2) {
        this.persona2.setEdad(edadPersona2);
    }

    public String getNombrePersona1() {
        return persona1.getNombre();
    }

    public String getNombrePersona2() {
        return persona2.getNombre();
    }

    public boolean esParejaValida() {
        boolean esValida = true;

        if (persona1.getEdad() < 18 || persona1.getEdad() > 25 || persona2.getEdad() < 18 || persona2.getEdad() > 25) {
            return false;
        }

        return esValida;
    }


}
