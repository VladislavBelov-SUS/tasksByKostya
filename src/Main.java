import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива ");
        int userInput = scanner.nextInt();
        MyArray array = new MyArray(userInput);

        while (true) {
            array.printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                array.filling();
            } else if (command == 2) {
                System.out.println("Выберите тип сортировки, которым хотите воспользоваться? ");
                System.out.println("1 - Arrays.sort ");
                System.out.println("2 - bubbleSort ");
                System.out.println("3 - insertionSort ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    array.sort();
                } else if (choice == 2) {
                    array.bubbleSort();
                } else if (choice == 3) {
                    array.insertionSort();
                }
            } else if (command == 3) {
                array.addArrayElement(scanner);
            } else if (command == 4) {
                array.eraseArrayElement(scanner);
            } else if (command == 5) {
                array.searchArrayIndex(scanner);
            } else if (command == 6) {
                array.searchArrayElement(scanner);
            } else if (command == 7) {
                System.out.println("Введите число которое вы хотите найти ");
                int key = scanner.nextInt();
                int position = array.binarySearch(key);
                if (position == -1) {
                    System.out.println("Поиск " + key + " , такого числа в последовательности нет!");
                } else if (command == 8) {
                    array.stack();
                } else if (command == 9) {
                    array.queue();
                } else {
                    System.out.println("Число " + key + " , находиться в индексе" + position);
                }
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
