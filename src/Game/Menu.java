package Game;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    private String Language;
    private boolean ReadLanguage = true;
    String player1 = "";
    String player2 = "";

    public void Menu(){

        System.out.println("Dansk/English");

        while (ReadLanguage == true){

        String LanguageString = scan.nextLine();
        String LanguageStringLower = LanguageString.toLowerCase();

        if (LanguageStringLower.equals("dansk") || LanguageStringLower.equals("danish")) {
            Language = "danish";
            ReadLanguage = false;
        } else if (LanguageStringLower.equals("engelsk") || LanguageStringLower.equals("english")) {
            Language = "english";
            ReadLanguage = false;
        } else {
            System.out.println("Unknown input, try again");
        }
        }

        if(Language == "danish") {
            System.out.println("Velkommen til spillet!");

            System.out.print("Indtast navn for spiller 1: ");
            player1 = scan.nextLine();

            System.out.print("Indtast navn for spiller 2: ");
            player2 = scan.nextLine();
        }

        else if(Language == "english") {
            System.out.println("Welcome to the game!");

            System.out.print("Enter name for player 1: ");
            player1 = scan.nextLine();

            System.out.print("Enter name for player 2: ");
            player2 = scan.nextLine();
        }

    }
    public String getLanguage() {
        return Language;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }
}