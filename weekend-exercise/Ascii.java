import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        
        for (int count = 0; count < text.length(); count++) {
            char ch = text.charAt(count);
            int ascii = (int) ch; 
            System.out.println(ch + " = " + ascii);
        }

      
    }
}
