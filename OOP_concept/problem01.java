/*
 * You are working as a software developer for a bank that wants to create a secure and flexible account management system. The bank requires all account types to follow a common structure but have different behaviors based on their type. To achieve this, the system uses an Account interface, which defines methods for depositing money, withdrawing money, and calculating the total balance. The system supports different account types, including SavingsAccount and CurrentAccount, which implement the Account interface and define their own balance rules. The SavingsAccount includes an interestRate, which is added to the balance when calculating the totalBalance, whereas the CurrentAccount does not apply interest but may allow overdraft transactions. Additionally, the bank system follows association by linking accounts with a Customer class, which holds personal details and manages multiple accounts, ensuring a well-structured and efficient account management system.
 */

 import java.util.ArrayList;

 interface Account{
     void deposite(double amount);
     void withdraw(double amount);
     double totalBalance();
 }
 class SavingsAccount implements Account{
     double balance;
     double interestRate;
     public SavingsAccount(double balance,double interestRate){
         this.balance = balance;
         this.interestRate = interestRate;
     }
     @Override
     public void deposite(double amount){
         balance += amount;
     }
     @Override
     public void withdraw(double amount){
         if(amount<balance){
         balance -= amount;
         }
     }
     @Override
     public double totalBalance(){
         return balance+(balance*(interestRate/100));
     }
 }
 class CurrentAccount implements Account{
     double balance;
     double overdraft;
     public CurrentAccount(double balance, double overdraft){
         this.balance = balance;
         this.overdraft = overdraft;
     }
     @Override
     public void deposite(double amount){
         balance += amount;
     }
     @Override
     public void withdraw(double amount){
         if(amount<=balance+overdraft){
         balance -= amount;
         }
     }
     @Override
     public double totalBalance(){
         return balance;
     }
 }
 class Customer{
     String name;
     String id;
     ArrayList<Account>accounts = new ArrayList<>();
     Customer(String name,String id){
         this.name = name;
         this.id = id;
     }
     public void addAccount(Account account){
         accounts.add(account);
     }
     public void showAccount() {
         double total = 0;
         System.out.println("Name: " + name + " | ID: " + id);
         for (int i = 0; i < accounts.size(); i++) {
             double accBalance = accounts.get(i).totalBalance();
             total += accBalance;  // ✅ Accumulate total balance
             System.out.println("Account " + (i + 1) + " Balance: " + accBalance);
         }
         System.out.println("Total Balance: " + total);
     }
 }
public class problem01 {
    
    public static void main(String[] args) {
        Customer c1 = new Customer("Osman Faruq","123");

        SavingsAccount saving = new SavingsAccount(1000, 7);
        CurrentAccount current = new CurrentAccount(1000, 500);
        c1.addAccount(saving);
        c1.addAccount(current);

        saving.deposite(1000);
        saving.withdraw(500);
        System.out.println("Savings Account Balance (with interest): " + saving.totalBalance());

        current.deposite(1000);
        current.withdraw(2500);
        System.out.println("Current Account Balance: " +current.totalBalance());

        c1.showAccount();
    }
}
