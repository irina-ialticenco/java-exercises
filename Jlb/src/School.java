import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в школу!");
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("В нашей школе сейчас " + students.size() + " учеников. 1- добавить ученика," +
                    " 2- показать список учеников, 3-закрыть программу");
            Scanner in = new Scanner(System.in);
            int number = Integer.parseInt(in.nextLine());
            switch (number) {
                case 1:
                    System.out.println("Введите имя ученика");
                    String name = in.nextLine();
                    System.out.println("Введите год рождения ученика");
                    int yearOfBirth = Integer.parseInt(in.nextLine());
                    students.add(new Student(name, yearOfBirth));
                    break;
                case 2:
                    System.out.println("Список учеников: " );
                    printStudents(students);
                    break;
                case 3:
                    return;
            }

        }
    }

    static String printStudents(ArrayList<Student> students) {
        for (int c = 0; c < students.size(); c++) {
            Student student = students.get(c);
            System.out.println((c + 1) + "." + student.getName()+" " + " " + student.getYearOfBirth());
        }
        return null;
    }

}