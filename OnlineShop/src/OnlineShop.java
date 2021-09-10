import java.util.ArrayList;

public class OnlineShop {
    public static void main(String[] args) {
        Product p = new Product("Молоко", 30.5, 2000);
        ArrayList<Product> initialProducts = new ArrayList<>();
        initialProducts.add(new Product("Творог", 500, 19.90));
        User u = new User("Jora", 500.25);
        u.addToCard(p);
        u.printMyCard();
        u.addToCard(new Product("Йогурт",200,15));
        u.printMyCard();
        u.completePurchase();

    }

}
