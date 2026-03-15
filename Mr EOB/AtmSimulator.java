import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = input.nextInt();


            if (choice > 4) {
                System.out.println("Invalid! please enter a number between 1 to 4");


                }
            

            switch (choice) {

                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful.");
                    System.out.println("New balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                        System.out.println("New balance: " + balance);
                    } 
                    else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }










}
