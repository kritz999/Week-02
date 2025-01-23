import java.util.ArrayList;
import java.util.List;

// Professor class
class Professor {
    String name;
    List<Course> courses;

    Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method for assigning professor to a course
    void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setProfessor(this); // Assign professor to course
        }
    }

    // Display the courses the professor is teaching
    void displayCourses() {
        System.out.println("Professor " + name + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println("  " + course.getCourseName());
        }
    }
}

// Student class
class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method for student to enroll in a course
    void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Enroll student in the course
        }
    }

    // Display the courses the student is enrolled in
    void displayCourses() {
        System.out.println("Student " + name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("  " + course.getCourseName());
        }
    }
}

// Course class
class Course {
    String courseName;
    Professor professor;
    List<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Get the course name
    String getCourseName() {
        return courseName;
    }

    // Set the professor for the course
    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Add a student to the course
    void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display the professor and students of the course
    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("  Professor: " + professor.name);
        }
        System.out.println("  Enrolled Students:");
        for (Student student : students) {
            System.out.println("    " + student.name);
        }
    }
}

// Main class (University System)
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create courses
        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display student and course details
        student1.displayCourses();
        student2.displayCourses();
        professor1.displayCourses();
        professor2.displayCourses();
        
        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
