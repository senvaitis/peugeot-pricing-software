package template.car;

import utilities.InstalmentsUtil;
import utilities.LinePriceUtil;
import utilities.RacinglineUtil;

/**
 * Created by kazim on 2016-10-11.
 */
public class CarRacinglineInstalments extends Car {
    private int basePrice;
    private int instalmentsTax = 10; // measured in %
    private int power = 199; // measured in kW
    private int torque = 330; // measured in Nm
    private int linePrice;
    private RacinglineUtil racinglineUtil;
    private InstalmentsUtil instalmentsUtil;

    public CarRacinglineInstalments(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = LinePriceUtil.getLinePrice(basePrice, "Racingline");

        racinglineUtil = new RacinglineUtil(power, torque);
        instalmentsUtil = new InstalmentsUtil(this.basePrice, this.linePrice, instalmentsTax);
    }

    @Override
    protected String getPowerBrochure() {
        return racinglineUtil.getPowerBrochure();
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
        return racinglineUtil.getPower();
    }

    @Override
    protected int getTorque() {
        return racinglineUtil.getTorque();
    }

    @Override
    protected int getTotalPrice() {
        return instalmentsUtil.getTotalPrice();
    }
}
