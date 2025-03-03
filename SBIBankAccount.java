class SBIBankAccount {
    String name;
    int accountNumber;
    int currentBalance;

    // Constructor to initialize the bank account
    SBIBankAccount(String name, int accountNumber, int currentBalance) {
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
        // Hardcoded account details
        String name = "Abhi";
        int accountNumber = 123456;
        int initialBalance = 10000;

        // Create a new bank account
        SBIBankAccount account = new SBIBankAccount(name, accountNumber, initialBalance);

        // Hardcoded withdrawal and deposit amounts
        int withdrawAmount1 = 15000; // Attempt to withdraw more than the balance
        account.withdraw(withdrawAmount1);

        int withdrawAmount2 = 5000; // Valid withdrawal
        account.withdraw(withdrawAmount2);

        int depositAmount = 5001; // Deposit amount
        account.deposit(depositAmount);

        // Final balance
        System.out.println("Final Amount: " + account.currentBalance);
    }
}