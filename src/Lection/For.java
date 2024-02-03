package Lection;

public class For {
    public static boolean getMutiple4(int i) {

        if (i % 4 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            boolean mutiple4 = getMutiple4(i);
            System.out.println(mutiple4);
        }
    }
}


