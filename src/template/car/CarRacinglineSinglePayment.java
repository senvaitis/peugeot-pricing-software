package template.car;

import utilities.LinePriceUtil;
import utilities.RacinglineUtil;
import utilities.SinglePaymentUtil;

/**
 * Created by kazim on 2016-10-06.
 */
public class CarRacinglineSinglePayment extends Car {
    private int basePrice;
    private int power = 199; // measured in kW
    private int torque = 330; // measured in Nm
    private int linePrice;
    private RacinglineUtil racinglineUtil;
    private SinglePaymentUtil singlePaymentUtil;

    public CarRacinglineSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = LinePriceUtil.getLinePrice(basePrice, "Racingline");

        racinglineUtil = new RacinglineUtil(power, torque);
        singlePaymentUtil = new SinglePaymentUtil(this.basePrice, this.linePrice);
    }

    @Override
    protected String getPowerBrochure() {
        return racinglineUtil.getPowerBrochure();
    }

    @Override
    protected String getPriceBrochure() {
        return singlePaymentUtil.getPriceBrochure();
    }

    @Override
    protected String getPriceBreakdown() {
        return singlePaymentUtil.getPriceBreakdown();
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
        return singlePaymentUtil.getTotalPrice();
    }
}
