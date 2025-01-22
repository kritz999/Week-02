import java.util.Scanner;

class Vehicle {
    // Static variable shared across all vehicles
    static double registrationFee = 500.0; // Default registration fee

    // Final variable to ensure registration number cannot be changed
    private final String registrationNumber;

    // Instance variables for vehicle details
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName; // Resolving ambiguity with 'this'
        this.vehicleType = vehicleType; // Resolving ambiguity with 'this'
        this.registrationNumber = registrationNumber; // Resolving ambiguity with 'this'
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle registration details
    public void displayDetails() {
        if (this instanceof Vehicle) { // Checking instance type
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Not a valid Vehicle instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Update registration fee (optional)
        System.out.print("Enter new registration fee: ");
        double newFee = input.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        input.nextLine(); // Consume newline

        // Creating vehicles
        System.out.print("Enter owner name: ");
        String owner1 = input.nextLine();
        System.out.print("Enter vehicle type: ");
        String type1 = input.nextLine();
        System.out.print("Enter registration number: ");
        String regNum1 = input.nextLine();

        Vehicle vehicle1 = new Vehicle(owner1, type1, regNum1);

        System.out.print("Enter owner name: ");
        String owner2 = input.nextLine();
        System.out.print("Enter vehicle type: ");
        String type2 = input.nextLine();
        System.out.print("Enter registration number: ");
        String regNum2 = input.nextLine();

        Vehicle vehicle2 = new Vehicle(owner2, type2, regNum2);

        // Display details of vehicles
        System.out.println("\nVehicle 1 Details:");
        vehicle1.displayDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayDetails();

        input.close();
    }
}
