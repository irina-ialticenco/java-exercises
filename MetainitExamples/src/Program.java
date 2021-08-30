import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на кто хочет стать миллионером!");
        System.out.println("Какой цвет получится,если смешать красный и синий?");
        System.out.println("1-бирюзовый 2-фиолетовый 3-желтый 4-коричневый");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch (number) {
            case 2:
                System.out.println("Правильно");
                break;
            default:
                System.out.println("вы проиграли");
                return;
        }

        System.out.println("Какая самая длинная река в мире?:" +
                "1- Янцзы 2-Нил 3-Амазонка 4- Миссисипи");
        int number2 = in.nextInt();
        switch (number2) {
            case 3:
                System.out.println("Правильно");
                break;
            default:
                System.out.println("вы проиграли");
           return;
        }
        System.out.println("От чего яблоко падает недалеко?:" +
                "1- от червяка 2- от садовода 3-от Ньютона 4- от яблони");
        int number3 = in.nextInt();

        switch (number3) {

            case 4:
                System.out.println("Вы-победитель!");
                break;
            default:
                System.out.println("вы проиграли");
                return;
        }
    }
}

