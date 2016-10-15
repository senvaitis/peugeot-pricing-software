package template.moto;

/**
 * Created by kazim on 2016-10-12.
 */
public class MotorcycleSinglePayment extends Motorcycle {
    private int basePrice;

    public MotorcycleSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
    }

    protected String getPriceBrochure() {
        return "Pay once. Drive.";
    }

    @Override
    protected String getPriceBreakdown() {
        return "Base price: " + this.basePrice + ".";
    }

    @Override
    protected int getTotalPrice() {
        return super.getBasePrice();
    }
}