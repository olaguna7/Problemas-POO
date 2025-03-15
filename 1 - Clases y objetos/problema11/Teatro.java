package tema1.problema11;

public class Teatro {
    private String nombre;
    private String direccion;
    private Funcion[] funciones = new Funcion[4];

    public Teatro(String nombre, String direccion, Funcion[] funciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.funciones = funciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    /* Devuelve el nombre de la función n-ésima del teatro */
    public String getNombreFuncion(int n) {
        return funciones[n].getNombre();
    }

    /* Cambia el nombre de la funcion n-ésima del teatro */
    public void setNombreFuncion(int n, String nombre) {
        funciones[n].setNombre(nombre);
    }

    /* Devuelve el precio de la función n-ésima del teatro */
    public double getPrecioFuncion(int n) {
        return funciones[n].getPrecio();
    }

    /* Cambia el precio de la función n-ésima del teatro */
    public void setPrecioFuncion(int n, double precio) {
        funciones[n].setPrecio(precio);
    }
}
