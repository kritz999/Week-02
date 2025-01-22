//package ObjectOrientedProgramming;
import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author,double price){
        this.title = title;
        this.author=author;
        this.price =price;

    }
    public void displayResult(){
        System.out.println("The title of book  :"+title +"\nThe author name :"+ author +"\nThe price "+ price);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TITLE:");
        String title = sc.nextLine();
        System.out.println("ENTER THE AUTHOR NAME:");
        String author = sc.nextLine();
        System.out.println("ENTER THE PRICE:");
        double price = sc.nextDouble();

        Book b1 = new Book(title,author,price);
        b1.displayResult();

    }
}
