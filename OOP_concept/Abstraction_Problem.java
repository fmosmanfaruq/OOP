import java.util.ArrayList;

abstract class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    abstract void startEngine();
    public void displayBrand(){
        System.out.println("Brand: "+brand);
    }
}
class Car extends Vehicle{
    Car(String Brand){
        super(Brand);
    }
    @Override
    void startEngine(){
        System.out.println("Car engine started with key!");
    }
}
class Bike extends Vehicle{
    Bike(String Brand){
        super(Brand);
    }
    @Override
    void startEngine(){
        System.out.println("Bike engine started with self-start!");
    }
}
public class Abstraction_Problem {
    public static void main(String[] args) {
        ArrayList<Vehicle>vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota"));
        vehicles.add(new Bike("Yamaha"));
        for(int i=0; i<vehicles.size();i++){
            vehicles.get(i).displayBrand();
            vehicles.get(i).startEngine();
        }
    }
}
