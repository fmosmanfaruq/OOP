interface Vehicle {
    void changingGear(int newGear);
    void increasingSpeed(int newSpeed);
    void applyingBreakes(int newBreak);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    Bicycle(){
        this.speed=0;
        this.gear= 0;
    }
    @Override
    public void changingGear(int newGear){
        if(newGear>0){
            gear += newGear;
            System.out.println("New Gear: "+newGear);
        }
    }
    @Override
    public void increasingSpeed(int newSpeed){
        if(newSpeed>0){
            speed += newSpeed;
            System.out.println("Speed increse to: "+speed);
        }
    }
    @Override
    public void applyingBreakes(int newBreak){
        if(newBreak>0){
            speed -= newBreak;
            System.out.println("After break speed will be: "+speed);
        }
    }
}
class Bike implements Vehicle{
    int speed;
    int gear;
    Bike(){
        this.speed = 0;
        this.gear = 0;
    }
    @Override
    public void changingGear(int newGear){
        if(newGear>0){
            gear += newGear;
            System.out.println("New Gear: "+newGear);
        }
    }
    @Override
    public void increasingSpeed(int newSpeed){
        if(newSpeed>0){
            speed += newSpeed;
            System.out.println("Speed increse to: "+speed);
        }
    }
    @Override
    public void applyingBreakes(int newBreak){
        if(newBreak>0){
            speed -= newBreak;
            System.out.println("After break speed will be: "+speed);
        }
    }
}
public class vehicleInterface {
    
    public static void main(String[] args) {
        Bike any = new Bike();
        any.changingGear(2);
        any.increasingSpeed(20);
        any.applyingBreakes(10);

        Bicycle anyy = new Bicycle();
        anyy.changingGear(3);
        anyy.increasingSpeed(30);
        anyy.applyingBreakes(15);
    }
}
