public class Pizza {
    protected String[] toppings;
    protected double price;

    public Pizza() {
        toppings = new String[10];
        price = 14.0; // Base price
    }

    public Pizza(String[] toppings, int numToppings) {
        this();
        System.arraycopy(toppings, 0, this.toppings, 0, numToppings);
        for (int i = 0; i < numToppings; i++) {
            if (toppings[i] != null) {
                price += 2; // Adding $2 for each topping
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder("Pizza with toppings: ");
        for (String topping : toppings) {
            if (topping != null) {
                description.append(topping).append(", ");
            }
        }
        description.append("Price: $").append(price);
        return description.toString();
    }
}
