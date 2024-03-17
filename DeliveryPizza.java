public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String address;

    public DeliveryPizza(String[] toppings, String address, int numToppings) {
        super(toppings, numToppings);
        this.address = address;
        // Setting delivery fee based on the price
        this.deliveryFee = (price > 18.0) ? 3.0 : 5.0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Delivery Address: " + address + " | Delivery Fee: $" + deliveryFee;
    }
}
