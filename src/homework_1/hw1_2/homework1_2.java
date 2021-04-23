package homework_1.hw1_2;

import java.util.Arrays;
import java.util.List;

public class homework1_2 {

    public static void main(String[] args) {

        //Задача 1. Написать метод, который меняет два элемента массива местами (массив может быть любого
        //ссылочного типа);
        String[] arr = {"a", "b", "c", "d", "e"};
        Integer[] intArr = {1, 2, 3, 4, 5};
        System.out.println("Задача 1\n" + Arrays.toString(intArr));
        swapElements(arr, 2, 4);
        System.out.println("Задача 1\n" + Arrays.toString(intArr) + "\n============");

        //Задача 2. Написать метод, который преобразует массив в ArrayList;
        List<Integer> list = convertToList(intArr);
        System.out.println("Задача 2\n" + list.getClass());

    }
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
