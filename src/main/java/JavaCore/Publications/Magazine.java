package JavaCore.Publications;

import java.util.Objects;
import java.util.Scanner;

public class Magazine extends Publication{
    private int issueNumber;

    public Magazine(Scanner sc) {
        System.out.println("Журнал\nВведите название: ");
        String title = sc.nextLine();
        System.out.println("Введите автора: ");
        String author = sc.nextLine();
        System.out.println("Введите год: ");
        short year = sc.nextShort();
        System.out.println("Введите номер выпуска: ");
        int issueNumber = sc.nextInt();
        sc.nextLine();

        super.setTitle(title);
        super.setAuthor(author);
        super.setYear(year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Publication: " +
                "title - '" + super.getTitle() + '\'' +
                ", author - '" + super.getAuthor() + '\'' +
                ", year - " + super.getYear() +
                ", issue number - " + issueNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), issueNumber);
    }

    @Override
    public String getType() {
        return "Magazine";
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
