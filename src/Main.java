import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива ");
        int userInput = scanner.nextInt();
        MyArray array = new MyArray(userInput);
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
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
                } else {
                    System.out.println("Число " + key + " , находиться в индексе" + position);
                }
            } else if (command == 8) {
                System.out.println("1 - добавить элемент ");
                System.out.println("2 - удалить элемент ");
                int stackInput = scanner.nextInt();
                if (stackInput == 1) {
                    int stackPush = scanner.nextInt();
                    stack.push(stackPush);
                } else if (stackInput == 2) {
                    System.out.println("Удален последний элемент массива " + stack.pop());
                }
            } else if (command == 9) {
                System.out.println("1 - добавить элемент ");
                System.out.println("2 - удалить элемент ");
                int queueInput = scanner.nextInt();
                if (queueInput == 1) {
                    int queuePush = scanner.nextInt();
                    queue.push(queuePush);
                } else if (queueInput == 2) {
                    System.out.println("Удален первый элемент массива " + queue.pop());
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
