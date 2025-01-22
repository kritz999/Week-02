public class Course {
    // Class variable (common for all courses)
    static String instituteName = "Default Institute";
    
    // Instance variables
    private String courseName;
    private int duration; // duration in months
    private double fee;
    
    // Constructor to initialize instance variables
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Duration: " + this.duration + " months");
        System.out.println("Fee: " + this.fee + " USD");
        System.out.println("Institute Name: " + Course.instituteName);
    }
    
    // Class method to update institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        Course.instituteName = newInstituteName;
    }
    
    public static void main(String[] args) {
        // Creating an instance of Course
        Course c1 = new Course("Java Programming", 3, 250.0);
        c1.displayCourseDetails();
        
        Course.updateInstituteName("Advanced Institute of Technology");
        System.out.println("\nAfter updating institute name:");
        
        course1.displayCourseDetails();
        
        Course c2 = new Course("Data Science", 6, 500.0);
        c2.displayCourseDetails();
    }
}
