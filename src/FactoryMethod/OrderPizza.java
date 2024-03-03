package FactoryMethod;

import originalcode.CheesePizza;
import originalcode.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class  OrderPizza {

    //定义一个抽象方法，让各个工厂子类自己实现
    abstract  Pizza  createPizza(String orderType);
    public OrderPizza(){
        Pizza pizza=null;
        String orderType;

        do {
            orderType=getType();
            pizza=createPizza(orderType);//抽象方法，由工厂子类完成

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);
    }


    private String getType(){
        try {
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza type:");
            String str=strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";

        }
    }
}
