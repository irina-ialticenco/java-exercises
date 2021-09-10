import java.util.ArrayList;

public class User {
    private String name;
    private double balance;
    private ArrayList<Product> products;

    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Product> products() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    void addToCard(Product product) {
        products.add(product);

    }

    void printMyCard() {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + "." + product.getName()+" " + product.getWeight()+" " + "грамм" +" "+
                    product.getPrice());
        }
    }

    boolean completePurchase() {
        int sum = 0;
        for( int a=0;a<products.size();a++){
            Product product = products.get(a);
            sum += product.getPrice();
        }
        if (sum <= balance) {
            printMyCard();
            System.out.println("Благодарим за покупку");
        } else {
            System.out.println("Недостаточно средств");
        }
        return false;
    }


}
