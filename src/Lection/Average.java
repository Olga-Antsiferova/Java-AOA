package Lection;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число от 3 до 17: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите конечное число от 3 до 17: ");
        int lastNumber = scanner.nextInt();

        int numbersCount = 0;
        int numbersSum = 0;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        System.out.print("Введите число: ");

        while (firstNumber <= lastNumber) {
            numbersSum += firstNumber;
            numbersCount++;

            if (firstNumber % 2 == 0) {
                evenNumbersSum += firstNumber;
                evenNumbersCount++;
            }

            ++firstNumber;
        }
        double numbersAverage = (double) numbersSum / numbersCount;
        System.out.println("Среднее арифметическое чисел = " + numbersAverage);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел = " + evenNumbersAverage);
    }
}
