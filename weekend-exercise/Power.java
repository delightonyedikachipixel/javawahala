import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1; 

        for (int count = 1; count <= exponent; count++) {
            result = result * base; 
        }

        System.out.println(base + "^" + exponent + " = " + result);

        
    }
}
