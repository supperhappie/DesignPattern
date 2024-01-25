package factory.simple;

// Factory: PizzaStore class
public class PizzaStore {
    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = pizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
