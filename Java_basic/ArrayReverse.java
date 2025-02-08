import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split("\\s*,\\s*");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+", ");
        }
    }
}
