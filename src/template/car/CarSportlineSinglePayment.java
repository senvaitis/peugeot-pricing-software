package template.car;

/**
 * Created by kazim on 2016-10-06.
 */
public class CarSportlineSinglePayment extends Car {

    private int basePrice;
    private int power = 147; // measured in kW
    private int torque = 275; // measured in Nm
    private int linePrice;

    public CarSportlineSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = basePrice / 4;
    }

    protected String getPowerBrochure() {
        return "This is the medium between baseline and racingline.";
    }

    protected String getPriceBrochure() {
        return "Pay once. Drive.";
    }

    @Override
    protected String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Line price: " + this.linePrice + ".";
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
        return this.linePrice;
    }

    @Override
    protected int getTotalPrice() {
        return this.basePrice + this.linePrice;
    }
}
