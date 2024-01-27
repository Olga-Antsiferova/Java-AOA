package Lection;

public class Average
{
    public static void main(String[] args){

        int a = 3;
        int lastNumber = 17;
        int numbersCount = 0;
        int numbersSum = 0;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        while (a <= lastNumber) {
            numbersSum += a;
            numbersCount++;

            if (a % 2 == 0) {
                evenNumbersSum += a;
                evenNumbersCount++;
            }

            ++a;
        }
        double numbersAverage = (double) numbersSum / numbersCount;
        System.out.println("Среднее арифметическое чисел = " + numbersAverage);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел = " + evenNumbersAverage);
    }
}
