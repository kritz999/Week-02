
import java.util.Scanner;
public class MobilePhone {
    private String brand1;
    private String model;
    private double price;

    MobilePhone(String brand1, String model, double price){
        this.brand1=brand1;
        this.model =model;
        this.price = price;

    }

    public void  displayDetails(){
        System.out.println("The details of mobile is brand  "+ brand1 +"\nthe model is"+ model + "\nthe price "+ price);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER BRAND1");
        String brand1 =sc.nextLine();

        System.out.println("ENTER MODEL");
        String model = sc.nextLine();

        System.out.println("ENTER THE PRICE");
        double price = sc.nextDouble();

        MobilePhone m1 = new MobilePhone(brand1,model,price);
        m1.displayDetails();


    }
}
