package lesson1;
import java.util.Scanner;
import java.util.Locale;

public class Task4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test1 ob1 = new Test1();
        ob1.s = s;
        System.out.println(ob1.firstUpperCase(s));

    }
}
class Test1{
     String s;

     public  String firstUpperCase(String word){
        return  word.substring(0,1).toUpperCase(Locale.ROOT)+word.substring(1).toLowerCase(Locale.ROOT);
    }

}
