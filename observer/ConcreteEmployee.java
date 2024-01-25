package mysample.observer;

/**
 * Employee
 */
public class ConcreteEmployee implements Employee{
    private String name;
    private int idnum;
    private String status;
    private int point;

    private static int num = 0;

    public ConcreteEmployee(String name){
        this.name = name;
        num++;
        idnum = num;
    }

    @Override
    public int idnum() {
        return idnum;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
    public void update(int point) {
        this.point = point;
    }

    @Override
    public void printStatus() {
        System.out.println(name + "[" + idnum+"]" +" : " + status + " / " + point);
    }
} 