package ObjectOrientedProgramming;
import java.util.Scanner;
public class MovieTicket {
        private String movieName;
        private int seat;
        private double price;

        MovieTicket(String movieName,int seat,double price){
            this.movieName=movieName;
            this.seat= seat;
            this.price=price;
        }

        public void BookTicket( ){
            this.price += this.price+(28/100);

        }

        public void display(){
            System.out.println("Ticket Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seat);
            System.out.println("Price (with tax): " + price);

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MOVIE NAME");
        String movieName = sc.nextLine();

        System.out.println("ENTER SEAT NUMBER");
        int seat = sc.nextInt();

        System.out.println("ENTER THE PRICE");
        double price = sc.nextDouble();

        MovieTicket m1 = new MovieTicket(movieName,seat,price);
        m1.BookTicket();
        m1.display();
        sc.close();
    }
}
