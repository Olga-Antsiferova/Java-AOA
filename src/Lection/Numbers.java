package Lection;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        int numbersSum = 0;
        int oddNumbersSum = 0;
        int maxNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            numbersSum += digit;

            if (digit % 2 != 0) {
                oddNumbersSum += digit;
            }

            if (digit > maxNumber) {
                maxNumber = digit;
            }

            number /= 10;
        }

        System.out.println("Сумма цифр числа: " + numbersSum);
        System.out.println("Сумма нечетных цифр числа: " + oddNumbersSum);
        System.out.println("Максимальная цифра числа: " + maxNumber);
    }
}

