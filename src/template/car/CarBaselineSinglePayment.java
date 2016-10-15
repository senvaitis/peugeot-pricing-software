package template.car;

/**
 * Created by kazim on 2016-10-06.
 */
public class CarBaselineSinglePayment extends Car {
    private int basePrice;
    private int power = 115; // measured in kW
    private int torque = 240; // measured in Nm
    private int linePrice;

    public CarBaselineSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = 0;
    }

    protected String getPowerBrochure() {
        return "This sweet 1.6 petrol engine gives everything a daily car user could want!";
    }

    protected String getPriceBrochure() {
        return "Pay once. Drive.";
    }

    @Override
    protected String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Line price: " + this.getLinePrice() + ".";
    }

    @Override
    protected int getPower() {
        return this.power;
    }

    @Override
    protected int getTorque() {
        return this.torque;
    }

    @Override
    protected int getLinePrice() {
        return linePrice;
    }

    @Override
    protected int getTotalPrice() {
        return this.basePrice + this.linePrice;
    }
}
