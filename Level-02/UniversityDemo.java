import java.util.ArrayList;
import java.util.List;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void displayFaculty() {
        System.out.println("  Faculty Name: " + name);
    }
}

// Department class (Composition - exists only within a University)
class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void displayDepartment() {
        System.out.println("  Department Name: " + name);
    }
}

// University class
class University {
    String name;
    List<Department> departments; // Composition
    List<Faculty> facultyMembers; // Aggregation

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Add a department to the university
    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add a faculty member to the university
    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Display university details
    void displayUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayDepartment();
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFaculty();
        }
    }

    // Delete the university (composition relationship)
    void deleteUniversity() {
        departments.clear(); // Deleting the university deletes all its departments
        System.out.println("University and all its departments have been deleted.");
    }
}

// Main class
public class UniversityDemo {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Global University");

        // Add departments to the university
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Create faculty members (independent of university or departments)
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display university details
        university.displayUniversity();

        // Delete the university
        university.deleteUniversity();

        // Faculty still exists independently
        System.out.println("Independent Faculty Members:");
        faculty1.displayFaculty();
        faculty2.displayFaculty();
    }
}
