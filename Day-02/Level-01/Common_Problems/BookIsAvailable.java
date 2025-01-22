public class Book {
    public String title;
    public String author;
    public double price;
    public boolean isAvailable;

    // Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book: " + title + " is currently unavailable.");
            return false;
        }
    }

    //@Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + ", isAvailable=" + isAvailable + "}";
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 9.99, true);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99, false);

        System.out.println(b1);
        System.out.println(b2);

        b1.borrowBook(); // Borrowing available book
        b2.borrowBook(); // Attempting to borrow unavailable book

        System.out.println(b1);
        System.out.println(b2);
    }
}
