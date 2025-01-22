//package ObjectOrientedProgramming;
import java.util.Scanner;
public class PalindromeChecker {
    //attributes
    //data member
    private String text;

    //constructor
    PalindromeChecker(String text){
        this.text = text;
    }

    //methods to check palindrome
    public boolean ispalindromeChecker(String text){
        String rev ="";
        for(int i=text.length()-1;i>=0;i--){
            rev = rev+text.charAt(i);
        }

        return text.equals(rev);
    }
    public void display(){
        if (ispalindromeChecker(text)) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEXT");
        String text = sc.nextLine();

        PalindromeChecker p1 = new PalindromeChecker(text);
        p1.ispalindromeChecker(text);
        p1.display();
        sc.close();
    }
}
