package utilities;

/**
 * Created by kazim on 2016-10-15.
 */
public class RacinglineUtil {
    private int power;
    private int torque;

    public RacinglineUtil(int power, int torque) {
        this.power = power;
        this.torque = torque;
    }

    public String getPowerBrochure() {
        return "Racingline is made by Peugeot Racing engineers. " +
                "These are the same people who made a car for Dakar 2015. ";
    }
    public int getPower() {
        return this.power;
    }

    public int getTorque() {
        return this.torque;
    }

    public int getLinePrice(int basePrice) {
        return basePrice / 2;
    }
}
