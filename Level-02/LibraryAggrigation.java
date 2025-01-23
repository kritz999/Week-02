//package New;
import java.util.ArrayList;

//creating a class named
 class Book{

     //attributes
     String title;
     String author;

     //constructor
     Book(String title, String author){
         this.title = title;
         this.author = author;
     }

     public String getTitle(){
         return title;
     }

     public String getAuthor(){
         return author;
     }

}

class Library{
     private String name;
     private ArrayList<Book>Books;


     //constructor
     Library(String name){
         this.name= name;
         this.Books = new ArrayList<>();
     }

     //method adding book to a library
    public void addBook(Book book){
        Books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : Books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
}
    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return Books;
    }
}


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("to kill a mocking bird","harper lee");
        Book b2 = new Book("Harry potter", "JK rowling");
        Book b3 = new Book("The immortals of meluha","amish Tripathi");


        Library l1 = new Library("Central library");
        Library l2 = new Library("RGPV library");


        // Add books to libraries
        l1.addBook(b1);
        l1.addBook(b2);

        l2.addBook(b2); 
        l2.addBook(b3);

        // Display books in each library
        l1.displayBooks();
        l2.displayBooks();
    }
}
