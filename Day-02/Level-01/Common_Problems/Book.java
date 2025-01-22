package Constructor;
import java.util.Scanner;
public class Book {
     private String title;
     private String author;
     private double price;

     //default constructor
     Book(){
         this.title="hello";
         this.author="jrr";
         this.price= 123.0;
     }


     //parametrized constructor
    Book(String title, String author,double price){
        this.title = title;
        this.author =author;
        this.price=price;
    }
    public void display(){
        System.out.println("the title is "+ title);
        System.out.println("author is "+author);
        System.out.println("price "+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the title");
        String title = sc.nextLine();

        System.out.println("enter the author");
        String author = sc.nextLine();

        System.out.println("enter price");
        double price = sc.nextDouble();


        Book b1 = new Book();
        b1.display();
        Book b2 = new Book(title,author,price);
        b2.display();
    }
}
