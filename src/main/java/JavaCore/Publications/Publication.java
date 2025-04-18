package JavaCore.Publications;

import java.util.Objects;
import java.util.Scanner;

public abstract class Publication implements Printable {
    private String title;
    private String author;
    private short year;

    private static int countPublication;

    public static int getCountPublication() {
        return countPublication;
    }

    protected Publication() {
    }

    protected void input(Scanner sc) {
        countPublication++;
        System.out.println("Введите название: ");
        this.title = sc.nextLine();
        System.out.println("Введите автора: ");
        this.author = sc.nextLine();
        System.out.println("Введите год: ");
        this.year = sc.nextShort();
        sc.nextLine();
    }

    protected Publication(String title, String author, short year) {
        this.title = title;
        this.author = author;
        this.year = year;

        countPublication++;
    }

    public void printDetails() {
        System.out.println(toString());
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Publication: " +
                "title - '" + title + '\'' +
                ", author - '" + author + '\'' +
                ", year - " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return year == that.year && Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void CountPublicationMinusOne() {
        countPublication--;
    }
}
