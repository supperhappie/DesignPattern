package factory.abstractFactory;

public class ItalyPizzaFactory implements PizzaFactory {
    String style = "Italy style";

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