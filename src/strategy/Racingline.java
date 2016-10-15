package strategy;

/**
 * Created by kazim on 2016-10-06.
 */
public class Racingline implements PowerPolitics {
    private int basePrice;
    private int power = 199; // measured in kW
    private int torque = 330; // measured in Nm

    public Racingline() {

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
        return "Racingline is made by Peugeot Racing engineers. " +
                "These are the same people who made a car for Dakar 2015. ";
    }

    @Override
    public int getLinePrice(int basePrice) {
        this.basePrice = basePrice;
        return this.basePrice / 2;
    }
}
