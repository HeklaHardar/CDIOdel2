package Game;

public class Board {
    public static void main(String[] args) {
        //Instantiating Dices
        Dices d1 = new Dices();

        //Making Accounts for each player
        Account ac = new Account();
        Account ac1 = new Account();
        Account[] accounts = {ac,ac1};

        //Instantiating Players
        Player p1 = new Player("Lau");
        Player p2 = new Player("Lukas");

        // Arrays for text for different languages
        String[] textDanish = {"Slog: ", "Points: ", "Fik en ekstra tur" };
        String[] textEnglish = {"Rolled: ", "Points: ", "Got An Extra Turn" };
        String[] currentLanguage = new String[3];

        //Setting language for board output
        if (language == "danish"){
            currentLanguage = textDanish;
        }
        else if{
            currentLanguage = textEnglish;
        }

        //instatiating Array of Players and setting currentplayer
        Player[] Players = {p1,p2};
        CurrentPlayer currentplayer = new CurrentPlayer();

        while(accounts[currentplayer.currentPlayer].isWin() == false){
            //roll dices and outputs roll, checks current player and language
            d1.roll();
            int sum = d1.sum();
            System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[0] + sum);

            //Calculates new score
            Fields f1 = new Fields(sum);
            int new_money = f1.getMoney();

            //adds score to account depending on currentplayer
            accounts[currentplayer.currentPlayer].updateScore(new_money);
            System.out.println( currentLanguage[1]
                    + accounts[currentplayer.currentPlayer].score());

            //checks if there is extra turn
            if (f1.hasExtraTurn == true){
                System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[2]);
                continue;
            }
            System.out.println(" ");


            //sets current player
            if (currentplayer.getCurrentPlayer() == 0){
                currentplayer.setCurrentPlayer(1);
            }
            else if(currentplayer.getCurrentPlayer() == 1){
                currentplayer.setCurrentPlayer(0);
            }
        }


    }


}
