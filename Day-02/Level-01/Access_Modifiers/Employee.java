// Base class Employee
public class Employee {
    // Public variable (can be accessed directly)
    public int employeeID;
    
    // Protected variable (accessible within the same package and subclasses)
    protected String department;
    
    // Private variable (can only be accessed within the class)
    private double salary;
    
    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Public method to modify salary
    public void modifySalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. It cannot be negative.");
        }
    }
    
    // Public method to get salary
    public double getSalary() {
        return salary;
    }
    
    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary + " USD");
    }
}

// Subclass Manager
class Manager extends Employee {
    
    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Calling the parent class constructor
    }
    
    // Method to display manager details (accessing employeeID and department from superclass)
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public member 'employeeID' from superclass
        System.out.println("Department: " + department); // Accessing protected member 'department' from superclass
        System.out.println("Salary: " + getSalary() + " USD"); // Accessing private member 'salary' via getter method
    }
    
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee e1 = new Employee(101, "Sales", 50000.0);
        e1.displayEmployeeDetails();
        
        // Modifying salary using the public method
        e1.modifySalary(55000.0);
        System.out.println("\nUpdated Employee Details:");
        e1.displayEmployeeDetails();
        
        // Creating an instance of Manager
        Manager m1 = new Manager(102, "Marketing", 70000.0);
        m1.displayManagerDetails();
    }
}
