package template.car;

/**
 * Created by kazim on 2016-10-11.
 */
public class CarBaselineInstalments extends Car {
    private int basePrice;
    private int instalmentsTax = 10; // measured in %
    private int power = 115; // measured in kW
    private int torque = 240; // measured in Nm
    private int linePrice;

    public CarBaselineInstalments(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = 0;
    }

    @Override
    protected String getPowerBrochure() {
        return "This sweet 1.6 petrol engine gives everything a daily car user could want!";
    }

    @Override
    protected String getPriceBrochure() {
        return "You may pick the best instalments plan for you. Paying by instalments is just 10%.";
    }

    @Override
    protected String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Line price: " + linePrice + "; Instalments tax: " + instalmentsTax + "%.";
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
        return (int) ((this.basePrice + this.linePrice) * ((instalmentsTax/100.0) + 1));
    }
}
