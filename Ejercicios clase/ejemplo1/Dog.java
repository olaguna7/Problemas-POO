package ejemplo1;

public class Dog {
    private double size;
    private String breed;
    private String name;

    public Dog(double size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Perro " + name + " ladrando");
    }
}
