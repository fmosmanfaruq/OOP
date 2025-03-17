abstract class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    void displayInfo(){
        System.out.println("Name: "+name+"\nId: "+id+"\nSalary: "+calculateSalary());
    }
}
class FullTimeEmployee extends Employee{
    double amount;
    FullTimeEmployee(String name,int id,double amount){
        super(name,id);
        this.amount = amount;
    }
    @Override
    double calculateSalary(){
        return amount;
    }
}
class PartTimeEmployee extends Employee{
    double hourlyPaid;
    double workedHour;
    PartTimeEmployee(String name,int id,double hourlyPaid, int workedHour){
        super(name,id);
        this.hourlyPaid=hourlyPaid;
        this.workedHour = workedHour;
    }
    @Override
    double calculateSalary(){
        return hourlyPaid*workedHour;
    }
}
public class AbstractEmployee {
    
    public static void main(String[] args) {
        Employee f1 = new FullTimeEmployee("Osman Faruq", 123, 1000);
        f1.displayInfo();
        System.out.println("-----------------");
        Employee p1 = new PartTimeEmployee("Faruq udoy", 123, 15, 10);
        p1.displayInfo();
    }
}
