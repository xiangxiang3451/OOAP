package AbsFactory;

import FactoryMethod.Pizza;

public interface AbsFactory {


    public Pizza createPizza(String orderType);
}
