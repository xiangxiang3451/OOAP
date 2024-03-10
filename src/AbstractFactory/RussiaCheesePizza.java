package AbstractFactory;

public class RussiaCheesePizza extends CheesePizza{
    public void prepare() {
        setName("RussiaCheesePizza");
        System.out.println("Prepare materials for RussiaCheesePizza");
    }
}
