package strategy;

/**
 * Created by kazim on 2016-10-12.
 */
public class Motorcycle {
    private String model;
    private int basePrice;
    private PaymentPolitics paymentPolitics;

    public Motorcycle(String model, int basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public void setPaymentPolitics(PaymentPolitics paymentPolitics) {
        this.paymentPolitics = paymentPolitics;
    }

    public String getModel() {
        return model;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getPricing() {

        return String.format("Total price: %1$d. \nBreakdown: %2$s", paymentPolitics.getTotalPrice(), paymentPolitics.getPriceBreakdown());
    }

    public String getBrochure() {
        return paymentPolitics.getPriceBrochure();
    }
}
