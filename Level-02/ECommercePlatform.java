import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Order class
class Order {
    int orderId;
    Customer customer;
    List<Product> products;
    double totalAmount;

    Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    // Add a product to the order
    void addProduct(Product product) {
        products.add(product);
        totalAmount += product.price; // Update the total amount of the order
    }

    // Display order details
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customer.getName());
        System.out.println("Products in the order:");
        for (Product product : products) {
            product.displayProduct();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}

// Customer class
class Customer {
    String name;
    List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    // Place an order
    void placeOrder(Order order) {
        orders.add(order);
    }

    // Display customer's orders
    void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 799.49);
        Product product3 = new Product("Headphones", 149.99);

        // Create a customer
        Customer customer = new Customer("Krishna");

        // Create an order for the customer
        Order order1 = new Order(101, customer);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places the order
        customer.placeOrder(order1);

        // Create another order for the customer
        Order order2 = new Order(102, customer);
        order2.addProduct(product3);

        // Customer places the second order
        customer.placeOrder(order2);

        // Display all orders placed by the customer
        customer.displayCustomerOrders();
    }
}
