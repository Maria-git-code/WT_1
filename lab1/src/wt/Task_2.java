package wt;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();
        System.out.println("Result:\n" + checkPoint(x, y));
    }

    public static boolean checkPoint(double x, double y) {

        if ((Math.abs(x) <= 4) && (y >= 0) && (y <= 5)) {
            return true;
        }

        if ((Math.abs(x) <= 6) && (y >= -3) && (y <= 0)) {
            return true;
        }

        return false;
    }
}
