package animalAbstractFactory;

public class Main {
    public static void main(String[] args){       
        AnimalFactoryConcrete factory = new AnimalFactoryConcrete();

        Animal duck = factory.createAnimal("duck");
        Animal turkey = factory.createAnimal("turkey");

        duck.action("attack");
        duck.action("speak");
        turkey.action("attack");
        turkey.action("speak");
    }
}
