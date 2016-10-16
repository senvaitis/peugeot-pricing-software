package template.moto;

/**
 * Created by kazim on 2016-10-12.
 */
public abstract class Motorcycle {
    private String model;
    private int basePrice;

    public Motorcycle(String model, int basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }
    public int getBasePrice() { return basePrice; }



    public String getBrochure() {
        return "\n" + this.getPriceBrochure();
    }



    protected abstract int getTotalPrice();
    protected abstract String getPriceBrochure();
    protected abstract String getPriceBreakdown();
}
