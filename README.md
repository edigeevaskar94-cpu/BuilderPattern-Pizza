# Builder Pattern - Pizza

## Description

This project demonstrates the Builder design pattern using a Pizza product.

The Builder pattern separates the construction of a complex object from its representation.

## Project Structure

- `Pizza` - Product
- `PizzaBuilder` - Builder interface
- `BasePizzaBuilder` - common builder logic
- `ItalianPizzaBuilder` - Concrete Builder for Italian pizza
- `HealthyPizzaBuilder` - Concrete Builder for healthy pizza
- `PizzaDirector` - Director that defines reusable construction sequences
- `Main` - Client demonstrating the builders

## Representations

The project provides two different pizza representations.

### Italian Pizza

- Large
- Thin crust
- Tomato sauce
- Mozzarella
- Pepperoni and olives

### Healthy Pizza

- Medium
- Whole wheat crust
- Tomato sauce
- Low-fat cheese
- Tomatoes, bell peppers and spinach

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is configured.
3. Open `Main.java`.
4. Run the `main()` method.

## Design Pattern

The project uses the Builder creational design pattern with:

- Product
- Builder
- Concrete Builders
- Director
- Client