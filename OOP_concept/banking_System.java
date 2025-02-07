class bankAccount{
    public String accountNumber;
    public String accountHolderName;
    private double balance; 
    public bankAccount(String accountNumber,String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn: $"+amount);
        }
        else if(amount>balance){
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance = balance + amount;
            System.out.println("Deposit added new balace: "+balance);
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: $"+balance);
    }
}
public class banking_System {
    public static void main(String[] args) {
        bankAccount any = new bankAccount("23215579","Osman Faruq",10000.00);
        any.displayAccountInfo();
        any.deposit(1000.00);
        any.withdraw(2000.0);
        any.withdraw(5000.00);
        any.displayAccountInfo();
    }
}
