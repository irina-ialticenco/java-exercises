import java.util.ArrayList;
import java.util.Scanner;

public class MedicamentsExample {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в аптеку!");
        String stopPhrase = "Конец";
        String f = null;
        ArrayList<String> preparats = new ArrayList<String>();

       /* while (!stopPhrase.equals(f)) {
            System.out.println("Введите название препарата");
            Scanner in = new Scanner(System.in);
            f = in.nextLine();
            if (!f.equals("Конец")) {
                preparats.add(f);
            }
        }*/

        while (true) {
            System.out.println("Введите название препарата");
            Scanner in = new Scanner(System.in);
            f = in.nextLine();
            if (f.equals(stopPhrase)) {
                break;
            } else {
                preparats.add(f);
            }
        }

        System.out.println("В аптеке есть в наличии: ");
        printPreparats(preparats);
    }

    private static String printPreparats(ArrayList<String> preparats) {

        for (int i = 0; i < preparats.size(); i++) {
            String preparat = preparats.get(i);
            System.out.println((i + 1) + ". " + preparat);
        }
        return null;
    }

        /*boolean isEntering = true;

        while (isEntering){
            System.out.println("Введите название препарата");
            Scanner in = new Scanner(System.in);
            f = in.nextLine();
            preparats.add(f);
            if (f.equals(stopPhrase)){
                isEntering = false;
            }
        }*/

        /*while (true){
            System.out.println("Введите название препарата");
            Scanner in = new Scanner(System.in);
            f = in.nextLine();
            preparats.add(f);
            if (f.equals(stopPhrase)){
                break;
            }
        }*/

}
