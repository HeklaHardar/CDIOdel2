package Test;

import Game.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {


    Dices d1 = new Dices();
    private boolean Winner = false;
    private int Round = 1;
    Player p1 = new Player("Test 1");
    Player p2 = new Player("Test 2");
    Account ac = new Account();
    Account ac1 = new Account();
    Player[] Players = {p1,p2};
    Account[] accounts = {ac,ac1};
    CurrentPlayer currentplayer = new CurrentPlayer();

    //Test to check if the players balance ever reaches a negative number
    @Test
    public void getPointTest(){

        //Plays the game i times
        for(int i = 1000; i > 0; --i){


            while(!Winner) {
                d1.roll();
                int sum = d1.sum();
                Fields f1 = new Fields(sum, "test");
                int new_money = f1.getMoney();
                //System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + " Slog: " + sum + " \t This is testround: " + Round);
                accounts[currentplayer.getCurrentPlayer()].updateScore(new_money);
                //System.out.println( " Points: " + accounts[currentplayer.getCurrentPlayer()].score());

                //Tests the current players balance to see if it's 0 or above.
                assertTrue("true",accounts[currentplayer.getCurrentPlayer()].score()>=0);

                if(accounts[currentplayer.getCurrentPlayer()].score() >= 3000){
                    Winner = true;
                    break;
                }
                if (f1.isHasExtraTurn()){
                    //System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + " Got An Extra Turn");
                    continue;
                }
               //System.out.println(" ");
                if (currentplayer.getCurrentPlayer() == 0){
                    currentplayer.setCurrentPlayer(1);
                }
                else if(currentplayer.getCurrentPlayer() == 1){
                    currentplayer.setCurrentPlayer(0);
                }
            }

            if(Winner){
             //   System.out.println("End of round: " + Round);
                Round +=1;
                ac.updateScore(1000);
                ac1.updateScore(1000);
                Winner = false;

            }
        }
    }
}