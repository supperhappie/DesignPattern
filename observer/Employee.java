package mysample.observer;

/**
 * Employee
 */
public interface Employee extends Observer {
    int idnum();
    String name();
    void printStatus();
} 
