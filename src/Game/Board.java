package Game;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {

        //Creates Menu
        Menu menu1 = new Menu();
        menu1.Menu();
        String language = menu1.getLanguage();

        int stillplaying = 1;

        while (stillplaying == 1) {
            //Instantiating Dices
            Dices d1 = new Dices();

            //Making Accounts for each player
            Account ac = new Account();
            Account ac1 = new Account();
            Account[] accounts = {ac, ac1};

            //Instantiating Players
            Player p1 = new Player(menu1.getPlayer1());
            Player p2 = new Player(menu1.getPlayer2());

            // Arrays for text for different languages
            String[] textDanish = {"Summen af dine slag er: ", "Points: ", " fik en ekstra tur", " har vundet! ", "Tryk enter for at slå med terningerne, eller skriv 'exit' for at afbryde programmet", "Starter nyt spil", "Vil du spille et nyt spil? For at starte et nyt spil skriv 'ja', tryk enter for at slutte spillet", "Det er ", "'s tur"};
            String[] textEnglish = {"The sum of dices is: ", "Points: ", " got An Extra Turn", " has Won ", "Press enter to roll dices or type exit to exit game", "Starting new game", "Do you want to start a new game, type 'yes' to start a new game, press enter to end to game", "It is ", "'s turn"};
            String[] currentLanguage = new String[3];


            //Setting language for board output
            if (language == "danish") {
                currentLanguage = textDanish;
            } else if (language == "english") {
                currentLanguage = textEnglish;
            }
            Scanner scan = new Scanner(System.in);

            //instatiating Array of Players and setting currentplayer
            Player[] Players = {p1, p2};
            CurrentPlayer currentplayer = new CurrentPlayer();

            boolean isWinner = false;

            while (isWinner == false) {
                //Ask the user to press enter to continue or exit to end game
                System.out.println(currentLanguage[7] + Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[8]);
                System.out.println(currentLanguage[4]);
                String endgame = scan.nextLine();
                endgame = endgame.toLowerCase();
                if (endgame.equals("exit")){
                    System.exit(0);
                }
                //roll dices and outputs roll, checks current player and language
                d1.roll();
                int sum = d1.sum();
                System.out.println(currentLanguage[0] + sum);

                //Calculates new score
                Fields f1 = new Fields(sum, menu1.getLanguage());
                int new_money = f1.getMoney();

                //adds score to account depending on currentplayer
                accounts[currentplayer.getCurrentPlayer()].updateScore(new_money);
                System.out.println(currentLanguage[1]
                        + accounts[currentplayer.getCurrentPlayer()].score());

                //checks if there is extra turn
                if (f1.isHasExtraTurn()) {
                    System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[2]);
                    System.out.println(" ");
                    continue;
                }
                System.out.println(" ");

                isWinner = accounts[currentplayer.getCurrentPlayer()].isWin();
                if (isWinner == true) {
                    System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[3]);
                    break;
                }
                //sets current player
                if (currentplayer.getCurrentPlayer() == 0) {
                    currentplayer.setCurrentPlayer(1);
                } else if (currentplayer.getCurrentPlayer() == 1) {
                    currentplayer.setCurrentPlayer(0);
                }
            }
            System.out.println(currentLanguage[6]);
            String endgame = scan.nextLine();
            endgame = endgame.toLowerCase();
            if (endgame.equals("yes")||endgame.equals("ja")){
                System.out.println(currentLanguage[5]);
            }
            else {
                stillplaying = 0;
            }
        }
    }
}