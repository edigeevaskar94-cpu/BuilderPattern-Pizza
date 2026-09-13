package builder;

public class PizzaDirector {

    public Pizza makeItalianPizza(PizzaBuilder builder) {
        return builder
                .setSize("Large")
                .setCrust("Thin")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .addTopping("Pepperoni")
                .addTopping("Olives")
                .build();
    }

    public Pizza makeHealthyPizza(PizzaBuilder builder) {
        return builder
                .setSize("Medium")
                .setCrust("Whole Wheat")
                .setSauce("Tomato")
                .setCheese("Low Fat")
                .addTopping("Tomatoes")
                .addTopping("Bell Peppers")
                .addTopping("Spinach")
                .build();
    }
}