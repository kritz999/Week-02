//package New;
import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    private String bankName;
    private List<Customer> customers;

    // Constructor for Bank class
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    
    public void openAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer); 
        }
        System.out.println("Account opened for " + customer.getName() + " at " + this.bankName + ".");
    }

    
    public String getBankName() {
        return bankName;
    }

    
    public List<Customer> getCustomers() {
        return customers;
    }
}

// Customer class
class Customer {
    private String name;
    private List<BankAccount> accounts;

    // Constructor for Customer class
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account for the customer
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // Method to view the balance of a particular account
    public void viewBalance(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < accounts.size()) {
            BankAccount account = accounts.get(accountIndex);
            System.out.println("Balance for account " + account.getAccountNumber() + ": $" + account.getBalance());
        } else {
            System.out.println("Invalid account index.");
        }
    }

    // Getter for customer's name
    public String getName() {
        return name;
    }

    // Getter for customer's accounts
    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

// BankAccount class to represent a bank account
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor for BankAccount class
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get the balance of the account
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}


public class BankDemo{
    public static void main(String[] args) {
        // Create a bank instance
        Bank bank = new Bank("Global Bank");
        
        Customer customer1 = new Customer("Kritika");
        Customer customer2 = new Customer(" Alex ");

        
        BankAccount account1 = new BankAccount("ACC12345", 5000.0);
        BankAccount account2 = new BankAccount("ACC67890", 2000.0);

        // Open accounts for the customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer2, account2);

        customer1.viewBalance(0);  
        customer2.viewBalance(0);  

        account1.deposit(1000.0);  
        account1.withdraw(2000.0); 

        
        customer1.viewBalance(0);  
    }
}
