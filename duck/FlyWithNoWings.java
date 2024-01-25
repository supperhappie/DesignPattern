package mysample.duck;

public class FlyWithNoWings implements Fly{
    private static FlyWithNoWings instance = new FlyWithNoWings();

    private FlyWithNoWings(){}

    public static FlyWithNoWings getInstance(){
        return instance;
    }
    
    public void fly(){
        System.out.println("no fly");
    }
}
