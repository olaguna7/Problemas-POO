package tema1.problema12;

public class Bombilla {
    private String color;
    private boolean encendido;

    public Bombilla(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String toString() {
        return "color: " + color + " estado: " + ((encendido) ? "encendido" : "apagado");
    }
}
