package mysample.observer;

import java.util.Vector;

public class Boss {
    private Manager manager;

    private final int MAX_MINUS_POINT = -20;
    private final int PROMOTE_POINT = 50;

    private String printFormalEmployee(Employee e){
        return e.name() + "["+ e.idnum() +"]";
    }

    public void setManager(Manager m){
        manager = m;
    }

    public void getPromoteMembers(){
        int num = 0;
        Vector<Employee> list = manager.getPromoteMembers(PROMOTE_POINT);
        System.out.println("[Promote List]");
        for(Employee e : list){
            num++;
            System.out.println(num + ". " + printFormalEmployee(e));            
            promote(e);
        }
        if(num < 1)
            System.out.println("No one");
        System.out.println();
    }

    public void getFireMembers(){
        int num = 0;
        Vector<Employee> list = manager.getFireMembers(MAX_MINUS_POINT);
        System.out.println("[Fire List]");
        for(Employee e : list){
            num++;
            System.out.println(num + ". " + printFormalEmployee(e));            
            fire(e);
        }
        if(num < 1)
            System.out.println("No one");
        System.out.println();
    }
    
    public void getEPoint(Employee e){
        System.out.println(printFormalEmployee(e) + " : "+ manager.getPoint(e));
    }

    public void promote(Employee e){
        System.out.println("promote : " + printFormalEmployee(e) );
        manager.promoteEmployee(e);
    }
    public void fire(Employee e){
        System.out.println("fire : " + printFormalEmployee(e) );
        manager.fireEmployee(e);
    }
}
