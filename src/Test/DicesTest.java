package Test;
import Game.Dices;
import Game.Die;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.hamcrest.MatcherAssert.assertThat;

public class DicesTest {

    int TestRounds = 60000;
    int[] values =new int[6];

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

        for (int i = TestRounds; i>=0; i--){
            die.roll();
            if(die.getValue()==1)
                values[0] += 1;
            if(die.getValue()==2)
                values[1] += 1;
            if(die.getValue()==3)
                values[2] += 1;
            if(die.getValue()==4)
                values[3] += 1;
            if(die.getValue()==5)
                values[4] += 1;
            if(die.getValue()==6)
                values[5] += 1;
        }

        //Tests each value in the array to see if it's close to TestRounds divided by 6
        for (int i:values) {

            assertEquals(TestRounds/6,i,400);
            
        }

    }
}
