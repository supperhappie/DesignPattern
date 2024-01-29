package animalFactoryMethod;

public class Main {
    public static void main(String[] args){       
        FactoryTurkey factoryTurkey = new FactoryTurkey();
        FactoryDuck factoryDuck = new FactoryDuck();
        Animal duck = factoryDuck.createAnimal();
        Animal turkey = factoryTurkey.createAnimal(); 

        duck.species();
        duck.speak();
        duck.attack();
        System.out.println("=============");
        turkey.species();
        turkey.speak();
        turkey.attack();
    }
}
