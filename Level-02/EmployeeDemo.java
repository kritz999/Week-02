import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    String name;
    String position;

    Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    void displayEmployee() {
        System.out.println("  Employee Name: " + name + ", Position: " + position);
    }
}

// Department class
class Department {
    String name;
    List<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

// Company class
class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String name) {
        departments.add(new Department(name));
    }

    void displayCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    void deleteCompany() {
        departments.clear();
        System.out.println("Company and all its departments and employees have been deleted.");
    }
}

// Main class to demonstrate
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        company.departments.get(0).addEmployee("Alice", "Software Engineer");
        company.departments.get(0).addEmployee("Bob", "System Administrator");
        company.departments.get(1).addEmployee("Charlie", "Recruiter");

        // Display company details
        company.displayCompany();

        // Delete the company
        company.deleteCompany();
    }
}
