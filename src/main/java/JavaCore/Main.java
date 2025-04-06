package JavaCore;

import JavaCore.Publications.Book;
import JavaCore.Publications.Publication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("\nВыберите действие: 1 - добавить публикацию, 2 - удалить публикацию,\n" +
                    "3 - исправить данные о публикации, 4 - посмотреть счётчик публикаций: ");
            switch (sc.nextShort()){
                case 1:
                    try {
                        library.addPublication(sc);
                    } catch (Exception e){
                        System.out.println(e);
                        break;
                    }
                    break;
                case 2:
// todo
                case 3:
// todo
                case 4:
                    System.out.println(Publication.getCountPublication());
                    break;
                default:
                    System.out.println("Пожалуйста, введите валидное число: ");
            }

        }

    }
}