import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 16;
        int guess = 1;

      
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed it!");
            } 
            




            else if (guess <= secretNumber - 5 ) {
                System.out.println("Too low!");
            } 


            
            
            else {
                System.out.println("Too high!");
            }
        }

        
    }
}
