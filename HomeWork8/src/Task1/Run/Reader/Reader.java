package Task1.Run.Reader;

import Task1.Run.Book.Book;

public class Reader {
    private String name;
    private int ticketNumber;
    private String faculty;
    private String BirthDate;
    private String phoneNumber;
    private int amount;

    public Reader(String name, int ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.BirthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int book, String name){
        System.out.println(name + " взял " + book + " книг");
    }

    public void takeBook(String ... books){
        System.out.print(name + " взял книги: ");
        for (String b: books) {
            System.out.print(b);
            System.out.print("," + " ");
        }
    }

    public void takeBook(Book...books){
        System.out.print(name + " взял книги: ");
        for (Book b:books) {
            System.out.print(b.getNameBook() + ", автор - " + b.getAuthor() + ". ");
        }
        System.out.println();
    }

    public void returnBook(int book, String name){
        System.out.println(name + " вернул " + book + " книги");
    }

    public void returnBook(Book ... books){
        System.out.print(name + " вернул книги: ");
        for (Book b:books) {
            System.out.print(b.getNameBook() + ", автор - " + b.getAuthor() + ". ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Task1.Run.Reader{" +
                "name='" + name + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", faculty='" + faculty + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
