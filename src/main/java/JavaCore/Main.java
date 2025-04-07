package JavaCore;

import JavaCore.Publications.Book;
import JavaCore.Publications.Publication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        boolean onOff = true;

        while (onOff){
            System.out.println("\nВыберите действие:\n1 - добавить публикацию\n2 - удалить публикацию\n" +
                    "3 - исправить данные о публикации\n4 - посмотреть счётчик публикаций\n5 - посмотреть все публикации\n" +
                    "6 - поиск по названию\n7 - поиск по автору\n8 - выход из приложения: ");

            try {
                short whatDo = sc.nextShort();
                sc.nextLine();
                switch (whatDo) {
                    case 1:
                        try {
                            library.addPublication(sc);
                        } catch (Exception e) {
                            System.out.println(e);
                            break;
                        }
                        break;
                    case 2:
                        library.deletePublication(sc);
                        break;
                    case 3:
                        library.updatePublication(sc);
                        break;
                    case 4:
                        System.out.println("Всего публикаций:1 " + Publication.getCountPublication());
                        break;
                    case 5:
                        library.printAll();
                        break;
                    case 6:
                        System.out.println("Введите название публикации для поиска: ");
                        library.searchByTitle(sc);
                        break;
                    case 7:
                        System.out.println("Введите имя автора для поиска: ");
                        library.searchByAuthor(sc);
                        break;
                    case 8:
                        System.out.println("До новых встреч!");
                        onOff = false;
                        break;
                    default:
                        System.out.println("Пожалуйста, введите валидное число");
                        sc.nextLine();
                    }
            }catch (Exception e){
                System.out.println("Пожалуйста, введите валидное число");
                sc.nextLine();
            }
        }
    }
}