package template.car;

import utilities.BaselineUtil;
import utilities.LinePriceUtil;
import utilities.SinglePaymentUtil;

/**
 * Created by kazim on 2016-10-06.
 */
public class CarBaselineSinglePayment extends Car {
    private int basePrice;
    private int power = 115; // measured in kW
    private int torque = 240; // measured in Nm
    private int linePrice;
    private BaselineUtil baselineUtil;
    private SinglePaymentUtil singlePaymentUtil;

    public CarBaselineSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = LinePriceUtil.getLinePrice(basePrice, "Baseline");

        baselineUtil = new BaselineUtil(power, torque);
        singlePaymentUtil = new SinglePaymentUtil(basePrice);
    }

    @Override
    protected String getPowerBrochure() {
        return baselineUtil.getPowerBrochure();
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
        return baselineUtil.getPower();
    }

    @Override
    protected int getTorque() {
        return baselineUtil.getTorque();
    }

    @Override
    protected int getTotalPrice() {
        return singlePaymentUtil.getTotalPrice();
    }
}
