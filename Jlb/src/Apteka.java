import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Apteka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<Product>();
        Product product = new Product("Citramon Forte", 144, 23.5);
        products.add(product);
        products.add(new Product("Peroxid de hidrogen 3 %", 200, 14.87));
        products.add(new Product("Tinctura de galbenele", 484, 10.40));
        products.add(new Product("Durex play", 503, 120.40));
        products.add(getEmptyProduct());

        boolean isWorking = true;
        double total = 0;

        while (isWorking) {
            System.out.println("1 - Ввести код продукта, 2 - Подсчитать стоимость");
            int number = in.nextInt();

            if (number == 1) {
                System.out.println("Введите код продукта");
                number = in.nextInt();
                Product p = findProductByCode(products, number);
                if(p ==null){
                    System.out.println("продукт не найден");

                }
                else {
                    System.out.println(p.getName()+", "+p.getPrice());
                    total += p.getPrice();
                }

            } else {
                isWorking = false;
            }
        }

        System.out.println("===========");
        System.out.println(String.format("Всего: %.2f", total));

        /*int k = 57;
        int c = 32;
        Apteka apteka = new Apteka();
        apteka.calculate(5);
        apteka.calculate(5 * 5);
        apteka.calculate(k);
        apteka.calculate(k * c);
        apteka.calculate(sqrt(k * c));*/
    }

    private static Product findProductByCode(ArrayList<Product> products, int code) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if(code ==product.getCode()){
                return product;
            }
        }

        return null;
    }

    public static Product getEmptyProduct(){
        return new Product("",0,0);
    }

    public static int sqrt(int m) {
        return (int) Math.sqrt(m);
    }

    public static int calculate(int x) {
        return x * x;
    }
}

