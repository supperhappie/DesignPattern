package singleton;

public enum SingletonEnum {
    // instance 
    INSTANCE("test1", 1231), INSTANCE2("test2", 5555);

    // members 
    private String name;
    private int ID;
    
    // methods
    private SingletonEnum(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    void printMembers(){
        System.out.println(name);
        System.out.println(ID);
    }   
}