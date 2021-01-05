package lesson2;
import java.util.Scanner;
public class Task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите поочерёдно переменные а, b и c");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        int b = sc.nextInt();
        System.out.println("b = " + b);
        int c = sc.nextInt();
        System.out.println("b = " + c);
        int d = (b*b)-(4*a*c);
        int x1 = (int)(-b+Math.sqrt(d))/2*a;
        int x2 = (int)(-b-Math.sqrt(d))/2*a;
        System.out.println("Корни равны :");
        if(x1>x2)
            System.out.println(x2+" "+x1);
        else System.out.println(x1 + x2);



    }
}
