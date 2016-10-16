package template.car;

import utilities.InstalmentsUtil;
import utilities.LinePriceUtil;
import utilities.SportlineUtil;

/**
 * Created by kazim on 2016-10-11.
 */
public class CarSportlineInstalments extends Car {
    private int basePrice;
    private int instalmentsTax = 10; // measured in %
    private int power = 147; // measured in kW
    private int torque = 275; // measured in Nm
    private int linePrice;
    private SportlineUtil sportlineUtil;
    private InstalmentsUtil instalmentsUtil;

    public CarSportlineInstalments(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = LinePriceUtil.getLinePrice(basePrice, "Sportline");

        sportlineUtil = new SportlineUtil(power, torque);
        instalmentsUtil = new InstalmentsUtil(this.basePrice, this.linePrice, instalmentsTax);
    }

    @Override
    protected String getPowerBrochure() {
        return sportlineUtil.getPowerBrochure();
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
        return sportlineUtil.getPower();
    }

    @Override
    protected int getTorque() {
        return sportlineUtil.getTorque();
    }

    @Override
    protected int getTotalPrice() {
        return instalmentsUtil.getTotalPrice();
    }
}
