package duck;

public class DuckAdapter extends SuperAnimal{    
    Duck duck;
    
    public DuckAdapter(Duck duck){
        this.duck = duck;        
        this.dex = 5; // basic dex for duck
        this.str = 5; // basic str for duck
    }

    @Override
    public void speak() {
        duck.quack();
        duck.quack();
        duck.quack();
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
        duck.fly();
        duck.fly();
        duck.fly();
    }
}
