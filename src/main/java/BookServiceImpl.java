import java.util.ArrayList;
import java.util.Scanner;

public class BookServiceImpl implements BookService{
    private ArrayList<Book> bookArrayList;

    public BookServiceImpl() {
        this.bookArrayList = new ArrayList<>();

    }

    @Override
    public void addBook() {
        String title;
        String author;
        double price;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter title of the book");
        title = scan.nextLine();
        System.out.println("Enter an author of the book");
        author = scan.nextLine();
        System.out.println("Please enter the price of the book");
        price = scan.nextDouble();
        Book b1 = new Book(title,author,price);
        bookArrayList.add(b1);
        System.out.println("Book added successfully ");
    }

    @Override
    public void updateBook() {

    }

    @Override
    public void removeBook() {

    }

    @Override
    public void displayBook() {
        int i=0;
        for (Book book : bookArrayList) {
            System.out.println(i++ +"-"+ book);
        }

    }
}
