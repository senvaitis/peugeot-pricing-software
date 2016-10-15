package strategy;

import utilities.BaselineUtil;

/**
 * Created by kazim on 2016-10-06.
 */
public class Baseline implements PowerPolitics {
    private int power = 115; // measured in kW
    private int torque = 240; // measured in Nm
    private int linePrice;

    private BaselineUtil baselineUtil;

    public Baseline() {
        baselineUtil = new BaselineUtil(power, torque);
    }

    @Override
    public int getPower() {
        return baselineUtil.getPower();
    }

    @Override
    public int getTorque() {
        return baselineUtil.getTorque();
    }

    @Override
    public String getPowerBrochure() {
        return baselineUtil.getPowerBrochure();
    }

    @Override
    public int getLinePrice(int basePrice) {
        return baselineUtil.getLinePrice(basePrice);
    }
}
