package Game;

public class Player {

    //Sætter variabler

    private String Player;

    private int points;
    private int score;

    //Henter spillerens navn
    public Player(String s) {
        Player = s;
        points = 0;
        Account ac = new Account();
    }

    public String startString() {
        return Player + " Starts";
    }

    public String playerString() {
        return Player;
    }

}
