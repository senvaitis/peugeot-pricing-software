package strategy;

import utilities.InstalmentsUtil;
import utilities.LinePriceUtil;

/**
 * Created by kazim on 2016-10-12.
 */
public class Instalments implements PaymentPolitics {
    private int instalmentsTax = 10; // measured in %
    private int basePrice;
    private int linePrice = 0;
    private InstalmentsUtil instalmentsUtil;



    public Instalments(int basePrice) {
        this.basePrice = basePrice;
        instalmentsUtil = new InstalmentsUtil(basePrice, instalmentsTax);
    }

    public Instalments(int basePrice, String line) {
        this.basePrice = basePrice;
        instalmentsUtil = new InstalmentsUtil(basePrice, LinePriceUtil.getLinePrice(basePrice, line), instalmentsTax);
    }

    @Override
    public int getTotalPrice() {
        return instalmentsUtil.getTotalPrice();
    }

    @Override
    public String getPriceBrochure() {
        return instalmentsUtil.getPriceBrochure();
    }

    @Override
    public String getPriceBreakdown() {
            return instalmentsUtil.getPriceBreakdown();
    }
}
