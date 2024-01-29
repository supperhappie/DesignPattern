package duck;

public class DuckGenerator implements Duck{
    Quack quack;
    Fly fly;    

    public DuckGenerator(Fly fly, Quack quack){
        this.fly = fly;
        this.quack =  quack;
    }
    
    @Override
    public void quack() {
        this.quack.quack();
    }

    @Override
    public void fly() {
        this.fly.fly();
    }
}
