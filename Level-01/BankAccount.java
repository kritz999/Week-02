import java.util.Scanner;

class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "MyBank";
    private static int totalAccounts = 0; // Tracks total number of accounts

    // Final variable to ensure account number cannot be changed
    private final int accountNumber;

    // Instance variable for account holder's name
    private String accountHolderName;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName; // Resolving ambiguity with 'this'
        this.accountNumber = accountNumber; // Resolving ambiguity with 'this'
        totalAccounts++; // Increment total accounts whenever a new account is created
    }

    // Static method to display total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayDetails() {
        if (this instanceof BankAccount) { // Checking instance type
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Not a valid BankAccount instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating accounts
        System.out.print("Enter account holder name: ");
        String name1 = input.nextLine();
        System.out.print("Enter account number: ");
        int accNum1 = input.nextInt();
        input.nextLine(); // Consume newline

        BankAccount account1 = new BankAccount(name1, accNum1);

        System.out.print("Enter account holder name: ");
        String name2 = input.nextLine();
        System.out.print("Enter account number: ");
        int accNum2 = input.nextInt();

        BankAccount account2 = new BankAccount(name2, accNum2);

        // Display details of accounts
        System.out.println("\nAccount 1 Details:");
        account1.displayDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayDetails();

        // Display total number of accounts
        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());

        input.close();
    }
}
