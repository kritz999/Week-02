public class CarRental {
    public String customerName;
    public String carModel;
    public int rentalDays;
    public static final double DAILY_RATE = 50.0; // Daily rental rate

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    @Override
    public String toString() {
        return "CarRental{customerName='" + customerName + "', carModel='" + carModel + "', rentalDays=" + rentalDays + ", totalCost=" + calculateTotalCost() + "}";
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental(); // Default rental
        CarRental r2 = new CarRental("John Doe", "SUV", 5); // Parameterized rental

        System.out.println(r1); // Output: Default rental details
        System.out.println(r2); // Output: Parameterized rental details with total cost
    }
}
