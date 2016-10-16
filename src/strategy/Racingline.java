package strategy;

import utilities.RacinglineUtil;

/**
 * Created by kazim on 2016-10-06.
 */
public class Racingline implements PowerPolitics {
    private int power = 199; // measured in kW
    private int torque = 330; // measured in Nm
    private RacinglineUtil racinglineUtil;

    public Racingline() {
        racinglineUtil = new RacinglineUtil(power, torque);
    }

    @Override
    public int getPower() {
        return racinglineUtil.getPower();
    }

    @Override
    public int getTorque() {
        return racinglineUtil.getTorque();
    }

    @Override
    public String getPowerBrochure() {
        return racinglineUtil.getPowerBrochure();
    }
}
