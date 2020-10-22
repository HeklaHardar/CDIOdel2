package Game;

public class Board {
    public static void main(String[] args) {
        Dices d1 = new Dices();
        Account ac = new Account();
        Account ac1 = new Account();
        Account[] accounts = {ac,ac1};
        Player p1 = new Player("Lau");
        Player p2 = new Player("Lukas");
        String[] textDanish = {"Slog: ", "Points: ", "Fik en ekstra tur" };
        String[] textEnglish = {"Rolled: ", "Points: ", "Got An Extra Turn" };
        String[] currentLanguage = new String[3];
        if (language == "danish"){
            currentLanguage = textDanish;
        }
        else if{
            currentLanguage = textEnglish;
        }
        Player[] Players = {p1,p2};
        CurrentPlayer currentplayer = new CurrentPlayer();

        for (int i = 0; i < 5; i++){

            d1.roll();
            int sum = d1.sum();
            System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[0] + sum);
            Fields f1 = new Fields(sum);
            int new_money = f1.getMoney();

            accounts[currentplayer.currentPlayer].updateScore(new_money);
            System.out.println( currentLanguage[1]
                    + accounts[currentplayer.currentPlayer].score());

            if (f1.hasExtraTurn == true){
                System.out.println(Players[currentplayer.getCurrentPlayer()].playerString() + currentLanguage[2]);
                continue;
            }
            System.out.println(" ");
            if (currentplayer.getCurrentPlayer() == 0){
                currentplayer.setCurrentPlayer(1);
            }
            else if(currentplayer.getCurrentPlayer() == 1){
                currentplayer.setCurrentPlayer(0);
            }
        }


    }


}
