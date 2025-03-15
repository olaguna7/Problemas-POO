package tema1.problema08;

public class Campeonato {
    private Pareja[] parejas;
    private String ciudad;
    private String calle;

    public Campeonato(Pareja[] parejas, String ciudad, String calle) {
        this.parejas = parejas;
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Pareja[] getParejas() {
        return parejas;
    }

    public void setParejas(Pareja[] parejas) {
        this.parejas = parejas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /* Metodo para consultar el nombre de la persona 1 de la n-ésima pareja */
    public String getNombreParejaP1(int n) {
        return parejas[n].getNombrePersona1();
    }

    /* Metodo para consultar el nombre de la persona 2 de la n-ésima pareja */
    public String getNombreParejaP2(int n) {
        return parejas[n].getNombrePersona2();
    }

    /* Metodo para consultar la edad de la persona 1 de la n-ésima pareja */
    public int getEdadP1(int n) {
        return parejas[n].getEdadPersona1();
    }

    /* Metodo para consultar la edad de la persona 2 de la n-ésima pareja */
    public int getEdadP2(int n) {
        return parejas[n].getEdadPersona2();
    }

    /* Comprobar si la pareja n-ésima del campeonato es válida */
    public boolean esParejaValida(int n) {
        return parejas[n].esParejaValida();
    }


}
