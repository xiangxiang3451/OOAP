package SimpleFactory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare materials for GreekPizza");
    }
}
