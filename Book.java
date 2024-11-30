public class  Book {
    private String title;
    private Author author;
    private String isbn;
    private boolean isAvailable;
  // Constructor for book 
    public Book(String title,  Author author, String isbn) {
        this.title = title;
        this.author = author;
       this.isbn = isbn;
        this.isAvailable = true ;
    }
    public String getTitle() {
        return title;
    }
    public Author  getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void borrow() {
        isAvailable = false;
    }
    public void returnBook() {
        isAvailable = true;
    }
}
