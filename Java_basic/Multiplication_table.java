import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner any = new Scanner(System.in);
        int n = any.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
