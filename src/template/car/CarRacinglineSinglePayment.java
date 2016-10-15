package template.car;

/**
 * Created by kazim on 2016-10-06.
 */
public class CarRacinglineSinglePayment extends Car {
    private int basePrice;
    private int power = 199; // measured in kW
    private int torque = 330; // measured in Nm
    private int linePrice;

    public CarRacinglineSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = basePrice / 2;
    }

    protected String getPowerBrochure() {
        return "Racingline is made by Peugeot Racing engineers. " +
                "These are the same people who made a car for Dakar 2015. ";
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
