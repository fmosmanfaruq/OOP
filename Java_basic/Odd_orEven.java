import java.util.Scanner;
public class Odd_orEven {
    public static void main(String []args){
        Scanner any = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = any.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is Odd");
        }
        else{
            System.out.println(n+" is Even");
        }
    }
}
