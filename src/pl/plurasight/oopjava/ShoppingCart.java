package pl.plurasight.oopjava;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public int getTotalCost(){
        int totalPrice = 0;
        for(Product product: products){
            totalPrice += product.getPrice();
        }
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
