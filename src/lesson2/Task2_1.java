package lesson2;
import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите поочерёдно переменные а, b и c");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        int b = sc.nextInt();
        System.out.println("b = " + b);
        int c = sc.nextInt();
        System.out.println("b = " + c);
        int p = (a+b+c)/2;
        System.out.println("Площадь треугольника ровняется " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));



    }
}
