package factory.method;

public class FactoryMethodPepperoni extends FactoryMethod {
    @Override
    protected Pizza createPizza() {
        return new PepperoniPizza();
    }
    
}