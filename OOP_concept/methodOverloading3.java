/*
A bank allows users to deposit money in different ways. Implement a method deposit with method overloading: 
● deposit(int amount): Deposits the specified amount into the account. 
● deposit(double amount, String currency): Deposits money after converting it to the default currency (assume USD conversion). 
● deposit(int amount, String accountNumber, String note): Deposits money with a transaction note. 
Write the Java class implementing these methods. 
*/
class bank {
    public double balance;
    public bank(double balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Balance is now: " + balance);
    }

    public void deposit(double amount, String currency) {
        if (currency == "USD") {
            balance += amount * 121.47;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid currency");
        }
    }

    public void deposit(int amount, String accountNumber, String note) {
        balance += amount;
        System.out.println("Account Number: " + accountNumber + "\nNote: " + note + "\nBalance: " + balance);
    }
}

public class methodOverloading3 {
    public static void main(String[] args) {
        bank any = new bank(10000.00);
        any.deposit(1000, "123", "Osman Faruq");
    }
}