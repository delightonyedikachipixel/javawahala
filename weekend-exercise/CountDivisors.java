import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0;
        
        
        for (int counter = 1; counter <= num; counter++) {
            if (num % counter == 0) { 
                count++;
                
            }
        }

        System.out.println(" number of divisors: " + count);
    }
}
