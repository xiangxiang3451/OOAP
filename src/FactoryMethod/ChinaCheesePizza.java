package FactoryMethod;

public class ChinaCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("ChinaCheesePizza");
        System.out.println("Prepare materials for ChinaCheesePizza");
    }
}
