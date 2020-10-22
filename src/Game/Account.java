package Game;

public class Account {

    private int points = 1500;


    public Account(){
    }

    //Updates player score
    public void updateScore(int sum) {

        points += sum;

        if(sum == 999){

            points = 1000;

        }


    }

    //returns new score
    public int score() {
        return points;
    }




}
