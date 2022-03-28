package pl.plurasight.oopjava;

import java.util.Map;

public class Catalogue {

    private static Map<String, Product> productMap = Map.of(
            "Jabłko", new Product("Jabłko", 3),
            "Gruszka", new Product("Gruszka", 4)
    );

    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
