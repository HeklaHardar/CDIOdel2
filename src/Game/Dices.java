package Game;

public class Dices {

    Die die1 = new Die(6);
    Die die2 = new Die(6);

    public int sum(){
        return die1.getValue() + die2.getValue();
    }
    public Dices roll(){
        die1.roll();
        die2.roll();
        return this;
    }

    @Override
    public String toString() {
        return
                 die1.getValue() +
                ", " + die2.getValue();
    }
}
