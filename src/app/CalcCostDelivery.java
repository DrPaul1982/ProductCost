package src.app;

public class CalcCostDelivery extends CalcCostBase {
    private final static double deliveryPrice = 7.00 ;

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product)
                + deliveryPrice;
    }
}

