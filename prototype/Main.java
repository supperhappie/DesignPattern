package prototype;

public class Main {
    public static void main(String[] args){
        ConcretePrototype prototype = new ConcretePrototype(0);
        System.out.println("Object ID1 : " + prototype.getId());

        ConcretePrototype prototype2 = prototype;
        System.out.println("Object ID2 : " + prototype2.getId());

        ConcretePrototype clonedPrototype = (ConcretePrototype)prototype.clone();
        System.out.println("Cloned Object : " + clonedPrototype.getId());

        prototype2.setId(2);
        System.out.println("Object ID1 : " + prototype.getId());
        System.out.println("Object ID2 : " + prototype2.getId());
        System.out.println("Cloned Object ID : " + clonedPrototype.getId());
    }
}
