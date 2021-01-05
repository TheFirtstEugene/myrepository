package lesson2;
import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите поочерёдно переменные а и b");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        int b = sc.nextInt();
        System.out.println("b = " + b);
        System.out.println("Результат будет " + Math.log(b) / Math.log(a));
    }
}
