package Test;

import Game.*;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class PointTest {

    private Player currentPlayer;
    private Account currentAccount;
    Dices d1 = new Dices();
    private boolean Winner = false;
    Fields f1 = new Fields(d1.sum());
    private int Round = 1;

    @Test
    public void getPointTest(){

        Player player1 = new Player("Test1");
        Player player2 = new Player("Test2");
        Account player1Account = new Account();
        Account player2Account = new Account();
        currentPlayer = player1;
        currentAccount = player1Account;


        for(int i = 1000; i > 0; --i){


            while(!Winner) {
                d1.roll();
                System.out.println(d1.toString());
                Fields f1 = new Fields(d1.sum());
                currentAccount.updateScore(f1.getMoney());
                currentPlayer.updateScore(f1.getMoney());
                System.out.println("New Score: " + currentAccount.score() + " " + currentPlayer.playerString() + " " + "Round: " + Round);

                assertTrue(String.valueOf(true), currentAccount.score() >= 0);

                if(currentAccount.score()>=3000){
                    Winner = true;
                    break;
                }
                if (currentPlayer == player1 && !(d1.sum() == 10)) {
                    currentPlayer = player2;
                    currentAccount = player2Account;
                } else if (currentPlayer == player2 && !(d1.sum() == 10)) {
                    currentPlayer = player1;
                    currentAccount = player1Account;

                }
            }

            if(Winner){
                System.out.println("End of round: " + Round);
                Round +=1;
                player1Account.updateScore(999);
                player2Account.updateScore(999);
                Winner = false;

            }

        }


    }


}
