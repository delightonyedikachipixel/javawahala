import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        
        for (int counter = 1; counter <= num; counter++) {
            if (num % counter == 0) { 
                System.out.print(counter + " ");
            }
        }


    }
}
