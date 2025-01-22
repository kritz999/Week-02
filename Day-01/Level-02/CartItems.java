//package ObjectOrientedProgramming;
import java.util.Scanner;

 class CartItems {
    String itemName;
    double price;
    int quantity;

    CartItems(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;

    }

    void addItem(String itemName, int quant, int index, CartItems[] cart) {
        cart[index].quantity += quantity;
    }
    void removeItem(String itemName, int quant, int index, CartItems[] cart) {
        cart[index].quantity -= quantity;
    }

    static void totalcost(CartItems[] cart){
        int sum = 0;
        for(int i = 0; i < cart.length; i++){
            sum += (cart[i].price* cart[i].quantity);
        }

        System.out.println("The total cost is " + sum);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Taking input number of items from the user
        System.out.println("Enter the number of items : ");
        int n = input.nextInt();

        CartItems[] cart = new CartItems[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the item name : ");
            String itemName = input.next();
            System.out.println("Enter the price : ");
            double price = input.nextDouble();
            System.out.println("Enter the quantity : ");
            int quantity = input.nextInt();

            cart[i] = new CartItems(itemName, price, quantity);
        }

        while(true)
        {
            System.out.println("Enter 1 to add, 2 to remove from cart, 3 to find total chose and -1 to exit : ");
            int choice = input.nextInt();
            if(choice == -1) break;

            if(choice == 1){
                System.out.println("Enter the item name : ");
                String Name = input.next();
                System.out.println("Enter the quantity : ");
                int quant = input.nextInt();

                for(int i = 0; i < cart.length; i++) {
                    if (cart[i].itemName == Name) {
                        cart[i].addItem(Name, quant, i, cart);
                        break;
                    }
                }
            }
            else if(choice == 2){
                System.out.println("Enter the item name : ");
                String Name = input.next();
                System.out.println("Enter the quant : ");
                int quant = input.nextInt();

                for(int i = 0; i < cart.length; i++) {
                    if (cart[i].itemName == Name) {
                        cart[i].removeItem(Name, quant, i, cart);
                        break;
                    }
                }
            }
            else if(choice == 3){
                totalcost(cart);
            }
        }
    }

}