package strategy;

/**
 * Created by kazim on 2016-10-06.
 */
public interface PaymentPolitics {
    public int getTotalPrice();
    public String getPriceBrochure();
    public String getPriceBreakdown();
}
