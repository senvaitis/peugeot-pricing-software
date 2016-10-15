package utilities;

/**
 * Created by kazim on 2016-10-15.
 */
public class SportlineUtil {
    private int power;
    private int torque;

    public SportlineUtil(int power, int torque) {
        this.power = power;
        this.torque = torque;
    }

    public String getPowerBrochure() {
        return "This is the medium between baseline and racingline.";
    }

    public int getPower() {
        return this.power;
    }

    public int getTorque() {
        return this.torque;
    }

    public int getLinePrice(int basePrice) {
        return basePrice / 4;
    }
}
