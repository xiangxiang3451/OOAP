package SimpleFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());

        System.out.println("~~Exit the program~~");
    }
}
