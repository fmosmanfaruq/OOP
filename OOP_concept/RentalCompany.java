class Vehicle{
    public String registrationNum;
    public String model;
    public double rentPrice;
    public Vehicle(){
        System.out.println("Vehicle method is created");
    }
    public Vehicle(String registrationNum,String model,double rentPrice){
        this.registrationNum=registrationNum;
        this.model=model;
        this.rentPrice=rentPrice;
    }
    
    public void display(){
        System.out.println(registrationNum);
        System.out.println(model);
        System.out.println(rentPrice);
    }
}
class Car extends Vehicle{
    public String fuelType;
     public Car(){
        System.out.println("car method is ceated");
    }
    public Car(String registrationNum,String model,double rentPrice,String fuelType){
        super(registrationNum,model,rentPrice);
        this.fuelType=fuelType;
    }
   
    public void rentalCost(){
        System.out.println(rentPrice);
    }
    @Override
    public void display(){
        super.display();
        System.out.println(fuelType);
    }
}
public class RentalCompany {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("12 AC 12","Toyota Corolla",1000.00);
        v1.display();
        Vehicle v2 = new Vehicle();
        Car c1 =new Car("23 CS 23","Audi R8",100.00,"98");
        c1.display();
    }
}
