public class Circle {
    private double radius;

    // Constructor with default radius
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

     // @Override 
    public String toString() {
        return "Circle with radius: " + radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();    // Default radius
        Circle c2 = new Circle(5.0); // User-provided radius

        System.out.println(c1); // Output: Circle with radius: 1.0
        System.out.println(c2); // Output: Circle with radius: 5.0
    }
}
