class person{
    private String name;
    private int age;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
    return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
    return age;
    }
    }
    public class methodOverloading{
    public static void main(String[] args){
    
    person p1= new person();
    p1.setAge(21);
    p1.setName("Osman Faruq");
    
    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    }
    }