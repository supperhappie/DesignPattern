package factory.simple;

// Simple Factory: SimplePizzaFactory class
public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new CheesePizza();
        } else if ("pepperoni".equals(pizzaType)) {
            return new PepperoniPizza();
        } else if ("veggie".equals(pizzaType)) {
            return new VeggiePizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type");
        }
    }
}
