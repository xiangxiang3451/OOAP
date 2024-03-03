package SimpleFactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Prepare raw materials for CheesePizza");
    }
}
