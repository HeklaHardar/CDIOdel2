public class Player {

    //Sætter variabler
    private int min = 1;
    private int max = 3;
    private String Player;
    private int PlayerStarter = (int) (Math.random() * (max - min) + min);
    private int points;

    //Henter spillerens navn
    public Player(String s) {
        Player = s;
        points = 0;
    }

    //Vælger tilfældigt hvem der starter spillet
    public int spillerStarter() {
        return PlayerStarter;
    }

    public String startString() {
        return Player + " Starts";
    }

    public String playerString() {
        return Player;
    }

    //opdaterer spillerens score
    public void opdaterScore(int sum) {
        points += sum;
    }

    //returner spillerens nye score
    public int score() {
        return points;
    }
}
