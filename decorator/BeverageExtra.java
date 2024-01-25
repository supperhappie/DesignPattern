package mysample.decorator;

public abstract class BeverageExtra implements Beverage{
    Beverage beverage;

    int value;
    String name;    

    public int cost() {
        return beverage.cost() + value;
    }

    @Override
    public String describe() {
        return beverage.describe() + " + " + name;
    }
}
