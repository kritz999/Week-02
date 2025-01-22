import java.util.Scanner;

class Product {
    // Static variable for discount percentage shared across all products
    static double discount = 10.0; // Default discount percentage

    // Final variable to ensure product ID cannot be changed
    private final int productID;

    // Instance variables for product details
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; // Resolving ambiguity with 'this'
        this.productName = productName; // Resolving ambiguity with 'this'
        this.price = price; // Resolving ambiguity with 'this'
        this.quantity = quantity; // Resolving ambiguity with 'this'
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void displayDetails() {
        if (this instanceof Product) { // Checking instance type
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Discounted Price: $" + discountedPrice);
        } else {
            System.out.println("Not a valid Product instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Updating the discount (optional)
        System.out.print("Enter new discount percentage: ");
        double newDiscount = input.nextDouble();
        Product.updateDiscount(newDiscount);
        input.nextLine(); // Consume newline

        // Creating products
        System.out.print("Enter product ID: ");
        int id1 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter product name: ");
        String name1 = input.nextLine();
        System.out.print("Enter product price: ");
        double price1 = input.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity1 = input.nextInt();

        Product product1 = new Product(id1, name1, price1, quantity1);

        System.out.print("Enter product ID: ");
        int id2 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter product name: ");
        String name2 = input.nextLine();
        System.out.print("Enter product price: ");
        double price2 = input.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity2 = input.nextInt();

        Product product2 = new Product(id2, name2, price2, quantity2);

        // Display details of products
        System.out.println("\nProduct 1 Details:");
        product1.displayDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayDetails();

        input.close();
    }
}
