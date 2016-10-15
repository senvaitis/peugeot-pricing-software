package utilities;

import strategy.Baseline;

/**
 * Created by kazim on 2016-10-15.
 */
public class BaselineUtil {
    private int power;
    private int torque;

    public BaselineUtil(int power, int torque) {
        this.power = power;
        this.torque = torque;
    }

    public String getPowerBrochure() {
        return "This sweet 1.6 petrol engine gives everything a daily car user could want!";
    }
    public int getPower() {
        return this.power;
    }

    public int getTorque() {
        return this.torque;
    }

    public int getLinePrice(int basePrice) {
        return 0;
    }

}
