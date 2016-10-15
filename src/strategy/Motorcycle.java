package strategy;

/**
 * Created by kazim on 2016-10-12.
 */
public class Motorcycle {
    private String model;
    private int basePrice;

    public PaymentPolitics paymentPolitics;

    public Motorcycle(String model, int basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }
    public int getBasePrice() { return basePrice; }


    public String getBrochure() {
        return "\n" + paymentPolitics.getPriceBrochure();
    }
}
