// Base class BankAccount
public class BankAccount {
    // Public variable (can be accessed directly)
    public String accountNumber;
    
    // Protected variable (accessible within the same package and subclasses)
    protected String accountHolder;
    
    // Private variable (can only be accessed within the class)
    private double balance;
    
    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    // Public method to get balance
    public double getBalance() {
        return balance;
    }
    
    // Public method to modify balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. It cannot be negative.");
        }
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance + " USD");
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    
    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance); // Calling the parent class constructor
    }
    
    // Method to display savings account details (accessing accountNumber and accountHolder from superclass)
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public member 'accountNumber' from superclass
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member 'accountHolder' from superclass
        System.out.println("Balance: " + getBalance() + " USD"); // Accessing private member 'balance' via getter method
    }
    
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount a1 = new BankAccount("123456789", "Alice Smith", 5000.0);
        a1.displayAccountDetails();
        
        // Modifying balance using setter method
        a1.setBalance(6000.0);
        System.out.println("\nUpdated Account Details:");
        a1.displayAccountDetails();
        
        // Creating an instance of SavingsAccount
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Bob Johnson", 10000.0);
        savingsAccount1.displaySavingsAccountDetails();
    }
}
