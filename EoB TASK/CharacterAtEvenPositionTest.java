import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  CharacterAtEvenPositionTest{

@Test
    public void testgetEvenCharacters() {
        String result =  CharacterAtEvenPosition.getEvenCharacters("delight");
        assertEquals("dlgt", result);
    }




}
