import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    int[] array;
    Random rnd = new Random();

    public MyArray(int size) {
        array = new int[size];
        filling();

    }

    public void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Заполнить массив");
        System.out.println("2 - Сортировка массива");
        System.out.println("3 - Добавление элемента массива");
        System.out.println("4 - Удаление элемента массива");
        System.out.println("5 - Показать индекс числа массива");
        System.out.println("6 - Показать число массива");
        System.out.println("7 - Воспользоваться двоичным поиском");
        System.out.println("8 - Воспользоваться стэком");
        System.out.println("9 - Воспользоваться очередью");
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
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
    }

    public void bubbleSort() {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
    }

    public int binarySearch(int key) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        if (key < array[low] || key > array[high] ) {
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
        return -1;
    }

    public void addArrayElement(Scanner scanner) {
        System.out.println("Введите число которое хотите добавить в последний элемент Массива -> ");
        int userInput = scanner.nextInt();
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = userInput;
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Индекс массива[" + i + "]=" + newArray[i]);
        }
        this.array = newArray;

    }

    public void eraseArrayElement(Scanner scanner) {
        System.out.println("Введите индекс массива, который вы хотите удалить-> ");
        int userInput = scanner.nextInt();
        int[] newArray = new int[array.length];
        for (int i = userInput; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        newArray[array.length - 1] = 0;
        for (int i = 0; i < array.length - 1; i++) {

            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
        this.array = newArray;
    }

    public void searchArrayIndex(Scanner scanner) {
        System.out.println("Введите индекс массива, чтобы увидеть число-> ");
        int userInput = scanner.nextInt();
        if (userInput < array.length) {
            System.out.println(this.array[userInput]);
        } else {
            System.out.println("Вы вышли за пределы массива");
        }
    }

    public void searchArrayElement(Scanner scanner) {
        System.out.println("Введите число из массива, индекс которого вы хотите узнать-> ");
        int userInput = scanner.nextInt();
        for (int i = 0; i < this.array.length; i++) {
            if (userInput == this.array[i]) {
                System.out.println("Индекс массива[" + i + "]");
            } else {
                System.out.println("Такого числа нет в массиве");
            }
        }
    }
}
