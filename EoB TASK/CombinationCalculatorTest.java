import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationCalculatorTest {

    @Test
    public void testCalculateCombination_5_2() {
        int result = CombinationCalculator.calculateCombination(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void testCalculateCombination_9_7() {
        int result = CombinationCalculator.calculateCombination(9, 7);
        assertEquals(36, result);   // Correct result
    }

    @Test
    public void testCalculateCombination_rGreaterThanN() {
        int result = CombinationCalculator.calculateCombination(7, 9);
        assertEquals(-1, result);
    }

    @Test
    public void testCalculateCombination_invalidInput() {
        int result = CombinationCalculator.calculateCombination(3, 5);
        assertEquals(-1, result);
    }

    @Test
    public void testGetFactorialOfNumbers() {
        int result = CombinationCalculator.getFactorialOfNumbers(5);
        assertEquals(120, result);
    }
}
