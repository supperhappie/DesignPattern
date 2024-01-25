package mysample.decorator;

public class Main {
    public static void main(String args[]){
        Beverage cup = new BaseEspresso();
        cup = new ExtraMilk(cup);
        cup = new ExtraChoco(cup);

        System.out.println(cup.describe());
        System.out.println(cup.cost());
    }
}
