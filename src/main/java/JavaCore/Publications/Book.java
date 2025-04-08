package JavaCore.Publications;

import java.util.Objects;
import java.util.Scanner;

public class Book extends Publication{
    private long ISBN;

    public Book(Scanner sc) {
        super.input(sc);

        System.out.println("Введите ISBN: ");
        this.ISBN = sc.nextLong();
        sc.nextLine();
        System.out.println("Публикация успешно добавлена!");
    }

    @Override
    public String toString() {
        return "Book: " +
                "title - '" + super.getTitle() + '\'' +
                ", author - '" + super.getAuthor() + '\'' +
                ", year - " + super.getYear() +
                ", ISBN - " + ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ISBN);
    }

    @Override
    public String getType() {
        return "Book";
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
}
