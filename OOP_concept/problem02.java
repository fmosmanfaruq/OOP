/*
In the bank account management system, an abstract class is used to define common behavior and structure for all account types while ensuring flexibility for specific implementations. The BaseAccount abstract class provides shared attributes like accountNumber and balance and implements common methods such as deposit() and withdraw(), reducing code duplication. It also declares the calculateTotalBalance() method as abstract, enforcing that each subclass (SavingsAccount and CurrentAccount) must implement its own balance calculation logic. This prevents direct instantiation of BaseAccount, ensuring that only specific account types can be created while maintaining a consistent account structure. Additionally, using an abstract class supports scalability, allowing future account types (e.g., FixedDepositAccount) to inherit common functionalities without rewriting code, making the system more maintainable and efficient.
*/
abstract class BaseAccount{
	String accountNumber;
	double balance;
	BaseAccount(String accountNumber,double balance){
	this.accountNumber = accountNumber;
	this.balance = balance;
	}
public void deposit(double amount){
	if(amount>0){
	balance += amount;
	}
	System.out.println("Account number: "+accountNumber+"\nAfter deposit Balance is :$"+balance);
}
public void withdraw(double amount){
	if(amount<= balance){
	balance-= amount;
	}
	System.out.println("After withdraw Balance is :$"+balance);
}
abstract double calculateTotalBalance();
}
class SavingAccount extends BaseAccount{
	double interestRate;
	SavingAccount(String accountNumber,double balance,double interestRate){
	super(accountNumber,balance);
	this.interestRate= interestRate;
	}
	@Override
	public double calculateTotalBalance(){
	return balance+= (balance*(interestRate/100));
}
}
class CurrentAccount extends BaseAccount{
	double overdraft;
	CurrentAccount(String accountNumber,double balance,double overdraft){
	super(accountNumber,balance);
	this.overdraft= overdraft;
	}
	@Override
	public double calculateTotalBalance(){
	return balance+overdraft;
}
}
public class problem02 {
    public static void main(String[] args){
        SavingAccount s1 = new SavingAccount("Osman Faruq",10000,5);
        CurrentAccount c1 = new CurrentAccount("Udoy",15000,500);
        
        s1.deposit(20000);
        s1.withdraw(5000);
        System.out.println("TOtal balance with interest is $"+s1.calculateTotalBalance());
        
        c1.deposit(5000);
                c1.withdraw(20000); // test overdraft limit
                System.out.println("Current Account Total Balance (with overdraft): $" + c1.calculateTotalBalance());
        }
}
