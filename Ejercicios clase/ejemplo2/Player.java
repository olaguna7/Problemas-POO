package ejemplo2;

import java.util.Scanner;

public class Player {
    private String name;
    private int numberGuessed;

    public Player() {

    }

    public Player(String name, int numberGuessed) {
        this.name = name;
        this.numberGuessed = numberGuessed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberGuessed() {
        return numberGuessed;
    }

    public void setNumberGuessed(int numberGuessed) {
        this.numberGuessed = numberGuessed;
    }

    public void guess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        numberGuessed = sc.nextInt();
    }
}
