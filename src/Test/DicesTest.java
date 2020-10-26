package Test;
import Game.Dices;
import Game.Die;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.hamcrest.MatcherAssert.assertThat;

public class DicesTest {

    int one; int two; int three; int four; int five; int six;

    @Test
    public void getDicesTest() {

        Dices dices = new Dices();

        for (int i = 10000; i > 0; --i){
            dices.roll();
            assertTrue(String.valueOf(true),dices.sum()>=2);
            assertTrue(String.valueOf(true),dices.sum()<=12);

        }
    }

    @Test
    public void getDieTest(){

        Die die = new Die(6);

        for (int i = 60000; i>=0; i--){
            die.roll();

            if(die.getValue()==1)
                one += 1;
            if(die.getValue()==2)
                two += 1;
            if(die.getValue()==3)
                three += 1;
            if(die.getValue()==4)
                four += 1;
            if(die.getValue()==5)
                five += 1;
            if(die.getValue()==6)
                six += 1;
        }
        assertEquals(10000,one,400);
        assertEquals(10000,two,400);
        assertEquals(10000,three,400);
        assertEquals(10000,four,400);
        assertEquals(10000,five,400);
        assertEquals(10000,six,400);
    }
}
