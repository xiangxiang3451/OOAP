package AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbstractFactory factory;

    public OrderPizza(AbstractFactory factory) {
        setFactory(factory);
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public void startOrdering() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Input pizza type (cheese/pepper):");
                String pizzaType = reader.readLine().trim().toLowerCase();

                if (pizzaType.equals("cheese")) {
                    System.out.println("Input order type (China/Russia):");
                    String orderType = reader.readLine().trim().toLowerCase();
                    CheesePizza cheesePizza = factory.createCheesePizza(orderType);
                    if (cheesePizza != null) {
                        cheesePizza.prepare();
                        cheesePizza.bake();
                        cheesePizza.cut();
                        cheesePizza.box();
                    } else {
                        System.out.println("Invalid order type for cheese pizza.");
                    }
                } else if (pizzaType.equals("pepper")) {
                    System.out.println("Input order type (China/Russia):");
                    String orderType = reader.readLine().trim().toLowerCase();
                    PepperPizza pepperPizza = factory.createPepperPizza(orderType);
                    if (pepperPizza != null) {
                        pepperPizza.prepare();
                        pepperPizza.bake();
                        pepperPizza.cut();
                        pepperPizza.box();
                    } else {
                        System.out.println("Invalid order type for pepper pizza.");
                    }
                } else {
                    System.out.println("Invalid pizza type. Try again.");
                }

                System.out.println("Do you want to order another pizza? (yes/no)");
                String input = reader.readLine().trim().toLowerCase();
                if (!input.equals("yes")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
