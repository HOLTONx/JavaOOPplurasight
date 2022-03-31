package pl.plurasight.oopjava;

import java.util.UUID;

public class Payment {
    private CreditCard creditCard;
    private int value;
    private UUID randomUUID;

    public Payment(CreditCard creditCard, int value, UUID randomUUID) {
        this.creditCard = creditCard;
        this.value = value;
        this.randomUUID = randomUUID;
    }
}
