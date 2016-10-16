package strategy;

import utilities.LinePriceUtil;
import utilities.SinglePaymentUtil;

/**
 * Created by kazim on 2016-10-12.
 */
public class SinglePayment implements PaymentPolitics {
    private int basePrice;
    private int linePrice = 0;
    private SinglePaymentUtil singlePaymentUtil;

    public SinglePayment(int basePrice) {
        this.basePrice = basePrice;
        singlePaymentUtil = new SinglePaymentUtil(basePrice);

    }

    public SinglePayment(int basePrice, String line) {
        this.basePrice = basePrice;
        linePrice = LinePriceUtil.getLinePrice(basePrice, line);
        singlePaymentUtil = new SinglePaymentUtil(basePrice, linePrice);
    }


    @Override
    public int getTotalPrice() {
        return singlePaymentUtil.getTotalPrice();
    }

    @Override
    public String getPriceBrochure() {
        return singlePaymentUtil.getPriceBrochure();
    }

    @Override
    public String getPriceBreakdown() {
        return singlePaymentUtil.getPriceBreakdown();
    }
}
