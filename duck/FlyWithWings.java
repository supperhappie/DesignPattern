package mysample.duck;

public class FlyWithWings implements Fly{
    private static FlyWithWings instance = new FlyWithWings();

    private FlyWithWings(){}

    public static FlyWithWings getInstance(){
        return instance;
    }

    public void fly(){
        System.out.println("fly high");
    }
}
