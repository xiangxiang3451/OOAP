package SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
//    public  OrderPizza(){
//        Pizza pizza=null;
//
//        String orderType;//订购披萨类型
//
//        do {
//            orderType=getType();
//            if (orderType.equals("greek")){
//                pizza=new GreekPizza();
//                pizza.setName("greek");
//            } else if (orderType.equals("cheese")) {
//                pizza=new CheesePizza();
//                pizza.setName("cheese");
//            }else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//        }while (true);
//
//    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza=null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory){

        setSimpleFactory(simpleFactory);
    }

    public void  setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";//用户输入
        this.simpleFactory=simpleFactory;//设置简单工厂对象

        do {
            orderType=getType();
            pizza=this.simpleFactory.createPizza(orderType);

            if (pizza!=null){//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("Order failed !!!");
                break;
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
