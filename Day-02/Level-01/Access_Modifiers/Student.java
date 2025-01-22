
public class Student {
    // Public variable (can be accessed directly)
    public int rollNumber;
    
    // Protected variable (accessible within the same package and subclasses)
    protected String name;
    
    // Private variable (can only be accessed within the class)
    private double CGPA;
    
    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }
    
    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It should be between 0 and 10.");
        }
    }
    
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass PostgraduateStudent
class PostgraduateStudent extends Student {
    
    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // Calling the parent class constructor
    }
    
    // Method to display postgraduate student details (accessing protected members)
    public void displayPostgraduateStudentDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member 'name' from superclass
        System.out.println("CGPA: " + getCGPA()); // Accessing private member 'CGPA' via getter method
    }
    
    public static void main(String[] args) {
        
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayStudentDetails();
        
        s1.setCGPA(9.0);
        System.out.println("\nUpdated Student Details:");
        s1.displayStudentDetails();
        
        // Creating an instance of PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 9.2);
        pgStudent.displayPostgraduateStudentDetails();
    }
}
