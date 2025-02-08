import java.util.Scanner;

public class ArrayInputWithoutSize
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        String[] arr = val.split("\\s+");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" " );
        }
    }
}