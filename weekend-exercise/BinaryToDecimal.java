import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        int decimal = 0;

        for (int count = 0; count < binary.length(); count++) {
            char digit = binary.charAt(count);
            decimal = decimal * 2 + (digit - '0');
        }

        System.out.println(decimal);
    }
}
