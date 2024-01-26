package animalFactoryMethod;

public class FactoryDuck implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        Duck animal = new Duck();
        setAnimal(animal);
        return animal;
    }        

    // define action 
    private void setAnimal(Duck animal){
        animal.setSpeak(new SpeakDuck());
        animal.setAttack(new AttackDuck());
    }
}
