package AbstractFactory;

public class RussiaPizzaFactory extends AbstractFactory{
    public PepperPizza createPepperPizza(String orderType) {
        System.out.println("~~using abstract factory~~");
        PepperPizza pepperPizza=null;

        if (orderType.equals("Russia")) {
            pepperPizza=new RussiaPepperPizza();
        }

        return pepperPizza;
    }



    @Override
    public CheesePizza createCheesePizza(String orderType) {
        System.out.println("~~using abstract factory~~");
        CheesePizza cheesePizza=null;

        if (orderType.equals("Russia")) {
            cheesePizza=new RussiaCheesePizza();
        }
        return cheesePizza;
    }
}
