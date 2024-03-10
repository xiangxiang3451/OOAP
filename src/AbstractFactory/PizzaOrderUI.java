package AbstractFactory;

import AbstractFactory.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrderUI extends JFrame {
    private JComboBox<String> pizzaStyleComboBox;
    private JComboBox<String> regionComboBox;
    private JButton orderButton;

    public PizzaOrderUI() {
        super("Pizza Ordering System");

        // Create components
        JLabel pizzaStyleLabel = new JLabel("Select the pizza style:");
        String[] pizzaStyles = {"Cheese", "Pepper"};
        pizzaStyleComboBox = new JComboBox<>(pizzaStyles);

        JLabel regionLabel = new JLabel("Select the region:");
        String[] regions = {"China", "Russia"};
        regionComboBox = new JComboBox<>(regions);

        orderButton = new JButton("Place Order");

        // Add action listener to the order button
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedStyle = (String) pizzaStyleComboBox.getSelectedItem();
                String selectedRegion = (String) regionComboBox.getSelectedItem();

                AbstractFactory factory;
                if (selectedRegion.equals("China")) {
                    factory = new ChinaPizzaFactory();
                } else {
                    factory = new RussiaPizzaFactory();
                }

                if (selectedStyle.equals("Cheese")) {
                    CheesePizza cheesePizza = factory.createCheesePizza(selectedRegion);
                    if (cheesePizza != null) {
                        cheesePizza.prepare();
                        cheesePizza.bake();
                        cheesePizza.cut();
                        cheesePizza.box();
                    } else {
                        System.out.println("Invalid order type for cheese pizza.");
                    }
                } else if (selectedStyle.equals("Pepper")) {
                    PepperPizza pepperPizza = factory.createPepperPizza(selectedRegion);
                    if (pepperPizza != null) {
                        pepperPizza.prepare();
                        pepperPizza.bake();
                        pepperPizza.cut();
                        pepperPizza.box();
                    } else {
                        System.out.println("Invalid order type for pepper pizza.");
                    }
                }
            }
        });

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(pizzaStyleLabel);
        add(pizzaStyleComboBox);
        add(regionLabel);
        add(regionComboBox);
        add(orderButton);

        // Set frame properties
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false); // Disable resizing
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PizzaOrderUI();
            }
        });
    }
}
