import java.util.Scanner;

class Book {
    // Static variable shared across all books
    static String libraryName = "Central Library";

    // Final variable to ensure ISBN cannot be changed
    private final String isbn;

    // Instance variables for book details
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title; // Resolving ambiguity with 'this'
        this.author = author; // Resolving ambiguity with 'this'
        this.isbn = isbn; // Resolving ambiguity with 'this'
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayDetails() {
        if (this instanceof Book) { // Checking instance type
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display library name
        Book.displayLibraryName();

        // Creating books
        System.out.print("Enter book title: ");
        String title1 = input.nextLine();
        System.out.print("Enter book author: ");
        String author1 = input.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn1 = input.nextLine();

        Book book1 = new Book(title1, author1, isbn1);

        System.out.print("Enter book title: ");
        String title2 = input.nextLine();
        System.out.print("Enter book author: ");
        String author2 = input.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn2 = input.nextLine();

        Book book2 = new Book(title2, author2, isbn2);

        // Display details of books
        System.out.println("\nBook 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();

        input.close();
    }
}