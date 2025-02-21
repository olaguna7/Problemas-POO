package ejemplo2;



public class GuessGame {
    private Player player1;
    private Player player2;
    private Player player3;

    public GuessGame(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        boolean player1Wins = false;
        boolean player2Wins = false;
        boolean player3Wins = false;

        int numberToGuess = (int) (Math.random() * 10);



        int [] winnerPlayers = {0, 0, 0};   // value 1 in the position i means that player "i" wins
                                            // value 0 in the position i means that player "i" loses

        while (!(player1Wins || player2Wins || player3Wins)) {
            System.out.println("Player 1 turn.");
            player1.guess();
            System.out.println("Player 2 turn.");
            player2.guess();
            System.out.println("Player 3 turn.");
            player3.guess();

            if (player1.getNumberGuessed() == numberToGuess) {
                player1Wins = true;
                winnerPlayers[0] = 1;
            } else if (player2.getNumberGuessed() == numberToGuess) {
                player2Wins = true;
                winnerPlayers[1] = 1;
            } else if (player3.getNumberGuessed() == numberToGuess) {
                player3Wins = true;
                winnerPlayers[2] = 1;
            }
        }

        System.out.println("The number to guess was: " + numberToGuess);

        for (int i = 0; i < winnerPlayers.length; i++) {
            if (winnerPlayers[i] == 1) {
                System.out.println("Player " + (i + 1) + " wins :)");
            } else {
                System.out.println("Player " + (i + 1) + "loses :(");
            }
        }

    }

}
