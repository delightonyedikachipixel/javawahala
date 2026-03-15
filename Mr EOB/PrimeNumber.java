import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

       

        
        if (number <= 1) {
            System.out.println(number + " is not prime");
        } 
        else {
            boolean isPrime = true;

            for (int counter = 2; counter < number; counter++) {
                if (number % counter == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is prime");
            } 
            else {
                System.out.println(number + " is not prime");
            }
        }

        
        System.out.println("Prime numbers from 1 to " + number + " are:");

        for (int count = 2; count <= number; count++) {
            boolean isPrime = true;

            for (int counter = 2; counter < count; counter++) {
                if (count % counter == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(count);
            }
        }
    }
}
