interface Account{
    void depositingMoney(double amount);
    void withdrawingMoney(double amount);
    void checkingBalance();
}
class SavingAccount implements Account{
    double balance;
    double withdrawlim;
    SavingAccount(double balance,double withdrawlim){
        this.balance = balance;
        this.withdrawlim = withdrawlim;
    }
    @Override
    public void depositingMoney(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Balance: "+balance);
        }
    }
    public void withdrawingMoney(double amount){
        if(balance>amount && amount<=withdrawlim){
            balance -= amount;
            System.out.println("balance: "+balance);
        }
    }
    public void checkingBalance(){
        System.out.println("Current balance: "+balance);
    }
}
class CurrentAccount implements Account{
    double balance;
    double overdraftLim;
    CurrentAccount(double balance,double overdraftLim){
        this.balance = balance;
        this.overdraftLim = overdraftLim;
    }
    @Override
    public void depositingMoney(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Balance: "+balance);
        }
    }
    public void withdrawingMoney(double amount){
        if(balance>amount && ((balance-amount)>= -overdraftLim)){
            balance -= amount;
            System.out.println("balance: "+balance);
        }
        else{
            System.out.println("Over draft the limit");
        }
    }
    public void checkingBalance(){
        System.out.println("Current balance: "+balance);
    }
}
public class interfaceBanking {
    
    public static void main(String[] args) {
        Account saving = new SavingAccount(10000.00, 8000.00);
        Account current = new CurrentAccount(5000.00,1000.00);

        saving.depositingMoney(10000.00);
        saving.withdrawingMoney(6000.00);

        current.depositingMoney(1000);
        current.withdrawingMoney(5500);
    }
}
