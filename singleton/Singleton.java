package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){  
        System.out.println("create singleton");      
    }

    public static Singleton getinstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    // sample method
    public void printHello(){
        System.out.println("hello, i'm singleton!");
    }
}
