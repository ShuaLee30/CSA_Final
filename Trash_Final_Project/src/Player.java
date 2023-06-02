import java.util.Random;
public class Player {

    private int firstCard;
    String [][] deck = new String [2][4];
    int symbol;

    public void setTable(String [][] array){
        for (int rows = 0; rows < array.length; rows++){
            for (int cols = 0; cols < array[0].length; cols++){
                deck[rows][cols] = "X";
            }
        }
    }
    public void printTable(){

        String d = "";
        for (int rows = 0; rows < deck.length; rows ++){
            for (int cols = 0; cols < deck[0].length; cols++){
                d = d + deck[rows][cols] + " ";
            }
            d = d + "\n";
        }

        System.out.println(d);

    }

    public void chooseCard(){

        firstCard = (int) ( Math.random() * 13 + 1);
        symbol = (int) (Math.random() * 4 + 1);

    }

    public void printCard(){

       

    }

    public void checkDeck(){

    }

}
