import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int count = 0;

        for (int counter = 0; counter < sentence.length(); counter++) {
            
            if (sentence.charAt(counter) == ' ') {
                count++;
            }
        }

        count++; 

        System.out.println(count);

        
    }
}
