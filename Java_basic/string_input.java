import java.util.Scanner;
public class string_input{
    public static void main(String[] args){
        Scanner any = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = any.nextLine();
        System.out.println("Your name is :" + name);
    }
}