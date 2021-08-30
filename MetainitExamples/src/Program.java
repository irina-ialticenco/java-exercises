import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на кто хочет стать миллионером!");

        HashMap<String, Integer> questions = new HashMap<String, Integer>();
        questions.put("Какой цвет получится,если смешать красный и синий?: " +
                "1-бирюзовый 2-фиолетовый 3-желтый 4-коричневый", 2);
        questions.put("Какая самая длинная река в мире?:" +
                "1- Янцзы 2-Нил 3-Амазонка 4- Миссисипи", 3);
        questions.put("От чего яблоко падает недалеко?:" +
                "1- от червяка 2- от садовода 3-от Ньютона 4- от яблони", 4);

        for (Map.Entry<String, Integer> entry : questions.entrySet()){
            boolean answer = askQuestion(entry.getKey(), entry.getValue());
            if (!answer){
                return;
            }
        }

        System.out.println("Вы победили!");
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

