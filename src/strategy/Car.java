package strategy;

/**
 * Created by kazim on 2016-10-06.
 */
public class Car {
    private String model;
    private int basePrice;
    public PowerPolitics powerPolitics;
    public PaymentPolitics paymentPolitics;


    public Car(String model, int basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }
    public int getBasePrice() { return basePrice; }

    public String getBrochure() {
        return powerPolitics.getPowerBrochure() + "\n" + paymentPolitics.getPriceBrochure();
    }



}
