package client;

import strategy.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kazim on 2016-10-11.
 */
public class PeugeotPricingForm extends JFrame {
    private JTextPane helloTextPane;
    private JPanel rootPanel;
    private JButton baselineButton;
    private JButton sportlineButton;
    private JButton racinglineButton;
    private JButton singlePaymentButton;
    private JButton instalmentsButton;
    private JTextPane textPane1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JButton searchButton;
    private JTextPane textPane2;
    private JTextPane textPane3;
    private JButton carsButton;
    private JButton motorcyclesButton;
    private JCheckBox checkBox3;
    private JTextPane textPane4;
    private JTextPane textPane5;

    private Car car = new Car("RCZ", 20000);
    private Motorcycle moto = new Motorcycle("Speedfight", 2900);
    private static JButton selectedCategoryButton;
    private static JButton selectedLineButton;
    private static JButton selectedPaymentButton;

    public PeugeotPricingForm() {
        super("Peugeot Pricing Software");
        setContentPane(rootPanel);

        helloTextPane.setText("Welcome to Peugeot online (Alpha version. Strategy Method)");
        Color iniColor = baselineButton.getBackground();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        carsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCategoryButton = carsButton;
                carsButton.setBackground(Color.CYAN);
                motorcyclesButton.setBackground(iniColor);
                baselineButton.setVisible(true);
                sportlineButton.setVisible(true);
                racinglineButton.setVisible(true);
                checkBox1.setVisible(true);
                checkBox3.setSelected(true);
            }
        });

        motorcyclesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedCategoryButton = motorcyclesButton;
                carsButton.setBackground(iniColor);
                motorcyclesButton.setBackground(Color.CYAN);
                baselineButton.setVisible(false);
                sportlineButton.setVisible(false);
                racinglineButton.setVisible(false);
                checkBox1.setVisible(false);
                checkBox3.setSelected(true);
            }
        });

        baselineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedLineButton = baselineButton;
                baselineButton.setBackground(Color.CYAN);
                sportlineButton.setBackground(iniColor);
                racinglineButton.setBackground(iniColor);
                checkBox1.setSelected(true);
            }
        });

        sportlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedLineButton = sportlineButton;
                checkBox1.setSelected(true);
                baselineButton.setBackground(iniColor);
                sportlineButton.setBackground(Color.CYAN);
                racinglineButton.setBackground(iniColor);
            }
        });

        racinglineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedLineButton = racinglineButton;
                checkBox1.setSelected(true);
                baselineButton.setBackground(iniColor);
                sportlineButton.setBackground(iniColor);
                racinglineButton.setBackground(Color.CYAN);
            }
        });

        singlePaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPaymentButton = singlePaymentButton;
                checkBox2.setSelected(true);
                instalmentsButton.setBackground(iniColor);
                singlePaymentButton.setBackground(Color.CYAN);
            }
        });

        instalmentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPaymentButton = instalmentsButton;
                checkBox2.setSelected(true);
                instalmentsButton.setBackground(Color.CYAN);
                singlePaymentButton.setBackground(iniColor);
            }
        });

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                switch (selectedCategoryButton.getText()) {
                    case "Cars":
                        switch (selectedLineButton.getText()) {
                            case "Baseline":
                                car.powerPolitics = new Baseline(car.getBasePrice());
                                switch (selectedPaymentButton.getText()) {
                                    case "Single Payment":
                                        car.paymentPolitics = new SinglePayment(car.getBasePrice(), car.powerPolitics.getLinePrice());
                                        break;
                                    case "Instalments":
                                        car.paymentPolitics = new Instalments(car.getBasePrice(), car.powerPolitics.getLinePrice());
                                        break;
                                }
                                break;
                            case "Sportline":
                                car.powerPolitics = new Sportline(car.getBasePrice());
                                switch (selectedPaymentButton.getText()) {
                                    case "Single Payment":
                                        car.paymentPolitics = new SinglePayment(car.getBasePrice(), car.powerPolitics.getLinePrice());
                                        break;
                                    case "Instalments":
                                        car.paymentPolitics = new Instalments(car.getBasePrice(), car.powerPolitics.getLinePrice());
                                        break;
                                }
                                break;
                            case "Racingline":
                                car.powerPolitics = new Racingline(car.getBasePrice());
                                switch (selectedPaymentButton.getText()) {
                                    case "Single Payment":
                                        car.paymentPolitics = new SinglePayment(car.getBasePrice(), car.powerPolitics.getLinePrice());
                                        break;
                                    case "Instalments":
                                        car.paymentPolitics = new Instalments(car.getBasePrice(), car.powerPolitics.getLinePrice());
                                        break;
                                }
                                break;
                        }
                        break;
                    case "Motorcycles":
                        switch (selectedPaymentButton.getText()) {
                            case "Single Payment":
                                moto.paymentPolitics = new SinglePayment(moto.getBasePrice(), 0);
                                break;
                            case "Instalments":
                                moto.paymentPolitics = new Instalments(moto.getBasePrice(), 0);
                                break;
                        }
                }
                switch (selectedCategoryButton.getText()) {
                    case "Cars":
                        fillFormCars();
                        break;
                    case "Motorcycles":
                        fillFormMotorcycles();
                        break;
                }
            }
        });


        }
    private void fillFormCars() {
        textPane3.setText("Peugeot " + car.getModel());
        textPane1.setText(car.getBrochure());
        textPane5.setText("Power specifications: " + car.powerPolitics.getPower() + " kW; " + car.powerPolitics.getTorque() + " Nm.");
        textPane2.setText("Total price: " + car.paymentPolitics.getTotalPrice());
        textPane4.setText("Total price breakdown: " + car.paymentPolitics.getPriceBreakdown());
    }
    private void fillFormMotorcycles() {
        textPane3.setText("Peugeot " + moto.getModel());
        textPane1.setText(moto.getBrochure());
        textPane2.setText("Total price: " + moto.paymentPolitics.getTotalPrice());
        textPane4.setText("Total price breakdown: " + moto.paymentPolitics.getPriceBreakdown());
    }
}
