class Book {
    int bookId = 101;
    String title = "Java Programming";
    String author = "Herbert Schildt";
    double price = 799;

    void displayBook() {
        System.out.println("Book Details");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {

        Book b = new Book();

        b.displayBook();
    }
}