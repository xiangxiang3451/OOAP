package FactoryMethod;

public class RussiaOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new RussiaCheesePizza();
        }else if (orderType.equals("greek")){
            pizza=new RussiaGreekPizza();
        }
        return  pizza;
    }
}