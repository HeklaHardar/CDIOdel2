package Game;

public class Fields {
    boolean hasExtraTurn = false;
    private int money = 0;
    String[] danish = {"Du banker på døren til et højt tårn. En troldmand som bor der åbner døren, og spørger dig om han kan teste sin nye trylleformular på dig. Du siger ja, og han tryller dine øre grønne og giver dig 250 for ulejligheden.", "Du kommer forbi et stort krater. Du synes det er meget flot, og du vil gerne vise det til din mor,  så du køber en souvenir med et billede af det. Du betaler 100. ", "Du har nået indgangen til paladset, og finder 100 på jorden og beholder dem. " , "Du går gennem ørkenen. Det er meget koldt, så du finder en kaffeautomat og køber 1 kop kaffe(som er meget dyr) for at holde varmen. Du mister 20.  " , "Du ankommer til Walled city. Du får et job som turguide of tjener 180. " , "Du holder pause ved klosteret, der sker ikke noget. "
            , "Det er meget mørkt inde i den sorte grotte, så du er nødt til at købe en lommelygte." , "Du finder nogle hytter i bjergene, hvor beboerne giver dig et måltid mad og en seng for natten( værdi 60) " , "Du går hen til en meget lodden væg. Idet du sætter din bagage ned så du kan hvile dig kommer væggen pludselig til live og prøver at bide dig med sit varulve-ansigt. Den spiser din madpakke (værdi 80), og du skynder dig hurtigt væk til en nyt sted. " , "Du snubler pludselig, og falder ned i et stort hul. Du når med nød og næppe at gribe fat i kanten, men da du kravler op af hullet igen falder 50 ud af din lomme, og forsvinder ned i hullets dyb." , "Du finder en mine fuld af guld. Du tager så meget du kan bære, men du er ikke særligt stærk, så du tjener kun 650. " };
    String[]  english = {"You knock on the door of a tall tower. A wizard who lives there opens, and asks you if he can test his new magic spell on you. You agree to it, and he turns your ears green and he pays you 250. ", "You pass a large Crater. You think it’s very beautiful, and you want to show your mother, so you buy a souvenir with a picture of it. You pay 100 ", "You have reached the Palace Gates. You find 100 on the ground, and keep them. " , "You walk through the desert. It’s really cold so you buy an expensive cup of coffee from the coffee machine. You lose 20. " , "You arrive at the Walled city. You get at job as a tourguide, and earn 180. " , "You take a break at the Monastery, nothing happens. "
            , "The black cave is very dark, so you need to buy a flashlight so you can see. You pay 70. " , "You find some huts in the mountain, and the residents give you a nice meal and a nights rest (worth 60) " , "You walk over to a very furry wall. You put you backpack down so you can rest, but suddenly the wall starts moving and tries to bite you with its werewolf-head. The werewolf eats your lunchbox (Worth 80), and you hurry away to find a new place. " , "You stumble and fall into a large Pit. You just manage to hold onto the rim of the Pit, but as you climb up from it 50 falls out of your pocket and gets lost in the Pit. " , "You come across a mine full of gold. You take as much as you can carry, but you’re not very strong, so you only gain 650."};


    public Fields(int sum, String language){
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
