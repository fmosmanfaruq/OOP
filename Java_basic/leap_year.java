import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner any = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int n = any.nextInt();
        if (n % 4 == 0 && n % 100 == 0 || n % 400 == 0) {
            System.out.println(n + " the year is leap year");
        } else {
            System.out.println(n + " thr year is non-leap year");
        }
    }
}
