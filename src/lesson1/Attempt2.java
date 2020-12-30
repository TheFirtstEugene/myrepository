package lesson1;
import java.util.Scanner;
public class Attempt2 {
    Attempt2(int x) {
    }
    public void age(int x){
        if(x==1){
            System.out.println("Вашей собаке и кошке по 15 лет. У вас прошёл год");
        } else if(x==2){
            System.out.println("Вашей собаке и кошке по 24 года. У вас прошло 2 года");
        } else {
            System.out.println("Вашей собаке "+ ((24)+(x*5))+" лет, кошке - "+ ((24)+(x*4))+ " а у вас прошло " + x + " лет");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Подскажите, сколько лет назад вам подарили кошку и собаку?");
        int x = scn.nextInt();
        Attempt2 ob1 = new Attempt2(x);
        ob1.age(x);
    }
}
