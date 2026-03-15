public class CharacterAtEvenPosition{


public static String getEvenCharacters(String word) {
        String result = "";
        for (int count = 0; count < word.length(); count += 2) {
            result += word.charAt(count);
        }
        return result;
    }


   
}
