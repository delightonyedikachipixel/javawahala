import java.util.Scanner;

public class UppercaseCount {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String text = input.nextLine();

        
        int uppercaseCounter = 0;

        
        for (int count = 0; count < text.length(); count++) {
            char ch = text.charAt(count);  

            
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCounter++;  
            }
        }

        
        System.out.println("Number of uppercase letters: " + uppercaseCounter);

        
       
    }
}  
