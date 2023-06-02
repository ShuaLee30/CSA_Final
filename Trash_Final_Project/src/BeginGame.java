import java.util.Scanner;
import java.util.Random;
public class BeginGame {

    String player1Name;
    String player2Name;

    int firstTurn;

    public BeginGame(){

    }

    public void setPlayerName(){

        Scanner input = new Scanner(System.in);

        System.out.println("Player 1, Enter your Name");
        player1Name = input.nextLine();

        System.out.println("Player 2, Enter your Name");
        player2Name = input.nextLine();

    }

    public void setPlayerOrder(){

        Scanner input = new Scanner(System.in);

        System.out.println("Player 1, enter a number 1 or 2");
        System.out.println("The computer will generate a random number as well");
        System.out.println("If you match the computer's number, Player 1 will go first");
        System.out.println("Otherwise, Player 2 goes first");

        int playerGuess = input.nextInt();
        int compGuess = (int) ( Math.random() * 2 + 1);

        System.out.println("Player Guess: " + playerGuess);
        System.out.println("Computer Guess: " + compGuess);

        if (playerGuess == compGuess){

            firstTurn = 1;
            System.out.println("Player 1 goes first");

        } else {

            firstTurn = 2;
            System.out.println("Player 2 goes first");

        }

    }

}
