package Game;

public class Board {
    public static void main(String[] args) {

        //Creates Menu
        Menu menu1 = new Menu();
        menu1.Menu();
        String language = menu1.getLanguage();

        //Instantiating Dices
        Dices d1 = new Dices();

        //Making Accounts for each player
        Account ac = new Account();
        Account ac1 = new Account();
        Account[] accounts = {ac,ac1};

        //Instantiating Players
        Player p1 = new Player(menu1.getPlayer1());
        Player p2 = new Player(menu1.getPlayer2());

        // Arrays for text for different languages
        String[] textDanish = {" Slog: ", " Points: ", " Fik en ekstra tur", " Har Vundet! " };
        String[] textEnglish = {" Rolled: ", " Points: ", " Got An Extra Turn", " Has Won " };
        String[] currentLanguage = new String[3];



        //Setting language for board output
        if (language == "danish"){
            currentLanguage = textDanish;
        }
        else if(language == "english"){
            currentLanguage = textEnglish;
        }

        //instatiating Array of Players and setting currentplayer
        Player[] Players = {p1,p2};
        CurrentPlayer currentplayer = new CurrentPlayer();

        boolean isWinner = false;

        while(isWinner == false){
            //roll dices and outputs roll, checks current player and language
            d1.roll();
            int sum = d1.sum();
            System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[0] + sum);

            //Calculates new score
            Fields f1 = new Fields(sum, menu1.getLanguage());
            int new_money = f1.getMoney();

            //adds score to account depending on currentplayer
            accounts[currentplayer.currentPlayer].updateScore(new_money);
            System.out.println( currentLanguage[1]
                    + accounts[currentplayer.currentPlayer].score());

            //checks if there is extra turn
            if (f1.hasExtraTurn == true){
                System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[2]);
                System.out.println(" ");
                continue;
            }
            System.out.println(" ");

            isWinner = accounts[currentplayer.currentPlayer].isWin();
            //sets current player
            if (currentplayer.getCurrentPlayer() == 0){
                currentplayer.setCurrentPlayer(1);
            }
            else if(currentplayer.getCurrentPlayer() == 1){
                currentplayer.setCurrentPlayer(0);
            }
        }
        System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[3]);


    }


}
