package AbsFactory;

import FactoryMethod.Pizza;

public interface AbsFactory {

    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
