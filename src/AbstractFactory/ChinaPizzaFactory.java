package AbstractFactory;





public class ChinaPizzaFactory extends AbstractFactory{


    @Override
    public PepperPizza createPepperPizza(String orderType) {
        System.out.println("~~using abstract factory~~");
        PepperPizza pepperPizza=null;

        if (orderType.equals("China")) {
           pepperPizza=new ChinaPepperPizza();
        }

        return pepperPizza;
    }



    @Override
    public CheesePizza createCheesePizza(String orderType) {
        System.out.println("~~using abstract factory~~");
        CheesePizza cheesePizza=null;

        if (orderType.equals("China")) {
            cheesePizza=new ChinaCheesePizza();
        }
        return cheesePizza;
    }
}
