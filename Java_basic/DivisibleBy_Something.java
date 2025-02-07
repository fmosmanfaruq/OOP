import java.util.Scanner;
public class DivisibleBy_Something {
    public static void main(String[] args) {
        Scanner any = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = any.nextInt();
        for(int i=1; i<=50; i++){
            if(n%i==0)
            {
                System.out.println("First number divisible by "+ n +" is "+i);
                break;
            }
        }
    }
}
