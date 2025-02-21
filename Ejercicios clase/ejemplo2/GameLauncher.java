package ejemplo2;

public class GameLauncher {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        GuessGame game = new GuessGame(p1, p2, p3);

        game.startGame();
    }
}
