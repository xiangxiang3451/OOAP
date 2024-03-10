package AbstractFactory;

public class ChinaPepperPizza extends PepperPizza{
    public void prepare() {
        setName("ChinaPepperPizza");
        System.out.println("Prepare materials for ChinaPepperPizza");
    }
}
