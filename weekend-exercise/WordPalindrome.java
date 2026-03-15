import java.util.Scanner;

public class WordPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine(); 

        String reversedword = ""; 

        for (int count = word.length() - 1; count >= 0; count--) {
            reversedword += word.charAt(count); 
        }

        if (word.equals(reversedword)) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }

    }
}

