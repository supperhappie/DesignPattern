package mysample.decorator;

public class ExtraMilk extends BeverageExtra{
    public ExtraMilk(Beverage beverage){
        value = 2000;
        name = "Milk";
        this.beverage = beverage;
    }    
}
