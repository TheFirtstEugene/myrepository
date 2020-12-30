package lesson1;

public class Version2 {
    public static void main(String[] args) {
        //переключение значений двух переменных без использования третьей

        int a = 15;
        int b = 10;

        a = 15*10;   // a = 150
        b = a/10;   // b = 15;
        a = a/15;  // a = 10;

        System.out.println(a);
        System.out.println(b);

    }
}

