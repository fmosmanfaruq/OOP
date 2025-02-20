class Employee {
	public String name;
	public int id;
	public double salary;

	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + name + "\nId: " + id + "\nSalary: " + salary);
	}
}

class programmer extends Employee {
	public String p_knowledge;

	programmer(String name, int id, double salary, String p_knowledge) {
		super(name, id, salary);
		this.p_knowledge = p_knowledge;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Programming Knowledge: " + p_knowledge);
	}
}

class seniorProgrammer extends programmer {
	public int experience;

	seniorProgrammer(String name, int id, double salary, String p_knowledge, int experience) {
		super(name, id, salary, p_knowledge);
		this.experience = experience;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Experince: " + experience);
	}
}

public class multilevelinheritance {
	public static void main(String[] args) {

		seniorProgrammer s1 = new seniorProgrammer("Osman Faruq", 123, 10000.00, "java", 3);
		s1.display();
	}
}