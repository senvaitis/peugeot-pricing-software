package strategy;

/**
 * Created by kazim on 2016-10-12.
 */
public class SinglePayment implements PaymentPolitics {
    private int basePrice;
    private int linePrice;

    public SinglePayment() {
//        this.basePrice = basePrice;
//        this.linePrice = linePrice;
    }
    @Override
    public int getTotalPrice() {
        return (int) (this.basePrice + this.linePrice * ((10/100) + 1));
    }


    @Override
    public String getPriceBrochure() {
        return "Pay once. Drive.";
    }

    @Override
    public String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Line price: " + this.linePrice + ".";
    }
}
