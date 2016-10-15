package strategy;

/**
 * Created by kazim on 2016-10-06.
 */
public class Baseline implements PowerPolitics {
    private int basePrice;
    private int power = 115; // measured in kW
    private int torque = 240; // measured in Nm

    public Baseline(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public int getTorque() {
        return this.torque;
    }

    @Override
    public String getPowerBrochure() {
        return "This sweet 1.6 petrol engine gives everything a daily car user could want!";
    }

    @Override
    public int getLinePrice() {
        return 0;
    }
}
