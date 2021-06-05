package dev.sdev.tao;

public class HomeWork {
    public static void main(String[] args) throws Exception {
        char arr[] = { 'C', 'H', 'I', 'N', 'A' };
        sort(arr);
        System.out.println(sqrt(20));
        System.out.println(sqrt(1));
    }

    public static void sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                char tc = arr[k];
                arr[k] = arr[i];
                arr[i] = tc;
            }
        }
        System.out.println(arr);
    }

    public static double sqrt(double x) {
        if (x < 1) return 0;
        final float THRESHOLD = 0.00001F;
        double a = 0;
        double b = x;
        while (b - a > THRESHOLD) {
            double m = (a + b) / 2;
            double s = m * m;
            if (s == x) {
                return m;
            } else if (s > x) {
                b = m;
            } else {
                a = m;
            }
        }
        return b;
    }

}
