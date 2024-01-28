package Lection;

public class For {
    public static void main(String[] args){

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

            // числа кратные четырем от 1 до 100
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
