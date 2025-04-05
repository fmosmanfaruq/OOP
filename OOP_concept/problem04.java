/*To maintain a common structure, the system defines a User interface, which includes essential methods like getDetails() and calculateFare(). An abstract class RideMember implements this interface and provides shared attributes such as name, contactNumber, and location, along with a default implementation of getDetails(). The system supports two main user types, Driver and Passenger, which inherit from RideMember and implement their own specialized behaviors.The Driver class includes attributes like vehicleType, licenseNumber, and rating, while the Passenger class maintains details such as paymentMethod and rideHistory. The system follows association by linking Driver and Passenger through RideBooking, where a passenger can request a ride, and a driver can accept it, ensuring an efficient and structured ride-sharing experience.*/
interface User {
    String getDetails();

    void calculateFare();
}

abstract class RideMember implements User {
    String name;
    String contactNumber;
    String location;

    RideMember(String name, String contactNumber, String location) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ",Contract Number: " + contactNumber + ",Location: " + location;
    }
}

class Driver extends RideMember {
    String vehicleType;
    int licenseNumber;
    double rating;

    Driver(String name, String contactNumber, String location, String vehicleType, int licenseNumber, double rating) {
        super(name, contactNumber, location);
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ",Vehicle type: " + vehicleType + ",License Number: " + licenseNumber + ",Rating: "
                + rating;
    }

    @Override
    public void calculateFare() {
        System.out.println("0");
    }
}

class Passenger extends RideMember {
    String paymentMethod;
    String rideHistory;

    Passenger(String name, String contactNumber, String location, String paymentMethod, String rideHistory) {
        super(name, contactNumber, location);
        this.paymentMethod = paymentMethod;
        this.rideHistory = rideHistory;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ",Payments method: " + paymentMethod + ",Ride History: " + rideHistory;
    }

    @Override
    public void calculateFare() {
        System.out.println("500");
    }
}

class RideBooking {
    Driver driver;
    Passenger passenger;
    String stratingLocation;
    String endLocation;

    RideBooking(Driver driver, Passenger passenger, String stratingLocation, String endLocation) {
        this.driver = driver;
        this.passenger = passenger;
        this.stratingLocation = stratingLocation;
        this.endLocation = endLocation;
    }

    public void rideShareDetails() {
        System.out.println("Ride details");
        System.out.println("Driver: " + driver.getDetails());
        System.out.println("Passenger: " + passenger.getDetails());
        System.out.println("Pick up Location: " + stratingLocation);
        System.out.println("Drop Location: " + endLocation);
    }
}

public class problem04 {
    public static void main(String[] args) {
        Driver d1 = new Driver("Osman", "012378923293", "Mirpur33", "car", 12345, 4.4);
        Passenger p1 = new Passenger("Faruq", "019237739434", "Uttora", "One card", "6 rides");
        RideBooking r1 = new RideBooking(d1, p1, "Mipur 15", "new York");
        r1.rideShareDetails();
    }
}
