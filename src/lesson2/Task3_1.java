package lesson2;
import java.util.Scanner;
public class Task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,x2, a, b, c;
        System.out.println("Введите поочерёдно переменные а, b и c");
        a = sc.nextInt();
        System.out.println("a = " + a);
        b = sc.nextInt();
        System.out.println("b = " + b);
        c = sc.nextInt();
        System.out.println("b = " + c);
        int d = (b*b)-(4*a*c);
        if(d>0){
            x1 = (int) ((-b+Math.sqrt(d))/(2*a));
            x2 = (int) ((-b-Math.sqrt(d))/(2*a));
            System.out.println("Корни равны :");
            if(x1>x2)
                System.out.println(x2+" "+ x1);
            else System.out.println(x1 + " "+ x2);
        }
        else if(d==0){
            x1 = -b/(2*a);
            System.out.println("У данного примера всего один корень: " + x1 + ", так как дискриминант равен 0");
        } else {
            System.out.println("Дискриминант меньше нуля. У данного уравнения нет корней");
        }


    }
}
