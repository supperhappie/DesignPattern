package factory.abstractFactory;

// Concrete Factories
public class NyPizzaFactory implements PizzaFactory {
    String style = "Ny style";

    @Override
    public Pizza createCheesePizza() {
        System.out.println(style);
        return new CheesePizza();
    }

    @Override
    public Pizza createPepperoniPizza() {
        System.out.println(style);
        return new PepperoniPizza();
    }

    @Override
    public Pizza createVeggiePizza() {
        System.out.println(style);
        return new VeggiePizza();
    }
}