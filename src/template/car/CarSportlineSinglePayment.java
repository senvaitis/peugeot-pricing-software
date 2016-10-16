package template.car;

import strategy.SinglePayment;
import utilities.LinePriceUtil;
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
        this.linePrice = LinePriceUtil.getLinePrice(basePrice, "Sportline");

        sportlineUtil = new SportlineUtil(power, torque);
        singlePaymentUtil = new SinglePaymentUtil(this.basePrice, this.linePrice);
    }

    @Override
    protected String getPowerBrochure() {
        return sportlineUtil.getPowerBrochure();
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
        return sportlineUtil.getPower();
    }

    @Override
    protected int getTorque() {
        return sportlineUtil.getTorque();
    }

    @Override
    protected int getTotalPrice() {
        return singlePaymentUtil.getTotalPrice();
    }
}
