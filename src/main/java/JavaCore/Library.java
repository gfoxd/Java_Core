package JavaCore;

import JavaCore.Publications.Book;
import JavaCore.Publications.Magazine;
import JavaCore.Publications.Newspaper;
import JavaCore.Publications.Publication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Publication> publicationList = new ArrayList<>();

    public Library() {}

    public void addPublication(Scanner sc){
        System.out.println("Какую публикацию хотите добавить? (1 – Book, 2 – Magazine, 3 – Newspaper)");

        switch (sc.nextShort()){
            case 1:
                Publication publication1 = new Book(sc);
                publicationList.add(publication1);
                break;
            case 2:
                Publication publication2 = new Magazine(sc);
                publicationList.add(publication2);
                break;
            case 3:
                Publication publication3 = new Newspaper(sc);
                publicationList.add(publication3);
                break;
            default:
                System.out.println("Пожалуйста, введите валидное число: ");
        }
    }

    public void deletePublicatoin(Scanner sc){
        // todo
    }

    public void updatePublicatoin(Scanner sc){
        // todo
    }

    public List<Publication> getPublicationList() {
        return publicationList;
    }
}