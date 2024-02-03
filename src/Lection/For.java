package Lection;

public class For {
    public static boolean getMutiple4(int i) {

        return i % 4 == 0;
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--)
            if (i % 4 == 0)
        {
            boolean mutiple4 = getMutiple4(i);
            System.out.print(i + "-");
            System.out.print(getMutiple4(i) + ", ");
        }
    }
}


