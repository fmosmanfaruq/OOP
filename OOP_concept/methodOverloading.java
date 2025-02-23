class company{
    public int price;
public company(int price){
    this.price=price;
}
public void applyDiscount(double percentage){
    int toprice =(int)((price*percentage)/100);
    int tprice = price-toprice;
    System.out.println("price "+tprice);
}
    public void applyDiscount(int amount){
        price = price-amount;
        System.out.println("price"+price);
    }
    public void displayInfo(){
    System.out.println(price);
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        company c1 =new company(500);
        c1.displayInfo();
        c1.applyDiscount(5.00);
        c1.applyDiscount(100);
        c1.displayInfo();
    }
}
