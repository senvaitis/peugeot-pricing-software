package template.car;

/**
 * Created by kazim on 2016-10-05.
 */
public abstract class Car {
    private String model;
    private int basePrice;

    public Car(String model, int basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getSpecifications() {
        return String.format("Power(kW): %1$d \nTorque(Nm): %2$d", this.getPower(), this.getTorque());
    }

    public String getPricing() {

        return String.format("Total price: %1$d. \nBreakdown: %2$s", this.getTotalPrice(), this.getPriceBreakdown());
    }

    public String getBrochure() {
        return this.getPowerBrochure() + "\n" + this.getPriceBrochure();
    }

    protected abstract int getPower();
    protected abstract int getTorque();
    protected abstract String getPowerBrochure();
    protected abstract int getTotalPrice();
    protected abstract String getPriceBrochure();
    protected abstract String getPriceBreakdown();
}
