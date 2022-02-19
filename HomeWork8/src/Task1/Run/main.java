package Task1.Run;

/*
"Читатели библиотеки". Определить класс Task1.Run.Reader, хранящий такую информацию о пользователе библиотеки:
ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().

Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг.
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Task1.Run.Book (создать новый класс, содержащий имя и автора книги).
Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 Аналогичным образом перегрузить метод returnBook().
 Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
 */

import Task1.Run.Book.Book;
import Task1.Run.Reader.Reader;

public class main {
    public static void main(String[] args) {

        //Создаем экземпляры класса Task1.Run.Book (создаем книги)
        Book book1 = new Book("Рэй Бредбери", "451 градус по Фаренгейту");
        Book book2 = new Book("O Генри", "Жажда жизни");
        Book book3 = new Book("Редьярд Киплинг", "Маугли");
        Book book4 = new Book("Джоан Роулинг", "Гарри Поттер");
        Book book5 = new Book("Даниэль Канеман", "Думай медленно, решай быстро");

        Book[] book = new Book[]{book1, book2, book3, book4, book5};
        int countBooks = book.length;
        System.out.println(countBooks + " - общее количество книг в библиотеке: ");
        for (Book b : book) {
            System.out.println(b);
        }
        System.out.println("======================================================================================================================");


        //Создаем экземпляры классы Task1.Run.Reader (создаем читателей библиотеки)
        Reader reader1 = new Reader("Bred Pitt", 256, "Computer science", "12.02.1975", "+123-456-22-33");
        Reader reader2 = new Reader("Entony Hopkins", 345, "Media Arts", "10.11.1949", "+123-222-22-22");
        Reader reader3 = new Reader("Tom Adams", 2341, "Actor", "24.12.1990", "+123-333-33-33");

        Reader[] readers = new Reader[]{reader1, reader2, reader3};
        int countReaders = readers.length;
        System.out.println(countReaders + " - общее количество читателей библиотеки: ");

        for (Reader r : readers) {
            System.out.println(r);
        }

            System.out.println("======================================================================================================================");


            reader1.setAmount(5);
            reader1.takeBook(reader1.getAmount(), reader1.getName());
            reader1.takeBook(book1, book2, book3, book4, book5);
            reader1.returnBook(2, reader1.getName());
            reader1.returnBook(book4, book2);

            System.out.println("======================================================================================================================");

            reader2.setAmount(4);
            reader2.takeBook(reader2.getAmount(), reader2.getName());
            reader1.takeBook(book1, book3, book4, book5);
            reader2.returnBook(3, reader2.getName());
            reader2.returnBook(book1, book4, book5);

            System.out.println("======================================================================================================================");

            reader3.setAmount(3);
            reader3.takeBook(reader3.getAmount(), reader3.getName());
            reader3.takeBook(book2, book4, book5);
            reader3.returnBook(2, reader3.getName());
            reader3.returnBook(book4, book5);

            System.out.println("======================================================================================================================");
        }
    }

