package Game;

public class Fields {
    boolean hasExtraTurn = false;
    private int money = 0;
    String language = "english";
    String[] danish = {"hallo", "hallo", "hallo" , "hallo" , "hallo" , "hallo"
            , "hallo" , "hallo" , "hallo" , "hallo" , "hallo" , "hallo" };
    String[]  english = {"hello", "hello", "hello" , "hello" , "hello" , "hello"
            , "hello" , "hello" , "hello" , "hello" , "hello" , "hello" };


    public Fields(int sum){
        String[] currentLanguage = new String[11];
        if (language == "danish"){
            currentLanguage = danish;
        }
        else if(language == "english"){
            currentLanguage = english;
        }
        switch (sum){
            case 2: money = 250;
                System.out.println(currentLanguage[0]);
            break;
            case 3: money = -100;
                System.out.println(currentLanguage[1]);
                break;
            case 4: money = 100;
                System.out.println(currentLanguage[2]);
                break;
            case 5: money = -20;
                System.out.println(currentLanguage[3]);
                break;
            case 6: money = 180;
                System.out.println(currentLanguage[4]);
                break;
            case 7: money = 0;
                System.out.println(currentLanguage[5]);
                break;
            case 8: money = -70;
                System.out.println(currentLanguage[6]);
                break;
            case 9: money = 60;
                System.out.println(currentLanguage[7]);
                break;
            case 10: money = -80;
                System.out.println(currentLanguage[8]);
            hasExtraTurn = true;
                break;
            case 11: money = -50;
                System.out.println(currentLanguage[9]);
                break;
            case 12: money = 650;
                System.out.println(currentLanguage[10]);
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
