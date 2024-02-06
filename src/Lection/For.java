package Lection;

public class For {
    public static boolean getMutiple4(int i) {

        return i % 4 == 0;
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {

            if (getMutiple4(i)) {
                System.out.println(i);
            }
        }

    }
}


