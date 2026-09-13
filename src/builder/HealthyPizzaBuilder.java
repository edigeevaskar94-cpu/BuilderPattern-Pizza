package builder;

public class HealthyPizzaBuilder extends BasePizzaBuilder {

    @Override
    public Pizza build() {
        return createPizza();
    }
}