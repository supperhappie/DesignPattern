package factory.method;

public class FactoryMethodVeggie extends FactoryMethod {
    @Override
    protected Pizza createPizza() {
        return new VeggiePizza();
    }
}
