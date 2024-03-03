package AbsFactory;

import javax.swing.*;
import AbsFactory.*;
import FactoryMethod.Pizza;

public class PizzaOrderGUI {

    public static void main(String[] args) {
        // 创建窗口
        JFrame frame = new JFrame("Pizza Order System");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建面板
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // 设置窗口可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel pizzaLabel = new JLabel("Select Pizza:");
        pizzaLabel.setBounds(10,20,80,25);
        panel.add(pizzaLabel);

        String[] pizzas = {"cheese", "greek"};
        JComboBox<String> pizzaList = new JComboBox<>(pizzas);
        pizzaList.setBounds(100, 20, 165, 25);
        panel.add(pizzaList);

        JLabel factoryLabel = new JLabel("Select Factory:");
        factoryLabel.setBounds(10,50,80,25);
        panel.add(factoryLabel);

        String[] factories = {"China", "Russia"};
        JComboBox<String> factoryList = new JComboBox<>(factories);
        factoryList.setBounds(100, 50, 165, 25);
        panel.add(factoryList);

        JButton orderButton = new JButton("Order");
        orderButton.setBounds(10, 80, 80, 25);
        panel.add(orderButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 355, 40);
        panel.add(resultArea);

        orderButton.addActionListener(e -> {
            String selectedPizza = (String) pizzaList.getSelectedItem();
            String selectedFactory = (String) factoryList.getSelectedItem();
            AbsFactory factory;

            if (selectedFactory.equals("China")) {
                factory = new ChinaFactory();
            } else {
                factory = new RussiaFactory();
            }

            Pizza pizza = factory.createPizza(selectedPizza);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                resultArea.setText("Ordered " + pizza.name + " from " + selectedFactory + " Factory");
            }
        });
    }
}

