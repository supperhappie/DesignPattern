package animalFactoryMethod;

public class SpeakDuck implements Speak{

    @Override
    public void action() {
        System.out.println("quack...");
    }
}
