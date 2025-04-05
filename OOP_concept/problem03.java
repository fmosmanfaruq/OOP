/*
You are working as a software developer for a hospital that wants to create a secure and scalable Hospital Management System to efficiently manage patients, doctors, and medical records. To ensure a structured approach, the system utilizes an interface, an abstract class, and inheritance while maintaining associations between different entities.The system defines a Person interface, which includes essential methods such as getDetails() to retrieve information about any individual in the hospital. An abstract class HospitalMember implements the Person interface and provides common attributes like name, age, and ID, along with a default implementation for getDetails(). The system supports different roles, such as Doctor and Patient, which inherit from HospitalMember and implement their own specialized behaviors.The Doctor class includes attributes like specialization and consultationFee, while the Patient class maintains details such as disease and admittedStatus. The system follows association by linking Doctor and Patient through appointments, where a doctor can be associated with multiple patients, ensuring an effective healthcare management system.
*/
import java.util.ArrayList;
interface person{
	String getDetails();
}
abstract class HospitalMember implements person{
	String name;
	int age;
	int id;
HospitalMember(String name,int age,int id){
	this.name= name;
	this.age= age;
	this.id=id;
}
@Override
public String getDetails(){
	return "ID: "+id+"\nName: "+name+"\nAge: "+age;
}
}
class Doctor extends HospitalMember{
	String specialization;
	double consultaionFee;
	Doctor(String name,int age,int id,String 	specialization,double consultaionFee){
	super(name,age,id);
	this.specialization=specialization;
	this.consultaionFee=consultaionFee;
	} 
@Override
public String getDetails(){
	return super.getDetails()+",Specialization: "+specialization+",Consultaion Fee: "+consultaionFee;
}
}
class Patient extends HospitalMember{
	String disease;
	Boolean admittedStatus;
	Patient(String name,int age,int id,String disease,Boolean 	admittedStatus){
	super(name,age,id);
	this.disease = disease;
	this.admittedStatus=admittedStatus;
}
@Override
public String getDetails(){
	return super.getDetails()+",Disease: "+disease+",Admitted Status: "+admittedStatus;
}
}
class Appointment{
	Doctor doctor;
	Patient patient;
	String date;
	Appointment(Doctor doctor,Patient patient,String date){
	this.doctor= doctor;
	this.patient = patient;
}
public void showAppointmentDetails(){
System.out.println("Date: "+date);
System.out.println("Doctor: "+doctor.getDetails());
System.out.println("Patient: "+patient.getDetails());
}
}
public class problem03{
public static void main(String[] args){
Doctor d1 = new Doctor("Osman",21,1234,"Head",1000);
Patient p1 = new Patient("Faruq",22,5432,"Eye",true);
Patient p2 = new Patient("udoy",22,2332,"hand",true);

ArrayList<Appointment>appointments = new ArrayList<>();
appointments.add(new Appointment(d1,p1,"5/4/25"));
appointments.add(new Appointment(d1,p2,"6/4/25"));

/*Appointment a1 = new Appointment(d1,p1,"5/4/25");
Appointment a2 = new Appointment(d1,p2,"6/04/25");

a1.showAppointmentDetails();
System.out.println("--------------------");
a2.showAppointmentDetails();*/

for(int i=0; i<appointments.size(); i++){
appointments.get(i).showAppointmentDetails();
System.out.println("--------------------");
}

}
}
