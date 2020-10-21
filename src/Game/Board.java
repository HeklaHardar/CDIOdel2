package Game;

public class Board {
    public static void main(String[] args) {
        Dices d1 = new Dices();
        Account ac1 = new Account("Player1");


        for (int i = 0; i < 1000; i++){
            d1.roll();
            int sum = d1.sum();
            Fields f1 = new Fields(sum);
            int new_money = f1.getMoney();
            ac1.updateScore(new_money);
            int score = ac1.score();
            System.out.println("New Score:" + score);
        }


    }


}
