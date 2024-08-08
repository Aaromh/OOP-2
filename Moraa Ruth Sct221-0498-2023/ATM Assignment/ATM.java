import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check the account balance
    public void checkBalance() {
        System.out.printf("Your current balance is: %.2f\n", balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. You cannot withdraw more than your balance.");
        } else {
            balance -= amount;
            System.out.printf("You have withdrawn: %.2f\n", amount);
            checkBalance();  // Display the updated balance
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("You have deposited: %.2f\n", amount);
        checkBalance();  // Display the updated balance
    }

    public void transfer(double amount, String bank) {
        double transferCharge = 0;

        if (bank.equalsIgnoreCase("same")) {
            transferCharge = 0;  // No charge for same bank transfer
        } else if (bank.equalsIgnoreCase("other")) {
            transferCharge = amount * 0.001;  // 0.001% charge for other bank transfer
        }

        double totalAmount = amount + transferCharge;

        if (totalAmount > balance) {
            System.out.println("Insufficient funds. You cannot transfer more than your balance.");
        } else {
            balance -= totalAmount;
            System.out.printf("You have transferred: %.2f to %s bank (Charge: %.2f)\n", amount, bank, transferCharge);
            checkBalance();  // Display the updated balance
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(2800.00);  // Initialize the ATM with a starting balance of 2800.00

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. Deposit Money");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Enter the bank type (same/other): ");
                    String bank = scanner.next();
                    atm.transfer(transferAmount, bank);
                    break;
                case 4:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 5:
                    System.out.println("Exiting the ATM. Have a great day!");
                    System.exit(0);  // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}
