class Employee{
	private String organization;
	public String designation;
	public double salary;
public Employee(String organization,String designation,double salary){
	this.organization = organization;
	this.designation= designation;
	this.salary = salary;
}
public String getOrganization(){
	return organization;
}
public void setSalary(double amount){
	this.salary=amount;
}
public void display(){
	System.out.println(organization);
	System.out.println(designation);
	System.out.println(salary);
}
}
class PartTime extends Employee{
	public PartTime(String organization,String designation,double salary){
		super(organization, designation, salary);
	}
	public void displayResponsibilities(){
		System.out.println("Anything");
	}
}
class FullTime extends Employee{
	public double bonus;
	public FullTime(String organization,String designation,double salary,double bonus){
		super(organization,designation,salary);
		this.bonus=bonus;
	}
	public void display(double bonus){
		super.display();
		System.out.println(bonus);
	}
}
public class HR {
public static void main(String[] args) {
	PartTime p1 = new PartTime("ABC", "EDC", 1000.00);
	p1.display();
	FullTime f1 = new FullTime("sjd", "awd", 10000.00, 2000.00);
	f1.display();
}
}