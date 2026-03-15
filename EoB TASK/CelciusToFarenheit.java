import java.util.Scanner;

public class CelciusToFarenheit {

    public static void displayTemperatures() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Celsius temperature: ");
        int temperature = input.nextInt();

        for (int count = 0; count <= temperature; count++) {

            double fahrenheit = getTemperatureInFarenheit(count);

            System.out.println(count + " Celsius = " + fahrenheit + " Fahrenheit");
        }
    }

    public static double getTemperatureInFarenheit(double temperature) {

        double fahrenheit = temperature * 1.8 + 32;

        return fahrenheit;
    }
}

