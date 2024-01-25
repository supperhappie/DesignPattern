package factory.abstractFactory;

public class PizzaStore {
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;
        if ("cheese".equals(pizzaType)) {
            pizza = pizzaFactory.createCheesePizza();
        } else if ("pepperoni".equals(pizzaType)) {
            pizza = pizzaFactory.createPepperoniPizza();
        } else if ("veggie".equals(pizzaType)) {
            pizza = pizzaFactory.createVeggiePizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type");
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
