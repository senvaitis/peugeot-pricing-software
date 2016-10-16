package client;

import strategy.*;
import template.car.*;
import template.moto.*;

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
    private JTextPane textPane2;
    private JTextPane textPane3;
    private JButton carsButton;
    private JButton motorcyclesButton;
    private JCheckBox checkBox3;
    private JTextPane textPane4;
    private JTextPane textPane5;
    private JButton strategyButton;
    private JButton templateButton;
    private JButton searchButton;

    private strategy.Car carS = new strategy.Car("RCZ", 20000);
    private strategy.Motorcycle motoS = new strategy.Motorcycle("Speedfight", 2900);
    private template.car.Car carT;
    private template.moto.Motorcycle motoT;

    private static JButton selectedCategoryButton;
    private static JButton selectedLineButton;
    private static JButton selectedPaymentButton;
    private static JButton selectedPatternButton;

    public PeugeotPricingForm() {
        super("Peugeot Pricing Software");
        setContentPane(rootPanel);

        helloTextPane.setText("Welcome to Peugeot online (Alpha version)");
        Color iniColor = baselineButton.getBackground();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        strategyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helloTextPane.setText("Welcome to Peugeot online (Alpha version. Strategy pattern)");
                selectedPatternButton = strategyButton;
                templateButton.setBackground(iniColor);
                strategyButton.setBackground(Color.CYAN);
            }
        });

        templateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helloTextPane.setText("Welcome to Peugeot online (Alpha version. Template pattern)");
                selectedPatternButton = templateButton;
                strategyButton.setBackground(iniColor);
                templateButton.setBackground(Color.CYAN);
            }
        });

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
                                switch (selectedPaymentButton.getText()) {
                                    case "Single Payment":
                                        switch (selectedPatternButton.getText()) {
                                            case "Strategy":
                                                carS.setPowerPolitics(new Baseline());
                                                carS.setPaymentPolitics(new SinglePayment(carS.getBasePrice(), "Baseline"));
                                                break;
                                            case "Template":
                                                carT = new CarBaselineSinglePayment("RCZ", 20000);
                                                break;
                                        }
                                        break;
                                    case "Instalments":
                                        switch (selectedPatternButton.getText()) {
                                            case "Strategy":
                                                carS.setPowerPolitics(new Baseline());
                                                carS.setPaymentPolitics(new Instalments(carS.getBasePrice(), "Baseline"));
                                                break;
                                            case "Template":
                                                carT = new CarBaselineInstalments("RCZ", 20000);
                                                break;
                                        }
                                        break;
                                }
                                break;
                            case "Sportline":
                                switch (selectedPaymentButton.getText()) {
                                    case "Single Payment":
                                    switch (selectedPatternButton.getText()) {
                                        case "Strategy":
                                            carS.setPowerPolitics(new Sportline());
                                            carS.setPaymentPolitics(new SinglePayment(carS.getBasePrice(), "Sportline"));
                                            break;
                                        case "Template":
                                            carT = new CarSportlineSinglePayment("RCZ", 20000);
                                            break;
                                    }
                                    break;
                                    case "Instalments":
                                        switch (selectedPatternButton.getText()) {
                                            case "Strategy":
                                                carS.setPowerPolitics(new Sportline());
                                                carS.setPaymentPolitics(new Instalments(carS.getBasePrice(), "Sportline"));
                                                break;
                                            case "Template":
                                                carT = new CarSportlineInstalments("RCZ", 20000);
                                                break;
                                        }
                                        break;
                                }
                                break;
                            case "Racingline":
                                switch (selectedPaymentButton.getText()) {
                                    case "Single Payment":
                                        switch (selectedPatternButton.getText()) {
                                            case "Strategy":
                                                carS.setPowerPolitics(new Racingline());
                                                carS.setPaymentPolitics(new SinglePayment(carS.getBasePrice(), "Racingline"));
                                                break;
                                            case "Template":
                                                carT = new CarRacinglineSinglePayment("RCZ", 20000);
                                                break;
                                        }
                                        break;
                                    case "Instalments":
                                        switch (selectedPatternButton.getText()) {
                                            case "Strategy":
                                                carS.setPowerPolitics(new Racingline());
                                                carS.setPaymentPolitics(new Instalments(carS.getBasePrice(), "Racingline"));
                                                break;
                                            case "Template":
                                                carT = new CarRacinglineInstalments("RCZ", 20000);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                    case "Motorcycles":
                        switch (selectedPaymentButton.getText()) {
                            case "Single Payment":
                                switch (selectedPatternButton.getText()) {
                                    case "Strategy":
                                        motoS.setPaymentPolitics(new SinglePayment(motoS.getBasePrice()));
                                        break;
                                    case "Template":
                                        motoT = new MotorcycleSinglePayment("Speedfight", 2900);
                                        break;
                                }
                                break;
                            case "Instalments":
                                switch (selectedPatternButton.getText()) {
                                    case "Strategy":
                                        motoS.setPaymentPolitics(new Instalments(motoS.getBasePrice()));
                                        break;
                                    case "Template":
                                        motoT = new MotorcycleInstalments("Speedfight", 2900);
                                        break;
                                }
                                break;
                        }
                }
                switch (selectedCategoryButton.getText()) {
                    case "Cars":
                        switch (selectedPatternButton.getText()) {
                            case "Strategy":
                                fillFormCarsStrategy(carS);
                                break;
                            case "Template":
                                fillFormCarsTemplate(carT);
                                break;
                        }
                        break;
                    case "Motorcycles":
                        switch (selectedPatternButton.getText()) {
                            case "Strategy":
                                fillFormMotorcyclesStrategy(motoS);
                                break;
                            case "Template":
                                fillFormMotorcyclesTemplate(motoT);
                                break;
                        }
                        break;
                }
            }
        });


        }

    private void fillFormCarsStrategy(strategy.Car carS) {
        textPane3.setText("Peugeot " + carS.getModel());
        textPane1.setText(carS.getBrochure());
        textPane5.setText(carS.getSpecifications());
        textPane2.setText(carS.getPricing());
    }
    private void fillFormMotorcyclesStrategy(strategy.Motorcycle motoS) {
        textPane3.setText("Peugeot " + motoS.getModel());
        textPane1.setText(motoS.getBrochure());
        textPane2.setText(motoS.getPricing());
    }

    private void fillFormCarsTemplate(template.car.Car carT) {
        textPane3.setText("Peugeot " + carT.getModel());
        textPane1.setText(carT.getBrochure());
        textPane5.setText(carT.getSpecifications());
        textPane2.setText(carT.getPricing());
    }
    private void fillFormMotorcyclesTemplate(template.moto.Motorcycle motoT) {
        textPane3.setText("Peugeot " + motoT.getModel());
        textPane1.setText(motoT.getBrochure());
        textPane2.setText(motoT.getPricing());
    }
}
