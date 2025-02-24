import java.util.ArrayList;
class car{
	public String carModel;
	public int seats;
	public car(String carModel,int seats){
		this.carModel=carModel;
		this.seats=seats;
	}
	public void display(){
		System.out.println(carModel);
		System.out.println(seats);
	}
}
public class ObjectList {
public static void main(String[] args) {
	ArrayList <car> any = new ArrayList<>();
	any.add(new car("Toyota",5));
	any.add(new car("Audi",4));
	for(int i=0; i<any.size();i++){
		any.get(i).display();
	}
}
}