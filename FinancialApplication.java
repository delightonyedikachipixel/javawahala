import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter loan duration in years: ");
        double loanDuration = input.nextDouble();

        double months = loanDuration * 12;

       
        for (double rate = 5.00; rate <= 10.00; rate += 0.25) {

            double monthlyInterest = rate / 100 / 12;

            
            double monthlyPayment = (loanAmount * monthlyInterest) /
                    (1 - Math.pow(1 + monthlyInterest, -months));

            double totalPayment = monthlyPayment * months;

            System.out.printf("%.2f\t%.2f\t%.2f\n",
                    rate, monthlyPayment, totalPayment);
        }

        
    }
}
