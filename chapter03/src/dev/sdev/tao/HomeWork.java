package dev.sdev.tao;

public class HomeWork {
    public static void main(String[] args) throws Exception {
        charToInt();
        avg(1000, 26);
        avg(123, 0);
        avg(-36, 5);

    }

    public static void charToInt() {
        char a1 = '你';
        char a2 = '好';
        char a3 = 'J';
        char a4 = 'a';
        char a5 = 'v';
        char a6 = 'a';

        System.out.printf("%c%c%c%c%c%c\n", a1,a2,a3,a4,a5,a6);
        System.out.printf("%d, %d, %d, %d, %d, %d\n", (int)a1,(int)a2,(int)a3,(int)a4,(int)a5,(int)a6);
    }

    public static void avg(int x, int y) {
        if (y != 0) {
            System.out.printf("%d / %d = %d mod %d\n", x, y, x / y, x % y);
        } else {
            System.out.println("除数不能为0。");
        }
    }
}
