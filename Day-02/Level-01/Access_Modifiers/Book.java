public class Book {
   // can be accessed directly
    public String ISBN;
    
    // Protected variable= accessible within the same package and subclasses
    protected String title;
    
    // Private variable = can only be accessed within the class
    private String author;
    
    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
   
    public void setAuthor(String author) {
        this.author = author;
    }
    

    public String getAuthor() {
        return author;
    }
    
    
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook
class EBook extends Book {
    
    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); 
    }
    
    // Method to display EBook details (accessing ISBN and title from the superclass)
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); 
        System.out.println("Title: " + title); 
        System.out.println("Author: " + getAuthor()); 
    }
    
    public static void main(String[] args) {
        // Creating an instance of Book
        Book b1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        b1.displayBookDetails();
        
        // Modifying the author name using setter method
        b1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Book Details:");
        b1.displayBookDetails();
        
        // Creating an object of EBook
        EBook eB1 = new EBook("978-1-23-456789-7", "Advanced Java", "Mark Lee");
        eB1.displayEBookDetails();
    }
}