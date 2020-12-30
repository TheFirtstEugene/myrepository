package lesson1;

public class Reverse {
    public static void main(String[] args) {
        //переключение значений двух переменных с использованием третьей

        int a = 15;
        int b = 10;
        int c = 20;

        c = a; // c = 15
        a = b; // a = 10;
        b = c; // b = 15

        System.out.println(a);
        System.out.println(b);

    }
}