package FactoryMethod;

public class RussiaCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("RussiaCheesePizza");
        System.out.println("Prepare materials for RussiaCheesePizza");
    }
}
