package tema1.problema01;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Un triángulo es rectángulo si el cuadrado de uno de los lados es igual a la suma de los cuadrados
    // de los lados restantes
    public boolean esRectangulo() {
        if ((Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2)) ||
                (Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2)) ||
                (Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esEscaleno() {
        if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
            return true;
        } else {
            return false;
        }
    }

    // Un triángulo es isósceles cuando tiene exactamente dos lados iguales
    public boolean esIsosceles() {
        if (((lado1 == lado2) && (lado1 != lado3)) || ((lado1 == lado3) && (lado1 != lado2)) ||
                ((lado2 == lado3) && (lado1 != lado2))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            return true;
        } else {
            return false;
        }
    }
}
