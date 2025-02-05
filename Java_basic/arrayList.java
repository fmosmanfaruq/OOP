import java.util.ArrayList;
public class arrayList{
	public static void main(String []arg){
	//int [] age = new int[10];
	ArrayList<Integer>age = new ArrayList<>();
	age.add(13);
	age.add(11);
	age.add(5);
	age.add(34);
	age.add(22);
System.out.println("Adding list of array "+age);
System.out.println("Array list Size "+age.size());
System.out.println("Third element of the age is "+age.get(2));
age.remove(4);
System.out.println("Adding list of array "+age);
}	
}