package AbsFactory;

import FactoryMethod.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza=null;
        String orderType="";
        this.factory=factory;

        do {
            orderType=getType();
            pizza=factory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }




    //获取用户希望订购的披萨
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
