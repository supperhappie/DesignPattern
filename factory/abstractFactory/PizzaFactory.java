package factory.abstractFactory;

// Abstract Factory: PizzaFactory interface
public interface PizzaFactory {
    Pizza createCheesePizza();
    Pizza createPepperoniPizza();
    Pizza createVeggiePizza();
}