package duck;

public class Main {
    private static void printDivideLine(String tag){
        System.out.printf("=============%s=============\n", tag);
    }
    public static void main(String[] args){       
        printDivideLine("start");

        Duck woodDuck = new DuckGenerator(FlyWithNoWings.getInstance(), QuackMute.getInstance());
        woodDuck.quack();
        woodDuck.fly();

        printDivideLine("");
        Duck mallarDuck = new DuckGenerator(FlyWithWings.getInstance(), QuackBasic.getInstance());
        mallarDuck.quack();
        mallarDuck.fly();

        printDivideLine("Supper Animal***");
        SuperAnimal superAnimal = new DuckAdapter(mallarDuck);
        superAnimal.fly();
        superAnimal.speak();
        superAnimal.attack();
        superAnimal.run();

        printDivideLine("end");
    }
}
