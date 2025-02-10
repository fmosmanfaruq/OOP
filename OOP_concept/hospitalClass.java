class hospital{
	public String name;
	public String location;
	public int totalBeds;
	public int availableBeds;

public hospital(String name,String location,int totalBeds,int availableBeds){
	this.name = name;
	this.location = location;
	this.totalBeds = totalBeds;
	this.availableBeds= availableBeds;
}
public void displayInfo(){
System.out.println("Hospital name: "+name);
System.out.println("Hospital location: "+location);
System.out.println("Hospital Beds: "+totalBeds);
System.out.println("Hospital Available: "+availableBeds);
}
}
public class hospitalClass{
public static void main(String[] args){
hospital any = new hospital("Alice in Borderland","Tokyo",100,23);
any.displayInfo();

}
}