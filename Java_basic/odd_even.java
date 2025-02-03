import java.util.Scanner;
public class odd_even{
    public static void main(String[]args){
        Scanner any = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = any.nextInt();
        if(n%2==0){
            System.out.println(n+" Number is Even");
        }
        else{
            System.out.println(n+" Number is Odd");
        }
    }
}
