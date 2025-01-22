import java.util.Scanner;

class Employee {
    // Static variable shared across all employees
    static String companyName = "TechCorp";
    private static int totalEmployees = 0; // Tracks total number of employees

    // Final variable to ensure ID cannot be changed
    private final int id;

    // Instance variables for employee details
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        this.name = name; // Resolving ambiguity with 'this'
        this.id = id; // Resolving ambiguity with 'this'
        this.designation = designation; // Resolving ambiguity with 'this'
        totalEmployees++; // Increment total employees when a new employee is created
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        if (this instanceof Employee) { // Checking instance type
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Not a valid Employee instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display company name
        System.out.println("Welcome to " + companyName);

        // Creating employees
        System.out.print("Enter employee name: ");
        String name1 = input.nextLine();
        System.out.print("Enter employee ID: ");
        int id1 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter designation: ");
        String designation1 = input.nextLine();

        Employee emp1 = new Employee(name1, id1, designation1);

        System.out.print("Enter employee name: ");
        String name2 = input.nextLine();
        System.out.print("Enter employee ID: ");
        int id2 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter designation: ");
        String designation2 = input.nextLine();

        Employee emp2 = new Employee(name2, id2, designation2);

        // Display details of employees
        System.out.println("\nEmployee 1 Details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();

        // Display total employees
        System.out.println("\n");
        Employee.displayTotalEmployees();

        input.close();
    }
}
