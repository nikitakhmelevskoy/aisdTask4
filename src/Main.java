import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();

        int[] data = inputIntArray(size);
        System.out.println(Arrays.toString(data));

        Boolean[] fixed = inputBooleanArray(size);
        System.out.println(Arrays.toString(fixed));

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(Sorting.sort(data, fixed)));
    }

    private static int[] inputIntArray(int size) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];
        System.out.println("Введите элементы входного массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    private static Boolean[] inputBooleanArray(int size) {
        Scanner scan = new Scanner(System.in);

        Boolean[] arr = new Boolean[size];
        System.out.println("Введите логические значения (True or False):");

        for (int i = 0; i < size; i++) {
            arr[i] = Boolean.valueOf(scan.next());
        }

        return arr;
    }
}