import java.util.Scanner;
public class EvenAndOddInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	String s = scanner.nextLine();
	String[] arr = s.split("\\s*,\\s*");
	int countEven =0,countOdd =0;
	for(int i=0; i<arr.length; i++){
		int num = Integer.parseInt(arr[i]);
		if(num%2==0){
		countEven++;
		}
		else{
		countOdd++;
		}
	}
	System.out.println("Even Count: "+countEven);
	System.out.println("Odd Count: "+countOdd);
    }
}
