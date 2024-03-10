package AbstractFactory;

public class RussiaPepperPizza extends PepperPizza{
    public void prepare() {
        setName("RussiaPepperPizza");
        System.out.println("Prepare materials for RussiaPepperPizza");
    }
}
