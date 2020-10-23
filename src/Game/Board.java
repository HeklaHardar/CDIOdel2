package Game;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {

        // Creates Menu
        Menu menu1 = new Menu();
        menu1.Menu();
        String language = menu1.getLanguage();

        // Instantiating Dices
        Dices d1 = new Dices();

        // Making Accounts for each player
        Account ac = new Account();
        Account ac1 = new Account();
        Account[] accounts = {ac, ac1};

        // Instantiating Players
        Player p1 = new Player(menu1.getPlayer1());
        Player p2 = new Player(menu1.getPlayer2());

        // Arrays for text for different languages
        String[] textDanish = {" summen af dine slag er: ", "Penge: ", " fik en ekstra tur", " har vundet! ", "Tryk enter for at slå med terningerne", "Det er ", "'s tur og"};
        String[] textEnglish = {" the sum of dices is: ", "Money: ", " got an extra turn", " has won ", "Press enter to roll dices ", "It is ", "'s turn and"};
        String[] currentLanguage = new String[3];


        // Setting language for board output
        if (language == "danish") {
            currentLanguage = textDanish;
        } else if (language == "english") {
            currentLanguage = textEnglish;
        }
        Scanner scan = new Scanner(System.in);

        // Instatiating Array of Players and setting currentplayer
        Player[] Players = {p1, p2};
        CurrentPlayer currentplayer = new CurrentPlayer();

        boolean isWinner = false;

        while (isWinner == false) {
            //roll dices and outputs roll, checks current player and language
            System.out.println(currentLanguage[4]);
            scan.nextLine();
            d1.roll();
            int sum = d1.sum();
            System.out.println(currentLanguage[5] + Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[6] + currentLanguage[0] + sum);

            // Calculates new score
            Fields f1 = new Fields(sum, menu1.getLanguage());
            int new_money = f1.getMoney();

            // Adds score to account depending on currentplayer
            accounts[currentplayer.currentPlayer].updateScore(new_money);
            System.out.println(currentLanguage[1]
                    + accounts[currentplayer.currentPlayer].score());

            // Checks if there is extra turn
            if (f1.hasExtraTurn == true) {
                System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[2]);
                System.out.println(" ");
                continue;
            }
            System.out.println(" ");

            isWinner = accounts[currentplayer.currentPlayer].isWin();
            if (isWinner == true) {
                break;
            }
            // Sets current player
            if (currentplayer.getCurrentPlayer() == 0) {
                currentplayer.setCurrentPlayer(1);
            } else if (currentplayer.getCurrentPlayer() == 1) {
                currentplayer.setCurrentPlayer(0);
            }
        }
        System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[3]);

    }
}