package dev.sdev.tao;

public class HomeWork {
    public static void main(String[] args) throws Exception {
        even(100);
        judement('A');
        judement('B');
        judement('C');
        judement('E');

        multiTable();
    }

    public static void even(int max) {
        System.out.println("0 - " + max + "之间的偶数：");
        for (int i = 0; i <= max; i += 2) {
            System.out.printf("%d, ", i);
        }
        System.out.println();
    }

    public static void judement(char level) {
        switch (level) {
            case 'A':
                System.out.println("你太棒了！");
                break;
            case 'B':
                System.out.println("不错，还望再接再厉！");
                break;
            case 'C':
                System.out.println("把你家长叫来！");
                break;
            default:
                System.out.println("你获得了再学一年的称号！");
        }
    }

    public static void multiTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i < j) break;
                System.out.printf("%d * %d = %d, ", j, i, i * j);
            }
            System.out.println();
        }
    }

}
