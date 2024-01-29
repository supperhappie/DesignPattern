package singleton;

// DCL : Double-Checked-Locking
public class SingletonDCL {
    private static volatile SingletonDCL instance;
    private SingletonDCL(){
        System.out.println("create singleton-DCL");      
    }
    public static SingletonDCL getInstance(){
        if (instance == null) { // 1. first check 
            synchronized (SingletonDCL.class) { // 2. synchronized
                if (instance == null) { // 3. double check 
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
