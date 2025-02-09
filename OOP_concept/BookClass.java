class book {
    public String bookName;
    public String authorName;
    public int pages;

    public book(String bookName, String authorName, int pages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Pages: " + pages);
    }

}

public class BookClass {
    public static void main(String[] args) {
        book any = new book("Vlao achi valo thekho", "Sohomot vhai", 123);
        any.displayInfo();
    }

}
