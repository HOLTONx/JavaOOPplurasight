package pl.plurasight.oopjava;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, long cardNumber){
        this.name = name;
        this.creditCard = new CreditCard(cardNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
