package utilities;

/**
 * Created by kazim on 2016-10-15.
 */
public class InstalmentsUtil {
    private int linePrice;
    private int basePrice;
    private int instalmentsTax;

    public InstalmentsUtil(int linePrice, int basePrice, int instalmentsTax) {
        this.linePrice = linePrice;
        this.basePrice = basePrice;
        this.instalmentsTax = instalmentsTax;
    }

    public String getPriceBrochure() {
        return "You may pick the best instalments plan for you. Paying by instalments is just 10%.";
    }

    public String getPriceBreakdown(int basePrice, int linePrice, int instalmentsTax) {
        return "Base price: " + basePrice + "; Line price: " + linePrice + "; Instalments tax: " + instalmentsTax + "%.";
    }

    public int getTotalPrice() {
        return (int) ((this.basePrice + this.linePrice) * ((instalmentsTax/100.0) + 1));
    }
}
