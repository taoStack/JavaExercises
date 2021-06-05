package dev.sdev.tao;

public class HomeWork {
    public static void main(String[] args) throws Exception {
        invers(8492);
        invers(325);

        int[][] test = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        matrix(test);
    }

    public static void invers(int x) {
        if (x < 100 || x > 999)
            System.out.println("数字位数最好在区间 : [100, 1000)");

        System.out.print(x + "反转后的结果：");
        while (x > 0) {
            System.out.print(x % 10);
            x /= 10;
        }

        System.out.println();

    }

    public static void matrix(int[][] arr) {
        System.out.println("转换前：");
        
        System.out.printf("%d,\t%d,\t%d,\t%d\n", arr[0][0], arr[0][1], arr[0][2], arr[0][3] );
        System.out.printf("%d,\t%d,\t%d,\t%d\n", arr[1][0], arr[1][1], arr[1][2], arr[1][3] );
        System.out.printf("%d,\t%d,\t%d,\t%d\n", arr[2][0], arr[2][1], arr[2][2], arr[2][3] );

        System.out.println("转换后：");

        System.out.printf("%d,\t%d,\t%d\n", arr[0][0], arr[1][0], arr[2][0]);
        System.out.printf("%d,\t%d,\t%d\n", arr[0][1], arr[1][1], arr[2][1]);
        System.out.printf("%d,\t%d,\t%d\n", arr[0][2], arr[1][2], arr[2][2]);
        System.out.printf("%d,\t%d,\t%d\n", arr[0][3], arr[1][3], arr[2][3]);
    }
}
