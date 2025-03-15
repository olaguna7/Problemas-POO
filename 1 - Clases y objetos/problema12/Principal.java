package tema1.problema12;

public class Principal {
    public static void main(String[] args) {
        Bombilla[] bombillas = new Bombilla[4];
        bombillas[0] = new Bombilla("Rojo");
        bombillas[1] = new Bombilla("Verde");
        bombillas[2] = new Bombilla("Azul");
        bombillas[3] = new Bombilla("Verde");

        Controlador controlador = new Controlador(bombillas);
        controlador.setEstado(1);
        controlador.setEstado(3);
        controlador.setEstado(2);

        System.out.println(controlador);
    }
}
