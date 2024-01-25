package factory.simple;

public class Main {
    public static void main(String[] args){
        // [example] simple pizza factory 
        // SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();        
        // Pizza cheesePizza = simplePizzaFactory.createPizza("cheese");
        // Pizza pepperoniPizza = simplePizzaFactory.createPizza("pepperoni");
        // Pizza veggiePizza = simplePizzaFactory.createPizza("veggie");        

        // [example] simple pizza factory use case
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
        Pizza veggiePizza = pizzaStore.orderPizza("veggie");
    }
}
