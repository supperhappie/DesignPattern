package mysample.animalFactoryMethod;

public class Turkey implements Animal{    
    Attack attack;
    Speak speak;

    @Override
    public void species() {
        System.out.println("Turkey");
    }

    @Override
    public void attack() {
        attack.action();
    }

    @Override
    public void speak() {
        speak.action();
    }

    void setAttack(Attack attack){
        this.attack = attack;
    }

    void setSpeak(Speak speak){
        this.speak = speak;
    }
        
}
