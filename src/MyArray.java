import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    int[] array;
    Random rnd = new Random();

    public MyArray(int size) {
        array = new int[size];

    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - заполнить массив");
        System.out.println("2 - отсортировать  массив");
        System.out.println("3 - вставка элемента в массив");
        System.out.println("4 - удаление элемента массива");
        System.out.println("5 - Показать индекс элемента массива");
        System.out.println("6 - Показать элемент массива под индексом");
        System.out.println("7 - воспользоваться двоичным поиском");
        System.out.println("0 - Выход");
    }

    public void filling() {
        int low = 0;
        int high = 1000;
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt((high - low) + low);
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
    }

    public void sort() {
        int[] sortedArray = new int[array.length];
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
        this.array = sortedArray;
    }

    public int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int middle = 0;
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }
        while (low <= high) {
            middle = (low + high) / 2;
            if (array[middle] > key) {
                high = middle - 1;
            } else if (array[middle] < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return - 1;
    }

    public void inputArrayElement(Scanner scanner) {
        System.out.println("Введите число на которое хотите заменить последний элемент Массива -> ");
        int userInput = scanner.nextInt();
        int index = array.length - 1;
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = userInput;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс массива[" + i + "]=" + newArray[i]);
        }
        this.array = newArray;
    }

    public void eraseArrayElement(Scanner scanner) {
        System.out.println("Введите индекс массива, который вы хотите удалить-> ");
        int userInput = scanner.nextInt();
        int[] newArray = new int[array.length + 1];
        for (int i = userInput; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        newArray[array.length - 1] = 0;
        for (int i = 0; i < array.length - 1; i++) {

            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
        this.array = newArray;
    }

    public void searchArrayIndex(MyArray array, Scanner scanner) {
        System.out.println("Введите число из массива, индекс которого вы хотите узнать-> ");
        int userInput = scanner.nextInt();
        System.out.println(this.array[userInput]);

    }

    public void searchArrayElement(MyArray array, Scanner scanner) {
        System.out.println("Введите индекс массива, чтобы увидеть число-> ");
        int userInput = scanner.nextInt();
        for (int i = 0; i < this.array.length; i++) {
            if (userInput == this.array[i]) {
                System.out.println("Индекс массива[" + i + "]");
            }
        }

    }
//    public int runBinarySearchIteratively(int[] array, int key, int low, int high) {
//        int index = Integer.MAX_VALUE;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (array[mid] < key) {
//                low = mid + 1;
//            } else if (array[mid] > key) {
//                high = mid - 1;
//            } else if (array[mid] == key) {
//                index = mid;
//                break;
//            }
//        }
//        return index;
//    }


}
