import java.util.Scanner;

class Patient {
    // Static variable shared across all patients
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0; // Tracks total number of patients

    // Final variable to ensure patient ID cannot be changed
    private final int patientID;

    // Instance variables for patient details
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name; // Resolving ambiguity with 'this'
        this.age = age; // Resolving ambiguity with 'this'
        this.ailment = ailment; // Resolving ambiguity with 'this'
        this.patientID = patientID; // Resolving ambiguity with 'this'
        totalPatients++; // Increment total patients when a new patient is created
    }

    // Static method to get the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) { // Checking instance type
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Not a valid Patient instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display hospital name
        System.out.println("Welcome to " + hospitalName);

        // Creating patients
        System.out.print("Enter patient name: ");
        String name1 = input.nextLine();
        System.out.print("Enter age: ");
        int age1 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter ailment: ");
        String ailment1 = input.nextLine();
        System.out.print("Enter patient ID: ");
        int patientID1 = input.nextInt();
        input.nextLine(); // Consume newline

        Patient patient1 = new Patient(name1, age1, ailment1, patientID1);

        System.out.print("Enter patient name: ");
        String name2 = input.nextLine();
        System.out.print("Enter age: ");
        int age2 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter ailment: ");
        String ailment2 = input.nextLine();
        System.out.print("Enter patient ID: ");
        int patientID2 = input.nextInt();

        Patient patient2 = new Patient(name2, age2, ailment2, patientID2);

        // Display details of patients
        System.out.println("\nPatient 1 Details:");
        patient1.displayDetails();

        System.out.println("\nPatient 2 Details:");
        patient2.displayDetails();

        // Display total patients
        System.out.println("\n");
        Patient.getTotalPatients();

        input.close();
    }
}