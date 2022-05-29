import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int[] array = new int[size];
    Random rnd = new Random();

    public MyArray() {

    }

    public void filling() {
        int low = 0;
        int high = 1000;
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt((high - low) + low);
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
        System.out.println("Если хотите отсортировать массив по возрастанию, нажмите 1. Если не хотите нажмите 0.");
        int userInput = input.nextInt();
        if (userInput == 1) {
            Arrays.sort(array);

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("хорошо");
        }

    }


    public void inputArrayElement() {
        System.out.println("Введите число на которое хотите заменить последний элемент Массива -> ");
        int num = input.nextInt();
        int index = array.length;
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = num;
        for (int i = index; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        for (int i : newArray) {
            System.out.println("Индекс массива[" + i + "]=" + newArray[i]);
        }
    }

    public void eraseArrayElement() {
        System.out.println("Введите индекс массива, который вы хотите удалить-> ");

        int userInput = input.nextInt();
        for (int i = userInput; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        for (int i : array) {
            System.out.println("Индекс массива[" + i + "]=" + array[i]);
        }
    }

    public void searchArrayIndex() {
        System.out.println("Введите индекс массива, чтобы увидеть число-> ");
        int userInput = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (userInput == i) {
                System.out.println("Индекс массива[" + array[i] + "]");
            }
        }
        System.out.println();

    }

    public void searchArrayElement() {
        System.out.println("Введите число из массива, индекс которого вы хотите узнать-> ");

        int userInput = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (userInput == array[i]) {
                System.out.println("Индекс массива[" + i + "]");
            }
        }

    }

}
