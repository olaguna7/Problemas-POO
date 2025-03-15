package tema1.problema03;

public class TrianguloIsosceles {
    private double ladoIgual;
    private double ladoDesigual;

    public TrianguloIsosceles(double ladoIgual, double ladoDesigual) {
        this.ladoIgual = ladoIgual;
        this.ladoDesigual = ladoDesigual;
    }

    public double getLadoDesigual() {
        return ladoDesigual;
    }

    public void setLadoDesigual(double ladoDesigual) {
        this.ladoDesigual = ladoDesigual;
    }

    public double getLadoIgual() {
        return ladoIgual;
    }

    public void setLadoIgual(double ladoIgual) {
        this.ladoIgual = ladoIgual;
    }

    public double perimetro() {
        return 2 * ladoIgual + ladoDesigual;
    }

    // Hay que calcular primero la altura. Por el teorema de Pitágoras, y teniendo en cuenta que
    // la altura corta al lado desigual en su punto medio, se puede calcular fácilmente.
    // El área será la base (el lado desigual) por la altura.
    public double area() {
        double altura = Math.sqrt(Math.pow(ladoIgual, 2) - Math.pow(ladoDesigual / 2, 2));
        return ladoDesigual * altura;
    }
}
