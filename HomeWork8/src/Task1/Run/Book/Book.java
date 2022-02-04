package Task1.Run.Book;


public class Book {
    private String nameBook;
    private String author;

    public Book(String author, String nameBook) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Task1.Run.Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
