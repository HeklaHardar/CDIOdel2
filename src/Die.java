import java.lang.Math;

public class Die {
    int max;
    int min = 1;

    int Value; //parametre

    public Die(int maximum) { // Konstruktor
        max = maximum + 1;
        roll();
    }

    public int getValue() { //metode
        return Value;
    }

    public int roll() {
        Value = (int) (Math.random() * (max - min) + min);
        return Value;
    }

/* Gammel metode, ikke i brug
    static void Kast() {

        TerningKast terning1 = new TerningKast();
        TerningKast terning2 = new TerningKast();

        // System.out.println("        " + Terning2);

        //System.out.println("Den første terning viser: " + terning1 +
        //                  " og den anden terning viser: " + terning2);
        //System.out.println("Tilsammen har de værdien: " + sumafterninger);
    }
*/
}
