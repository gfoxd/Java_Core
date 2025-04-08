package JavaCore.Publications;

import java.util.Objects;
import java.util.Scanner;

public class Newspaper extends Publication {
    private String publicationDay;

    public Newspaper(Scanner sc) {
        super.input(sc);

        System.out.println("Введите день недели публикации: ");
        this.publicationDay = sc.nextLine();
        System.out.println("Публикация успешно добавлена!");
    }

    @Override
    public String toString() {
        return "Newspaper: " +
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
