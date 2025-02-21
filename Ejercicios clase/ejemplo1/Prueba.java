package ejemplo1;

public class Prueba {

    public static void main(String[] args) {
        Movie movie1 = new Movie("pelicula1", "Comedia", 7.5);
        Movie movie2 = new Movie("pelicula2", "Terror", 9.9);
        Movie movie3 = new Movie("pelicula3", "Ficcion", 1.0);

        Dog dog1 = new Dog(25, "aaaaaa", "Perro1");
        Dog dog2 = new Dog(39, "bbbbbb", "Perro2");
        Dog dog3 = new Dog(25, "cccccc", "Perro3");

        movie2.playIt();
        dog3.bark();
    }
}
