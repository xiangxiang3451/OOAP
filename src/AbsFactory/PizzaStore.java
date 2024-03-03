package AbsFactory;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new ChinaFactory());

        new OrderPizza(new RussiaFactory());
    }
}
