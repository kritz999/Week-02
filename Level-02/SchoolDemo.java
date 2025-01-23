import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    String courseName;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollCourse(this); // Maintain the association
        }
    }

    void displayEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("  " + student.name);
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

    void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Maintain the association
        }
    }

    void displayEnrolledCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("  " + course.courseName);
        }
    }
}

// School class
class School {
    String schoolName;
    List<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void displayStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student student : students) {
            System.out.println("  " + student.name);
        }
    }
}

// Main class
public class SchoolDemo {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenwood High");

        // Create students
        Student student1 = new Student("Kritika");
        Student student2 = new Student("Simran");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display school students
        school.displayStudents();

        // Display courses each student is enrolled in
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Display students enrolled in each course
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
    }
}
