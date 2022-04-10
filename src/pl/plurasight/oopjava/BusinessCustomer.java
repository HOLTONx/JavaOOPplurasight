package pl.plurasight.oopjava;

public class BusinessCustomer extends Customer{
    public enum BusinessSize{SMALL, MEDIUM, LARGE}

    private BusinessSize size;

    public BusinessCustomer(String name, long cardNumber, BusinessSize size) {
        super(name, cardNumber);
        this.size = size;
    }

    @Override
    public int calculateDiscount() {
        switch(size){
            case SMALL:
                return 5;
            case MEDIUM:
                return 10;
            case LARGE:
                return 20;
            default:
                throw new AssertionError("Unknown size type" + this);
        }
    }

    @Override
    public String toString() {
        return "BusinessCustomer{" +
                "size=" + size +
                '}';
    }

    public void testMethod(){
        System.out.println("TestMethod");
    }
}
