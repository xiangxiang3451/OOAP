package SimpleFactory;
//简单工厂类
public class SimpleFactory {


    //根据orderType返回pizza对象
    public  Pizza createPizza(String orderType){

        Pizza pizza=null;
        System.out.println("Using SimpleFactory");

        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza=new CheesePizza();
            pizza.setName("cheese");
        }
        return  pizza;
    }
}
