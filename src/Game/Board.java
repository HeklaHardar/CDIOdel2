package Game;

import java.util.Scanner;

public class Board {


    private Player currentPlayer;
    Dices d1 = new Dices();
    Scanner scan = new Scanner(System.in);
    private boolean Winner = false;
    Fields f1 = new Fields(d1.sum());




    public void Play(){

        Player player1 = new Player("Mikkel");
        Player player2 = new Player("Lekkim");
        currentPlayer = player1;

        Account account = new Account(currentPlayer.toString());


        for(; currentPlayer.score() < 3000;) {
            d1.roll();
            System.out.println(d1.toString());
            Fields f1 = new Fields(d1.sum());
            //account.updateScore(f1.getMoney());
            currentPlayer.updateScore(f1.getMoney());
            System.out.println("New Score: " + currentPlayer.score() + " " + currentPlayer.playerString());

            if(currentPlayer == player1 && !(d1.sum() == 10)){
                currentPlayer = player2;
            }
            else if(currentPlayer == player2 && !(d1.sum() == 10)) {
                currentPlayer = player1;

            }

        }


    }

    public static void main(String[] args) {

        Board board = new Board();
        board.Play();

    }
    /*public static void main(String[] args) {
        Dices d1 = new Dices();
        Account ac1 = new Account("Player1");


        for (int i = 0; i < 1000; i++){
            d1.roll();
            int sum = d1.sum();
            Fields f1 = new Fields(sum);
            int new_money = f1.getMoney();
            ac1.updateScore(new_money);
            int score = ac1.score();
            System.out.println("New Score:" + score);
        }*/


    }



