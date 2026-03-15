import java.util.Scanner;

public class LowercaseCount {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String text = input.nextLine();

        
        int lowercaseCounter = 0;

        
        for (int count = 0; count < text.length(); count++) {
            char ch = text.charAt(count);  

            
            if (ch >= 'a' && ch <= 'z') {
                lowercaseCounter++;  
            }
        }

        
        System.out.println("Number of lowercase letters: " + lowercaseCounter);

        
       
    }
}  
