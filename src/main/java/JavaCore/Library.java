package JavaCore;

import JavaCore.Publications.Book;
import JavaCore.Publications.Magazine;
import JavaCore.Publications.Newspaper;
import JavaCore.Publications.Publication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Library {
    private List<Publication> publicationList = new ArrayList<>();

    public Library() {}

    public void addPublication(Scanner sc){
        System.out.println("Какую публикацию хотите добавить? (1 – Book, 2 – Magazine, 3 – Newspaper)");

        try {
            switch (sc.nextShort()) {
                case 1:
                    sc.nextLine();
                    Publication publication1 = new Book(sc);
                    publicationList.add(publication1);
                    break;
                case 2:
                    sc.nextLine();
                    Publication publication2 = new Magazine(sc);
                    publicationList.add(publication2);
                    break;
                case 3:
                    sc.nextLine();
                    Publication publication3 = new Newspaper(sc);
                    publicationList.add(publication3);
                    break;
                default:
                    System.out.println("Пожалуйста, введите валидное число: ");
            }
        }catch (Exception e){
            System.out.println("Ошибка " + e + " Пожалуйста, введите валидное число: ");
            sc.nextLine();
        }
    }

    public void deletePublication(Scanner sc){
        for (int i = 1; i <= publicationList.size(); i++) {
            System.out.println(i + " - " + publicationList.get(i - 1));
        }

        System.out.println("Выберите номер публикации для удаления: ");
        publicationList.remove(sc.nextShort());
        sc.nextLine();
        System.out.println("Публикация успешно удалена!");

        Publication.CountPublicationMinusOne();
    }

    public void updatePublication(Scanner sc){
        for (int i = 1; i <= publicationList.size(); i++) {
            System.out.println(i + " - " + publicationList.get(i - 1));
        }

        System.out.println("Выберите номер публикации для изменения: ");
        publicationList.remove(sc.nextShort());
        sc.nextLine();

        addPublication(sc);
    }

    public List<Publication> getPublicationList() {
        return publicationList;
    }

    @Override
    public String toString() {
        return "PublicationList:\n" + publicationList;
    }

    public void searchByTitle(Scanner sc) {
        boolean founded = false;
        String titleForSearch = sc.nextLine().toLowerCase();

        for (int i = 0; i < publicationList.size(); i++){
            String title = publicationList.get(i).getTitle().toLowerCase();

            if (title.contains(titleForSearch)){
                founded = true;
                System.out.println("\n" + publicationList.get(i));
            }
        }
        if (founded == false){
            System.out.println("Совпадений по названию нет :(");
        }
    }

    public void searchByAuthor(Scanner sc) {
        boolean founded = false;
        String authorForSearch = sc.nextLine().toLowerCase();

        for (int i = 0; i < publicationList.size(); i++){
            String author = publicationList.get(i).getAuthor().toLowerCase();

            if (author.contains(authorForSearch)){
                founded = true;
                System.out.println("\n" + publicationList.get(i));
            }
        }
        if (founded == false){
            System.out.println("Совпадений по автору нет :(");
        }
    }

    public void printAll() {
        for (int i = 0; i < publicationList.size(); i++) {
            System.out.println("\n" + publicationList.get(i));
        }
    }
}