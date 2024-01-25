package factory.abstractFactory;

public class Main {
    public static void main(String[] args){
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory());
        PizzaStore italyPizzaStore = new PizzaStore(new ItalyPizzaFactory());
        nyPizzaStore.orderPizza("cheese");
        italyPizzaStore.orderPizza("cheese");
    }
}
