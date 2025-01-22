public class Vehicle {

    static double registrationFee = 100.0;
    
    // Instance variables
    private String ownerName;
    private String vehicleType;
    
    // Constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Fee: " + Vehicle.registrationFee + " USD");
    }
    
    // Class method to update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        Vehicle.registrationFee = newFee;
    }
    
    public static void main(String[] args) {
        // Creating instances of Vehicle
        Vehicle v1 = new Vehicle("John Doe", "Car");
        Vehicle v2 = new Vehicle("Jane Smith", "Motorcycle");
        
        // Displaying vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        
        // Updating the registration fee
        Vehicle.updateRegistrationFee(150.0);
        System.out.println("\nAfter updating registration fee:");
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
