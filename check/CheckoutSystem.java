import java.util.Scanner;

public class CheckoutSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the customer's name?");
        String customerName = input.nextLine();

        System.out.println("What did the user buy?");
        String item1 = input.nextLine();

        System.out.println("How many pieces did the user buy?");
        int quantity1 = input.nextInt();

        System.out.println("How much per unit?");
        double price1 = input.nextDouble();

        System.out.println("Would you like to add more items? (true/false)");
        boolean response = input.nextBoolean();

        String item2 = "";
        int quantity2 = 0;
        double price2 = 0.0;

        if (response) {
            input.nextLine();

            System.out.println("What did the user buy?");
            item2 = input.nextLine();

            System.out.println("How many pieces did the user buy?");
            quantity2 = input.nextInt();

            System.out.println("How much per unit?");
            price2 = input.nextDouble();
        }

        input.nextLine();

        System.out.println("What is the cashier's name?");
        String cashierName = input.nextLine();

        System.out.println("How much discount is the customer getting?");
        double discount = input.nextDouble();

        double total1 = quantity1 * price1;
        double total2 = quantity2 * price2;
        double subTotal = total1 + total2;

        double vat = subTotal * 0.175;
        double billTotal = subTotal - discount + vat;

        System.out.println("====================================================");
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("Tel: 03293828343");
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer: " + customerName);
        System.out.println("====================================================");

        System.out.printf("%-15s %-10s %-15s %-10s%n",
                "ITEM", "QTY", "PRICE", "TOTAL");
        System.out.println("----------------------------------------------------");

        System.out.printf("%-15s %-10d %-15.2f %-10.2f%n",
                item1, quantity1, price1, total1);

        if (response) {
            System.out.printf("%-15s %-10d %-15.2f %-10.2f%n",
                    item2, quantity2, price2, total2);
        }

        System.out.println("----------------------------------------------------");
        System.out.printf("Sub Total: %.2f%n", subTotal);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("VAT @ 17.5%%: %.2f%n", vat);

        System.out.println("====================================================");
        System.out.printf("Bill Total: %.2f%n", billTotal);
        System.out.println("====================================================");

        System.out.print("How much did the customer give to you? ");
        double amountPaid = input.nextDouble();

        if (amountPaid >= billTotal) {
            double balance = amountPaid - billTotal;
            System.out.printf("Balance: %.2f%n", balance);
        } else {
            System.out.println("INSUFFICIENT AMOUNT PAID");
        }

        System.out.println("====================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("====================================================");
    }
}

