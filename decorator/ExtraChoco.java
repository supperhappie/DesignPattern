package mysample.decorator;

public class ExtraChoco extends BeverageExtra{
    public ExtraChoco(Beverage beverage){
        value = 500;
        name = "Choco";
        this.beverage = beverage;
    }
    
}
