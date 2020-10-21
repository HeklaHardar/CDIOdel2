package Game;

public class Account {

    private int points = 1500;


    public Account(String name){
    }

    //Updates player score
    public void updateScore(int sum) {

        points += sum;


    }

    //returns new score
    public int score() {
        return points;
    }


}
