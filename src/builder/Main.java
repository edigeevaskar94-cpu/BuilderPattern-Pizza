package builder;

public class Main {

    public static void main(String[] args) {

        PizzaDirector director = new PizzaDirector();

        Pizza italianPizza = director.makeItalianPizza(
                new ItalianPizzaBuilder()
        );

        Pizza healthyPizza = director.makeHealthyPizza(
                new HealthyPizzaBuilder()
        );

        System.out.println("Italian Pizza:");
        System.out.println(italianPizza);

        System.out.println();

        System.out.println("Healthy Pizza:");
        System.out.println(healthyPizza);
    }
}