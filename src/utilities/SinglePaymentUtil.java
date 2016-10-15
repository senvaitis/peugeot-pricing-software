package utilities;

/**
 * Created by kazim on 2016-10-15.
 */
public class SinglePaymentUtil {
    private int linePrice;
    private int basePrice;

    public SinglePaymentUtil() {
//        this.linePrice = linePrice;
//        this.basePrice = basePrice;
    }

    public String getPriceBrochure() {
        return "Pay once. Drive.";
    }

    public String getPriceBreakdown(int basePrice, int linePrice) {
        return "Base price: " + basePrice + "; Line price: " + linePrice + ".";
    }

    public int getTotalPrice() {
        return this.basePrice + this.linePrice;
    }
}
