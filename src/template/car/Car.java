package template.car;

/**
 * Created by kazim on 2016-10-05.
 */
public abstract class Car {
    private String model;
    private int basePrice;

    public Car() {}

    public Car(String model, int basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }
    public int getBasePrice() { return basePrice; }

    public String getBrochure() {

        return this.getPowerBrochure() + "\n" + this.getPriceBrochure();
    }

    protected abstract int getTotalPrice();
    protected abstract String getPriceBrochure();
    protected abstract String getPriceBreakdown();
    protected abstract int getPower();
    protected abstract int getTorque();
    protected abstract String getPowerBrochure();
    protected abstract int getLinePrice();



}
