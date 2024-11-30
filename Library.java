import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed with ISBN: " + isbn);
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void removeMember(String membershipId) {
        members.removeIf(member -> member.getMembershipId().equals(membershipId));
        System.out.println("Member removed with ID: " + membershipId);
    }

    public void borrowBook(String isbn, String membershipId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.borrow();
                System.out.println("Book borrowed: " + book.getTitle() + " by " + membershipId);
                return;
            }
        }
        System.out.println("Book is not available or does not exist.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book does not exist.");
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
            System.out.println(book.getTitle() + " by " + book.getAuthor()+ " (ISBN: " + book.getIsbn() + ", Available: " + book.isAvailable() + ")");
        }
    }
}
