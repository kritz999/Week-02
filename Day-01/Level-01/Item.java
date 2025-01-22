//package ObjectOrientedProgramming;
import java.util.Scanner;
public class Item {
    private int itemCode;
    private String itemName;
    private double price ;


    Item(int itemCode, String itemName , double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;

    }
    public double CalculateTotalCost(int quantity){
        return quantity*price;

    }
    public void display(int quantity,double totalCost){
        System.out.println("The idem code :"+ itemCode+"The item name "+itemName+"the quantity is "+ totalCost);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ITEAM CODE");
        int itemCode = sc.nextInt();

        
        sc.nextLine();//clear the input buffer
        System.out.println("ENTER THE ITEM NAME");
        String itemName = sc.nextLine();

        System.out.println("ENTER THE PRICE");
        double price = sc.nextDouble();

        System.out.println("ENTER THE QUANTITY OF ITEM");
        int quantity = sc.nextInt();

        //creating object of item
        Item I1 = new Item(itemCode,itemName,price);
        
        //calculate total cost
        double totalCost =I1.CalculateTotalCost(quantity);

        I1.display(quantity,totalCost);


    }
}
