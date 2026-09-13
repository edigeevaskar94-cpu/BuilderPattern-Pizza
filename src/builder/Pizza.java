package builder;

import java.util.List;

public class Pizza {

    private final String size;
    private final String crust;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

    public Pizza(
            String size,
            String crust,
            String sauce,
            String cheese,
            List<String> toppings) {

        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "\n  Size: " + size +
                "\n  Crust: " + crust +
                "\n  Sauce: " + sauce +
                "\n  Cheese: " + cheese +
                "\n  Toppings: " + toppings +
                "\n}";
    }
}