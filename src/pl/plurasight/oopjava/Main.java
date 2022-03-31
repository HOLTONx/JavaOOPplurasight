package pl.plurasight.oopjava;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //Fundamentals of Object Oriented Programming in Java

        ShoppingCart karta1 = new ShoppingCart();
        Product jablko = Catalogue.getProduct("Jabłko");
        Product gruszka = Catalogue.getProduct("Gruszka");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem(new LineItem(jablko, 1));
        cart.addLineItem(new LineItem(gruszka,2));

        System.out.println(cart.getTotalCost());

        Customer jDuda = new Customer("Jakub Duda", 43243242432234234L);
        Optional<Order> order = jDuda.checkout(cart);
        System.out.println(order);

        order.ifPresent(Main::fulfil);
        System.out.println(order);
    }

    public static void fulfil(Order o){
        ShoppingCart cart = o.getCard();
        boolean shippingUnfinished;
        do{
            shippingUnfinished = false;
            for(LineItem li : cart.getLineItems()){
                boolean fulfilHalf = Math.random() > 0.7;
                if(fulfilHalf){
                    li.setQuantity(li.getQuantity()/2);
                    shippingUnfinished = true;
                }else{
                    li.setQuantity(0);
                }
                System.out.println(fulfilHalf);
            }
        }while(shippingUnfinished);
    }
}
