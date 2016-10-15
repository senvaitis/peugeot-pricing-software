package template.moto;

/**
 * Created by kazim on 2016-10-12.
 */
public class MotorcycleInstalments extends Motorcycle {
    private int basePrice;
    private int instalmentsTax = 10; // measured in %

    public MotorcycleInstalments(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
    }

    protected String getPriceBrochure() {
        return "You may pick the best instalments plan for you. Paying by instalments is just 10%.";
    }

    @Override
    protected String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Instalments tax: " + instalmentsTax + "%.";
    }

    @Override
    protected int getTotalPrice() {
        return (int) ((this.getBasePrice()) * ((instalmentsTax/100.0) + 1));
    }
}
