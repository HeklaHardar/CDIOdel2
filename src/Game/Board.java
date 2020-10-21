package Game;

public class Board {

    public static void main(String[] args) {
        Account account = new Account("test");
        account.updateScore(150);
        System.out.println(account.score());

    }

}
