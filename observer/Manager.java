package mysample.observer;

import java.util.Vector;

/**
 * Manager
 */
public interface Manager extends Subject{
    Vector<Employee> getPromoteMembers(int promotePoint);
    Vector<Employee> getFireMembers(int firePoint);

    void setEmployee(Employee e);    
    int getPoint(Employee e);
    void plusPoint(Employee e, int num);
    void minusPoint(Employee e, int num);

    void promoteEmployee(Employee e);
    void fireEmployee(Employee e);
    void printMemberNum();
} 
