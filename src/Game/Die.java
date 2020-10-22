package Game;

import java.lang.Math;

public class Die {
    // Defines variables
    int max;
    int min = 1;
    int Value;

    // Determines the maximum value of the die and rolls it
    public Die(int maximum) {
        max = maximum + 1;
        roll();
    }

    public int getValue() {
        return Value;
    }

    public int roll() {
        Value = (int) (Math.random() * (max - min) + min);
        return Value;
    }
}