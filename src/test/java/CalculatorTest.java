import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName ("Add should return sum of values")
    public void addShouldReturnSumOfValues() {
        //GIVEN
        int value1 = 3;
        int value2 = 5;

        //WHEN
        int sum = Calculator.add(value1, value2);

        //THEN
        assertEquals(8, sum);
    }

    @Test
    public void isGreaterThan100() {
        //GIVEN
        int i = 200;
        int ii = 5;
        int x = 100;

        //WHEN
        boolean isGreater = Calculator.isGreater(i, x);
        boolean isGreater2 = Calculator.isGreater(ii, x);

        //THEN
        assertTrue(isGreater);
        assertFalse(isGreater2);
    }

}
