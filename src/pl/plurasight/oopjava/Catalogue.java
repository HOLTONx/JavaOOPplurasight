package pl.plurasight.oopjava;

import java.util.Map;

public class Catalogue {
    public final static int SHIPPING_RATE = 5;

    private static Map<String, Product> productMap = Map.of(
            "Jabłko", new Product("Jabłko", 3, ProductType.PHYSICAL, 1),
            "Gruszka", new Product("Gruszka", 4,  ProductType.PHYSICAL, 2)
    );

    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
