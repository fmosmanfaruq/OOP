/*A company is developing an online shopping system where users can apply discounts to their purchases.
Implement a method applyDiscount that is overloaded in the following ways:
● If the user provides a percentage (e.g., applyDiscount(double percentage)), reduce the
price by that percentage.
● If the user provides a fixed amount (e.g., applyDiscount(int amount)), reduce the price by
that amount.
● If no arguments are provided, apply a default discount of 5%.
Write the Java class implementing these overloaded methods.*/

class company {
    public double price;

    public company(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage < 100) {
            price -= price * (percentage / 100);
            System.out.println("Price after " + percentage + "% is: " + price);
        } else {
            System.out.println("Invalid Number");
        }
    }

    public void applyDiscount(int amount) {
        price -= amount;
        System.out.println("Price: " + price);
    }

    public void applyDiscount() {
        applyDiscount(5.00);
    }
}

public class methodOverloading2 {
    public static void main(String[] args) {
        company any = new company(100.00);
        any.applyDiscount();
        any.applyDiscount(10.0);
        any.applyDiscount(30);
    }
}