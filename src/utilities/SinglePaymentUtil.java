package utilities;

import strategy.SinglePayment;

/**
 * Created by kazim on 2016-10-15.
 */
public class SinglePaymentUtil {
    private int linePrice = 0;
    private int basePrice;

    public SinglePaymentUtil(int basePrice) {
        this.basePrice = basePrice;
    }

    public SinglePaymentUtil(int basePrice, int linePrice) {
        this.linePrice = linePrice;
        this.basePrice = basePrice;
    }



    public String getPriceBrochure() {
        return "Pay once. Drive.";
    }

    public String getPriceBreakdown() {
        return "Base price: " + basePrice + "; Line price: " + linePrice + ".";
    }

    public int getTotalPrice() {
        return this.basePrice + this.linePrice;
    }
}
