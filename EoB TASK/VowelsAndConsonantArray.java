

public class VowelsAndConsonantArray {

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase(); 

        for (int count = 0; count < text.length(); count++) {
            char characters = text.charAt(count);  

            if (characters == 'a' || characters == 'e' || characters == 'i' 
                    || characters == 'o' || characters == 'u') {
                vowels++;
            } else if (Character.isLetter(characters)) {  
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }


}
