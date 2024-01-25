package mysample.decorator;

public class ExtraEspresso extends BeverageExtra{
    public ExtraEspresso(Beverage beverage){
        value = 1500;
        name = "Espresso";
        this.beverage = beverage;
    }    
}
