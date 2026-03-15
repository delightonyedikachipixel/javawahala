import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VowelsAndConsonantArrayTest {

    @Test
    public void testCountVowelsAndConsonants() {
        int[] expected = {2, 5};
        int[] result = VowelsAndConsonantArray.countVowelsAndConsonants("delight");

        assertArrayEquals(expected, result);
    }
}
