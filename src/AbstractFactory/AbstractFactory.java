package AbstractFactory;



public abstract class AbstractFactory {
    public abstract PepperPizza createPepperPizza(String orderType);
    public abstract CheesePizza createCheesePizza(String orderType);
}
