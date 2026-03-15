import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine(); 

        String reversedNumber = ""; 

        for (int count = number.length() - 1; count >= 0; count--) {
            reversedNumber += number.charAt(count); 
        }

        if (number.equals(reversedNumber)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }
}

