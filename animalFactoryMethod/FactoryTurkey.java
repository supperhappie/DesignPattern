package mysample.animalFactoryMethod;

public class FactoryTurkey implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        Turkey animal = new Turkey();
        setAnimal(animal);
        return animal;
    }        

    // define action 
    private void setAnimal(Turkey animal){
        animal.setSpeak(new SpeakTurkey());
        animal.setAttack(new AttackTurkey());
    }
}
