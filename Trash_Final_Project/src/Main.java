import java.util.Random;
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello World");

        System.out.println("Welcome to Trash");
        BeginGame Manager = new BeginGame();

        Manager.setPlayerName();
        Manager.setPlayerOrder();

        Player Player1 = new Player();

        String [][] player1Deck = new String [2][4];

        Player1.setTable(player1Deck);
        Player1.printTable();

        Player1.chooseCard();
        Player1.printCard();



    }
}