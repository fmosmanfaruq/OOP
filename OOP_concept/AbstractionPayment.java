abstract class Payment{
    abstract void processPayment(double amount);
    void transactionDetails(double amount){
        System.out.println("Amount $"+amount+"has been tansfered");
    }
}
class CreditCardPayment extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println(amount+"$ has been payment done by creditcard");
        transactionDetails(amount);
    }
}
class PayPalPayment extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println(amount+"$ has been payment done by Paypal");
        transactionDetails(amount);
    }
}
public class AbstractionPayment {
    public static void main(String[] args) {
        Payment paypal = new PayPalPayment();
        paypal.processPayment(1000);

        Payment credit = new CreditCardPayment();
        credit.processPayment(1200);
    }
}
