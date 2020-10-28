package Game;

import java.util.Scanner;

public class Menu {

    // Defines variables and scanner
    Scanner scan = new Scanner(System.in);
    private String Language;
    private boolean ReadLanguage = true;
    private String player1 = "";
    private String player2 = "";

    // Starts the menu
    public void Menu() {
        // Select language
        System.out.println("Dansk/English");

        // Runs a while loop until an available language is selected
        while (ReadLanguage == true) {

            //Makes the input of the user into lowercase
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

        // If danish is selected
        if (Language == "danish") {
            System.out.println("Velkommen til spillet!");

            System.out.print("Indtast navn for spiller 1: ");
            player1 = scan.nextLine();

            System.out.print("Indtast navn for spiller 2: ");
            player2 = scan.nextLine();
            System.out.println("");
        }

        // If english is selected
        else if (Language == "english") {
            System.out.println("Welcome to the game!");

            System.out.print("Enter name for player 1: ");
            player1 = scan.nextLine();

            System.out.print("Enter name for player 2: ");
            player2 = scan.nextLine();
            System.out.println("");
        }

    }

    // Makes the variables accessible in other classes
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