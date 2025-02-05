import java.util.Scanner;

public class grading_system {
    public static void main(String[] args) {
        Scanner any = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int n = any.nextInt(); 
        if (n >= 90) {
            System.out.println("Grade: A");
        } else if (n >= 80 && n < 90) {
            System.out.println("Grade: B");
        } else if (n >= 70 && n < 80) {
            System.out.println("Grade: C");
        } else if (n >= 60 && n < 70) {
            System.out.println("Grade: D");
        } else if (n < 60) {
            System.out.println("Grade: F");
        }
    }
}