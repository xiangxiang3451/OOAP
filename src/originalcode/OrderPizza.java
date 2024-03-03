package originalcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
    public  OrderPizza(){
        Pizza pizza=null;

        String orderType;//订购披萨类型

        do {
            orderType=getType();
            if (orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("greek");
            } else if (orderType.equals("cheese")) {
                pizza=new CheesePizza();
                pizza.setName("cheese");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

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
