import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на кто хочет стать миллионером!");
        boolean answer;

        answer = askQuestion("Какой цвет получится,если смешать красный и синий?: " +
                "1-бирюзовый 2-фиолетовый 3-желтый 4-коричневый", 2);

        if (!answer)
            return;

        answer = askQuestion("Какая самая длинная река в мире?:" +
                "1- Янцзы 2-Нил 3-Амазонка 4- Миссисипи", 3);

        if (!answer)
            return;

        answer = askQuestion("От чего яблоко падает недалеко?:" +
                "1- от червяка 2- от садовода 3-от Ньютона 4- от яблони", 4);

        if (answer) {
            System.out.println("Вы победили!");
        }
    }

    private static boolean askQuestion(String question, int rightAnswer) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == rightAnswer) {
            System.out.println("Правильно!");
            return true;
        } else {
            System.out.println("Вы проиграли");
            return false;
        }
    }
}

