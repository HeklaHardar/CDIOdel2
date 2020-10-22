package Game;

public class Account {

    private int points = 1500;
    boolean win = false;

    public Account(){
    }

    //Updates player score
    public void updateScore(int sum) {

        points += sum;

        if (points < 0){
            points = 0;
        }

        if(points>2999){
            win = true;
        }


    }

    //returns new score
    public int score() {
        return points;
    }

    public boolean isWin() {
        return win;
    }
}
