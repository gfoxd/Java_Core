package JavaCore.Publications;

import java.util.Objects;
import java.util.Scanner;

public class Magazine extends Publication{
    private int issueNumber;

    public Magazine(Scanner sc) {
        super.input(sc);

        System.out.println("Введите номер выпуска: ");
        this.issueNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Публикация успешно добавлена!");
    }

    @Override
    public String toString() {
        return "Magazine: " +
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
