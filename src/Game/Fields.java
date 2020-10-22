package Game;

public class Fields {
    boolean hasExtraTurn = false;
    private int money = 0;

    public Fields(int sum){
        switch (sum){
            case 2: money = 250;
            break;
            case 3: money = -100;
                break;
            case 4: money = 100;
                break;
            case 5: money = -20;
                break;
            case 6: money = 180;
                break;
            case 7: money = 0;
                break;
            case 8: money = -70;
                break;
            case 9: money = 60;
                break;
            case 10: money = -80;
            hasExtraTurn = true;
                break;
            case 11: money = -50;
                break;
            case 12: money = 650;
                break;

        }

    }

    public boolean isHasExtraTurn() {
        return hasExtraTurn;
    }

    public void setHasExtraTurn(boolean hasExtraTurn) {
        this.hasExtraTurn = hasExtraTurn;
    }

    public int getMoney() {
        return money;
    }
}
