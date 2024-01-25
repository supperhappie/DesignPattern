package mysample.animalAbstractFactory;

public class AnimalFactoryConcrete implements AnimalFactory{
    @Override
    public Animal createAnimal(String species) {
        if(Duck.type.equals(species))
        {
            Duck animal = new Duck();
            animal.setAction(new AttackDuck());
            animal.setAction(new SpeakDuck());
            return animal;
        }
        else if(Turkey.type.equals(species))
        {
            Turkey animal = new Turkey();
            animal.setAction(new AttackTurkey());
            animal.setAction(new SpeakTurkey());
            return animal;
        }
        return null;
    }
}
