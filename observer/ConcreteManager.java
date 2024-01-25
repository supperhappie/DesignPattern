package mysample.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class ConcreteManager implements Manager{
    private Map<Employee, Integer> employees;
    private Vector<Observer> observers;

    public ConcreteManager(){
        employees = new HashMap();
    }

    @Override
    public int getPoint(Employee e) {
        if(!employees.containsKey(e)) // err-check
        {
            System.out.println("err : no employee");
            return 0; 
        }

        return employees.get(e);
    }

    @Override
    public void plusPoint(Employee e, int num) {
        if(!employees.containsKey(e)) // err-check
        {
            System.out.println("err : no employee");
            return;         
        }        
        int re = employees.get(e) + num;
        employees.put(e, re);       
        e.update(re); 
    }

    @Override
    public void minusPoint(Employee e, int num) {
        if(!employees.containsKey(e)) // err-check
        {
            System.out.println("err : no employee");
            return;         
        }        
        int re = employees.get(e) - num;
        employees.put(e, re);
        e.update(re);
    }

    @Override
    public void setEmployee(Employee e) {
        if(!employees.containsKey(e))
        {
            employees.put(e, 0);
            e.update("Normal");
        }
    }

    @Override
    public void fireEmployee(Employee e) {
        if(employees.containsKey(e))
        {
            employees.remove(e);
            e.update("fired");
        }
    }

    @Override
    public void promoteEmployee(Employee e){
        e.update("promoted");
    }

    @Override
    public Vector<Employee> getPromoteMembers(int promotePoint) {
        Vector<Employee> list = new Vector<Employee>();
        for(Map.Entry<Employee, Integer> e : employees.entrySet())
            if(e.getValue() >= promotePoint)
                list.add(e.getKey());
        return list;
    }

    @Override
    public Vector<Employee> getFireMembers(int firePoint) {
        Vector<Employee> list = new Vector<Employee>();
        for(Map.Entry<Employee, Integer> e : employees.entrySet())
            if(e.getValue() <= firePoint)
                list.add(e.getKey());
        return list;
    }

    @Override
    public void printMemberNum() {
        System.out.println("member num : " + employees.size());
    }

    @Override
    public void registerObjserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObjserver(Observer o) {        
        observers.remove(o);
    }

    @Override
    public void notifyObjservers() {
        for(Map.Entry<Employee, Integer> e : employees.entrySet()){
            e.getKey().update(e.getValue());
        }
    }
}
