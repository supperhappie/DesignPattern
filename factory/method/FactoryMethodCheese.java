package factory.method;

public class FactoryMethodCheese extends FactoryMethod {

    @Override
    protected Pizza createPizza() {
        return new CheesePizza();
    }
    
}
