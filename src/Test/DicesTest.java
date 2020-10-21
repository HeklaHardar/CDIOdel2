package Test;
import Game.Dices;
import Game.Die;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.hamcrest.MatcherAssert.assertThat;

public class DicesTest {

    @Test
    public void getDicesTest() {

        Dices dices = new Dices();

        for (int i = 10000; i > 0; --i){
            dices.roll();
            assertTrue(String.valueOf(true),dices.sum()>=2);
            assertTrue(String.valueOf(true),dices.sum()<=12);

        }




    }
    }
