package tema1.problema12;

public class Controlador {
    private int estado;
    private String[] estiloMusica = {"Balada", "Preludio", "Vals"};
    private Bombilla[] bombillas;

    public Controlador(Bombilla[] bombillas) {
        this.bombillas = bombillas;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    private void encenderOapagar(String color, Bombilla bombilla) {
        if (bombilla.getColor().equalsIgnoreCase(color)) {
            bombilla.setEncendido(true);
        } else {
            bombilla.setEncendido(false);
        }
    }

    public String toString() {
        String resultado;
        resultado = "Musica actual: " + estiloMusica[estado - 1] + "\n";

        for (int i = 0; i < bombillas.length; i++) {
            resultado += "bombilla " + i + ": " + bombillas[i].toString() + "\n";
        }

        return resultado;
    }
}
