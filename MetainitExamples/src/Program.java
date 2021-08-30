import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на кто хочет стать миллионером!");
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Какой цвет получится,если смешать красный и синий?: " +
                "1-бирюзовый 2-фиолетовый 3-желтый 4-коричневый", 2));
        questions.add(new Question("Какая самая длинная река в мире?:" +
                "1- Янцзы 2-Нил 3-Амазонка 4- Миссисипи", 3));
        questions.add(new Question("От чего яблоко падает недалеко?:" +
                "1- от червяка 2- от садовода 3-от Ньютона 4- от яблони", 4));
        questions.add(new Question("В каком году люди высадились на Луну:" +
                "1- 1952 2- 1961 3- 1969 4- 1974", 3));
        questions.add(new Question("Какая самая высокая гора? 1 - Килиманджаро 2 - Эльбрус 3 - Олимп 4 - Эверест", 4));

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            boolean answer = askQuestion(question.title, question.rightAnswer);
            if (!answer) {
                return;
            }
        }

        System.out.println("Вы победитель!");
    }

    private static boolean askQuestion(String question, int rightAnswer) {
        System.out.println("==================");
        System.out.println(question);
        System.out.println("==================");
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

