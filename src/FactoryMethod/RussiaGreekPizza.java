package FactoryMethod;

public class RussiaGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("RussiaGreekPizza");
        System.out.println("Prepare materials for RussiaGreekPizza");
    }
}
