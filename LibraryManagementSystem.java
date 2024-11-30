import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private ArrayList<Book> books; // List of the books objects that are in the hold 
    private Scanner scanner;


    public LibraryManagementSystem() {
        books = new ArrayList<>(); // Initialize the list of books
        scanner = new Scanner(System.in); // Initialize the scanner
    }

    public void addBook(Book book) {
        books.add(book); // Add a new book to the list
        System.out.println("Book added: " + book.getTitle());
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
    
    System.out.println("Book not found.");
    }

    public void listBooks() {
        System.out.println("Listing all books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN:" + book.getIsbn() + ", Available: " + book.isAvailable() + ")");
        }
    }
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. List Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = library.scanner.nextInt();
            library.scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = library.scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String authorName = library.scanner.nextLine();

                    System.out.print("Enter author biography: ");
                    String authorBio = library.scanner.nextLine();

                    Author author = new Author(authorName, authorBio);

                    System.out.print("Enter book ISBN: ");
                    String isbn = library.scanner.nextLine();

                    Book book = new Book(title, author, isbn); // This should work
                    library.addBook(book); // Add the book to the library
                    break;

                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = library.scanner.nextLine();
                    library.searchBook(searchTitle); // Search for the book
                    break;

                case 3:
                    library.listBooks(); // List all books
                    break;

                case 4:
                    System.out.println("Exiting the library system.");
                    library.scanner.close();
                    return; // Exit the loop and terminate the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


