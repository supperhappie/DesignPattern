package factory.method;

// Factory: PizzaStore class
public class PizzaStore {
    private FactoryMethod factoryMethodCheese;
    private FactoryMethod factoryMethodPepperoni;
    private FactoryMethod factoryMethodVeggie;

    public PizzaStore() {        
        factoryMethodCheese = new FactoryMethodCheese();
        factoryMethodPepperoni = new FactoryMethodPepperoni();
        factoryMethodVeggie = new FactoryMethodVeggie();
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;
        if ("cheese".equals(pizzaType)) {
            pizza = factoryMethodCheese.createPizza();
        } else if ("pepperoni".equals(pizzaType)) {
            pizza = factoryMethodPepperoni.createPizza();
        } else if ("veggie".equals(pizzaType)) {
            pizza = factoryMethodVeggie.createPizza();
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
