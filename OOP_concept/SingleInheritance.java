class Employee {
	public String name;
	public int age;
	public double salary;
	public String department;

	Employee(String name, int age, double salary, String department) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public void display() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nSalary " + salary + "\nDepartment " + department);
	}
}

class programmer extends Employee {
	public String p_knowledge;

	programmer(String name, int age, double salary, String department, String p_knowledge) {
		super(name, age, salary, department);
		this.p_knowledge = p_knowledge;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Programming Knowledge:" + p_knowledge);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		programmer any = new programmer("Osman Faruq", 21, 10000, "CSE", "java");
		any.display();
	}
}