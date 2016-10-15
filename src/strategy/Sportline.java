package strategy;

/**
 * Created by kazim on 2016-10-06.
 */
public class Sportline implements PowerPolitics {
    private int basePrice;
    private int power = 147; // measured in kW
    private int torque = 275; // measured in Nm

    public Sportline(int basePrice) {
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
        return "This is the medium between baseline and racingline.";
    }

    @Override
    public int getLinePrice() {
        return this.basePrice / 4;
    }
}
