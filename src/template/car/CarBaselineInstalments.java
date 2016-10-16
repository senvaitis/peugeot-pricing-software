package template.car;

import utilities.BaselineUtil;
import utilities.InstalmentsUtil;
import utilities.LinePriceUtil;

/**
 * Created by kazim on 2016-10-11.
 */
public class CarBaselineInstalments extends Car {
    private int basePrice;
    private int instalmentsTax = 10; // measured in %
    private int power = 115; // measured in kW
    private int torque = 240; // measured in Nm
    private int linePrice;
    private BaselineUtil baselineUtil;
    private InstalmentsUtil instalmentsUtil;

    public CarBaselineInstalments(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = LinePriceUtil.getLinePrice(basePrice, "Baseline");

        baselineUtil = new BaselineUtil(power, torque);
        instalmentsUtil = new InstalmentsUtil(basePrice, instalmentsTax);
    }

    @Override
    protected String getPowerBrochure() {
        return baselineUtil.getPowerBrochure();
    }

    @Override
    protected String getPriceBrochure() {
        return instalmentsUtil.getPriceBrochure();
    }

    @Override
    protected String getPriceBreakdown() {
        return instalmentsUtil.getPriceBreakdown();
    }

    @Override
    protected int getPower() {
        return baselineUtil.getPower();
    }

    @Override
    protected int getTorque() {
        return baselineUtil.getTorque();
    }

    @Override
    protected int getTotalPrice() {
        return instalmentsUtil.getTotalPrice();
    }
}
