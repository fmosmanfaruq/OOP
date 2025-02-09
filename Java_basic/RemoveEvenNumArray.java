import java.util.Scanner;

public class RemoveEvenNumArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.split("\\s*,\\s*");
		for (int i = 0; i < arr.length; i++) {
			int n = Integer.parseInt(arr[i]);
			if (n % 2 == 1) {
				System.out.print(n + " ");
			}
		}
	}
}