import java.util.Scanner;
public class MaxNumInArray {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split("\\s*,\\s*");
        int max = Integer.parseInt(arr[0]);
        for(int i=0; i<arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(max < num){
                max = num;
            }
        }
        System.out.println("Maximun Number: "+max);
    }
}
