import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    public void addTest(){
        //GIVEN
        int valueOne = 3;
        int valueTwo = 5;

        //WHEN
        int sum = Calculator.add(valueOne, valueTwo);

        //THEN
        assertEquals(8, sum);
    }

    @Test
    public void moreThan100Test() {
        //GIVEN
        int valueThree = 199;

        //WHEN
        boolean moreThan100 = Calculator.moreThan100(valueThree);

        //THEN
        //assertEquals(true, moreThan100);
        assertTrue(Calculator.moreThan100(valueThree));
    }

    @Test
    public void checkPersonThresholdTest() {
        //GIVEN
        int numberOfPeople = 31;

        //THEN
        assertEquals("Zu viele Personen, sofort zurück", Calculator.checkPersonThreshold(numberOfPeople));
    }

}
