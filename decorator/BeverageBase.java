package mysample.decorator;

public abstract class BeverageBase implements Beverage{
    int value;
    String name;
    
    @Override
    public int cost() {
        return value;
    }

    @Override
    public String describe() {
        return name;
    }
    
}
