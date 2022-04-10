package pl.plurasight.oopjava;

import java.util.Optional;

public class Customer {
    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long cardNumber){
        this.name = name;
        this.creditCard = new CreditCard(cardNumber);
    }

    public CreditCard getCreditCard(){
        return creditCard;
    }

    public int calculateDiscount(){
        return 0;
    }

    public Optional<Order> checkout(ShoppingCart cart){
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());
        return payment.isPresent() ? Optional.of(new Order(this, cart, payment.get()))
                : Optional.empty();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
