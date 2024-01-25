package factory.method;

public class Main {
    public static void main(String[] args){
        // [example] simple pizza factory 
        FactoryMethod factoryMethodCheese = new FactoryMethodCheese();
        FactoryMethod factoryMethodPepperoni = new FactoryMethodPepperoni();
        FactoryMethod factoryMethodVeggie = new FactoryMethodVeggie();

        Pizza Cheesepizza = factoryMethodCheese.createPizza();
        Pizza Pepperonipizza = factoryMethodPepperoni.createPizza();
        Pizza Veggiepizza = factoryMethodVeggie.createPizza();


        // [example] simple pizza factory use case
        // PizzaStore pizzaStore = new PizzaStore();
        // Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        // Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
        // Pizza veggiePizza = pizzaStore.orderPizza("veggie");
    }
}
