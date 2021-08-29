import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch (number){
            case 1:
                System.out.println("январь");
            case 2:
                System.out.println("февраль");
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}
