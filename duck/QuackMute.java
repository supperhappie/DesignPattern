package mysample.duck;

public class QuackMute implements Quack{
    private static QuackMute instance = new QuackMute();

    private QuackMute(){}

    public static QuackMute getInstance(){
        return instance;
    }

    @Override
    public void quack() {
        System.out.println("...");
    }
}
