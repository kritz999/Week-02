//package ObjectOrientedProgramming;


import java.util.Scanner;

public class Circle {
    private double radius ;
    //constructor
    Circle(double radius){
        this.radius= radius;

    }


    //method to find area
    public double area(){
        return Math.PI*radius*radius;
    }
    //method to find circumference
    public double circumference(){
        return 2*Math.PI*radius;
    }
    //method to display the result
    public void display(){
        System.out.println("area of circle : "+ area() + "\ncircumference of circle "+ circumference());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS");
        double radius = sc.nextDouble();

        //making object of circle
        Circle c1 = new Circle(radius);
        //calling the methods using .
        c1.area();
        c1.circumference();
        c1.display();


    }
}
