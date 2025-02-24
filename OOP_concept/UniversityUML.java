class Student{
	public String StudentId;
	public String name;
	public String department;
	public Student(String StudentId,String name,String department){
		this.StudentId=StudentId;
		this.name= name;
		this.department= department;
	}
	public Student(){
		System.out.println("Student method is created");
	}
	public void display(){
		System.out.println(StudentId);
		System.out.println(name);
		System.out.println(department);
	}
}
class GraduateStudent extends Student{
	public String researchTopic;
	public GraduateStudent(){
		System.out.println("Graduate method is created");
	}
	public GraduateStudent(String StudentId,String name,String department,String researchTopic){
		super(StudentId,name,department);
		this.researchTopic= researchTopic;
	}
	public void submitThesis(){
		System.out.println("cretaed");
	}
	@Override
	public void display(){
		super.display();
		System.out.println(researchTopic);
	}
}
public class UniversityUML {
	public static void main(String[] args) {
		Student s1= new Student("123","Osman Faruq","CSE");
		s1.display();
		GraduateStudent g1 = new GraduateStudent("456","Faruq","CSE","human brain");
		g1.display();
	}
}