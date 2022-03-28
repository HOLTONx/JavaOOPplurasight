package pl.plurasight.oopjava;

public class Main {

    public static void main(String[] args) {
        //Fundamentals of Object Oriented Programming in Java

        ShoppingCart karta1 = new ShoppingCart();
        Product jablko = Catalogue.getProduct("Jabłko");
        karta1.addProduct(jablko);
        System.out.println(karta1);
    }
}
