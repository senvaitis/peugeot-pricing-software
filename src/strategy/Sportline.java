package strategy;

import utilities.SportlineUtil;

/**
 * Created by kazim on 2016-10-06.
 */
public class Sportline implements PowerPolitics {
    private int power = 147; // measured in kW
    private int torque = 275; // measured in Nm
    private SportlineUtil sportlineUtil;

    public Sportline() {
        sportlineUtil = new SportlineUtil(power, torque);
    }

    @Override
    public int getPower() {
        return sportlineUtil.getPower();
    }

    @Override
    public int getTorque() {
        return sportlineUtil.getTorque();
    }

    @Override
    public String getPowerBrochure() {
        return sportlineUtil.getPowerBrochure();
    }
}
