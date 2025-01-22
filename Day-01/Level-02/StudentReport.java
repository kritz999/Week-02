//package ObjectOrientedProgramming;
//import java.sql.SQLOutput;
import java.util.Scanner;
public class StudentReport {

    //attributes
    private String name;
    private int rollNumber;
    private double marks;


    //constructor
    StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //function
    public String calculate(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70 && marks<80) {
            return "C";
        } else if (marks >= 60 && marks<70) {
            return "D";
        } else if (marks >= 50 && marks<60) {
            return "E";
        } else {
            return "F";
        }
    }

    //function
    public void displayDetails(){
        String grades = calculate(marks);
        System.out.println("Name of the student :"+name);
        System.out.println("Roll number of the student:"+rollNumber);
        System.out.println("Marks of the student :"+grades);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NAME");
        String name = sc.nextLine();

        System.out.println("ENTER ROLL NUMBER");
        int rollNumber = sc.nextInt();

        System.out.println("ENTER THE MARKS");
        double marks = sc.nextDouble();

        //object
        StudentReport s1 = new StudentReport(name,rollNumber,marks);
        s1.calculate(marks);
        s1.displayDetails();
    }

}
