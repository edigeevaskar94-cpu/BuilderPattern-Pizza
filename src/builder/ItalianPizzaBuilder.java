package builder;

public class ItalianPizzaBuilder extends BasePizzaBuilder {

    @Override
    public Pizza build() {
        return createPizza();
    }
}