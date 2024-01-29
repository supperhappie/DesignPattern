package test;

import java.util.concurrent.atomic.AtomicReference;

public class MyThread{
    private static final AtomicReference<Integer> count = new AtomicReference(0);
    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            new Thread(() -> {
                // synchronized(MyThread.class){
                    for(int j = 0; j < 1000; j++){                        
                        int c = count.getAndAccumulate(1, (prev, x) -> prev + x);
                        System.out.println(c);
                    }
                // }
            }).start();
        }
    }
}
