//package ObjectOrientedProgramming;

  public class Employee{
    private String name;
    private int id;
    private double salary;

    //constructor
    Employee(String name,int id,double salary){
        this.name = name;
        this.id=id;
        this.salary=salary;
    }

	//method
    public void displayResult(){
        System.out.println("Nmae of the employee is "+ name+" ID of the employee is "+ id +" salary is :" +salary);
    }




    public static void main(String[] args) {
        Employee e1 = new Employee("Kritika",23,2300);
            e1.displayResult();

    }

}

