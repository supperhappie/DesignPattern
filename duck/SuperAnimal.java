package duck;

abstract class SuperAnimal{    
    int str;
    int dex;

    abstract public void speak();    
    
    public void fly(){
        System.out.printf("jump : %d", str * 0.5);
    }
    public void run(){
        System.out.printf("run : %d\n", dex);
    }
    public void attack(){
        System.out.printf("damage : %d\n", str);
    }
}