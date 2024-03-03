package AbsFactory;

public class ChinaGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("ChinaGreekPizza");
        System.out.println("Prepare materials for ChinaGreekPizza");
    }
}
