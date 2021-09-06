import java.util.Scanner;

public class HomeworkScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buna ziua!");
        System.out.println("Introduceti numele Dvs:");
        String inputNume = scanner.nextLine();
        System.out.println("Buna ziua, " + inputNume);
    }
}

