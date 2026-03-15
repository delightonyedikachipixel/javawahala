import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        int position = 0;

        for (int count = 0; count < word.length(); count++) {
            char c = word.charAt(count); 

         
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                position = count; 

                    System.out.println("First vowel '" + word.charAt(position) + "' found at position: " + position);
                    
            }
        }

      
    }
}

