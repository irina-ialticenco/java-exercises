import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        for(int e=0;e<numbers.length;e++ ){
            System.out.println("Введите число");
            int number = in.nextInt();
            numbers[e] = number;

        }
        int[] result = inverse(numbers) ;
        for(int h=0;h<result.length;h++){
            System.out.println(result[h]);
        }

    }

    public static int[] inverse(int[] numbers) {
        int[]d= new int[5];
        for (int i = 0; i < numbers.length; i++) {
            d[i] = numbers[numbers.length-1-i];



        }
        return d;



    }
}


