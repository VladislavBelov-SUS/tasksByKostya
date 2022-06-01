import java.util.Scanner;

public class Main {

    private static int key;

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
                array.sort();
            } else if (command == 3) {
                array.inputArrayElement(scanner);
                ;
            } else if (command == 4) {
                array.eraseArrayElement(scanner);
            } else if (command == 5) {
                array.searchArrayElement(array, scanner);
            } else if (command == 6) {
                array.searchArrayIndex(array, scanner);
            } else if (command == 7) {
                System.out.println("Введите число которое вы хотите найти ");
                int key = scanner.nextInt();
                int position = array.binarySearch(array, key);
                if(position == -1){
                    System.out.println ("Поиск" + key + ", такого числа в последовательности нет!");
                }else{
                    System.out.println ("Поиск" + key + ", найти позицию:" + position);
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
