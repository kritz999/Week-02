import java.util.Scanner;

class Student {
    // Static variable shared across all students
    static String universityName = "Global University";
    private static int totalStudents = 0; // Tracks total number of students

    // Final variable to ensure roll number cannot be changed
    private final int rollNumber;

    // Instance variables for student details
    private String name;
    private char grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, char grade) {
        this.name = name; // Resolving ambiguity with 'this'
        this.rollNumber = rollNumber; // Resolving ambiguity with 'this'
        this.grade = grade; // Resolving ambiguity with 'this'
        totalStudents++; // Increment total students when a new student is created
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update grade
    public void updateGrade(char newGrade) {
        if (this instanceof Student) { // Checking instance type
            this.grade = newGrade;
        } else {
            System.out.println("Not a valid Student instance.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        if (this instanceof Student) { // Checking instance type
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Not a valid Student instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display university name
        System.out.println("Welcome to " + universityName);

        // Creating students
        System.out.print("Enter student name: ");
        String name1 = input.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber1 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter grade: ");
        char grade1 = input.next().charAt(0);

        Student student1 = new Student(name1, rollNumber1, grade1);

        System.out.print("Enter student name: ");
        input.nextLine(); // Consume newline
        String name2 = input.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber2 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter grade: ");
        char grade2 = input.next().charAt(0);

        Student student2 = new Student(name2, rollNumber2, grade2);

        // Display details of students
        System.out.println("\nStudent 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        // Update grade for student 1
        System.out.print("\nEnter new grade for Student 1: ");
        char newGrade = input.next().charAt(0);
        student1.updateGrade(newGrade);

        // Display updated details of student 1
        System.out.println("\nUpdated Student 1 Details:");
        student1.displayDetails();

        // Display total students
        System.out.println("\n");
        Student.displayTotalStudents();

        input.close();
    }
}
