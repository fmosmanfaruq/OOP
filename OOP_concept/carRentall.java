import java.util.Scanner;

class carRental {
    public String carName;
    public double rentalPricePerDay;
    public int availableCars;

    public void setCarDetails(String name, double price, int stock) {
        this.carName = name;
        this.rentalPricePerDay = price;
        this.availableCars = stock;
    }

    public void rentCar(int quantity, int days) {
        if (quantity <= availableCars) {
            availableCars -= quantity;
            double totalPrice = quantity * days * rentalPricePerDay;
            System.out.println("For " + quantity + " cars rental price would be $" + totalPrice);
        } else {
            System.out.println("Not enough cars available");
        }
    }

    public void returnCar(int quantity) {
        if (quantity > 0) {
            availableCars += quantity;
        }
    }

    public void displayCarDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Rental price per day :$" + rentalPricePerDay);
        System.out.println("Available Cars: " + availableCars);

    }
}

public class carRentall{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        carRental car1 = new carRental();
        carRental car2 = new carRental();
        car1.setCarDetails("Toyota", 1000.00, 5);
        car2.setCarDetails("Tesla", 2000.00, 5);

        car1.displayCarDetails();
        car2.displayCarDetails();

        System.out.println("Rent a car (Enter 1 for Toyota and 2 for Tesla)");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("quantity :");
            int quantity = scanner.nextInt();
            System.out.println("Days :");
            int days = scanner.nextInt();
            car1.rentCar(quantity, days);
        } else if (num == 2) {
            System.out.print("quantity :");
            int quantity = scanner.nextInt();
            System.out.print("Days :");
            int days = scanner.nextInt();
            car2.rentCar(quantity, days);
        }

        car2.returnCar(1);

        car1.displayCarDetails();
        car2.displayCarDetails();

    }
}