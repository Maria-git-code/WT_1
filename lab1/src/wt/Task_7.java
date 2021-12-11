package wt;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {

    public static void sort(double[] array) {
        int i = 0;
        int bound = array.length - 1;
        while (i < bound) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        double[] numbers = Task_6.readDoubleArray(scanner, n);
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
