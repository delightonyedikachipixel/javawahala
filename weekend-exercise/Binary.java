import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int decimal = scanner.nextInt();

        String binary = ""; 
        int num = decimal; 

        while (num > 0) {
            int remainder = num % 2;       
            binary = remainder + binary;      
            num = num / 2;                     
        }
         System.out.println("Decimal " + decimal + " in binary is: " + binary);
}
}
