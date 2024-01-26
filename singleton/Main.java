package singleton;

public class Main {
    public static void main(String[] args){
        System.out.println("first");
        Singleton.getinstance().printHello();
        System.out.println("second");
        Singleton.getinstance().printHello(); 
        System.out.println("third");
        Singleton.getinstance().printHello(); 
    }
}
