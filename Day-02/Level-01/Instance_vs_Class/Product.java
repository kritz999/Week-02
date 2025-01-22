public class Product {
   
     // attributes

    private String productName;
    private double price;

    // Class variable to track total number of products
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 800.00);

        // Display details of each product
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();

        // Display total products
        Product.displayTotalProducts();
    }
}
