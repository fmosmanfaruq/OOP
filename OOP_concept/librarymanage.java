class library{
    public int bookId;
    public String title;
    public String author;
    public int bookList;
    library(int bookId,String title,String author,int bookList){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.bookList=bookList;
    }
    public void addBook(int total){
        if(total>0){
            bookList += total;
        }
        System.out.println("Total books:"+bookList);
    }
    public void displayInfo(){
        System.out.println("Book Id: "+bookId);
        System.out.println("Book Title: "+title);
        System.out.println("Author name: "+author);
        System.out.println("Booklist: "+bookList);
    }
    public void searchBook(String boiname){
        if(boiname==title){
            System.out.println("Yes found");
        }
        else{
            System.out.println("not found");
        }
    }
    public void deletebook(int removeboi){
        if(removeboi>bookList){
        bookList = bookList - removeboi;
        }
        System.out.println("After removing books"+bookList);
    }
}
public class librarymanage {
    public static void main(String[] args) {
        library any = new library(123,"Osman Faruq" , "Faruq Osman", 5);
        any.addBook(2);
        any.displayInfo();
        any.searchBook("Osman Faruq");
        any.deletebook(3);
    }
}
