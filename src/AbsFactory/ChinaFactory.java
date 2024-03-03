package AbsFactory;

import FactoryMethod.ChinaCheesePizza;
import FactoryMethod.ChinaGreekPizza;
import FactoryMethod.Pizza;

public class ChinaFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("~~using abstract factory~~");
        Pizza pizza=null;
        
        if (orderType.equals("cheese")){
            pizza=new ChinaCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza=new ChinaGreekPizza();
        }

        return pizza;
    }
}
