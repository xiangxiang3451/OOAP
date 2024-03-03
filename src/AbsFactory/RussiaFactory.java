package AbsFactory;

import FactoryMethod.ChinaCheesePizza;
import FactoryMethod.Pizza;
import FactoryMethod.RussiaGreekPizza;

public class RussiaFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~~using abstract factory~~");
        Pizza pizza=null;

        if (orderType.equals("cheese")){
            pizza=new ChinaCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza=new RussiaGreekPizza();
        }
        return pizza;
    }
}
