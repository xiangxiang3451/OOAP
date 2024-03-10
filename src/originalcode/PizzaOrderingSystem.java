package originalcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheesePizza {
    String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}

class PepperPizza {
    String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}

class PizzaArea {
    public CheesePizza createCheesePizza(String region) {
        CheesePizza cheesePizza = new CheesePizza();
        if (region.equalsIgnoreCase("China")) {
            cheesePizza.name = "ChinaCheesePizza";
        } else if (region.equalsIgnoreCase("Russia")) {
            cheesePizza.name = "RussiaCheesePizza";
        }
        return cheesePizza;
    }

    public PepperPizza createPepperPizza(String region) {
        PepperPizza pepperPizza = new PepperPizza();
        if (region.equalsIgnoreCase("China")) {
            pepperPizza.name = "ChinaPepperPizza";
        } else if (region.equalsIgnoreCase("Russia")) {
            pepperPizza.name = "RussiaPepperPizza";
        }
        return pepperPizza;
    }
}

public class PizzaOrderingSystem {
    public static void main(String[] args) {
        PizzaArea factory = new PizzaArea();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Input pizza type (cheese/pepper):");
                String pizzaType = reader.readLine().trim().toLowerCase();

                System.out.println("Input order type (China/Russia):");
                String orderType = reader.readLine().trim().toLowerCase();

                if (pizzaType.equals("cheese")) {
                    CheesePizza cheesePizza = factory.createCheesePizza(orderType);
                    cheesePizza.prepare();
                    cheesePizza.bake();
                    cheesePizza.cut();
                    cheesePizza.box();
                } else if (pizzaType.equals("pepper")) {
                    PepperPizza pepperPizza = factory.createPepperPizza(orderType);
                    pepperPizza.prepare();
                    pepperPizza.bake();
                    pepperPizza.cut();
                    pepperPizza.box();
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
