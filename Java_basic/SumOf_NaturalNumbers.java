import java.util.Scanner;

public class SumOf_NaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        Scanner any = new Scanner(System.in);
        int n = any.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count = count + i;
        }
        System.out.println("Sum = " + count);
    }
}