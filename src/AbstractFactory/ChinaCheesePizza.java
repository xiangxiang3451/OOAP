package AbstractFactory;

public class ChinaCheesePizza extends CheesePizza{
    public void prepare() {
        setName("ChinaCheesePizza");
        System.out.println("Prepare materials for ChinaCheesePizza");
    }
}
