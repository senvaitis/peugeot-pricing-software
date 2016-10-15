package strategy;

import utilities.InstalmentsUtil;

/**
 * Created by kazim on 2016-10-12.
 */
public class Instalments implements PaymentPolitics {
    private int instalmentsTax = 10; // measured in %
    private int basePrice;
    private int linePrice;
    private InstalmentsUtil instalmentsUtil;

    public Instalments() {
//        this.basePrice = basePrice;
//        this.linePrice = linePrice;
        instalmentsUtil = new InstalmentsUtil(linePrice, basePrice, instalmentsTax);
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
            return instalmentsUtil.getPriceBreakdown(basePrice, linePrice, instalmentsTax);
    }
}
