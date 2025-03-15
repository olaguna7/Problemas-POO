package tema1.problema03;

public class Principal {
    public static double areaMayorTriangulo(TrianguloIsosceles[] triangulos) {
        double areaMax = triangulos[0].area();

        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].area() > areaMax) {
                areaMax = triangulos[i].area();
            }
        }

        return areaMax;
    }

    public static void main(String[] args) {

    }
}
