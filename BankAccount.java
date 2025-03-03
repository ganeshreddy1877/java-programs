import java.util.Scanner;

class BankAccount {
    String name;
    int accountNumber;
    int currentBalance;

    // Constructor to initialize the bank account
    BankAccount(String name, int accountNumber, int currentBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        System.out.println("Customer Details: " + name + ", Account Number: " + accountNumber + ", Current Balance: " + currentBalance);
    }

    // Method to withdraw an amount
    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= currentBalance) {
            currentBalance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
            System.out.println("Current Balance: " + currentBalance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    // Method to deposit an amount
    public int deposit(int depositAmount) {
        currentBalance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
        return currentBalance;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for account details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter your initial balance: ");
        int initialBalance = scanner.nextInt();

        // Create a new bank account
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        // Input for withdrawal and deposit
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);

        System.out.print("Enter amount to deposit: ");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);

        // Final balance
        System.out.println("Final Amount: " + account.currentBalance);

        // Close the scanner
        scanner.close();
    }
}