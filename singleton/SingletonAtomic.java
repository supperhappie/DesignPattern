package singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonAtomic {
    private static AtomicReference<SingletonAtomic> instnace = new AtomicReference<>();
    private SingletonAtomic(){  
        System.out.println("create singleton");      
    }

    public static SingletonAtomic getinstance(){
        SingletonAtomic currentInstance = instnace.get();

        if(currentInstance == null){
            currentInstance = new SingletonAtomic();
            instnace.compareAndSet(null, currentInstance);
        }
        return currentInstance;
    }
}
