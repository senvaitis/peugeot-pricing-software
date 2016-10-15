package strategy;

/**
 * Created by kazim on 2016-10-12.
 */
public class Instalments implements PaymentPolitics {
    private int instalmentsTax = 10; // measured in %
    private int basePrice;
    private int linePrice;

    public Instalments(int basePrice, int linePrice) {
        this.basePrice = basePrice;
        this.linePrice = linePrice;
    }

    @Override
    public int getTotalPrice() {
        return (int) (this.basePrice * ((instalmentsTax/100.0) + 1) + this.linePrice);
    }

    @Override
    public String getPriceBrochure() {
        return "You may pick the best instalments plan for you. Paying by instalments is just 10%.";
    }

    @Override
    public String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Line price: " + this.linePrice + "; Instalments tax: " + instalmentsTax + "%.";
    }
}
