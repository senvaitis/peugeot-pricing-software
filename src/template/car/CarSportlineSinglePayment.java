package template.car;

import strategy.SinglePayment;
import utilities.SinglePaymentUtil;
import utilities.SportlineUtil;

/**
 * Created by kazim on 2016-10-06.
 */
public class CarSportlineSinglePayment extends Car {

    private int basePrice;
    private int power = 147; // measured in kW
    private int torque = 275; // measured in Nm
    private int linePrice;
    private SportlineUtil sportlineUtil;
    private SinglePaymentUtil singlePaymentUtil;

    public CarSportlineSinglePayment(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = basePrice / 4;
        sportlineUtil = new SportlineUtil(power, torque);
        singlePaymentUtil = new SinglePaymentUtil();
    }

    protected String getPowerBrochure() {
        return sportlineUtil.getPowerBrochure();
    }

    protected String getPriceBrochure() {
        return singlePaymentUtil.getPriceBrochure();
    }

    @Override
    protected String getPriceBreakdown() {
        return singlePaymentUtil.getPriceBreakdown(basePrice, linePrice);
    }

    @Override
    protected int getPower() {
        return sportlineUtil.getPower();
    }

    @Override
    protected int getTorque() {
        return sportlineUtil.getTorque();
    }

    @Override
    protected int getLinePrice() {
        return sportlineUtil.getLinePrice(basePrice);
    }

    @Override
    protected int getTotalPrice() {
        return singlePaymentUtil.getTotalPrice();
    }
}
