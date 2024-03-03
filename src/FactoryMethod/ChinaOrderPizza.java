package FactoryMethod;

public class ChinaOrderPizza extends OrderPizza{

    Pizza createPizza(String orderType){

        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new ChinaCheesePizza();
        }else if (orderType.equals("greek")){
            pizza=new ChinaGreekPizza();
        }
        return  pizza;

    }
}
