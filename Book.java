class Book {


final String ISBN = "978-0135166307";


String title = "Java Programming"; String author = "Herbert Schildt"; double price = 799;

void display() {
System.out.println("Library Book Details"); System.out.println("ISBN: " + ISBN);
System.out.println("Title: " + title);
System.out.println("Author: " + author); System.out.println("Price: ₹" + price);
}
}


public class LibraryBook {
public static void main(String[] args) {


Book book = new Book();


book.display();
}
}
