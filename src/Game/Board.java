package Game;

public class Board {
    public static void main(String[] args) {
        int roll;
        Dices d1 = new Dices();
        int sum = d1.sum();
        Fields f1 = new Fields(sum);
        int new_money = f1.getMoney();



    }


}
