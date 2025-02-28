/* 
Inheritance+Association(Unidirectional)
A university wants to create an automated system to manage courses, students.The Person class is the base class with name,age, and display() method, from which the Student is derived and overrides the method. The Student class has additional attributes like semesterName, enrollmentStatus , listOfEnrooledCOurse, and methods to enroll in courses and displayDetails().The Course class represents a course and contains details like courseName, courseCode, noOfCredit.*/
import java.util.ArrayList;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("AGe:" + age);
    }
}

class Student extends Person {
    public String semesterName;
    String enrollmentStatus;
    ArrayList<Course> listOFEnrooledCourses = new ArrayList<>();

    public Student(String name, int age, String semesterName, String enrollmentStatus) {
        super(name, age);
        this.semesterName = semesterName;
        this.enrollmentStatus = enrollmentStatus;
    }

    public void listOFEnrooledCourses(Course course) {
        listOFEnrooledCourses.add(course);
    }

    public void displayDetails() {
        System.out.println("Semester Name:" + semesterName);
        System.out.println("Enroll Status:" + enrollmentStatus);
        System.out.println("Enroll courses:");
        for (int i = 0; i < listOFEnrooledCourses.size(); i++) {
            listOFEnrooledCourses.get(i).displayinfo();
        }
    }
}

class Course {
    String courseName;
    String courseCode;
    int noOfCredit;

    public Course(String courseName, String courseCode, int noOfCredit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.noOfCredit = noOfCredit;
    }

    public void displayinfo() {
        System.out.println(courseName);
        System.out.println(courseCode);
        System.out.println(noOfCredit);
    }
}

public class university {

    public static void main(String[] args) {
        Course course1 = new Course("OOP","CSE221",3);
        Course course2 = new Course("OOP lab","CSE223",1);

        Student studen1 = new Student("Osman faruq", 21, "3rd","yes");
        studen1.listOFEnrooledCourses(course1);
        studen1.listOFEnrooledCourses(course2);
        studen1.displayDetails();
    }
}