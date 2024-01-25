package mysample.animalFactoryMethod;

public class Duck implements Animal{
    private Speak speak;
    private Attack attack;

    @Override
    public void species() {
        System.out.println("Duck");
    }

    @Override
    public void speak() {
        speak.action();
    }

    @Override
    public void attack() {
        attack.action();
    }

    void setAttack(Attack attack){
        this.attack = attack;
    }

    void setSpeak(Speak speak){
        this.speak = speak;
    }

    
}
