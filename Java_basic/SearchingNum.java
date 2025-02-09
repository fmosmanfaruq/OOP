import java.util.Scanner;

public class SearchingNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String s = scanner.nextLine();
        System.out.print("Search: ");
        int k = scanner.nextInt();
        String[] arr = s.split("\\s*,\\s*");
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            if (n == k) {
                System.out.println(k + " exists in the List");
            }
        }
    }

}
