package pl.plurasight.oopjava;

public enum  ProductType {
    PHYSICAL(Catalogue.SHIPPING_RATE), DIGITAL(0);

    private int shippingRate;

    ProductType(int shippingRate) {
        this.shippingRate = shippingRate;
    }

    public int getShippingCost(int weight) {
        return shippingRate * weight;
    }
}
