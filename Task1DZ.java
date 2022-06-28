
/*Написать программу вычисления n-ого треугольного числа. */

import java.util.Scanner;

public class Task1DZ {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число ");
        int number = iScanner.nextInt();
        int triangularNumber = (number * (number + 1)) / 2;
        System.out.printf("Треугольное число равно %d", triangularNumber);
        iScanner.close();
    }
}
