package JavaCore.Publications;

import java.util.Objects;
import java.util.Scanner;

public class Newspaper extends Publication {
    private String publicationDay;

    public Newspaper(Scanner sc) {
        System.out.println("Газета\nВведите название: ");
        String title = sc.nextLine();
        System.out.println("Введите автора: ");
        String author = sc.nextLine();
        System.out.println("Введите год: ");
        short year = sc.nextShort();
        System.out.println("Введите день недели публикации: ");
        String publicationDay = sc.nextLine();
        sc.nextLine();

        super.setTitle(title);
        super.setAuthor(author);
        super.setYear(year);
        this.publicationDay = publicationDay;
    }

    @Override
    public String toString() {
        return "Publication: " +
                "title - '" + super.getTitle() + '\'' +
                ", author - '" + super.getAuthor() + '\'' +
                ", year - " + super.getYear() +
                ", publication day - " + publicationDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(publicationDay, newspaper.publicationDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationDay);
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }
}
