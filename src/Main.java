import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5};
        String[] arr1 = {"qwe", "asd", "zxc"};
        System.out.println(Arrays.toString(swapElements(arr1, 0, 2)));

        List<String> list = convertToList(arr1);
        System.out.println(list.getClass() + " : " + list);


        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 3; i++) {
            orangeBox1.add(new Orange());
        }

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

/**
 * 3. Задача с фруктами и коробками
 * */
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    /**
    * 1. Написать метод, который меняет два элемента массива местами
    * (массив может быть любого ссылочного типа);
    * */
    private static <T> T[] swapElements(T[] arr, int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     * */
    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
