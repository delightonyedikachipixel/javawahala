
import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        
        for (int countNumbers = 0; countNumbers < 5; countNumbers++) {
            System.out.print("Enter a number: ");
            double numbers[countNumbers] = input.nextDouble();
        }

        double secondHighest = getSecondHighest(numbers);

        System.out.println("The Second Highest Number is: " + secondHighest);

        
    }

    public static double getSecondHighest(double[] numbers) {

        double highest = numbers[0];
        double secondHighest = numbers[0];

        
        for (int countNumbers = 1; countNumbers < numbers.length; countNumbers++) {
            if (numbers[countNumbers] > highest) {
                highest = numbers[countNumbers];
            }
        }

        
        for (int countNumbers = 0; countNumbers < numbers.length; countNumbers++) {
            if (numbers[countNumbers] > secondHighest && numbers[countNumbers] < highest) {
                secondHighest = numbers[countNumbers];
            }
        }

        return secondHighest;
    }
}











